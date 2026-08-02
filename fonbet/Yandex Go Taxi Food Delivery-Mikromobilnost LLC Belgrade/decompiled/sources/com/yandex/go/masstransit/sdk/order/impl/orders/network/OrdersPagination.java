package com.yandex.go.masstransit.sdk.order.impl.orders.network;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/masstransit/sdk/order/impl/orders/network/OrdersPagination;", "", "Companion", "$serializer", "com/yandex/go/masstransit/sdk/order/impl/orders/network/e", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class OrdersPagination {
    public static final e Companion = new e();
    public final int a;
    public final int b;

    public /* synthetic */ OrdersPagination(int i, int i2, int i3) {
        this.a = (i & 1) == 0 ? Integer.MAX_VALUE : i2;
        if ((i & 2) == 0) {
            this.b = 0;
        } else {
            this.b = i3;
        }
    }

    public OrdersPagination(int i) {
        this.a = Integer.MAX_VALUE;
        this.b = 0;
    }

    public OrdersPagination() {
        this(0);
    }
}
