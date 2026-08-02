package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes9.dex */
public final class i6q0 extends RecyclerView.g {
    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int childCount = recyclerView.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            recyclerView.getChildViewHolder(recyclerView.getChildAt(i3));
        }
    }
}
