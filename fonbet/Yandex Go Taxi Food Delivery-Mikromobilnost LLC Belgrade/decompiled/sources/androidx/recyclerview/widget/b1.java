package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class b1 extends RecyclerView.c {
    public boolean g = true;

    @Override // androidx.recyclerview.widget.RecyclerView.c
    public final boolean a(x0 x0Var, RecyclerView.c.a aVar, RecyclerView.c.a aVar2) {
        int i;
        int i2;
        return (aVar == null || ((i = aVar.a) == (i2 = aVar2.a) && aVar.b == aVar2.b)) ? o(x0Var) : q(x0Var, i, aVar.b, i2, aVar2.b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.c
    public final boolean b(x0 x0Var, x0 x0Var2, RecyclerView.c.a aVar, RecyclerView.c.a aVar2) {
        int i;
        int i2 = aVar.a;
        int i3 = aVar.b;
        if (x0Var2.U()) {
            i = aVar.a;
        } else {
            i = aVar2.a;
            aVar = aVar2;
        }
        return p(x0Var, x0Var2, i2, i3, i, aVar.b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.c
    public final boolean c(x0 x0Var, RecyclerView.c.a aVar, RecyclerView.c.a aVar2) {
        int i = aVar.a;
        int i2 = aVar.b;
        View view = x0Var.a;
        int left = aVar2 == null ? view.getLeft() : aVar2.a;
        int top = aVar2 == null ? view.getTop() : aVar2.b;
        if (x0Var.N() || (i == left && i2 == top)) {
            return r(x0Var);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return q(x0Var, i, i2, left, top);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.c
    public final boolean d(x0 x0Var, RecyclerView.c.a aVar, RecyclerView.c.a aVar2) {
        int i = aVar.a;
        int i2 = aVar2.a;
        if (i != i2 || aVar.b != aVar2.b) {
            return q(x0Var, i, aVar.b, i2, aVar2.b);
        }
        h(x0Var);
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.c
    public boolean f(x0 x0Var) {
        return !this.g || x0Var.L();
    }

    public abstract boolean o(x0 x0Var);

    public abstract boolean p(x0 x0Var, x0 x0Var2, int i, int i2, int i3, int i4);

    public abstract boolean q(x0 x0Var, int i, int i2, int i3, int i4);

    public abstract boolean r(x0 x0Var);

    public final void s(x0 x0Var) {
        t(x0Var);
        h(x0Var);
    }

    public void t(x0 x0Var) {
    }
}
