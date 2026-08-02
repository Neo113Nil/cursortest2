package com.yandex.go.taxi.order.cache.api.data.model;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.s780;
import defpackage.v980;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/taxi/order/cache/api/data/model/OrderType;", "", "Companion", "v980", "DEFAULT", "AMBULANCE", "go-client-android.features.taxi_order.cache:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class OrderType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ OrderType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final OrderType AMBULANCE;
    public static final v980 Companion;
    public static final OrderType DEFAULT;

    static {
        OrderType orderType = new OrderType("DEFAULT", 0);
        DEFAULT = orderType;
        OrderType orderType2 = new OrderType("AMBULANCE", 1);
        AMBULANCE = orderType2;
        OrderType[] orderTypeArr = {orderType, orderType2};
        $VALUES = orderTypeArr;
        $ENTRIES = kotlin.enums.a.a(orderTypeArr);
        Companion = new v980();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new s780(19));
    }

    public static OrderType valueOf(String str) {
        return (OrderType) Enum.valueOf(OrderType.class, str);
    }

    public static OrderType[] values() {
        return (OrderType[]) $VALUES.clone();
    }
}
