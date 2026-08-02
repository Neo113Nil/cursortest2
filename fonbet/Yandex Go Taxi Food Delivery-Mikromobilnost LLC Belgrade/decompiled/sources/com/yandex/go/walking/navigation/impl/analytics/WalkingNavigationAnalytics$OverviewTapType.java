package com.yandex.go.walking.navigation.impl.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"com/yandex/go/walking/navigation/impl/analytics/WalkingNavigationAnalytics$OverviewTapType", "", "Lcom/yandex/go/walking/navigation/impl/analytics/WalkingNavigationAnalytics$OverviewTapType;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Back", "FocusLocation", "FocusRoute", "StartNavigation", "TapOnAltRoute", "TapOnMap", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class WalkingNavigationAnalytics$OverviewTapType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ WalkingNavigationAnalytics$OverviewTapType[] $VALUES;
    public static final WalkingNavigationAnalytics$OverviewTapType Back;
    public static final WalkingNavigationAnalytics$OverviewTapType FocusLocation;
    public static final WalkingNavigationAnalytics$OverviewTapType FocusRoute;
    public static final WalkingNavigationAnalytics$OverviewTapType StartNavigation;
    public static final WalkingNavigationAnalytics$OverviewTapType TapOnAltRoute;
    public static final WalkingNavigationAnalytics$OverviewTapType TapOnMap;
    private final String eventValue;

    static {
        WalkingNavigationAnalytics$OverviewTapType walkingNavigationAnalytics$OverviewTapType = new WalkingNavigationAnalytics$OverviewTapType("Back", 0, "back");
        Back = walkingNavigationAnalytics$OverviewTapType;
        WalkingNavigationAnalytics$OverviewTapType walkingNavigationAnalytics$OverviewTapType2 = new WalkingNavigationAnalytics$OverviewTapType("FocusLocation", 1, "focus_location");
        FocusLocation = walkingNavigationAnalytics$OverviewTapType2;
        WalkingNavigationAnalytics$OverviewTapType walkingNavigationAnalytics$OverviewTapType3 = new WalkingNavigationAnalytics$OverviewTapType("FocusRoute", 2, "focus_route");
        FocusRoute = walkingNavigationAnalytics$OverviewTapType3;
        WalkingNavigationAnalytics$OverviewTapType walkingNavigationAnalytics$OverviewTapType4 = new WalkingNavigationAnalytics$OverviewTapType("StartNavigation", 3, "start_navigation");
        StartNavigation = walkingNavigationAnalytics$OverviewTapType4;
        WalkingNavigationAnalytics$OverviewTapType walkingNavigationAnalytics$OverviewTapType5 = new WalkingNavigationAnalytics$OverviewTapType("TapOnAltRoute", 4, "tap_on_alt_route");
        TapOnAltRoute = walkingNavigationAnalytics$OverviewTapType5;
        WalkingNavigationAnalytics$OverviewTapType walkingNavigationAnalytics$OverviewTapType6 = new WalkingNavigationAnalytics$OverviewTapType("TapOnMap", 5, "tap_on_map");
        TapOnMap = walkingNavigationAnalytics$OverviewTapType6;
        WalkingNavigationAnalytics$OverviewTapType[] walkingNavigationAnalytics$OverviewTapTypeArr = {walkingNavigationAnalytics$OverviewTapType, walkingNavigationAnalytics$OverviewTapType2, walkingNavigationAnalytics$OverviewTapType3, walkingNavigationAnalytics$OverviewTapType4, walkingNavigationAnalytics$OverviewTapType5, walkingNavigationAnalytics$OverviewTapType6};
        $VALUES = walkingNavigationAnalytics$OverviewTapTypeArr;
        $ENTRIES = a.a(walkingNavigationAnalytics$OverviewTapTypeArr);
    }

    public WalkingNavigationAnalytics$OverviewTapType(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static WalkingNavigationAnalytics$OverviewTapType valueOf(String str) {
        return (WalkingNavigationAnalytics$OverviewTapType) Enum.valueOf(WalkingNavigationAnalytics$OverviewTapType.class, str);
    }

    public static WalkingNavigationAnalytics$OverviewTapType[] values() {
        return (WalkingNavigationAnalytics$OverviewTapType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
