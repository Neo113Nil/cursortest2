package com.yandex.go.platform.payments.models;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0003\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/yandex/go/platform/payments/models/PaymentException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "AbortPaymentOperation", "EmptyResult", "UnbindUserNotFound", "Lcom/yandex/go/platform/payments/models/PaymentException$AbortPaymentOperation;", "Lcom/yandex/go/platform/payments/models/PaymentException$EmptyResult;", "Lcom/yandex/go/platform/payments/models/PaymentException$UnbindUserNotFound;", "com.yandex.go.platform.payments"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class PaymentException extends Exception {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/go/platform/payments/models/PaymentException$AbortPaymentOperation;", "Lcom/yandex/go/platform/payments/models/PaymentException;", "com.yandex.go.platform.payments"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AbortPaymentOperation extends PaymentException {
        public static final AbortPaymentOperation a = new AbortPaymentOperation("User aborted procedure");
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/go/platform/payments/models/PaymentException$EmptyResult;", "Lcom/yandex/go/platform/payments/models/PaymentException;", "com.yandex.go.platform.payments"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class EmptyResult extends PaymentException {
        public static final EmptyResult a = new EmptyResult("Can't get result from activity result");
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/go/platform/payments/models/PaymentException$UnbindUserNotFound;", "Lcom/yandex/go/platform/payments/models/PaymentException;", "com.yandex.go.platform.payments"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UnbindUserNotFound extends PaymentException {
        public static final UnbindUserNotFound a = new UnbindUserNotFound("Asking of card unbinding for user with no uid");
    }
}
