package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.xm50;

/* loaded from: classes10.dex */
public final class z extends RecyclerView.a {
    public final /* synthetic */ a0 a;

    public z(a0 a0Var) {
        this.a = a0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void a() {
        a0 a0Var = this.a;
        a0Var.e = a0Var.c.getItemCount();
        f fVar = (f) a0Var.d;
        fVar.a.notifyDataSetChanged();
        fVar.a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void b(int i, int i2) {
        a0 a0Var = this.a;
        f fVar = (f) a0Var.d;
        fVar.a.notifyItemRangeChanged(i + fVar.b(a0Var), i2, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void c(int i, int i2, Object obj) {
        a0 a0Var = this.a;
        f fVar = (f) a0Var.d;
        fVar.a.notifyItemRangeChanged(i + fVar.b(a0Var), i2, obj);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void d(int i, int i2) {
        a0 a0Var = this.a;
        a0Var.e += i2;
        xm50 xm50Var = a0Var.d;
        f fVar = (f) xm50Var;
        fVar.a.notifyItemRangeInserted(i + fVar.b(a0Var), i2);
        if (a0Var.e <= 0 || a0Var.c.getStateRestorationPolicy() != RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY) {
            return;
        }
        ((f) xm50Var).a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void e(int i, int i2) {
        a0 a0Var = this.a;
        f fVar = (f) a0Var.d;
        int b = fVar.b(a0Var);
        fVar.a.notifyItemMoved(i + b, i2 + b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void f(int i, int i2) {
        a0 a0Var = this.a;
        a0Var.e -= i2;
        xm50 xm50Var = a0Var.d;
        f fVar = (f) xm50Var;
        fVar.a.notifyItemRangeRemoved(i + fVar.b(a0Var), i2);
        if (a0Var.e >= 1 || a0Var.c.getStateRestorationPolicy() != RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY) {
            return;
        }
        ((f) xm50Var).a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void g() {
        ((f) this.a.d).a();
    }
}
