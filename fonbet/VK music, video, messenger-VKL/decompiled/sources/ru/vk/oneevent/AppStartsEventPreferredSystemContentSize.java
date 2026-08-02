package ru.vk.oneevent;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppStartsEventPreferredSystemContentSize.kt */
/* loaded from: classes9.dex */
public final class AppStartsEventPreferredSystemContentSize {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppStartsEventPreferredSystemContentSize[] $VALUES;
    public static final AppStartsEventPreferredSystemContentSize HUGE;
    public static final AppStartsEventPreferredSystemContentSize LARGE;
    public static final AppStartsEventPreferredSystemContentSize MEDIUM;
    public static final AppStartsEventPreferredSystemContentSize SMALL;
    private final String wireValue;

    static {
        AppStartsEventPreferredSystemContentSize appStartsEventPreferredSystemContentSize = new AppStartsEventPreferredSystemContentSize("SMALL", 0, "small");
        SMALL = appStartsEventPreferredSystemContentSize;
        AppStartsEventPreferredSystemContentSize appStartsEventPreferredSystemContentSize2 = new AppStartsEventPreferredSystemContentSize("MEDIUM", 1, "medium");
        MEDIUM = appStartsEventPreferredSystemContentSize2;
        AppStartsEventPreferredSystemContentSize appStartsEventPreferredSystemContentSize3 = new AppStartsEventPreferredSystemContentSize("LARGE", 2, "large");
        LARGE = appStartsEventPreferredSystemContentSize3;
        AppStartsEventPreferredSystemContentSize appStartsEventPreferredSystemContentSize4 = new AppStartsEventPreferredSystemContentSize("HUGE", 3, "huge");
        HUGE = appStartsEventPreferredSystemContentSize4;
        AppStartsEventPreferredSystemContentSize[] appStartsEventPreferredSystemContentSizeArr = {appStartsEventPreferredSystemContentSize, appStartsEventPreferredSystemContentSize2, appStartsEventPreferredSystemContentSize3, appStartsEventPreferredSystemContentSize4};
        $VALUES = appStartsEventPreferredSystemContentSizeArr;
        $ENTRIES = new asp(appStartsEventPreferredSystemContentSizeArr);
    }

    public AppStartsEventPreferredSystemContentSize(String str, int i, String str2) {
        this.wireValue = str2;
    }

    public static AppStartsEventPreferredSystemContentSize valueOf(String str) {
        return (AppStartsEventPreferredSystemContentSize) Enum.valueOf(AppStartsEventPreferredSystemContentSize.class, str);
    }

    public static AppStartsEventPreferredSystemContentSize[] values() {
        return (AppStartsEventPreferredSystemContentSize[]) $VALUES.clone();
    }

    public final String h() {
        return this.wireValue;
    }
}
