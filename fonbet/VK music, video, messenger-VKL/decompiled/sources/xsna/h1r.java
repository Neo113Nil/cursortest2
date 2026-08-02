package xsna;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import com.vk.newsfeed.impl.feedlikes.a;
import com.vkontakte.android.R;
import kotlin.Result;

/* compiled from: FeedLikesMergeAdapter.kt */
/* loaded from: classes18.dex */
public final class h1r extends lt9 implements vel0 {
    @Override // xsna.vel0
    public final boolean V(int i) {
        int i2;
        try {
            i2 = getItemViewType(i);
        } catch (Throwable unused) {
            i2 = -1;
        }
        return i > 0 && i2 == 1109;
    }

    @Override // xsna.vel0
    public final void b0(int i, View view) {
        if (view instanceof com.vk.newsfeed.impl.feedlikes.a) {
            com.vk.newsfeed.impl.feedlikes.a aVar = (com.vk.newsfeed.impl.feedlikes.a) view;
            TabLayout tabLayout = aVar.b;
            a.b bVar = aVar.e;
            tabLayout.t(bVar);
            TabLayout.g b = tabLayout.b(com.vk.newsfeed.impl.feedlikes.a.g);
            if (b != null) {
                b.j();
            }
            tabLayout.g(bVar);
        }
    }

    @Override // xsna.lt9, xsna.mf7
    public final int e0(int i) {
        Object failure;
        try {
            failure = Integer.valueOf(getItemViewType(i - 1));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        Integer num = (Integer) failure;
        return (num != null && num.intValue() == 1109) ? (super.e0(i) & (-3)) | 1 : super.e0(i);
    }

    @Override // xsna.vel0
    public final void l(View view) {
        if (view instanceof com.vk.newsfeed.impl.feedlikes.a) {
            ((com.vk.newsfeed.impl.feedlikes.a) view).b.setBackground(dhr0.t.a(R.drawable.feed_likes_filter_bg));
        }
    }

    @Override // xsna.vel0
    public final void o(int i, View view) {
        if (view instanceof com.vk.newsfeed.impl.feedlikes.a) {
            RecyclerView recyclerView = this.d;
            RecyclerView.o layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager != null) {
                View findViewByPosition = linearLayoutManager.findViewByPosition(1);
                if (findViewByPosition instanceof com.vk.newsfeed.impl.feedlikes.a) {
                    com.vk.newsfeed.impl.feedlikes.a aVar = (com.vk.newsfeed.impl.feedlikes.a) findViewByPosition;
                    TabLayout tabLayout = aVar.b;
                    a.b bVar = aVar.e;
                    tabLayout.t(bVar);
                    TabLayout.g b = tabLayout.b(com.vk.newsfeed.impl.feedlikes.a.g);
                    if (b != null) {
                        b.j();
                    }
                    tabLayout.g(bVar);
                }
            }
        }
    }
}
