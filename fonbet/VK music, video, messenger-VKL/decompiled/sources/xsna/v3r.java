package xsna;

import android.view.View;
import com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout;

/* compiled from: FeedRecyclerPaginatedView.kt */
/* loaded from: classes4.dex */
public final class v3r extends SwipeDrawableRefreshLayout {
    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view != this || i == 0) {
            return;
        }
        setRefreshing(false);
    }
}
