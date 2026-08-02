package com.yandex.delivery.mapper.model.state;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/delivery/mapper/model/state/DeliveryStateItem$Barcode$BarcodeOrientation", "", "Lcom/yandex/delivery/mapper/model/state/DeliveryStateItem$Barcode$BarcodeOrientation;", "VERTICAL", "HORIZONTAL", "mapper"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DeliveryStateItem$Barcode$BarcodeOrientation {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DeliveryStateItem$Barcode$BarcodeOrientation[] $VALUES;
    public static final DeliveryStateItem$Barcode$BarcodeOrientation HORIZONTAL;
    public static final DeliveryStateItem$Barcode$BarcodeOrientation VERTICAL;

    static {
        DeliveryStateItem$Barcode$BarcodeOrientation deliveryStateItem$Barcode$BarcodeOrientation = new DeliveryStateItem$Barcode$BarcodeOrientation("VERTICAL", 0);
        VERTICAL = deliveryStateItem$Barcode$BarcodeOrientation;
        DeliveryStateItem$Barcode$BarcodeOrientation deliveryStateItem$Barcode$BarcodeOrientation2 = new DeliveryStateItem$Barcode$BarcodeOrientation("HORIZONTAL", 1);
        HORIZONTAL = deliveryStateItem$Barcode$BarcodeOrientation2;
        DeliveryStateItem$Barcode$BarcodeOrientation[] deliveryStateItem$Barcode$BarcodeOrientationArr = {deliveryStateItem$Barcode$BarcodeOrientation, deliveryStateItem$Barcode$BarcodeOrientation2};
        $VALUES = deliveryStateItem$Barcode$BarcodeOrientationArr;
        $ENTRIES = a.a(deliveryStateItem$Barcode$BarcodeOrientationArr);
    }

    public static DeliveryStateItem$Barcode$BarcodeOrientation valueOf(String str) {
        return (DeliveryStateItem$Barcode$BarcodeOrientation) Enum.valueOf(DeliveryStateItem$Barcode$BarcodeOrientation.class, str);
    }

    public static DeliveryStateItem$Barcode$BarcodeOrientation[] values() {
        return (DeliveryStateItem$Barcode$BarcodeOrientation[]) $VALUES.clone();
    }
}
