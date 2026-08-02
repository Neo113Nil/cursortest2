package ru.ok.android.webrtc;

import org.json.JSONObject;
import org.webrtc.CalledByNative;
import org.webrtc.VideoCodecInfo;
import org.webrtc.VideoEncoderFactory;
import ru.ok.android.externcalls.analytics.events.EventItemValue;
import ru.ok.android.webrtc.connection.BadConnectionSignaling;
import ru.ok.android.webrtc.mediaadaptation.MediaAdaptation;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import ru.ok.android.webrtc.stat.call.methods.eventual.CallEventualStatSender;
import ru.ok.android.webrtc.stat.scheme.CallEventualStatName;
import xsna.an10;
import xsna.ebz0;
import xsna.epx;
import xsna.s3q0;
import xsna.ss9;
import xsna.zcl;

/* loaded from: classes9.dex */
public final class PatchedVideoEncoderFactoryCodecSelector implements VideoEncoderFactory.VideoEncoderSelector, MediaAdaptation.EventListener {
    public static final Companion Companion = new Companion(null);
    public final PatchedVideoEncoderFactory a;
    public final CallEventualStatSender b;
    public final RTCLog c;
    public VideoCodecInfo d;
    public VideoCodecInfo e;
    public boolean f;
    public ebz0 g = new ebz0(MediaAdaptation.NetworkCondition.GOOD, new MediaAdaptation.NetworkState(ConnectivityTracker.DEFAULT_UPLINK_BITRATE, ConnectivityTracker.DEFAULT_UPLINK_BITRATE), false);
    public boolean h = true;
    public final Object i = new Object();

