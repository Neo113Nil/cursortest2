package xsna;

import android.view.View;
import java.util.WeakHashMap;
import xsna.iut0;

/* compiled from: Effects.kt */
/* loaded from: classes11.dex */
public final class xqx0 implements kgn {
    public final /* synthetic */ yqx0 a;
    public final /* synthetic */ View b;

    public xqx0(yqx0 yqx0Var, View view) {
        this.a = yqx0Var;
        this.b = view;
    }

    @Override // xsna.kgn
    public final void dispose() {
        yqx0 yqx0Var = this.a;
        int i = yqx0Var.u - 1;
        yqx0Var.u = i;
        if (i == 0) {
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            View view = this.b;
            iut0.d.c(view, null);
            aqx0.a(view, null);
            view.removeOnAttachStateChangeListener(yqx0Var.v);
        }
    }
}
