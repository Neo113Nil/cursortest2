package com.yandex.go.zone.dto.objects;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jgi;
import defpackage.k4o;
import defpackage.sji;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/yandex/go/zone/dto/objects/DeliveryPinType;", "", "Companion", "sji", "MAP_SOURCE", "MAP_DESTINATION", "ROUTE_SOURCE", "ROUTE_DESTINATION", "UNKNOWN", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DeliveryPinType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DeliveryPinType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final sji Companion;
    public static final DeliveryPinType MAP_DESTINATION;
    public static final DeliveryPinType MAP_SOURCE;
    public static final DeliveryPinType ROUTE_DESTINATION;
    public static final DeliveryPinType ROUTE_SOURCE;
    public static final DeliveryPinType UNKNOWN;

    static {
        DeliveryPinType deliveryPinType = new DeliveryPinType("MAP_SOURCE", 0);
        MAP_SOURCE = deliveryPinType;
        DeliveryPinType deliveryPinType2 = new DeliveryPinType("MAP_DESTINATION", 1);
        MAP_DESTINATION = deliveryPinType2;
        DeliveryPinType deliveryPinType3 = new DeliveryPinType("ROUTE_SOURCE", 2);
        ROUTE_SOURCE = deliveryPinType3;
        DeliveryPinType deliveryPinType4 = new DeliveryPinType("ROUTE_DESTINATION", 3);
        ROUTE_DESTINATION = deliveryPinType4;
        DeliveryPinType deliveryPinType5 = new DeliveryPinType("UNKNOWN", 4);
        UNKNOWN = deliveryPinType5;
        DeliveryPinType[] deliveryPinTypeArr = {deliveryPinType, deliveryPinType2, deliveryPinType3, deliveryPinType4, deliveryPinType5};
        $VALUES = deliveryPinTypeArr;
        $ENTRIES = kotlin.enums.a.a(deliveryPinTypeArr);
        Companion = new sji();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jgi(4));
    }

    public static DeliveryPinType valueOf(String str) {
        return (DeliveryPinType) Enum.valueOf(DeliveryPinType.class, str);
    }

    public static DeliveryPinType[] values() {
        return (DeliveryPinType[]) $VALUES.clone();
    }
}
