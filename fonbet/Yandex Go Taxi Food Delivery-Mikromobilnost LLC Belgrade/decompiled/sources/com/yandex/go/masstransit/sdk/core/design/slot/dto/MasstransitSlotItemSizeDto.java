package com.yandex.go.masstransit.sdk.core.design.slot.dto;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.w410;
import defpackage.z410;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/masstransit/sdk/core/design/slot/dto/MasstransitSlotItemSizeDto;", "", "Companion", "z410", "XS", "S", "M", "L", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MasstransitSlotItemSizeDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MasstransitSlotItemSizeDto[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final z410 Companion;
    public static final MasstransitSlotItemSizeDto L;
    public static final MasstransitSlotItemSizeDto M;
    public static final MasstransitSlotItemSizeDto S;
    public static final MasstransitSlotItemSizeDto XS;

    static {
        MasstransitSlotItemSizeDto masstransitSlotItemSizeDto = new MasstransitSlotItemSizeDto("XS", 0);
        XS = masstransitSlotItemSizeDto;
        MasstransitSlotItemSizeDto masstransitSlotItemSizeDto2 = new MasstransitSlotItemSizeDto("S", 1);
        S = masstransitSlotItemSizeDto2;
        MasstransitSlotItemSizeDto masstransitSlotItemSizeDto3 = new MasstransitSlotItemSizeDto("M", 2);
        M = masstransitSlotItemSizeDto3;
        MasstransitSlotItemSizeDto masstransitSlotItemSizeDto4 = new MasstransitSlotItemSizeDto("L", 3);
        L = masstransitSlotItemSizeDto4;
        MasstransitSlotItemSizeDto[] masstransitSlotItemSizeDtoArr = {masstransitSlotItemSizeDto, masstransitSlotItemSizeDto2, masstransitSlotItemSizeDto3, masstransitSlotItemSizeDto4};
        $VALUES = masstransitSlotItemSizeDtoArr;
        $ENTRIES = kotlin.enums.a.a(masstransitSlotItemSizeDtoArr);
        Companion = new z410();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new w410(1));
    }

    public static MasstransitSlotItemSizeDto valueOf(String str) {
        return (MasstransitSlotItemSizeDto) Enum.valueOf(MasstransitSlotItemSizeDto.class, str);
    }

    public static MasstransitSlotItemSizeDto[] values() {
        return (MasstransitSlotItemSizeDto[]) $VALUES.clone();
    }
}
