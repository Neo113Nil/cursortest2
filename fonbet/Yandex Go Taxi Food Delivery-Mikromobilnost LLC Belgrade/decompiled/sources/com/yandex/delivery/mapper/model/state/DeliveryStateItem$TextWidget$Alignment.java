package com.yandex.delivery.mapper.model.state;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/delivery/mapper/model/state/DeliveryStateItem$TextWidget$Alignment", "", "Lcom/yandex/delivery/mapper/model/state/DeliveryStateItem$TextWidget$Alignment;", "LEAD", "CENTER", "TRAIL", "mapper"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DeliveryStateItem$TextWidget$Alignment {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DeliveryStateItem$TextWidget$Alignment[] $VALUES;
    public static final DeliveryStateItem$TextWidget$Alignment CENTER;
    public static final DeliveryStateItem$TextWidget$Alignment LEAD;
    public static final DeliveryStateItem$TextWidget$Alignment TRAIL;

    static {
        DeliveryStateItem$TextWidget$Alignment deliveryStateItem$TextWidget$Alignment = new DeliveryStateItem$TextWidget$Alignment("LEAD", 0);
        LEAD = deliveryStateItem$TextWidget$Alignment;
        DeliveryStateItem$TextWidget$Alignment deliveryStateItem$TextWidget$Alignment2 = new DeliveryStateItem$TextWidget$Alignment("CENTER", 1);
        CENTER = deliveryStateItem$TextWidget$Alignment2;
        DeliveryStateItem$TextWidget$Alignment deliveryStateItem$TextWidget$Alignment3 = new DeliveryStateItem$TextWidget$Alignment("TRAIL", 2);
        TRAIL = deliveryStateItem$TextWidget$Alignment3;
        DeliveryStateItem$TextWidget$Alignment[] deliveryStateItem$TextWidget$AlignmentArr = {deliveryStateItem$TextWidget$Alignment, deliveryStateItem$TextWidget$Alignment2, deliveryStateItem$TextWidget$Alignment3};
        $VALUES = deliveryStateItem$TextWidget$AlignmentArr;
        $ENTRIES = a.a(deliveryStateItem$TextWidget$AlignmentArr);
    }

    public static DeliveryStateItem$TextWidget$Alignment valueOf(String str) {
        return (DeliveryStateItem$TextWidget$Alignment) Enum.valueOf(DeliveryStateItem$TextWidget$Alignment.class, str);
    }

    public static DeliveryStateItem$TextWidget$Alignment[] values() {
        return (DeliveryStateItem$TextWidget$Alignment[]) $VALUES.clone();
    }
}
