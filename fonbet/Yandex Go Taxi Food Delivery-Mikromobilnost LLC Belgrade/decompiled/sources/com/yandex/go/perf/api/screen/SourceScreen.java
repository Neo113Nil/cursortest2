package com.yandex.go.perf.api.screen;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/yandex/go/perf/api/screen/SourceScreen;", "", "", "analyticsName", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "SUPERAPP_MAIN", "MAIN", "TAXI_MAIN", "MULTIORDER", "SELECT_DESTINATION_POINT", "SUPERAPP_SUGGEST", "ROUTE_SELECTOR", "UNKNOWN", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SourceScreen {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SourceScreen[] $VALUES;
    public static final SourceScreen MAIN;
    public static final SourceScreen MULTIORDER;
    public static final SourceScreen ROUTE_SELECTOR;
    public static final SourceScreen SELECT_DESTINATION_POINT;
    public static final SourceScreen SUPERAPP_MAIN;
    public static final SourceScreen SUPERAPP_SUGGEST;
    public static final SourceScreen TAXI_MAIN;
    public static final SourceScreen UNKNOWN;
    private final String analyticsName;

    static {
        SourceScreen sourceScreen = new SourceScreen("SUPERAPP_MAIN", 0, "SuperappMain");
        SUPERAPP_MAIN = sourceScreen;
        SourceScreen sourceScreen2 = new SourceScreen("MAIN", 1, "Main");
        MAIN = sourceScreen2;
        SourceScreen sourceScreen3 = new SourceScreen("TAXI_MAIN", 2, "TaxiMain");
        TAXI_MAIN = sourceScreen3;
        SourceScreen sourceScreen4 = new SourceScreen("MULTIORDER", 3, "Multiorder");
        MULTIORDER = sourceScreen4;
        SourceScreen sourceScreen5 = new SourceScreen("SELECT_DESTINATION_POINT", 4, "SelectDestinationPoint");
        SELECT_DESTINATION_POINT = sourceScreen5;
        SourceScreen sourceScreen6 = new SourceScreen("SUPERAPP_SUGGEST", 5, "SuperappSuggest");
        SUPERAPP_SUGGEST = sourceScreen6;
        SourceScreen sourceScreen7 = new SourceScreen("ROUTE_SELECTOR", 6, "RouteSelector");
        ROUTE_SELECTOR = sourceScreen7;
        SourceScreen sourceScreen8 = new SourceScreen("UNKNOWN", 7, "Unknown");
        UNKNOWN = sourceScreen8;
        SourceScreen[] sourceScreenArr = {sourceScreen, sourceScreen2, sourceScreen3, sourceScreen4, sourceScreen5, sourceScreen6, sourceScreen7, sourceScreen8};
        $VALUES = sourceScreenArr;
        $ENTRIES = a.a(sourceScreenArr);
    }

    public SourceScreen(String str, int i, String str2) {
        this.analyticsName = str2;
    }

    public static SourceScreen valueOf(String str) {
        return (SourceScreen) Enum.valueOf(SourceScreen.class, str);
    }

    public static SourceScreen[] values() {
        return (SourceScreen[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getAnalyticsName() {
        return this.analyticsName;
    }
}
