package com.yandex.go.masstransit.sdk.order.impl.orders;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl70;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/masstransit/sdk/order/impl/orders/OrderDetailPresentationDto;", "", "Companion", "$serializer", "com/yandex/go/masstransit/sdk/order/impl/orders/p", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class OrderDetailPresentationDto {
    public static final p Companion = new p();
    public static final i3y[] d = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jl70(23))};
    public final PaymentDto a;
    public final GradientDto b;
    public final List c;

    public /* synthetic */ OrderDetailPresentationDto(int i, PaymentDto paymentDto, GradientDto gradientDto, List list) {
        this.a = (i & 1) == 0 ? new PaymentDto(0) : paymentDto;
        if ((i & 2) == 0) {
            this.b = new GradientDto(0);
        } else {
            this.b = gradientDto;
        }
        if ((i & 4) == 0) {
            this.c = EmptyList.a;
        } else {
            this.c = list;
        }
    }

    /* renamed from: a, reason: from getter */
    public final List getC() {
        return this.c;
    }

    public OrderDetailPresentationDto() {
        this(0);
    }

    public OrderDetailPresentationDto(int i) {
        PaymentDto paymentDto = new PaymentDto(0);
        GradientDto gradientDto = new GradientDto(0);
        this.a = paymentDto;
        this.b = gradientDto;
        this.c = EmptyList.a;
    }
}
