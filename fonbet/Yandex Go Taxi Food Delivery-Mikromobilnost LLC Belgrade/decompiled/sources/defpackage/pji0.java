package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes5.dex */
public final class pji0 extends RecyclerView.a {
    public final /* synthetic */ rji0 a;

    public pji0(rji0 rji0Var) {
        this.a = rji0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void a() {
        h();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void b(int i, int i2) {
        h();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void d(int i, int i2) {
        h();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void e(int i, int i2) {
        h();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void f(int i, int i2) {
        h();
    }

    public final void h() {
        rji0 rji0Var = this.a;
        RecyclerView recyclerView = rji0Var.b;
        if (recyclerView == null || rji0Var.g) {
            return;
        }
        rji0Var.g = true;
        recyclerView.post(new oxe0(22, rji0Var));
    }
}
