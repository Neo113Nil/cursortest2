package com.yandex.go.payments.paymentdomain.domain.exception;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0005\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0005\b\t\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/yandex/go/payments/paymentdomain/domain/exception/PaymentDomainException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "InvalidContext", "DomainNotConfigured", "Client", "Verification", "MalformedResponse", "Lcom/yandex/go/payments/paymentdomain/domain/exception/PaymentDomainException$Client;", "Lcom/yandex/go/payments/paymentdomain/domain/exception/PaymentDomainException$DomainNotConfigured;", "Lcom/yandex/go/payments/paymentdomain/domain/exception/PaymentDomainException$InvalidContext;", "Lcom/yandex/go/payments/paymentdomain/domain/exception/PaymentDomainException$MalformedResponse;", "Lcom/yandex/go/payments/paymentdomain/domain/exception/PaymentDomainException$Verification;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class PaymentDomainException extends Exception {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/go/payments/paymentdomain/domain/exception/PaymentDomainException$Client;", "Lcom/yandex/go/payments/paymentdomain/domain/exception/PaymentDomainException;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Client extends PaymentDomainException {
        public Client(Exception exc) {
            super("Failed to load payment domain", exc);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003Ê\u0001\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/payments/paymentdomain/domain/exception/PaymentDomainException$DomainNotConfigured;", "Lcom/yandex/go/payments/paymentdomain/domain/exception/PaymentDomainException;", "<init>", "()V", "impl", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class DomainNotConfigured extends PaymentDomainException {
        public DomainNotConfigured() {
            super("Payment domain is not configured", null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003Ê\u0001\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/payments/paymentdomain/domain/exception/PaymentDomainException$InvalidContext;", "Lcom/yandex/go/payments/paymentdomain/domain/exception/PaymentDomainException;", "<init>", "()V", "impl", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class InvalidContext extends PaymentDomainException {
        public InvalidContext() {
            super("Payment domain request context is invalid", null);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/go/payments/paymentdomain/domain/exception/PaymentDomainException$MalformedResponse;", "Lcom/yandex/go/payments/paymentdomain/domain/exception/PaymentDomainException;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class MalformedResponse extends PaymentDomainException {
        public MalformedResponse(Exception exc) {
            super("Payment domain response is malformed", exc);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/go/payments/paymentdomain/domain/exception/PaymentDomainException$Verification;", "Lcom/yandex/go/payments/paymentdomain/domain/exception/PaymentDomainException;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Verification extends PaymentDomainException {
        public Verification(Exception exc) {
            super("Payment domain verification failed", exc);
        }

        public Verification() {
            this(null);
        }
    }
}
