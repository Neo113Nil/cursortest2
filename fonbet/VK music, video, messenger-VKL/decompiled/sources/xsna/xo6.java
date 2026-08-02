package xsna;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: BaseSuperappMiniAppsFragment.kt */
/* loaded from: classes6.dex */
public final class xo6 extends RecyclerView.t {
    public final /* synthetic */ wo6 b;

    public xo6(wo6 wo6Var) {
        this.b = wo6Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        if (i == 1) {
            this.b.vn();
        }
    }
}
