package xsna;

import androidx.recyclerview.widget.RecyclerView;
import com.vk.newsfeed.impl.newsfeed_post.presentation.fragment.PostFragment;
import com.vk.newsfeed.impl.stats.PostViewFragmentTimeSpentTracker;

/* compiled from: PostFragment.kt */
/* loaded from: classes4.dex */
public final class j3c0 extends RecyclerView.t {
    public final /* synthetic */ PostFragment b;

    public j3c0(PostFragment postFragment) {
        this.b = postFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        int i2 = PostFragment.S0;
        PostFragment postFragment = this.b;
        PostViewFragmentTimeSpentTracker Co = postFragment.Co();
        if (Co != null) {
            Co.a(recyclerView);
        }
        postFragment.z0.a(recyclerView, i);
        postFragment.A0.d(recyclerView, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
    }
}
