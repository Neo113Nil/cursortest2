package com.yandex.go.taxi.order.api.details;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/taxi/order/api/details/TaxiCardNavigationAction;", "", "EMPTY", "OPEN_PAYMENT", "OPEN_CUSTOM_TIPS_INPUT", "EXPAND_ORDER_CARD", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TaxiCardNavigationAction {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TaxiCardNavigationAction[] $VALUES;
    public static final TaxiCardNavigationAction EMPTY;
    public static final TaxiCardNavigationAction EXPAND_ORDER_CARD;
    public static final TaxiCardNavigationAction OPEN_CUSTOM_TIPS_INPUT;
    public static final TaxiCardNavigationAction OPEN_PAYMENT;

    static {
        TaxiCardNavigationAction taxiCardNavigationAction = new TaxiCardNavigationAction("EMPTY", 0);
        EMPTY = taxiCardNavigationAction;
        TaxiCardNavigationAction taxiCardNavigationAction2 = new TaxiCardNavigationAction("OPEN_PAYMENT", 1);
        OPEN_PAYMENT = taxiCardNavigationAction2;
        TaxiCardNavigationAction taxiCardNavigationAction3 = new TaxiCardNavigationAction("OPEN_CUSTOM_TIPS_INPUT", 2);
        OPEN_CUSTOM_TIPS_INPUT = taxiCardNavigationAction3;
        TaxiCardNavigationAction taxiCardNavigationAction4 = new TaxiCardNavigationAction("EXPAND_ORDER_CARD", 3);
        EXPAND_ORDER_CARD = taxiCardNavigationAction4;
        TaxiCardNavigationAction[] taxiCardNavigationActionArr = {taxiCardNavigationAction, taxiCardNavigationAction2, taxiCardNavigationAction3, taxiCardNavigationAction4};
        $VALUES = taxiCardNavigationActionArr;
        $ENTRIES = a.a(taxiCardNavigationActionArr);
    }

    public static TaxiCardNavigationAction valueOf(String str) {
        return (TaxiCardNavigationAction) Enum.valueOf(TaxiCardNavigationAction.class, str);
    }

    public static TaxiCardNavigationAction[] values() {
        return (TaxiCardNavigationAction[]) $VALUES.clone();
    }
}
