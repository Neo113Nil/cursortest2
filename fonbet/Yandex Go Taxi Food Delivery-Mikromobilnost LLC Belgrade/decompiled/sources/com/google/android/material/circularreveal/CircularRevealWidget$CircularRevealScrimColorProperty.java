package com.google.android.material.circularreveal;

import android.util.Property;
import defpackage.xvb;

/* loaded from: classes11.dex */
public class CircularRevealWidget$CircularRevealScrimColorProperty extends Property<xvb, Integer> {
    public static final Property<xvb, Integer> CIRCULAR_REVEAL_SCRIM_COLOR = new CircularRevealWidget$CircularRevealScrimColorProperty("circularRevealScrimColor");

    private CircularRevealWidget$CircularRevealScrimColorProperty(String str) {
        super(Integer.class, str);
    }

    @Override // android.util.Property
    public Integer get(xvb xvbVar) {
        return Integer.valueOf(xvbVar.getCircularRevealScrimColor());
    }

    @Override // android.util.Property
    public void set(xvb xvbVar, Integer num) {
        xvbVar.setCircularRevealScrimColor(num.intValue());
    }
}
