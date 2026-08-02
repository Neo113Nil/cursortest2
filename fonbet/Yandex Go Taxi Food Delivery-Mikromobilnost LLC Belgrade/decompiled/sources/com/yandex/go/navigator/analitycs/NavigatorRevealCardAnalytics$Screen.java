package com.yandex.go.navigator.analitycs;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"com/yandex/go/navigator/analitycs/NavigatorRevealCardAnalytics$Screen", "", "Lcom/yandex/go/navigator/analitycs/NavigatorRevealCardAnalytics$Screen;", "", "eventValue", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Main", "Summary", "Driving", "Parking", "PlaceReport", "PetrolStations", "LongTap", "BuildingCard", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class NavigatorRevealCardAnalytics$Screen {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ NavigatorRevealCardAnalytics$Screen[] $VALUES;
    public static final NavigatorRevealCardAnalytics$Screen BuildingCard;
    public static final NavigatorRevealCardAnalytics$Screen Driving;
    public static final NavigatorRevealCardAnalytics$Screen LongTap;
    public static final NavigatorRevealCardAnalytics$Screen Main;
    public static final NavigatorRevealCardAnalytics$Screen Parking;
    public static final NavigatorRevealCardAnalytics$Screen PetrolStations;
    public static final NavigatorRevealCardAnalytics$Screen PlaceReport;
    public static final NavigatorRevealCardAnalytics$Screen Summary;
    private final String eventValue;

    static {
        NavigatorRevealCardAnalytics$Screen navigatorRevealCardAnalytics$Screen = new NavigatorRevealCardAnalytics$Screen("Main", 0, "main");
        Main = navigatorRevealCardAnalytics$Screen;
        NavigatorRevealCardAnalytics$Screen navigatorRevealCardAnalytics$Screen2 = new NavigatorRevealCardAnalytics$Screen("Summary", 1, "summary");
        Summary = navigatorRevealCardAnalytics$Screen2;
        NavigatorRevealCardAnalytics$Screen navigatorRevealCardAnalytics$Screen3 = new NavigatorRevealCardAnalytics$Screen("Driving", 2, "driving");
        Driving = navigatorRevealCardAnalytics$Screen3;
        NavigatorRevealCardAnalytics$Screen navigatorRevealCardAnalytics$Screen4 = new NavigatorRevealCardAnalytics$Screen("Parking", 3, "parking");
        Parking = navigatorRevealCardAnalytics$Screen4;
        NavigatorRevealCardAnalytics$Screen navigatorRevealCardAnalytics$Screen5 = new NavigatorRevealCardAnalytics$Screen("PlaceReport", 4, "place_report");
        PlaceReport = navigatorRevealCardAnalytics$Screen5;
        NavigatorRevealCardAnalytics$Screen navigatorRevealCardAnalytics$Screen6 = new NavigatorRevealCardAnalytics$Screen("PetrolStations", 5, "petrol_stations");
        PetrolStations = navigatorRevealCardAnalytics$Screen6;
        NavigatorRevealCardAnalytics$Screen navigatorRevealCardAnalytics$Screen7 = new NavigatorRevealCardAnalytics$Screen("LongTap", 6, "long_tap");
        LongTap = navigatorRevealCardAnalytics$Screen7;
        NavigatorRevealCardAnalytics$Screen navigatorRevealCardAnalytics$Screen8 = new NavigatorRevealCardAnalytics$Screen("BuildingCard", 7, "building_card");
        BuildingCard = navigatorRevealCardAnalytics$Screen8;
        NavigatorRevealCardAnalytics$Screen[] navigatorRevealCardAnalytics$ScreenArr = {navigatorRevealCardAnalytics$Screen, navigatorRevealCardAnalytics$Screen2, navigatorRevealCardAnalytics$Screen3, navigatorRevealCardAnalytics$Screen4, navigatorRevealCardAnalytics$Screen5, navigatorRevealCardAnalytics$Screen6, navigatorRevealCardAnalytics$Screen7, navigatorRevealCardAnalytics$Screen8};
        $VALUES = navigatorRevealCardAnalytics$ScreenArr;
        $ENTRIES = kotlin.enums.a.a(navigatorRevealCardAnalytics$ScreenArr);
    }

    public NavigatorRevealCardAnalytics$Screen(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static k4o a() {
        return $ENTRIES;
    }

    public static NavigatorRevealCardAnalytics$Screen valueOf(String str) {
        return (NavigatorRevealCardAnalytics$Screen) Enum.valueOf(NavigatorRevealCardAnalytics$Screen.class, str);
    }

    public static NavigatorRevealCardAnalytics$Screen[] values() {
        return (NavigatorRevealCardAnalytics$Screen[]) $VALUES.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
