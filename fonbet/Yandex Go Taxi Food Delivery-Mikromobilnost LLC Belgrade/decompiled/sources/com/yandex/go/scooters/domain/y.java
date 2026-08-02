package com.yandex.go.scooters.domain;

import androidx.lifecycle.Lifecycle;
import defpackage.h3y;
import defpackage.jy60;
import defpackage.oep0;
import defpackage.pqm0;
import defpackage.tje;
import defpackage.tse;
import defpackage.yvf0;

/* loaded from: classes8.dex */
public final class y implements jy60 {
    public final Lifecycle a;
    public final tse b;
    public final oep0 c;
    public final yvf0 d;
    public final h3y e;
    public final pqm0 f;
    public final h3y g;
    public final h3y h;

    public y(Lifecycle lifecycle, tse tseVar, oep0 oep0Var, yvf0 yvf0Var, h3y h3yVar, pqm0 pqm0Var, h3y h3yVar2, h3y h3yVar3) {
        this.a = lifecycle;
        this.b = tseVar;
        this.c = oep0Var;
        this.d = yvf0Var;
        this.e = h3yVar;
        this.f = pqm0Var;
        this.g = h3yVar2;
        this.h = h3yVar3;
    }

    @Override // defpackage.s150
    public final String getName() {
        return "ScootersOrdersCompletionInteractor";
    }

    @Override // defpackage.jy60
    public final void h() {
        tje.N(this.b, null, null, new ScootersOrdersCompletionInteractor$onFirstContentfulPaint$1(this, null), 3);
    }
}
