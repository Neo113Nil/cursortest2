package com.yandex.go.taxi.order.support.data.mappers;

import com.yandex.go.taxi.order.models.api.ride_support.OrderRideSupportNotification;
import defpackage.bvf0;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes14.dex */
public final class b {
    public final a a;

    public b(a aVar) {
        this.a = aVar;
    }

    public final Object a(OrderRideSupportNotification orderRideSupportNotification, Continuation continuation) {
        List list;
        if (orderRideSupportNotification == null || (list = orderRideSupportNotification.e) == null) {
            return null;
        }
        return bvf0.n(new SupportItemsMapper$mapModel$2(list, orderRideSupportNotification, this, null), continuation);
    }
}
