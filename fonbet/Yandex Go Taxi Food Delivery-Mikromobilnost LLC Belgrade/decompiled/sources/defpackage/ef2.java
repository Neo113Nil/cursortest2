package defpackage;

import android.os.Build;
import coil3.c;
import coil3.graphics.C0141a;

/* loaded from: classes.dex */
public final class ef2 implements fyg {
    public final boolean a;

    public ef2(int i) {
        this.a = Build.VERSION.SDK_INT < 34;
    }

    @Override // defpackage.fyg
    public final iyg a(zct0 zct0Var, lg70 lg70Var, c cVar) {
        qq6 source = zct0Var.a.source();
        if (!source.Q(0L, ayg.b) && !source.Q(0L, ayg.a) && (!source.Q(0L, ayg.c) || !source.Q(8L, ayg.d) || !source.Q(12L, ayg.e) || !source.S(21L) || ((byte) (source.h().e(20L) & 2)) <= 0)) {
            if (Build.VERSION.SDK_INT < 30 || !source.Q(4L, ayg.f)) {
                return null;
            }
            if (!source.Q(8L, ayg.g) && !source.Q(8L, ayg.h) && !source.Q(8L, ayg.i)) {
                return null;
            }
        }
        return new C0141a(zct0Var.a, lg70Var, this.a);
    }

    public ef2() {
        this(0);
    }
}
