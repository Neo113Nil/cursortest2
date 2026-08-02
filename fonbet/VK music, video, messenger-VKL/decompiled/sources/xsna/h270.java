package xsna;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.facebook.drawee.generic.RoundingParams;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.sdk.shared.clips.SdkNewsMonotheme;
import com.vk.clips.viewer.api.routing.ClipsRouter;
import com.vk.dto.common.VideoFile;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.imageloader.view.VKImageView;
import com.vk.libvideo.api.ui.VideoFeedDialogParams;
import com.vk.libvideo.api.ui.VideoTransitionSource;
import com.vk.libvideo.design.view.duration.DurationView;
import com.vk.libvideo.design.view.overlay.VideoOverlayView;
import com.vk.libvideo.dialogs.BaseAnimationDialog;
import java.util.Collections;
import kotlin.collections.builders.ListBuilder;

/* compiled from: NoAutoPlayDelegate.kt */
/* loaded from: classes2.dex */
public final class h270 extends uc {
    public final ImageView u;
    public final VideoOverlayView v;
    public final float w;
    public ProgressBar x;
    public final boolean y;
    public final bpn0 z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h270(ImageView imageView, VideoOverlayView videoOverlayView, float f, ProgressBar progressBar, boolean z, DurationView durationView, View view, int i) {
        super(durationView, view, new ih5(0));
        f = (i & 4) != 0 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : f;
        progressBar = (i & 16) != 0 ? null : progressBar;
        z = (i & 32) != 0 ? true : z;
        durationView = (i & 64) != 0 ? null : durationView;
        view = (i & 128) != 0 ? null : view;
        this.u = imageView;
        this.v = videoOverlayView;
        this.w = f;
        this.x = progressBar;
        this.y = z;
        this.z = new bpn0(new i440(view, 7));
    }

