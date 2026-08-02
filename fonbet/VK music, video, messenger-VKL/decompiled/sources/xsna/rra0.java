package xsna;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: PlacePickerView.kt */
/* loaded from: classes4.dex */
public final class rra0 extends RecyclerView.t {
    public final /* synthetic */ sra0 b;

    public rra0(sra0 sra0Var) {
        this.b = sra0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        if (i2 != 0) {
            mhy.d(this.b.e);
        }
    }
}
