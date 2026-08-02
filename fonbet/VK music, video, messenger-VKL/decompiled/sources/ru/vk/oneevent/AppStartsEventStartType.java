package ru.vk.oneevent;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppStartsEventStartType.kt */
/* loaded from: classes9.dex */
public final class AppStartsEventStartType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppStartsEventStartType[] $VALUES;
    public static final AppStartsEventStartType COLD;
    public static final AppStartsEventStartType DAILY;
    private final String wireValue;

    static {
        AppStartsEventStartType appStartsEventStartType = new AppStartsEventStartType("COLD", 0, "cold");
        COLD = appStartsEventStartType;
        AppStartsEventStartType appStartsEventStartType2 = new AppStartsEventStartType("DAILY", 1, "daily");
        DAILY = appStartsEventStartType2;
        AppStartsEventStartType[] appStartsEventStartTypeArr = {appStartsEventStartType, appStartsEventStartType2};
        $VALUES = appStartsEventStartTypeArr;
        $ENTRIES = new asp(appStartsEventStartTypeArr);
    }

    public AppStartsEventStartType(String str, int i, String str2) {
        this.wireValue = str2;
    }

    public static AppStartsEventStartType valueOf(String str) {
        return (AppStartsEventStartType) Enum.valueOf(AppStartsEventStartType.class, str);
    }

    public static AppStartsEventStartType[] values() {
        return (AppStartsEventStartType[]) $VALUES.clone();
    }

    public final String h() {
        return this.wireValue;
    }
}