    @Override // xsna.io2
    public final void C() {
        if (fxc0.B().c(this.o)) {
            VideoOverlayView videoOverlayView = this.v;
            if (videoOverlayView != null) {
                d3m.c(videoOverlayView, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                return;
            }
            return;
        }
        if (!g620.f().d(this.o)) {
            d3m.c(this.u, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        d3m.c(null, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        d3m.c(this.x, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        DurationView durationView = this.b;
        if (durationView != null) {
            d3m.c(durationView, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    @Override // xsna.io2
    public final void J() {
        if (this.o.O() != null) {
            fxc0.B().b(this.o);
        }
        long j = BaseAnimationDialog.a0 - 70;
        long j2 = j < 0 ? 0L : j;
        if (fxc0.B().c(this.o)) {
            VideoOverlayView videoOverlayView = this.v;
            if (videoOverlayView != null) {
                d3m.c(videoOverlayView, (r15 & 1) != 0 ? 300L : 30L, (r15 & 2) != 0 ? 0L : j2, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                return;
            }
            return;
        }
        if (!g620.f().d(this.o)) {
            long j3 = j2;
            d3m.c(this.u, (r15 & 1) != 0 ? 300L : j3, (r15 & 2) != 0 ? 0L : 30L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            j2 = j3;
        }
        d3m.c(null, (r15 & 1) != 0 ? 300L : 30L, (r15 & 2) != 0 ? 0L : j2, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        d3m.c(this.x, (r15 & 1) != 0 ? 300L : 30L, (r15 & 2) != 0 ? 0L : j2, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        DurationView durationView = this.b;
        if (durationView != null) {
            d3m.c(durationView, (r15 & 1) != 0 ? 300L : 30L, (r15 & 2) != 0 ? 0L : j2, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        x();
    }

    @Override // xsna.io2
    public final boolean M() {
        return false;
    }

    @Override // xsna.zmt0
    public final VideoTransitionSource e() {
        if (fxc0.B().J().s1()) {
            return zjq.f(this.u);
        }
        return null;
    }

    @Override // xsna.io2
    public final void e0() {
        if (fxc0.B().c(this.o)) {
            VideoOverlayView videoOverlayView = this.v;
            if (videoOverlayView != null) {
                d3m.e(videoOverlayView, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 50L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
                return;
            }
            return;
        }
        if (!g620.f().d(this.o)) {
            d3m.e(this.u, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 50L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
        }
        d3m.e(null, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 50L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
        d3m.e(this.x, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 50L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
        DurationView durationView = this.b;
        if (durationView != null) {
            d3m.e(durationView, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 50L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
        }
    }

    @Override // xsna.jux0
    public final View getVideoView() {
        VideoOverlayView videoOverlayView;
        return (!fxc0.B().c(this.o) || (videoOverlayView = this.v) == null) ? this.u : videoOverlayView;
    }

    @Override // xsna.c56, xsna.io2
    public final float i0() {
        RoundingParams roundingParams;
        float[] fArr;
        Float M;
        ImageView imageView = this.u;
        return (!(imageView instanceof VKImageView) || (roundingParams = ((VKImageView) imageView).getHierarchy().c) == null || (fArr = roundingParams.c) == null || (M = rl3.M(fArr)) == null) ? this.w : M.floatValue();
    }

    @Override // xsna.uc
    public final void k(VideoFile videoFile, yg5 yg5Var, com.vk.libvideo.autoplay.a aVar) {
        f5o f5oVar;
        super.k(videoFile, yg5Var, aVar);
        if (!fxc0.B().c(this.o)) {
            x();
        }
        DurationView durationView = this.b;
        if (durationView != null) {
            boolean z = true;
            if (this.o.O() != null && ((f5oVar = (f5o) this.z.getValue()) == null || !f5oVar.a() || !e5o.a(this.o))) {
                z = false;
            }
            bwt0.p0(durationView, z);
        }
        if (durationView != null) {
            durationView.setText(this.s.a(this.u.getContext()));
        }
        n(false, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6, types: [com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab$NewsMonotheme] */
    @Override // xsna.uc
    public final void p(Activity activity, boolean z, String str, SearchStatsLoggingInfo searchStatsLoggingInfo, String str2, boolean z2, String str3) {
        VideoFile videoFile;
        VideoFeedDialogParams discover;
        SdkNewsMonotheme v1;
        if (activity.isFinishing()) {
            return;
        }
        if (!this.o.T3()) {
            fxc0.B().Y().k(activity, this.o, (r43 & 4) != 0 ? null : this.k, (r43 & 8) != 0 ? null : null, (r43 & 16) != 0 ? null : null, (r43 & 32) != 0 ? null : null, (r43 & 64) != 0 ? false : false, (r43 & 128) != 0 ? null : null, (r43 & 256) != 0 ? null : null, (r43 & 512) != 0 ? null : null, true, (r43 & 2048) != 0 ? false : false, (r43 & 4096) == 0, (r43 & 8192) == 0, (r43 & 16384) != 0 ? -1L : 0L, (32768 & r43) != 0 ? null : null, (65536 & r43) != 0 ? null : null, (524288 & r43) != 0 ? false : false, (r43 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : e());
            return;
        }
        if (this.o.q0()) {
            if (this.n || !g620.f().d(this.o)) {
                ydt0.p(fxc0.B().Y(), activity, this.o, true, true, searchStatsLoggingInfo, this.k, this.m, str3, this, 16);
                return;
            } else {
                ClipsRouter.l(g620.f().a(), activity, this.o.I0(), Collections.singletonList(this.o), this, 16);
                return;
            }
        }
        boolean z3 = false;
        if (g620.f().d(this.o)) {
            com.vk.libvideo.autoplay.e eVar = com.vk.libvideo.autoplay.e.a;
            if (!com.vk.libvideo.autoplay.e.c()) {
                com.vk.libvideo.autoplay.e.e(false);
            }
            SdkVideoFile c = g620.f().e0().c(this.o);
            ListBuilder e = e43.e();
            SdkClipVideoFile sdkClipVideoFile = c instanceof SdkClipVideoFile ? (SdkClipVideoFile) c : null;
            e.add((sdkClipVideoFile == null || (v1 = sdkClipVideoFile.v1()) == null) ? new ClipFeedTab.SingleClip(c, str, null, false, false, null, null, null, 252, null) : new ClipFeedTab.NewsMonotheme(v1.b, v1.c, c, null, 8, null));
            if (fxc0.B().J().o1()) {
                e.add(ClipFeedTab.UserSubscriptions.b);
            }
            ClipsRouter.c(g620.f().a(), activity, e.g(), this, null, null, null, null, false, null, IronSourceError.ERROR_INIT_ALREADY_FINISHED);
            return;
        }
        if (!z || !gpt0.c(activity)) {
            ydt0.s(fxc0.B().Y(), activity, this.o, this, false, searchStatsLoggingInfo, null, null, null, this.k, 8096);
            return;
        }
        if (fxc0.B().J().k0()) {
            yg5 yg5Var = this.j;
            yg5 yg5Var2 = yg5Var != null ? yg5Var : null;
            if (((yg5Var2.isPlaying() || yg5Var2.getPosition() > 0) ? yg5Var2.getPosition() : com.vk.libvideo.autoplay.j.b(yg5Var2.A())) >= yg5Var2.getDuration()) {
                z3 = true;
            }
        }
        boolean z4 = z3;
        ydt0 Y = fxc0.B().Y();
        VideoFile videoFile2 = this.o;
        if (z2) {
            discover = new VideoFeedDialogParams.OfflineVideos(this.k, this.l, searchStatsLoggingInfo, e());
            videoFile = videoFile2;
        } else {
            videoFile = videoFile2;
            discover = new VideoFeedDialogParams.Discover(this.k, this.l, searchStatsLoggingInfo, true, null, null, 0L, z4, e(), null, LevelPlayAdError.ERROR_CODE_NO_AD_UNIT_ID_SPECIFIED, null);
        }
        Y.i(activity, videoFile, discover);
    }

    public final void x() {
        int max;
        yg5 yg5Var = this.j;
        if (yg5Var == null) {
            yg5Var = null;
        }
        if (yg5Var.getDuration() == 0) {
            max = 0;
        } else {
            yg5 yg5Var2 = this.j;
            if (yg5Var2 == null) {
                yg5Var2 = null;
            }
            max = Math.max(an10.b(Math.min((com.vk.libvideo.autoplay.j.b(yg5Var2.A()) / (this.j != null ? r3 : null).getDuration()) * 100, 100.0f)), 0);
        }
        ProgressBar progressBar = this.x;
        if (progressBar != null) {
            bwt0.p0(progressBar, this.y || max > 0);
        }
        ProgressBar progressBar2 = this.x;
        if (progressBar2 != null) {
            progressBar2.setProgress(max);
        }
    }

    @Override // xsna.io2
    public final void D0() {
    }
}
