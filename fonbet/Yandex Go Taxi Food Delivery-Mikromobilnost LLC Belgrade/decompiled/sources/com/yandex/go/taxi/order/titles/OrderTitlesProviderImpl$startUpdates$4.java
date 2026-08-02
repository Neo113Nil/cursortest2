package com.yandex.go.taxi.order.titles;

import defpackage.i980;
import defpackage.wls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class OrderTitlesProviderImpl$startUpdates$4 extends FunctionReferenceImpl implements wls {
    public static final OrderTitlesProviderImpl$startUpdates$4 b = new OrderTitlesProviderImpl$startUpdates$4(2, 0, i980.class, "isEqualsByState", "isEqualsByState(Lcom/yandex/go/taxi/order/titles/OrderTitlesProviderImpl$DataForController;)Z");

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return Boolean.valueOf(((i980) obj).b == ((i980) obj2).b);
    }
}
