package xsna;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: AbstractSearchDatabaseDialog.kt */
/* loaded from: classes5.dex */
public final class rh extends RecyclerView.t {
    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        if (i == 1) {
            mhy.d(recyclerView);
        }
    }
}
