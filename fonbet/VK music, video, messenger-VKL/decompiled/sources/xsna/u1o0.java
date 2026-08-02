package xsna;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.core.view.components.paging.list.VkErrorView;
import com.vkontakte.android.R;

/* compiled from: TagsErrorView.kt */
/* loaded from: classes4.dex */
public final class u1o0 extends VkErrorView {
    public u1o0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        addView(e3m.b(context).inflate(R.layout.photos_root_error_view, (ViewGroup) null), getContainerLayoutParams());
        findViewById(R.id.error_retry).setOnClickListener(new k1(this, 13));
    }

    private final ViewGroup.LayoutParams getContainerLayoutParams() {
        return new FrameLayout.LayoutParams(-1, -1, 17);
    }

    @Override // com.vk.core.view.components.paging.list.VkErrorView, xsna.ee
    public final void b() {
    }

    @Override // com.vk.core.view.components.paging.list.VkErrorView, xsna.ee
    public void setMessage(CharSequence charSequence) {
    }
}
