package com.yandex.go.taxi.order.performer;

import com.yandex.fintechsdk.flows.applink.payment.internal.di.paymentform.features.bdui.action.finish.FinishFlowStatus;
import defpackage.cmt;
import defpackage.djg0;
import defpackage.wqs;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J)\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/yandex/go/taxi/order/performer/OrderPerformerApi;", "", "", FinishFlowStatus.ORDER_ID_FIELD_NAME, "performerTag", "Lcmt;", "Lcom/yandex/go/taxi/order/performer/OrderPerformerInfoResponse;", "a", "(Ljava/lang/String;Ljava/lang/String;)Lcmt;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface OrderPerformerApi {
    @wqs("orderperformerinfo")
    cmt<OrderPerformerInfoResponse> a(@djg0("order_id") String orderId, @djg0("performer_tag") String performerTag);
}
