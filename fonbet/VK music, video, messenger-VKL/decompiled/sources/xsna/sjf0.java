package xsna;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: RecyclerViewExt.kt */
/* loaded from: classes17.dex */
public final class sjf0 extends RecyclerView.i {
    public final /* synthetic */ RecyclerView.Adapter<RecyclerView.e0> a;
    public final /* synthetic */ gzs<s3q0> b;

    public sjf0(RecyclerView.Adapter<RecyclerView.e0> adapter, gzs<s3q0> gzsVar) {
        this.a = adapter;
        this.b = gzsVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void b() {
        i();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void c(int i, int i2) {
        i();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void d(int i, int i2, Object obj) {
        i();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void e(int i, int i2) {
        i();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void f(int i, int i2) {
        i();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void g(int i, int i2) {
        i();
    }

    public final void i() {
        this.a.unregisterAdapterDataObserver(this);
        this.b.invoke();
    }
}
