package com.yandex.go.payments.cards.domainverification.data;

import defpackage.cmt;
import defpackage.q76;
import defpackage.s490;
import defpackage.z8u;
import kotlin.Metadata;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\nH'¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u000eH'¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lcom/yandex/go/payments/cards/domainverification/data/PaymentMethodVerificationApi;", "", "Lcom/yandex/go/payments/cards/domainverification/data/PaymentMethodVerificationIntentRequest;", "request", "Lcmt;", "Lcom/yandex/go/payments/cards/domainverification/data/PaymentMethodVerificationIntentResponse;", "b", "(Lcom/yandex/go/payments/cards/domainverification/data/PaymentMethodVerificationIntentRequest;)Lcmt;", "", "idempotencyToken", "Lcom/yandex/go/payments/cards/domainverification/data/StartPaymentMethodVerificationRequest;", "Lcom/yandex/go/payments/cards/domainverification/data/PaymentMethodVerificationResponse;", "c", "(Ljava/lang/String;Lcom/yandex/go/payments/cards/domainverification/data/StartPaymentMethodVerificationRequest;)Lcmt;", "Lcom/yandex/go/payments/cards/domainverification/data/PaymentMethodVerificationStatusRequest;", "a", "(Lcom/yandex/go/payments/cards/domainverification/data/PaymentMethodVerificationStatusRequest;)Lcmt;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface PaymentMethodVerificationApi {
    @s490("cardstorage/v2/payment_method/verification_status")
    cmt<PaymentMethodVerificationResponse> a(@q76 PaymentMethodVerificationStatusRequest request);

    @s490("cardstorage/v2/payment_method/verification_intent")
    cmt<PaymentMethodVerificationIntentResponse> b(@q76 PaymentMethodVerificationIntentRequest request);

    @s490("cardstorage/v2/payment_method/verify")
    cmt<PaymentMethodVerificationResponse> c(@z8u("X-Idempotency-Token") String idempotencyToken, @q76 StartPaymentMethodVerificationRequest request);
}
