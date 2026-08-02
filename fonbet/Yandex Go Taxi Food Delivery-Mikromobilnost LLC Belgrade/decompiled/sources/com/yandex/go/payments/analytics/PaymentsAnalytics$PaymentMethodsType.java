package com.yandex.go.payments.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yandex/go/payments/analytics/PaymentsAnalytics$PaymentMethodsType", "", "Lcom/yandex/go/payments/analytics/PaymentsAnalytics$PaymentMethodsType;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Card", "SbpToken", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PaymentsAnalytics$PaymentMethodsType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PaymentsAnalytics$PaymentMethodsType[] $VALUES;
    public static final PaymentsAnalytics$PaymentMethodsType Card;
    public static final PaymentsAnalytics$PaymentMethodsType SbpToken;
    private final String eventValue;

    static {
        PaymentsAnalytics$PaymentMethodsType paymentsAnalytics$PaymentMethodsType = new PaymentsAnalytics$PaymentMethodsType("Card", 0, "card");
        Card = paymentsAnalytics$PaymentMethodsType;
        PaymentsAnalytics$PaymentMethodsType paymentsAnalytics$PaymentMethodsType2 = new PaymentsAnalytics$PaymentMethodsType("SbpToken", 1, "sbp_token");
        SbpToken = paymentsAnalytics$PaymentMethodsType2;
        PaymentsAnalytics$PaymentMethodsType[] paymentsAnalytics$PaymentMethodsTypeArr = {paymentsAnalytics$PaymentMethodsType, paymentsAnalytics$PaymentMethodsType2};
        $VALUES = paymentsAnalytics$PaymentMethodsTypeArr;
        $ENTRIES = a.a(paymentsAnalytics$PaymentMethodsTypeArr);
    }

    public PaymentsAnalytics$PaymentMethodsType(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static PaymentsAnalytics$PaymentMethodsType valueOf(String str) {
        return (PaymentsAnalytics$PaymentMethodsType) Enum.valueOf(PaymentsAnalytics$PaymentMethodsType.class, str);
    }

    public static PaymentsAnalytics$PaymentMethodsType[] values() {
        return (PaymentsAnalytics$PaymentMethodsType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
