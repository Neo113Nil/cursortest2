package com.yandex.go.scooters.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/yandex/go/scooters/analytics/ScootersDebtAnalytics$TappedButton", "", "Lcom/yandex/go/scooters/analytics/ScootersDebtAnalytics$TappedButton;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Back", "PayDebt", "ChangePayment", "go-client-android.features.scooters:analytics"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersDebtAnalytics$TappedButton {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersDebtAnalytics$TappedButton[] $VALUES;
    public static final ScootersDebtAnalytics$TappedButton Back;
    public static final ScootersDebtAnalytics$TappedButton ChangePayment;
    public static final ScootersDebtAnalytics$TappedButton PayDebt;
    private final String eventValue;

    static {
        ScootersDebtAnalytics$TappedButton scootersDebtAnalytics$TappedButton = new ScootersDebtAnalytics$TappedButton("Back", 0, "back");
        Back = scootersDebtAnalytics$TappedButton;
        ScootersDebtAnalytics$TappedButton scootersDebtAnalytics$TappedButton2 = new ScootersDebtAnalytics$TappedButton("PayDebt", 1, "pay_debt");
        PayDebt = scootersDebtAnalytics$TappedButton2;
        ScootersDebtAnalytics$TappedButton scootersDebtAnalytics$TappedButton3 = new ScootersDebtAnalytics$TappedButton("ChangePayment", 2, "change_payment");
        ChangePayment = scootersDebtAnalytics$TappedButton3;
        ScootersDebtAnalytics$TappedButton[] scootersDebtAnalytics$TappedButtonArr = {scootersDebtAnalytics$TappedButton, scootersDebtAnalytics$TappedButton2, scootersDebtAnalytics$TappedButton3};
        $VALUES = scootersDebtAnalytics$TappedButtonArr;
        $ENTRIES = a.a(scootersDebtAnalytics$TappedButtonArr);
    }

    public ScootersDebtAnalytics$TappedButton(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static ScootersDebtAnalytics$TappedButton valueOf(String str) {
        return (ScootersDebtAnalytics$TappedButton) Enum.valueOf(ScootersDebtAnalytics$TappedButton.class, str);
    }

    public static ScootersDebtAnalytics$TappedButton[] values() {
        return (ScootersDebtAnalytics$TappedButton[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
