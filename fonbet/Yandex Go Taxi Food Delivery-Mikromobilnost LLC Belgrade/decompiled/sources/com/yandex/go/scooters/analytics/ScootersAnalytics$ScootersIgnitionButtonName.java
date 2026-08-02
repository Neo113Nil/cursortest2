package com.yandex.go.scooters.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"com/yandex/go/scooters/analytics/ScootersAnalytics$ScootersIgnitionButtonName", "", "Lcom/yandex/go/scooters/analytics/ScootersAnalytics$ScootersIgnitionButtonName;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Enable", "Disable", "ItemLegalTerms", "ItemOnboarding", "BottomLegalTerms", "AllowNotification", "AllowGeolocation", "AllowBluetooth", "go-client-android.features.scooters:analytics"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersAnalytics$ScootersIgnitionButtonName {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersAnalytics$ScootersIgnitionButtonName[] $VALUES;
    public static final ScootersAnalytics$ScootersIgnitionButtonName AllowBluetooth;
    public static final ScootersAnalytics$ScootersIgnitionButtonName AllowGeolocation;
    public static final ScootersAnalytics$ScootersIgnitionButtonName AllowNotification;
    public static final ScootersAnalytics$ScootersIgnitionButtonName BottomLegalTerms;
    public static final ScootersAnalytics$ScootersIgnitionButtonName Disable;
    public static final ScootersAnalytics$ScootersIgnitionButtonName Enable;
    public static final ScootersAnalytics$ScootersIgnitionButtonName ItemLegalTerms;
    public static final ScootersAnalytics$ScootersIgnitionButtonName ItemOnboarding;
    private final String eventValue;

    static {
        ScootersAnalytics$ScootersIgnitionButtonName scootersAnalytics$ScootersIgnitionButtonName = new ScootersAnalytics$ScootersIgnitionButtonName("Enable", 0, "enable");
        Enable = scootersAnalytics$ScootersIgnitionButtonName;
        ScootersAnalytics$ScootersIgnitionButtonName scootersAnalytics$ScootersIgnitionButtonName2 = new ScootersAnalytics$ScootersIgnitionButtonName("Disable", 1, "disable");
        Disable = scootersAnalytics$ScootersIgnitionButtonName2;
        ScootersAnalytics$ScootersIgnitionButtonName scootersAnalytics$ScootersIgnitionButtonName3 = new ScootersAnalytics$ScootersIgnitionButtonName("ItemLegalTerms", 2, "item_legal_terms");
        ItemLegalTerms = scootersAnalytics$ScootersIgnitionButtonName3;
        ScootersAnalytics$ScootersIgnitionButtonName scootersAnalytics$ScootersIgnitionButtonName4 = new ScootersAnalytics$ScootersIgnitionButtonName("ItemOnboarding", 3, "item_onboarding");
        ItemOnboarding = scootersAnalytics$ScootersIgnitionButtonName4;
        ScootersAnalytics$ScootersIgnitionButtonName scootersAnalytics$ScootersIgnitionButtonName5 = new ScootersAnalytics$ScootersIgnitionButtonName("BottomLegalTerms", 4, "bottom_legal_terms");
        BottomLegalTerms = scootersAnalytics$ScootersIgnitionButtonName5;
        ScootersAnalytics$ScootersIgnitionButtonName scootersAnalytics$ScootersIgnitionButtonName6 = new ScootersAnalytics$ScootersIgnitionButtonName("AllowNotification", 5, "allow_notification");
        AllowNotification = scootersAnalytics$ScootersIgnitionButtonName6;
        ScootersAnalytics$ScootersIgnitionButtonName scootersAnalytics$ScootersIgnitionButtonName7 = new ScootersAnalytics$ScootersIgnitionButtonName("AllowGeolocation", 6, "allow_geolocation");
        AllowGeolocation = scootersAnalytics$ScootersIgnitionButtonName7;
        ScootersAnalytics$ScootersIgnitionButtonName scootersAnalytics$ScootersIgnitionButtonName8 = new ScootersAnalytics$ScootersIgnitionButtonName("AllowBluetooth", 7, "allow_bluetooth");
        AllowBluetooth = scootersAnalytics$ScootersIgnitionButtonName8;
        ScootersAnalytics$ScootersIgnitionButtonName[] scootersAnalytics$ScootersIgnitionButtonNameArr = {scootersAnalytics$ScootersIgnitionButtonName, scootersAnalytics$ScootersIgnitionButtonName2, scootersAnalytics$ScootersIgnitionButtonName3, scootersAnalytics$ScootersIgnitionButtonName4, scootersAnalytics$ScootersIgnitionButtonName5, scootersAnalytics$ScootersIgnitionButtonName6, scootersAnalytics$ScootersIgnitionButtonName7, scootersAnalytics$ScootersIgnitionButtonName8};
        $VALUES = scootersAnalytics$ScootersIgnitionButtonNameArr;
        $ENTRIES = a.a(scootersAnalytics$ScootersIgnitionButtonNameArr);
    }

    public ScootersAnalytics$ScootersIgnitionButtonName(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static ScootersAnalytics$ScootersIgnitionButtonName valueOf(String str) {
        return (ScootersAnalytics$ScootersIgnitionButtonName) Enum.valueOf(ScootersAnalytics$ScootersIgnitionButtonName.class, str);
    }

    public static ScootersAnalytics$ScootersIgnitionButtonName[] values() {
        return (ScootersAnalytics$ScootersIgnitionButtonName[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
