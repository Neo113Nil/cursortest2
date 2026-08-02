package com.yandex.go.scooters.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"com/yandex/go/scooters/analytics/ScootersAnalytics$ScootersLiveActivityTappedButtonName", "", "Lcom/yandex/go/scooters/analytics/ScootersAnalytics$ScootersLiveActivityTappedButtonName;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "CancelRiding", "StartRiding", "FinishRiding", "StopRiding", "WhereIsScooter", "ScootersRouteNavigation", "go-client-android.features.scooters:analytics"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ScootersAnalytics$ScootersLiveActivityTappedButtonName {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersAnalytics$ScootersLiveActivityTappedButtonName[] $VALUES;
    public static final ScootersAnalytics$ScootersLiveActivityTappedButtonName CancelRiding;
    public static final ScootersAnalytics$ScootersLiveActivityTappedButtonName FinishRiding;
    public static final ScootersAnalytics$ScootersLiveActivityTappedButtonName ScootersRouteNavigation;
    public static final ScootersAnalytics$ScootersLiveActivityTappedButtonName StartRiding;
    public static final ScootersAnalytics$ScootersLiveActivityTappedButtonName StopRiding;
    public static final ScootersAnalytics$ScootersLiveActivityTappedButtonName WhereIsScooter;
    private final String eventValue;

    static {
        ScootersAnalytics$ScootersLiveActivityTappedButtonName scootersAnalytics$ScootersLiveActivityTappedButtonName = new ScootersAnalytics$ScootersLiveActivityTappedButtonName("CancelRiding", 0, "cancel_riding");
        CancelRiding = scootersAnalytics$ScootersLiveActivityTappedButtonName;
        ScootersAnalytics$ScootersLiveActivityTappedButtonName scootersAnalytics$ScootersLiveActivityTappedButtonName2 = new ScootersAnalytics$ScootersLiveActivityTappedButtonName("StartRiding", 1, "start_riding");
        StartRiding = scootersAnalytics$ScootersLiveActivityTappedButtonName2;
        ScootersAnalytics$ScootersLiveActivityTappedButtonName scootersAnalytics$ScootersLiveActivityTappedButtonName3 = new ScootersAnalytics$ScootersLiveActivityTappedButtonName("FinishRiding", 2, "finish_riding");
        FinishRiding = scootersAnalytics$ScootersLiveActivityTappedButtonName3;
        ScootersAnalytics$ScootersLiveActivityTappedButtonName scootersAnalytics$ScootersLiveActivityTappedButtonName4 = new ScootersAnalytics$ScootersLiveActivityTappedButtonName("StopRiding", 3, "stop_riding");
        StopRiding = scootersAnalytics$ScootersLiveActivityTappedButtonName4;
        ScootersAnalytics$ScootersLiveActivityTappedButtonName scootersAnalytics$ScootersLiveActivityTappedButtonName5 = new ScootersAnalytics$ScootersLiveActivityTappedButtonName("WhereIsScooter", 4, "where_is_scooter");
        WhereIsScooter = scootersAnalytics$ScootersLiveActivityTappedButtonName5;
        ScootersAnalytics$ScootersLiveActivityTappedButtonName scootersAnalytics$ScootersLiveActivityTappedButtonName6 = new ScootersAnalytics$ScootersLiveActivityTappedButtonName("ScootersRouteNavigation", 5, "scooters_route_navigation");
        ScootersRouteNavigation = scootersAnalytics$ScootersLiveActivityTappedButtonName6;
        ScootersAnalytics$ScootersLiveActivityTappedButtonName[] scootersAnalytics$ScootersLiveActivityTappedButtonNameArr = {scootersAnalytics$ScootersLiveActivityTappedButtonName, scootersAnalytics$ScootersLiveActivityTappedButtonName2, scootersAnalytics$ScootersLiveActivityTappedButtonName3, scootersAnalytics$ScootersLiveActivityTappedButtonName4, scootersAnalytics$ScootersLiveActivityTappedButtonName5, scootersAnalytics$ScootersLiveActivityTappedButtonName6};
        $VALUES = scootersAnalytics$ScootersLiveActivityTappedButtonNameArr;
        $ENTRIES = a.a(scootersAnalytics$ScootersLiveActivityTappedButtonNameArr);
    }

    public ScootersAnalytics$ScootersLiveActivityTappedButtonName(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static ScootersAnalytics$ScootersLiveActivityTappedButtonName valueOf(String str) {
        return (ScootersAnalytics$ScootersLiveActivityTappedButtonName) Enum.valueOf(ScootersAnalytics$ScootersLiveActivityTappedButtonName.class, str);
    }

    public static ScootersAnalytics$ScootersLiveActivityTappedButtonName[] values() {
        return (ScootersAnalytics$ScootersLiveActivityTappedButtonName[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
