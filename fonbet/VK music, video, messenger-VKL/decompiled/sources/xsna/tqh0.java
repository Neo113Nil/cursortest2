package xsna;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.lists.DefaultErrorView;
import com.vkontakte.android.R;

/* compiled from: SearchErrorView.kt */
/* loaded from: classes15.dex */
public final class tqh0 extends DefaultErrorView {
    @Override // com.vk.lists.DefaultErrorView
    public ViewGroup.LayoutParams getContainerLayoutParams() {
        getResources();
        return new FrameLayout.LayoutParams(-1, -1, 17);
    }

    @Override // com.vk.lists.DefaultErrorView
    public int getLayoutId() {
        return R.layout.search_error_view;
    }

    @Override // com.vk.lists.DefaultErrorView, xsna.ee
    public final void b() {
    }
}
