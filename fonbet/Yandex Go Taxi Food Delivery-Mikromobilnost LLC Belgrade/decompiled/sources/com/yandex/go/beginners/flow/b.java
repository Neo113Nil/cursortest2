package com.yandex.go.beginners.flow;

import defpackage.dbn;
import defpackage.ea0;
import defpackage.h55;
import defpackage.jj3;
import defpackage.r10;
import defpackage.rqo;
import defpackage.tje;

/* loaded from: classes12.dex */
public final class b extends h55 {
    public final jj3 D;
    public final ea0 E;
    public final r10 F;
    public final rqo G;
    public final ru.yandex.taxi.am.internal.d H;
    public final dbn I;
    public boolean J;

    public b(jj3 jj3Var, ea0 ea0Var, r10 r10Var, rqo rqoVar, ru.yandex.taxi.am.internal.d dVar, dbn dbnVar) {
        super(null);
        this.D = jj3Var;
        this.E = ea0Var;
        this.F = r10Var;
        this.G = rqoVar;
        this.H = dVar;
        this.I = dbnVar;
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        this.J = false;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        this.I.a.set(true);
        tje.N(o(), null, null, new BeginnersAuthRouter$onLaunch$1(this, null), 3);
    }
}
