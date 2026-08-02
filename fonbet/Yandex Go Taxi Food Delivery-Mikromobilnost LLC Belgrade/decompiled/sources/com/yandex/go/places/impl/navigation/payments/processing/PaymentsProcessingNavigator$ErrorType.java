package com.yandex.go.places.impl.navigation.payments.processing;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/places/impl/navigation/payments/processing/PaymentsProcessingNavigator$ErrorType", "", "Lcom/yandex/go/places/impl/navigation/payments/processing/PaymentsProcessingNavigator$ErrorType;", "INVOICE_ERROR", "POLLING_ERROR", "PAYMENT_FAILURE", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PaymentsProcessingNavigator$ErrorType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PaymentsProcessingNavigator$ErrorType[] $VALUES;
    public static final PaymentsProcessingNavigator$ErrorType INVOICE_ERROR;
    public static final PaymentsProcessingNavigator$ErrorType PAYMENT_FAILURE;
    public static final PaymentsProcessingNavigator$ErrorType POLLING_ERROR;

    static {
        PaymentsProcessingNavigator$ErrorType paymentsProcessingNavigator$ErrorType = new PaymentsProcessingNavigator$ErrorType("INVOICE_ERROR", 0);
        INVOICE_ERROR = paymentsProcessingNavigator$ErrorType;
        PaymentsProcessingNavigator$ErrorType paymentsProcessingNavigator$ErrorType2 = new PaymentsProcessingNavigator$ErrorType("POLLING_ERROR", 1);
        POLLING_ERROR = paymentsProcessingNavigator$ErrorType2;
        PaymentsProcessingNavigator$ErrorType paymentsProcessingNavigator$ErrorType3 = new PaymentsProcessingNavigator$ErrorType("PAYMENT_FAILURE", 2);
        PAYMENT_FAILURE = paymentsProcessingNavigator$ErrorType3;
        PaymentsProcessingNavigator$ErrorType[] paymentsProcessingNavigator$ErrorTypeArr = {paymentsProcessingNavigator$ErrorType, paymentsProcessingNavigator$ErrorType2, paymentsProcessingNavigator$ErrorType3};
        $VALUES = paymentsProcessingNavigator$ErrorTypeArr;
        $ENTRIES = a.a(paymentsProcessingNavigator$ErrorTypeArr);
    }

    public static PaymentsProcessingNavigator$ErrorType valueOf(String str) {
        return (PaymentsProcessingNavigator$ErrorType) Enum.valueOf(PaymentsProcessingNavigator$ErrorType.class, str);
    }

    public static PaymentsProcessingNavigator$ErrorType[] values() {
        return (PaymentsProcessingNavigator$ErrorType[]) $VALUES.clone();
    }
}
