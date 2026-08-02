package com.google.android.material.circularreveal;

import android.util.Property;
import defpackage.wvb;
import defpackage.xvb;

/* loaded from: classes11.dex */
public class CircularRevealWidget$CircularRevealProperty extends Property<xvb, wvb> {
    public static final Property<xvb, wvb> CIRCULAR_REVEAL = new CircularRevealWidget$CircularRevealProperty("circularReveal");

    private CircularRevealWidget$CircularRevealProperty(String str) {
        super(wvb.class, str);
    }

    @Override // android.util.Property
    public wvb get(xvb xvbVar) {
        return xvbVar.getRevealInfo();
    }

    @Override // android.util.Property
    public void set(xvb xvbVar, wvb wvbVar) {
        xvbVar.setRevealInfo(wvbVar);
    }
}
