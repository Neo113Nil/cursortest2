package xsna;

import androidx.recyclerview.widget.RecyclerView;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.newsfeed.impl.newsfeed_post.presentation.fragment.PostFragment;
import java.util.List;
import xsna.hb60;

/* compiled from: PostFragment.kt */
/* loaded from: classes4.dex */
public final class g3c0 implements hb60.a {
    public final /* synthetic */ PostFragment a;

    public g3c0(PostFragment postFragment) {
        this.a = postFragment;
    }

    @Override // xsna.hb60.a
    public final long a() {
        return 500L;
    }

    @Override // xsna.hb60.a
    public final void b(NewsEntry newsEntry, List<? extends qi6<?>> list) {
        RecyclerView recyclerView;
        int i = PostFragment.S0;
        RecyclerPaginatedView recyclerPaginatedView = this.a.W;
        if (recyclerPaginatedView == null || (recyclerView = recyclerPaginatedView.getRecyclerView()) == null) {
            return;
        }
        wjf0.c(recyclerView, new f7s(list, 1));
    }

    @Override // xsna.hb60.a
    public final void dispose() {
    }
}
