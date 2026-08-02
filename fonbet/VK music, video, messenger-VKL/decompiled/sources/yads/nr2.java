package yads;

import android.app.Dialog;

/* loaded from: classes10.dex */
public final class nr2 implements t2 {
    public final js2 a;
    public final or2 b;

    public nr2(js2 js2Var, or2 or2Var) {
        this.a = js2Var;
        this.b = or2Var;
    }

    @Override // yads.t2
    public final void b() {
        js2 js2Var = this.a;
        js2Var.d = true;
        Dialog dialog = ((fi0) js2Var.b).f;
        if (dialog != null) {
            ng0.a(dialog);
        }
        ((q2) this.b.a).a(13, null);
    }
}
