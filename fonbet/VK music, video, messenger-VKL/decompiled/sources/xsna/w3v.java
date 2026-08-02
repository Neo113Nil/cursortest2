package xsna;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: HideKeyboardDragListener.kt */
/* loaded from: classes18.dex */
public final class w3v extends RecyclerView.t {
    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        if (i == 1) {
            mhy.d(recyclerView);
        }
    }
}
