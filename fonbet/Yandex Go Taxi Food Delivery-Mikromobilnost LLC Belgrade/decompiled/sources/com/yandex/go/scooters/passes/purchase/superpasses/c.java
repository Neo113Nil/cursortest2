package com.yandex.go.scooters.passes.purchase.superpasses;

import android.content.Context;
import defpackage.d1p0;
import defpackage.dfo0;
import defpackage.mu5;
import defpackage.pgd;
import defpackage.qv10;
import defpackage.qxm0;
import defpackage.t1p0;
import defpackage.tje;
import defpackage.w030;
import defpackage.wfd;
import defpackage.yvf0;

/* loaded from: classes13.dex */
public final class c extends pgd {
    public final Context F;
    public final w030 G;
    public final yvf0 H;
    public final yvf0 I;
    public final yvf0 J;
    public final com.yandex.go.scooters.passes.domain.g K;
    public final d1p0 L;
    public final mu5 M;

    public c(qxm0 qxm0Var, t1p0 t1p0Var, d dVar, Context context, w030 w030Var, yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, com.yandex.go.scooters.passes.domain.g gVar) {
        super(0);
        this.F = context;
        this.G = w030Var;
        this.H = yvf0Var;
        this.I = yvf0Var2;
        this.J = yvf0Var3;
        this.K = gVar;
        this.L = new d1p0();
        this.M = new mu5(new a(this, t1p0Var, qxm0Var, dVar));
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        boolean c = this.K.a.c("superpass");
        d1p0 d1p0Var = this.L;
        d1p0Var.a.l(((dfo0) obj).c);
        qv10.B(c, d1p0Var.b, null);
        if (c) {
            tje.N(o(), null, null, new ScootersSuperPassesPurchaseRouter$listenToPurchasesResults$1(this, null), 3);
        }
    }

    @Override // defpackage.pgd
    public final wfd P() {
        return this.M;
    }

    @Override // defpackage.pgd
    public final Context Q() {
        return this.F;
    }

    @Override // defpackage.pgd
    public final w030 S() {
        return this.G;
    }
}
