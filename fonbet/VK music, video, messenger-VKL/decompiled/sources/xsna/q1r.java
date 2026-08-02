package xsna;

import android.view.KeyEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.sticky_header.StickyHeadersLinearLayoutManager;

/* compiled from: FeedLikesProgressHelper.kt */
/* loaded from: classes18.dex */
public final class q1r extends RecyclerView.t {
    public final /* synthetic */ s1r b;
    public final /* synthetic */ StickyHeadersLinearLayoutManager<?> c;

    public q1r(s1r s1rVar, StickyHeadersLinearLayoutManager<?> stickyHeadersLinearLayoutManager) {
        this.b = s1rVar;
        this.c = stickyHeadersLinearLayoutManager;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        s1r s1rVar = this.b;
        s1rVar.getClass();
        StickyHeadersLinearLayoutManager<?> stickyHeadersLinearLayoutManager = this.c;
        KeyEvent.Callback findViewByPosition = stickyHeadersLinearLayoutManager != null ? stickyHeadersLinearLayoutManager.findViewByPosition(1) : null;
        com.vk.newsfeed.impl.feedlikes.a aVar = findViewByPosition instanceof com.vk.newsfeed.impl.feedlikes.a ? (com.vk.newsfeed.impl.feedlikes.a) findViewByPosition : null;
        if (aVar != null) {
            int bottom = s1r.d + (stickyHeadersLinearLayoutManager.x != null ? com.vk.newsfeed.impl.feedlikes.a.f : aVar.getBottom());
            ucc uccVar = s1rVar.a;
            if (uccVar != null) {
                uccVar.setTranslationY(bottom);
            }
        }
    }
}
