package com.yandex.go.masstransit.sdk.core.design.slot.ui;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/yandex/go/masstransit/sdk/core/design/slot/ui/MasstransitSlotItemUiState$Size", "", "Lcom/yandex/go/masstransit/sdk/core/design/slot/ui/MasstransitSlotItemUiState$Size;", "XS", "S", "M", "L", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MasstransitSlotItemUiState$Size {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MasstransitSlotItemUiState$Size[] $VALUES;
    public static final MasstransitSlotItemUiState$Size L;
    public static final MasstransitSlotItemUiState$Size M;
    public static final MasstransitSlotItemUiState$Size S;
    public static final MasstransitSlotItemUiState$Size XS;

    static {
        MasstransitSlotItemUiState$Size masstransitSlotItemUiState$Size = new MasstransitSlotItemUiState$Size("XS", 0);
        XS = masstransitSlotItemUiState$Size;
        MasstransitSlotItemUiState$Size masstransitSlotItemUiState$Size2 = new MasstransitSlotItemUiState$Size("S", 1);
        S = masstransitSlotItemUiState$Size2;
        MasstransitSlotItemUiState$Size masstransitSlotItemUiState$Size3 = new MasstransitSlotItemUiState$Size("M", 2);
        M = masstransitSlotItemUiState$Size3;
        MasstransitSlotItemUiState$Size masstransitSlotItemUiState$Size4 = new MasstransitSlotItemUiState$Size("L", 3);
        L = masstransitSlotItemUiState$Size4;
        MasstransitSlotItemUiState$Size[] masstransitSlotItemUiState$SizeArr = {masstransitSlotItemUiState$Size, masstransitSlotItemUiState$Size2, masstransitSlotItemUiState$Size3, masstransitSlotItemUiState$Size4};
        $VALUES = masstransitSlotItemUiState$SizeArr;
        $ENTRIES = a.a(masstransitSlotItemUiState$SizeArr);
    }

    public static MasstransitSlotItemUiState$Size valueOf(String str) {
        return (MasstransitSlotItemUiState$Size) Enum.valueOf(MasstransitSlotItemUiState$Size.class, str);
    }

    public static MasstransitSlotItemUiState$Size[] values() {
        return (MasstransitSlotItemUiState$Size[]) $VALUES.clone();
    }
}
