package xsna;

import androidx.recyclerview.widget.RecyclerView;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.newsfeed.impl.fragments.PostViewFragment;
import java.util.List;
import xsna.hb60;

/* compiled from: PostViewFragment.kt */
/* loaded from: classes4.dex */
public final class k9c0 implements hb60.a {
    public final /* synthetic */ PostViewFragment a;

    public k9c0(PostViewFragment postViewFragment) {
        this.a = postViewFragment;
    }

    @Override // xsna.hb60.a
    public final long a() {
        return 500L;
    }

    @Override // xsna.hb60.a
    public final void b(NewsEntry newsEntry, List<? extends qi6<?>> list) {
        RecyclerView recyclerView;
        RecyclerPaginatedView recyclerPaginatedView = this.a.W;
        if (recyclerPaginatedView == null || (recyclerView = recyclerPaginatedView.getRecyclerView()) == null) {
            return;
        }
        wjf0.c(recyclerView, new lo10(list, 18));
    }

    @Override // xsna.hb60.a
    public final void dispose() {
    }
}
