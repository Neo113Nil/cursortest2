package xsna;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.common.ui.mvp.holder.header.ToolbarVh;

/* compiled from: VideoCatalogRootVh.kt */
/* loaded from: classes16.dex */
public final class t9s0 extends RecyclerView.t {
    public final /* synthetic */ ToolbarVh b;

    public t9s0(ToolbarVh toolbarVh) {
        this.b = toolbarVh;
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
