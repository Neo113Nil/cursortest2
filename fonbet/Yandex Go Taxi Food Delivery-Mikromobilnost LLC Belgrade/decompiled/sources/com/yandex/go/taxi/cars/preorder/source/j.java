package com.yandex.go.taxi.cars.preorder.source;

import com.yandex.go.address.models.Address;
import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.a09;
import defpackage.c09;
import defpackage.dqe0;
import defpackage.g18;
import defpackage.iw70;
import defpackage.jtq0;
import defpackage.pzt0;
import defpackage.qbl0;
import defpackage.sfa0;
import defpackage.ta4;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.wiq0;
import defpackage.xz8;
import defpackage.yz8;
import defpackage.zzs;

/* loaded from: classes14.dex */
public final class j extends c09 {
    public final wiq0 D;
    public final dqe0 E;
    public final com.yandex.go.route.interactor.c F;
    public final com.yandex.go.navigation.screen.c G;
    public final ta4 H;
    public final tt2 I;
    public final sfa0 J;
    public final qbl0 K;
    public pzt0 L;
    public pzt0 M;
    public pzt0 N;
    public g18 O;
    public Screen P;

    public j(wiq0 wiq0Var, dqe0 dqe0Var, com.yandex.go.route.interactor.c cVar, ru.yandex.taxi.order.map.controller.a aVar, jtq0 jtq0Var, yz8 yz8Var, com.yandex.go.navigation.screen.c cVar2, ta4 ta4Var, tt2 tt2Var, sfa0 sfa0Var, qbl0 qbl0Var) {
        super(aVar, new a09(jtq0Var.d(), yz8Var.a, yz8Var.b), tt2Var);
        this.D = wiq0Var;
        this.E = dqe0Var;
        this.F = cVar;
        this.G = cVar2;
        this.H = ta4Var;
        this.I = tt2Var;
        this.J = sfa0Var;
        this.K = qbl0Var;
        this.O = g18.u1;
    }

    @Override // defpackage.zc5
    public final void Fg() {
        pzt0 pzt0Var = this.B;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        pzt0 pzt0Var2 = this.N;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        pzt0 pzt0Var3 = this.M;
        if (pzt0Var3 != null) {
            pzt0Var3.a(null);
        }
        pzt0 pzt0Var4 = this.L;
        if (pzt0Var4 != null) {
            pzt0Var4.a(null);
        }
        this.O.cancel();
        pzt0 pzt0Var5 = this.B;
        if (pzt0Var5 != null) {
            pzt0Var5.a(null);
        }
        this.x.c();
        ((xz8) Dg()).stopAnimation();
    }

    @Override // defpackage.zc5
    public final void Gg() {
        zzs ad;
        com.yandex.go.route.interactor.c cVar = this.F;
        Address g = cVar.g();
        if (g == null || (ad = g.B()) == null) {
            ad = ((xz8) Dg()).ad();
        }
        this.A.g(ad);
        this.N = tje.N(Jg(), null, null, new PreorderCarsOnMapPresenter$onResume$$inlined$safeCollectIn$1(cVar.f(), null, this), 3);
        iw70 iw70Var = new iw70(1, this);
        com.yandex.go.navigation.screen.c cVar2 = this.G;
        this.O = cVar2.a(iw70Var);
        this.P = cVar2.b();
        Kg();
        ((xz8) Dg()).startAnimation();
        this.M = tje.N(Jg(), null, null, new PreorderCarsOnMapPresenter$onResume$$inlined$safeCollectIn$2(this.x.d.j, null, this), 3);
    }

    public final void Kg() {
        pzt0 pzt0Var = this.L;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        tpr t = kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.n(new g(((k) this.D).j.b()), com.yandex.go.coroutines.b.d(new e(this.K.a()), new PreorderCarsOnMapPresenter$subscribeToTariffChanges$$inlined$start$1(null, null)), kotlinx.coroutines.flow.e.t(new i(this.G.c(), this)), new PreorderCarsOnMapPresenter$subscribeToTariffChanges$4(this, null)));
        this.I.getClass();
        this.L = tje.N(Jg(), null, null, new PreorderCarsOnMapPresenter$subscribeToTariffChanges$$inlined$safeCollectIn$1(kotlinx.coroutines.flow.e.F(t, uyj.a), null, this), 3);
    }
}
