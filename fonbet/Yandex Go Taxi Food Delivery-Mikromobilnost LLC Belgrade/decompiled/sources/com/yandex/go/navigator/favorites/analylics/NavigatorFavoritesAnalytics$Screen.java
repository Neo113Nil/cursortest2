package com.yandex.go.navigator.favorites.analylics;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"com/yandex/go/navigator/favorites/analylics/NavigatorFavoritesAnalytics$Screen", "", "Lcom/yandex/go/navigator/favorites/analylics/NavigatorFavoritesAnalytics$Screen;", "", "eventValue", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Main", "Summary", "Driving", "Parking", "PlaceReport", "PetrolStations", "LongTap", "BuildingCard", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class NavigatorFavoritesAnalytics$Screen {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ NavigatorFavoritesAnalytics$Screen[] $VALUES;
    public static final NavigatorFavoritesAnalytics$Screen BuildingCard;
    public static final NavigatorFavoritesAnalytics$Screen Driving;
    public static final NavigatorFavoritesAnalytics$Screen LongTap;
    public static final NavigatorFavoritesAnalytics$Screen Main;
    public static final NavigatorFavoritesAnalytics$Screen Parking;
    public static final NavigatorFavoritesAnalytics$Screen PetrolStations;
    public static final NavigatorFavoritesAnalytics$Screen PlaceReport;
    public static final NavigatorFavoritesAnalytics$Screen Summary;
    private final String eventValue;

    static {
        NavigatorFavoritesAnalytics$Screen navigatorFavoritesAnalytics$Screen = new NavigatorFavoritesAnalytics$Screen("Main", 0, "main");
        Main = navigatorFavoritesAnalytics$Screen;
        NavigatorFavoritesAnalytics$Screen navigatorFavoritesAnalytics$Screen2 = new NavigatorFavoritesAnalytics$Screen("Summary", 1, "summary");
        Summary = navigatorFavoritesAnalytics$Screen2;
        NavigatorFavoritesAnalytics$Screen navigatorFavoritesAnalytics$Screen3 = new NavigatorFavoritesAnalytics$Screen("Driving", 2, "driving");
        Driving = navigatorFavoritesAnalytics$Screen3;
        NavigatorFavoritesAnalytics$Screen navigatorFavoritesAnalytics$Screen4 = new NavigatorFavoritesAnalytics$Screen("Parking", 3, "parking");
        Parking = navigatorFavoritesAnalytics$Screen4;
        NavigatorFavoritesAnalytics$Screen navigatorFavoritesAnalytics$Screen5 = new NavigatorFavoritesAnalytics$Screen("PlaceReport", 4, "place_report");
        PlaceReport = navigatorFavoritesAnalytics$Screen5;
        NavigatorFavoritesAnalytics$Screen navigatorFavoritesAnalytics$Screen6 = new NavigatorFavoritesAnalytics$Screen("PetrolStations", 5, "petrol_stations");
        PetrolStations = navigatorFavoritesAnalytics$Screen6;
        NavigatorFavoritesAnalytics$Screen navigatorFavoritesAnalytics$Screen7 = new NavigatorFavoritesAnalytics$Screen("LongTap", 6, "long_tap");
        LongTap = navigatorFavoritesAnalytics$Screen7;
        NavigatorFavoritesAnalytics$Screen navigatorFavoritesAnalytics$Screen8 = new NavigatorFavoritesAnalytics$Screen("BuildingCard", 7, "building_card");
        BuildingCard = navigatorFavoritesAnalytics$Screen8;
        NavigatorFavoritesAnalytics$Screen[] navigatorFavoritesAnalytics$ScreenArr = {navigatorFavoritesAnalytics$Screen, navigatorFavoritesAnalytics$Screen2, navigatorFavoritesAnalytics$Screen3, navigatorFavoritesAnalytics$Screen4, navigatorFavoritesAnalytics$Screen5, navigatorFavoritesAnalytics$Screen6, navigatorFavoritesAnalytics$Screen7, navigatorFavoritesAnalytics$Screen8};
        $VALUES = navigatorFavoritesAnalytics$ScreenArr;
        $ENTRIES = kotlin.enums.a.a(navigatorFavoritesAnalytics$ScreenArr);
    }

    public NavigatorFavoritesAnalytics$Screen(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static k4o a() {
        return $ENTRIES;
    }

    public static NavigatorFavoritesAnalytics$Screen valueOf(String str) {
        return (NavigatorFavoritesAnalytics$Screen) Enum.valueOf(NavigatorFavoritesAnalytics$Screen.class, str);
    }

    public static NavigatorFavoritesAnalytics$Screen[] values() {
        return (NavigatorFavoritesAnalytics$Screen[]) $VALUES.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
