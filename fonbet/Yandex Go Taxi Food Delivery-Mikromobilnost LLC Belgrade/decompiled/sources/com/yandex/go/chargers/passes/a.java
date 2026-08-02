package com.yandex.go.chargers.passes;

import android.content.Context;
import com.yandex.go.chargers.passes.ui.purchase.c;
import defpackage.aia;
import defpackage.mu5;
import defpackage.od9;
import defpackage.pgd;
import defpackage.tje;
import defpackage.uia;
import defpackage.w030;
import defpackage.wfd;
import defpackage.yvf0;

/* loaded from: classes12.dex */
public final class a extends pgd {
    public final Context F;
    public final w030 G;
    public final yvf0 H;
    public final c I;
    public final uia J;
    public final mu5 K;

    public a(Context context, w030 w030Var, yvf0 yvf0Var, c cVar, uia uiaVar) {
        super(0);
        this.F = context;
        this.G = w030Var;
        this.H = yvf0Var;
        this.I = cVar;
        this.J = uiaVar;
        this.K = new mu5(new od9(12, this));
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        tje.N(o(), null, null, new ChargersPassesPurchaseRouterImpl$onLaunch$1(this, (aia) obj, null), 3);
    }

    @Override // defpackage.pgd
    public final wfd P() {
        return this.K;
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
