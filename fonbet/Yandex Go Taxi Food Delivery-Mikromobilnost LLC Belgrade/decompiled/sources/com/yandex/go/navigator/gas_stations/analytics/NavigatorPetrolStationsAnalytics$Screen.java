package com.yandex.go.navigator.gas_stations.analytics;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"com/yandex/go/navigator/gas_stations/analytics/NavigatorPetrolStationsAnalytics$Screen", "", "Lcom/yandex/go/navigator/gas_stations/analytics/NavigatorPetrolStationsAnalytics$Screen;", "", "eventValue", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Main", "Summary", "Driving", "Parking", "PlaceReport", "PetrolStations", "LongTap", "BuildingCard", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class NavigatorPetrolStationsAnalytics$Screen {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ NavigatorPetrolStationsAnalytics$Screen[] $VALUES;
    public static final NavigatorPetrolStationsAnalytics$Screen BuildingCard;
    public static final NavigatorPetrolStationsAnalytics$Screen Driving;
    public static final NavigatorPetrolStationsAnalytics$Screen LongTap;
    public static final NavigatorPetrolStationsAnalytics$Screen Main;
    public static final NavigatorPetrolStationsAnalytics$Screen Parking;
    public static final NavigatorPetrolStationsAnalytics$Screen PetrolStations;
    public static final NavigatorPetrolStationsAnalytics$Screen PlaceReport;
    public static final NavigatorPetrolStationsAnalytics$Screen Summary;
    private final String eventValue;

    static {
        NavigatorPetrolStationsAnalytics$Screen navigatorPetrolStationsAnalytics$Screen = new NavigatorPetrolStationsAnalytics$Screen("Main", 0, "main");
        Main = navigatorPetrolStationsAnalytics$Screen;
        NavigatorPetrolStationsAnalytics$Screen navigatorPetrolStationsAnalytics$Screen2 = new NavigatorPetrolStationsAnalytics$Screen("Summary", 1, "summary");
        Summary = navigatorPetrolStationsAnalytics$Screen2;
        NavigatorPetrolStationsAnalytics$Screen navigatorPetrolStationsAnalytics$Screen3 = new NavigatorPetrolStationsAnalytics$Screen("Driving", 2, "driving");
        Driving = navigatorPetrolStationsAnalytics$Screen3;
        NavigatorPetrolStationsAnalytics$Screen navigatorPetrolStationsAnalytics$Screen4 = new NavigatorPetrolStationsAnalytics$Screen("Parking", 3, "parking");
        Parking = navigatorPetrolStationsAnalytics$Screen4;
        NavigatorPetrolStationsAnalytics$Screen navigatorPetrolStationsAnalytics$Screen5 = new NavigatorPetrolStationsAnalytics$Screen("PlaceReport", 4, "place_report");
        PlaceReport = navigatorPetrolStationsAnalytics$Screen5;
        NavigatorPetrolStationsAnalytics$Screen navigatorPetrolStationsAnalytics$Screen6 = new NavigatorPetrolStationsAnalytics$Screen("PetrolStations", 5, "petrol_stations");
        PetrolStations = navigatorPetrolStationsAnalytics$Screen6;
        NavigatorPetrolStationsAnalytics$Screen navigatorPetrolStationsAnalytics$Screen7 = new NavigatorPetrolStationsAnalytics$Screen("LongTap", 6, "long_tap");
        LongTap = navigatorPetrolStationsAnalytics$Screen7;
        NavigatorPetrolStationsAnalytics$Screen navigatorPetrolStationsAnalytics$Screen8 = new NavigatorPetrolStationsAnalytics$Screen("BuildingCard", 7, "building_card");
        BuildingCard = navigatorPetrolStationsAnalytics$Screen8;
        NavigatorPetrolStationsAnalytics$Screen[] navigatorPetrolStationsAnalytics$ScreenArr = {navigatorPetrolStationsAnalytics$Screen, navigatorPetrolStationsAnalytics$Screen2, navigatorPetrolStationsAnalytics$Screen3, navigatorPetrolStationsAnalytics$Screen4, navigatorPetrolStationsAnalytics$Screen5, navigatorPetrolStationsAnalytics$Screen6, navigatorPetrolStationsAnalytics$Screen7, navigatorPetrolStationsAnalytics$Screen8};
        $VALUES = navigatorPetrolStationsAnalytics$ScreenArr;
        $ENTRIES = kotlin.enums.a.a(navigatorPetrolStationsAnalytics$ScreenArr);
    }

    public NavigatorPetrolStationsAnalytics$Screen(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static k4o a() {
        return $ENTRIES;
    }

    public static NavigatorPetrolStationsAnalytics$Screen valueOf(String str) {
        return (NavigatorPetrolStationsAnalytics$Screen) Enum.valueOf(NavigatorPetrolStationsAnalytics$Screen.class, str);
    }

    public static NavigatorPetrolStationsAnalytics$Screen[] values() {
        return (NavigatorPetrolStationsAnalytics$Screen[]) $VALUES.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
