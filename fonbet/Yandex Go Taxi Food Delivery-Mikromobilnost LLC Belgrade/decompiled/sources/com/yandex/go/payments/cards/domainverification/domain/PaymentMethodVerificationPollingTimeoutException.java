package com.yandex.go.payments.cards.domainverification.domain;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003Ê\u0001\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/payments/cards/domainverification/domain/PaymentMethodVerificationPollingTimeoutException;", "Lcom/yandex/go/payments/cards/domainverification/domain/PaymentMethodVerificationException;", "<init>", "()V", "impl", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PaymentMethodVerificationPollingTimeoutException extends PaymentMethodVerificationException {
    public PaymentMethodVerificationPollingTimeoutException() {
        super("Payment method verification polling timed out");
    }
}
