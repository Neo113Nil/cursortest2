package com.yandex.go.payments.paymentlist.domain;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/yandex/go/payments/paymentlist/domain/PaymentMethodsConfig$OpenReason", "", "Lcom/yandex/go/payments/paymentlist/domain/PaymentMethodsConfig$OpenReason;", "PREORDER", "RIDE", "DEBTS", "COMPOSITE_PAYMENT", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PaymentMethodsConfig$OpenReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PaymentMethodsConfig$OpenReason[] $VALUES;
    public static final PaymentMethodsConfig$OpenReason COMPOSITE_PAYMENT;
    public static final PaymentMethodsConfig$OpenReason DEBTS;
    public static final PaymentMethodsConfig$OpenReason PREORDER;
    public static final PaymentMethodsConfig$OpenReason RIDE;

    static {
        PaymentMethodsConfig$OpenReason paymentMethodsConfig$OpenReason = new PaymentMethodsConfig$OpenReason("PREORDER", 0);
        PREORDER = paymentMethodsConfig$OpenReason;
        PaymentMethodsConfig$OpenReason paymentMethodsConfig$OpenReason2 = new PaymentMethodsConfig$OpenReason("RIDE", 1);
        RIDE = paymentMethodsConfig$OpenReason2;
        PaymentMethodsConfig$OpenReason paymentMethodsConfig$OpenReason3 = new PaymentMethodsConfig$OpenReason("DEBTS", 2);
        DEBTS = paymentMethodsConfig$OpenReason3;
        PaymentMethodsConfig$OpenReason paymentMethodsConfig$OpenReason4 = new PaymentMethodsConfig$OpenReason("COMPOSITE_PAYMENT", 3);
        COMPOSITE_PAYMENT = paymentMethodsConfig$OpenReason4;
        PaymentMethodsConfig$OpenReason[] paymentMethodsConfig$OpenReasonArr = {paymentMethodsConfig$OpenReason, paymentMethodsConfig$OpenReason2, paymentMethodsConfig$OpenReason3, paymentMethodsConfig$OpenReason4};
        $VALUES = paymentMethodsConfig$OpenReasonArr;
        $ENTRIES = kotlin.enums.a.a(paymentMethodsConfig$OpenReasonArr);
    }

    public static PaymentMethodsConfig$OpenReason valueOf(String str) {
        return (PaymentMethodsConfig$OpenReason) Enum.valueOf(PaymentMethodsConfig$OpenReason.class, str);
    }

    public static PaymentMethodsConfig$OpenReason[] values() {
        return (PaymentMethodsConfig$OpenReason[]) $VALUES.clone();
    }
}
