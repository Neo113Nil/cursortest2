package xsna;

import android.widget.ImageView;
import com.vk.donut.design.view.badge.DonutBadge;
import com.vk.donut.price.model.template.DonutPriceTemplate;
import com.vk.donut.video.model.presentation.video.DonutVideoUiModel;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.imageloader.view.VKImageView;
import com.vk.libvideo.autoplay.b;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.libvideo.design.view.duration.DurationView;
import com.vk.libvideo.design.view.movika.InteractiveDurationView;
import com.vk.libvideo.design.view.overlay.VideoOverlayView;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;

/* compiled from: SimilarVideoBinder.kt */
/* loaded from: classes14.dex */
public final class eoj0 {
    public final g7s0 a;
    public final h270 b;
    public final VKImageView c;
    public final VideoOverlayView d;
    public final DurationView e;
    public final InteractiveDurationView f;
    public final DonutBadge g;
    public String h;
    public final Object i;
    public final Object j;
    public final Object k;

    public eoj0(g7s0 g7s0Var, h270 h270Var, VKImageView vKImageView, VideoOverlayView videoOverlayView, DurationView durationView, InteractiveDurationView interactiveDurationView, DonutBadge donutBadge) {
        this.a = g7s0Var;
        this.b = h270Var;
        this.c = vKImageView;
        this.d = videoOverlayView;
        this.e = durationView;
        this.f = interactiveDurationView;
        this.g = donutBadge;
        s7c0 s7c0Var = new s7c0(5);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.i = msy.a(lazyThreadSafetyMode, s7c0Var);
        this.j = msy.a(lazyThreadSafetyMode, new o2a0(8));
        this.k = msy.a(lazyThreadSafetyMode, new jkg0(1));
    }

    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v18, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v21, types: [java.lang.Object, kotlin.Lazy] */
    public final void a(noj0 noj0Var, AboutVideoItem.SimilarVideoRedesign.Source source, boolean z) {
        VideoFile videoFile = noj0Var.a;
        DonutVideoUiModel donutVideoUiModel = noj0Var.d;
        boolean W9 = videoFile.W9();
        g7s0 g7s0Var = this.a;
        boolean c = g7s0Var.c(videoFile);
        VideoOverlayView videoOverlayView = this.d;
        InteractiveDurationView interactiveDurationView = this.f;
        DurationView durationView = this.e;
        VKImageView vKImageView = this.c;
        if (!c || (e5o.a(videoFile) && z)) {
            vKImageView.setVisibility(0);
            f4m.j(videoOverlayView);
            if (interactiveDurationView != null) {
                awt0.v(interactiveDurationView, W9);
            }
            awt0.v(durationView, !W9);
            vKImageView.setPlaceholderImage(m33.a(R.drawable.default_placeholder_6, vKImageView.getContext()));
            vKImageView.F0(m33.a(R.drawable.video_placeholder_130, vKImageView.getContext()), ImageView.ScaleType.FIT_XY);
            gpt0 gpt0Var = gpt0.a;
            ImageSize Cb = videoFile.getImage().Cb((int) (iah0.v() * gpt0.o(vKImageView.getContext())), true, false);
            String str = Cb != null ? Cb.d.d : null;
            if (!epx.f(this.h, str)) {
                if (source == AboutVideoItem.SimilarVideoRedesign.Source.OFFLINE_VIDEOS && g7s0Var.J().M1()) {
                    hg1.b(vKImageView, g7s0Var.s().o(videoFile.getImage(), videoFile.r1()).subscribe(new yzt(new ud6(11, this, str), 12)));
                } else {
                    this.h = str;
                    vKImageView.s0(str);
                }
            }
        } else {
            vKImageView.clear();
            f4m.j(vKImageView);
            videoOverlayView.setVisibility(0);
            VideoRestriction O = videoFile.O();
            bwt0.p0(durationView, (O == null || O.f) && !W9);
            if (interactiveDurationView != null) {
                VideoRestriction O2 = videoFile.O();
                bwt0.p0(interactiveDurationView, (O2 == null || O2.f) && W9);
            }
            VideoRestriction O3 = videoFile.O();
            if (O3 != null) {
                videoOverlayView.Z4((i1t0) this.i.getValue(), new VideoOverlayView.c.i(((a390) this.j.getValue()).a(O3), ((s290) this.k.getValue()).a(videoFile.w2()), false, new com.vk.movika.sdk.base.ui.k(22, this, videoFile)));
            }
        }
        if (videoFile.q0()) {
            durationView.setBackgroundResource(R.drawable.bg_video_live);
        } else {
            durationView.setBackgroundResource(R.drawable.bg_video_duration_label_old);
        }
        durationView.setText(gpt0.m(durationView.getContext(), videoFile, true, false));
        if (W9) {
            if (interactiveDurationView != null) {
                interactiveDurationView.setTextDescriptionVisible(false);
            }
            if (interactiveDurationView != null) {
                interactiveDurationView.setDurationText(gpt0.m(durationView.getContext(), videoFile, false, false));
            }
        }
        DonutVideoUiModel.PreviewBadge previewBadge = donutVideoUiModel != null ? donutVideoUiModel.b : null;
        DonutBadge donutBadge = this.g;
        if (previewBadge != null && donutBadge != null) {
            donutBadge.setVisibility(0);
            DonutPriceTemplate donutPriceTemplate = previewBadge.c;
            donutBadge.setText(donutPriceTemplate != null ? y1o.b(donutPriceTemplate, donutBadge.getContext()) : previewBadge.b);
            donutBadge.setContentDescription(previewBadge.d);
        } else if (donutBadge != null) {
            f4m.j(donutBadge);
        }
        bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
        yg5 e = b.C1208b.a().e(videoFile, null);
        com.vk.libvideo.autoplay.a aVar = com.vk.libvideo.autoplay.a.t;
        h270 h270Var = this.b;
        h270Var.k(videoFile, e, aVar);
        h270Var.s(noj0Var.c);
        h270Var.w(noj0Var.b);
    }
}
