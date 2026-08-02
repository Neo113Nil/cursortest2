package xsna;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.qcg0;

/* compiled from: RestrictedBlurredPhotoView.kt */
@ozl
/* loaded from: classes5.dex */
public final class kcg0 extends qcg0 implements kgw {
    public final VKImageView v;
    public final ColorDrawable w;

    public kcg0(Context context) {
        super(context);
        VKImageView vKImageView = new VKImageView(context, null, 6, 0);
        this.v = vKImageView;
        ColorDrawable colorDrawable = new ColorDrawable(context.getColor(R.color.vk_black_alpha24));
        this.w = colorDrawable;
        vKImageView.setPlaceholderColor(e3m.f(R.attr.vk_ui_image_placeholder, context));
        vKImageView.setOverlayImage(colorDrawable);
        vKImageView.setPostprocessor(edg0.a);
        addView(vKImageView, 0, new qcg0.a(-1, -1, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE));
    }

    @Override // xsna.qcg0, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.v.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, Math.min(getMeasuredWidth(), 1073741823)), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(0, Math.min(getMeasuredHeight(), 1073741823)), 1073741824));
    }

    public final void setImageViewId(int i) {
        this.v.setId(i);
    }

    @Override // xsna.kgw
    public void setOnLoadCallback(b780 b780Var) {
        this.v.setOnLoadCallback(b780Var);
    }
}
