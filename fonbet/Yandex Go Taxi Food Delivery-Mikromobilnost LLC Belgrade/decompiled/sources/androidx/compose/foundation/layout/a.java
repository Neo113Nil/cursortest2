package androidx.compose.foundation.layout;

import android.graphics.Path;
import android.os.Build;
import android.view.View;
import androidx.compose.runtime.f;
import androidx.core.view.ViewCompat$Api21Impl;
import defpackage.an91;
import defpackage.bzj;
import defpackage.iz40;
import defpackage.jb2;
import defpackage.k131;
import defpackage.k751;
import defpackage.n751;
import defpackage.ohh0;
import defpackage.op31;
import defpackage.oz40;
import defpackage.q2t0;
import defpackage.s2w;
import defpackage.sd2;
import defpackage.sy11;
import defpackage.u1w;
import defpackage.vm2;
import defpackage.vuz;
import java.util.WeakHashMap;

/* loaded from: classes10.dex */
public final class a {
    public static final WeakHashMap w = new WeakHashMap();
    public final sd2 a;
    public final sd2 b;
    public final sd2 c;
    public final sd2 d;
    public final sd2 e;
    public final sd2 f;
    public final sd2 g;
    public final sd2 h;
    public final sd2 i;
    public final k131 j;
    public final oz40 k;
    public final sy11 l;
    public final k131 m;
    public final k131 n;
    public final k131 o;
    public final k131 p;
    public final k131 q;
    public final k131 r;
    public final k131 s;
    public final boolean t;
    public int u;
    public final InsetsListener v;

    public a(View view) {
        sd2 m = vuz.m(4, "captionBar");
        this.a = m;
        sd2 m2 = vuz.m(128, "displayCutout");
        this.b = m2;
        sd2 m3 = vuz.m(8, "ime");
        this.c = m3;
        sd2 m4 = vuz.m(32, "mandatorySystemGestures");
        this.d = m4;
        sd2 m5 = vuz.m(2, "navigationBars");
        this.e = m5;
        sd2 m6 = vuz.m(1, "statusBars");
        this.f = m6;
        sd2 m7 = vuz.m(519, "systemBars");
        this.g = m7;
        sd2 m8 = vuz.m(16, "systemGestures");
        this.h = m8;
        sd2 m9 = vuz.m(64, "tappableElement");
        this.i = m9;
        k131 k131Var = new k131(new s2w(0, 0, 0, 0), "waterfall");
        this.j = k131Var;
        this.k = f.j(null);
        sy11 sy11Var = new sy11(new sy11(m7, m3), m2);
        this.l = sy11Var;
        new sy11(sy11Var, new sy11(new sy11(new sy11(m9, m4), m8), k131Var));
        this.m = vuz.n(4, "captionBarIgnoringVisibility");
        this.n = vuz.n(2, "navigationBarsIgnoringVisibility");
        this.o = vuz.n(1, "statusBarsIgnoringVisibility");
        this.p = vuz.n(519, "systemBarsIgnoringVisibility");
        this.q = vuz.n(64, "tappableElementIgnoringVisibility");
        this.r = new k131(new s2w(0, 0, 0, 0), "imeAnimationTarget");
        this.s = new k131(new s2w(0, 0, 0, 0), "imeAnimationSource");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(ohh0.consume_window_insets_tag) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.t = bool != null ? bool.booleanValue() : false;
        this.v = new InsetsListener(this);
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        n751 a = op31.a(view);
        if (a != null) {
            k751 k751Var = a.a;
            m.g(k751Var.q(4));
            m2.g(k751Var.q(128));
            m3.g(k751Var.q(8));
            m4.g(k751Var.q(32));
            m5.g(k751Var.q(2));
            m6.g(k751Var.q(1));
            m7.g(k751Var.q(519));
            m8.g(k751Var.q(16));
            m9.g(k751Var.q(64));
        }
    }

    public static void b(a aVar, n751 n751Var) {
        boolean z = false;
        aVar.a.h(n751Var, 0);
        aVar.c.h(n751Var, 0);
        aVar.b.h(n751Var, 0);
        aVar.e.h(n751Var, 0);
        aVar.f.h(n751Var, 0);
        aVar.g.h(n751Var, 0);
        aVar.h.h(n751Var, 0);
        aVar.i.h(n751Var, 0);
        aVar.d.h(n751Var, 0);
        aVar.m.f(an91.p(n751Var.a.h(4)));
        aVar.n.f(an91.p(n751Var.a.h(2)));
        aVar.o.f(an91.p(n751Var.a.h(1)));
        aVar.p.f(an91.p(n751Var.a.h(519)));
        aVar.q.f(an91.p(n751Var.a.h(64)));
        bzj f = n751Var.a.f();
        aVar.j.f(an91.p(f != null ? f.a() : u1w.e));
        jb2 jb2Var = null;
        if (f != null) {
            Path d = Build.VERSION.SDK_INT >= 31 ? vm2.d(f.a) : null;
            if (d != null) {
                jb2Var = new jb2(d);
            }
        }
        aVar.k.setValue(jb2Var);
        synchronized (q2t0.c) {
            iz40 iz40Var = q2t0.j.h;
            if (iz40Var != null) {
                if (iz40Var.h()) {
                    z = true;
                }
            }
        }
        if (z) {
            q2t0.a();
        }
    }

    public final void a(View view) {
        if (this.u == 0) {
            WeakHashMap weakHashMap = androidx.core.view.b.a;
            InsetsListener insetsListener = this.v;
            ViewCompat$Api21Impl.o(view, insetsListener);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(insetsListener);
            androidx.core.view.b.u(view, insetsListener);
        }
        this.u++;
    }
}
