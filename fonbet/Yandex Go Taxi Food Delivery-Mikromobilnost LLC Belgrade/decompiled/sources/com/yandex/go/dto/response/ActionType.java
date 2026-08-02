package com.yandex.go.dto.response;

import defpackage.ar;
import defpackage.dz;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b/\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/¨\u00060"}, d2 = {"Lcom/yandex/go/dto/response/ActionType;", "", "Companion", "dz", "UNSUPPORTED", "REFRESH", "CLOSE", "ROUTE_INPUT", "MT_ROUTE_INPUT", "NAVIGATOR", "SUPERAPP_SEARCH", "DEEPLINK", "TAXI_SUMMARY_REDIRECT", "TAXI_MAIN_SCREEN", "SERVICE_CATALOG", "DISCOVERY", "DELIVERY_DASHBOARD", "TAXI_PROCEED", "SELECT_POINT_A", "CITY_MODE", "INTERCITY_MAIN", "SCOOTERS_QR_SCAN", "SCOOTERS_SUPPORT", "SCOOTERS_COUPONS", "SCOOTERS_PASSES", "SCOOTERS_SUPER_PASSES", "SCOOTERS_ACTIVE_SUPER_PASSES", "SCOOTERS_INSURANCE", "SCOOTERS_MOS_RU", "CHARGERS_QR_SCAN", "CHARGERS_SUBSCRIPTION", "CHARGERS_DVIZH_SUBSCRIPTION", "PLUS_HOME", "CHARGERS_PARTNER_SUBSCRIPTION", "CHARGERS_PASSES", "CHARGERS_DISCOUNTS", "CHARITY", "WEB_APP_ACTION", "SDC_ROUTE_SELECTION", "OPEN_TARIFF_CARD", "OPEN_ORGANIZATIONS_LIST", "ZOOM_LAYERS", "SCROLL_UP", "EXPECTED_DESTINATION", "ORDERS_LIST", "MARKETPLACE", "CAR_TECH", "ORGANIZATIONS_DISCOVERY", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ActionType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ActionType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final ActionType CAR_TECH;
    public static final ActionType CHARGERS_DISCOUNTS;
    public static final ActionType CHARGERS_DVIZH_SUBSCRIPTION;
    public static final ActionType CHARGERS_PARTNER_SUBSCRIPTION;
    public static final ActionType CHARGERS_PASSES;
    public static final ActionType CHARGERS_QR_SCAN;
    public static final ActionType CHARGERS_SUBSCRIPTION;
    public static final ActionType CHARITY;
    public static final ActionType CITY_MODE;
    public static final ActionType CLOSE;
    public static final dz Companion;
    public static final ActionType DEEPLINK;
    public static final ActionType DELIVERY_DASHBOARD;
    public static final ActionType DISCOVERY;
    public static final ActionType EXPECTED_DESTINATION;
    public static final ActionType INTERCITY_MAIN;
    public static final ActionType MARKETPLACE;
    public static final ActionType MT_ROUTE_INPUT;
    public static final ActionType NAVIGATOR;
    public static final ActionType OPEN_ORGANIZATIONS_LIST;
    public static final ActionType OPEN_TARIFF_CARD;
    public static final ActionType ORDERS_LIST;
    public static final ActionType ORGANIZATIONS_DISCOVERY;
    public static final ActionType PLUS_HOME;
    public static final ActionType REFRESH;
    public static final ActionType ROUTE_INPUT;
    public static final ActionType SCOOTERS_ACTIVE_SUPER_PASSES;
    public static final ActionType SCOOTERS_COUPONS;
    public static final ActionType SCOOTERS_INSURANCE;
    public static final ActionType SCOOTERS_MOS_RU;
    public static final ActionType SCOOTERS_PASSES;
    public static final ActionType SCOOTERS_QR_SCAN;
    public static final ActionType SCOOTERS_SUPER_PASSES;
    public static final ActionType SCOOTERS_SUPPORT;
    public static final ActionType SCROLL_UP;
    public static final ActionType SDC_ROUTE_SELECTION;
    public static final ActionType SELECT_POINT_A;
    public static final ActionType SERVICE_CATALOG;
    public static final ActionType SUPERAPP_SEARCH;
    public static final ActionType TAXI_MAIN_SCREEN;
    public static final ActionType TAXI_PROCEED;
    public static final ActionType TAXI_SUMMARY_REDIRECT;
    public static final ActionType UNSUPPORTED;
    public static final ActionType WEB_APP_ACTION;
    public static final ActionType ZOOM_LAYERS;

    static {
        ActionType actionType = new ActionType("UNSUPPORTED", 0);
        UNSUPPORTED = actionType;
        ActionType actionType2 = new ActionType("REFRESH", 1);
        REFRESH = actionType2;
        ActionType actionType3 = new ActionType("CLOSE", 2);
        CLOSE = actionType3;
        ActionType actionType4 = new ActionType("ROUTE_INPUT", 3);
        ROUTE_INPUT = actionType4;
        ActionType actionType5 = new ActionType("MT_ROUTE_INPUT", 4);
        MT_ROUTE_INPUT = actionType5;
        ActionType actionType6 = new ActionType("NAVIGATOR", 5);
        NAVIGATOR = actionType6;
        ActionType actionType7 = new ActionType("SUPERAPP_SEARCH", 6);
        SUPERAPP_SEARCH = actionType7;
        ActionType actionType8 = new ActionType("DEEPLINK", 7);
        DEEPLINK = actionType8;
        ActionType actionType9 = new ActionType("TAXI_SUMMARY_REDIRECT", 8);
        TAXI_SUMMARY_REDIRECT = actionType9;
        ActionType actionType10 = new ActionType("TAXI_MAIN_SCREEN", 9);
        TAXI_MAIN_SCREEN = actionType10;
        ActionType actionType11 = new ActionType("SERVICE_CATALOG", 10);
        SERVICE_CATALOG = actionType11;
        ActionType actionType12 = new ActionType("DISCOVERY", 11);
        DISCOVERY = actionType12;
        ActionType actionType13 = new ActionType("DELIVERY_DASHBOARD", 12);
        DELIVERY_DASHBOARD = actionType13;
        ActionType actionType14 = new ActionType("TAXI_PROCEED", 13);
        TAXI_PROCEED = actionType14;
        ActionType actionType15 = new ActionType("SELECT_POINT_A", 14);
        SELECT_POINT_A = actionType15;
        ActionType actionType16 = new ActionType("CITY_MODE", 15);
        CITY_MODE = actionType16;
        ActionType actionType17 = new ActionType("INTERCITY_MAIN", 16);
        INTERCITY_MAIN = actionType17;
        ActionType actionType18 = new ActionType("SCOOTERS_QR_SCAN", 17);
        SCOOTERS_QR_SCAN = actionType18;
        ActionType actionType19 = new ActionType("SCOOTERS_SUPPORT", 18);
        SCOOTERS_SUPPORT = actionType19;
        ActionType actionType20 = new ActionType("SCOOTERS_COUPONS", 19);
        SCOOTERS_COUPONS = actionType20;
        ActionType actionType21 = new ActionType("SCOOTERS_PASSES", 20);
        SCOOTERS_PASSES = actionType21;
        ActionType actionType22 = new ActionType("SCOOTERS_SUPER_PASSES", 21);
        SCOOTERS_SUPER_PASSES = actionType22;
        ActionType actionType23 = new ActionType("SCOOTERS_ACTIVE_SUPER_PASSES", 22);
        SCOOTERS_ACTIVE_SUPER_PASSES = actionType23;
        ActionType actionType24 = new ActionType("SCOOTERS_INSURANCE", 23);
        SCOOTERS_INSURANCE = actionType24;
        ActionType actionType25 = new ActionType("SCOOTERS_MOS_RU", 24);
        SCOOTERS_MOS_RU = actionType25;
        ActionType actionType26 = new ActionType("CHARGERS_QR_SCAN", 25);
        CHARGERS_QR_SCAN = actionType26;
        ActionType actionType27 = new ActionType("CHARGERS_SUBSCRIPTION", 26);
        CHARGERS_SUBSCRIPTION = actionType27;
        ActionType actionType28 = new ActionType("CHARGERS_DVIZH_SUBSCRIPTION", 27);
        CHARGERS_DVIZH_SUBSCRIPTION = actionType28;
        ActionType actionType29 = new ActionType("PLUS_HOME", 28);
        PLUS_HOME = actionType29;
        ActionType actionType30 = new ActionType("CHARGERS_PARTNER_SUBSCRIPTION", 29);
        CHARGERS_PARTNER_SUBSCRIPTION = actionType30;
        ActionType actionType31 = new ActionType("CHARGERS_PASSES", 30);
        CHARGERS_PASSES = actionType31;
        ActionType actionType32 = new ActionType("CHARGERS_DISCOUNTS", 31);
        CHARGERS_DISCOUNTS = actionType32;
        ActionType actionType33 = new ActionType("CHARITY", 32);
        CHARITY = actionType33;
        ActionType actionType34 = new ActionType("WEB_APP_ACTION", 33);
        WEB_APP_ACTION = actionType34;
        ActionType actionType35 = new ActionType("SDC_ROUTE_SELECTION", 34);
        SDC_ROUTE_SELECTION = actionType35;
        ActionType actionType36 = new ActionType("OPEN_TARIFF_CARD", 35);
        OPEN_TARIFF_CARD = actionType36;
        ActionType actionType37 = new ActionType("OPEN_ORGANIZATIONS_LIST", 36);
        OPEN_ORGANIZATIONS_LIST = actionType37;
        ActionType actionType38 = new ActionType("ZOOM_LAYERS", 37);
        ZOOM_LAYERS = actionType38;
        ActionType actionType39 = new ActionType("SCROLL_UP", 38);
        SCROLL_UP = actionType39;
        ActionType actionType40 = new ActionType("EXPECTED_DESTINATION", 39);
        EXPECTED_DESTINATION = actionType40;
        ActionType actionType41 = new ActionType("ORDERS_LIST", 40);
        ORDERS_LIST = actionType41;
        ActionType actionType42 = new ActionType("MARKETPLACE", 41);
        MARKETPLACE = actionType42;
        ActionType actionType43 = new ActionType("CAR_TECH", 42);
        CAR_TECH = actionType43;
        ActionType actionType44 = new ActionType("ORGANIZATIONS_DISCOVERY", 43);
        ORGANIZATIONS_DISCOVERY = actionType44;
        ActionType[] actionTypeArr = {actionType, actionType2, actionType3, actionType4, actionType5, actionType6, actionType7, actionType8, actionType9, actionType10, actionType11, actionType12, actionType13, actionType14, actionType15, actionType16, actionType17, actionType18, actionType19, actionType20, actionType21, actionType22, actionType23, actionType24, actionType25, actionType26, actionType27, actionType28, actionType29, actionType30, actionType31, actionType32, actionType33, actionType34, actionType35, actionType36, actionType37, actionType38, actionType39, actionType40, actionType41, actionType42, actionType43, actionType44};
        $VALUES = actionTypeArr;
        $ENTRIES = kotlin.enums.a.a(actionTypeArr);
        Companion = new dz();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ar(11));
    }

    public static ActionType valueOf(String str) {
        return (ActionType) Enum.valueOf(ActionType.class, str);
    }

    public static ActionType[] values() {
        return (ActionType[]) $VALUES.clone();
    }
}
