package com.yandex.go.masstransit.sdk.core.design.slot.ui;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/masstransit/sdk/core/design/slot/ui/MasstransitSlotItemUiState$Body$Alignment", "", "Lcom/yandex/go/masstransit/sdk/core/design/slot/ui/MasstransitSlotItemUiState$Body$Alignment;", "START", "CENTER", "END", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MasstransitSlotItemUiState$Body$Alignment {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MasstransitSlotItemUiState$Body$Alignment[] $VALUES;
    public static final MasstransitSlotItemUiState$Body$Alignment CENTER;
    public static final MasstransitSlotItemUiState$Body$Alignment END;
    public static final MasstransitSlotItemUiState$Body$Alignment START;

    static {
        MasstransitSlotItemUiState$Body$Alignment masstransitSlotItemUiState$Body$Alignment = new MasstransitSlotItemUiState$Body$Alignment("START", 0);
        START = masstransitSlotItemUiState$Body$Alignment;
        MasstransitSlotItemUiState$Body$Alignment masstransitSlotItemUiState$Body$Alignment2 = new MasstransitSlotItemUiState$Body$Alignment("CENTER", 1);
        CENTER = masstransitSlotItemUiState$Body$Alignment2;
        MasstransitSlotItemUiState$Body$Alignment masstransitSlotItemUiState$Body$Alignment3 = new MasstransitSlotItemUiState$Body$Alignment("END", 2);
        END = masstransitSlotItemUiState$Body$Alignment3;
        MasstransitSlotItemUiState$Body$Alignment[] masstransitSlotItemUiState$Body$AlignmentArr = {masstransitSlotItemUiState$Body$Alignment, masstransitSlotItemUiState$Body$Alignment2, masstransitSlotItemUiState$Body$Alignment3};
        $VALUES = masstransitSlotItemUiState$Body$AlignmentArr;
        $ENTRIES = a.a(masstransitSlotItemUiState$Body$AlignmentArr);
    }

    public static MasstransitSlotItemUiState$Body$Alignment valueOf(String str) {
        return (MasstransitSlotItemUiState$Body$Alignment) Enum.valueOf(MasstransitSlotItemUiState$Body$Alignment.class, str);
    }

    public static MasstransitSlotItemUiState$Body$Alignment[] values() {
        return (MasstransitSlotItemUiState$Body$Alignment[]) $VALUES.clone();
    }
}
