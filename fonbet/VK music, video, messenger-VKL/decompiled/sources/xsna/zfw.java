package xsna;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.fullscreenbanners.api.dto.blocks.FullScreenBannerBlock;
import com.vk.fullscreenbanners.api.dto.blocks.common.ImageFullScreenBannerBlock;
import com.vk.imageloader.view.VKImageView;
import com.vk.log.L;
import com.vkontakte.android.R;

/* compiled from: ImageBannerHolder.kt */
/* loaded from: classes16.dex */
public final class zfw extends de implements b780 {
    public VKImageView b;

    @Override // xsna.de
    public final void R(FullScreenBannerBlock fullScreenBannerBlock) {
        ImageFullScreenBannerBlock imageFullScreenBannerBlock = fullScreenBannerBlock instanceof ImageFullScreenBannerBlock ? (ImageFullScreenBannerBlock) fullScreenBannerBlock : null;
        if (imageFullScreenBannerBlock == null) {
            return;
        }
        VKImageView vKImageView = this.b;
        if (vKImageView == null) {
            vKImageView = null;
        }
        vKImageView.setOnLoadCallback(this);
        VKImageView vKImageView2 = this.b;
        (vKImageView2 != null ? vKImageView2 : null).s0(imageFullScreenBannerBlock.d);
    }

    @Override // xsna.de
    public final View T(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fsb_image_vh, viewGroup, false);
        this.b = (VKImageView) inflate;
        return inflate;
    }

    @Override // xsna.b780
    public final void b(String str, Throwable th) {
        L.l(new String[0]);
    }

    @Override // xsna.b780
    public final void t(int i, int i2, String str) {
        VKImageView vKImageView = this.b;
        if (vKImageView == null) {
            vKImageView = null;
        }
        vKImageView.getLayoutParams().width = iah0.a(i);
        VKImageView vKImageView2 = this.b;
        if (vKImageView2 == null) {
            vKImageView2 = null;
        }
        vKImageView2.getLayoutParams().height = iah0.a(i2);
        VKImageView vKImageView3 = this.b;
        (vKImageView3 != null ? vKImageView3 : null).requestLayout();
    }

    @Override // xsna.b780
    public final void g(String str) {
    }

    @Override // xsna.b780
    public final void onCancel(String str) {
    }
}
