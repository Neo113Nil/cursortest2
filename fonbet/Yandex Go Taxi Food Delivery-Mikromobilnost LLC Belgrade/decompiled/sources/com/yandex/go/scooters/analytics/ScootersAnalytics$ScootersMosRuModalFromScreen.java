package com.yandex.go.scooters.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"com/yandex/go/scooters/analytics/ScootersAnalytics$ScootersMosRuModalFromScreen", "", "Lcom/yandex/go/scooters/analytics/ScootersAnalytics$ScootersMosRuModalFromScreen;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Discovery", "Offer", "ActiveRide", "Finish", "go-client-android.features.scooters:analytics"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersAnalytics$ScootersMosRuModalFromScreen {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersAnalytics$ScootersMosRuModalFromScreen[] $VALUES;
    public static final ScootersAnalytics$ScootersMosRuModalFromScreen ActiveRide;
    public static final ScootersAnalytics$ScootersMosRuModalFromScreen Discovery;
    public static final ScootersAnalytics$ScootersMosRuModalFromScreen Finish;
    public static final ScootersAnalytics$ScootersMosRuModalFromScreen Offer;
    private final String eventValue;

    static {
        ScootersAnalytics$ScootersMosRuModalFromScreen scootersAnalytics$ScootersMosRuModalFromScreen = new ScootersAnalytics$ScootersMosRuModalFromScreen("Discovery", 0, "discovery");
        Discovery = scootersAnalytics$ScootersMosRuModalFromScreen;
        ScootersAnalytics$ScootersMosRuModalFromScreen scootersAnalytics$ScootersMosRuModalFromScreen2 = new ScootersAnalytics$ScootersMosRuModalFromScreen("Offer", 1, "offer");
        Offer = scootersAnalytics$ScootersMosRuModalFromScreen2;
        ScootersAnalytics$ScootersMosRuModalFromScreen scootersAnalytics$ScootersMosRuModalFromScreen3 = new ScootersAnalytics$ScootersMosRuModalFromScreen("ActiveRide", 2, "active_ride");
        ActiveRide = scootersAnalytics$ScootersMosRuModalFromScreen3;
        ScootersAnalytics$ScootersMosRuModalFromScreen scootersAnalytics$ScootersMosRuModalFromScreen4 = new ScootersAnalytics$ScootersMosRuModalFromScreen("Finish", 3, "finish");
        Finish = scootersAnalytics$ScootersMosRuModalFromScreen4;
        ScootersAnalytics$ScootersMosRuModalFromScreen[] scootersAnalytics$ScootersMosRuModalFromScreenArr = {scootersAnalytics$ScootersMosRuModalFromScreen, scootersAnalytics$ScootersMosRuModalFromScreen2, scootersAnalytics$ScootersMosRuModalFromScreen3, scootersAnalytics$ScootersMosRuModalFromScreen4};
        $VALUES = scootersAnalytics$ScootersMosRuModalFromScreenArr;
        $ENTRIES = a.a(scootersAnalytics$ScootersMosRuModalFromScreenArr);
    }

    public ScootersAnalytics$ScootersMosRuModalFromScreen(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static ScootersAnalytics$ScootersMosRuModalFromScreen valueOf(String str) {
        return (ScootersAnalytics$ScootersMosRuModalFromScreen) Enum.valueOf(ScootersAnalytics$ScootersMosRuModalFromScreen.class, str);
    }

    public static ScootersAnalytics$ScootersMosRuModalFromScreen[] values() {
        return (ScootersAnalytics$ScootersMosRuModalFromScreen[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
