package com.yandex.go.masstransit.sdk.order.impl.orders.network;

import com.yandex.go.masstransit.sdk.order.impl.orders.MasstransitOrderDto;
import com.yandex.go.masstransit.sdk.order.impl.orders.f;
import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/masstransit/sdk/order/impl/orders/network/GetMasstransitOrderResponse;", "", "Companion", "$serializer", "com/yandex/go/masstransit/sdk/order/impl/orders/network/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class GetMasstransitOrderResponse {
    public static final b Companion = new b();
    public final MasstransitOrderDto a;

    static {
        f fVar = MasstransitOrderDto.Companion;
    }

    public /* synthetic */ GetMasstransitOrderResponse(int i, MasstransitOrderDto masstransitOrderDto) {
        if ((i & 1) == 0) {
            this.a = new MasstransitOrderDto(0);
        } else {
            this.a = masstransitOrderDto;
        }
    }

    /* renamed from: a, reason: from getter */
    public final MasstransitOrderDto getA() {
        return this.a;
    }

    public GetMasstransitOrderResponse() {
        this.a = new MasstransitOrderDto(0);
    }
}
