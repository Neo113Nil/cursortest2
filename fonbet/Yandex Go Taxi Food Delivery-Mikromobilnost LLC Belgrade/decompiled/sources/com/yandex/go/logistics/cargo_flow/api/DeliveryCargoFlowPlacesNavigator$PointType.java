package com.yandex.go.logistics.cargo_flow.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/logistics/cargo_flow/api/DeliveryCargoFlowPlacesNavigator$PointType", "", "Lcom/yandex/go/logistics/cargo_flow/api/DeliveryCargoFlowPlacesNavigator$PointType;", "SOURCE", "DESTINATION", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DeliveryCargoFlowPlacesNavigator$PointType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DeliveryCargoFlowPlacesNavigator$PointType[] $VALUES;
    public static final DeliveryCargoFlowPlacesNavigator$PointType DESTINATION;
    public static final DeliveryCargoFlowPlacesNavigator$PointType SOURCE;

    static {
        DeliveryCargoFlowPlacesNavigator$PointType deliveryCargoFlowPlacesNavigator$PointType = new DeliveryCargoFlowPlacesNavigator$PointType("SOURCE", 0);
        SOURCE = deliveryCargoFlowPlacesNavigator$PointType;
        DeliveryCargoFlowPlacesNavigator$PointType deliveryCargoFlowPlacesNavigator$PointType2 = new DeliveryCargoFlowPlacesNavigator$PointType("DESTINATION", 1);
        DESTINATION = deliveryCargoFlowPlacesNavigator$PointType2;
        DeliveryCargoFlowPlacesNavigator$PointType[] deliveryCargoFlowPlacesNavigator$PointTypeArr = {deliveryCargoFlowPlacesNavigator$PointType, deliveryCargoFlowPlacesNavigator$PointType2};
        $VALUES = deliveryCargoFlowPlacesNavigator$PointTypeArr;
        $ENTRIES = a.a(deliveryCargoFlowPlacesNavigator$PointTypeArr);
    }

    public static DeliveryCargoFlowPlacesNavigator$PointType valueOf(String str) {
        return (DeliveryCargoFlowPlacesNavigator$PointType) Enum.valueOf(DeliveryCargoFlowPlacesNavigator$PointType.class, str);
    }

    public static DeliveryCargoFlowPlacesNavigator$PointType[] values() {
        return (DeliveryCargoFlowPlacesNavigator$PointType[]) $VALUES.clone();
    }
}
