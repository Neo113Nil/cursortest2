package xsna;

import com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout;
import com.vk.newsfeed.common.presentation.newsfeed.ListLoadingState;
import com.vk.newsfeed.impl.newsfeed.presentation.base.fragment.NewsfeedFragment;

/* compiled from: NewsfeedFragment.kt */
/* loaded from: classes4.dex */
public final class ntz implements wzs<s3q0, ListLoadingState, s3q0> {
    public w8q b;

    @Override // xsna.wzs
    public final s3q0 invoke(s3q0 s3q0Var, ListLoadingState listLoadingState) {
        SwipeDrawableRefreshLayout swipeDrawableRefreshLayout;
        boolean z = listLoadingState == ListLoadingState.REFRESHING;
        w8q w8qVar = this.b;
        if (w8qVar != null && (swipeDrawableRefreshLayout = ((NewsfeedFragment) w8qVar.c).m0) != null) {
            swipeDrawableRefreshLayout.setRefreshing(z);
        }
        return s3q0.a;
    }
}
