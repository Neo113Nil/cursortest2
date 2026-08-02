package com.yandex.go.preorder.navigation;

import defpackage.bc;
import defpackage.cwx0;
import defpackage.fy01;
import defpackage.g18;
import defpackage.h55;
import defpackage.i130;
import defpackage.i6r;
import defpackage.lf00;
import defpackage.mf00;
import defpackage.net0;
import defpackage.nwx0;
import defpackage.oft0;
import defpackage.t5k0;
import defpackage.tje;
import defpackage.vpr0;

/* loaded from: classes13.dex */
public final class p extends h55 {
    public final oft0 D;
    public final net0 E;
    public final fy01 F;
    public final i130 G;
    public final cwx0 H;
    public final vpr0 I;
    public final com.yandex.go.preorder.header.g J;
    public final mf00 K;
    public final t5k0 L;
    public g18 M;

    public p(oft0 oft0Var, net0 net0Var, fy01 fy01Var, i130 i130Var, cwx0 cwx0Var, vpr0 vpr0Var, com.yandex.go.preorder.header.g gVar, mf00 mf00Var, t5k0 t5k0Var) {
        super(null);
        this.D = oft0Var;
        this.E = net0Var;
        this.F = fy01Var;
        this.G = i130Var;
        this.H = cwx0Var;
        this.I = vpr0Var;
        this.J = gVar;
        this.K = mf00Var;
        this.L = t5k0Var;
        this.M = g18.u1;
    }

    @Override // defpackage.h55
    public final void G(Object obj) {
        ((nwx0) this.F).a.c().T6();
        this.E.d();
    }

    @Override // defpackage.h55
    public final void H(Object obj) {
        ((nwx0) this.F).a.c().f4();
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        this.D.a.clear();
        this.G.a().a();
        tje.N(o(), null, null, new TaxiMainRouter$onLaunch$1(this, null), 3);
        tje.N(o(), null, null, new TaxiMainRouter$onLaunch$2(this, null), 3);
    }

    @Override // defpackage.h55
    public final void K(Object obj) {
        mf00 mf00Var = this.K;
        mf00Var.getClass();
        i6r i6rVar = mf00Var.a;
        i6rVar.getClass();
        lf00 lf00Var = new lf00(new bc(i6rVar, this));
        this.M.cancel();
        this.M = lf00Var.a().v(new o(this));
        this.I.a(this.J);
    }

    @Override // defpackage.h55
    public final void L(Object obj) {
        this.M.cancel();
        this.I.b(this.J);
    }
}
