package xsna;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: NewsfeedItemAnimator.kt */
/* loaded from: classes4.dex */
public final class hm60 extends androidx.recyclerview.widget.g {
    public boolean t;

    public static final void H(hm60 hm60Var, RecyclerView.e0 e0Var, RecyclerView.e0 e0Var2) {
        if ((e0Var instanceof al2) || (e0Var2 instanceof al2)) {
            hm60Var.t = true;
        }
    }

    @Override // androidx.recyclerview.widget.n0, androidx.recyclerview.widget.RecyclerView.l
    public final boolean a(RecyclerView.e0 e0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2) {
        H(this, e0Var, null);
        if (this.t) {
            return super.a(e0Var, cVar, cVar2);
        }
        h(e0Var);
        return false;
    }

    @Override // androidx.recyclerview.widget.n0, androidx.recyclerview.widget.RecyclerView.l
    public final boolean b(RecyclerView.e0 e0Var, RecyclerView.e0 e0Var2, RecyclerView.l.c cVar, RecyclerView.l.c cVar2) {
        H(this, e0Var, e0Var2);
        if (this.t) {
            return super.b(e0Var, e0Var2, cVar, cVar2);
        }
        h(e0Var);
        h(e0Var2);
        return false;
    }

    @Override // androidx.recyclerview.widget.n0, androidx.recyclerview.widget.RecyclerView.l
    public final boolean c(RecyclerView.e0 e0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2) {
        H(this, e0Var, null);
        if (this.t) {
            return super.c(e0Var, cVar, cVar2);
        }
        h(e0Var);
        return false;
    }

    @Override // androidx.recyclerview.widget.n0, androidx.recyclerview.widget.RecyclerView.l
    public final boolean d(RecyclerView.e0 e0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2) {
        H(this, e0Var, null);
        if (this.t) {
            return super.d(e0Var, cVar, cVar2);
        }
        h(e0Var);
        return false;
    }

    @Override // androidx.recyclerview.widget.g, androidx.recyclerview.widget.RecyclerView.l
    public final void r() {
        if (this.t) {
            super.r();
            o(new RecyclerView.l.a() { // from class: xsna.gm60
                @Override // androidx.recyclerview.widget.RecyclerView.l.a
                public final void a() {
                    hm60.this.t = false;
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.g, androidx.recyclerview.widget.n0
    public final boolean w(RecyclerView.e0 e0Var) {
        H(this, e0Var, null);
        if (this.t) {
            super.w(e0Var);
            return true;
        }
        h(e0Var);
        return false;
    }

    @Override // androidx.recyclerview.widget.g, androidx.recyclerview.widget.n0
    public final boolean x(RecyclerView.e0 e0Var, RecyclerView.e0 e0Var2, int i, int i2, int i3, int i4) {
        H(this, e0Var, e0Var2);
        if (this.t) {
            return super.x(e0Var, e0Var2, i, i2, i3, i4);
        }
        h(e0Var);
        if (e0Var2 == null) {
            return false;
        }
        h(e0Var2);
        return false;
    }

    @Override // androidx.recyclerview.widget.g, androidx.recyclerview.widget.n0
    public final boolean y(RecyclerView.e0 e0Var, int i, int i2, int i3, int i4) {
        H(this, e0Var, null);
        if (this.t) {
            return super.y(e0Var, i, i2, i3, i4);
        }
        h(e0Var);
        return false;
    }

    @Override // androidx.recyclerview.widget.g, androidx.recyclerview.widget.n0
    public final boolean z(RecyclerView.e0 e0Var) {
        H(this, e0Var, null);
        if (this.t) {
            super.z(e0Var);
            return true;
        }
        h(e0Var);
        return false;
    }
}
