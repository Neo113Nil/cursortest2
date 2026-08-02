package com.yandex.go.taxi.order.promotions.modal_default.router;

import android.content.Context;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.promotions.modal_default.OrderDefaultModalView;
import com.yandex.go.taxi.order.promotions.modal_default.interactor.c;
import defpackage.a3y0;
import defpackage.at20;
import defpackage.bts0;
import defpackage.bu0;
import defpackage.ht10;
import defpackage.n3w;
import defpackage.ny20;
import defpackage.ny61;
import defpackage.pr70;
import defpackage.pzt0;
import defpackage.q150;
import defpackage.r4g;
import defpackage.rr70;
import defpackage.sr70;
import defpackage.tje;
import defpackage.tr70;
import defpackage.tt2;
import defpackage.usc;
import defpackage.w030;
import defpackage.wsc;
import defpackage.xr70;
import defpackage.yj70;
import kotlin.coroutines.Continuation;

/* loaded from: classes14.dex */
public final class a extends com.yandex.go.navigation.modals.coroutines.a {
    public final w030 F;
    public final com.yandex.go.taxi.order.promotions.modal_default.mapper.a G;
    public final tt2 H;
    public final bu0 I;
    public final a3y0 J;
    public pr70 K;
    public pzt0 L;
    public final boolean M;

    public a(w030 w030Var, com.yandex.go.taxi.order.promotions.modal_default.mapper.a aVar, tt2 tt2Var, bu0 bu0Var) {
        super(null);
        this.F = w030Var;
        this.G = aVar;
        this.H = tt2Var;
        this.I = bu0Var;
        this.J = new a3y0(TaxiOrderLogGroup.EMPTY.getTag(), "OrderDefaultModalRouter");
        this.M = true;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a, defpackage.h55
    public final void G(Object obj) {
        this.L = tje.N(o(), null, null, new OrderDefaultModalRouterImpl$onAttach$1(this, (tr70) obj, null), 3);
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a, defpackage.h55
    public final void H(Object obj) {
        super.H((tr70) obj);
        pzt0 pzt0Var = this.L;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.L = null;
        this.K = null;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final w030 P() {
        return this.F;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final boolean Q() {
        return this.M;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final Object S(Object obj, Continuation continuation) {
        tr70 tr70Var = (tr70) obj;
        pr70 pr70Var = this.K;
        if (pr70Var == null) {
            ny61.r("ui state is null");
            return null;
        }
        bu0 bu0Var = this.I;
        bu0Var.getClass();
        n3w a = n3w.a(new xr70(new ht10(new r4g(bu0Var, 1), new r4g(bu0Var, 4), false, 25)));
        sr70 sr70Var = (sr70) n3w.a(new sr70(new at20(new q150(new r4g(bu0Var, 8), new r4g(bu0Var, 2), new r4g(bu0Var, 6), new r4g(bu0Var, 5), new r4g(bu0Var, 3), ny20.a, new r4g(bu0Var, 7)), new r4g(bu0Var, 0)))).a;
        yj70 yj70Var = new yj70(this);
        usc uscVar = tr70Var.b;
        at20 at20Var = sr70Var.a;
        rr70 rr70Var = new rr70(pr70Var, yj70Var, uscVar, (c) ((q150) at20Var.a).get(), (wsc) ((r4g) at20Var.b).get());
        ht10 ht10Var = ((xr70) a.a).a;
        return new OrderDefaultModalView(rr70Var, (Context) ((r4g) ht10Var.b).get(), (bts0) ((r4g) ht10Var.c).get());
    }
}
