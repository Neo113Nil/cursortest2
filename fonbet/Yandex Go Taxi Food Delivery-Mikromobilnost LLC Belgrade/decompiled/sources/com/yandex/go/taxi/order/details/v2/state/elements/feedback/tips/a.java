package com.yandex.go.taxi.order.details.v2.state.elements.feedback.tips;

import com.yandex.go.coroutines.b;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$TipsSelector;
import defpackage.fef;
import defpackage.g92;
import defpackage.ijk0;
import defpackage.irs0;
import defpackage.lbk0;
import defpackage.o2y0;
import defpackage.opk0;
import defpackage.pfk0;
import defpackage.rol0;
import defpackage.s6k0;
import defpackage.sue0;
import defpackage.tpr;
import defpackage.yjk0;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes14.dex */
public final class a {
    public final o2y0 a;
    public final com.yandex.go.taxi.order.details.v2.domain.feedback.a b;
    public final s6k0 c;
    public final opk0 d;
    public final sue0 e;
    public final pfk0 f;
    public final irs0 g;
    public final lbk0 h;

    public a(o2y0 o2y0Var, com.yandex.go.taxi.order.details.v2.domain.feedback.a aVar, s6k0 s6k0Var, opk0 opk0Var, sue0 sue0Var, pfk0 pfk0Var, irs0 irs0Var, lbk0 lbk0Var) {
        this.a = o2y0Var;
        this.b = aVar;
        this.c = s6k0Var;
        this.d = opk0Var;
        this.e = sue0Var;
        this.f = pfk0Var;
        this.g = irs0Var;
        this.h = lbk0Var;
    }

    public final tpr a(RideCardItemDto$TipsSelector rideCardItemDto$TipsSelector, fef fefVar) {
        if (!ijk0.b(rideCardItemDto$TipsSelector) || rideCardItemDto$TipsSelector.e.isEmpty()) {
            return new g92(2, new yjk0(rideCardItemDto$TipsSelector.a));
        }
        this.b.d();
        return new m0(e.I(e.t(e.I(this.a.a(), new RideCardTipsSelectorItemDataSource$getElementsFlow$1(2, null))), new RideCardTipsSelectorItemDataSource$getElementsFlow$2(this, rideCardItemDto$TipsSelector, fefVar, null)), e.t(b.d(new rol0(new RideCardTipsSelectorItemDataSource$getPreferredTipsSubscriptionFlow$1(rideCardItemDto$TipsSelector.d, this, null)), new RideCardTipsSelectorItemDataSource$stateFlow$$inlined$start$1(null, null))), new RideCardTipsSelectorItemDataSource$stateFlow$1(rideCardItemDto$TipsSelector, null));
    }
}
