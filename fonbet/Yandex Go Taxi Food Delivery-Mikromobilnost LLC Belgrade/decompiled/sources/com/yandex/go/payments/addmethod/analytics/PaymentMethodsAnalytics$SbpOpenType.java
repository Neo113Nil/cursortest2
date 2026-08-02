package com.yandex.go.payments.addmethod.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yandex/go/payments/addmethod/analytics/PaymentMethodsAnalytics$SbpOpenType", "", "Lcom/yandex/go/payments/addmethod/analytics/PaymentMethodsAnalytics$SbpOpenType;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "App", "Web", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PaymentMethodsAnalytics$SbpOpenType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PaymentMethodsAnalytics$SbpOpenType[] $VALUES;
    public static final PaymentMethodsAnalytics$SbpOpenType App;
    public static final PaymentMethodsAnalytics$SbpOpenType Web;
    private final String eventValue;

    static {
        PaymentMethodsAnalytics$SbpOpenType paymentMethodsAnalytics$SbpOpenType = new PaymentMethodsAnalytics$SbpOpenType("App", 0, "app");
        App = paymentMethodsAnalytics$SbpOpenType;
        PaymentMethodsAnalytics$SbpOpenType paymentMethodsAnalytics$SbpOpenType2 = new PaymentMethodsAnalytics$SbpOpenType("Web", 1, "web");
        Web = paymentMethodsAnalytics$SbpOpenType2;
        PaymentMethodsAnalytics$SbpOpenType[] paymentMethodsAnalytics$SbpOpenTypeArr = {paymentMethodsAnalytics$SbpOpenType, paymentMethodsAnalytics$SbpOpenType2};
        $VALUES = paymentMethodsAnalytics$SbpOpenTypeArr;
        $ENTRIES = a.a(paymentMethodsAnalytics$SbpOpenTypeArr);
    }

    public PaymentMethodsAnalytics$SbpOpenType(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static PaymentMethodsAnalytics$SbpOpenType valueOf(String str) {
        return (PaymentMethodsAnalytics$SbpOpenType) Enum.valueOf(PaymentMethodsAnalytics$SbpOpenType.class, str);
    }

    public static PaymentMethodsAnalytics$SbpOpenType[] values() {
        return (PaymentMethodsAnalytics$SbpOpenType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
