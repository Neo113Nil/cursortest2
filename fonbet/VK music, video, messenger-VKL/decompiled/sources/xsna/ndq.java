package xsna;

import com.vk.imageloader.view.VKImageView;

/* compiled from: Extensions.kt */
/* loaded from: classes2.dex */
public final class ndq {
    public static final void a(VKImageView vKImageView, String str) {
        if (vKImageView.getLayoutParams().width > 0 && str.length() != 0 && !brm0.v(str, "images/camera_100.png", false) && !brm0.v(str, "images/camera_200.png", false)) {
            int i = vKImageView.getLayoutParams().width;
            str = str + (drm0.E(str, '?') ? (drm0.G(str, '?') || drm0.G(str, '&')) ? "" : "&" : "?") + "cs=" + i + "x0";
        }
        vKImageView.load(str);
    }
}
