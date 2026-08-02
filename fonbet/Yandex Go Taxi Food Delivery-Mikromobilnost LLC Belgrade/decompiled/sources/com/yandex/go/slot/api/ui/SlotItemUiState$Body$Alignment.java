package com.yandex.go.slot.api.ui;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/slot/api/ui/SlotItemUiState$Body$Alignment", "", "Lcom/yandex/go/slot/api/ui/SlotItemUiState$Body$Alignment;", "START", "CENTER", "END", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SlotItemUiState$Body$Alignment {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SlotItemUiState$Body$Alignment[] $VALUES;
    public static final SlotItemUiState$Body$Alignment CENTER;
    public static final SlotItemUiState$Body$Alignment END;
    public static final SlotItemUiState$Body$Alignment START;

    static {
        SlotItemUiState$Body$Alignment slotItemUiState$Body$Alignment = new SlotItemUiState$Body$Alignment("START", 0);
        START = slotItemUiState$Body$Alignment;
        SlotItemUiState$Body$Alignment slotItemUiState$Body$Alignment2 = new SlotItemUiState$Body$Alignment("CENTER", 1);
        CENTER = slotItemUiState$Body$Alignment2;
        SlotItemUiState$Body$Alignment slotItemUiState$Body$Alignment3 = new SlotItemUiState$Body$Alignment("END", 2);
        END = slotItemUiState$Body$Alignment3;
        SlotItemUiState$Body$Alignment[] slotItemUiState$Body$AlignmentArr = {slotItemUiState$Body$Alignment, slotItemUiState$Body$Alignment2, slotItemUiState$Body$Alignment3};
        $VALUES = slotItemUiState$Body$AlignmentArr;
        $ENTRIES = a.a(slotItemUiState$Body$AlignmentArr);
    }

    public static SlotItemUiState$Body$Alignment valueOf(String str) {
        return (SlotItemUiState$Body$Alignment) Enum.valueOf(SlotItemUiState$Body$Alignment.class, str);
    }

    public static SlotItemUiState$Body$Alignment[] values() {
        return (SlotItemUiState$Body$Alignment[]) $VALUES.clone();
    }
}
