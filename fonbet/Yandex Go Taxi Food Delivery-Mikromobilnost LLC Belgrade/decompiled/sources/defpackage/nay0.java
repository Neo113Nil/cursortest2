package defpackage;

import ru.yandex.taxi.themes.ThemeChangeMode;
import ru.yandex.taxi.themes.experiments.DarkThemeSwitchExperiment;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class nay0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[ThemeChangeMode.values().length];
        try {
            iArr[ThemeChangeMode.DARK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ThemeChangeMode.LIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ThemeChangeMode.AUTO.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ThemeChangeMode.SYSTEM.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
        int[] iArr2 = new int[DarkThemeSwitchExperiment.ThemeDefaultSetting.values().length];
        try {
            iArr2[DarkThemeSwitchExperiment.ThemeDefaultSetting.DARK_THEME_ON.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[DarkThemeSwitchExperiment.ThemeDefaultSetting.DARK_THEME_OFF.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[DarkThemeSwitchExperiment.ThemeDefaultSetting.SYSTEM_THEME.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        b = iArr2;
    }
}
