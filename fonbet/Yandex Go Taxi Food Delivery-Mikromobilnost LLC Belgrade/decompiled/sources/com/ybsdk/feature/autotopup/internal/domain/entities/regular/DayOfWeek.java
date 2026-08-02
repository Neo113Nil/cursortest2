package com.ybsdk.feature.autotopup.internal.domain.entities.regular;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/domain/entities/regular/DayOfWeek;", "", "<init>", "(Ljava/lang/String;I)V", "MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DayOfWeek {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DayOfWeek[] $VALUES;
    public static final DayOfWeek MON = new DayOfWeek("MON", 0);
    public static final DayOfWeek TUE = new DayOfWeek("TUE", 1);
    public static final DayOfWeek WED = new DayOfWeek("WED", 2);
    public static final DayOfWeek THU = new DayOfWeek("THU", 3);
    public static final DayOfWeek FRI = new DayOfWeek("FRI", 4);
    public static final DayOfWeek SAT = new DayOfWeek("SAT", 5);
    public static final DayOfWeek SUN = new DayOfWeek("SUN", 6);

    private static final /* synthetic */ DayOfWeek[] $values() {
        return new DayOfWeek[]{MON, TUE, WED, THU, FRI, SAT, SUN};
    }

    static {
        DayOfWeek[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private DayOfWeek(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static DayOfWeek valueOf(String str) {
        return (DayOfWeek) Enum.valueOf(DayOfWeek.class, str);
    }

    public static DayOfWeek[] values() {
        return (DayOfWeek[]) $VALUES.clone();
    }
}
