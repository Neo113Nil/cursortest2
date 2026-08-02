package com.yandex.go.scooters.domain;

import androidx.lifecycle.Lifecycle;
import defpackage.iy11;
import defpackage.jy60;
import defpackage.ky11;
import defpackage.pqm0;
import defpackage.tje;
import defpackage.tse;

/* loaded from: classes8.dex */
public final class g0 implements jy60 {
    public final Lifecycle a;
    public final tse b;
    public final ky11 c;
    public final iy11 d;
    public final pqm0 e;

    public g0(Lifecycle lifecycle, tse tseVar, ky11 ky11Var, iy11 iy11Var, pqm0 pqm0Var) {
        this.a = lifecycle;
        this.b = tseVar;
        this.c = ky11Var;
        this.d = iy11Var;
        this.e = pqm0Var;
    }

    @Override // defpackage.s150
    public final String getName() {
        return "ScootersUnifiedPollingNotifyInteractor";
    }

    @Override // defpackage.jy60
    public final void h() {
        tje.N(this.b, null, null, new ScootersUnifiedPollingNotifyInteractor$onFirstContentfulPaint$1(this, null), 3);
    }
}
