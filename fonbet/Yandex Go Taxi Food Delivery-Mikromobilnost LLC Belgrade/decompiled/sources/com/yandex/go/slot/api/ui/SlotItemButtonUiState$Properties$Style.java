package com.yandex.go.slot.api.ui;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"com/yandex/go/slot/api/ui/SlotItemButtonUiState$Properties$Style", "", "Lcom/yandex/go/slot/api/ui/SlotItemButtonUiState$Properties$Style;", "MINOR", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SlotItemButtonUiState$Properties$Style {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SlotItemButtonUiState$Properties$Style[] $VALUES;
    public static final SlotItemButtonUiState$Properties$Style MINOR;

    static {
        SlotItemButtonUiState$Properties$Style slotItemButtonUiState$Properties$Style = new SlotItemButtonUiState$Properties$Style("MINOR", 0);
        MINOR = slotItemButtonUiState$Properties$Style;
        SlotItemButtonUiState$Properties$Style[] slotItemButtonUiState$Properties$StyleArr = {slotItemButtonUiState$Properties$Style};
        $VALUES = slotItemButtonUiState$Properties$StyleArr;
        $ENTRIES = a.a(slotItemButtonUiState$Properties$StyleArr);
    }

    public static SlotItemButtonUiState$Properties$Style valueOf(String str) {
        return (SlotItemButtonUiState$Properties$Style) Enum.valueOf(SlotItemButtonUiState$Properties$Style.class, str);
    }

    public static SlotItemButtonUiState$Properties$Style[] values() {
        return (SlotItemButtonUiState$Properties$Style[]) $VALUES.clone();
    }
}
