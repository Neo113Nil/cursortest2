package com.yandex.go.masstransit.sdk.order.impl.orders.network;

import com.samsung.android.sdk.samsungpay.v2.card.Card;
import defpackage.dd80;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.kz60;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/masstransit/sdk/order/impl/orders/network/OrdersStatus;", "", "Companion", "dd80", Card.ACTIVE, "ALL", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class OrdersStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ OrdersStatus[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final OrdersStatus ACTIVE;
    public static final OrdersStatus ALL;
    public static final dd80 Companion;

    static {
        OrdersStatus ordersStatus = new OrdersStatus(Card.ACTIVE, 0);
        ACTIVE = ordersStatus;
        OrdersStatus ordersStatus2 = new OrdersStatus("ALL", 1);
        ALL = ordersStatus2;
        OrdersStatus[] ordersStatusArr = {ordersStatus, ordersStatus2};
        $VALUES = ordersStatusArr;
        $ENTRIES = kotlin.enums.a.a(ordersStatusArr);
        Companion = new dd80();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new kz60(23));
    }

    public static OrdersStatus valueOf(String str) {
        return (OrdersStatus) Enum.valueOf(OrdersStatus.class, str);
    }

    public static OrdersStatus[] values() {
        return (OrdersStatus[]) $VALUES.clone();
    }
}
