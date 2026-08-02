package xsna;

import com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout;
import com.vk.newsfeed.common.presentation.newsfeed.ListLoadingState;
import com.vk.newsfeed.impl.presentation.discover_media.presentation.fragment.DiscoverMediaTabFragment2;

/* compiled from: DiscoverMediaTabFragment2.kt */
/* loaded from: classes4.dex */
public final class mtz implements wzs<s3q0, ListLoadingState, s3q0> {
    public jrh b;

    @Override // xsna.wzs
    public final s3q0 invoke(s3q0 s3q0Var, ListLoadingState listLoadingState) {
        SwipeDrawableRefreshLayout swipeDrawableRefreshLayout;
        boolean z = listLoadingState == ListLoadingState.REFRESHING;
        jrh jrhVar = this.b;
        if (jrhVar != null && (swipeDrawableRefreshLayout = ((DiscoverMediaTabFragment2) jrhVar.c).o0) != null) {
            swipeDrawableRefreshLayout.setRefreshing(z);
        }
        return s3q0.a;
    }
}
