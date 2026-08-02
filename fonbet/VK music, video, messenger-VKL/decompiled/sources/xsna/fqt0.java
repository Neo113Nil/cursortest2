package xsna;

import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.preference.Preference;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.design.view.seek.VideoFastSeekView;
import com.vk.libvideo.design.view.seek.VideoFastSeekView$Companion$Type;
import com.vk.libvideo.design.view.video.VideoView;
import com.vk.media.player.action.VideoSeekAction;
import one.video.controls.models.UIPlayerSeek;
import one.video.player.OneVideoPlayer;
import xsna.ky6;
import xsna.xwp0;

/* compiled from: VideoView.kt */
/* loaded from: classes2.dex */
public final class fqt0 extends GestureDetector.SimpleOnGestureListener {
    public boolean b = true;
    public final /* synthetic */ VideoView c;

    public fqt0(VideoView videoView) {
        this.c = videoView;
    }

    public final boolean a(MotionEvent motionEvent) {
        d3b0 v0;
        OneVideoPlayer a;
        VideoView videoView = this.c;
        yg5 autoPlay = videoView.getAutoPlay();
        if (autoPlay == null || (v0 = autoPlay.v0()) == null || (a = v0.a()) == null || (a.getCurrentPosition() >= 1000 && a.getCurrentPosition() != a.getDuration())) {
            boolean z = motionEvent.getX() <= ((float) videoView.getWidth()) / 3.0f;
            boolean z2 = motionEvent.getX() >= (((float) videoView.getWidth()) / 3.0f) * 2.0f;
            if (z || z2) {
                yg5 autoPlay2 = videoView.getAutoPlay();
                if (autoPlay2 != null) {
                    autoPlay2.A0(z2);
                    VideoFastSeekView videoFastSeekView = videoView.getViewBinding().k;
                    PointF pointF = new PointF(motionEvent.getX(), motionEvent.getY());
                    videoFastSeekView.z = true;
                    videoFastSeekView.a(z2, pointF, VideoFastSeekView$Companion$Type.TAP);
                    if (!videoView.x) {
                        gpt0 gpt0Var = gpt0.a;
                        ky6.a aVar = (ky6.a) Preference.j().edit();
                        aVar.putBoolean("video_fast_seek_tooltip", true);
                        aVar.a();
                        videoView.x = true;
                    }
                    ebs0 videoClickActionCallback = videoView.getVideoClickActionCallback();
                    if (videoClickActionCallback != null) {
                        videoClickActionCallback.bk(new VideoSeekAction(z2 ? Math.min(autoPlay2.getPosition() + 10000, autoPlay2.getDuration()) : Math.max(autoPlay2.getPosition() - 10000, 0L), VideoSeekAction.Source.DoubleTap, videoView.M));
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        VideoFile videoFile;
        yg5 autoPlay;
        yg5 autoPlay2;
        yg5 autoPlay3;
        VideoView videoView = this.c;
        if (videoView.n0() || (((videoFile = videoView.getVideoFile()) != null && videoFile.q0()) || (((autoPlay = videoView.getAutoPlay()) != null && autoPlay.P0()) || videoView.f1()))) {
            return false;
        }
        int i = videoView.V;
        yg5 autoPlay4 = videoView.getAutoPlay();
        if (((autoPlay4 != null && autoPlay4.isPlaying()) || (((autoPlay2 = videoView.getAutoPlay()) != null && autoPlay2.isPaused()) || ((autoPlay3 = videoView.getAutoPlay()) != null && autoPlay3.a()))) && a(motionEvent)) {
            this.b = false;
            VideoView.H0(videoView, videoView.getUiVisible(), false, false, false, 12);
            if (!videoView.getUiVisible()) {
                videoView.getViewBinding().r.U1(new UIPlayerSeek.c(true, false));
                videoView.getViewBinding().u.P4(new xwp0.a(true, false));
            } else if (videoView.k0) {
                VideoView.H0(videoView, false, false, false, false, 28);
            }
            videoView.W = i;
            videoView.getViewBinding().g.setAutoSkip$core_release(false);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        VideoView videoView = this.c;
        yg5 autoPlay = videoView.getAutoPlay();
        if (autoPlay != null && !autoPlay.a() && videoView.getViewBinding().k.c()) {
            boolean z = this.b;
            if (z) {
                a(motionEvent);
            } else {
                this.b = !z;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        yg5 autoPlay;
        yg5 autoPlay2;
        VideoView videoView = this.c;
        yg5 autoPlay3 = videoView.getAutoPlay();
        Float valueOf = autoPlay3 != null ? Float.valueOf(autoPlay3.b()) : null;
        if (!((Boolean) videoView.G0.e.getValue()).booleanValue() || valueOf == null || (autoPlay = videoView.getAutoPlay()) == null || !autoPlay.isPlaying() || (autoPlay2 = videoView.getAutoPlay()) == null || autoPlay2.w0()) {
            return;
        }
        d3m.c(videoView.getViewBinding().m, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        videoView.a0 = valueOf;
        yg5 autoPlay4 = videoView.getAutoPlay();
        if (autoPlay4 != null) {
            autoPlay4.setPlaybackSpeed(2.0f);
        }
        videoView.performHapticFeedback(0);
        if (videoView.r0) {
            videoView.S0();
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.c.getClass();
        return super.onScroll(motionEvent, motionEvent2, f, f2);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        VideoView videoView = this.c;
        if (videoView.getViewBinding().k.c() || videoView.f1()) {
            return false;
        }
        videoView.S0();
        return true;
    }
}
