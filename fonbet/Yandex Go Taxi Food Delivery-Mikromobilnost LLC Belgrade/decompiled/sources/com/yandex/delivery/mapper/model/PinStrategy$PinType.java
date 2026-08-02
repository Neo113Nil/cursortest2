package com.yandex.delivery.mapper.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/delivery/mapper/model/PinStrategy$PinType", "", "Lcom/yandex/delivery/mapper/model/PinStrategy$PinType;", "AUTO", "PEDESTRIAN", "mapper"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PinStrategy$PinType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PinStrategy$PinType[] $VALUES;
    public static final PinStrategy$PinType AUTO;
    public static final PinStrategy$PinType PEDESTRIAN;

    static {
        PinStrategy$PinType pinStrategy$PinType = new PinStrategy$PinType("AUTO", 0);
        AUTO = pinStrategy$PinType;
        PinStrategy$PinType pinStrategy$PinType2 = new PinStrategy$PinType("PEDESTRIAN", 1);
        PEDESTRIAN = pinStrategy$PinType2;
        PinStrategy$PinType[] pinStrategy$PinTypeArr = {pinStrategy$PinType, pinStrategy$PinType2};
        $VALUES = pinStrategy$PinTypeArr;
        $ENTRIES = a.a(pinStrategy$PinTypeArr);
    }

    public static PinStrategy$PinType valueOf(String str) {
        return (PinStrategy$PinType) Enum.valueOf(PinStrategy$PinType.class, str);
    }

    public static PinStrategy$PinType[] values() {
        return (PinStrategy$PinType[]) $VALUES.clone();
    }
}
