package xsna;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class t4e0 extends RecyclerView.t {
    public final /* synthetic */ s4e0 b;

    public t4e0(s4e0 s4e0Var) {
        this.b = s4e0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        super.onScrollStateChanged(recyclerView, i);
        s4e0 s4e0Var = this.b;
        s4e0Var.e = !s4e0Var.canScrollHorizontally(1);
        s4e0Var.d = true ^ s4e0Var.canScrollHorizontally(-1);
    }
}
