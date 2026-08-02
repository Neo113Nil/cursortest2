package com.yandex.go.masstransit.sdk.core.design.slot.ui;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/masstransit/sdk/core/design/slot/ui/MasstransitSlotItemUiState$Body$Ellipsize", "", "Lcom/yandex/go/masstransit/sdk/core/design/slot/ui/MasstransitSlotItemUiState$Body$Ellipsize;", JCP.RAW_PREFIX, "END", "MIDDLE", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MasstransitSlotItemUiState$Body$Ellipsize {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MasstransitSlotItemUiState$Body$Ellipsize[] $VALUES;
    public static final MasstransitSlotItemUiState$Body$Ellipsize END;
    public static final MasstransitSlotItemUiState$Body$Ellipsize MIDDLE;
    public static final MasstransitSlotItemUiState$Body$Ellipsize NONE;

    static {
        MasstransitSlotItemUiState$Body$Ellipsize masstransitSlotItemUiState$Body$Ellipsize = new MasstransitSlotItemUiState$Body$Ellipsize(JCP.RAW_PREFIX, 0);
        NONE = masstransitSlotItemUiState$Body$Ellipsize;
        MasstransitSlotItemUiState$Body$Ellipsize masstransitSlotItemUiState$Body$Ellipsize2 = new MasstransitSlotItemUiState$Body$Ellipsize("END", 1);
        END = masstransitSlotItemUiState$Body$Ellipsize2;
        MasstransitSlotItemUiState$Body$Ellipsize masstransitSlotItemUiState$Body$Ellipsize3 = new MasstransitSlotItemUiState$Body$Ellipsize("MIDDLE", 2);
        MIDDLE = masstransitSlotItemUiState$Body$Ellipsize3;
        MasstransitSlotItemUiState$Body$Ellipsize[] masstransitSlotItemUiState$Body$EllipsizeArr = {masstransitSlotItemUiState$Body$Ellipsize, masstransitSlotItemUiState$Body$Ellipsize2, masstransitSlotItemUiState$Body$Ellipsize3};
        $VALUES = masstransitSlotItemUiState$Body$EllipsizeArr;
        $ENTRIES = a.a(masstransitSlotItemUiState$Body$EllipsizeArr);
    }

    public static MasstransitSlotItemUiState$Body$Ellipsize valueOf(String str) {
        return (MasstransitSlotItemUiState$Body$Ellipsize) Enum.valueOf(MasstransitSlotItemUiState$Body$Ellipsize.class, str);
    }

    public static MasstransitSlotItemUiState$Body$Ellipsize[] values() {
        return (MasstransitSlotItemUiState$Body$Ellipsize[]) $VALUES.clone();
    }
}
