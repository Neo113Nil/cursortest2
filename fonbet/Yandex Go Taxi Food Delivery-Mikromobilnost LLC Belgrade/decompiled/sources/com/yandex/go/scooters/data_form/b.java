package com.yandex.go.scooters.data_form;

import defpackage.h55;
import defpackage.m950;
import defpackage.ncn0;
import defpackage.pcn0;
import defpackage.q8p0;
import defpackage.qro0;
import defpackage.sy60;
import defpackage.t7g;
import defpackage.tcn0;
import defpackage.tje;
import defpackage.u0n0;
import defpackage.v0n0;
import defpackage.w8p0;
import kotlinx.coroutines.flow.e;

/* loaded from: classes13.dex */
public final class b extends h55 {
    public final t7g D;
    public final t7g E;
    public final v0n0 F;
    public final qro0 G;
    public final com.yandex.go.scooters.data_form.data.b H;
    public final com.yandex.go.scooters.data_form.domain.a I;
    public final pcn0 J;

    public b(t7g t7gVar, t7g t7gVar2, v0n0 v0n0Var, qro0 qro0Var, com.yandex.go.scooters.data_form.data.b bVar, com.yandex.go.scooters.data_form.domain.a aVar, pcn0 pcn0Var) {
        super(null);
        this.D = t7gVar;
        this.E = t7gVar2;
        this.F = v0n0Var;
        this.G = qro0Var;
        this.H = bVar;
        this.I = aVar;
        this.J = pcn0Var;
    }

    @Override // defpackage.h55
    public final void G(Object obj) {
        tje.N(o(), null, null, new ScootersDataFormRouterImpl$listenNavigatorActions$$inlined$collectIn$1(e.c(this.J.a), null, this), 3);
        A(this.F.a(this.H.a(e.c(this.G.a), new ScootersDataFormRouterImpl$onAttach$1(1, this, b.class, "handleBduiAction", "handleBduiAction(Lflex/core/model/Action;)V", 0))), new u0n0(false), new tcn0(this));
    }

    public final void P(ncn0 ncn0Var) {
        A((m950) this.D.get(), new w8p0(new q8p0(ncn0Var.a, false), (com.yandex.go.scooters.mosru.b) null, 6), sy60.Q2);
    }
}
