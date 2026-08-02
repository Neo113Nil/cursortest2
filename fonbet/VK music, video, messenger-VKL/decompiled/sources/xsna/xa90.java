package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: PagerCacheWindowLogic.kt */
/* loaded from: classes11.dex */
public final class xa90 extends by8 {
    public final cuy n;
    public final ya90 o;

    public xa90(vt5 vt5Var, cuy cuyVar, tu80 tu80Var) {
        super(vt5Var);
        this.n = cuyVar;
        this.o = new ya90(tu80Var);
    }

    public final void h(float f, tb90 tb90Var) {
        by8 by8Var;
        int i;
        int i2;
        ya90 ya90Var = this.o;
        ya90Var.b = tb90Var;
        ya90Var.c = this.n;
        float f2 = -f;
        g();
        if (ya90Var.d()) {
            tb90 tb90Var2 = ya90Var.b;
            if (tb90Var2 == null) {
                tb90Var2 = null;
            }
            egi.n(tb90Var2);
            tb90 tb90Var3 = ya90Var.b;
            if (tb90Var3 == null) {
                tb90Var3 = null;
            }
            azl azlVar = tb90Var3.t;
            this.m = ya90Var.h();
            int c = ya90Var.c();
            int e = ya90Var.e();
            int h = ya90Var.h();
            int g = ya90Var.g();
            int f3 = ya90Var.f();
            pg50<iy8> pg50Var = this.e;
            if (f2 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                this.j = 0 - g;
                this.h = c;
                while (this.j > 0 && (i2 = this.h) > 0 && pg50Var.a(i2 - 1)) {
                    this.h--;
                    this.j -= pg50Var.b(this.h - 1).b;
                }
                e(0, this.h - 1);
            } else {
                this.k = 0 - f3;
                this.i = e;
                while (this.k > 0 && (i = this.i) < h - 1 && pg50Var.a(i + 1)) {
                    int i3 = pg50Var.b(this.i + 1).b;
                    this.i++;
                    this.k -= i3;
                }
                e(this.i + 1, h - 1);
            }
        }
        if (ya90Var.d()) {
            tb90 tb90Var4 = ya90Var.b;
            if (tb90Var4 == null) {
                tb90Var4 = null;
            }
            egi.n(tb90Var4);
            tb90 tb90Var5 = ya90Var.b;
            by8Var = this;
            by8Var.d(ya90Var, ya90Var.c(), ya90Var.e(), (tb90Var5 != null ? tb90Var5 : null).t != null ? ((mc90) this.a.b).o : 0, ya90Var.f(), ya90Var.g(), f2, f2 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else {
            by8Var = this;
        }
        by8Var.f = f2;
        g();
    }
}
