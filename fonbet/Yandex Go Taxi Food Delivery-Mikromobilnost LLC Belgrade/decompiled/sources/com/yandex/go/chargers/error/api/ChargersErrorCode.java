package com.yandex.go.chargers.error.api;

import defpackage.ay9;
import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u001a\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001b¨\u0006\u001c"}, d2 = {"Lcom/yandex/go/chargers/error/api/ChargersErrorCode;", "", "", "stringValue", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Companion", "ay9", "UNKNOWN", "NETWORK_ERROR", "INTERNAL_ERROR", "PAYMENT_FAILED", "OFFER_NOT_FOUND", "ORDER_NOT_FOUND", "STATION_NOT_FOUND", "EXECUTION_FAILED", "STATION_IS_EMPTY", "STATION_IS_BUSY", "USER_IS_DEBTOR", "OFFER_IS_EXPIRED", "FORBIDDEN", "PRICE_CHANGED", "NOT_ENOUGH_MONEY", "SUBSCRIPTION_POLLING_FAILURE", "DVIZH_PURCHASE_ON_OFFER_FAILED", "AUTH", "TIMEOUT", "go-client-android.features.chargers.error:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersErrorCode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ChargersErrorCode[] $VALUES;
    public static final ChargersErrorCode AUTH;
    public static final ay9 Companion;
    public static final ChargersErrorCode DVIZH_PURCHASE_ON_OFFER_FAILED;
    public static final ChargersErrorCode EXECUTION_FAILED;
    public static final ChargersErrorCode FORBIDDEN;
    public static final ChargersErrorCode INTERNAL_ERROR;
    public static final ChargersErrorCode NETWORK_ERROR;
    public static final ChargersErrorCode NOT_ENOUGH_MONEY;
    public static final ChargersErrorCode OFFER_IS_EXPIRED;
    public static final ChargersErrorCode OFFER_NOT_FOUND;
    public static final ChargersErrorCode ORDER_NOT_FOUND;
    public static final ChargersErrorCode PAYMENT_FAILED;
    public static final ChargersErrorCode PRICE_CHANGED;
    public static final ChargersErrorCode STATION_IS_BUSY;
    public static final ChargersErrorCode STATION_IS_EMPTY;
    public static final ChargersErrorCode STATION_NOT_FOUND;
    public static final ChargersErrorCode SUBSCRIPTION_POLLING_FAILURE;
    public static final ChargersErrorCode TIMEOUT;
    public static final ChargersErrorCode UNKNOWN;
    public static final ChargersErrorCode USER_IS_DEBTOR;
    private final String stringValue;

    static {
        ChargersErrorCode chargersErrorCode = new ChargersErrorCode("UNKNOWN", 0, "");
        UNKNOWN = chargersErrorCode;
        ChargersErrorCode chargersErrorCode2 = new ChargersErrorCode("NETWORK_ERROR", 1, "network_error");
        NETWORK_ERROR = chargersErrorCode2;
        ChargersErrorCode chargersErrorCode3 = new ChargersErrorCode("INTERNAL_ERROR", 2, "internal_error");
        INTERNAL_ERROR = chargersErrorCode3;
        ChargersErrorCode chargersErrorCode4 = new ChargersErrorCode("PAYMENT_FAILED", 3, "payment_failed");
        PAYMENT_FAILED = chargersErrorCode4;
        ChargersErrorCode chargersErrorCode5 = new ChargersErrorCode("OFFER_NOT_FOUND", 4, "offer_not_found");
        OFFER_NOT_FOUND = chargersErrorCode5;
        ChargersErrorCode chargersErrorCode6 = new ChargersErrorCode("ORDER_NOT_FOUND", 5, "order_not_found");
        ORDER_NOT_FOUND = chargersErrorCode6;
        ChargersErrorCode chargersErrorCode7 = new ChargersErrorCode("STATION_NOT_FOUND", 6, "station_not_found");
        STATION_NOT_FOUND = chargersErrorCode7;
        ChargersErrorCode chargersErrorCode8 = new ChargersErrorCode("EXECUTION_FAILED", 7, "execution_failed");
        EXECUTION_FAILED = chargersErrorCode8;
        ChargersErrorCode chargersErrorCode9 = new ChargersErrorCode("STATION_IS_EMPTY", 8, "station_is_empty");
        STATION_IS_EMPTY = chargersErrorCode9;
        ChargersErrorCode chargersErrorCode10 = new ChargersErrorCode("STATION_IS_BUSY", 9, "station_is_busy");
        STATION_IS_BUSY = chargersErrorCode10;
        ChargersErrorCode chargersErrorCode11 = new ChargersErrorCode("USER_IS_DEBTOR", 10, "user_is_debtor");
        USER_IS_DEBTOR = chargersErrorCode11;
        ChargersErrorCode chargersErrorCode12 = new ChargersErrorCode("OFFER_IS_EXPIRED", 11, "offer_is_expired");
        OFFER_IS_EXPIRED = chargersErrorCode12;
        ChargersErrorCode chargersErrorCode13 = new ChargersErrorCode("FORBIDDEN", 12, "forbidden");
        FORBIDDEN = chargersErrorCode13;
        ChargersErrorCode chargersErrorCode14 = new ChargersErrorCode("PRICE_CHANGED", 13, "price_changed");
        PRICE_CHANGED = chargersErrorCode14;
        ChargersErrorCode chargersErrorCode15 = new ChargersErrorCode("NOT_ENOUGH_MONEY", 14, "not_enough_money");
        NOT_ENOUGH_MONEY = chargersErrorCode15;
        ChargersErrorCode chargersErrorCode16 = new ChargersErrorCode("SUBSCRIPTION_POLLING_FAILURE", 15, "subscription_polling_failure");
        SUBSCRIPTION_POLLING_FAILURE = chargersErrorCode16;
        ChargersErrorCode chargersErrorCode17 = new ChargersErrorCode("DVIZH_PURCHASE_ON_OFFER_FAILED", 16, "dvizh_purchase_on_offer_failed");
        DVIZH_PURCHASE_ON_OFFER_FAILED = chargersErrorCode17;
        ChargersErrorCode chargersErrorCode18 = new ChargersErrorCode("AUTH", 17, "auth_error");
        AUTH = chargersErrorCode18;
        ChargersErrorCode chargersErrorCode19 = new ChargersErrorCode("TIMEOUT", 18, "timeout_error");
        TIMEOUT = chargersErrorCode19;
        ChargersErrorCode[] chargersErrorCodeArr = {chargersErrorCode, chargersErrorCode2, chargersErrorCode3, chargersErrorCode4, chargersErrorCode5, chargersErrorCode6, chargersErrorCode7, chargersErrorCode8, chargersErrorCode9, chargersErrorCode10, chargersErrorCode11, chargersErrorCode12, chargersErrorCode13, chargersErrorCode14, chargersErrorCode15, chargersErrorCode16, chargersErrorCode17, chargersErrorCode18, chargersErrorCode19};
        $VALUES = chargersErrorCodeArr;
        $ENTRIES = kotlin.enums.a.a(chargersErrorCodeArr);
        Companion = new ay9();
    }

    public ChargersErrorCode(String str, int i, String str2) {
        this.stringValue = str2;
    }

    public static k4o a() {
        return $ENTRIES;
    }

    public static ChargersErrorCode valueOf(String str) {
        return (ChargersErrorCode) Enum.valueOf(ChargersErrorCode.class, str);
    }

    public static ChargersErrorCode[] values() {
        return (ChargersErrorCode[]) $VALUES.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getStringValue() {
        return this.stringValue;
    }
}
