/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // int x = 100500;
        // long y = 4543658768979089L;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Input x (long): then press Enter");
        long x = sc.nextLong();
        
        System.out.println("Input y (long): then press Enter");
        long y = sc.nextLong();
        
        System.out.println(x + y);
    }
    
}
