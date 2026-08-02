package com.yandex.go.navigator.map_interactions.parkings.analytics;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"com/yandex/go/navigator/map_interactions/parkings/analytics/NavigatorCarParksAnalytics$Screen", "", "Lcom/yandex/go/navigator/map_interactions/parkings/analytics/NavigatorCarParksAnalytics$Screen;", "", "eventValue", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Main", "Summary", "Driving", "Parking", "PlaceReport", "PetrolStations", "LongTap", "BuildingCard", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class NavigatorCarParksAnalytics$Screen {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ NavigatorCarParksAnalytics$Screen[] $VALUES;
    public static final NavigatorCarParksAnalytics$Screen BuildingCard;
    public static final NavigatorCarParksAnalytics$Screen Driving;
    public static final NavigatorCarParksAnalytics$Screen LongTap;
    public static final NavigatorCarParksAnalytics$Screen Main;
    public static final NavigatorCarParksAnalytics$Screen Parking;
    public static final NavigatorCarParksAnalytics$Screen PetrolStations;
    public static final NavigatorCarParksAnalytics$Screen PlaceReport;
    public static final NavigatorCarParksAnalytics$Screen Summary;
    private final String eventValue;

    static {
        NavigatorCarParksAnalytics$Screen navigatorCarParksAnalytics$Screen = new NavigatorCarParksAnalytics$Screen("Main", 0, "main");
        Main = navigatorCarParksAnalytics$Screen;
        NavigatorCarParksAnalytics$Screen navigatorCarParksAnalytics$Screen2 = new NavigatorCarParksAnalytics$Screen("Summary", 1, "summary");
        Summary = navigatorCarParksAnalytics$Screen2;
        NavigatorCarParksAnalytics$Screen navigatorCarParksAnalytics$Screen3 = new NavigatorCarParksAnalytics$Screen("Driving", 2, "driving");
        Driving = navigatorCarParksAnalytics$Screen3;
        NavigatorCarParksAnalytics$Screen navigatorCarParksAnalytics$Screen4 = new NavigatorCarParksAnalytics$Screen("Parking", 3, "parking");
        Parking = navigatorCarParksAnalytics$Screen4;
        NavigatorCarParksAnalytics$Screen navigatorCarParksAnalytics$Screen5 = new NavigatorCarParksAnalytics$Screen("PlaceReport", 4, "place_report");
        PlaceReport = navigatorCarParksAnalytics$Screen5;
        NavigatorCarParksAnalytics$Screen navigatorCarParksAnalytics$Screen6 = new NavigatorCarParksAnalytics$Screen("PetrolStations", 5, "petrol_stations");
        PetrolStations = navigatorCarParksAnalytics$Screen6;
        NavigatorCarParksAnalytics$Screen navigatorCarParksAnalytics$Screen7 = new NavigatorCarParksAnalytics$Screen("LongTap", 6, "long_tap");
        LongTap = navigatorCarParksAnalytics$Screen7;
        NavigatorCarParksAnalytics$Screen navigatorCarParksAnalytics$Screen8 = new NavigatorCarParksAnalytics$Screen("BuildingCard", 7, "building_card");
        BuildingCard = navigatorCarParksAnalytics$Screen8;
        NavigatorCarParksAnalytics$Screen[] navigatorCarParksAnalytics$ScreenArr = {navigatorCarParksAnalytics$Screen, navigatorCarParksAnalytics$Screen2, navigatorCarParksAnalytics$Screen3, navigatorCarParksAnalytics$Screen4, navigatorCarParksAnalytics$Screen5, navigatorCarParksAnalytics$Screen6, navigatorCarParksAnalytics$Screen7, navigatorCarParksAnalytics$Screen8};
        $VALUES = navigatorCarParksAnalytics$ScreenArr;
        $ENTRIES = kotlin.enums.a.a(navigatorCarParksAnalytics$ScreenArr);
    }

    public NavigatorCarParksAnalytics$Screen(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static k4o a() {
        return $ENTRIES;
    }

    public static NavigatorCarParksAnalytics$Screen valueOf(String str) {
        return (NavigatorCarParksAnalytics$Screen) Enum.valueOf(NavigatorCarParksAnalytics$Screen.class, str);
    }

    public static NavigatorCarParksAnalytics$Screen[] values() {
        return (NavigatorCarParksAnalytics$Screen[]) $VALUES.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
