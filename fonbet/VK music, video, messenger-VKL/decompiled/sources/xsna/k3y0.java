package xsna;

import android.view.View;
import android.widget.EditText;

/* compiled from: WriteView.java */
/* loaded from: classes3.dex */
public final class k3y0 implements View.OnClickListener {
    public final /* synthetic */ f3y0 b;

    public k3y0(f3y0 f3y0Var) {
        this.b = f3y0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        xgy xgyVar;
        xgy xgyVar2;
        b25 a = o25.a();
        f3y0 f3y0Var = this.b;
        pxo0 pxo0Var = f3y0Var.u;
        f3y0Var.getContext();
        a.getClass();
        if (f3y0Var.J) {
            if (pxo0Var.c() || (xgyVar2 = f3y0Var.M) == null) {
                return;
            }
            if (f3y0Var.K) {
                f3y0Var.k();
                f3y0Var.g1();
                return;
            }
            xgyVar2.a(view, null);
            f3y0Var.d0();
            xgy xgyVar3 = f3y0Var.M;
            if (xgyVar3 != null) {
                f3y0Var.K = true;
                xgyVar3.h(Boolean.FALSE);
                f3y0Var.N.A1();
                return;
            }
            return;
        }
        if (pxo0Var.c() || (xgyVar = f3y0Var.M) == null) {
            return;
        }
        xgyVar.a(view, null);
        if (f3y0Var.K) {
            f3y0Var.g1();
        } else {
            f3y0Var.d0();
            xgy xgyVar4 = f3y0Var.M;
            if (xgyVar4 != null) {
                f3y0Var.K = true;
                xgyVar4.h(Boolean.FALSE);
                f3y0Var.N.A1();
            }
        }
        EditText editText = f3y0Var.n;
        if (editText == null || editText.hasFocus()) {
            return;
        }
        editText.requestFocus();
    }
}
