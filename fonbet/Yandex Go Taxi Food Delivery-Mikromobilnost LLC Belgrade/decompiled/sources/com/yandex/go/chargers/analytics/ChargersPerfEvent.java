package com.yandex.go.chargers.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u001b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001c¨\u0006\u001d"}, d2 = {"Lcom/yandex/go/chargers/analytics/ChargersPerfEvent;", "", "", "key", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "CHARGERS_COMPONENT_CREATION", "DISCOVERY", "STATION_CARD", "OFFER_CARD", "OFFER_CARD_COMPOSE", "ACTIVE_ORDERS_CARD", "MULTI_ORDER_CARD", "PRE_FINISH_CARD", "ORDER_DETAILS", "ORDER_PREPARING", "SUBSCRIPTION_LANDING", "SUBSCRIPTION_LOADING", "PARTNER_SUBSCRIPTION", "PARTNER_DETAILS", "PASSES_PURCHASING", "ACTIVE_PASSES", "QR_SCAN", "FEEDBACK", "DISCOUNTS_LIST", "DISCOUNT_DETAILS", "SURGE_INFO", "ERROR", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersPerfEvent {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ChargersPerfEvent[] $VALUES;
    public static final ChargersPerfEvent ACTIVE_ORDERS_CARD;
    public static final ChargersPerfEvent ACTIVE_PASSES;
    public static final ChargersPerfEvent CHARGERS_COMPONENT_CREATION;
    public static final ChargersPerfEvent DISCOUNTS_LIST;
    public static final ChargersPerfEvent DISCOUNT_DETAILS;
    public static final ChargersPerfEvent DISCOVERY;
    public static final ChargersPerfEvent ERROR;
    public static final ChargersPerfEvent FEEDBACK;
    public static final ChargersPerfEvent MULTI_ORDER_CARD;
    public static final ChargersPerfEvent OFFER_CARD;
    public static final ChargersPerfEvent OFFER_CARD_COMPOSE;
    public static final ChargersPerfEvent ORDER_DETAILS;
    public static final ChargersPerfEvent ORDER_PREPARING;
    public static final ChargersPerfEvent PARTNER_DETAILS;
    public static final ChargersPerfEvent PARTNER_SUBSCRIPTION;
    public static final ChargersPerfEvent PASSES_PURCHASING;
    public static final ChargersPerfEvent PRE_FINISH_CARD;
    public static final ChargersPerfEvent QR_SCAN;
    public static final ChargersPerfEvent STATION_CARD;
    public static final ChargersPerfEvent SUBSCRIPTION_LANDING;
    public static final ChargersPerfEvent SUBSCRIPTION_LOADING;
    public static final ChargersPerfEvent SURGE_INFO;
    private final String key;

    static {
        ChargersPerfEvent chargersPerfEvent = new ChargersPerfEvent("CHARGERS_COMPONENT_CREATION", 0, "Chargers.ComponentCreation");
        CHARGERS_COMPONENT_CREATION = chargersPerfEvent;
        ChargersPerfEvent chargersPerfEvent2 = new ChargersPerfEvent("DISCOVERY", 1, "Chargers.Discovery");
        DISCOVERY = chargersPerfEvent2;
        ChargersPerfEvent chargersPerfEvent3 = new ChargersPerfEvent("STATION_CARD", 2, "Chargers.StationCard");
        STATION_CARD = chargersPerfEvent3;
        ChargersPerfEvent chargersPerfEvent4 = new ChargersPerfEvent("OFFER_CARD", 3, "Chargers.OfferCard");
        OFFER_CARD = chargersPerfEvent4;
        ChargersPerfEvent chargersPerfEvent5 = new ChargersPerfEvent("OFFER_CARD_COMPOSE", 4, "Chargers.OfferCardCompose");
        OFFER_CARD_COMPOSE = chargersPerfEvent5;
        ChargersPerfEvent chargersPerfEvent6 = new ChargersPerfEvent("ACTIVE_ORDERS_CARD", 5, "Chargers.OrderDetailed");
        ACTIVE_ORDERS_CARD = chargersPerfEvent6;
        ChargersPerfEvent chargersPerfEvent7 = new ChargersPerfEvent("MULTI_ORDER_CARD", 6, "Chargers.MultiOrderCard");
        MULTI_ORDER_CARD = chargersPerfEvent7;
        ChargersPerfEvent chargersPerfEvent8 = new ChargersPerfEvent("PRE_FINISH_CARD", 7, "Chargers.PreFinishCard");
        PRE_FINISH_CARD = chargersPerfEvent8;
        ChargersPerfEvent chargersPerfEvent9 = new ChargersPerfEvent("ORDER_DETAILS", 8, "Chargers.OrderDetails");
        ORDER_DETAILS = chargersPerfEvent9;
        ChargersPerfEvent chargersPerfEvent10 = new ChargersPerfEvent("ORDER_PREPARING", 9, "Chargers.OrderPreparing");
        ORDER_PREPARING = chargersPerfEvent10;
        ChargersPerfEvent chargersPerfEvent11 = new ChargersPerfEvent("SUBSCRIPTION_LANDING", 10, "Chargers.SubscriptionLanding");
        SUBSCRIPTION_LANDING = chargersPerfEvent11;
        ChargersPerfEvent chargersPerfEvent12 = new ChargersPerfEvent("SUBSCRIPTION_LOADING", 11, "Chargers.SubscriptionLoading");
        SUBSCRIPTION_LOADING = chargersPerfEvent12;
        ChargersPerfEvent chargersPerfEvent13 = new ChargersPerfEvent("PARTNER_SUBSCRIPTION", 12, "Chargers.PartnerSubscription");
        PARTNER_SUBSCRIPTION = chargersPerfEvent13;
        ChargersPerfEvent chargersPerfEvent14 = new ChargersPerfEvent("PARTNER_DETAILS", 13, "Chargers.PartnerDetails");
        PARTNER_DETAILS = chargersPerfEvent14;
        ChargersPerfEvent chargersPerfEvent15 = new ChargersPerfEvent("PASSES_PURCHASING", 14, "Chargers.PassesPurchasing");
        PASSES_PURCHASING = chargersPerfEvent15;
        ChargersPerfEvent chargersPerfEvent16 = new ChargersPerfEvent("ACTIVE_PASSES", 15, "Chargers.ActivePasses");
        ACTIVE_PASSES = chargersPerfEvent16;
        ChargersPerfEvent chargersPerfEvent17 = new ChargersPerfEvent("QR_SCAN", 16, "Chargers.QrScan");
        QR_SCAN = chargersPerfEvent17;
        ChargersPerfEvent chargersPerfEvent18 = new ChargersPerfEvent("FEEDBACK", 17, "Chargers.Feedback");
        FEEDBACK = chargersPerfEvent18;
        ChargersPerfEvent chargersPerfEvent19 = new ChargersPerfEvent("DISCOUNTS_LIST", 18, "Chargers.DiscountsList");
        DISCOUNTS_LIST = chargersPerfEvent19;
        ChargersPerfEvent chargersPerfEvent20 = new ChargersPerfEvent("DISCOUNT_DETAILS", 19, "Chargers.DiscountDetails");
        DISCOUNT_DETAILS = chargersPerfEvent20;
        ChargersPerfEvent chargersPerfEvent21 = new ChargersPerfEvent("SURGE_INFO", 20, "Chargers.SurgeInfo");
        SURGE_INFO = chargersPerfEvent21;
        ChargersPerfEvent chargersPerfEvent22 = new ChargersPerfEvent("ERROR", 21, "Chargers.Error");
        ERROR = chargersPerfEvent22;
        ChargersPerfEvent[] chargersPerfEventArr = {chargersPerfEvent, chargersPerfEvent2, chargersPerfEvent3, chargersPerfEvent4, chargersPerfEvent5, chargersPerfEvent6, chargersPerfEvent7, chargersPerfEvent8, chargersPerfEvent9, chargersPerfEvent10, chargersPerfEvent11, chargersPerfEvent12, chargersPerfEvent13, chargersPerfEvent14, chargersPerfEvent15, chargersPerfEvent16, chargersPerfEvent17, chargersPerfEvent18, chargersPerfEvent19, chargersPerfEvent20, chargersPerfEvent21, chargersPerfEvent22};
        $VALUES = chargersPerfEventArr;
        $ENTRIES = a.a(chargersPerfEventArr);
    }

    public ChargersPerfEvent(String str, int i, String str2) {
        this.key = str2;
    }

    public static ChargersPerfEvent valueOf(String str) {
        return (ChargersPerfEvent) Enum.valueOf(ChargersPerfEvent.class, str);
    }

    public static ChargersPerfEvent[] values() {
        return (ChargersPerfEvent[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getKey() {
        return this.key;
    }
}