    public static final class Companion {
        public Companion(zcl zclVar) {
        }
    }

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MediaAdaptation.NetworkCondition.values().length];
            try {
                iArr[MediaAdaptation.NetworkCondition.GOOD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public PatchedVideoEncoderFactoryCodecSelector(PatchedVideoEncoderFactory patchedVideoEncoderFactory, CallEventualStatSender callEventualStatSender, CallParams callParams, RTCLog rTCLog) {
        this.a = patchedVideoEncoderFactory;
        this.b = callEventualStatSender;
        this.c = rTCLog;
    }

    public final VideoCodecInfo a() {
        VideoCodecInfo a;
        if (this.e == null) {
            return null;
        }
        VideoCodecInfo videoCodecInfo = this.d;
        if (!epx.f(videoCodecInfo != null ? videoCodecInfo.name : null, "H265")) {
            VideoCodecInfo videoCodecInfo2 = this.e;
            if (!epx.f(videoCodecInfo2 != null ? videoCodecInfo2.name : null, "H265")) {
                ebz0 ebz0Var = this.g;
                if (WhenMappings.$EnumSwitchMapping$0[ebz0Var.a.ordinal()] == 1) {
                    a = this.e;
                } else if (ebz0Var.c) {
                    VideoCodecInfo[] supportedHardwareCodecs = this.a.getSupportedHardwareCodecs();
                    VideoCodecInfo a2 = a(supportedHardwareCodecs, "VP9");
                    if (a2 == null) {
                        a = a(supportedHardwareCodecs, "VP8");
                        if (a == null) {
                            a = a(this.a.getSupportedSoftwareCodecs(), "VP8");
                        }
                    } else {
                        a = a2;
                    }
                } else {
                    a = a(this.a.getSupportedSoftwareCodecs(), "VP8");
                    if (a == null) {
                        this.c.log("PatchedVideoEncoderFactoryCodecSelector", "Software VP8 encoder not found");
                    }
                }
                if (epx.f(a, this.d)) {
                    return null;
                }
                VideoCodecInfo videoCodecInfo3 = this.d;
                String str = videoCodecInfo3 != null ? videoCodecInfo3.name : null;
                if (str == null) {
                    str = "";
                }
                String str2 = a != null ? a.name : null;
                a(str, str2 != null ? str2 : "");
                return a;
            }
        }
        if (!this.f) {
            this.f = true;
            this.c.log("PatchedVideoEncoderFactoryCodecSelector", "Using H265 encoder, ignore network condition change");
        }
        return null;
    }

    public final boolean isSoftwareCodecProhibited(VideoCodecInfo videoCodecInfo) {
        boolean f = epx.f(videoCodecInfo.name, "VP9");
        this.c.log("PatchedVideoEncoderFactoryCodecSelector", "isSoftwareCodecProhibited check for: " + videoCodecInfo + ", resulted as " + f);
        return f;
    }

    @Override // org.webrtc.VideoEncoderFactory.VideoEncoderSelector
    @CalledByNative("VideoEncoderSelector")
    public VideoCodecInfo onAvailableBitrate(int i) {
        return a();
    }

    @Override // org.webrtc.VideoEncoderFactory.VideoEncoderSelector
    public void onCurrentEncoder(VideoCodecInfo videoCodecInfo) {
        if (this.e == null && videoCodecInfo != null) {
            this.c.log("PatchedVideoEncoderFactoryCodecSelector", "Encoder  " + videoCodecInfo + " was selected as default");
            this.e = videoCodecInfo;
        }
        this.d = videoCodecInfo;
        this.c.log("PatchedVideoEncoderFactoryCodecSelector", "Codec selected: " + videoCodecInfo + " for condition " + this.g);
    }

    @Override // org.webrtc.VideoEncoderFactory.VideoEncoderSelector
    @CalledByNative("VideoEncoderSelector")
    public VideoCodecInfo onEncoderBroken() {
        if (epx.f(this.d, this.e)) {
            VideoCodecInfo videoCodecInfo = this.e;
            if (videoCodecInfo != null) {
                this.c.log("PatchedVideoEncoderFactoryCodecSelector", "Default encoder " + videoCodecInfo + " was broken. reset");
            }
            this.e = null;
        }
        VideoCodecInfo videoCodecInfo2 = this.d;
        if (videoCodecInfo2 != null) {
            this.c.log("PatchedVideoEncoderFactoryCodecSelector", "Current encoder " + videoCodecInfo2 + " was broken. reset");
        }
        this.d = null;
        return a();
    }

    @Override // ru.ok.android.webrtc.mediaadaptation.MediaAdaptation.EventListener
    public void onNetworkConditionChanged(MediaAdaptation.NetworkConditionChange networkConditionChange) {
        this.c.log("PatchedVideoEncoderFactoryCodecSelector", "Network condition did change. New condition is " + networkConditionChange);
        synchronized (this.i) {
            this.g = new ebz0(networkConditionChange.getCondition(), networkConditionChange.getState(), networkConditionChange.getPreferHardwarePVXEncoder());
            this.h = false;
            s3q0 s3q0Var = s3q0.a;
        }
    }

    @Override // org.webrtc.VideoEncoderFactory.VideoEncoderSelector
    @CalledByNative("VideoEncoderSelector")
    public VideoCodecInfo onResolutionChange(int i, int i2) {
        return a();
    }

    public static VideoCodecInfo a(VideoCodecInfo[] videoCodecInfoArr, String str) {
        if (videoCodecInfoArr != null) {
            for (VideoCodecInfo videoCodecInfo : videoCodecInfoArr) {
                if (epx.f(videoCodecInfo.name, str)) {
                    return videoCodecInfo;
                }
            }
        }
        return null;
    }

    public final void a(String str, String str2) {
        ebz0 ebz0Var;
        this.c.log("PatchedVideoEncoderFactoryCodecSelector", ss9.a("Selected encoder \"", str2, "\" differs from current one \"", str, "\". Let us suggest an update"));
        synchronized (this.i) {
            if (this.h) {
                ebz0Var = null;
            } else {
                this.h = true;
                ebz0Var = this.g;
            }
        }
        if (ebz0Var != null) {
            CallEventualStatSender.send$default(this.b, CallEventualStatName.VIDEO_ENCODER_CHANGED_BY_NETWORK_ADAPTER, EventItemValue.StringValue.m332boximpl(EventItemValue.StringValue.m333constructorimpl(new JSONObject().put("rtt", this.g.b.getRoundTripTimeMs()).put(BadConnectionSignaling.KEY_BAD_NET_LOSS, an10.a(this.g.b.getLostPacketsFraction() * 100)).put("network_quality", this.g.a.getKey()).put("codec_old", str).put("codec_new", str2).toString())), null, 4, null);
        }
    }
}
