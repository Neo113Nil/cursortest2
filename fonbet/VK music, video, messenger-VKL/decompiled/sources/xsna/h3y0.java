package xsna;

import android.view.View;

/* compiled from: WriteView.java */
/* loaded from: classes3.dex */
public final class h3y0 implements View.OnClickListener {
    public final /* synthetic */ f3y0 b;

    public h3y0(f3y0 f3y0Var) {
        this.b = f3y0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        e2y0 e2y0Var = this.b.N;
        if (e2y0Var != null) {
            e2y0Var.r();
        }
    }
}
