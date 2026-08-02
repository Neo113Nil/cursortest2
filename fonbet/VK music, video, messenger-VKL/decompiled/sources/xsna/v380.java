package xsna;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: OnDataUpdateDelegate.kt */
/* loaded from: classes17.dex */
public final class v380 extends RecyclerView.i implements RecyclerView.l.a {
    public final q8e a;
    public hg b;
    public boolean c;
    public boolean d;
    public boolean e;

    /* compiled from: View.kt */
    public static final class a implements View.OnLayoutChangeListener {
        public a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            view.removeOnLayoutChangeListener(this);
            v380 v380Var = v380.this;
            v380Var.d = true;
            v380Var.i();
        }
    }

    public v380(q8e q8eVar) {
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
            hg hgVar = this.b;
            if (hgVar != null) {
                hgVar.invoke();
            }
        }
    }

    public final void j() {
        this.c = true;
        this.d = false;
        a aVar = new a();
        q8e q8eVar = this.a;
        q8eVar.addOnLayoutChangeListener(aVar);
        if (!this.e) {
            RecyclerView.l itemAnimator = q8eVar.getItemAnimator();
            this.e = itemAnimator != null ? itemAnimator.o(this) : false;
        }
        i();
    }
}
