package com.yandex.go.scooters.ignition;

import defpackage.brn0;
import defpackage.h3y;
import defpackage.h55;
import defpackage.m580;
import defpackage.q150;
import defpackage.tje;

/* loaded from: classes13.dex */
public final class a extends h55 {
    public final h3y D;
    public final q150 E;
    public final brn0 F;
    public final m580 G;

    public a(h3y h3yVar, q150 q150Var, brn0 brn0Var, m580 m580Var) {
        super(null);
        this.D = h3yVar;
        this.E = q150Var;
        this.F = brn0Var;
        this.G = m580Var;
    }

    @Override // defpackage.h55
    public final void G(Object obj) {
        tje.N(o(), null, null, new ScootersIgnitionRouterImpl$onAttach$1(this, null), 3);
    }
}
