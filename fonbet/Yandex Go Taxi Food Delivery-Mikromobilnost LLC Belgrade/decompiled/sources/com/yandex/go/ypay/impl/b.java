package com.yandex.go.ypay.impl;

import androidx.lifecycle.Lifecycle;
import defpackage.i3y;
import defpackage.ij51;
import defpackage.jy60;
import defpackage.rqo;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.zf2;

/* loaded from: classes8.dex */
public final class b implements jy60 {
    public final tse a;
    public final Lifecycle b;
    public final tt2 c;
    public final ij51 d;
    public final i3y e;
    public final String f = "YPayFeatureActivatorImpl";

    public b(tse tseVar, Lifecycle lifecycle, tt2 tt2Var, ij51 ij51Var, rqo rqoVar) {
        this.a = tseVar;
        this.b = lifecycle;
        this.c = tt2Var;
        this.d = ij51Var;
        this.e = kotlin.a.a(new zf2(rqoVar, 20));
    }

    @Override // defpackage.s150
    public final String getName() {
        return this.f;
    }

    @Override // defpackage.jy60
    public final void h() {
        tje.N(this.a, null, null, new YPayFeatureActivatorImpl$onFirstContentfulPaint$1(this, null), 3);
    }
}
