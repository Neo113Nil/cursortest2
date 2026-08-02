package com.yandex.go.masstransit.sdk.order.impl.activation;

import android.content.Context;
import defpackage.d1z0;
import defpackage.djb;
import defpackage.fl10;
import defpackage.jhu0;
import defpackage.p1b;
import defpackage.pgd;
import defpackage.pxy0;
import defpackage.tje;
import defpackage.w030;
import defpackage.wfd;
import defpackage.wpy0;

/* loaded from: classes12.dex */
public final class b extends pgd {
    public final Context F;
    public final w030 G;
    public final d H;
    public final wpy0 I;
    public final fl10 J;
    public final djb K;
    public final boolean L;
    public final jhu0 M;
    public final p1b N;

    public b(Context context, w030 w030Var, d dVar, wpy0 wpy0Var, fl10 fl10Var, djb djbVar) {
        super(0);
        this.F = context;
        this.G = w030Var;
        this.H = dVar;
        this.I = wpy0Var;
        this.J = fl10Var;
        this.K = djbVar;
        this.L = true;
        this.M = new jhu0(this);
        this.N = new p1b(dVar, new pxy0(1, this));
    }

    @Override // defpackage.pgd, defpackage.h55
    public final void G(Object obj) {
        d1z0 d1z0Var = (d1z0) obj;
        super.G(d1z0Var);
        d dVar = this.H;
        dVar.getClass();
        dVar.g = d1z0Var.a;
        dVar.h = d1z0Var.b;
        dVar.i = d1z0Var.c;
        dVar.j = d1z0Var.d;
        tje.N(o(), null, null, new TicketActivationQrAndNfcScanRouterImpl$onAttach$1(this, null), 3);
        tje.N(o(), null, null, new TicketActivationQrAndNfcScanRouterImpl$onAttach$2(this, null), 3);
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        this.H.e();
    }

    @Override // defpackage.pgd
    public final wfd P() {
        return this.N;
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
        return this.L;
    }
}
