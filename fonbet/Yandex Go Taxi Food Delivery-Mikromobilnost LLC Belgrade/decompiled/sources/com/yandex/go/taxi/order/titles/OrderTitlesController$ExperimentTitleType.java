package com.yandex.go.taxi.order.titles;

import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/taxi/order/titles/OrderTitlesController$ExperimentTitleType", "", "Lcom/yandex/go/taxi/order/titles/OrderTitlesController$ExperimentTitleType;", "LONG_SEARCH", "SEARCH_PROGRESS", JCP.RAW_PREFIX, "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class OrderTitlesController$ExperimentTitleType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ OrderTitlesController$ExperimentTitleType[] $VALUES;
    public static final OrderTitlesController$ExperimentTitleType LONG_SEARCH;
    public static final OrderTitlesController$ExperimentTitleType NONE;
    public static final OrderTitlesController$ExperimentTitleType SEARCH_PROGRESS;

    static {
        OrderTitlesController$ExperimentTitleType orderTitlesController$ExperimentTitleType = new OrderTitlesController$ExperimentTitleType("LONG_SEARCH", 0);
        LONG_SEARCH = orderTitlesController$ExperimentTitleType;
        OrderTitlesController$ExperimentTitleType orderTitlesController$ExperimentTitleType2 = new OrderTitlesController$ExperimentTitleType("SEARCH_PROGRESS", 1);
        SEARCH_PROGRESS = orderTitlesController$ExperimentTitleType2;
        OrderTitlesController$ExperimentTitleType orderTitlesController$ExperimentTitleType3 = new OrderTitlesController$ExperimentTitleType(JCP.RAW_PREFIX, 2);
        NONE = orderTitlesController$ExperimentTitleType3;
        OrderTitlesController$ExperimentTitleType[] orderTitlesController$ExperimentTitleTypeArr = {orderTitlesController$ExperimentTitleType, orderTitlesController$ExperimentTitleType2, orderTitlesController$ExperimentTitleType3};
        $VALUES = orderTitlesController$ExperimentTitleTypeArr;
        $ENTRIES = kotlin.enums.a.a(orderTitlesController$ExperimentTitleTypeArr);
    }

    public static OrderTitlesController$ExperimentTitleType valueOf(String str) {
        return (OrderTitlesController$ExperimentTitleType) Enum.valueOf(OrderTitlesController$ExperimentTitleType.class, str);
    }

    public static OrderTitlesController$ExperimentTitleType[] values() {
        return (OrderTitlesController$ExperimentTitleType[]) $VALUES.clone();
    }
}
