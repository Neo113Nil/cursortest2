package com.yandex.go.scooters.mosru.api.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/scooters/mosru/api/analytics/ScootersMosRuAnalyticsFromScreen;", "", "DISCOVERY", "OFFER", "ACTIVE_RIDE", "FINISH", "go-client-android.features.scooters.mosru:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersMosRuAnalyticsFromScreen {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersMosRuAnalyticsFromScreen[] $VALUES;
    public static final ScootersMosRuAnalyticsFromScreen ACTIVE_RIDE;
    public static final ScootersMosRuAnalyticsFromScreen DISCOVERY;
    public static final ScootersMosRuAnalyticsFromScreen FINISH;
    public static final ScootersMosRuAnalyticsFromScreen OFFER;

    static {
        ScootersMosRuAnalyticsFromScreen scootersMosRuAnalyticsFromScreen = new ScootersMosRuAnalyticsFromScreen("DISCOVERY", 0);
        DISCOVERY = scootersMosRuAnalyticsFromScreen;
        ScootersMosRuAnalyticsFromScreen scootersMosRuAnalyticsFromScreen2 = new ScootersMosRuAnalyticsFromScreen("OFFER", 1);
        OFFER = scootersMosRuAnalyticsFromScreen2;
        ScootersMosRuAnalyticsFromScreen scootersMosRuAnalyticsFromScreen3 = new ScootersMosRuAnalyticsFromScreen("ACTIVE_RIDE", 2);
        ACTIVE_RIDE = scootersMosRuAnalyticsFromScreen3;
        ScootersMosRuAnalyticsFromScreen scootersMosRuAnalyticsFromScreen4 = new ScootersMosRuAnalyticsFromScreen("FINISH", 3);
        FINISH = scootersMosRuAnalyticsFromScreen4;
        ScootersMosRuAnalyticsFromScreen[] scootersMosRuAnalyticsFromScreenArr = {scootersMosRuAnalyticsFromScreen, scootersMosRuAnalyticsFromScreen2, scootersMosRuAnalyticsFromScreen3, scootersMosRuAnalyticsFromScreen4};
        $VALUES = scootersMosRuAnalyticsFromScreenArr;
        $ENTRIES = a.a(scootersMosRuAnalyticsFromScreenArr);
    }

    public static ScootersMosRuAnalyticsFromScreen valueOf(String str) {
        return (ScootersMosRuAnalyticsFromScreen) Enum.valueOf(ScootersMosRuAnalyticsFromScreen.class, str);
    }

    public static ScootersMosRuAnalyticsFromScreen[] values() {
        return (ScootersMosRuAnalyticsFromScreen[]) $VALUES.clone();
    }
}
