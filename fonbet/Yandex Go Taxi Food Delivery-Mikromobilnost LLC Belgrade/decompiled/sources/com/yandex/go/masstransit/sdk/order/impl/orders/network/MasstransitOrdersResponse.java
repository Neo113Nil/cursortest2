package com.yandex.go.masstransit.sdk.order.impl.orders.network;

import com.yandex.go.masstransit.sdk.order.impl.orders.MasstransitOrderDto;
import com.yandex.go.masstransit.sdk.order.impl.orders.f;
import defpackage.g110;
import defpackage.gsq0;
import defpackage.i3y;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/masstransit/sdk/order/impl/orders/network/MasstransitOrdersResponse;", "", "Companion", "$serializer", "com/yandex/go/masstransit/sdk/order/impl/orders/network/d", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MasstransitOrdersResponse {
    public static final d Companion = new d();
    public static final i3y[] c;
    public final List a;
    public final int b;

    static {
        f fVar = MasstransitOrderDto.Companion;
        c = new i3y[]{kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new g110(4)), null};
    }

    public /* synthetic */ MasstransitOrdersResponse(int i, int i2, List list) {
        this.a = (i & 1) == 0 ? EmptyList.a : list;
        if ((i & 2) == 0) {
            this.b = 0;
        } else {
            this.b = i2;
        }
    }

    public MasstransitOrdersResponse() {
        this.a = EmptyList.a;
        this.b = 0;
    }
}
