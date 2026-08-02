package xsna;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: NewsfeedAsyncBlockLoader.kt */
/* loaded from: classes4.dex */
public final class oc60 implements zjf0<ol60> {
    public final awy b;

    public oc60(awy awyVar) {
        this.b = awyVar;
    }

    @Override // xsna.zjf0
    public final void d(RecyclerView.e0 e0Var, ol60 ol60Var) {
        ol60 ol60Var2 = ol60Var;
        boolean z = ol60Var2 instanceof z1c0;
        if (z) {
            if (z ? ((z1c0) ol60Var2).h.g() : false) {
                this.b.b(((z1c0) ol60Var2).h.b);
            }
        }
    }

    @Override // xsna.zjf0
    public final void b(RecyclerView.e0 e0Var) {
    }

    @Override // xsna.zjf0
    public final void e(RecyclerView.e0 e0Var) {
    }
}
