/*
This code is my own work. I did not get any help from any online source such as
chegg.com; from a classmate, or any other person other than the instructor for 
this course. I understand that getting outside help from this course other than 
from the instructor will result in a grade of 0 in this assignment and other 
disciplinary actions for academic dishonesty.
name: zak rule
class: CSET 3600
instructor: Dr. Oluoch
homework: 3
date: 020321
summary: randomly generates a single dimensional array with random numbers
between 30 and 95... Print the list of all the random numbers generated;
Count the number of elements with a value of 45 if that value exists among the 
random numbers generated, otherwise the program returns a message “sorry, 45 is 
not among the random numbers generated.”; Calculate the sum of all the random 
numbers generated.
 */
package rule_cset3600_assignment3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Rule_cset3600_assignment3 
{
    public static void main(String[] args) 
    {
        int[] arr = new int [100];
        Random rand = new Random();
        int sum = 0;
        for(int i=0; i<100; i++)
        {
            arr[i] = rand.nextInt((95-30))+30;
            sum = sum + arr[i];
            System.out.println(arr[i]);
        }
        
        List<Integer> intlist = new ArrayList<>();
        
        for (Integer val : arr)
        {
            intlist.add(val);
        }
        System.out.println(intlist);
        
        int freq = Collections.frequency(intlist, 45);
        if (freq == 0)
        {
            System.out.println("\nSorry, 45 was not generated");
        }
        else
        {
            System.out.println("\n45 occurs " + freq);
        }
           
        System.out.println("\nThe sum of all the numbers is " + sum);
        }
}