package com.yandex.go.payments.acceptance.data;

import com.yandex.fintechsdk.flows.applink.payment.internal.di.paymentform.features.bdui.action.finish.FinishFlowStatus;
import com.yandex.go.payments.acceptance.data.model.AcceptancePaymentCancelRequest;
import com.yandex.go.payments.acceptance.data.model.AcceptancePaymentStartRequest;
import com.yandex.go.payments.acceptance.data.model.AcceptancePaymentStatusResponse;
import defpackage.cmt;
import defpackage.djg0;
import defpackage.q76;
import defpackage.s490;
import defpackage.wqs;
import defpackage.zy11;
import kotlin.Metadata;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\rH'¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lcom/yandex/go/payments/acceptance/data/AcceptancePaymentApi;", "", "Lcom/yandex/go/payments/acceptance/data/model/AcceptancePaymentStartRequest;", "request", "Lcmt;", "Lzy11;", "b", "(Lcom/yandex/go/payments/acceptance/data/model/AcceptancePaymentStartRequest;)Lcmt;", "", FinishFlowStatus.ORDER_ID_FIELD_NAME, "Lcom/yandex/go/payments/acceptance/data/model/AcceptancePaymentStatusResponse;", "c", "(Ljava/lang/String;)Lcmt;", "Lcom/yandex/go/payments/acceptance/data/model/AcceptancePaymentCancelRequest;", "a", "(Lcom/yandex/go/payments/acceptance/data/model/AcceptancePaymentCancelRequest;)Lcmt;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface AcceptancePaymentApi {
    @s490("payment-methods/v1/acceptance-payment/cancel")
    cmt<zy11> a(@q76 AcceptancePaymentCancelRequest request);

    @s490("payment-methods/v1/acceptance-payment/start")
    cmt<zy11> b(@q76 AcceptancePaymentStartRequest request);

    @wqs("payment-methods/v1/acceptance-payment/status")
    cmt<AcceptancePaymentStatusResponse> c(@djg0("order_id") String orderId);
}
