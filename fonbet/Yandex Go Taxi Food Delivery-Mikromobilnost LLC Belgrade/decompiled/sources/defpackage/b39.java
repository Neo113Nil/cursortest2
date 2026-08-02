package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class b39 extends RecyclerView.g {
    public final /* synthetic */ d39 a;

    public b39(d39 d39Var) {
        this.a = d39Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        d39 d39Var = this.a;
        if (i != 0) {
            if (i != 1) {
                return;
            }
            d39Var.d0 = false;
        } else if (d39Var.d0) {
            d39Var.d0 = false;
            d39Var.c0.invoke();
        }
    }
}
