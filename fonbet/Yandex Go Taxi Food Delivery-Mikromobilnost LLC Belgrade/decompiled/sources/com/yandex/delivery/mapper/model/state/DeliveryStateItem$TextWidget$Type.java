package com.yandex.delivery.mapper.model.state;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/delivery/mapper/model/state/DeliveryStateItem$TextWidget$Type", "", "Lcom/yandex/delivery/mapper/model/state/DeliveryStateItem$TextWidget$Type;", "EXPANDABLE", "FIXED", "mapper"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DeliveryStateItem$TextWidget$Type {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DeliveryStateItem$TextWidget$Type[] $VALUES;
    public static final DeliveryStateItem$TextWidget$Type EXPANDABLE;
    public static final DeliveryStateItem$TextWidget$Type FIXED;

    static {
        DeliveryStateItem$TextWidget$Type deliveryStateItem$TextWidget$Type = new DeliveryStateItem$TextWidget$Type("EXPANDABLE", 0);
        EXPANDABLE = deliveryStateItem$TextWidget$Type;
        DeliveryStateItem$TextWidget$Type deliveryStateItem$TextWidget$Type2 = new DeliveryStateItem$TextWidget$Type("FIXED", 1);
        FIXED = deliveryStateItem$TextWidget$Type2;
        DeliveryStateItem$TextWidget$Type[] deliveryStateItem$TextWidget$TypeArr = {deliveryStateItem$TextWidget$Type, deliveryStateItem$TextWidget$Type2};
        $VALUES = deliveryStateItem$TextWidget$TypeArr;
        $ENTRIES = a.a(deliveryStateItem$TextWidget$TypeArr);
    }

    public static DeliveryStateItem$TextWidget$Type valueOf(String str) {
        return (DeliveryStateItem$TextWidget$Type) Enum.valueOf(DeliveryStateItem$TextWidget$Type.class, str);
    }

    public static DeliveryStateItem$TextWidget$Type[] values() {
        return (DeliveryStateItem$TextWidget$Type[]) $VALUES.clone();
    }
}
