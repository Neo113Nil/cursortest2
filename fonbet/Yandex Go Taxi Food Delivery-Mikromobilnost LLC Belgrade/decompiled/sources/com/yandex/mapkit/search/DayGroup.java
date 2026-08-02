package com.yandex.mapkit.search;

import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'WEEKDAYS' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes15.dex */
public final class DayGroup {
    private static final /* synthetic */ DayGroup[] $VALUES;
    public static final DayGroup EVERYDAY;
    public static final DayGroup FRIDAY;
    public static final DayGroup MONDAY;
    public static final DayGroup NONE = new DayGroup(JCP.RAW_PREFIX, 0, 0);
    public static final DayGroup SATURDAY;
    public static final DayGroup SUNDAY;
    public static final DayGroup THURSDAY;
    public static final DayGroup TUESDAY;
    public static final DayGroup WEDNESDAY;
    public static final DayGroup WEEKDAYS;
    public static final DayGroup WEEKEND;
    public final int value;

    private static /* synthetic */ DayGroup[] $values() {
        return new DayGroup[]{NONE, SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, WEEKDAYS, WEEKEND, EVERYDAY};
    }

    static {
        DayGroup dayGroup = new DayGroup("SUNDAY", 1, 1);
        SUNDAY = dayGroup;
        DayGroup dayGroup2 = new DayGroup("MONDAY", 2, 2);
        MONDAY = dayGroup2;
        DayGroup dayGroup3 = new DayGroup("TUESDAY", 3, 4);
        TUESDAY = dayGroup3;
        DayGroup dayGroup4 = new DayGroup("WEDNESDAY", 4, 8);
        WEDNESDAY = dayGroup4;
        DayGroup dayGroup5 = new DayGroup("THURSDAY", 5, 16);
        THURSDAY = dayGroup5;
        DayGroup dayGroup6 = new DayGroup("FRIDAY", 6, 32);
        FRIDAY = dayGroup6;
        DayGroup dayGroup7 = new DayGroup("SATURDAY", 7, 64);
        SATURDAY = dayGroup7;
        DayGroup dayGroup8 = new DayGroup("WEEKDAYS", 8, dayGroup2.value | dayGroup3.value | dayGroup4.value | dayGroup5.value | dayGroup6.value);
        WEEKDAYS = dayGroup8;
        DayGroup dayGroup9 = new DayGroup("WEEKEND", 9, dayGroup.value | dayGroup7.value);
        WEEKEND = dayGroup9;
        EVERYDAY = new DayGroup("EVERYDAY", 10, dayGroup9.value | dayGroup8.value);
        $VALUES = $values();
    }

    private DayGroup(String str, int i, int i2) {
        this.value = i2;
    }

    public static DayGroup valueOf(String str) {
        return (DayGroup) Enum.valueOf(DayGroup.class, str);
    }

    public static DayGroup[] values() {
        return (DayGroup[]) $VALUES.clone();
    }
}
