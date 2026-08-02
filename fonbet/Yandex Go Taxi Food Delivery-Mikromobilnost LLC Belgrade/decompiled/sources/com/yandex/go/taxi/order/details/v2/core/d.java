package com.yandex.go.taxi.order.details.v2.core;

import com.yandex.go.taxi.order.details.v2.core.availability.m;
import com.yandex.go.taxi.order.details.v2.state.RideCardPresentationType;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.a3y0;
import defpackage.h3y;
import defpackage.tfk0;
import defpackage.tse;
import defpackage.vfk0;

/* loaded from: classes14.dex */
public final class d {
    public final tse a;
    public final h3y b;
    public final h3y c;
    public final a3y0 d = new a3y0(TaxiOrderLogGroup.RIDE_CARD.getTag(), "WarmupInteractor");

    public d(tse tseVar, h3y h3yVar, h3y h3yVar2) {
        this.a = tseVar;
        this.b = h3yVar;
        this.c = h3yVar2;
    }

    public final void a(TaxiOrder taxiOrder) {
        m mVar = (m) this.b.get();
        vfk0 vfk0Var = mVar.e(taxiOrder, RideCardPresentationType.COMPACT).b;
        vfk0 vfk0Var2 = mVar.e(taxiOrder, RideCardPresentationType.DETAILS).b;
        if ((vfk0Var instanceof tfk0) || (vfk0Var2 instanceof tfk0)) {
            com.yandex.go.coroutines.b.g(this.a, null, null, new RideCardWarmupInteractor$warmup$1(this, taxiOrder, null), 3);
        }
    }
}
