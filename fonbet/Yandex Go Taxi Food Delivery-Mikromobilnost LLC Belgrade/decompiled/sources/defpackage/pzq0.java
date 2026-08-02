package defpackage;

import java.util.Locale;
import java.util.UUID;

/* loaded from: classes.dex */
public final class pzq0 {
    public final e7z0 a;
    public final by21 b;

    public pzq0(e7z0 e7z0Var, by21 by21Var) {
        this.a = e7z0Var;
        this.b = by21Var;
    }

    public final gzq0 a(gzq0 gzq0Var) {
        String str;
        this.b.getClass();
        String lowerCase = cvu0.v(UUID.randomUUID().toString(), "-", "", false).toLowerCase(Locale.ROOT);
        String str2 = (gzq0Var == null || (str = gzq0Var.b) == null) ? lowerCase : str;
        int i = gzq0Var != null ? gzq0Var.c + 1 : 0;
        this.a.getClass();
        return new gzq0(lowerCase, str2, i, e7z0.a().b);
    }
}
