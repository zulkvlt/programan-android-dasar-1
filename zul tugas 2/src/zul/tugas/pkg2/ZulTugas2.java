/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zul.tugas.pkg2;

/**
 *
 * @author Lenovo
 */
public class ZulTugas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int umur = 22;
        String paras ="cantik";
        String otak ="pintar"; 
        if(umur>19 && umur<24 && paras == "cantik" && otak == "pintar" )
        { System.out.println("pastimau");}
        else if(umur>19 && umur<24 && paras == "cantik" || otak == "pintar" )
        { System.out.println("okelah");}
        else if(umur>23 && paras == "cantik" || otak == "pintar" )
        { System.out.println("pikir pikri dulu");}
        else{
        System.out.println("no way!");}
    }
    
}
