package com.yandex.go.taxi.order.details.v2.state.elements.feedback.rating;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.wls;
import kotlin.Metadata;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class RideCardBaseRatingSelectorDataSource$needOldStarsInRatingSelectorFlow$1 extends AdaptedFunctionReference implements wls {
    public static final RideCardBaseRatingSelectorDataSource$needOldStarsInRatingSelectorFlow$1 a = new RideCardBaseRatingSelectorDataSource$needOldStarsInRatingSelectorFlow$1(2, 4, TaxiOrder.class, "statusInfo", "statusInfo()Lcom/yandex/go/taxi/order/models/api/response/OrderStatusInfo;");

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TaxiOrder) obj).V();
    }
}
