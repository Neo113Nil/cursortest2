package com.yandex.go.masstransit.sdk.order.impl.orders;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/masstransit/sdk/order/impl/orders/MasstransitOrderPresentationsDto;", "", "Companion", "$serializer", "com/yandex/go/masstransit/sdk/order/impl/orders/g", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MasstransitOrderPresentationsDto {
    public static final g Companion = new g();
    public final OrderDetailPresentationDto a;
    public final TrackingPresentationDto b;

    public /* synthetic */ MasstransitOrderPresentationsDto(int i, OrderDetailPresentationDto orderDetailPresentationDto, TrackingPresentationDto trackingPresentationDto) {
        this.a = (i & 1) == 0 ? new OrderDetailPresentationDto(0) : orderDetailPresentationDto;
        if ((i & 2) == 0) {
            this.b = new TrackingPresentationDto(0);
        } else {
            this.b = trackingPresentationDto;
        }
    }

    /* renamed from: a, reason: from getter */
    public final OrderDetailPresentationDto getA() {
        return this.a;
    }

    public MasstransitOrderPresentationsDto() {
        this(0);
    }

    public MasstransitOrderPresentationsDto(int i) {
        OrderDetailPresentationDto orderDetailPresentationDto = new OrderDetailPresentationDto(0);
        TrackingPresentationDto trackingPresentationDto = new TrackingPresentationDto(0);
        this.a = orderDetailPresentationDto;
        this.b = trackingPresentationDto;
    }
}
