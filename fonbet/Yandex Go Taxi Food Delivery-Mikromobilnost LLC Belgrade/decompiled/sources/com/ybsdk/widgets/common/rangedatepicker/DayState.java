package com.ybsdk.widgets.common.rangedatepicker;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/ybsdk/widgets/common/rangedatepicker/DayState;", "", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "TODAY", "RANGE_START", "RANGE_END", "IN_RANGE", "SINGLE_SELECTION", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DayState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DayState[] $VALUES;
    public static final DayState DEFAULT = new DayState("DEFAULT", 0);
    public static final DayState TODAY = new DayState("TODAY", 1);
    public static final DayState RANGE_START = new DayState("RANGE_START", 2);
    public static final DayState RANGE_END = new DayState("RANGE_END", 3);
    public static final DayState IN_RANGE = new DayState("IN_RANGE", 4);
    public static final DayState SINGLE_SELECTION = new DayState("SINGLE_SELECTION", 5);

    private static final /* synthetic */ DayState[] $values() {
        return new DayState[]{DEFAULT, TODAY, RANGE_START, RANGE_END, IN_RANGE, SINGLE_SELECTION};
    }

    static {
        DayState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private DayState(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static DayState valueOf(String str) {
        return (DayState) Enum.valueOf(DayState.class, str);
    }

    public static DayState[] values() {
        return (DayState[]) $VALUES.clone();
    }
}
