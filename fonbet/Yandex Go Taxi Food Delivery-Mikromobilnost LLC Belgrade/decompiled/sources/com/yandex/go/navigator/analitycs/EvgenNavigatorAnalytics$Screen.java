package com.yandex.go.navigator.analitycs;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"com/yandex/go/navigator/analitycs/EvgenNavigatorAnalytics$Screen", "", "Lcom/yandex/go/navigator/analitycs/EvgenNavigatorAnalytics$Screen;", "", "eventValue", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Main", "Summary", "Driving", "Parking", "PlaceReport", "PetrolStations", "LongTap", "BuildingCard", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class EvgenNavigatorAnalytics$Screen {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ EvgenNavigatorAnalytics$Screen[] $VALUES;
    public static final EvgenNavigatorAnalytics$Screen BuildingCard;
    public static final EvgenNavigatorAnalytics$Screen Driving;
    public static final EvgenNavigatorAnalytics$Screen LongTap;
    public static final EvgenNavigatorAnalytics$Screen Main;
    public static final EvgenNavigatorAnalytics$Screen Parking;
    public static final EvgenNavigatorAnalytics$Screen PetrolStations;
    public static final EvgenNavigatorAnalytics$Screen PlaceReport;
    public static final EvgenNavigatorAnalytics$Screen Summary;
    private final String eventValue;

    static {
        EvgenNavigatorAnalytics$Screen evgenNavigatorAnalytics$Screen = new EvgenNavigatorAnalytics$Screen("Main", 0, "main");
        Main = evgenNavigatorAnalytics$Screen;
        EvgenNavigatorAnalytics$Screen evgenNavigatorAnalytics$Screen2 = new EvgenNavigatorAnalytics$Screen("Summary", 1, "summary");
        Summary = evgenNavigatorAnalytics$Screen2;
        EvgenNavigatorAnalytics$Screen evgenNavigatorAnalytics$Screen3 = new EvgenNavigatorAnalytics$Screen("Driving", 2, "driving");
        Driving = evgenNavigatorAnalytics$Screen3;
        EvgenNavigatorAnalytics$Screen evgenNavigatorAnalytics$Screen4 = new EvgenNavigatorAnalytics$Screen("Parking", 3, "parking");
        Parking = evgenNavigatorAnalytics$Screen4;
        EvgenNavigatorAnalytics$Screen evgenNavigatorAnalytics$Screen5 = new EvgenNavigatorAnalytics$Screen("PlaceReport", 4, "place_report");
        PlaceReport = evgenNavigatorAnalytics$Screen5;
        EvgenNavigatorAnalytics$Screen evgenNavigatorAnalytics$Screen6 = new EvgenNavigatorAnalytics$Screen("PetrolStations", 5, "petrol_stations");
        PetrolStations = evgenNavigatorAnalytics$Screen6;
        EvgenNavigatorAnalytics$Screen evgenNavigatorAnalytics$Screen7 = new EvgenNavigatorAnalytics$Screen("LongTap", 6, "long_tap");
        LongTap = evgenNavigatorAnalytics$Screen7;
        EvgenNavigatorAnalytics$Screen evgenNavigatorAnalytics$Screen8 = new EvgenNavigatorAnalytics$Screen("BuildingCard", 7, "building_card");
        BuildingCard = evgenNavigatorAnalytics$Screen8;
        EvgenNavigatorAnalytics$Screen[] evgenNavigatorAnalytics$ScreenArr = {evgenNavigatorAnalytics$Screen, evgenNavigatorAnalytics$Screen2, evgenNavigatorAnalytics$Screen3, evgenNavigatorAnalytics$Screen4, evgenNavigatorAnalytics$Screen5, evgenNavigatorAnalytics$Screen6, evgenNavigatorAnalytics$Screen7, evgenNavigatorAnalytics$Screen8};
        $VALUES = evgenNavigatorAnalytics$ScreenArr;
        $ENTRIES = kotlin.enums.a.a(evgenNavigatorAnalytics$ScreenArr);
    }

    public EvgenNavigatorAnalytics$Screen(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static k4o a() {
        return $ENTRIES;
    }

    public static EvgenNavigatorAnalytics$Screen valueOf(String str) {
        return (EvgenNavigatorAnalytics$Screen) Enum.valueOf(EvgenNavigatorAnalytics$Screen.class, str);
    }

    public static EvgenNavigatorAnalytics$Screen[] values() {
        return (EvgenNavigatorAnalytics$Screen[]) $VALUES.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
