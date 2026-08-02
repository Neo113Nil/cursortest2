package defpackage;

import ru.yandex.taxi.themes.ThemeChangeMode;
import ru.yandex.taxi.themes.evgen.DarkThemeSwitcherAnalytics$Theme;
import ru.yandex.taxi.themes.evgen.DarkThemeSwitcherAnalytics$ThemeState;

/* loaded from: classes10.dex */
public final class fvy0 {
    public final zz2 a;
    public final m3x0 b;
    public final pay0 c;
    public final jc4 d;

    public fvy0(zz2 zz2Var, m3x0 m3x0Var, pay0 pay0Var, jc4 jc4Var) {
        this.a = zz2Var;
        this.b = m3x0Var;
        this.c = pay0Var;
        this.d = jc4Var;
    }

    public static DarkThemeSwitcherAnalytics$ThemeState b(ThemeChangeMode themeChangeMode) {
        int i = evy0.a[themeChangeMode.ordinal()];
        if (i == 1) {
            return DarkThemeSwitcherAnalytics$ThemeState.Dark;
        }
        if (i == 2) {
            return DarkThemeSwitcherAnalytics$ThemeState.Light;
        }
        if (i == 3) {
            return DarkThemeSwitcherAnalytics$ThemeState.Auto;
        }
        if (i == 4) {
            return DarkThemeSwitcherAnalytics$ThemeState.System;
        }
        w511.b();
        return null;
    }

    public final DarkThemeSwitcherAnalytics$Theme a() {
        return ((Boolean) this.b.b.a.getValue()).booleanValue() ? DarkThemeSwitcherAnalytics$Theme.Dark : DarkThemeSwitcherAnalytics$Theme.Light;
    }
}
