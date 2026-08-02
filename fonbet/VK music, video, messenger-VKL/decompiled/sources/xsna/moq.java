package xsna;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: FaveFeedFragment.kt */
/* loaded from: classes4.dex */
public final class moq extends GridLayoutManager.c {
    public final /* synthetic */ RecyclerView.Adapter<?> d;

    public moq(ho60 ho60Var) {
        this.d = ho60Var;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.c
    public final int c(int i) {
        int itemViewType = this.d.getItemViewType(i);
        return (itemViewType == -1 || itemViewType == 396 || itemViewType == 401) ? 1 : 2;
    }
}
