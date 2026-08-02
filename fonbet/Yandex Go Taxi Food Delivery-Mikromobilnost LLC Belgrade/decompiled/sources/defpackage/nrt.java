package defpackage;

import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes9.dex */
public final class nrt implements exu0 {
    public final cxu0 a;
    public final cxu0 b;
    public final cxu0 c;
    public final cxu0 d;

    public nrt() {
        ThemeType themeType = ThemeType.LIGHT;
        this.a = new cxu0(u1i0.Go_Light, themeType);
        this.b = new cxu0(a2i0.Taxi_UltimaLight, themeType);
        ThemeType themeType2 = ThemeType.DARK;
        this.c = new cxu0(u1i0.Go_Dark, themeType2);
        this.d = new cxu0(a2i0.Taxi_UltimaDark, themeType2);
    }

    public final cxu0 b(ThemeType themeType, String str) {
        return jl40.l(str, "ultima") ? themeType.f() ? this.b : this.d : themeType.f() ? this.a : this.c;
    }
}
