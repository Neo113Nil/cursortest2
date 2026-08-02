package defpackage;

import android.os.Handler;

/* loaded from: classes6.dex */
public final class cvr {
    public final o0l0 a;
    public final biv0 b;
    public final fgv0 c;

    public cvr(o0l0 o0l0Var, biv0 biv0Var, fgv0 fgv0Var) {
        this.a = o0l0Var;
        this.b = biv0Var;
        this.c = fgv0Var;
    }

    public final boolean a() {
        jpv0 b = this.b.b();
        b.getClass();
        return (b instanceof hpv0) && jl40.l(this.c.e.getValue(), cgv0.a);
    }

    public final boolean b(boolean z) {
        jpv0 b = this.b.b();
        b.getClass();
        if (b instanceof fpv0) {
            return false;
        }
        boolean a = a();
        p0l0 p0l0Var = (p0l0) this.a;
        Handler handler = p0l0Var.b;
        if (z) {
            hxj0 hxj0Var = new hxj0(8, p0l0Var);
            handler.postDelayed(hxj0Var, 300L);
            p0l0Var.c = hxj0Var;
        } else {
            p0l0Var.a.a();
            hxj0 hxj0Var2 = p0l0Var.c;
            if (hxj0Var2 != null) {
                handler.removeCallbacks(hxj0Var2);
            }
        }
        return z != a;
    }
}
