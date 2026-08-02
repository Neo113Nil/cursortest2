package com.yandex.go.masstransit.sdk.ble.impl.qrscan.scan;

import android.content.Context;
import defpackage.deg0;
import defpackage.neg0;
import defpackage.odf0;
import defpackage.p1b;
import defpackage.peg0;
import defpackage.pgd;
import defpackage.tje;
import defpackage.v7j0;
import defpackage.w030;
import defpackage.wdg0;
import defpackage.wfd;
import defpackage.yeg0;
import defpackage.zeg0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class c extends pgd {
    public final Context F;
    public final w030 G;
    public final zeg0 H;
    public final a I;
    public final deg0 J;
    public final boolean K;
    public final p1b L;

    public c(Context context, w030 w030Var, zeg0 zeg0Var, a aVar, deg0 deg0Var) {
        super(0);
        this.F = context;
        this.G = w030Var;
        this.H = zeg0Var;
        this.I = aVar;
        this.J = deg0Var;
        this.K = true;
        this.L = new p1b(zeg0Var, new odf0(9, this));
    }

    @Override // defpackage.pgd, defpackage.h55
    public final void H(Object obj) {
        this.I.a(wdg0.a, new peg0(this));
        super.H((neg0) obj);
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        r0 r0Var = this.H.a;
        yeg0 yeg0Var = new yeg0(0);
        r0Var.getClass();
        r0Var.m(null, yeg0Var);
        a aVar = this.I;
        aVar.f = false;
        aVar.g = 0L;
        this.J.a(((com.yandex.go.permission.b) ((v7j0) aVar.c.a)).a(3));
        tje.N(o(), null, null, new QrScanRouterImpl$onLaunch$1(this, null), 3);
    }

    @Override // defpackage.pgd
    public final wfd P() {
        return this.L;
    }

    @Override // defpackage.pgd
    public final Context Q() {
        return this.F;
    }

    @Override // defpackage.pgd
    public final w030 S() {
        return this.G;
    }

    @Override // defpackage.pgd
    public final boolean T() {
        return this.K;
    }
}
