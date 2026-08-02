package com.yandex.go.superapp.orders.card.header;

import defpackage.on70;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class OrderCardHeaderViewLeadDelegate$getIconStackLead$1$2 extends FunctionReferenceImpl implements tls {
    public static final OrderCardHeaderViewLeadDelegate$getIconStackLead$1$2 b = new OrderCardHeaderViewLeadDelegate$getIconStackLead$1$2(1, 1, on70.class, "trackingRedesignImageSize", "trackingRedesignImageSize(I)I");

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int intValue = ((Number) obj).intValue();
        return Integer.valueOf(intValue <= 1 ? 40 : intValue == 2 ? 28 : 24);
    }
}
