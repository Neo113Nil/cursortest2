package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import just.adapter.sticky.a;

/* loaded from: classes9.dex */
public final class oeu0 extends RecyclerView.a {
    public final /* synthetic */ a a;

    public oeu0(a aVar) {
        this.a = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void a() {
        seu0 seu0Var = seu0.a;
        a aVar = this.a;
        aVar.f = seu0Var;
        aVar.a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void b(int i, int i2) {
        h(i, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void c(int i, int i2, Object obj) {
        h(i, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void d(int i, int i2) {
        h(i, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void e(int i, int i2) {
        h(i2, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void f(int i, int i2) {
        h(i, i2);
    }

    public final void h(int i, int i2) {
        d6w d6wVar = i2 == 0 ? d6w.w : new d6w(i, i2 + i, 1);
        a aVar = this.a;
        veu0 veu0Var = aVar.f;
        if (veu0Var instanceof ueu0) {
            ((ueu0) veu0Var).a.a(d6wVar);
        } else {
            t6i0 t6i0Var = new t6i0();
            t6i0Var.a(d6wVar);
            aVar.f = new ueu0(t6i0Var);
        }
        aVar.a();
    }
}
