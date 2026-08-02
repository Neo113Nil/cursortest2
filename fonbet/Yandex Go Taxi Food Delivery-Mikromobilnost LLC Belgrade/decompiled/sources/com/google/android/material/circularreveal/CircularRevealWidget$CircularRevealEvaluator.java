package com.google.android.material.circularreveal;

import android.animation.TypeEvaluator;
import defpackage.uh6;
import defpackage.wvb;

/* loaded from: classes11.dex */
public class CircularRevealWidget$CircularRevealEvaluator implements TypeEvaluator<wvb> {
    public static final TypeEvaluator<wvb> CIRCULAR_REVEAL = new CircularRevealWidget$CircularRevealEvaluator();
    private final wvb revealInfo = new wvb();

    @Override // android.animation.TypeEvaluator
    public wvb evaluate(float f, wvb wvbVar, wvb wvbVar2) {
        wvb wvbVar3 = this.revealInfo;
        float H = uh6.H(wvbVar.a, wvbVar2.a, f);
        float H2 = uh6.H(wvbVar.b, wvbVar2.b, f);
        float H3 = uh6.H(wvbVar.c, wvbVar2.c, f);
        wvbVar3.a = H;
        wvbVar3.b = H2;
        wvbVar3.c = H3;
        return this.revealInfo;
    }
}
