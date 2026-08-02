package defpackage;

import com.yandex.passport.api.PassportTheme;

/* loaded from: classes9.dex */
public final class hqe {
    public final h3y a;

    public hqe(h3y h3yVar, im51 im51Var) {
        this.a = h3yVar;
        im51Var.getClass();
    }

    public final PassportTheme a() {
        int i = gqe.a[((pwy0) this.a.get()).getThemeType().ordinal()];
        if (i == 1) {
            return PassportTheme.DARK;
        }
        if (i == 2) {
            return PassportTheme.LIGHT;
        }
        w511.b();
        return null;
    }
}
