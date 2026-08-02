package defpackage;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ru.yandex.taxi.scooters.presentation.detailed_order.v2.components.actions.ScootersNewControlPanelView;

/* loaded from: classes6.dex */
public final class h1o0 extends RecyclerView.a {
    public final /* synthetic */ GridLayoutManager a;
    public final /* synthetic */ ScootersNewControlPanelView b;

    public h1o0(GridLayoutManager gridLayoutManager, ScootersNewControlPanelView scootersNewControlPanelView) {
        this.a = gridLayoutManager;
        this.b = scootersNewControlPanelView;
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
    public final void c(int i, int i2, Object obj) {
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
        i1o0 i1o0Var;
        this.a.h0.d();
        i1o0Var = this.b.binding;
        i1o0Var.c.invalidateItemDecorations();
    }
}
