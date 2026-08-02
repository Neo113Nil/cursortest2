package xsna;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;

/* compiled from: AttachmentsTouchHelper.kt */
/* loaded from: classes4.dex */
public final class u84 extends r.d {
    public final gvx e;

    public u84(gvx gvxVar) {
        this.e = gvxVar;
    }

    @Override // androidx.recyclerview.widget.r.d
    public final void b(RecyclerView recyclerView, RecyclerView.e0 e0Var) {
        e0Var.itemView.setAlpha(1.0f);
        super.b(recyclerView, e0Var);
    }

    @Override // androidx.recyclerview.widget.r.d
    public final int f(RecyclerView recyclerView, RecyclerView.e0 e0Var) {
        return r.d.l(e0Var instanceof b4d0 ? 0 : 3, 0);
    }

    @Override // androidx.recyclerview.widget.r.d
    public final boolean j() {
        return false;
    }

    @Override // androidx.recyclerview.widget.r.d
    public final boolean k() {
        return true;
    }

    @Override // androidx.recyclerview.widget.r.d
    public final boolean n(RecyclerView recyclerView, RecyclerView.e0 e0Var, RecyclerView.e0 e0Var2) {
        return this.e.d(e0Var.getAdapterPosition(), e0Var2.getAdapterPosition());
    }

    @Override // androidx.recyclerview.widget.r.d
    public final void o(RecyclerView.e0 e0Var, int i) {
        View view;
        vvr0.c();
        if (e0Var == null || (view = e0Var.itemView) == null) {
            return;
        }
        view.setAlpha(0.75f);
    }

    @Override // androidx.recyclerview.widget.r.d
    public final void p(RecyclerView.e0 e0Var) {
    }
}
