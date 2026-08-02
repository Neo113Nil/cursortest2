package com.yandex.go.scooters.ignition.domain;

import defpackage.ern0;
import defpackage.h3y;
import defpackage.hbp0;
import defpackage.jy60;
import defpackage.oep0;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.vqn0;
import defpackage.yvf0;

/* loaded from: classes8.dex */
public final class a implements jy60 {
    public final tt2 a;
    public final tse b;
    public final oep0 c;
    public final yvf0 d;
    public final h3y e;
    public final h3y f;
    public final vqn0 g;
    public final h3y h;
    public final ern0 i;

    public a(tt2 tt2Var, tse tseVar, oep0 oep0Var, yvf0 yvf0Var, h3y h3yVar, h3y h3yVar2, vqn0 vqn0Var, h3y h3yVar3, ern0 ern0Var) {
        this.a = tt2Var;
        this.b = tseVar;
        this.c = oep0Var;
        this.d = yvf0Var;
        this.e = h3yVar;
        this.f = h3yVar2;
        this.g = vqn0Var;
        this.h = h3yVar3;
        this.i = ern0Var;
    }

    @Override // defpackage.s150
    public final String getName() {
        return "ScootersIgnitionActivityInteractor";
    }

    @Override // defpackage.jy60
    public final void h() {
        hbp0.e(this.g.a(), null, null, new ScootersIgnitionActivityInteractor$listenForStartIfNotStarted$1(this, null), 3);
        tje.N(this.b, null, null, new ScootersIgnitionActivityInteractor$listenForUpdateSessions$$inlined$collectIn$1(kotlinx.coroutines.flow.e.c(this.i.a), null, this), 3);
    }
}
