package xsna;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;

/* compiled from: ClipsRecyclerViewFocusedItemHelper.kt */
/* loaded from: classes17.dex */
public final class l0f extends RecyclerView.t {
    public final ClipFeedListFragment.j b;

    public l0f(ClipFeedListFragment.j jVar) {
        this.b = jVar;
    }

    public final void l(RecyclerView recyclerView) {
        int s;
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null || (s = linearLayoutManager.s()) == -1) {
            return;
        }
        this.b.invoke(Integer.valueOf(s));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        if (recyclerView.getScrollState() != 0) {
            return;
        }
        l(recyclerView);
    }
}
