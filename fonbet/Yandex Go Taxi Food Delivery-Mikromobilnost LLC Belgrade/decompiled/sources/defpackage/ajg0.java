package defpackage;

import com.yandex.go.quark.dynamic.dependencies.b;
import com.yandex.quark.contracts.theme.ThemeMode;
import kotlinx.coroutines.flow.e;

/* loaded from: classes8.dex */
public final class ajg0 {
    public final gci0 a;

    public ajg0(tse tseVar, pwy0 pwy0Var) {
        ThemeMode themeMode;
        b bVar = new b(pwy0Var.a(), this);
        xsr0.a.getClass();
        r2u0 r2u0Var = wsr0.c;
        int i = zig0.a[pwy0Var.getThemeType().ordinal()];
        if (i == 1) {
            themeMode = ThemeMode.Light;
        } else {
            if (i != 2) {
                w511.b();
                throw null;
            }
            themeMode = ThemeMode.Dark;
        }
        this.a = e.R(bVar, tseVar, r2u0Var, themeMode);
    }
}
