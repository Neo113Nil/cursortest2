package com.ybsdk.widgets.common.bottomsheet.daychoosers;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/ybsdk/widgets/common/bottomsheet/daychoosers/MonthDayChooserView$State$Mode", "", "Lcom/ybsdk/widgets/common/bottomsheet/daychoosers/MonthDayChooserView$State$Mode;", "<init>", "(Ljava/lang/String;I)V", "ONE_DATE", "TWO_DATES", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MonthDayChooserView$State$Mode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MonthDayChooserView$State$Mode[] $VALUES;
    public static final MonthDayChooserView$State$Mode ONE_DATE = new MonthDayChooserView$State$Mode("ONE_DATE", 0);
    public static final MonthDayChooserView$State$Mode TWO_DATES = new MonthDayChooserView$State$Mode("TWO_DATES", 1);

    private static final /* synthetic */ MonthDayChooserView$State$Mode[] $values() {
        return new MonthDayChooserView$State$Mode[]{ONE_DATE, TWO_DATES};
    }

    static {
        MonthDayChooserView$State$Mode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private MonthDayChooserView$State$Mode(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static MonthDayChooserView$State$Mode valueOf(String str) {
        return (MonthDayChooserView$State$Mode) Enum.valueOf(MonthDayChooserView$State$Mode.class, str);
    }

    public static MonthDayChooserView$State$Mode[] values() {
        return (MonthDayChooserView$State$Mode[]) $VALUES.clone();
    }
}
