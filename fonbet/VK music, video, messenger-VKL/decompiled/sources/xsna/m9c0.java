package xsna;

import androidx.recyclerview.widget.RecyclerView;
import com.vk.newsfeed.impl.fragments.PostViewFragment;
import com.vk.newsfeed.impl.stats.PostViewFragmentTimeSpentTracker;

/* compiled from: PostViewFragment.kt */
/* loaded from: classes4.dex */
public final class m9c0 extends RecyclerView.t {
    public final /* synthetic */ PostViewFragment b;

    public m9c0(PostViewFragment postViewFragment) {
        this.b = postViewFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        String[] strArr = PostViewFragment.T0;
        PostViewFragment postViewFragment = this.b;
        PostViewFragmentTimeSpentTracker Do = postViewFragment.Do();
        if (Do != null) {
            Do.a(recyclerView);
        }
        postViewFragment.v0.a(recyclerView, i);
        postViewFragment.w0.d(recyclerView, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
    }
}
