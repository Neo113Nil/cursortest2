package ru.ok.android.webrtc;

import android.text.TextUtils;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import xsna.fo8;
import xsna.fw3;
import xsna.zcl;

/* loaded from: classes9.dex */
public final class PeerConnectionWebRtcParams {

    @Deprecated
    public static final int AUDIO_ADAPTER_MIN_BITRATE_BPS = 16000;

    @Deprecated
    public static final int MIN_ENCODER_BITRATE_KBPS = 16;

    @Deprecated
    public static final int MIN_PAYLOAD_BITRATE_KBPS = 16;

    @Deprecated
    public static final boolean USE_SLOW_ADAPTATION = true;
    public final String a;
    public final String b;
    public final Integer c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final String h;

    public static final class Builder {
        public String a;
        public String b;
        public Integer c;
        public String d;
        public boolean e;
        public boolean f;
        public boolean g;
        public boolean h;

        public final PeerConnectionWebRtcParams build() {
            String str = this.a;
            String str2 = this.b;
            Integer num = this.c;
            String str3 = this.d;
            return new PeerConnectionWebRtcParams(str, str2, num, this.e, this.f, this.g, this.h, str3, null);
        }

        public final Builder setAudioPipelineOffOnMuteEnabled(boolean z) {
            this.g = z;
            return this;
        }

        public final Builder setBonusFieldTrials(String str) {
            this.d = str;
            return this;
        }

        public final Builder setEarlyAudioPlayoutEnabled(boolean z) {
            this.e = z;
            return this;
        }

        public final Builder setEarlyAudioRecordingEnabled(boolean z) {
            this.f = z;
            return this;
        }

        public final Builder setRttMultCapsMs(Integer num) {
            this.c = num;
            return this;
        }

        public final Builder setSimulcastEnabled(boolean z) {
            this.h = z;
            return this;
        }

        public final Builder setTcpMarker(String str) {
            this.b = str;
            return this;
        }

        public final Builder setUdpMarker(String str) {
            this.a = str;
            return this;
        }
    }

    public PeerConnectionWebRtcParams(String str, String str2, Integer num, boolean z, boolean z2, boolean z3, boolean z4, String str3, zcl zclVar) {
        this.a = str;
        this.b = str2;
        this.c = num;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = str3;
    }

    public final String getFieldTrialsAsString(String str) {
        String c = TextUtils.isEmpty(this.a) ? "WebRTC-IntelVP8/Enabled/WebRTC-Audio-SendSideBwe/Enabled/WebRTC-SendSideBwe-WithOverhead/Enabled/WebRTC-FeedbackTimeout/Enabled/WebRTC-Bwe-SafeResetOnRouteChange/Enabled/WebRTC-Audio-Red-For-Opus/Enabled-2/WebRTC-SpsPpsIdrIsH264Keyframe/Enabled/" : fw3.c("WebRTC-IntelVP8/Enabled/WebRTC-Audio-SendSideBwe/Enabled/WebRTC-SendSideBwe-WithOverhead/Enabled/WebRTC-FeedbackTimeout/Enabled/WebRTC-Bwe-SafeResetOnRouteChange/Enabled/WebRTC-Audio-Red-For-Opus/Enabled-2/WebRTC-SpsPpsIdrIsH264Keyframe/Enabled/", "WebRTC-OK-StunCustomAttr/Enabled-", this.a, DomExceptionUtils.SEPARATOR);
        if (!TextUtils.isEmpty(this.b)) {
            c = fw3.c(c, "WebRTC-OK-TurnChannelDataMark/", this.b, DomExceptionUtils.SEPARATOR);
        }
        Integer num = this.c;
        if (num != null) {
            int intValue = num.intValue();
            if (intValue < 0) {
                intValue = 1000;
            }
            c = c + "WebRTC-RttMult/Enabled-1.0," + intValue + DomExceptionUtils.SEPARATOR;
        }
        String a = fo8.a(c, "WebRTC-Bwe-LossBasedBweV2/Enabled:true,CandidateFactors:1.02|1.0|0.95,DelayBasedCandidate:true,HigherBwBiasFactor:0.0002,HigherLogBwBiasFactor:0.02,ObservationDurationLowerBound:250ms,InstantUpperBoundBwBalance:75kbps,BwRampupUpperBoundFactor:1000000.0,InstantUpperBoundTemporalWeightFactor:0.9,TemporalWeightFactor:0.9,MaxIncreaseFactor:1.3,NewtonStepSize:0.75,InherentLossUpperBoundBwBalance:75kbps,LossThresholdOfHighBandwidthPreference:0.15,NotIncreaseIfInherentLossLessThanAverageLoss:true,_20230522/");
        if (this.d) {
            a = fo8.a(a, "WebRTC-OVC-Audio-EarlyStartPlayout/Enabled/");
        }
        if (this.e) {
            a = fo8.a(a, "WebRTC-OVC-Audio-EarlyStartRecording/Enabled/");
        }
        if (this.f) {
            a = fo8.a(a, "WebRTC-OVC-Audio-AudioProcessingOffOnMute/Enabled/");
        }
        if (this.g) {
            a = fo8.a(a, "WebRTC-OVC-HardwareSimulcast/Enabled/");
        }
        String a2 = fo8.a(fo8.a(fo8.a(fo8.a(fo8.a(fo8.a(fo8.a(a, "WebRTC-OVC-Audio-OpusNoLACE/Enabled/"), "WebRTC-AdjustOpusBandwidth/Enabled/"), "WebRTC-OVC-DREDLowBitrate/Enabled/"), "WebRTC-Audio-StableTargetAdaptation/Enabled/"), "WebRTC-OVC-Audio-OpusAdapterMinBitrate/Enabled:16000/"), "WebRTC-Audio-AdaptivePtime/enabled:true,min_payload_bitrate:16kbps,min_encoder_bitrate:16kbps,use_slow_adaptation:true/"), "WebRTC-OVC-DisableSharedSocket/Enabled/");
        String str2 = this.h;
        if (str2 != null && str2.length() != 0) {
            a2 = fo8.a(a2, this.h);
        }
        return (str == null || str.length() == 0) ? a2 : fo8.a(a2, str);
    }

    public final boolean isAudioPipelineOffOnMuteEnabled() {
        return this.f;
    }

    public final boolean isEarlyAudioRecordingEnabled() {
        return this.e;
    }

    public final boolean isSimulcastEnabled() {
        return this.g;
    }
}
