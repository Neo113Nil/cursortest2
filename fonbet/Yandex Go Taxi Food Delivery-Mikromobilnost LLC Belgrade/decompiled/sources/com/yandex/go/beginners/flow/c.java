package com.yandex.go.beginners.flow;

import defpackage.h55;
import defpackage.lf0;
import defpackage.t9f0;
import defpackage.tje;
import defpackage.yvf0;

/* loaded from: classes12.dex */
public final class c extends h55 {
    public final com.yandex.go.preload.e D;
    public final yvf0 E;
    public final lf0 F;
    public final com.yandex.go.beginners.domain.interactor.a G;
    public final t9f0 H;

    public c(com.yandex.go.preload.e eVar, yvf0 yvf0Var, lf0 lf0Var, com.yandex.go.beginners.domain.interactor.a aVar, t9f0 t9f0Var) {
        super(null);
        this.D = eVar;
        this.E = yvf0Var;
        this.F = lf0Var;
        this.G = aVar;
        this.H = t9f0Var;
    }

    public static final void P(c cVar) {
        tje.N(cVar.o(), null, null, new BeginnersFlowCompletionRouter$completeFlow$1(cVar, null), 3);
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        tje.N(o(), null, null, new BeginnersFlowCompletionRouter$onLaunch$1(this, null), 3);
    }
}
