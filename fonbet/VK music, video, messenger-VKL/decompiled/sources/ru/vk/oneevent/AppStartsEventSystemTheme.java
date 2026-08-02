package ru.vk.oneevent;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppStartsEventSystemTheme.kt */
/* loaded from: classes9.dex */
public final class AppStartsEventSystemTheme {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppStartsEventSystemTheme[] $VALUES;
    public static final AppStartsEventSystemTheme DARK;
    public static final AppStartsEventSystemTheme LIGHT;
    private final String wireValue;

    static {
        AppStartsEventSystemTheme appStartsEventSystemTheme = new AppStartsEventSystemTheme("DARK", 0, "dark");
        DARK = appStartsEventSystemTheme;
        AppStartsEventSystemTheme appStartsEventSystemTheme2 = new AppStartsEventSystemTheme("LIGHT", 1, "light");
        LIGHT = appStartsEventSystemTheme2;
        AppStartsEventSystemTheme[] appStartsEventSystemThemeArr = {appStartsEventSystemTheme, appStartsEventSystemTheme2};
        $VALUES = appStartsEventSystemThemeArr;
        $ENTRIES = new asp(appStartsEventSystemThemeArr);
    }

    public AppStartsEventSystemTheme(String str, int i, String str2) {
        this.wireValue = str2;
    }

    public static AppStartsEventSystemTheme valueOf(String str) {
        return (AppStartsEventSystemTheme) Enum.valueOf(AppStartsEventSystemTheme.class, str);
    }

    public static AppStartsEventSystemTheme[] values() {
        return (AppStartsEventSystemTheme[]) $VALUES.clone();
    }

    public final String h() {
        return this.wireValue;
    }
}
