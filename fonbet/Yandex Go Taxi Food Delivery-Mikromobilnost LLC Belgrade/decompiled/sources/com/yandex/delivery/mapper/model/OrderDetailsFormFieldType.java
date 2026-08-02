package com.yandex.delivery.mapper.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/yandex/delivery/mapper/model/OrderDetailsFormFieldType;", "", "ADDRESS", "ENTRANCE", "APARTMENT", "FLOOR", "DOOR_PHONE", "COMMENT", "CONTACT", "UNKNOWN", "mapper"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class OrderDetailsFormFieldType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ OrderDetailsFormFieldType[] $VALUES;
    public static final OrderDetailsFormFieldType ADDRESS;
    public static final OrderDetailsFormFieldType APARTMENT;
    public static final OrderDetailsFormFieldType COMMENT;
    public static final OrderDetailsFormFieldType CONTACT;
    public static final OrderDetailsFormFieldType DOOR_PHONE;
    public static final OrderDetailsFormFieldType ENTRANCE;
    public static final OrderDetailsFormFieldType FLOOR;
    public static final OrderDetailsFormFieldType UNKNOWN;

    static {
        OrderDetailsFormFieldType orderDetailsFormFieldType = new OrderDetailsFormFieldType("ADDRESS", 0);
        ADDRESS = orderDetailsFormFieldType;
        OrderDetailsFormFieldType orderDetailsFormFieldType2 = new OrderDetailsFormFieldType("ENTRANCE", 1);
        ENTRANCE = orderDetailsFormFieldType2;
        OrderDetailsFormFieldType orderDetailsFormFieldType3 = new OrderDetailsFormFieldType("APARTMENT", 2);
        APARTMENT = orderDetailsFormFieldType3;
        OrderDetailsFormFieldType orderDetailsFormFieldType4 = new OrderDetailsFormFieldType("FLOOR", 3);
        FLOOR = orderDetailsFormFieldType4;
        OrderDetailsFormFieldType orderDetailsFormFieldType5 = new OrderDetailsFormFieldType("DOOR_PHONE", 4);
        DOOR_PHONE = orderDetailsFormFieldType5;
        OrderDetailsFormFieldType orderDetailsFormFieldType6 = new OrderDetailsFormFieldType("COMMENT", 5);
        COMMENT = orderDetailsFormFieldType6;
        OrderDetailsFormFieldType orderDetailsFormFieldType7 = new OrderDetailsFormFieldType("CONTACT", 6);
        CONTACT = orderDetailsFormFieldType7;
        OrderDetailsFormFieldType orderDetailsFormFieldType8 = new OrderDetailsFormFieldType("UNKNOWN", 7);
        UNKNOWN = orderDetailsFormFieldType8;
        OrderDetailsFormFieldType[] orderDetailsFormFieldTypeArr = {orderDetailsFormFieldType, orderDetailsFormFieldType2, orderDetailsFormFieldType3, orderDetailsFormFieldType4, orderDetailsFormFieldType5, orderDetailsFormFieldType6, orderDetailsFormFieldType7, orderDetailsFormFieldType8};
        $VALUES = orderDetailsFormFieldTypeArr;
        $ENTRIES = a.a(orderDetailsFormFieldTypeArr);
    }

    public static OrderDetailsFormFieldType valueOf(String str) {
        return (OrderDetailsFormFieldType) Enum.valueOf(OrderDetailsFormFieldType.class, str);
    }

    public static OrderDetailsFormFieldType[] values() {
        return (OrderDetailsFormFieldType[]) $VALUES.clone();
    }
}
