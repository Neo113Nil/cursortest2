package xsna;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: OnDataUpdateDelegate.kt */
/* loaded from: classes17.dex */
public final class w380 extends RecyclerView.i implements RecyclerView.l.a {
    public final q8e a;
    public ah b;
    public boolean c;
    public boolean d;
    public boolean e;

    public w380(q8e q8eVar) {
        this.a = q8eVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l.a
    public final void a() {
        this.e = false;
        i();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void b() {
        j();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void c(int i, int i2) {
        j();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void d(int i, int i2, Object obj) {
        j();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void e(int i, int i2) {
        j();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void f(int i, int i2) {
        j();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void g(int i, int i2) {
        j();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void h() {
        j();
    }

    public final void i() {
        if (this.c && this.d && !this.e) {
            this.c = false;
            this.d = false;
            ah ahVar = this.b;
            if (ahVar != null) {
                ahVar.invoke();
            }
        }
    }

    public final void j() {
        this.c = true;
        this.d = false;
        if (!this.e) {
            RecyclerView.l itemAnimator = this.a.getItemAnimator();
            this.e = itemAnimator != null ? itemAnimator.o(this) : false;
        }
        i();
    }

    public final void k() {
        this.b = null;
    }

    public final void l(gzs<s3q0> gzsVar) {
        this.b = (ah) gzsVar;
    }
}
