package xsna;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: HideKeyboardScrollListener.kt */
/* loaded from: classes7.dex */
public final class y3v extends RecyclerView.t {
    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        if (i != 1) {
            mhy.d(recyclerView);
        }
    }
}
