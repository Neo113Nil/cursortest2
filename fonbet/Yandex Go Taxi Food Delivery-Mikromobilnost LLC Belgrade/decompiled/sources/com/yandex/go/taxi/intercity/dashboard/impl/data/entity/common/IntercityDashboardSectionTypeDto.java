package com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.ojw;
import defpackage.pjw;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCSP.tools.common.window.id.IDialogId;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/yandex/go/taxi/intercity/dashboard/impl/data/entity/common/IntercityDashboardSectionTypeDto;", "", "Companion", "pjw", IDialogId.INTENT_EXTRA_IN_HEADER, "ADDRESS_SELECTOR", "DUE_SELECTOR", "TARIFF_SELECTOR", "CAROUSEL", "SEATS_SELECTOR", "COMMENT_SELECTOR", "UNKNOWN", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class IntercityDashboardSectionTypeDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ IntercityDashboardSectionTypeDto[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final IntercityDashboardSectionTypeDto ADDRESS_SELECTOR;
    public static final IntercityDashboardSectionTypeDto CAROUSEL;
    public static final IntercityDashboardSectionTypeDto COMMENT_SELECTOR;
    public static final pjw Companion;
    public static final IntercityDashboardSectionTypeDto DUE_SELECTOR;
    public static final IntercityDashboardSectionTypeDto HEADER;
    public static final IntercityDashboardSectionTypeDto SEATS_SELECTOR;
    public static final IntercityDashboardSectionTypeDto TARIFF_SELECTOR;
    public static final IntercityDashboardSectionTypeDto UNKNOWN;

    static {
        IntercityDashboardSectionTypeDto intercityDashboardSectionTypeDto = new IntercityDashboardSectionTypeDto(IDialogId.INTENT_EXTRA_IN_HEADER, 0);
        HEADER = intercityDashboardSectionTypeDto;
        IntercityDashboardSectionTypeDto intercityDashboardSectionTypeDto2 = new IntercityDashboardSectionTypeDto("ADDRESS_SELECTOR", 1);
        ADDRESS_SELECTOR = intercityDashboardSectionTypeDto2;
        IntercityDashboardSectionTypeDto intercityDashboardSectionTypeDto3 = new IntercityDashboardSectionTypeDto("DUE_SELECTOR", 2);
        DUE_SELECTOR = intercityDashboardSectionTypeDto3;
        IntercityDashboardSectionTypeDto intercityDashboardSectionTypeDto4 = new IntercityDashboardSectionTypeDto("TARIFF_SELECTOR", 3);
        TARIFF_SELECTOR = intercityDashboardSectionTypeDto4;
        IntercityDashboardSectionTypeDto intercityDashboardSectionTypeDto5 = new IntercityDashboardSectionTypeDto("CAROUSEL", 4);
        CAROUSEL = intercityDashboardSectionTypeDto5;
        IntercityDashboardSectionTypeDto intercityDashboardSectionTypeDto6 = new IntercityDashboardSectionTypeDto("SEATS_SELECTOR", 5);
        SEATS_SELECTOR = intercityDashboardSectionTypeDto6;
        IntercityDashboardSectionTypeDto intercityDashboardSectionTypeDto7 = new IntercityDashboardSectionTypeDto("COMMENT_SELECTOR", 6);
        COMMENT_SELECTOR = intercityDashboardSectionTypeDto7;
        IntercityDashboardSectionTypeDto intercityDashboardSectionTypeDto8 = new IntercityDashboardSectionTypeDto("UNKNOWN", 7);
        UNKNOWN = intercityDashboardSectionTypeDto8;
        IntercityDashboardSectionTypeDto[] intercityDashboardSectionTypeDtoArr = {intercityDashboardSectionTypeDto, intercityDashboardSectionTypeDto2, intercityDashboardSectionTypeDto3, intercityDashboardSectionTypeDto4, intercityDashboardSectionTypeDto5, intercityDashboardSectionTypeDto6, intercityDashboardSectionTypeDto7, intercityDashboardSectionTypeDto8};
        $VALUES = intercityDashboardSectionTypeDtoArr;
        $ENTRIES = kotlin.enums.a.a(intercityDashboardSectionTypeDtoArr);
        Companion = new pjw();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ojw(0));
    }

    public static IntercityDashboardSectionTypeDto valueOf(String str) {
        return (IntercityDashboardSectionTypeDto) Enum.valueOf(IntercityDashboardSectionTypeDto.class, str);
    }

    public static IntercityDashboardSectionTypeDto[] values() {
        return (IntercityDashboardSectionTypeDto[]) $VALUES.clone();
    }
}
