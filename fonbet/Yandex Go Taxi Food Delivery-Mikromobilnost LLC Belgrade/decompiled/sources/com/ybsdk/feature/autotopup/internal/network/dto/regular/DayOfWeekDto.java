package com.ybsdk.feature.autotopup.internal.network.dto.regular;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/DayOfWeekDto;", "", "<init>", "(Ljava/lang/String;I)V", "MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DayOfWeekDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DayOfWeekDto[] $VALUES;
    public static final DayOfWeekDto MON = new DayOfWeekDto("MON", 0);
    public static final DayOfWeekDto TUE = new DayOfWeekDto("TUE", 1);
    public static final DayOfWeekDto WED = new DayOfWeekDto("WED", 2);
    public static final DayOfWeekDto THU = new DayOfWeekDto("THU", 3);
    public static final DayOfWeekDto FRI = new DayOfWeekDto("FRI", 4);
    public static final DayOfWeekDto SAT = new DayOfWeekDto("SAT", 5);
    public static final DayOfWeekDto SUN = new DayOfWeekDto("SUN", 6);

    private static final /* synthetic */ DayOfWeekDto[] $values() {
        return new DayOfWeekDto[]{MON, TUE, WED, THU, FRI, SAT, SUN};
    }

    static {
        DayOfWeekDto[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private DayOfWeekDto(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static DayOfWeekDto valueOf(String str) {
        return (DayOfWeekDto) Enum.valueOf(DayOfWeekDto.class, str);
    }

    public static DayOfWeekDto[] values() {
        return (DayOfWeekDto[]) $VALUES.clone();
    }
}
