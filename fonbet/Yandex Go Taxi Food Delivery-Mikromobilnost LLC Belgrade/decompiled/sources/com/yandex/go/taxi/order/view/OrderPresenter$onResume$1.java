package com.yandex.go.taxi.order.view;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import ru.yandex.common.clid.ClidProvider;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class OrderPresenter$onResume$1 extends PropertyReference1Impl {
    public static final OrderPresenter$onResume$1 b = new OrderPresenter$onResume$1(ClidProvider.STATE, 0, "getState()Lru/yandex/taxi/object/DriveState;", TaxiOrder.class);

    @Override // kotlin.jvm.internal.PropertyReference1Impl, defpackage.jgx
    public final Object get(Object obj) {
        return ((TaxiOrder) obj).h.getB();
    }
}
