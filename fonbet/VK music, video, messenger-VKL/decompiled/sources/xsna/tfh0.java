package xsna;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: PostFragment.kt */
/* loaded from: classes4.dex */
public final class tfh0 extends RecyclerView.t {
    public final yu60 b;

    public tfh0(yu60 yu60Var) {
        this.b = yu60Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        if (i == 0) {
            this.b.invoke();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        super.onScrolled(recyclerView, i, i2);
        hl60 hl60Var = hl60.a;
        hl60.c(i2);
    }
}
