package com.yandex.go.payments.cards.domainverification.domain;

import com.yandex.go.payments.cards.domainverification.data.PaymentMethodVerificationStatus;
import kotlin.Metadata;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/payments/cards/domainverification/domain/PaymentMethodVerificationUnsupportedActionException;", "Lcom/yandex/go/payments/cards/domainverification/domain/PaymentMethodVerificationException;", "Lcom/yandex/go/payments/cards/domainverification/data/PaymentMethodVerificationStatus;", ACSPConstants.STATUS, "Lcom/yandex/go/payments/cards/domainverification/data/PaymentMethodVerificationStatus;", "getStatus", "()Lcom/yandex/go/payments/cards/domainverification/data/PaymentMethodVerificationStatus;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PaymentMethodVerificationUnsupportedActionException extends PaymentMethodVerificationException {
    private final PaymentMethodVerificationStatus status;

    public PaymentMethodVerificationUnsupportedActionException(PaymentMethodVerificationStatus paymentMethodVerificationStatus) {
        super("Unsupported payment method verification action: " + paymentMethodVerificationStatus);
        this.status = paymentMethodVerificationStatus;
    }
}
