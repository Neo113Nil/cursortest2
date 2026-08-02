package com.yandex.go.taxi.order.api.titles;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/order/api/titles/OrderTitles$Alignment", "", "Lcom/yandex/go/taxi/order/api/titles/OrderTitles$Alignment;", "CENTER", "START", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class OrderTitles$Alignment {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ OrderTitles$Alignment[] $VALUES;
    public static final OrderTitles$Alignment CENTER;
    public static final OrderTitles$Alignment START;

    static {
        OrderTitles$Alignment orderTitles$Alignment = new OrderTitles$Alignment("CENTER", 0);
        CENTER = orderTitles$Alignment;
        OrderTitles$Alignment orderTitles$Alignment2 = new OrderTitles$Alignment("START", 1);
        START = orderTitles$Alignment2;
        OrderTitles$Alignment[] orderTitles$AlignmentArr = {orderTitles$Alignment, orderTitles$Alignment2};
        $VALUES = orderTitles$AlignmentArr;
        $ENTRIES = a.a(orderTitles$AlignmentArr);
    }

    public static OrderTitles$Alignment valueOf(String str) {
        return (OrderTitles$Alignment) Enum.valueOf(OrderTitles$Alignment.class, str);
    }

    public static OrderTitles$Alignment[] values() {
        return (OrderTitles$Alignment[]) $VALUES.clone();
    }
}
