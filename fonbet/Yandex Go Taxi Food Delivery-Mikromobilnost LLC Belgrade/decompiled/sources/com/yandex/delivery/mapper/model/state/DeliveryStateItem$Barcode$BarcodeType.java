package com.yandex.delivery.mapper.model.state;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/delivery/mapper/model/state/DeliveryStateItem$Barcode$BarcodeType", "", "Lcom/yandex/delivery/mapper/model/state/DeliveryStateItem$Barcode$BarcodeType;", "LINEAR", "QR", "mapper"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DeliveryStateItem$Barcode$BarcodeType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DeliveryStateItem$Barcode$BarcodeType[] $VALUES;
    public static final DeliveryStateItem$Barcode$BarcodeType LINEAR;
    public static final DeliveryStateItem$Barcode$BarcodeType QR;

    static {
        DeliveryStateItem$Barcode$BarcodeType deliveryStateItem$Barcode$BarcodeType = new DeliveryStateItem$Barcode$BarcodeType("LINEAR", 0);
        LINEAR = deliveryStateItem$Barcode$BarcodeType;
        DeliveryStateItem$Barcode$BarcodeType deliveryStateItem$Barcode$BarcodeType2 = new DeliveryStateItem$Barcode$BarcodeType("QR", 1);
        QR = deliveryStateItem$Barcode$BarcodeType2;
        DeliveryStateItem$Barcode$BarcodeType[] deliveryStateItem$Barcode$BarcodeTypeArr = {deliveryStateItem$Barcode$BarcodeType, deliveryStateItem$Barcode$BarcodeType2};
        $VALUES = deliveryStateItem$Barcode$BarcodeTypeArr;
        $ENTRIES = a.a(deliveryStateItem$Barcode$BarcodeTypeArr);
    }

    public static DeliveryStateItem$Barcode$BarcodeType valueOf(String str) {
        return (DeliveryStateItem$Barcode$BarcodeType) Enum.valueOf(DeliveryStateItem$Barcode$BarcodeType.class, str);
    }

    public static DeliveryStateItem$Barcode$BarcodeType[] values() {
        return (DeliveryStateItem$Barcode$BarcodeType[]) $VALUES.clone();
    }
}
