package com.yandex.go.payments.addmethod.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/yandex/go/payments/addmethod/analytics/PaymentMethodsAnalytics$AddNequiToAppScreenButton", "", "Lcom/yandex/go/payments/addmethod/analytics/PaymentMethodsAnalytics$AddNequiToAppScreenButton;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Skip", "Back", "ContinueInApp", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PaymentMethodsAnalytics$AddNequiToAppScreenButton {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PaymentMethodsAnalytics$AddNequiToAppScreenButton[] $VALUES;
    public static final PaymentMethodsAnalytics$AddNequiToAppScreenButton Back;
    public static final PaymentMethodsAnalytics$AddNequiToAppScreenButton ContinueInApp;
    public static final PaymentMethodsAnalytics$AddNequiToAppScreenButton Skip;
    private final String eventValue;

    static {
        PaymentMethodsAnalytics$AddNequiToAppScreenButton paymentMethodsAnalytics$AddNequiToAppScreenButton = new PaymentMethodsAnalytics$AddNequiToAppScreenButton("Skip", 0, "skip");
        Skip = paymentMethodsAnalytics$AddNequiToAppScreenButton;
        PaymentMethodsAnalytics$AddNequiToAppScreenButton paymentMethodsAnalytics$AddNequiToAppScreenButton2 = new PaymentMethodsAnalytics$AddNequiToAppScreenButton("Back", 1, "back");
        Back = paymentMethodsAnalytics$AddNequiToAppScreenButton2;
        PaymentMethodsAnalytics$AddNequiToAppScreenButton paymentMethodsAnalytics$AddNequiToAppScreenButton3 = new PaymentMethodsAnalytics$AddNequiToAppScreenButton("ContinueInApp", 2, "continue_in_app");
        ContinueInApp = paymentMethodsAnalytics$AddNequiToAppScreenButton3;
        PaymentMethodsAnalytics$AddNequiToAppScreenButton[] paymentMethodsAnalytics$AddNequiToAppScreenButtonArr = {paymentMethodsAnalytics$AddNequiToAppScreenButton, paymentMethodsAnalytics$AddNequiToAppScreenButton2, paymentMethodsAnalytics$AddNequiToAppScreenButton3};
        $VALUES = paymentMethodsAnalytics$AddNequiToAppScreenButtonArr;
        $ENTRIES = a.a(paymentMethodsAnalytics$AddNequiToAppScreenButtonArr);
    }

    public PaymentMethodsAnalytics$AddNequiToAppScreenButton(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static PaymentMethodsAnalytics$AddNequiToAppScreenButton valueOf(String str) {
        return (PaymentMethodsAnalytics$AddNequiToAppScreenButton) Enum.valueOf(PaymentMethodsAnalytics$AddNequiToAppScreenButton.class, str);
    }

    public static PaymentMethodsAnalytics$AddNequiToAppScreenButton[] values() {
        return (PaymentMethodsAnalytics$AddNequiToAppScreenButton[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
