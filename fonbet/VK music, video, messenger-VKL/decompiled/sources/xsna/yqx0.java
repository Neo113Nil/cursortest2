package xsna;

import android.graphics.Path;
import android.os.Build;
import android.view.View;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.vkontakte.android.R;
import java.util.WeakHashMap;
import xsna.bqx0;
import xsna.iut0;
import xsna.nen;

/* compiled from: WindowInsets.android.kt */
/* loaded from: classes11.dex */
public final class yqx0 {
    public static final WeakHashMap<View, yqx0> w = new WeakHashMap<>();
    public final te2 a;
    public final te2 b;
    public final te2 c;
    public final te2 d;
    public final te2 e;
    public final te2 f;
    public final te2 g;
    public final te2 h;
    public final te2 i;
    public final yjr0 j;
    public final wh50 k;
    public final o3q0 l;
    public final yjr0 m;
    public final yjr0 n;
    public final yjr0 o;
    public final yjr0 p;
    public final yjr0 q;
    public final yjr0 r;
    public final yjr0 s;
    public final boolean t;
    public int u;
    public final n4x v;

    /* compiled from: WindowInsets.android.kt */
    public static final class a {
        public static final te2 a(int i, String str) {
            WeakHashMap<View, yqx0> weakHashMap = yqx0.w;
            return new te2(i, str);
        }

        public static final yjr0 b(int i, String str) {
            WeakHashMap<View, yqx0> weakHashMap = yqx0.w;
            return new yjr0(new s4x(0, 0, 0, 0), str);
        }

        public static yqx0 c(androidx.compose.runtime.a aVar) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1366542614, 6, -1, "androidx.compose.foundation.layout.WindowInsetsHolder.Companion.current (WindowInsets.android.kt:574)");
            }
            View view = (View) aVar.r(AndroidCompositionLocals_androidKt.f);
            yqx0 d = d(view);
            boolean y = aVar.y(d) | aVar.y(view);
            Object x = aVar.x();
            if (y || x == a.C0011a.a) {
                x = new uyn0(5, d, view);
                aVar.R(x);
            }
            bap.c(d, (izs) x, aVar, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            return d;
        }

        public static yqx0 d(View view) {
            yqx0 yqx0Var;
            WeakHashMap<View, yqx0> weakHashMap = yqx0.w;
            synchronized (weakHashMap) {
                try {
                    yqx0 yqx0Var2 = weakHashMap.get(view);
                    if (yqx0Var2 == null) {
                        yqx0Var2 = new yqx0(view);
                        weakHashMap.put(view, yqx0Var2);
                    }
                    yqx0Var = yqx0Var2;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return yqx0Var;
        }
    }

    public yqx0(View view) {
        te2 a2 = a.a(4, "captionBar");
        this.a = a2;
        te2 a3 = a.a(128, "displayCutout");
        this.b = a3;
        te2 a4 = a.a(8, "ime");
        this.c = a4;
        te2 a5 = a.a(32, "mandatorySystemGestures");
        this.d = a5;
        te2 a6 = a.a(2, "navigationBars");
        this.e = a6;
        te2 a7 = a.a(1, "statusBars");
        this.f = a7;
        te2 a8 = a.a(519, "systemBars");
        this.g = a8;
        te2 a9 = a.a(16, "systemGestures");
        this.h = a9;
        te2 a10 = a.a(64, "tappableElement");
        this.i = a10;
        yjr0 yjr0Var = new yjr0(new s4x(0, 0, 0, 0), com.ironsource.mediationsdk.d.h);
        this.j = yjr0Var;
        this.k = androidx.compose.runtime.k.b(null);
        o3q0 o3q0Var = new o3q0(new o3q0(a8, a4), a3);
        this.l = o3q0Var;
        new o3q0(o3q0Var, new o3q0(new o3q0(new o3q0(a10, a5), a9), yjr0Var));
        this.m = a.b(4, "captionBarIgnoringVisibility");
        this.n = a.b(2, "navigationBarsIgnoringVisibility");
        this.o = a.b(1, "statusBarsIgnoringVisibility");
        this.p = a.b(519, "systemBarsIgnoringVisibility");
        this.q = a.b(64, "tappableElementIgnoringVisibility");
        this.r = new yjr0(new s4x(0, 0, 0, 0), "imeAnimationTarget");
        this.s = new yjr0(new s4x(0, 0, 0, 0), "imeAnimationSource");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(R.id.consume_window_insets_tag) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.t = bool != null ? bool.booleanValue() : false;
        this.v = new n4x(this);
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        bqx0 a11 = iut0.e.a(view);
        if (a11 != null) {
            bqx0.q qVar = a11.a;
            a2.f(qVar.u(4));
            a3.f(qVar.u(128));
            a4.f(qVar.u(8));
            a5.f(qVar.u(32));
            a6.f(qVar.u(2));
            a7.f(qVar.u(1));
            a8.f(qVar.u(519));
            a9.f(qVar.u(16));
            a10.f(qVar.u(64));
        }
    }

    public static void b(yqx0 yqx0Var, bqx0 bqx0Var) {
        boolean z = false;
        yqx0Var.a.g(bqx0Var, 0);
        yqx0Var.c.g(bqx0Var, 0);
        yqx0Var.b.g(bqx0Var, 0);
        yqx0Var.e.g(bqx0Var, 0);
        yqx0Var.f.g(bqx0Var, 0);
        yqx0Var.g.g(bqx0Var, 0);
        yqx0Var.h.g(bqx0Var, 0);
        yqx0Var.i.g(bqx0Var, 0);
        yqx0Var.d.g(bqx0Var, 0);
        yqx0Var.m.f(drx0.a(bqx0Var.a.j(4)));
        yqx0Var.n.f(drx0.a(bqx0Var.a.j(2)));
        yqx0Var.o.f(drx0.a(bqx0Var.a.j(1)));
        yqx0Var.p.f(drx0.a(bqx0Var.a.j(519)));
        yqx0Var.q.f(drx0.a(bqx0Var.a.j(64)));
        nen h = bqx0Var.a.h();
        yqx0Var.j.f(drx0.a(h != null ? h.e() : h4x.e));
        androidx.compose.ui.graphics.a aVar = null;
        if (h != null) {
            Path a2 = Build.VERSION.SDK_INT >= 31 ? nen.b.a(h.a) : null;
            if (a2 != null) {
                aVar = new androidx.compose.ui.graphics.a(a2);
            }
        }
        ((zak0) yqx0Var.k).setValue(aVar);
        synchronized (qak0.c) {
            qh50<muk0> qh50Var = qak0.j.h;
            if (qh50Var != null) {
                if (qh50Var.d()) {
                    z = true;
                }
            }
        }
        if (z) {
            qak0.a();
        }
    }

    public final void a(View view) {
        if (this.u == 0) {
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            n4x n4xVar = this.v;
            iut0.d.c(view, n4xVar);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(n4xVar);
            aqx0.a(view, n4xVar);
        }
        this.u++;
    }
}
