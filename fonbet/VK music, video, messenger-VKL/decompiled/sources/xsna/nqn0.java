package xsna;

import android.view.View;
import java.util.WeakHashMap;
import xsna.iut0;
import xsna.yqx0;

/* compiled from: WindowInsetsPadding.android.kt */
/* loaded from: classes11.dex */
public final class nqn0 extends q4x {
    public izs<? super yqx0, ? extends zpx0> s;
    public yqx0 t;

    public nqn0() {
        throw null;
    }

    @Override // xsna.k4x, xsna.q630.c
    public final void a2() {
        View a = jtl.a(this);
        WeakHashMap<View, yqx0> weakHashMap = yqx0.w;
        yqx0 d = yqx0.a.d(a);
        d.a(a);
        zpx0 invoke = this.s.invoke(d);
        if (!epx.f(invoke, this.r)) {
            this.r = invoke;
            j2();
        }
        this.t = d;
        super.a2();
    }

    @Override // xsna.k4x, xsna.q630.c
    public final void b2() {
        View a = jtl.a(this);
        yqx0 yqx0Var = this.t;
        if (yqx0Var != null) {
            int i = yqx0Var.u - 1;
            yqx0Var.u = i;
            if (i == 0) {
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                iut0.d.c(a, null);
                aqx0.a(a, null);
                a.removeOnAttachStateChangeListener(yqx0Var.v);
            }
        }
        super.b2();
    }
}
