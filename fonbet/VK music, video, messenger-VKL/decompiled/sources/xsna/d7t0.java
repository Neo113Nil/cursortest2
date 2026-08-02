package xsna;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.video.profile.presentation.catalog.holders.VideoProfileCatalogContentVh;

/* compiled from: VideoProfileCatalogContentVh.kt */
/* loaded from: classes6.dex */
public final class d7t0 extends RecyclerView.t {
    public final /* synthetic */ VideoProfileCatalogContentVh b;

    public d7t0(VideoProfileCatalogContentVh videoProfileCatalogContentVh) {
        this.b = videoProfileCatalogContentVh;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        int v = linearLayoutManager.v();
        int x = linearLayoutManager.x();
        if (v <= x) {
            while (true) {
                RecyclerView.Adapter adapter = recyclerView.getAdapter();
                Integer valueOf = adapter != null ? Integer.valueOf(adapter.getItemCount()) : null;
                if (valueOf != null && v < valueOf.intValue()) {
                    RecyclerView.Adapter adapter2 = recyclerView.getAdapter();
                    boolean z = adapter2 != null && adapter2.getItemViewType(v) == 2147483597;
                    RecyclerView.Adapter adapter3 = recyclerView.getAdapter();
                    boolean z2 = adapter3 != null && adapter3.getItemViewType(v) == 2147483594;
                    if (z || z2) {
                        this.b.r.a();
                    }
                }
                if (v == x) {
                    break;
                } else {
                    v++;
                }
            }
        }
        super.onScrolled(recyclerView, i, i2);
    }
}
