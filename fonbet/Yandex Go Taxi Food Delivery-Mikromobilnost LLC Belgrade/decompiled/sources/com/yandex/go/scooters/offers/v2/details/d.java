package com.yandex.go.scooters.offers.v2.details;

import android.content.Context;
import defpackage.bwn0;
import defpackage.f6n0;
import defpackage.fcj0;
import defpackage.i3o0;
import defpackage.k3o0;
import defpackage.l3o0;
import defpackage.lbn0;
import defpackage.m230;
import defpackage.n6n0;
import defpackage.pav;
import defpackage.pwy0;
import defpackage.u45;
import defpackage.vx0;
import defpackage.w030;
import defpackage.xvf0;
import defpackage.y5p0;
import java.util.List;

/* loaded from: classes13.dex */
public final class d extends m230 {
    public final w030 E;
    public final l3o0 F;
    public final i3o0 G;

    public d(w030 w030Var, l3o0 l3o0Var, i3o0 i3o0Var) {
        super(null);
        this.E = w030Var;
        this.F = l3o0Var;
        this.G = i3o0Var;
    }

    @Override // defpackage.m230
    public final w030 P() {
        return this.E;
    }

    @Override // defpackage.m230
    public final boolean Q() {
        return true;
    }

    @Override // defpackage.m230
    public final u45 S(Object obj) {
        k3o0 k3o0Var = (k3o0) obj;
        String str = k3o0Var.a;
        List list = k3o0Var.b;
        ScootersOfferDetailsRouter$provideModalView$1 scootersOfferDetailsRouter$provideModalView$1 = new ScootersOfferDetailsRouter$provideModalView$1(0, this, d.class, "goBack", "goBack(Lkotlin/jvm/functions/Function1;)V", 0);
        fcj0 fcj0Var = this.F.a;
        c cVar = new c((pwy0) ((xvf0) fcj0Var.a).get(), (n6n0) ((xvf0) fcj0Var.b).get(), (y5p0) ((xvf0) fcj0Var.c).get(), (com.yandex.go.scooters.offers.v2.details.mapper.a) ((bwn0) fcj0Var.d).get(), (lbn0) ((xvf0) fcj0Var.e).get(), str, scootersOfferDetailsRouter$provideModalView$1, list);
        vx0 vx0Var = this.G.a;
        return new ScootersOfferDetailsModalView((Context) vx0Var.a.get(), (pav) vx0Var.b.get(), (f6n0) vx0Var.c.get(), cVar);
    }
}
