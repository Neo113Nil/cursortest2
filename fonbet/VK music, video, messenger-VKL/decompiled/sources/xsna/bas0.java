package xsna;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.common.ui.holders.header.TopBarVh;

/* compiled from: VideoCatalogSearchRootVh.kt */
/* loaded from: classes16.dex */
public final class bas0 extends RecyclerView.t {
    public final /* synthetic */ TopBarVh b;

    public bas0(TopBarVh topBarVh) {
        this.b = topBarVh;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        super.onScrolled(recyclerView, i, i2);
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
        if (gridLayoutManager == null) {
            return;
        }
        this.b.tc(gridLayoutManager.v() > 2);
    }
}
