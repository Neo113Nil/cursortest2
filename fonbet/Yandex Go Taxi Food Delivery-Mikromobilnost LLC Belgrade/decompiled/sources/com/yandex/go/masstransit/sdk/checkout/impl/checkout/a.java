package com.yandex.go.masstransit.sdk.checkout.impl.checkout;

import android.content.Context;
import com.yandex.go.masstransit.sdk.checkout.impl.checkout.domain.k;
import com.yandex.go.masstransit.sdk.checkout.impl.checkout.domain.s;
import defpackage.bvf0;
import defpackage.c29;
import defpackage.dmb;
import defpackage.emb;
import defpackage.i3y;
import defpackage.ike;
import defpackage.io9;
import defpackage.j45;
import defpackage.o950;
import defpackage.p1b;
import defpackage.pgd;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.w030;
import defpackage.wfd;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class a extends pgd {
    public final Context F;
    public final w030 G;
    public final i3y H;
    public final i3y I;
    public final c29 J;
    public final h K;
    public final k L;
    public final s M;
    public final ru.yandex.taxi.masstransit.domain.e N;
    public final com.yandex.go.masstransit.sdk.checkout.impl.checkout.analytics.a O;
    public final io9 P;
    public final p1b Q;

    public a(Context context, w030 w030Var, i3y i3yVar, i3y i3yVar2, i3y i3yVar3, i3y i3yVar4, i3y i3yVar5, c29 c29Var, h hVar, k kVar, s sVar, ru.yandex.taxi.masstransit.domain.e eVar, com.yandex.go.masstransit.sdk.checkout.impl.checkout.analytics.a aVar) {
        super(0);
        this.F = context;
        this.G = w030Var;
        this.H = i3yVar3;
        this.I = i3yVar5;
        this.J = c29Var;
        this.K = hVar;
        this.L = kVar;
        this.M = sVar;
        this.N = eVar;
        this.O = aVar;
        this.P = new io9(this);
        this.Q = new p1b(hVar, new emb(this, 0));
    }

    @Override // defpackage.pgd, defpackage.h55
    public final void H(Object obj) {
        Object value;
        super.H((dmb) obj);
        o950 lifecycle = getLifecycle();
        com.yandex.go.masstransit.sdk.checkout.impl.checkout.analytics.a aVar = this.O;
        j45 j45Var = aVar.i;
        if (j45Var != null) {
            lifecycle.d(j45Var);
        }
        aVar.i = null;
        k kVar = this.L;
        ike ikeVar = kVar.g.c;
        if (ikeVar != null) {
            bvf0.i(ikeVar, "detach scope", null);
        }
        com.yandex.go.masstransit.sdk.checkout.impl.checkout.domain.processor.e eVar = kVar.m;
        pzt0 pzt0Var = eVar.e;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        eVar.e = null;
        r0 r0Var = eVar.d;
        do {
            value = r0Var.getValue();
        } while (!r0Var.k(value, EmptyList.a));
        ike ikeVar2 = this.M.c.c;
        if (ikeVar2 != null) {
            bvf0.i(ikeVar2, "detach scope", null);
        }
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        dmb dmbVar = (dmb) obj;
        this.O.a(o(), getLifecycle(), dmbVar.b);
        this.L.d();
        tje.N(o(), null, null, new CheckoutScreenRouterImpl$initTrip$1(this, dmbVar.a, null), 3);
        tje.N(o(), null, null, new CheckoutScreenRouterImpl$onLaunch$1(this, null), 3);
        tje.N(o(), null, null, new CheckoutScreenRouterImpl$onLaunch$2(this, null), 3);
    }

    @Override // defpackage.pgd
    public final wfd P() {
        return this.Q;
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
