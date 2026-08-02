package com.yandex.go.payments.addmethod.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yandex/go/payments/addmethod/analytics/PaymentMethodsAnalytics$AddNequiToAppScreenActionType", "", "Lcom/yandex/go/payments/addmethod/analytics/PaymentMethodsAnalytics$AddNequiToAppScreenActionType;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Show", "Tap", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PaymentMethodsAnalytics$AddNequiToAppScreenActionType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PaymentMethodsAnalytics$AddNequiToAppScreenActionType[] $VALUES;
    public static final PaymentMethodsAnalytics$AddNequiToAppScreenActionType Show;
    public static final PaymentMethodsAnalytics$AddNequiToAppScreenActionType Tap;
    private final String eventValue;

    static {
        PaymentMethodsAnalytics$AddNequiToAppScreenActionType paymentMethodsAnalytics$AddNequiToAppScreenActionType = new PaymentMethodsAnalytics$AddNequiToAppScreenActionType("Show", 0, "show");
        Show = paymentMethodsAnalytics$AddNequiToAppScreenActionType;
        PaymentMethodsAnalytics$AddNequiToAppScreenActionType paymentMethodsAnalytics$AddNequiToAppScreenActionType2 = new PaymentMethodsAnalytics$AddNequiToAppScreenActionType("Tap", 1, "tap");
        Tap = paymentMethodsAnalytics$AddNequiToAppScreenActionType2;
        PaymentMethodsAnalytics$AddNequiToAppScreenActionType[] paymentMethodsAnalytics$AddNequiToAppScreenActionTypeArr = {paymentMethodsAnalytics$AddNequiToAppScreenActionType, paymentMethodsAnalytics$AddNequiToAppScreenActionType2};
        $VALUES = paymentMethodsAnalytics$AddNequiToAppScreenActionTypeArr;
        $ENTRIES = a.a(paymentMethodsAnalytics$AddNequiToAppScreenActionTypeArr);
    }

    public PaymentMethodsAnalytics$AddNequiToAppScreenActionType(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static PaymentMethodsAnalytics$AddNequiToAppScreenActionType valueOf(String str) {
        return (PaymentMethodsAnalytics$AddNequiToAppScreenActionType) Enum.valueOf(PaymentMethodsAnalytics$AddNequiToAppScreenActionType.class, str);
    }

    public static PaymentMethodsAnalytics$AddNequiToAppScreenActionType[] values() {
        return (PaymentMethodsAnalytics$AddNequiToAppScreenActionType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
