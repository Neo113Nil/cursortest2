package com.yandex.go.slot.dto;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.lrs0;
import defpackage.tqs0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/slot/dto/SlotItemSizeDto;", "", "Companion", "lrs0", "XS", "S", "M", "L", "go-client-android.features.slot:dto"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SlotItemSizeDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SlotItemSizeDto[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final lrs0 Companion;
    public static final SlotItemSizeDto L;
    public static final SlotItemSizeDto M;
    public static final SlotItemSizeDto S;
    public static final SlotItemSizeDto XS;

    static {
        SlotItemSizeDto slotItemSizeDto = new SlotItemSizeDto("XS", 0);
        XS = slotItemSizeDto;
        SlotItemSizeDto slotItemSizeDto2 = new SlotItemSizeDto("S", 1);
        S = slotItemSizeDto2;
        SlotItemSizeDto slotItemSizeDto3 = new SlotItemSizeDto("M", 2);
        M = slotItemSizeDto3;
        SlotItemSizeDto slotItemSizeDto4 = new SlotItemSizeDto("L", 3);
        L = slotItemSizeDto4;
        SlotItemSizeDto[] slotItemSizeDtoArr = {slotItemSizeDto, slotItemSizeDto2, slotItemSizeDto3, slotItemSizeDto4};
        $VALUES = slotItemSizeDtoArr;
        $ENTRIES = kotlin.enums.a.a(slotItemSizeDtoArr);
        Companion = new lrs0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new tqs0(9));
    }

    public static SlotItemSizeDto valueOf(String str) {
        return (SlotItemSizeDto) Enum.valueOf(SlotItemSizeDto.class, str);
    }

    public static SlotItemSizeDto[] values() {
        return (SlotItemSizeDto[]) $VALUES.clone();
    }
}
