package xsna;

import android.view.KeyEvent;
import android.view.View;

/* compiled from: WriteView.java */
/* loaded from: classes3.dex */
public final class c3y0 implements View.OnKeyListener {
    public final /* synthetic */ f3y0 b;

    public c3y0(f3y0 f3y0Var) {
        this.b = f3y0Var;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        xgy xgyVar;
        if (i != 4) {
            return false;
        }
        f3y0 f3y0Var = this.b;
        if (f3y0Var.I || (xgyVar = f3y0Var.M) == null || !xgyVar.e()) {
            return false;
        }
        if (keyEvent.getAction() == 1) {
            f3y0Var.M.d();
        }
        return true;
    }
}
