package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: FeedLikesFilterHeaderAdapter.kt */
/* loaded from: classes18.dex */
public final class f1r extends zoj0<s3q0, g1r> implements mf7 {
    @Override // xsna.mf7
    public final int e0(int i) {
        return 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return 1109;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new g1r(new com.vk.newsfeed.impl.feedlikes.a(viewGroup.getContext()));
    }
}
