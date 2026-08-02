package com.yandex.go.payments.yape.navigation;

import com.yandex.go.payments.addmethod.data.BindUniversalPaymentMethodApi;
import com.yandex.go.payments.paymentlist.domain.i;
import defpackage.d4;
import defpackage.g9a0;
import defpackage.gf41;
import defpackage.h55;
import defpackage.hg0;
import defpackage.i3y;
import defpackage.lk0;
import defpackage.po21;
import defpackage.raa0;
import defpackage.tje;
import defpackage.wi0;
import defpackage.y50;
import defpackage.yvf0;
import defpackage.zuj0;

/* loaded from: classes13.dex */
public final class c extends h55 {
    public final y50 D;
    public final zuj0 E;
    public final po21 F;
    public final gf41 G;
    public final yvf0 H;
    public final i I;
    public final g9a0 J;
    public final wi0 K;
    public final BindUniversalPaymentMethodApi L;
    public final raa0 M;
    public final hg0 N;
    public final i3y O;

    public c(y50 y50Var, zuj0 zuj0Var, po21 po21Var, gf41 gf41Var, yvf0 yvf0Var, i iVar, g9a0 g9a0Var, wi0 wi0Var, BindUniversalPaymentMethodApi bindUniversalPaymentMethodApi, raa0 raa0Var, hg0 hg0Var) {
        super(null);
        this.D = y50Var;
        this.E = zuj0Var;
        this.F = po21Var;
        this.G = gf41Var;
        this.H = yvf0Var;
        this.I = iVar;
        this.J = g9a0Var;
        this.K = wi0Var;
        this.L = bindUniversalPaymentMethodApi;
        this.M = raa0Var;
        this.N = hg0Var;
        this.O = kotlin.a.a(new d4(16, this));
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        tje.N(o(), null, null, new AddYapeTokenBaseRouter$onLaunch$1(this, (lk0) obj, null), 3);
    }
}
