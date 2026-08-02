package com.yandex.go.taxi.order.details.v2.state.elements.driver;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class RideCardDriverSimpleItemDataSource$collectDriverClickAction$1 extends PropertyReference1Impl {
    public static final RideCardDriverSimpleItemDataSource$collectDriverClickAction$1 b = new RideCardDriverSimpleItemDataSource$collectDriverClickAction$1("driver", 0, "getDriver()Lcom/yandex/go/taxi/order/models/api/objects/Driver;", TaxiOrder.class);

    @Override // kotlin.jvm.internal.PropertyReference1Impl, defpackage.jgx
    public final Object get(Object obj) {
        return ((TaxiOrder) obj).V().g;
    }
}
