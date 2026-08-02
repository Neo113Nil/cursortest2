package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0013\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/HubItemActionTypeV2;", "", "DETAILED_TRANSPORT_ROUTE", "TAXI_REDIRECT", "DRIVE_REDIRECT", "SCOOTERS_REDIRECT", "NAVIGATOR_REDIRECT", "TRANSPORT_ROUTES_REDIRECT", "TAXI_ORDER", "SELECT_OFFER", "WALKING_NAVIGATION_REDIRECT", "DETAILED_MULTIMODAL_ROUTE", "MULTIMODAL_ROUTE_ACTION", "SCOOTER_MULTIMODAL_REDIRECT", "MASSTRANSIT_PAYMENT", "MASSTRANSIT_TICKETS", "TRANSPORT_CARD_BIND", "TRANSPORT_CARD_DEPOSIT", "TAXI_OPTION", "UNKNOWN", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class HubItemActionTypeV2 {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ HubItemActionTypeV2[] $VALUES;
    public static final HubItemActionTypeV2 DETAILED_MULTIMODAL_ROUTE;
    public static final HubItemActionTypeV2 DETAILED_TRANSPORT_ROUTE;
    public static final HubItemActionTypeV2 DRIVE_REDIRECT;
    public static final HubItemActionTypeV2 MASSTRANSIT_PAYMENT;
    public static final HubItemActionTypeV2 MASSTRANSIT_TICKETS;
    public static final HubItemActionTypeV2 MULTIMODAL_ROUTE_ACTION;
    public static final HubItemActionTypeV2 NAVIGATOR_REDIRECT;
    public static final HubItemActionTypeV2 SCOOTERS_REDIRECT;
    public static final HubItemActionTypeV2 SCOOTER_MULTIMODAL_REDIRECT;
    public static final HubItemActionTypeV2 SELECT_OFFER;
    public static final HubItemActionTypeV2 TAXI_OPTION;
    public static final HubItemActionTypeV2 TAXI_ORDER;
    public static final HubItemActionTypeV2 TAXI_REDIRECT;
    public static final HubItemActionTypeV2 TRANSPORT_CARD_BIND;
    public static final HubItemActionTypeV2 TRANSPORT_CARD_DEPOSIT;
    public static final HubItemActionTypeV2 TRANSPORT_ROUTES_REDIRECT;
    public static final HubItemActionTypeV2 UNKNOWN;
    public static final HubItemActionTypeV2 WALKING_NAVIGATION_REDIRECT;

    static {
        HubItemActionTypeV2 hubItemActionTypeV2 = new HubItemActionTypeV2("DETAILED_TRANSPORT_ROUTE", 0);
        DETAILED_TRANSPORT_ROUTE = hubItemActionTypeV2;
        HubItemActionTypeV2 hubItemActionTypeV22 = new HubItemActionTypeV2("TAXI_REDIRECT", 1);
        TAXI_REDIRECT = hubItemActionTypeV22;
        HubItemActionTypeV2 hubItemActionTypeV23 = new HubItemActionTypeV2("DRIVE_REDIRECT", 2);
        DRIVE_REDIRECT = hubItemActionTypeV23;
        HubItemActionTypeV2 hubItemActionTypeV24 = new HubItemActionTypeV2("SCOOTERS_REDIRECT", 3);
        SCOOTERS_REDIRECT = hubItemActionTypeV24;
        HubItemActionTypeV2 hubItemActionTypeV25 = new HubItemActionTypeV2("NAVIGATOR_REDIRECT", 4);
        NAVIGATOR_REDIRECT = hubItemActionTypeV25;
        HubItemActionTypeV2 hubItemActionTypeV26 = new HubItemActionTypeV2("TRANSPORT_ROUTES_REDIRECT", 5);
        TRANSPORT_ROUTES_REDIRECT = hubItemActionTypeV26;
        HubItemActionTypeV2 hubItemActionTypeV27 = new HubItemActionTypeV2("TAXI_ORDER", 6);
        TAXI_ORDER = hubItemActionTypeV27;
        HubItemActionTypeV2 hubItemActionTypeV28 = new HubItemActionTypeV2("SELECT_OFFER", 7);
        SELECT_OFFER = hubItemActionTypeV28;
        HubItemActionTypeV2 hubItemActionTypeV29 = new HubItemActionTypeV2("WALKING_NAVIGATION_REDIRECT", 8);
        WALKING_NAVIGATION_REDIRECT = hubItemActionTypeV29;
        HubItemActionTypeV2 hubItemActionTypeV210 = new HubItemActionTypeV2("DETAILED_MULTIMODAL_ROUTE", 9);
        DETAILED_MULTIMODAL_ROUTE = hubItemActionTypeV210;
        HubItemActionTypeV2 hubItemActionTypeV211 = new HubItemActionTypeV2("MULTIMODAL_ROUTE_ACTION", 10);
        MULTIMODAL_ROUTE_ACTION = hubItemActionTypeV211;
        HubItemActionTypeV2 hubItemActionTypeV212 = new HubItemActionTypeV2("SCOOTER_MULTIMODAL_REDIRECT", 11);
        SCOOTER_MULTIMODAL_REDIRECT = hubItemActionTypeV212;
        HubItemActionTypeV2 hubItemActionTypeV213 = new HubItemActionTypeV2("MASSTRANSIT_PAYMENT", 12);
        MASSTRANSIT_PAYMENT = hubItemActionTypeV213;
        HubItemActionTypeV2 hubItemActionTypeV214 = new HubItemActionTypeV2("MASSTRANSIT_TICKETS", 13);
        MASSTRANSIT_TICKETS = hubItemActionTypeV214;
        HubItemActionTypeV2 hubItemActionTypeV215 = new HubItemActionTypeV2("TRANSPORT_CARD_BIND", 14);
        TRANSPORT_CARD_BIND = hubItemActionTypeV215;
        HubItemActionTypeV2 hubItemActionTypeV216 = new HubItemActionTypeV2("TRANSPORT_CARD_DEPOSIT", 15);
        TRANSPORT_CARD_DEPOSIT = hubItemActionTypeV216;
        HubItemActionTypeV2 hubItemActionTypeV217 = new HubItemActionTypeV2("TAXI_OPTION", 16);
        TAXI_OPTION = hubItemActionTypeV217;
        HubItemActionTypeV2 hubItemActionTypeV218 = new HubItemActionTypeV2("UNKNOWN", 17);
        UNKNOWN = hubItemActionTypeV218;
        HubItemActionTypeV2[] hubItemActionTypeV2Arr = {hubItemActionTypeV2, hubItemActionTypeV22, hubItemActionTypeV23, hubItemActionTypeV24, hubItemActionTypeV25, hubItemActionTypeV26, hubItemActionTypeV27, hubItemActionTypeV28, hubItemActionTypeV29, hubItemActionTypeV210, hubItemActionTypeV211, hubItemActionTypeV212, hubItemActionTypeV213, hubItemActionTypeV214, hubItemActionTypeV215, hubItemActionTypeV216, hubItemActionTypeV217, hubItemActionTypeV218};
        $VALUES = hubItemActionTypeV2Arr;
        $ENTRIES = kotlin.enums.a.a(hubItemActionTypeV2Arr);
    }

    public static HubItemActionTypeV2 valueOf(String str) {
        return (HubItemActionTypeV2) Enum.valueOf(HubItemActionTypeV2.class, str);
    }

    public static HubItemActionTypeV2[] values() {
        return (HubItemActionTypeV2[]) $VALUES.clone();
    }
}
