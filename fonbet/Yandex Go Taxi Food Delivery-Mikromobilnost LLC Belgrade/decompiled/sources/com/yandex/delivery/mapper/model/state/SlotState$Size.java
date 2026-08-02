package com.yandex.delivery.mapper.model.state;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"com/yandex/delivery/mapper/model/state/SlotState$Size", "", "Lcom/yandex/delivery/mapper/model/state/SlotState$Size;", "XS", "S", "M", "L", "XL", "XXL", "mapper"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SlotState$Size {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SlotState$Size[] $VALUES;
    public static final SlotState$Size L;
    public static final SlotState$Size M;
    public static final SlotState$Size S;
    public static final SlotState$Size XL;
    public static final SlotState$Size XS;
    public static final SlotState$Size XXL;

    static {
        SlotState$Size slotState$Size = new SlotState$Size("XS", 0);
        XS = slotState$Size;
        SlotState$Size slotState$Size2 = new SlotState$Size("S", 1);
        S = slotState$Size2;
        SlotState$Size slotState$Size3 = new SlotState$Size("M", 2);
        M = slotState$Size3;
        SlotState$Size slotState$Size4 = new SlotState$Size("L", 3);
        L = slotState$Size4;
        SlotState$Size slotState$Size5 = new SlotState$Size("XL", 4);
        XL = slotState$Size5;
        SlotState$Size slotState$Size6 = new SlotState$Size("XXL", 5);
        XXL = slotState$Size6;
        SlotState$Size[] slotState$SizeArr = {slotState$Size, slotState$Size2, slotState$Size3, slotState$Size4, slotState$Size5, slotState$Size6};
        $VALUES = slotState$SizeArr;
        $ENTRIES = a.a(slotState$SizeArr);
    }

    public static SlotState$Size valueOf(String str) {
        return (SlotState$Size) Enum.valueOf(SlotState$Size.class, str);
    }

    public static SlotState$Size[] values() {
        return (SlotState$Size[]) $VALUES.clone();
    }
}
