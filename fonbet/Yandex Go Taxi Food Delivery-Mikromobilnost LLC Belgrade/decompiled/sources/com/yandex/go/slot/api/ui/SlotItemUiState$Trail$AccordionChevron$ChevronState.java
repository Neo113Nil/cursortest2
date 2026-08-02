package com.yandex.go.slot.api.ui;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/slot/api/ui/SlotItemUiState$Trail$AccordionChevron$ChevronState", "", "Lcom/yandex/go/slot/api/ui/SlotItemUiState$Trail$AccordionChevron$ChevronState;", "UP", "DOWN", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SlotItemUiState$Trail$AccordionChevron$ChevronState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SlotItemUiState$Trail$AccordionChevron$ChevronState[] $VALUES;
    public static final SlotItemUiState$Trail$AccordionChevron$ChevronState DOWN;
    public static final SlotItemUiState$Trail$AccordionChevron$ChevronState UP;

    static {
        SlotItemUiState$Trail$AccordionChevron$ChevronState slotItemUiState$Trail$AccordionChevron$ChevronState = new SlotItemUiState$Trail$AccordionChevron$ChevronState("UP", 0);
        UP = slotItemUiState$Trail$AccordionChevron$ChevronState;
        SlotItemUiState$Trail$AccordionChevron$ChevronState slotItemUiState$Trail$AccordionChevron$ChevronState2 = new SlotItemUiState$Trail$AccordionChevron$ChevronState("DOWN", 1);
        DOWN = slotItemUiState$Trail$AccordionChevron$ChevronState2;
        SlotItemUiState$Trail$AccordionChevron$ChevronState[] slotItemUiState$Trail$AccordionChevron$ChevronStateArr = {slotItemUiState$Trail$AccordionChevron$ChevronState, slotItemUiState$Trail$AccordionChevron$ChevronState2};
        $VALUES = slotItemUiState$Trail$AccordionChevron$ChevronStateArr;
        $ENTRIES = a.a(slotItemUiState$Trail$AccordionChevron$ChevronStateArr);
    }

    public static SlotItemUiState$Trail$AccordionChevron$ChevronState valueOf(String str) {
        return (SlotItemUiState$Trail$AccordionChevron$ChevronState) Enum.valueOf(SlotItemUiState$Trail$AccordionChevron$ChevronState.class, str);
    }

    public static SlotItemUiState$Trail$AccordionChevron$ChevronState[] values() {
        return (SlotItemUiState$Trail$AccordionChevron$ChevronState[]) $VALUES.clone();
    }
}
