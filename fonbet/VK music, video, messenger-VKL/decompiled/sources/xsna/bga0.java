package xsna;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.vk.core.view.components.paging.list.VkErrorView;
import com.vk.rlottie.RLottieView;
import com.vkontakte.android.R;

/* compiled from: PhotosRootErrorView.kt */
/* loaded from: classes4.dex */
public final class bga0 extends VkErrorView {
    public final RLottieView e;
    public final TextView f;

    public bga0(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        addView(e3m.b(context).inflate(R.layout.photos_root_error_view, (ViewGroup) null), getContainerLayoutParams());
        findViewById(R.id.error_retry).setOnClickListener(new v3o(this, 6));
        this.e = (RLottieView) findViewById(R.id.rlottie_view_icon);
        this.f = (TextView) findViewById(R.id.error_text);
    }

    private final ViewGroup.LayoutParams getContainerLayoutParams() {
        return new FrameLayout.LayoutParams(-1, -1, 17);
    }

    public final void setErrorText(String str) {
        this.f.setText(str);
    }

    public final void setIconVisible(boolean z) {
        bwt0.p0(this.e, z);
    }

    @Override // com.vk.core.view.components.paging.list.VkErrorView, xsna.ee
    public final void b() {
    }

    @Override // com.vk.core.view.components.paging.list.VkErrorView, xsna.ee
    public void setMessage(CharSequence charSequence) {
    }
}
