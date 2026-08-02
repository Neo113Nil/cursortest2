package xsna;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemSliderVh;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.PrivacySetting;
import com.vk.imageloader.ImageScreenSize;
import com.vk.imageloader.view.VKImageView;
import com.vk.libvideo.design.view.overlay.VideoOverlayView;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class axf0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ axf0(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        Drawable a;
        int i = this.b;
        int i2 = 1;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                s6s0 s6s0Var = (s6s0) obj3;
                Activity activity = (Activity) obj2;
                y6s0 y6s0Var = (y6s0) obj;
                Integer num = s6s0Var.m;
                if (num != null) {
                    int intValue = num.intValue();
                    VideoFile videoFile = s6s0Var.a;
                    w1s0 w1s0Var = w1s0.b;
                    w1s0.j(activity, videoFile.I0(), videoFile, videoFile.I0(), intValue, new ks2(24, y6s0Var, s6s0Var));
                }
                break;
            case 1:
                rkq0 rkq0Var = (rkq0) obj3;
                View view = (View) obj2;
                PrivacySetting privacySetting = (PrivacySetting) obj;
                ((uij) rkq0Var.d.getValue()).c(bwt0.u(view.getContext()), privacySetting.b, privacySetting, new ito0(i2, privacySetting, rkq0Var), new ew3(23, rkq0Var, view));
                break;
            default:
                VideoItemSliderVh videoItemSliderVh = (VideoItemSliderVh) obj3;
                VideoFile videoFile2 = (VideoFile) obj2;
                Resources resources = (Resources) obj;
                Integer num2 = videoItemSliderVh.p;
                if (num2 != null) {
                    View view2 = videoItemSliderVh.O;
                    if (view2 == null) {
                        view2 = null;
                    }
                    a = m33.a(num2.intValue(), view2.getContext());
                } else {
                    VideoOverlayView videoOverlayView = videoItemSliderVh.N;
                    if (videoOverlayView == null) {
                        videoOverlayView = null;
                    }
                    if (videoOverlayView.getShowRedesign()) {
                        a = new ColorDrawable(dhr0.t.c(R.attr.vk_ui_image_placeholder_alpha));
                    } else {
                        View view3 = videoItemSliderVh.O;
                        if (view3 == null) {
                            view3 = null;
                        }
                        a = m33.a(R.drawable.video_placeholder_64, view3.getContext());
                    }
                }
                VKImageView vKImageView = videoItemSliderVh.M;
                if (vKImageView == null) {
                    vKImageView = null;
                }
                vKImageView.F0(a, ImageView.ScaleType.FIT_XY);
                VideoOverlayView videoOverlayView2 = videoItemSliderVh.N;
                if (videoOverlayView2 == null) {
                    videoOverlayView2 = null;
                }
                if (!videoOverlayView2.getShowRedesign()) {
                    VKImageView vKImageView2 = videoItemSliderVh.M;
                    if (vKImageView2 == null) {
                        vKImageView2 = null;
                    }
                    View view4 = videoItemSliderVh.O;
                    if (view4 == null) {
                        view4 = null;
                    }
                    vKImageView2.setPlaceholderImage(m33.a(R.drawable.default_placeholder_6, view4.getContext()));
                }
                VKImageView vKImageView3 = videoItemSliderVh.M;
                if (vKImageView3 == null) {
                    vKImageView3 = null;
                }
                ImageSize Cb = videoFile2.getImage().Cb(videoItemSliderVh.v ? ImageScreenSize.BIG.h() : resources.getDimensionPixelSize(videoItemSliderVh.n), true, false);
                vKImageView3.load(Cb != null ? Cb.d.d : null);
                break;
        }
        return s3q0.a;
    }
}
