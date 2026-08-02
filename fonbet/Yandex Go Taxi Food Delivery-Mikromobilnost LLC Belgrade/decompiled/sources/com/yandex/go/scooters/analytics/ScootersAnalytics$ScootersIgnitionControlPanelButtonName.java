package com.yandex.go.scooters.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/yandex/go/scooters/analytics/ScootersAnalytics$ScootersIgnitionControlPanelButtonName", "", "Lcom/yandex/go/scooters/analytics/ScootersAnalytics$ScootersIgnitionControlPanelButtonName;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Close", "Banner", "StartControlling", "go-client-android.features.scooters:analytics"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersAnalytics$ScootersIgnitionControlPanelButtonName {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersAnalytics$ScootersIgnitionControlPanelButtonName[] $VALUES;
    public static final ScootersAnalytics$ScootersIgnitionControlPanelButtonName Banner;
    public static final ScootersAnalytics$ScootersIgnitionControlPanelButtonName Close;
    public static final ScootersAnalytics$ScootersIgnitionControlPanelButtonName StartControlling;
    private final String eventValue;

    static {
        ScootersAnalytics$ScootersIgnitionControlPanelButtonName scootersAnalytics$ScootersIgnitionControlPanelButtonName = new ScootersAnalytics$ScootersIgnitionControlPanelButtonName("Close", 0, "close");
        Close = scootersAnalytics$ScootersIgnitionControlPanelButtonName;
        ScootersAnalytics$ScootersIgnitionControlPanelButtonName scootersAnalytics$ScootersIgnitionControlPanelButtonName2 = new ScootersAnalytics$ScootersIgnitionControlPanelButtonName("Banner", 1, "banner");
        Banner = scootersAnalytics$ScootersIgnitionControlPanelButtonName2;
        ScootersAnalytics$ScootersIgnitionControlPanelButtonName scootersAnalytics$ScootersIgnitionControlPanelButtonName3 = new ScootersAnalytics$ScootersIgnitionControlPanelButtonName("StartControlling", 2, "start_controlling");
        StartControlling = scootersAnalytics$ScootersIgnitionControlPanelButtonName3;
        ScootersAnalytics$ScootersIgnitionControlPanelButtonName[] scootersAnalytics$ScootersIgnitionControlPanelButtonNameArr = {scootersAnalytics$ScootersIgnitionControlPanelButtonName, scootersAnalytics$ScootersIgnitionControlPanelButtonName2, scootersAnalytics$ScootersIgnitionControlPanelButtonName3};
        $VALUES = scootersAnalytics$ScootersIgnitionControlPanelButtonNameArr;
        $ENTRIES = a.a(scootersAnalytics$ScootersIgnitionControlPanelButtonNameArr);
    }

    public ScootersAnalytics$ScootersIgnitionControlPanelButtonName(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static ScootersAnalytics$ScootersIgnitionControlPanelButtonName valueOf(String str) {
        return (ScootersAnalytics$ScootersIgnitionControlPanelButtonName) Enum.valueOf(ScootersAnalytics$ScootersIgnitionControlPanelButtonName.class, str);
    }

    public static ScootersAnalytics$ScootersIgnitionControlPanelButtonName[] values() {
        return (ScootersAnalytics$ScootersIgnitionControlPanelButtonName[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
