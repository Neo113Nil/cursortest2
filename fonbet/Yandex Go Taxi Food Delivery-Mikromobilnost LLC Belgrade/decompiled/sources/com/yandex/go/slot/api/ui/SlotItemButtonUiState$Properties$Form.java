package com.yandex.go.slot.api.ui;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/slot/api/ui/SlotItemButtonUiState$Properties$Form", "", "Lcom/yandex/go/slot/api/ui/SlotItemButtonUiState$Properties$Form;", "SQUIRCLE", "CIRCLE", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SlotItemButtonUiState$Properties$Form {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SlotItemButtonUiState$Properties$Form[] $VALUES;
    public static final SlotItemButtonUiState$Properties$Form CIRCLE;
    public static final SlotItemButtonUiState$Properties$Form SQUIRCLE;

    static {
        SlotItemButtonUiState$Properties$Form slotItemButtonUiState$Properties$Form = new SlotItemButtonUiState$Properties$Form("SQUIRCLE", 0);
        SQUIRCLE = slotItemButtonUiState$Properties$Form;
        SlotItemButtonUiState$Properties$Form slotItemButtonUiState$Properties$Form2 = new SlotItemButtonUiState$Properties$Form("CIRCLE", 1);
        CIRCLE = slotItemButtonUiState$Properties$Form2;
        SlotItemButtonUiState$Properties$Form[] slotItemButtonUiState$Properties$FormArr = {slotItemButtonUiState$Properties$Form, slotItemButtonUiState$Properties$Form2};
        $VALUES = slotItemButtonUiState$Properties$FormArr;
        $ENTRIES = a.a(slotItemButtonUiState$Properties$FormArr);
    }

    public static SlotItemButtonUiState$Properties$Form valueOf(String str) {
        return (SlotItemButtonUiState$Properties$Form) Enum.valueOf(SlotItemButtonUiState$Properties$Form.class, str);
    }

    public static SlotItemButtonUiState$Properties$Form[] values() {
        return (SlotItemButtonUiState$Properties$Form[]) $VALUES.clone();
    }
}
