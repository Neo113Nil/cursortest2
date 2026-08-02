package com.ybsdk.widgets.common.bottomsheet.daychoosers;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"com/ybsdk/widgets/common/bottomsheet/daychoosers/WeekDayChooserView$State$WeekDay", "", "Lcom/ybsdk/widgets/common/bottomsheet/daychoosers/WeekDayChooserView$State$WeekDay;", "<init>", "(Ljava/lang/String;I)V", "MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WeekDayChooserView$State$WeekDay {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ WeekDayChooserView$State$WeekDay[] $VALUES;
    public static final WeekDayChooserView$State$WeekDay MON = new WeekDayChooserView$State$WeekDay("MON", 0);
    public static final WeekDayChooserView$State$WeekDay TUE = new WeekDayChooserView$State$WeekDay("TUE", 1);
    public static final WeekDayChooserView$State$WeekDay WED = new WeekDayChooserView$State$WeekDay("WED", 2);
    public static final WeekDayChooserView$State$WeekDay THU = new WeekDayChooserView$State$WeekDay("THU", 3);
    public static final WeekDayChooserView$State$WeekDay FRI = new WeekDayChooserView$State$WeekDay("FRI", 4);
    public static final WeekDayChooserView$State$WeekDay SAT = new WeekDayChooserView$State$WeekDay("SAT", 5);
    public static final WeekDayChooserView$State$WeekDay SUN = new WeekDayChooserView$State$WeekDay("SUN", 6);

    private static final /* synthetic */ WeekDayChooserView$State$WeekDay[] $values() {
        return new WeekDayChooserView$State$WeekDay[]{MON, TUE, WED, THU, FRI, SAT, SUN};
    }

    static {
        WeekDayChooserView$State$WeekDay[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private WeekDayChooserView$State$WeekDay(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static WeekDayChooserView$State$WeekDay valueOf(String str) {
        return (WeekDayChooserView$State$WeekDay) Enum.valueOf(WeekDayChooserView$State$WeekDay.class, str);
    }

    public static WeekDayChooserView$State$WeekDay[] values() {
        return (WeekDayChooserView$State$WeekDay[]) $VALUES.clone();
    }
}
