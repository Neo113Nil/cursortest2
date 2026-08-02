package com.yandex.quark.contracts.theme;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/quark/contracts/theme/ThemeMode;", "", "Light", "Dark", "AutoSwitch", "quark-contracts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ThemeMode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ThemeMode[] $VALUES;
    public static final ThemeMode AutoSwitch;
    public static final ThemeMode Dark;
    public static final ThemeMode Light;

    static {
        ThemeMode themeMode = new ThemeMode("Light", 0);
        Light = themeMode;
        ThemeMode themeMode2 = new ThemeMode("Dark", 1);
        Dark = themeMode2;
        ThemeMode themeMode3 = new ThemeMode("AutoSwitch", 2);
        AutoSwitch = themeMode3;
        ThemeMode[] themeModeArr = {themeMode, themeMode2, themeMode3};
        $VALUES = themeModeArr;
        $ENTRIES = a.a(themeModeArr);
    }

    public static ThemeMode valueOf(String str) {
        return (ThemeMode) Enum.valueOf(ThemeMode.class, str);
    }

    public static ThemeMode[] values() {
        return (ThemeMode[]) $VALUES.clone();
    }
}
