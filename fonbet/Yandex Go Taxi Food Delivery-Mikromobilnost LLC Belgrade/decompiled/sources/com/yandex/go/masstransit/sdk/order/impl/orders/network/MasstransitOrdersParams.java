package com.yandex.go.masstransit.sdk.order.impl.orders.network;

import defpackage.g110;
import defpackage.gsq0;
import defpackage.i3y;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/masstransit/sdk/order/impl/orders/network/MasstransitOrdersParams;", "", "Companion", "$serializer", "com/yandex/go/masstransit/sdk/order/impl/orders/network/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MasstransitOrdersParams {
    public static final c Companion = new c();
    public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new g110(3)), null};
    public final OrdersStatus a;
    public final OrdersPagination b;

    public /* synthetic */ MasstransitOrdersParams(int i, OrdersStatus ordersStatus, OrdersPagination ordersPagination) {
        this.a = (i & 1) == 0 ? OrdersStatus.ACTIVE : ordersStatus;
        if ((i & 2) == 0) {
            this.b = new OrdersPagination(0);
        } else {
            this.b = ordersPagination;
        }
    }

    public MasstransitOrdersParams(OrdersStatus ordersStatus, OrdersPagination ordersPagination) {
        this.a = ordersStatus;
        this.b = ordersPagination;
    }

    public MasstransitOrdersParams() {
        this(OrdersStatus.ACTIVE, new OrdersPagination(0));
    }
}
