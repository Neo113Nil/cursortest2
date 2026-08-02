package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import core.flex.ui.OrientationAwareRecyclerView;

/* loaded from: classes12.dex */
public final class da00 extends RecyclerView.g {
    public final fbz a;
    public boolean b;

    public da00(OrientationAwareRecyclerView orientationAwareRecyclerView) {
        this.a = new fbz(this, orientationAwareRecyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        RecyclerView.e layoutManager;
        if (i == 0 && i2 == 0) {
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            fbz fbzVar = this.a;
            if (adapter == null || (layoutManager = recyclerView.getLayoutManager()) == null || adapter.getItemCount() <= 0 || layoutManager.d0() != 0) {
                this.b = false;
                recyclerView.removeCallbacks(fbzVar);
            } else {
                if (this.b) {
                    return;
                }
                this.b = true;
                recyclerView.post(fbzVar);
            }
        }
    }
}
