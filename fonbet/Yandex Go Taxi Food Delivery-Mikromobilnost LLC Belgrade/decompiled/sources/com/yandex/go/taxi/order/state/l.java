package com.yandex.go.taxi.order.state;

import com.yandex.go.taxi.order.OrderCancelProcessingObserver;
import defpackage.ad5;
import defpackage.i3y;
import defpackage.il70;
import defpackage.jl70;
import defpackage.o2y0;
import defpackage.tje;
import defpackage.tt2;
import defpackage.xdf;
import kotlin.LazyThreadSafetyMode;
import ru.yandex.taxi.order.state.TaxiOnTheWayStateView;

/* loaded from: classes14.dex */
public final class l extends ad5 {
    public final xdf A;
    public final tt2 B;
    public final i3y C;
    public final o2y0 x;
    public final OrderCancelProcessingObserver y;
    public final com.yandex.go.taxi.order.details.v1.domain.a z;

    public l(o2y0 o2y0Var, OrderCancelProcessingObserver orderCancelProcessingObserver, com.yandex.go.taxi.order.details.v1.domain.a aVar, xdf xdfVar, tt2 tt2Var) {
        super(il70.class);
        this.x = o2y0Var;
        this.y = orderCancelProcessingObserver;
        this.z = aVar;
        this.A = xdfVar;
        this.B = tt2Var;
        this.C = kotlin.a.b(LazyThreadSafetyMode.NONE, new jl70(3));
    }

    public final void Kg(TaxiOnTheWayStateView taxiOnTheWayStateView) {
        Bg(taxiOnTheWayStateView);
        tje.N(Jg(), null, null, new OrderCancelPresenter$attachView$1(this, taxiOnTheWayStateView, null), 3);
    }
}
