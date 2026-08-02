package com.yandex.go.navigation.screen.api;

import defpackage.d6z;
import defpackage.k4o;
import defpackage.wbp0;
import java.util.Locale;
import kotlin.Metadata;
import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b,\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-¨\u0006."}, d2 = {"Lcom/yandex/go/navigation/screen/api/Screen;", "", "", "nameForTrackEvent", "Ljava/lang/String;", "ADD_CREDITCARD", JCP.RAW_PREFIX, "MAIN", "TAXI_MAIN", "SUMMARY", "SUMMARY_TRANSPORT", "SUMMARY_DRIVE", "MOBILITY_HUB", "MOBILITY_HUB_TRANSPORT_DETAILS", "WHERE_YOU_ARE", "MULTI_AREA", "ROUTE_SELECTOR", "CHOOSE_B", "BUNDLED_ORDER_LIST", "ORDER", "ORDERS_LIST", "ORDER_DETAILS", "ORDER_TRACKING", "ORDER_INTERMEDIATE_POINTS", "MAIN_V4", "FAVORITES", "SCOOTERS", "SCOOTERS_DISCOVERY", "CHARGERS_DISCOVERY", "DRIVE_DISCOVERY", "INTERCITY_DASHBOARD", "TRANSPORT_MAIN", "RIDA_BIDS", "WALLET", "ROUTE_STOPS_V2", "DISCOVERY_MAP", "NDD_CHOOSE_PVZ", "DELIVERY_ROUTE", "DELIVERY_DISCOVERY", "NAVIGATOR", "ORGANISATIONS_MAP", "FEATURE_STUB", "SUPERAPP_SUGGEST", "ADDRESS_CONFIRMATION", "AFTER_SUMMARY_CLARIFY_POINT", "UNSUPPORTED", "go-client-android.features.navigation.screen:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class Screen {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Screen[] $VALUES;
    public static final Screen ADDRESS_CONFIRMATION;
    public static final Screen ADD_CREDITCARD;
    public static final Screen AFTER_SUMMARY_CLARIFY_POINT;
    public static final Screen BUNDLED_ORDER_LIST;
    public static final Screen CHARGERS_DISCOVERY;
    public static final Screen CHOOSE_B;
    public static final Screen DELIVERY_DISCOVERY;
    public static final Screen DELIVERY_ROUTE;
    public static final Screen DISCOVERY_MAP;
    public static final Screen DRIVE_DISCOVERY;
    public static final Screen FAVORITES;
    public static final Screen FEATURE_STUB;
    public static final Screen INTERCITY_DASHBOARD;
    public static final Screen MAIN;
    public static final Screen MAIN_V4;
    public static final Screen MOBILITY_HUB;
    public static final Screen MOBILITY_HUB_TRANSPORT_DETAILS;
    public static final Screen MULTI_AREA;
    public static final Screen NAVIGATOR;
    public static final Screen NDD_CHOOSE_PVZ;
    public static final Screen NONE;
    public static final Screen ORDER;
    public static final Screen ORDERS_LIST;
    public static final Screen ORDER_DETAILS;
    public static final Screen ORDER_INTERMEDIATE_POINTS;
    public static final Screen ORDER_TRACKING;
    public static final Screen ORGANISATIONS_MAP;
    public static final Screen RIDA_BIDS;
    public static final Screen ROUTE_SELECTOR;
    public static final Screen ROUTE_STOPS_V2;
    public static final Screen SCOOTERS;
    public static final Screen SCOOTERS_DISCOVERY;
    public static final Screen SUMMARY;
    public static final Screen SUMMARY_DRIVE;
    public static final Screen SUMMARY_TRANSPORT;
    public static final Screen SUPERAPP_SUGGEST;
    public static final Screen TAXI_MAIN;
    public static final Screen TRANSPORT_MAIN;
    public static final Screen UNSUPPORTED;
    public static final Screen WALLET;
    public static final Screen WHERE_YOU_ARE;
    private final String nameForTrackEvent = d6z.j(toString().toLowerCase(Locale.ROOT));

    static {
        Screen screen = new Screen("ADD_CREDITCARD", 0);
        ADD_CREDITCARD = screen;
        Screen screen2 = new Screen(JCP.RAW_PREFIX, 1);
        NONE = screen2;
        Screen screen3 = new Screen("MAIN", 2);
        MAIN = screen3;
        Screen screen4 = new Screen("TAXI_MAIN", 3);
        TAXI_MAIN = screen4;
        Screen screen5 = new Screen("SUMMARY", 4);
        SUMMARY = screen5;
        Screen screen6 = new Screen("SUMMARY_TRANSPORT", 5);
        SUMMARY_TRANSPORT = screen6;
        Screen screen7 = new Screen("SUMMARY_DRIVE", 6);
        SUMMARY_DRIVE = screen7;
        Screen screen8 = new Screen("MOBILITY_HUB", 7);
        MOBILITY_HUB = screen8;
        Screen screen9 = new Screen("MOBILITY_HUB_TRANSPORT_DETAILS", 8);
        MOBILITY_HUB_TRANSPORT_DETAILS = screen9;
        Screen screen10 = new Screen("WHERE_YOU_ARE", 9);
        WHERE_YOU_ARE = screen10;
        Screen screen11 = new Screen("MULTI_AREA", 10);
        MULTI_AREA = screen11;
        Screen screen12 = new Screen("ROUTE_SELECTOR", 11);
        ROUTE_SELECTOR = screen12;
        Screen screen13 = new Screen("CHOOSE_B", 12);
        CHOOSE_B = screen13;
        Screen screen14 = new Screen("BUNDLED_ORDER_LIST", 13);
        BUNDLED_ORDER_LIST = screen14;
        Screen screen15 = new Screen("ORDER", 14);
        ORDER = screen15;
        Screen screen16 = new Screen("ORDERS_LIST", 15);
        ORDERS_LIST = screen16;
        Screen screen17 = new Screen("ORDER_DETAILS", 16);
        ORDER_DETAILS = screen17;
        Screen screen18 = new Screen("ORDER_TRACKING", 17);
        ORDER_TRACKING = screen18;
        Screen screen19 = new Screen("ORDER_INTERMEDIATE_POINTS", 18);
        ORDER_INTERMEDIATE_POINTS = screen19;
        Screen screen20 = new Screen("MAIN_V4", 19);
        MAIN_V4 = screen20;
        Screen screen21 = new Screen("FAVORITES", 20);
        FAVORITES = screen21;
        Screen screen22 = new Screen("SCOOTERS", 21);
        SCOOTERS = screen22;
        Screen screen23 = new Screen("SCOOTERS_DISCOVERY", 22);
        SCOOTERS_DISCOVERY = screen23;
        Screen screen24 = new Screen("CHARGERS_DISCOVERY", 23);
        CHARGERS_DISCOVERY = screen24;
        Screen screen25 = new Screen("DRIVE_DISCOVERY", 24);
        DRIVE_DISCOVERY = screen25;
        Screen screen26 = new Screen("INTERCITY_DASHBOARD", 25);
        INTERCITY_DASHBOARD = screen26;
        Screen screen27 = new Screen("TRANSPORT_MAIN", 26);
        TRANSPORT_MAIN = screen27;
        Screen screen28 = new Screen("RIDA_BIDS", 27);
        RIDA_BIDS = screen28;
        Screen screen29 = new Screen("WALLET", 28);
        WALLET = screen29;
        Screen screen30 = new Screen("ROUTE_STOPS_V2", 29);
        ROUTE_STOPS_V2 = screen30;
        Screen screen31 = new Screen("DISCOVERY_MAP", 30);
        DISCOVERY_MAP = screen31;
        Screen screen32 = new Screen("NDD_CHOOSE_PVZ", 31);
        NDD_CHOOSE_PVZ = screen32;
        Screen screen33 = new Screen("DELIVERY_ROUTE", 32);
        DELIVERY_ROUTE = screen33;
        Screen screen34 = new Screen("DELIVERY_DISCOVERY", 33);
        DELIVERY_DISCOVERY = screen34;
        Screen screen35 = new Screen("NAVIGATOR", 34);
        NAVIGATOR = screen35;
        Screen screen36 = new Screen("ORGANISATIONS_MAP", 35);
        ORGANISATIONS_MAP = screen36;
        Screen screen37 = new Screen("FEATURE_STUB", 36);
        FEATURE_STUB = screen37;
        Screen screen38 = new Screen("SUPERAPP_SUGGEST", 37);
        SUPERAPP_SUGGEST = screen38;
        Screen screen39 = new Screen("ADDRESS_CONFIRMATION", 38);
        ADDRESS_CONFIRMATION = screen39;
        Screen screen40 = new Screen("AFTER_SUMMARY_CLARIFY_POINT", 39);
        AFTER_SUMMARY_CLARIFY_POINT = screen40;
        Screen screen41 = new Screen("UNSUPPORTED", 40);
        UNSUPPORTED = screen41;
        Screen[] screenArr = {screen, screen2, screen3, screen4, screen5, screen6, screen7, screen8, screen9, screen10, screen11, screen12, screen13, screen14, screen15, screen16, screen17, screen18, screen19, screen20, screen21, screen22, screen23, screen24, screen25, screen26, screen27, screen28, screen29, screen30, screen31, screen32, screen33, screen34, screen35, screen36, screen37, screen38, screen39, screen40, screen41};
        $VALUES = screenArr;
        $ENTRIES = kotlin.enums.a.a(screenArr);
    }

    public Screen(String str, int i) {
    }

    public static k4o a() {
        return $ENTRIES;
    }

    public static Screen valueOf(String str) {
        return (Screen) Enum.valueOf(Screen.class, str);
    }

    public static Screen[] values() {
        return (Screen[]) $VALUES.clone();
    }

    public final String b() {
        return wbp0.a[ordinal()] == 1 ? "order_feed_details" : this.nameForTrackEvent;
    }
}
