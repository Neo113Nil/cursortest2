package defpackage;

import android.content.Context;
import android.view.Surface;
import android.view.WindowManager;
import yads.fg3;
import yads.gg3;

/* loaded from: classes7.dex */
public final class gd71 {
    public final h681 a = new h681();
    public final o071 b;
    public final gg3 c;
    public boolean d;
    public Surface e;
    public float f;
    public float g;
    public float h;
    public float i;
    public int j;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    public long p;
    public long q;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public gd71(Context context) {
        o071 o071Var;
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            o071Var = rf71.a >= 17 ? fg3.a(applicationContext) : null;
            if (o071Var == null) {
                WindowManager windowManager = (WindowManager) applicationContext.getSystemService("window");
                if (windowManager != null) {
                    o071Var = new aj31(26, windowManager);
                }
            }
            this.b = o071Var;
            this.c = o071Var != null ? gg3.f : null;
            this.k = -9223372036854775807L;
            this.l = -9223372036854775807L;
            this.f = -1.0f;
            this.i = 1.0f;
            this.j = 0;
        }
        o071Var = null;
        this.b = o071Var;
        this.c = o071Var != null ? gg3.f : null;
        this.k = -9223372036854775807L;
        this.l = -9223372036854775807L;
        this.f = -1.0f;
        this.i = 1.0f;
        this.j = 0;
    }

    public final void a(boolean z) {
        Surface surface;
        float f;
        if (rf71.a < 30 || (surface = this.e) == null || this.j == Integer.MIN_VALUE) {
            return;
        }
        if (this.d) {
            float f2 = this.g;
            if (f2 != -1.0f) {
                f = f2 * this.i;
                if (z && this.h == f) {
                    return;
                }
                this.h = f;
                fm61.a(surface, f);
            }
        }
        f = 0.0f;
        if (z) {
        }
        this.h = f;
        fm61.a(surface, f);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        float f;
        float f2;
        if (rf71.a < 30 || this.e == null) {
            return;
        }
        h681 h681Var = this.a;
        if (!h681Var.a.b()) {
            f = this.f;
        } else if (h681Var.a.b()) {
            f = (float) (1.0E9d / (h681Var.a.e != 0 ? r2.f / r4 : 0L));
        } else {
            f = -1.0f;
        }
        float f3 = this.g;
        if (f == f3) {
            return;
        }
        if (f != -1.0f && f3 != -1.0f) {
            if (h681Var.a.b()) {
                if ((h681Var.a.b() ? h681Var.a.f : -9223372036854775807L) >= 5000000000L) {
                    f2 = 0.02f;
                    if (Math.abs(f - this.g) < f2) {
                        return;
                    }
                }
            }
            f2 = 1.0f;
            if (Math.abs(f - this.g) < f2) {
            }
        } else if (f == -1.0f && h681Var.e < 30) {
            return;
        }
        this.g = f;
        a(false);
    }
}
