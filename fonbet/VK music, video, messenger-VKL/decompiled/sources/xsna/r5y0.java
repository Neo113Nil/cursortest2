package xsna;

import android.os.Handler;
import android.os.Looper;
import android.webkit.JavascriptInterface;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.ads.BuildConfig;
import com.vk.libvideo.embedded_players.youtube.PlayerConstants$PlaybackQuality;
import com.vk.libvideo.embedded_players.youtube.PlayerConstants$PlaybackRate;
import com.vk.libvideo.embedded_players.youtube.PlayerConstants$PlayerError;
import com.vk.libvideo.embedded_players.youtube.PlayerConstants$PlayerState;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: YouTubePlayerJSInterface.kt */
/* loaded from: classes14.dex */
public final class r5y0 {
    public final o5y0 a;
    public final Handler b = new Handler(Looper.getMainLooper());

    public r5y0(o5y0 o5y0Var) {
        this.a = o5y0Var;
    }

    @JavascriptInterface
    public final boolean sendApiChange() {
        return this.b.post(new i3l(this));
    }

    @JavascriptInterface
    public final void sendError(String str) {
        this.b.post(new p5y0(this, brm0.w(str, "2", true) ? PlayerConstants$PlayerError.INVALID_PARAMETER_IN_REQUEST : brm0.w(str, CampaignEx.CLICKMODE_ON, true) ? PlayerConstants$PlayerError.HTML_5_PLAYER : brm0.w(str, "100", true) ? PlayerConstants$PlayerError.VIDEO_NOT_FOUND : brm0.w(str, "101", true) ? PlayerConstants$PlayerError.VIDEO_NOT_PLAYABLE_IN_EMBEDDED_PLAYER : brm0.w(str, "150", true) ? PlayerConstants$PlayerError.VIDEO_NOT_PLAYABLE_IN_EMBEDDED_PLAYER : PlayerConstants$PlayerError.UNKNOWN));
    }

    @JavascriptInterface
    public final void sendPlaybackQualityChange(String str) {
        this.b.post(new l9q(this, brm0.w(str, "small", true) ? PlayerConstants$PlaybackQuality.SMALL : brm0.w(str, "medium", true) ? PlayerConstants$PlaybackQuality.MEDIUM : brm0.w(str, "large", true) ? PlayerConstants$PlaybackQuality.LARGE : brm0.w(str, "hd720", true) ? PlayerConstants$PlaybackQuality.HD720 : brm0.w(str, "hd1080", true) ? PlayerConstants$PlaybackQuality.HD1080 : brm0.w(str, "highres", true) ? PlayerConstants$PlaybackQuality.HIGH_RES : brm0.w(str, BuildConfig.FLAVOR, true) ? PlayerConstants$PlaybackQuality.DEFAULT : PlayerConstants$PlaybackQuality.UNKNOWN));
    }

    @JavascriptInterface
    public final void sendPlaybackRateChange(String str) {
        if (brm0.w(str, "0.25", true)) {
            PlayerConstants$PlaybackRate playerConstants$PlaybackRate = PlayerConstants$PlaybackRate.RATE_0_25;
        } else if (brm0.w(str, "0.5", true)) {
            PlayerConstants$PlaybackRate playerConstants$PlaybackRate2 = PlayerConstants$PlaybackRate.RATE_0_5;
        } else if (brm0.w(str, "1", true)) {
            PlayerConstants$PlaybackRate playerConstants$PlaybackRate3 = PlayerConstants$PlaybackRate.RATE_1;
        } else if (brm0.w(str, "1.5", true)) {
            PlayerConstants$PlaybackRate playerConstants$PlaybackRate4 = PlayerConstants$PlaybackRate.RATE_1_5;
        } else if (brm0.w(str, "2", true)) {
            PlayerConstants$PlaybackRate playerConstants$PlaybackRate5 = PlayerConstants$PlaybackRate.RATE_2;
        } else {
            PlayerConstants$PlaybackRate playerConstants$PlaybackRate6 = PlayerConstants$PlaybackRate.UNKNOWN;
        }
        this.b.post(new q5y0());
    }

    @JavascriptInterface
    public final boolean sendReady() {
        return this.b.post(new qd0(this, 21));
    }

    @JavascriptInterface
    public final void sendStateChange(String str) {
        this.b.post(new k0(13, this, brm0.w(str, "UNSTARTED", true) ? PlayerConstants$PlayerState.UNSTARTED : brm0.w(str, SignalingProtocol.STATE_ENDED, true) ? PlayerConstants$PlayerState.ENDED : brm0.w(str, "PLAYING", true) ? PlayerConstants$PlayerState.PLAYING : brm0.w(str, "PAUSED", true) ? PlayerConstants$PlayerState.PAUSED : brm0.w(str, "BUFFERING", true) ? PlayerConstants$PlayerState.BUFFERING : brm0.w(str, "CUED", true) ? PlayerConstants$PlayerState.VIDEO_CUED : PlayerConstants$PlayerState.UNKNOWN));
    }

    @JavascriptInterface
    public final void sendVideoCurrentTime(String str) {
        Float l = arm0.l(str);
        if (l != null) {
            this.b.post(new m690(this, l.floatValue()));
        }
    }

    @JavascriptInterface
    public final void sendVideoDuration(String str) {
        if (str.length() == 0) {
            str = "0";
        }
        Float l = arm0.l(str);
        if (l != null) {
            this.b.post(new m690(this, l.floatValue()));
        }
    }

    @JavascriptInterface
    public final boolean sendVideoId(String str) {
        return this.b.post(new vt70(this, str));
    }

    @JavascriptInterface
    public final void sendVideoLoadedFraction(String str) {
        Float l = arm0.l(str);
        if (l != null) {
            this.b.post(new m690(this, l.floatValue()));
        }
    }
}
