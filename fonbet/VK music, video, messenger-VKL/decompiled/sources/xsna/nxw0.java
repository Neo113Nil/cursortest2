package xsna;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: VoipScheduleCallView.kt */
/* loaded from: classes7.dex */
public final class nxw0 extends RecyclerView.t {
    public final /* synthetic */ oxw0 b;

    public nxw0(oxw0 oxw0Var) {
        this.b = oxw0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        if (i == 1) {
            mhy.b(this.b.getContext());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
    }
}
