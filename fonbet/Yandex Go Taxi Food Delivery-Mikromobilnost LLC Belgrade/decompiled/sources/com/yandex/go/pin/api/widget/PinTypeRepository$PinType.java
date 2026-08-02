package com.yandex.go.pin.api.widget;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/pin/api/widget/PinTypeRepository$PinType", "", "Lcom/yandex/go/pin/api/widget/PinTypeRepository$PinType;", "V1", "V2", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PinTypeRepository$PinType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PinTypeRepository$PinType[] $VALUES;
    public static final PinTypeRepository$PinType V1;
    public static final PinTypeRepository$PinType V2;

    static {
        PinTypeRepository$PinType pinTypeRepository$PinType = new PinTypeRepository$PinType("V1", 0);
        V1 = pinTypeRepository$PinType;
        PinTypeRepository$PinType pinTypeRepository$PinType2 = new PinTypeRepository$PinType("V2", 1);
        V2 = pinTypeRepository$PinType2;
        PinTypeRepository$PinType[] pinTypeRepository$PinTypeArr = {pinTypeRepository$PinType, pinTypeRepository$PinType2};
        $VALUES = pinTypeRepository$PinTypeArr;
        $ENTRIES = kotlin.enums.a.a(pinTypeRepository$PinTypeArr);
    }

    public static PinTypeRepository$PinType valueOf(String str) {
        return (PinTypeRepository$PinType) Enum.valueOf(PinTypeRepository$PinType.class, str);
    }

    public static PinTypeRepository$PinType[] values() {
        return (PinTypeRepository$PinType[]) $VALUES.clone();
    }
}
