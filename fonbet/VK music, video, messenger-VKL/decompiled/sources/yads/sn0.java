package yads;

import android.content.Context;
import android.os.Looper;
import xsna.caf0;
import xsna.fdz0;

/* loaded from: classes10.dex */
public final class sn0 {
    public final Context a;
    public final j63 b;
    public c63 c;
    public final c63 d;
    public final c63 e;
    public c63 f;
    public final c63 g;
    public final xy0 h;
    public final Looper i;
    public final pk j;
    public final int k;
    public final boolean l;
    public final ay2 m;
    public final yd0 n;
    public final long o;
    public final long p;
    public final boolean q;
    public boolean r;

    public sn0(final Context context) {
        this(context, new c63() { // from class: xsna.bdz0
            @Override // yads.c63
            public final Object get() {
                return yads.sn0.a(context);
            }
        }, new c63() { // from class: xsna.cdz0
            @Override // yads.c63
            public final Object get() {
                return yads.sn0.b(context);
            }
        });
    }

    public static /* synthetic */ tg1 a(tg1 tg1Var) {
        return tg1Var;
    }

    public static /* synthetic */ pe0 b(pe0 pe0Var) {
        return pe0Var;
    }

    public static im d(Context context) {
        dc0 dc0Var;
        synchronized (dc0.class) {
            try {
                if (dc0.t == null) {
                    dc0.t = new dc0(context == null ? null : context.getApplicationContext(), cc0.a(mc3.b(context)), 2000, xv.a, true);
                }
                dc0Var = dc0.t;
            } catch (Throwable th) {
                throw th;
            }
        }
        return dc0Var;
    }

    public final sn0 c(final pe0 pe0Var) {
        if (this.r) {
            throw new IllegalStateException();
        }
        this.c = new c63() { // from class: xsna.ddz0
            @Override // yads.c63
            public final Object get() {
                return yads.sn0.b(yads.pe0.this);
            }
        };
        return this;
    }

    public sn0(final Context context, c63 c63Var, c63 c63Var2) {
        this(context, c63Var, c63Var2, new c63() { // from class: xsna.edz0
            @Override // yads.c63
            public final Object get() {
                return yads.sn0.c(context);
            }
        }, new fdz0(), new c63() { // from class: xsna.gdz0
            @Override // yads.c63
            public final Object get() {
                return yads.sn0.d(context);
            }
        }, new caf0(7));
    }

    public static yn1 b(Context context) {
        return new ge0(new oc0(context, new pd0()), new od0());
    }

    public final void a(final zd0 zd0Var) {
        if (this.r) {
            throw new IllegalStateException();
        }
        this.f = new c63() { // from class: xsna.adz0
            @Override // yads.c63
            public final Object get() {
                return yads.sn0.a(zd0Var);
            }
        };
    }

    public sn0(Context context, c63 c63Var, c63 c63Var2, c63 c63Var3, c63 c63Var4, c63 c63Var5, xy0 xy0Var) {
        this.a = context;
        this.c = c63Var;
        this.d = c63Var2;
        this.e = c63Var3;
        this.f = c63Var4;
        this.g = c63Var5;
        this.h = xy0Var;
        this.i = mc3.c();
        this.j = pk.h;
        this.k = 1;
        this.l = true;
        this.m = ay2.c;
        this.n = new xd0().a();
        this.b = xv.a;
        this.o = 500L;
        this.p = 2000L;
        this.q = true;
    }

    public static w83 c(Context context) {
        return new if0(context, af0.a(context), new dc(0));
    }

    public static /* synthetic */ pe0 a(Context context) {
        return new pe0(context);
    }
}
