package com.yandex.go.taxi.order;

import com.yandex.fintechsdk.flows.applink.payment.internal.di.paymentform.features.bdui.action.finish.FinishFlowStatus;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/taxi/order/OrderStatusProvider$OrderNotFoundException", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "", FinishFlowStatus.ORDER_ID_FIELD_NAME, "Ljava/lang/String;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class OrderStatusProvider$OrderNotFoundException extends RuntimeException {
    private final String orderId;

    public OrderStatusProvider$OrderNotFoundException(Throwable th, String str) {
        super(th);
        this.orderId = str;
    }

    /* renamed from: a, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }
}
