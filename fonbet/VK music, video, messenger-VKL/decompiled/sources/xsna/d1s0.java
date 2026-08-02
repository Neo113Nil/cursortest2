package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoAlbumVh;
import com.vk.core.view.components.picture.VkImage;
import com.vkontakte.android.R;
import xsna.qhv0;

/* compiled from: VideoAlbumVh.kt */
/* loaded from: classes16.dex */
public final class d1s0 implements b780 {
    public final /* synthetic */ VideoAlbumVh b;
    public final /* synthetic */ String c;

    public d1s0(VideoAlbumVh videoAlbumVh, String str) {
        this.b = videoAlbumVh;
        this.c = str;
    }

    @Override // xsna.b780
    public final void b(String str, Throwable th) {
        VkImage vkImage = this.b.j;
        if (vkImage == null) {
            vkImage = null;
        }
        vkImage.W();
    }

    @Override // xsna.b780
    public final void t(int i, int i2, String str) {
        float f;
        float a;
        qhv0 qhv0Var;
        VideoAlbumVh videoAlbumVh = this.b;
        VkImage vkImage = videoAlbumVh.j;
        if (vkImage == null) {
            vkImage = null;
        }
        if (i2 > i) {
            VkImage vkImage2 = videoAlbumVh.l;
            if (vkImage2 == null) {
                vkImage2 = null;
            }
            vkImage2.setVisibility(0);
            VkImage vkImage3 = videoAlbumVh.l;
            (vkImage3 != null ? vkImage3 : null).s0(this.c);
            vkImage.setCornerRadius(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            vkImage.y0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
            qhv0Var = qhv0.c.a;
        } else {
            Float f2 = videoAlbumVh.h;
            if (f2 != null) {
                f = f2.floatValue();
                a = cn70.a();
            } else {
                f = 8.0f;
                a = cn70.a();
            }
            vkImage.setCornerRadius(a * f);
            vkImage.y0(cn70.a() * 0.5f, dhr0.t.c(R.attr.vk_ui_image_border_alpha));
            qhv0Var = qhv0.b.a;
        }
        vkImage.setVkScaleType(qhv0Var);
    }

    @Override // xsna.b780
    public final void g(String str) {
    }

    @Override // xsna.b780
    public final void onCancel(String str) {
    }
}
