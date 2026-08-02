package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes9.dex */
public final class i0y extends RecyclerView.g {
    public final e6q0 a;
    public final e6q0 b;
    public int c = -1;
    public int d = -1;

    public i0y(e6q0 e6q0Var, e6q0 e6q0Var2) {
        this.a = e6q0Var;
        this.b = e6q0Var2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        Object layoutManager = recyclerView.getLayoutManager();
        gki0 gki0Var = layoutManager instanceof gki0 ? (gki0) layoutManager : null;
        if (gki0Var == null) {
            return;
        }
        int a = gki0Var.a();
        int b = gki0Var.b();
        if (this.c != a) {
            this.a.invoke(Integer.valueOf(a));
        }
        if (this.d != b) {
            this.b.invoke(Integer.valueOf(b));
        }
        this.c = a;
        this.d = b;
    }
}
