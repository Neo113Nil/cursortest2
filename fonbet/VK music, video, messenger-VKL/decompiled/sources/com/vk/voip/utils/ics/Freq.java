package com.vk.voip.utils.ics;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Freq.kt */
/* loaded from: classes7.dex */
public final class Freq {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ Freq[] $VALUES;
    public static final Freq DAILY;
    public static final Freq MONTHLY;
    public static final Freq WEEKDAYS;
    public static final Freq WEEKENDS;
    public static final Freq WEEKLY;
    public static final Freq YEARLY;
    private final String value;

    static {
        Freq freq = new Freq("DAILY", 0, "DAILY");
        DAILY = freq;
        Freq freq2 = new Freq("WEEKENDS", 1, "WEEKLY;BYDAY=SU,SA");
        WEEKENDS = freq2;
        Freq freq3 = new Freq("WEEKDAYS", 2, "WEEKLY;BYDAY=MO,TU,WE,TH,FR");
        WEEKDAYS = freq3;
        Freq freq4 = new Freq("WEEKLY", 3, "WEEKLY");
        WEEKLY = freq4;
        Freq freq5 = new Freq("MONTHLY", 4, "MONTHLY");
        MONTHLY = freq5;
        Freq freq6 = new Freq("YEARLY", 5, "YEARLY");
        YEARLY = freq6;
        Freq[] freqArr = {freq, freq2, freq3, freq4, freq5, freq6};
        $VALUES = freqArr;
        $ENTRIES = new asp(freqArr);
    }

    public Freq(String str, int i, String str2) {
        this.value = str2;
    }

    public static Freq valueOf(String str) {
        return (Freq) Enum.valueOf(Freq.class, str);
    }

    public static Freq[] values() {
        return (Freq[]) $VALUES.clone();
    }

    public final String h() {
        return this.value;
    }
}
