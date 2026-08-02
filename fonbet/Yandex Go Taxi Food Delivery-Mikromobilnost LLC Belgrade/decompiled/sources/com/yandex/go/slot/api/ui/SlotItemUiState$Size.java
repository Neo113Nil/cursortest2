package com.yandex.go.slot.api.ui;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/yandex/go/slot/api/ui/SlotItemUiState$Size", "", "Lcom/yandex/go/slot/api/ui/SlotItemUiState$Size;", "XS", "S", "M", "L", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SlotItemUiState$Size {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SlotItemUiState$Size[] $VALUES;
    public static final SlotItemUiState$Size L;
    public static final SlotItemUiState$Size M;
    public static final SlotItemUiState$Size S;
    public static final SlotItemUiState$Size XS;

    static {
        SlotItemUiState$Size slotItemUiState$Size = new SlotItemUiState$Size("XS", 0);
        XS = slotItemUiState$Size;
        SlotItemUiState$Size slotItemUiState$Size2 = new SlotItemUiState$Size("S", 1);
        S = slotItemUiState$Size2;
        SlotItemUiState$Size slotItemUiState$Size3 = new SlotItemUiState$Size("M", 2);
        M = slotItemUiState$Size3;
        SlotItemUiState$Size slotItemUiState$Size4 = new SlotItemUiState$Size("L", 3);
        L = slotItemUiState$Size4;
        SlotItemUiState$Size[] slotItemUiState$SizeArr = {slotItemUiState$Size, slotItemUiState$Size2, slotItemUiState$Size3, slotItemUiState$Size4};
        $VALUES = slotItemUiState$SizeArr;
        $ENTRIES = a.a(slotItemUiState$SizeArr);
    }

    public static SlotItemUiState$Size valueOf(String str) {
        return (SlotItemUiState$Size) Enum.valueOf(SlotItemUiState$Size.class, str);
    }

    public static SlotItemUiState$Size[] values() {
        return (SlotItemUiState$Size[]) $VALUES.clone();
    }
}
