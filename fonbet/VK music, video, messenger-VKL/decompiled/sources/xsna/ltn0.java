package xsna;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.core.view.components.paging.list.VkErrorView;
import com.vkontakte.android.R;

/* compiled from: TabRecyclerPaginatedView.kt */
/* loaded from: classes6.dex */
public final class ltn0 extends VkErrorView {
    public ltn0(Context context) {
        super(context, null, 6, 0);
        addView(e3m.b(context).inflate(R.layout.pds_story_statistics_error_view, (ViewGroup) null), getContainerLayoutParams());
        findViewById(R.id.error_retry).setOnClickListener(new a50(this, 11));
    }

    private final FrameLayout.LayoutParams getContainerLayoutParams() {
        return generateDefaultLayoutParams();
    }

    @Override // com.vk.core.view.components.paging.list.VkErrorView, xsna.ee
    public final void b() {
    }

    @Override // com.vk.core.view.components.paging.list.VkErrorView, xsna.ee
    public void setMessage(CharSequence charSequence) {
    }
}
