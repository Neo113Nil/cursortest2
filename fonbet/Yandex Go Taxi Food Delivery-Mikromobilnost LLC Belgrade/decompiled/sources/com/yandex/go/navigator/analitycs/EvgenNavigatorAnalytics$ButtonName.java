package com.yandex.go.navigator.analitycs;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"com/yandex/go/navigator/analitycs/EvgenNavigatorAnalytics$ButtonName", "", "Lcom/yandex/go/navigator/analitycs/EvgenNavigatorAnalytics$ButtonName;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "MyLocation", "Overview", "Compass", "Title", "ZoomIn", "ZoomOut", "PlaceReport", "Search", "Back", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class EvgenNavigatorAnalytics$ButtonName {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ EvgenNavigatorAnalytics$ButtonName[] $VALUES;
    public static final EvgenNavigatorAnalytics$ButtonName Back;
    public static final EvgenNavigatorAnalytics$ButtonName Compass;
    public static final EvgenNavigatorAnalytics$ButtonName MyLocation;
    public static final EvgenNavigatorAnalytics$ButtonName Overview;
    public static final EvgenNavigatorAnalytics$ButtonName PlaceReport;
    public static final EvgenNavigatorAnalytics$ButtonName Search;
    public static final EvgenNavigatorAnalytics$ButtonName Title;
    public static final EvgenNavigatorAnalytics$ButtonName ZoomIn;
    public static final EvgenNavigatorAnalytics$ButtonName ZoomOut;
    private final String eventValue;

    static {
        EvgenNavigatorAnalytics$ButtonName evgenNavigatorAnalytics$ButtonName = new EvgenNavigatorAnalytics$ButtonName("MyLocation", 0, "my_location");
        MyLocation = evgenNavigatorAnalytics$ButtonName;
        EvgenNavigatorAnalytics$ButtonName evgenNavigatorAnalytics$ButtonName2 = new EvgenNavigatorAnalytics$ButtonName("Overview", 1, "overview");
        Overview = evgenNavigatorAnalytics$ButtonName2;
        EvgenNavigatorAnalytics$ButtonName evgenNavigatorAnalytics$ButtonName3 = new EvgenNavigatorAnalytics$ButtonName("Compass", 2, "compass");
        Compass = evgenNavigatorAnalytics$ButtonName3;
        EvgenNavigatorAnalytics$ButtonName evgenNavigatorAnalytics$ButtonName4 = new EvgenNavigatorAnalytics$ButtonName("Title", 3, "title");
        Title = evgenNavigatorAnalytics$ButtonName4;
        EvgenNavigatorAnalytics$ButtonName evgenNavigatorAnalytics$ButtonName5 = new EvgenNavigatorAnalytics$ButtonName("ZoomIn", 4, "zoom_in");
        ZoomIn = evgenNavigatorAnalytics$ButtonName5;
        EvgenNavigatorAnalytics$ButtonName evgenNavigatorAnalytics$ButtonName6 = new EvgenNavigatorAnalytics$ButtonName("ZoomOut", 5, "zoom_out");
        ZoomOut = evgenNavigatorAnalytics$ButtonName6;
        EvgenNavigatorAnalytics$ButtonName evgenNavigatorAnalytics$ButtonName7 = new EvgenNavigatorAnalytics$ButtonName("PlaceReport", 6, "place_report");
        PlaceReport = evgenNavigatorAnalytics$ButtonName7;
        EvgenNavigatorAnalytics$ButtonName evgenNavigatorAnalytics$ButtonName8 = new EvgenNavigatorAnalytics$ButtonName("Search", 7, "search");
        Search = evgenNavigatorAnalytics$ButtonName8;
        EvgenNavigatorAnalytics$ButtonName evgenNavigatorAnalytics$ButtonName9 = new EvgenNavigatorAnalytics$ButtonName("Back", 8, "back");
        Back = evgenNavigatorAnalytics$ButtonName9;
        EvgenNavigatorAnalytics$ButtonName[] evgenNavigatorAnalytics$ButtonNameArr = {evgenNavigatorAnalytics$ButtonName, evgenNavigatorAnalytics$ButtonName2, evgenNavigatorAnalytics$ButtonName3, evgenNavigatorAnalytics$ButtonName4, evgenNavigatorAnalytics$ButtonName5, evgenNavigatorAnalytics$ButtonName6, evgenNavigatorAnalytics$ButtonName7, evgenNavigatorAnalytics$ButtonName8, evgenNavigatorAnalytics$ButtonName9};
        $VALUES = evgenNavigatorAnalytics$ButtonNameArr;
        $ENTRIES = kotlin.enums.a.a(evgenNavigatorAnalytics$ButtonNameArr);
    }

    public EvgenNavigatorAnalytics$ButtonName(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static EvgenNavigatorAnalytics$ButtonName valueOf(String str) {
        return (EvgenNavigatorAnalytics$ButtonName) Enum.valueOf(EvgenNavigatorAnalytics$ButtonName.class, str);
    }

    public static EvgenNavigatorAnalytics$ButtonName[] values() {
        return (EvgenNavigatorAnalytics$ButtonName[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
