package xsna;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: HideKeyboardScrollListener.kt */
/* loaded from: classes16.dex */
public final class z3v extends RecyclerView.t {
    public final boolean b;

    public z3v(boolean z) {
        this.b = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        boolean z = this.b;
        if (i == 1) {
            z = !z;
        }
        int i2 = ify.a;
        if (ify.e(ify.c) && z) {
            mhy.d(recyclerView);
        }
    }
}
