package xsna;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: ReactionsScrollListener.kt */
/* loaded from: classes4.dex */
public final class j6f0 extends RecyclerView.t {
    public final g3f0 b;

    public j6f0(g3f0 g3f0Var) {
        this.b = g3f0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        c6f0 c6f0Var = this.b.a.h;
        if (c6f0Var != null) {
            m3r m3rVar = c6f0Var.c;
            if (!m3rVar.C) {
                m3rVar.requestLayout();
            }
            s3q0 s3q0Var = s3q0.a;
        }
    }
}
