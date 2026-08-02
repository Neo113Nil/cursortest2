package com.yandex.go.payments.cards.data;

import com.yandex.go.payments.cards.data.model.PaymentVerificationsResponse;
import com.yandex.go.payments.cards.data.model.VerificationRequest;
import defpackage.cmt;
import defpackage.q76;
import defpackage.s490;
import defpackage.z8u;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J5\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H'¢\u0006\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lcom/yandex/go/payments/cards/data/VerificationApi;", "", "", "authToken", "idempotencyToken", "Lcom/yandex/go/payments/cards/data/model/VerificationRequest;", "request", "Lcmt;", "Lcom/yandex/go/payments/cards/data/model/PaymentVerificationsResponse;", "a", "(Ljava/lang/String;Ljava/lang/String;Lcom/yandex/go/payments/cards/data/model/VerificationRequest;)Lcmt;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface VerificationApi {
    @s490("paymentverifications")
    cmt<PaymentVerificationsResponse> a(@z8u("Authorization") String authToken, @z8u("X-Idempotency-Token") String idempotencyToken, @q76 VerificationRequest request);
}
