package xsna;

import android.view.View;
import xsna.efy;

/* compiled from: OpenKeyboardObserver.kt */
/* loaded from: classes15.dex */
public final class jr80 implements efy.a {
    public final View a;
    public final gzs<s3q0> b;
    public final ep0 c = new ep0(this, 9);

    public jr80(View view, gzs<s3q0> gzsVar) {
        this.a = view;
        this.b = gzsVar;
    }

    @Override // xsna.efy.a
    public final void x0(int i) {
        ep0 ep0Var = this.c;
        View view = this.a;
        if (view != null) {
            view.removeCallbacks(ep0Var);
        }
        if (view != null) {
            view.post(ep0Var);
        }
    }

    @Override // xsna.efy.a
    public final void Y0() {
    }
}
