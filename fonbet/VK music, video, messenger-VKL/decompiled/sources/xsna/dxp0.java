package xsna;

import android.app.Activity;
import xsna.c63;

/* compiled from: UIRebuilderDelegate.kt */
/* loaded from: classes7.dex */
public final class dxp0 extends c63.b {
    public final /* synthetic */ gqe0 b;

    public dxp0(gqe0 gqe0Var) {
        this.b = gqe0Var;
    }

    @Override // xsna.c63.b
    public final void p(Activity activity) {
        ww50 v = s200.v(activity);
        if (v == null) {
            return;
        }
        c63 c63Var = c63.a;
        c63.c(this);
        this.b.invoke(v);
    }
}
