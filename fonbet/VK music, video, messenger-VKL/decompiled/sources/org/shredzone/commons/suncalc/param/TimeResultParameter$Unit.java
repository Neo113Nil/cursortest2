package org.shredzone.commons.suncalc.param;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class TimeResultParameter$Unit {
    private static final /* synthetic */ TimeResultParameter$Unit[] $VALUES;
    public static final TimeResultParameter$Unit DAYS;
    public static final TimeResultParameter$Unit HOURS;
    public static final TimeResultParameter$Unit MINUTES;
    public static final TimeResultParameter$Unit SECONDS;

    static {
        TimeResultParameter$Unit timeResultParameter$Unit = new TimeResultParameter$Unit("SECONDS", 0);
        SECONDS = timeResultParameter$Unit;
        TimeResultParameter$Unit timeResultParameter$Unit2 = new TimeResultParameter$Unit("MINUTES", 1);
        MINUTES = timeResultParameter$Unit2;
        TimeResultParameter$Unit timeResultParameter$Unit3 = new TimeResultParameter$Unit("HOURS", 2);
        HOURS = timeResultParameter$Unit3;
        TimeResultParameter$Unit timeResultParameter$Unit4 = new TimeResultParameter$Unit("DAYS", 3);
        DAYS = timeResultParameter$Unit4;
        $VALUES = new TimeResultParameter$Unit[]{timeResultParameter$Unit, timeResultParameter$Unit2, timeResultParameter$Unit3, timeResultParameter$Unit4};
    }

    public TimeResultParameter$Unit() {
        throw null;
    }

    public static TimeResultParameter$Unit valueOf(String str) {
        return (TimeResultParameter$Unit) Enum.valueOf(TimeResultParameter$Unit.class, str);
    }

    public static TimeResultParameter$Unit[] values() {
        return (TimeResultParameter$Unit[]) $VALUES.clone();
    }
}
