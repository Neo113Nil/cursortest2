package com.yandex.go.masstransit.sdk.order.impl.orders.network;

import defpackage.cmt;
import defpackage.q76;
import defpackage.s490;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH'¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/yandex/go/masstransit/sdk/order/impl/orders/network/MasstransitOrdersApi;", "", "Lcom/yandex/go/masstransit/sdk/order/impl/orders/network/MasstransitOrdersParams;", "params", "Lcmt;", "Lcom/yandex/go/masstransit/sdk/order/impl/orders/network/MasstransitOrdersResponse;", "a", "(Lcom/yandex/go/masstransit/sdk/order/impl/orders/network/MasstransitOrdersParams;)Lcmt;", "Lcom/yandex/go/masstransit/sdk/order/impl/orders/network/GetMasstransitOrderParams;", "Lcom/yandex/go/masstransit/sdk/order/impl/orders/network/GetMasstransitOrderResponse;", "b", "(Lcom/yandex/go/masstransit/sdk/order/impl/orders/network/GetMasstransitOrderParams;)Lcmt;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface MasstransitOrdersApi {
    @s490("masstransit/v2/order_screens/list")
    cmt<MasstransitOrdersResponse> a(@q76 MasstransitOrdersParams params);

    @s490("masstransit/v2/order_screens/get")
    cmt<GetMasstransitOrderResponse> b(@q76 GetMasstransitOrderParams params);
}
