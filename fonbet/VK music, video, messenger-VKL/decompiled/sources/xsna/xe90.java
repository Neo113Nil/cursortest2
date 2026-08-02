package xsna;

import android.os.SystemClock;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.clips.sdk.shared.feed.model.FeedItem;
import com.vk.clips.sdk.shared.feed.recycler.adapter.ClipFeedAdapter;

/* compiled from: PaginationScrollListener.kt */
/* loaded from: classes17.dex */
public final class xe90 extends RecyclerView.t {
    public final ClipFeedAdapter b;
    public final po1 c;
    public final ix2 d;
    public long e;
    public long f;

    public xe90(ClipFeedAdapter clipFeedAdapter, po1 po1Var, ix2 ix2Var) {
        this.b = clipFeedAdapter;
        this.c = po1Var;
        this.d = ix2Var;
    }

    public final void l(RecyclerView recyclerView) {
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = elapsedRealtime - this.e;
        ClipFeedAdapter clipFeedAdapter = this.b;
        if (j > 750) {
            RecyclerView.e0 findViewHolderForLayoutPosition = recyclerView.findViewHolderForLayoutPosition(linearLayoutManager.v());
            hfz hfzVar = (hfz) j5g.b0(findViewHolderForLayoutPosition != null ? findViewHolderForLayoutPosition.getAbsoluteAdapterPosition() : -1, clipFeedAdapter.h.f);
            if (hfzVar instanceof FeedItem) {
                this.e = elapsedRealtime;
                this.c.invoke(((FeedItem) hfzVar).F());
            }
        }
        if (elapsedRealtime - this.f > 750) {
            RecyclerView.e0 findViewHolderForLayoutPosition2 = recyclerView.findViewHolderForLayoutPosition(linearLayoutManager.x());
            hfz hfzVar2 = (hfz) j5g.b0(findViewHolderForLayoutPosition2 != null ? findViewHolderForLayoutPosition2.getAbsoluteAdapterPosition() : -1, clipFeedAdapter.h.f);
            if (hfzVar2 instanceof FeedItem) {
                this.f = elapsedRealtime;
                this.d.invoke(((FeedItem) hfzVar2).F());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        l(recyclerView);
    }
}
