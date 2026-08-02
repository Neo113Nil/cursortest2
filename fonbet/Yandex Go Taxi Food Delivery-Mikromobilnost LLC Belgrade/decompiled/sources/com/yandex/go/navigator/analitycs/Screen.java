package com.yandex.go.navigator.analitycs;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/yandex/go/navigator/analitycs/Screen;", "", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Main", "Summary", "Driving", "Parking", "BuildingCard", "PlaceReport", "PetrolStations", "LongTap", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class Screen {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Screen[] $VALUES;
    public static final Screen BuildingCard;
    public static final Screen Driving;
    public static final Screen LongTap;
    public static final Screen Main;
    public static final Screen Parking;
    public static final Screen PetrolStations;
    public static final Screen PlaceReport;
    public static final Screen Summary;
    private final String eventValue;

    static {
        Screen screen = new Screen("Main", 0, "main");
        Main = screen;
        Screen screen2 = new Screen("Summary", 1, "summary");
        Summary = screen2;
        Screen screen3 = new Screen("Driving", 2, "driving");
        Driving = screen3;
        Screen screen4 = new Screen("Parking", 3, "parking");
        Parking = screen4;
        Screen screen5 = new Screen("BuildingCard", 4, "building_card");
        BuildingCard = screen5;
        Screen screen6 = new Screen("PlaceReport", 5, "place_report");
        PlaceReport = screen6;
        Screen screen7 = new Screen("PetrolStations", 6, "petrol_stations");
        PetrolStations = screen7;
        Screen screen8 = new Screen("LongTap", 7, "long_tap");
        LongTap = screen8;
        Screen[] screenArr = {screen, screen2, screen3, screen4, screen5, screen6, screen7, screen8};
        $VALUES = screenArr;
        $ENTRIES = kotlin.enums.a.a(screenArr);
    }

    public Screen(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static Screen valueOf(String str) {
        return (Screen) Enum.valueOf(Screen.class, str);
    }

    public static Screen[] values() {
        return (Screen[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
