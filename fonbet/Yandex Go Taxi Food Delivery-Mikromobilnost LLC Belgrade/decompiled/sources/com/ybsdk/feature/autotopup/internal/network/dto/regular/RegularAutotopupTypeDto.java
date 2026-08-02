package com.ybsdk.feature.autotopup.internal.network.dto.regular;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/RegularAutotopupTypeDto;", "", "<init>", "(Ljava/lang/String;I)V", "ONCE_PER_WEEK", "ONCE_PER_MONTH", "TWICE_PER_MONTH", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RegularAutotopupTypeDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ RegularAutotopupTypeDto[] $VALUES;
    public static final RegularAutotopupTypeDto ONCE_PER_WEEK = new RegularAutotopupTypeDto("ONCE_PER_WEEK", 0);
    public static final RegularAutotopupTypeDto ONCE_PER_MONTH = new RegularAutotopupTypeDto("ONCE_PER_MONTH", 1);
    public static final RegularAutotopupTypeDto TWICE_PER_MONTH = new RegularAutotopupTypeDto("TWICE_PER_MONTH", 2);

    private static final /* synthetic */ RegularAutotopupTypeDto[] $values() {
        return new RegularAutotopupTypeDto[]{ONCE_PER_WEEK, ONCE_PER_MONTH, TWICE_PER_MONTH};
    }

    static {
        RegularAutotopupTypeDto[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private RegularAutotopupTypeDto(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static RegularAutotopupTypeDto valueOf(String str) {
        return (RegularAutotopupTypeDto) Enum.valueOf(RegularAutotopupTypeDto.class, str);
    }

    public static RegularAutotopupTypeDto[] values() {
        return (RegularAutotopupTypeDto[]) $VALUES.clone();
    }
}
