package xsna;

import android.annotation.SuppressLint;
import android.graphics.Insets;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import xsna.iut0;

/* compiled from: WindowInsetsCompat.java */
/* loaded from: classes.dex */
public final class bqx0 {
    public static final bqx0 b;
    public final q a;

    /* compiled from: WindowInsetsCompat.java */
    public static class c extends b {
        public c() {
        }

        @Override // xsna.bqx0.h
        public void d(int i, h4x h4xVar) {
            this.e.setInsets(s.a(i), h4xVar.f());
        }

        public c(bqx0 bqx0Var) {
            super(bqx0Var);
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    public static class d extends c {
        public d() {
        }

        public d(bqx0 bqx0Var) {
            super(bqx0Var);
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: classes11.dex */
    public static class e extends d {
        public e() {
        }

        @Override // xsna.bqx0.c, xsna.bqx0.h
        public void d(int i, h4x h4xVar) {
            this.e.setInsets(t.a(i), h4xVar.f());
        }

        public e(bqx0 bqx0Var) {
            super(bqx0Var);
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: classes11.dex */
    public static class f extends e {
        public f() {
        }

        @Override // xsna.bqx0.e, xsna.bqx0.c, xsna.bqx0.h
        public void d(int i, h4x h4xVar) {
            super.d(i, h4xVar);
        }

        public f(bqx0 bqx0Var) {
            super(bqx0Var);
            bqx0Var.a.s();
        }

        @Override // xsna.bqx0.h
        public void c(bqx0 bqx0Var) {
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: classes11.dex */
    public static class g extends f {
        public g() {
        }

        public g(bqx0 bqx0Var) {
            super(bqx0Var);
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    public static class h {
        public final bqx0 a;
        public h4x[] b;
        public final Rect[][] c;
        public final Rect[][] d;

        public h() {
            this(new bqx0((bqx0) null));
        }

        public final void a() {
            h4x[] h4xVarArr = this.b;
            if (h4xVarArr != null) {
                h4x h4xVar = h4xVarArr[0];
                h4x h4xVar2 = h4xVarArr[1];
                bqx0 bqx0Var = this.a;
                if (h4xVar2 == null) {
                    h4xVar2 = bqx0Var.a.i(2);
                }
                if (h4xVar == null) {
                    h4xVar = bqx0Var.a.i(1);
                }
                h(h4x.a(h4xVar, h4xVar2));
                h4x h4xVar3 = this.b[r.a(16)];
                if (h4xVar3 != null) {
                    g(h4xVar3);
                }
                h4x h4xVar4 = this.b[r.a(32)];
                if (h4xVar4 != null) {
                    e(h4xVar4);
                }
                h4x h4xVar5 = this.b[r.a(64)];
                if (h4xVar5 != null) {
                    i(h4xVar5);
                }
            }
        }

        public bqx0 b() {
            throw null;
        }

        public void c(bqx0 bqx0Var) {
            for (int i = 1; i <= 512; i <<= 1) {
                List<Rect> f = bqx0Var.a.f(i);
                int a = r.a(i);
                this.c[a] = (Rect[]) f.toArray(new Rect[f.size()]);
                if (i != 8) {
                    List<Rect> g = bqx0Var.a.g(i);
                    this.d[a] = (Rect[]) g.toArray(new Rect[g.size()]);
                }
            }
        }

        public void d(int i, h4x h4xVar) {
            if (this.b == null) {
                this.b = new h4x[10];
            }
            for (int i2 = 1; i2 <= 512; i2 <<= 1) {
                if ((i & i2) != 0) {
                    this.b[r.a(i2)] = h4xVar;
                }
            }
        }

        public void f(h4x h4xVar) {
            throw null;
        }

        public void h(h4x h4xVar) {
            throw null;
        }

        public h(bqx0 bqx0Var) {
            this.c = new Rect[10][];
            this.d = new Rect[10][];
            this.a = bqx0Var;
            c(bqx0Var);
        }

        public void e(h4x h4xVar) {
        }

        public void g(h4x h4xVar) {
        }

        public void i(h4x h4xVar) {
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    public static class k extends j {
        public k(bqx0 bqx0Var, WindowInsets windowInsets) {
            super(bqx0Var, windowInsets);
        }

        @Override // xsna.bqx0.q
        public bqx0 a() {
            return bqx0.h(null, this.c.consumeDisplayCutout());
        }

        @Override // xsna.bqx0.i, xsna.bqx0.q
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return Objects.equals(this.c, kVar.c) && Objects.equals(this.g, kVar.g) && i.M(this.h, kVar.h);
        }

        @Override // xsna.bqx0.q
        public nen h() {
            return nen.f(this.c.getDisplayCutout());
        }

        @Override // xsna.bqx0.q
        public int hashCode() {
            return this.c.hashCode();
        }

        public k(bqx0 bqx0Var, k kVar) {
            super(bqx0Var, kVar);
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    public static class m extends l {
        public static final bqx0 w;

        static {
            WindowInsets windowInsets;
            windowInsets = WindowInsets.CONSUMED;
            w = bqx0.h(null, windowInsets);
        }

        public m(bqx0 bqx0Var, WindowInsets windowInsets) {
            super(bqx0Var, windowInsets);
        }

        @Override // xsna.bqx0.i, xsna.bqx0.q
        public h4x i(int i) {
            Insets insets;
            insets = this.c.getInsets(s.a(i));
            return h4x.e(insets);
        }

        @Override // xsna.bqx0.i, xsna.bqx0.q
        public h4x j(int i) {
            Insets insetsIgnoringVisibility;
            insetsIgnoringVisibility = this.c.getInsetsIgnoringVisibility(s.a(i));
            return h4x.e(insetsIgnoringVisibility);
        }

        @Override // xsna.bqx0.i, xsna.bqx0.q
        public boolean u(int i) {
            boolean isVisible;
            isVisible = this.c.isVisible(s.a(i));
            return isVisible;
        }

        public m(bqx0 bqx0Var, m mVar) {
            super(bqx0Var, mVar);
        }

        @Override // xsna.bqx0.i, xsna.bqx0.q
        public final void d(View view) {
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    public static class n extends m {
        public n(bqx0 bqx0Var, WindowInsets windowInsets) {
            super(bqx0Var, windowInsets);
        }

        public n(bqx0 bqx0Var, n nVar) {
            super(bqx0Var, nVar);
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: classes11.dex */
    public static class o extends n {
        public static final bqx0 x;

        static {
            WindowInsets windowInsets;
            windowInsets = WindowInsets.CONSUMED;
            x = bqx0.h(null, windowInsets);
        }

        public o(bqx0 bqx0Var, WindowInsets windowInsets) {
            super(bqx0Var, windowInsets);
        }

        @Override // xsna.bqx0.m, xsna.bqx0.i, xsna.bqx0.q
        public h4x i(int i) {
            Insets insets;
            insets = this.c.getInsets(t.a(i));
            return h4x.e(insets);
        }

        @Override // xsna.bqx0.m, xsna.bqx0.i, xsna.bqx0.q
        public h4x j(int i) {
            Insets insetsIgnoringVisibility;
            insetsIgnoringVisibility = this.c.getInsetsIgnoringVisibility(t.a(i));
            return h4x.e(insetsIgnoringVisibility);
        }

        @Override // xsna.bqx0.m, xsna.bqx0.i, xsna.bqx0.q
        public boolean u(int i) {
            boolean isVisible;
            isVisible = this.c.isVisible(t.a(i));
            return isVisible;
        }

        public o(bqx0 bqx0Var, o oVar) {
            super(bqx0Var, oVar);
        }

        @Override // xsna.bqx0.i, xsna.bqx0.q
        public void p(View view) {
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: classes11.dex */
    public static class p extends o {
        public p(bqx0 bqx0Var, WindowInsets windowInsets) {
            super(bqx0Var, windowInsets);
        }

        @Override // xsna.bqx0.i, xsna.bqx0.q
        public List<Rect> f(int i) {
            List<Rect> boundingRects;
            boundingRects = this.c.getBoundingRects(t.a(i));
            return boundingRects;
        }

        @Override // xsna.bqx0.i, xsna.bqx0.q
        public List<Rect> g(int i) {
            List<Rect> boundingRectsIgnoringVisibility;
            boundingRectsIgnoringVisibility = this.c.getBoundingRectsIgnoringVisibility(t.a(i));
            return boundingRectsIgnoringVisibility;
        }

        public p(bqx0 bqx0Var, p pVar) {
            super(bqx0Var, pVar);
        }

        @Override // xsna.bqx0.i, xsna.bqx0.q
        public void q() {
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    public static final class r {
        public static int a(int i) {
            if (i == 1) {
                return 0;
            }
            if (i == 2) {
                return 1;
            }
            if (i == 4) {
                return 2;
            }
            if (i == 8) {
                return 3;
            }
            if (i == 16) {
                return 4;
            }
            if (i == 32) {
                return 5;
            }
            if (i == 64) {
                return 6;
            }
            if (i == 128) {
                return 7;
            }
            if (i == 256) {
                return 8;
            }
            if (i == 512) {
                return 9;
            }
            throw new IllegalArgumentException(lhg.a(i, "type needs to be >= FIRST and <= LAST, type="));
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    public static final class s {
        public static int a(int i) {
            int statusBars;
            int i2 = 0;
            for (int i3 = 1; i3 <= 512; i3 <<= 1) {
                if ((i & i3) != 0) {
                    if (i3 == 1) {
                        statusBars = WindowInsets.Type.statusBars();
                    } else if (i3 == 2) {
                        statusBars = WindowInsets.Type.navigationBars();
                    } else if (i3 == 4) {
                        statusBars = WindowInsets.Type.captionBar();
                    } else if (i3 == 8) {
                        statusBars = WindowInsets.Type.ime();
                    } else if (i3 == 16) {
                        statusBars = WindowInsets.Type.systemGestures();
                    } else if (i3 == 32) {
                        statusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i3 == 64) {
                        statusBars = WindowInsets.Type.tappableElement();
                    } else if (i3 == 128) {
                        statusBars = WindowInsets.Type.displayCutout();
                    }
                    i2 |= statusBars;
                }
            }
            return i2;
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: classes11.dex */
    public static final class t {
        public static int a(int i) {
            int statusBars;
            int i2 = 0;
            for (int i3 = 1; i3 <= 512; i3 <<= 1) {
                if ((i & i3) != 0) {
                    if (i3 == 1) {
                        statusBars = WindowInsets.Type.statusBars();
                    } else if (i3 == 2) {
                        statusBars = WindowInsets.Type.navigationBars();
                    } else if (i3 == 4) {
                        statusBars = WindowInsets.Type.captionBar();
                    } else if (i3 == 8) {
                        statusBars = WindowInsets.Type.ime();
                    } else if (i3 == 16) {
                        statusBars = WindowInsets.Type.systemGestures();
                    } else if (i3 == 32) {
                        statusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i3 == 64) {
                        statusBars = WindowInsets.Type.tappableElement();
                    } else if (i3 == 128) {
                        statusBars = WindowInsets.Type.displayCutout();
                    } else if (i3 == 512) {
                        statusBars = WindowInsets.Type.systemOverlays();
                    }
                    i2 |= statusBars;
                }
            }
            return i2;
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            b = o.x;
        } else if (i2 >= 30) {
            b = m.w;
        } else {
            b = q.b;
        }
    }

    public bqx0(WindowInsets windowInsets) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 35) {
            this.a = new p(this, windowInsets);
            return;
        }
        if (i2 >= 34) {
            this.a = new o(this, windowInsets);
            return;
        }
        if (i2 >= 31) {
            this.a = new n(this, windowInsets);
            return;
        }
        if (i2 >= 30) {
            this.a = new m(this, windowInsets);
        } else if (i2 >= 29) {
            this.a = new l(this, windowInsets);
        } else {
            this.a = new k(this, windowInsets);
        }
    }

    public static h4x e(h4x h4xVar, int i2, int i3, int i4, int i5) {
        int max = Math.max(0, h4xVar.a - i2);
        int max2 = Math.max(0, h4xVar.b - i3);
        int max3 = Math.max(0, h4xVar.c - i4);
        int max4 = Math.max(0, h4xVar.d - i5);
        return (max == i2 && max2 == i3 && max3 == i4 && max4 == i5) ? h4xVar : h4x.c(max, max2, max3, max4);
    }

    public static bqx0 h(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        bqx0 bqx0Var = new bqx0(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            bqx0 a2 = iut0.e.a(view);
            q qVar = bqx0Var.a;
            qVar.y(a2);
            View rootView = view.getRootView();
            qVar.d(rootView);
            qVar.p(rootView);
            qVar.q();
            qVar.A(view.getWindowSystemUiVisibility());
        }
        return bqx0Var;
    }

    @Deprecated
    public final int a() {
        return this.a.n().d;
    }

    @Deprecated
    public final int b() {
        return this.a.n().a;
    }

    @Deprecated
    public final int c() {
        return this.a.n().c;
    }

    @Deprecated
    public final int d() {
        return this.a.n().b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bqx0) {
            return Objects.equals(this.a, ((bqx0) obj).a);
        }
        return false;
    }

    @Deprecated
    public final bqx0 f(int i2, int i3, int i4, int i5) {
        int i6 = Build.VERSION.SDK_INT;
        h gVar = i6 >= 36 ? new g(this) : i6 >= 35 ? new f(this) : i6 >= 34 ? new e(this) : i6 >= 31 ? new d(this) : i6 >= 30 ? new c(this) : i6 >= 29 ? new b(this) : new a(this);
        gVar.h(h4x.c(i2, i3, i4, i5));
        return gVar.b();
    }

    public final WindowInsets g() {
        q qVar = this.a;
        if (qVar instanceof i) {
            return ((i) qVar).c;
        }
        return null;
    }

    public final int hashCode() {
        q qVar = this.a;
        if (qVar == null) {
            return 0;
        }
        return qVar.hashCode();
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: classes11.dex */
    public static class a extends h {
        public static Field g = null;
        public static boolean h = false;
        public static Constructor<WindowInsets> i = null;
        public static boolean j = false;
        public WindowInsets e;
        public h4x f;

        public a() {
            this.e = j();
        }

        private static WindowInsets j() {
            if (!h) {
                try {
                    g = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException unused) {
                }
                h = true;
            }
            Field field = g;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException unused2) {
                }
            }
            if (!j) {
                try {
                    i = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException unused3) {
                }
                j = true;
            }
            Constructor<WindowInsets> constructor = i;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException unused4) {
                }
            }
            return null;
        }

        @Override // xsna.bqx0.h
        public bqx0 b() {
            a();
            bqx0 h2 = bqx0.h(null, this.e);
            h4x[] h4xVarArr = this.b;
            q qVar = h2.a;
            qVar.w(h4xVarArr);
            qVar.z(this.f);
            qVar.v(null);
            qVar.B(this.c);
            qVar.C(this.d);
            return h2;
        }

        @Override // xsna.bqx0.h
        public void f(h4x h4xVar) {
            this.f = h4xVar;
        }

        @Override // xsna.bqx0.h
        public void h(h4x h4xVar) {
            WindowInsets windowInsets = this.e;
            if (windowInsets != null) {
                this.e = windowInsets.replaceSystemWindowInsets(h4xVar.a, h4xVar.b, h4xVar.c, h4xVar.d);
            }
        }

        public a(bqx0 bqx0Var) {
            super(bqx0Var);
            this.e = bqx0Var.g();
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    public static class b extends h {
        public final WindowInsets.Builder e;

        public b() {
            this.e = dqx0.a();
        }

        @Override // xsna.bqx0.h
        public bqx0 b() {
            WindowInsets build;
            a();
            build = this.e.build();
            bqx0 h = bqx0.h(null, build);
            h4x[] h4xVarArr = this.b;
            q qVar = h.a;
            qVar.w(h4xVarArr);
            qVar.v(null);
            qVar.B(this.c);
            qVar.C(this.d);
            return h;
        }

        @Override // xsna.bqx0.h
        public void e(h4x h4xVar) {
            this.e.setMandatorySystemGestureInsets(h4xVar.f());
        }

        @Override // xsna.bqx0.h
        public void f(h4x h4xVar) {
            this.e.setStableInsets(h4xVar.f());
        }

        @Override // xsna.bqx0.h
        public void g(h4x h4xVar) {
            this.e.setSystemGestureInsets(h4xVar.f());
        }

        @Override // xsna.bqx0.h
        public void h(h4x h4xVar) {
            this.e.setSystemWindowInsets(h4xVar.f());
        }

        @Override // xsna.bqx0.h
        public void i(h4x h4xVar) {
            this.e.setTappableElementInsets(h4xVar.f());
        }

        public b(bqx0 bqx0Var) {
            super(bqx0Var);
            WindowInsets.Builder a;
            WindowInsets g = bqx0Var.g();
            if (g != null) {
                a = f660.c(g);
            } else {
                a = dqx0.a();
            }
            this.e = a;
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    public static class j extends i {
        public h4x s;

        public j(bqx0 bqx0Var, WindowInsets windowInsets) {
            super(bqx0Var, windowInsets);
            this.s = null;
        }

        @Override // xsna.bqx0.q
        public bqx0 b() {
            return bqx0.h(null, this.c.consumeStableInsets());
        }

        @Override // xsna.bqx0.q
        public bqx0 c() {
            return bqx0.h(null, this.c.consumeSystemWindowInsets());
        }

        @Override // xsna.bqx0.q
        public final h4x l() {
            if (this.s == null) {
                WindowInsets windowInsets = this.c;
                this.s = h4x.c(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
            }
            return this.s;
        }

        @Override // xsna.bqx0.q
        public boolean s() {
            return this.c.isConsumed();
        }

        @Override // xsna.bqx0.q
        public void z(h4x h4xVar) {
            this.s = h4xVar;
        }

        public j(bqx0 bqx0Var, j jVar) {
            super(bqx0Var, jVar);
            this.s = null;
            this.s = jVar.s;
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    public static class l extends k {
        public h4x t;
        public h4x u;
        public h4x v;

        public l(bqx0 bqx0Var, WindowInsets windowInsets) {
            super(bqx0Var, windowInsets);
            this.t = null;
            this.u = null;
            this.v = null;
        }

        @Override // xsna.bqx0.q
        public h4x k() {
            Insets mandatorySystemGestureInsets;
            if (this.u == null) {
                mandatorySystemGestureInsets = this.c.getMandatorySystemGestureInsets();
                this.u = h4x.e(mandatorySystemGestureInsets);
            }
            return this.u;
        }

        @Override // xsna.bqx0.q
        public h4x m() {
            Insets systemGestureInsets;
            if (this.t == null) {
                systemGestureInsets = this.c.getSystemGestureInsets();
                this.t = h4x.e(systemGestureInsets);
            }
            return this.t;
        }

        @Override // xsna.bqx0.q
        public h4x o() {
            Insets tappableElementInsets;
            if (this.v == null) {
                tappableElementInsets = this.c.getTappableElementInsets();
                this.v = h4x.e(tappableElementInsets);
            }
            return this.v;
        }

        @Override // xsna.bqx0.i, xsna.bqx0.q
        public bqx0 r(int i, int i2, int i3, int i4) {
            WindowInsets inset;
            inset = this.c.inset(i, i2, i3, i4);
            return bqx0.h(null, inset);
        }

        public l(bqx0 bqx0Var, l lVar) {
            super(bqx0Var, lVar);
            this.t = null;
            this.u = null;
            this.v = null;
        }

        @Override // xsna.bqx0.j, xsna.bqx0.q
        public void z(h4x h4xVar) {
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    public static class i extends q {
        public static boolean n = false;
        public static Method o;
        public static Class<?> p;
        public static Field q;
        public static Field r;
        public final WindowInsets c;
        public h4x[] d;
        public h4x e;
        public bqx0 f;
        public h4x g;
        public int h;
        public egn i;
        public int j;
        public int k;
        public Rect[][] l;
        public Rect[][] m;

        public i(bqx0 bqx0Var, WindowInsets windowInsets) {
            super(bqx0Var);
            this.e = null;
            this.l = new Rect[10][];
            this.m = new Rect[10][];
            this.c = windowInsets;
        }

        private egn D(View view) {
            Display display;
            if (view == null || (display = view.getDisplay()) == null) {
                return null;
            }
            Point point = new Point();
            display.getRealSize(point);
            if (this.a.a.t()) {
                return egn.a(point.x, point.y, true, 0, 0, 0, 0);
            }
            tog0 a = men.a(display, 0);
            tog0 a2 = men.a(display, 1);
            tog0 a3 = men.a(display, 2);
            tog0 a4 = men.a(display, 3);
            return egn.a(point.x, point.y, false, a != null ? a.b : 0, a2 != null ? a2.b : 0, a3 != null ? a3.b : 0, a4 != null ? a4.b : 0);
        }

        private static List<Rect> E(Rect[][] rectArr, int i) {
            Rect[] rectArr2;
            Rect[] rectArr3 = null;
            for (int i2 = 1; i2 <= 512; i2 <<= 1) {
                if ((i & i2) != 0 && (rectArr2 = rectArr[r.a(i2)]) != null) {
                    if (rectArr3 == null) {
                        rectArr3 = rectArr2;
                    } else {
                        Rect[] rectArr4 = new Rect[rectArr3.length + rectArr2.length];
                        System.arraycopy(rectArr3, 0, rectArr4, 0, rectArr3.length);
                        System.arraycopy(rectArr2, 0, rectArr4, rectArr3.length, rectArr2.length);
                        rectArr3 = rectArr4;
                    }
                }
            }
            return rectArr3 == null ? Collections.EMPTY_LIST : Arrays.asList(rectArr3);
        }

        private Rect[] F(h4x h4xVar) {
            ArrayList arrayList = new ArrayList();
            int i = h4xVar.a;
            int i2 = h4xVar.d;
            int i3 = h4xVar.c;
            int i4 = h4xVar.b;
            if (i != 0) {
                arrayList.add(new Rect(0, 0, h4xVar.a, this.j));
            }
            if (i4 != 0) {
                arrayList.add(new Rect(0, 0, this.k, i4));
            }
            if (i3 != 0) {
                int i5 = this.k;
                arrayList.add(new Rect(i5 - i3, 0, i5, this.j));
            }
            if (i2 != 0) {
                int i6 = this.j;
                arrayList.add(new Rect(0, i6 - i2, this.k, i6));
            }
            return (Rect[]) arrayList.toArray(new Rect[arrayList.size()]);
        }

        @SuppressLint({"WrongConstant"})
        private h4x G(int i, boolean z) {
            h4x h4xVar = h4x.e;
            for (int i2 = 1; i2 <= 512; i2 <<= 1) {
                if ((i & i2) != 0) {
                    h4xVar = h4x.a(h4xVar, H(i2, z));
                }
            }
            return h4xVar;
        }

        private h4x I() {
            bqx0 bqx0Var = this.f;
            return bqx0Var != null ? bqx0Var.a.l() : h4x.e;
        }

        private h4x J(View view) {
            if (Build.VERSION.SDK_INT >= 30) {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!n) {
                L();
            }
            Method method = o;
            if (method != null && p != null && q != null) {
                try {
                    Object invoke = method.invoke(view, null);
                    if (invoke == null) {
                        return null;
                    }
                    Rect rect = (Rect) q.get(r.get(invoke));
                    if (rect != null) {
                        return h4x.d(rect);
                    }
                    return null;
                } catch (ReflectiveOperationException e) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
                }
            }
            return null;
        }

        @SuppressLint({"PrivateApi"})
        private static void L() {
            try {
                o = View.class.getDeclaredMethod("getViewRootImpl", null);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                p = cls;
                q = cls.getDeclaredField("mVisibleInsets");
                r = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                q.setAccessible(true);
                r.setAccessible(true);
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
            n = true;
        }

        public static boolean M(int i, int i2) {
            return (i & 6) == (i2 & 6);
        }

        @Override // xsna.bqx0.q
        public void A(int i) {
            this.h = i;
        }

        @Override // xsna.bqx0.q
        public void B(Rect[][] rectArr) {
            Objects.requireNonNull(rectArr);
            this.l = (Rect[][]) rectArr.clone();
        }

        @Override // xsna.bqx0.q
        public void C(Rect[][] rectArr) {
            Objects.requireNonNull(rectArr);
            this.m = (Rect[][]) rectArr.clone();
        }

        public h4x H(int i, boolean z) {
            h4x l;
            int i2;
            h4x h4xVar = h4x.e;
            if (i != 1) {
                if (i != 2) {
                    if (i == 8) {
                        h4x[] h4xVarArr = this.d;
                        l = h4xVarArr != null ? h4xVarArr[r.a(8)] : null;
                        if (l != null) {
                            return l;
                        }
                        h4x n2 = n();
                        h4x I = I();
                        int i3 = n2.d;
                        if (i3 > I.d) {
                            return h4x.c(0, 0, 0, i3);
                        }
                        h4x h4xVar2 = this.g;
                        if (h4xVar2 != null && !h4xVar2.equals(h4xVar) && (i2 = this.g.d) > I.d) {
                            return h4x.c(0, 0, 0, i2);
                        }
                    } else {
                        if (i == 16) {
                            return m();
                        }
                        if (i == 32) {
                            return k();
                        }
                        if (i == 64) {
                            return o();
                        }
                        if (i == 128) {
                            bqx0 bqx0Var = this.f;
                            nen h = bqx0Var != null ? bqx0Var.a.h() : h();
                            if (h != null) {
                                return h4x.c(h.b(), h.d(), h.c(), h.a());
                            }
                        }
                    }
                } else {
                    if (z) {
                        h4x I2 = I();
                        h4x l2 = l();
                        return h4x.c(Math.max(I2.a, l2.a), 0, Math.max(I2.c, l2.c), Math.max(I2.d, l2.d));
                    }
                    if ((this.h & 2) == 0) {
                        h4x n3 = n();
                        bqx0 bqx0Var2 = this.f;
                        l = bqx0Var2 != null ? bqx0Var2.a.l() : null;
                        int i4 = n3.d;
                        if (l != null) {
                            i4 = Math.min(i4, l.d);
                        }
                        return h4x.c(n3.a, 0, n3.c, i4);
                    }
                }
            } else {
                if (z) {
                    return h4x.c(0, Math.max(I().b, n().b), 0, 0);
                }
                if ((this.h & 4) == 0) {
                    return h4x.c(0, n().b, 0, 0);
                }
            }
            return h4xVar;
        }

        public boolean K(int i) {
            if (i != 1 && i != 2) {
                if (i == 4) {
                    return false;
                }
                if (i != 8 && i != 128) {
                    return true;
                }
            }
            return !H(i, false).equals(h4x.e);
        }

        @Override // xsna.bqx0.q
        public void d(View view) {
            this.k = view.getWidth();
            this.j = view.getHeight();
            h4x J = J(view);
            if (J == null) {
                J = h4x.e;
            }
            x(J);
        }

        @Override // xsna.bqx0.q
        public void e(bqx0 bqx0Var) {
            bqx0Var.a.y(this.f);
            h4x h4xVar = this.g;
            q qVar = bqx0Var.a;
            qVar.x(h4xVar);
            qVar.A(this.h);
            qVar.v(this.i);
            qVar.B(this.l);
            qVar.C(this.m);
        }

        @Override // xsna.bqx0.q
        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            i iVar = (i) obj;
            return Objects.equals(this.g, iVar.g) && M(this.h, iVar.h);
        }

        @Override // xsna.bqx0.q
        public List<Rect> f(int i) {
            return E(this.l, i);
        }

        @Override // xsna.bqx0.q
        public List<Rect> g(int i) {
            return E(this.m, i);
        }

        @Override // xsna.bqx0.q
        public h4x i(int i) {
            return G(i, false);
        }

        @Override // xsna.bqx0.q
        public h4x j(int i) {
            return G(i, true);
        }

        @Override // xsna.bqx0.q
        public final h4x n() {
            if (this.e == null) {
                WindowInsets windowInsets = this.c;
                this.e = h4x.c(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
            }
            return this.e;
        }

        @Override // xsna.bqx0.q
        public void p(View view) {
            this.i = D(view);
        }

        @Override // xsna.bqx0.q
        @SuppressLint({"WrongConstant"})
        public void q() {
            for (int i = 1; i <= 512; i <<= 1) {
                int a = r.a(i);
                this.l[a] = F(i(i));
                if (i != 8) {
                    this.m[a] = F(j(i));
                }
            }
        }

        @Override // xsna.bqx0.q
        public bqx0 r(int i, int i2, int i3, int i4) {
            bqx0 h = bqx0.h(null, this.c);
            int i5 = Build.VERSION.SDK_INT;
            h gVar = i5 >= 36 ? new g(h) : i5 >= 35 ? new f(h) : i5 >= 34 ? new e(h) : i5 >= 31 ? new d(h) : i5 >= 30 ? new c(h) : i5 >= 29 ? new b(h) : new a(h);
            gVar.h(bqx0.e(n(), i, i2, i3, i4));
            gVar.f(bqx0.e(l(), i, i2, i3, i4));
            return gVar.b();
        }

        @Override // xsna.bqx0.q
        public boolean t() {
            return this.c.isRound();
        }

        @Override // xsna.bqx0.q
        @SuppressLint({"WrongConstant"})
        public boolean u(int i) {
            for (int i2 = 1; i2 <= 512; i2 <<= 1) {
                if ((i & i2) != 0 && !K(i2)) {
                    return false;
                }
            }
            return true;
        }

        @Override // xsna.bqx0.q
        public void v(egn egnVar) {
            this.i = egnVar;
        }

        @Override // xsna.bqx0.q
        public void w(h4x[] h4xVarArr) {
            this.d = h4xVarArr;
        }

        @Override // xsna.bqx0.q
        public void x(h4x h4xVar) {
            this.g = h4xVar;
        }

        @Override // xsna.bqx0.q
        public void y(bqx0 bqx0Var) {
            this.f = bqx0Var;
        }

        public i(bqx0 bqx0Var, i iVar) {
            this(bqx0Var, new WindowInsets(iVar.c));
        }
    }

    public bqx0(bqx0 bqx0Var) {
        if (bqx0Var != null) {
            q qVar = bqx0Var.a;
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 35 && (qVar instanceof p)) {
                this.a = new p(this, (p) qVar);
            } else if (i2 >= 34 && (qVar instanceof o)) {
                this.a = new o(this, (o) qVar);
            } else if (i2 >= 31 && (qVar instanceof n)) {
                this.a = new n(this, (n) qVar);
            } else if (i2 >= 30 && (qVar instanceof m)) {
                this.a = new m(this, (m) qVar);
            } else if (i2 >= 29 && (qVar instanceof l)) {
                this.a = new l(this, (l) qVar);
            } else if (qVar instanceof k) {
                this.a = new k(this, (k) qVar);
            } else if (qVar instanceof j) {
                this.a = new j(this, (j) qVar);
            } else if (qVar instanceof i) {
                this.a = new i(this, (i) qVar);
            } else {
                this.a = new q(this);
            }
            qVar.e(this);
            return;
        }
        this.a = new q(this);
    }

    /* compiled from: WindowInsetsCompat.java */
    public static class q {
        public static final bqx0 b;
        public final bqx0 a;

        static {
            int i = Build.VERSION.SDK_INT;
            b = (i >= 36 ? new g() : i >= 35 ? new f() : i >= 34 ? new e() : i >= 31 ? new d() : i >= 30 ? new c() : i >= 29 ? new b() : new a()).b().a.a().a.b().a.c();
        }

        public q(bqx0 bqx0Var) {
            this.a = bqx0Var;
        }

        public bqx0 a() {
            return this.a;
        }

        public bqx0 b() {
            return this.a;
        }

        public bqx0 c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof q)) {
                return false;
            }
            q qVar = (q) obj;
            return t() == qVar.t() && s() == qVar.s() && Objects.equals(n(), qVar.n()) && Objects.equals(l(), qVar.l()) && Objects.equals(h(), qVar.h());
        }

        public List<Rect> f(int i) {
            return Collections.EMPTY_LIST;
        }

        public List<Rect> g(int i) {
            return Collections.EMPTY_LIST;
        }

        public nen h() {
            return null;
        }

        public int hashCode() {
            return Objects.hash(Boolean.valueOf(t()), Boolean.valueOf(s()), n(), l(), h());
        }

        public h4x i(int i) {
            return h4x.e;
        }

        public h4x j(int i) {
            if ((i & 8) == 0) {
                return h4x.e;
            }
            throw new IllegalArgumentException("Unable to query the maximum insets for IME");
        }

        public h4x k() {
            return n();
        }

        public h4x l() {
            return h4x.e;
        }

        public h4x m() {
            return n();
        }

        public h4x n() {
            return h4x.e;
        }

        public h4x o() {
            return n();
        }

        public bqx0 r(int i, int i2, int i3, int i4) {
            return b;
        }

        public boolean s() {
            return false;
        }

        public boolean t() {
            return false;
        }

        public boolean u(int i) {
            return true;
        }

        public void q() {
        }

        public void A(int i) {
        }

        public void B(Rect[][] rectArr) {
        }

        public void C(Rect[][] rectArr) {
        }

        public void d(View view) {
        }

        public void e(bqx0 bqx0Var) {
        }

        public void p(View view) {
        }

        public void v(egn egnVar) {
        }

        public void w(h4x[] h4xVarArr) {
        }

        public void x(h4x h4xVar) {
        }

        public void y(bqx0 bqx0Var) {
        }

        public void z(h4x h4xVar) {
        }
    }
}
