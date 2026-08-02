package com.yandex.go.slot.api.ui;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/slot/api/ui/SlotItemUiState$Body$Ellipsize", "", "Lcom/yandex/go/slot/api/ui/SlotItemUiState$Body$Ellipsize;", JCP.RAW_PREFIX, "END", "MIDDLE", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SlotItemUiState$Body$Ellipsize {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SlotItemUiState$Body$Ellipsize[] $VALUES;
    public static final SlotItemUiState$Body$Ellipsize END;
    public static final SlotItemUiState$Body$Ellipsize MIDDLE;
    public static final SlotItemUiState$Body$Ellipsize NONE;

    static {
        SlotItemUiState$Body$Ellipsize slotItemUiState$Body$Ellipsize = new SlotItemUiState$Body$Ellipsize(JCP.RAW_PREFIX, 0);
        NONE = slotItemUiState$Body$Ellipsize;
        SlotItemUiState$Body$Ellipsize slotItemUiState$Body$Ellipsize2 = new SlotItemUiState$Body$Ellipsize("END", 1);
        END = slotItemUiState$Body$Ellipsize2;
        SlotItemUiState$Body$Ellipsize slotItemUiState$Body$Ellipsize3 = new SlotItemUiState$Body$Ellipsize("MIDDLE", 2);
        MIDDLE = slotItemUiState$Body$Ellipsize3;
        SlotItemUiState$Body$Ellipsize[] slotItemUiState$Body$EllipsizeArr = {slotItemUiState$Body$Ellipsize, slotItemUiState$Body$Ellipsize2, slotItemUiState$Body$Ellipsize3};
        $VALUES = slotItemUiState$Body$EllipsizeArr;
        $ENTRIES = a.a(slotItemUiState$Body$EllipsizeArr);
    }

    public static SlotItemUiState$Body$Ellipsize valueOf(String str) {
        return (SlotItemUiState$Body$Ellipsize) Enum.valueOf(SlotItemUiState$Body$Ellipsize.class, str);
    }

    public static SlotItemUiState$Body$Ellipsize[] values() {
        return (SlotItemUiState$Body$Ellipsize[]) $VALUES.clone();
    }
}
