package xsna;

import android.text.Editable;

/* compiled from: ReplyBarView.kt */
/* loaded from: classes4.dex */
public final class t3g0 extends rno0 {
    public final /* synthetic */ u3g0 b;

    public t3g0(u3g0 u3g0Var) {
        this.b = u3g0Var;
    }

    @Override // xsna.rno0, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        m3g0 m3g0Var;
        u3g0 u3g0Var = this.b;
        if (u3g0Var.n || (m3g0Var = u3g0Var.c) == null) {
            return;
        }
        oo6 oo6Var = m3g0Var.o;
        io.reactivex.rxjava3.disposables.c cVar = m3g0Var.p;
        if (cVar != null) {
            cVar.dispose();
        }
        m3g0Var.p = null;
        m3g0Var.n = true;
        pro0.d(oo6Var);
        i0q0.d(160L, oo6Var);
    }
}
