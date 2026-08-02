package xsna;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.ads.di.NewsfeedOptionalAdsComponent;
import com.vk.clips.viewer.api.di.ClipsViewerComponent;
import com.vk.newsfeed.common.recycler.holders.applovin.AppLovinSkeletonTracker;
import java.util.Iterator;
import java.util.List;

/* compiled from: FeedViewHolderVisibilityTrackerScrollListener.kt */
/* loaded from: classes4.dex */
public final class c5r extends RecyclerView.t {
    public final List<b5r> b;

    public c5r(ClipsViewerComponent clipsViewerComponent, NewsfeedOptionalAdsComponent newsfeedOptionalAdsComponent) {
        this.b = e43.l(new rfd(clipsViewerComponent), new AppLovinSkeletonTracker(newsfeedOptionalAdsComponent));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int v = ((LinearLayoutManager) recyclerView.getLayoutManager()).v();
        int x = ((LinearLayoutManager) recyclerView.getLayoutManager()).x();
        List<b5r> list = this.b;
        if (v <= x) {
            int i3 = v;
            while (true) {
                RecyclerView.e0 findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i3);
                if (findViewHolderForAdapterPosition != null) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        ((b5r) it.next()).a(findViewHolderForAdapterPosition, i3);
                    }
                }
                if (i3 == x) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            ((b5r) it2.next()).b(v, x);
        }
    }
}
