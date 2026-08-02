package com.yandex.go.taxi.order.details.v2.navigation;

import com.yandex.go.taxi.order.api.details.TaxiCardNavigationAction;
import com.yandex.go.taxi.order.details.common.TaxiCardAppearanceMode;
import com.yandex.go.taxi.order.details.v2.core.availability.m;
import com.yandex.go.taxi.order.details.v2.state.RideCardPresentationType;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.models.api.screen.OrderScreen;
import com.yandex.go.taxi.order.stack.OrderStackMvpView;
import defpackage.a3y0;
import defpackage.eck0;
import defpackage.hbp0;
import defpackage.jqr;
import defpackage.o2y0;
import defpackage.ra80;
import defpackage.tje;
import defpackage.tls;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import kotlinx.coroutines.flow.e;

/* loaded from: classes14.dex */
public final class c {
    public final m a;
    public final eck0 b;
    public final tt2 c;
    public final com.yandex.go.multimodal_route.store.a d;
    public final a3y0 e = new a3y0(TaxiOrderLogGroup.RIDE_CARD.getTag(), "DetailsDynamicSwitcher");
    public final hbp0 f;

    public c(m mVar, eck0 eck0Var, tt2 tt2Var, com.yandex.go.multimodal_route.store.a aVar) {
        this.a = mVar;
        this.b = eck0Var;
        this.c = tt2Var;
        this.d = aVar;
        this.f = new hbp0(new TaxiOrderDetailsDynamicSwitcher$scope$1(0, tt2Var, tt2.class, "computation", "computation()Lkotlinx/coroutines/CoroutineDispatcher;", 0), "TaxiOrderDetailsDynamicSwitcher", null, 4);
    }

    public static final com.yandex.go.taxi.order.stack.a a(c cVar, TaxiCardAppearanceMode taxiCardAppearanceMode, o2y0 o2y0Var, OrderScreen orderScreen, ra80 ra80Var) {
        TaxiCardNavigationAction taxiCardNavigationAction;
        cVar.getClass();
        Object obj = ra80Var.e;
        if (obj == null || obj != (taxiCardNavigationAction = TaxiCardNavigationAction.OPEN_PAYMENT)) {
            taxiCardNavigationAction = obj instanceof TaxiCardNavigationAction ? (TaxiCardNavigationAction) obj : TaxiCardNavigationAction.EMPTY;
        }
        return new com.yandex.go.taxi.order.stack.a(taxiCardAppearanceMode, o2y0Var, orderScreen, OrderStackMvpView.AnimationType.NONE, taxiCardNavigationAction);
    }

    public final tpr b(o2y0 o2y0Var, ra80 ra80Var, OrderScreen orderScreen) {
        b bVar = new b(new jqr(this.a.a(o2y0Var, RideCardPresentationType.DETAILS), new TaxiOrderDetailsDynamicSwitcher$detailsPresenceFlow$1(this, null), 3), this, o2y0Var, orderScreen, ra80Var);
        this.c.getClass();
        return e.F(bVar, uyj.a);
    }

    public final void c(o2y0 o2y0Var, ra80 ra80Var, OrderScreen orderScreen, tls tlsVar) {
        hbp0 hbp0Var = this.f;
        hbp0Var.f();
        tje.N(hbp0Var, null, null, new TaxiOrderDetailsDynamicSwitcher$subscribeDetailsPresenceMonitoring$$inlined$collectLatestIn$1(this.a.a(o2y0Var, RideCardPresentationType.DETAILS), null, o2y0Var, this, orderScreen, ra80Var, tlsVar), 3);
    }
}
