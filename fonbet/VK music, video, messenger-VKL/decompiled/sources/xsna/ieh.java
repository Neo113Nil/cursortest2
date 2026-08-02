package xsna;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.tool.view.AspectRatioFrameLayout;
import com.vk.core.view.ProgressView;
import com.vk.dto.common.VideoFile;
import com.vk.imageloader.view.VKImageView;
import com.vk.libvideo.design.view.ad.VideoAdLayout;
import com.vk.libvideo.design.view.duration.DurationView;
import com.vk.libvideo.design.view.error.VideoErrorView;
import com.vk.libvideo.design.view.overlay.VideoOverlayView;
import com.vk.libvideo.design.view.spectators.SpectatorsCounterView;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import com.vkontakte.android.R;
import one.video.transform.TransformController;
import xsna.wfk0;

/* compiled from: CommunityProfileAutoPlayLiveVideosViewHolder.kt */
/* loaded from: classes5.dex */
public final class ieh extends reh {
    public final VideoAdLayout D;
    public final fqj E;
    public final FrameLayout F;
    public final SpectatorsCounterView G;
    public final VideoErrorView H;
    public final fh5 I;

    public ieh(Context context, boolean z) {
        super(context, z);
        VideoAdLayout videoAdLayout = new VideoAdLayout(context, null, 6);
        this.D = videoAdLayout;
        fqj fqjVar = new fqj(context);
        this.E = fqjVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.F = frameLayout;
        SpectatorsCounterView spectatorsCounterView = new SpectatorsCounterView(context, null, 6);
        this.G = spectatorsCounterView;
        this.H = new VideoErrorView(context, null, 6);
        wqj wqjVar = new wqj(null, null, null, null, null, null, null, 31231);
        VideoTextureView videoTextureView = this.x;
        AspectRatioFrameLayout aspectRatioFrameLayout = this.v;
        VKImageView vKImageView = this.y;
        wfk0.a aVar = new wfk0.a(fqjVar);
        VideoOverlayView videoOverlayView = this.w;
        DurationView durationView = this.z;
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        View view = null;
        ProgressView progressView = null;
        View view2 = null;
        ProgressBar progressBar = null;
        this.I = new fh5(this, videoTextureView, aspectRatioFrameLayout, f, vKImageView, view, progressView, view2, progressBar, null, aVar, null, null, durationView, null, null, videoOverlayView, null, frameLayout, spectatorsCounterView, true, null, videoAdLayout, wqjVar, null, null, null, null, null, null, -578064408, 31);
    }

    @Override // xsna.reh
    public final void q6(VideoFile videoFile, com.vk.libvideo.autoplay.a aVar) {
        this.I.l0(videoFile, new com.vk.movika.sdk.base.logic.processor.actions.i(videoFile, 23), aVar, new o1e(this, 6));
    }

    @Override // xsna.reh
    public final void s6(FrameLayout frameLayout) {
        VideoTextureView videoTextureView = this.x;
        videoTextureView.getTransformController().f(TransformController.ScaleType.CROP, false);
        videoTextureView.setId(R.id.video_display);
        frameLayout.addView(videoTextureView, -1, -1);
        View view = this.F;
        view.setId(R.id.video_inline_live_holder);
        f4m.j(view);
        frameLayout.addView(view, -1, -1);
        frameLayout.addView(this.y);
        View view2 = this.w;
        view2.setId(R.id.catalog_video_large_item_overlay);
        f4m.j(view2);
        frameLayout.addView(view2, new FrameLayout.LayoutParams(-1, -1));
        fqj fqjVar = this.E;
        fqjVar.setId(R.id.sound_control);
        fqjVar.a(false, true);
        bwt0.i0(fqjVar, new gr3(this, 24));
        float f = 48;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iah0.a(f), iah0.a(f));
        layoutParams.gravity = 8388661;
        s3q0 s3q0Var = s3q0.a;
        frameLayout.addView(fqjVar, layoutParams);
        LinearLayout linearLayout = this.A;
        linearLayout.setId(R.id.duration_holder);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        int a = iah0.a(16);
        layoutParams2.setMargins(a, a, a, a);
        layoutParams2.gravity = 8388659;
        frameLayout.addView(linearLayout, layoutParams2);
        DurationView durationView = this.z;
        durationView.setId(R.id.duration);
        linearLayout.addView(durationView, -2, -2);
        SpectatorsCounterView spectatorsCounterView = this.G;
        spectatorsCounterView.setId(R.id.spectators);
        linearLayout.addView(spectatorsCounterView, -2, -1);
        VideoErrorView videoErrorView = this.H;
        videoErrorView.setId(R.id.error_view);
        f4m.j(videoErrorView);
        videoErrorView.a(new VideoErrorView.a(null, new sg0(this, 4), true, 57));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams3.gravity = 17;
        frameLayout.addView(videoErrorView, layoutParams3);
        View view3 = this.D;
        view3.setId(R.id.video_large_item_instream_ad);
        f4m.j(view3);
        frameLayout.addView(view3, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // xsna.reh
    public final uc t6() {
        return this.I;
    }
}
