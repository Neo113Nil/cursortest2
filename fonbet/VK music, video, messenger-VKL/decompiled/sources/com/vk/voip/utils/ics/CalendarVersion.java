package com.vk.voip.utils.ics;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CalendarVersion.kt */
/* loaded from: classes7.dex */
public final class CalendarVersion {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CalendarVersion[] $VALUES;
    public static final CalendarVersion V1;
    public static final CalendarVersion V2;
    private final String value;

    static {
        CalendarVersion calendarVersion = new CalendarVersion("V1", 0, "1.0");
        V1 = calendarVersion;
        CalendarVersion calendarVersion2 = new CalendarVersion("V2", 1, "2.0");
        V2 = calendarVersion2;
        CalendarVersion[] calendarVersionArr = {calendarVersion, calendarVersion2};
        $VALUES = calendarVersionArr;
        $ENTRIES = new asp(calendarVersionArr);
    }

    public CalendarVersion(String str, int i, String str2) {
        this.value = str2;
    }

    public static CalendarVersion valueOf(String str) {
        return (CalendarVersion) Enum.valueOf(CalendarVersion.class, str);
    }

    public static CalendarVersion[] values() {
        return (CalendarVersion[]) $VALUES.clone();
    }

    public final String h() {
        return this.value;
    }
}
