package com.yandex.go.payments.drive.navigation;

import com.yandex.go.payments.superapp.payment.b;
import defpackage.apf;
import defpackage.cda0;
import defpackage.drd;
import defpackage.dy90;
import defpackage.h55;
import defpackage.jl40;
import defpackage.kpi0;
import defpackage.lv90;
import defpackage.m950;
import defpackage.nem;
import defpackage.po21;
import defpackage.raa0;
import defpackage.tje;
import defpackage.vem;
import defpackage.xku0;
import defpackage.xxc;
import defpackage.ycq0;

/* loaded from: classes13.dex */
public final class a extends h55 implements m950 {
    public final po21 D;
    public final cda0 E;
    public final b F;
    public final apf G;
    public final kpi0 H;
    public final apf I;
    public final raa0 J;
    public dy90 K;

    public a(po21 po21Var, cda0 cda0Var, b bVar, apf apfVar, kpi0 kpi0Var, apf apfVar2, raa0 raa0Var) {
        super(null);
        this.D = po21Var;
        this.E = cda0Var;
        this.F = bVar;
        this.G = apfVar;
        this.H = kpi0Var;
        this.I = apfVar2;
        this.J = raa0Var;
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        apf apfVar = this.I;
        lv90 a = ((xku0) apfVar.w).a.a();
        lv90 lv90Var = ((vem) apfVar.x).a;
        if (!jl40.l(a, lv90Var) && lv90Var.a != null) {
            ((ycq0) apfVar.b).a(lv90Var);
        }
        apf apfVar2 = this.G;
        xxc g = ((xku0) apfVar2.x).b.g();
        if (g != null && ((vem) apfVar2.c).b != ((drd) apfVar2.b).b.b()) {
            apfVar2.z(g);
        }
        this.H.b();
        dy90 dy90Var = this.K;
        if (dy90Var != null) {
            dy90Var.dispose();
        }
        this.K = null;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        tje.N(o(), null, null, new DrivePaymentMethodsRouterImpl$onLaunch$1(this, (nem) obj, null), 3);
    }
}
