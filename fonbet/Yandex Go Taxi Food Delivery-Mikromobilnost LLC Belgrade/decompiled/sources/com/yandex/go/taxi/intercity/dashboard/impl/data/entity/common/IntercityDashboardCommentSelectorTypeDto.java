package com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.i8w;
import defpackage.k4o;
import defpackage.mbw;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/taxi/intercity/dashboard/impl/data/entity/common/IntercityDashboardCommentSelectorTypeDto;", "", "Companion", "mbw", "SUGGESTS", "DEFAULT", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class IntercityDashboardCommentSelectorTypeDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ IntercityDashboardCommentSelectorTypeDto[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final mbw Companion;
    public static final IntercityDashboardCommentSelectorTypeDto DEFAULT;
    public static final IntercityDashboardCommentSelectorTypeDto SUGGESTS;

    static {
        IntercityDashboardCommentSelectorTypeDto intercityDashboardCommentSelectorTypeDto = new IntercityDashboardCommentSelectorTypeDto("SUGGESTS", 0);
        SUGGESTS = intercityDashboardCommentSelectorTypeDto;
        IntercityDashboardCommentSelectorTypeDto intercityDashboardCommentSelectorTypeDto2 = new IntercityDashboardCommentSelectorTypeDto("DEFAULT", 1);
        DEFAULT = intercityDashboardCommentSelectorTypeDto2;
        IntercityDashboardCommentSelectorTypeDto[] intercityDashboardCommentSelectorTypeDtoArr = {intercityDashboardCommentSelectorTypeDto, intercityDashboardCommentSelectorTypeDto2};
        $VALUES = intercityDashboardCommentSelectorTypeDtoArr;
        $ENTRIES = kotlin.enums.a.a(intercityDashboardCommentSelectorTypeDtoArr);
        Companion = new mbw();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new i8w(14));
    }

    public static IntercityDashboardCommentSelectorTypeDto valueOf(String str) {
        return (IntercityDashboardCommentSelectorTypeDto) Enum.valueOf(IntercityDashboardCommentSelectorTypeDto.class, str);
    }

    public static IntercityDashboardCommentSelectorTypeDto[] values() {
        return (IntercityDashboardCommentSelectorTypeDto[]) $VALUES.clone();
    }
}
