package ru.ok.android.webrtc.mediaadaptation;

import com.vk.movika.sdk.android.defaultplayer.view.a;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.onelog.NetworkClass;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import ru.ok.android.webrtc.utils.retry.ExponentialAlgorithm;
import xsna.be;
import xsna.cgn;
import xsna.de;
import xsna.e630;
import xsna.epx;
import xsna.gsi0;
import xsna.lby;
import xsna.sl9;
import xsna.wn4;
import xsna.zcl;

/* loaded from: classes9.dex */
public final class MediaAdaptationConfig {
    public static final Companion Companion = new Companion(null);
    public final BadNetworkCondition a;
    public final GoodNetworkCondition b;

    public static final class BadNetworkCondition {
        public final double a;
        public final double b;
        public final double c;
        public final double d;
        public final double e;
        public final int f;
        public final int g;
        public final boolean h;
        public final boolean i;
        public final boolean j;
        public final boolean k;

        public BadNetworkCondition() {
            this(ConnectivityTracker.DEFAULT_UPLINK_BITRATE, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, 0, 0, false, false, false, false, 2047, null);
        }

        public final double component1() {
            return this.a;
        }

        public final boolean component10() {
            return this.j;
        }

        public final boolean component11() {
            return this.k;
        }

        public final double component2() {
            return this.b;
        }

        public final double component3() {
            return this.c;
        }

        public final double component4() {
            return this.d;
        }

        public final double component5() {
            return this.e;
        }

        public final int component6() {
            return this.f;
        }

        public final int component7() {
            return this.g;
        }

        public final boolean component8() {
            return this.h;
        }

        public final boolean component9() {
            return this.i;
        }

        public final BadNetworkCondition copy(double d, double d2, double d3, double d4, double d5, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4) {
            return new BadNetworkCondition(d, d2, d3, d4, d5, i, i2, z, z2, z3, z4);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BadNetworkCondition)) {
                return false;
            }
            BadNetworkCondition badNetworkCondition = (BadNetworkCondition) obj;
            return Double.compare(this.a, badNetworkCondition.a) == 0 && Double.compare(this.b, badNetworkCondition.b) == 0 && Double.compare(this.c, badNetworkCondition.c) == 0 && Double.compare(this.d, badNetworkCondition.d) == 0 && Double.compare(this.e, badNetworkCondition.e) == 0 && this.f == badNetworkCondition.f && this.g == badNetworkCondition.g && this.h == badNetworkCondition.h && this.i == badNetworkCondition.i && this.j == badNetworkCondition.j && this.k == badNetworkCondition.k;
        }

        public final boolean getLimitBitrate() {
            return this.j;
        }

        public final boolean getLimitFrameSize() {
            return this.i;
        }

        public final double getLostPacketsLimitForRttAboveLowBound() {
            return this.c;
        }

        public final double getLostPacketsLimitForRttBelowLowBound() {
            return this.b;
        }

        public final boolean getPreferHardwareVPXEncoder() {
            return this.h;
        }

        public final double getRttEnterLevel2Mode() {
            return this.d;
        }

        public final double getRttLeaveLevel2Mode() {
            return this.e;
        }

        public final double getRttThreshold() {
            return this.a;
        }

        public final boolean getSetTemporalLayers() {
            return this.k;
        }

        public final int getVideoBitrateLevel1K() {
            return this.f;
        }

        public final int getVideoBitrateLevel2K() {
            return this.g;
        }

        public int hashCode() {
            return Boolean.hashCode(this.k) + wn4.b(this.j, wn4.b(this.i, wn4.b(this.h, de.v(this.g, de.v(this.f, be.b(this.e, be.b(this.d, be.b(this.c, be.b(this.b, Double.hashCode(this.a) * 31)))))))));
        }

        public String toString() {
            double d = this.a;
            double d2 = this.b;
            double d3 = this.c;
            double d4 = this.d;
            double d5 = this.e;
            int i = this.f;
            int i2 = this.g;
            boolean z = this.h;
            boolean z2 = this.i;
            boolean z3 = this.j;
            boolean z4 = this.k;
            StringBuilder a = lby.a("BadNetworkCondition(rttThreshold=", d, ", lostPacketsLimitForRttBelowLowBound=");
            a.append(d2);
            a.a(a, ", lostPacketsLimitForRttAboveLowBound=", d3, ", rttEnterLevel2Mode=");
            a.append(d4);
            a.a(a, ", rttLeaveLevel2Mode=", d5, ", videoBitrateLevel1K=");
            cgn.a(i, i2, ", videoBitrateLevel2K=", ", preferHardwareVPXEncoder=", a);
            gsi0.c(a, z, ", limitFrameSize=", z2, ", limitBitrate=");
            a.append(z3);
            a.append(", setTemporalLayers=");
            a.append(z4);
            a.append(")");
            return a.toString();
        }

        public BadNetworkCondition(double d, double d2, double d3, double d4, double d5, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4) {
            this.a = d;
            this.b = d2;
            this.c = d3;
            this.d = d4;
            this.e = d5;
            this.f = i;
            this.g = i2;
            this.h = z;
            this.i = z2;
            this.j = z3;
            this.k = z4;
        }

        public /* synthetic */ BadNetworkCondition(double d, double d2, double d3, double d4, double d5, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, int i3, zcl zclVar) {
            this((i3 & 1) != 0 ? 120.0d : d, (i3 & 2) != 0 ? 0.04d : d2, (i3 & 4) == 0 ? d3 : 0.04d, (i3 & 8) != 0 ? 1000.0d : d4, (i3 & 16) != 0 ? 700.0d : d5, (i3 & 32) != 0 ? 500 : i, (i3 & 64) != 0 ? 300 : i2, (i3 & 128) != 0 ? true : z, (i3 & 256) != 0 ? false : z2, (i3 & 512) == 0 ? z3 : false, (i3 & 1024) != 0 ? true : z4);
        }
    }

    public static final class Companion {
        public Companion(zcl zclVar) {
        }

        public final MediaAdaptationConfig fromJSON(String str) {
            GoodNetworkCondition goodNetworkCondition;
            BadNetworkCondition badNetworkCondition;
            if (str == null) {
                return null;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                JSONObject optJSONObject = jSONObject.optJSONObject(NetworkClass.GOOD);
                if (optJSONObject != null) {
                    goodNetworkCondition = new GoodNetworkCondition(optJSONObject.optDouble("rtt_low_bound", 90.0d), optJSONObject.optDouble("loss_limit_low_bound", 0.02d), optJSONObject.optDouble("rtt_high_bound", 700.0d), optJSONObject.optDouble("loss_limit_high_bound", 0.02d), optJSONObject.optLong("recovery_timeout_ms", ExponentialAlgorithm.DEFAULT_MAX_INTERVAL_MS));
                } else {
                    goodNetworkCondition = new GoodNetworkCondition(ConnectivityTracker.DEFAULT_UPLINK_BITRATE, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, 0L, 31, null);
                }
                JSONObject optJSONObject2 = jSONObject.optJSONObject("bad");
                if (optJSONObject2 != null) {
                    badNetworkCondition = new BadNetworkCondition(optJSONObject2.optDouble("rtt_threshold", 120.0d), optJSONObject2.optDouble("loss_limit_below_low_bound", 0.04d), optJSONObject2.optDouble("loss_limit_above_low_bound", 0.04d), optJSONObject2.optDouble("rtt_level2_enter", 1000.0d), optJSONObject2.optDouble("rtt_level2_leave", 700.0d), optJSONObject2.optInt("video_bitrate_level1_k", 500), optJSONObject2.optInt("video_bitrate_level2_k", 300), optJSONObject2.optBoolean("prefer_hw_vpx_encoder", false), optJSONObject2.optBoolean("limit_frame_size", true), optJSONObject2.optBoolean("limit_bitrate", true), optJSONObject2.optBoolean("set_temporal_layers", true));
                } else {
                    badNetworkCondition = new BadNetworkCondition(ConnectivityTracker.DEFAULT_UPLINK_BITRATE, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, 0, 0, false, false, false, false, 2047, null);
                }
                return new MediaAdaptationConfig(badNetworkCondition, goodNetworkCondition);
            } catch (JSONException unused) {
                return null;
            }
        }
    }

    public static final class GoodNetworkCondition {
        public final double a;
        public final double b;
        public final double c;
        public final double d;
        public final long e;

        public GoodNetworkCondition() {
            this(ConnectivityTracker.DEFAULT_UPLINK_BITRATE, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, 0L, 31, null);
        }

        public static /* synthetic */ GoodNetworkCondition copy$default(GoodNetworkCondition goodNetworkCondition, double d, double d2, double d3, double d4, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                d = goodNetworkCondition.a;
            }
            double d5 = d;
            if ((i & 2) != 0) {
                d2 = goodNetworkCondition.b;
            }
            return goodNetworkCondition.copy(d5, d2, (i & 4) != 0 ? goodNetworkCondition.c : d3, (i & 8) != 0 ? goodNetworkCondition.d : d4, (i & 16) != 0 ? goodNetworkCondition.e : j);
        }

        public final double component1() {
            return this.a;
        }

        public final double component2() {
            return this.b;
        }

        public final double component3() {
            return this.c;
        }

        public final double component4() {
            return this.d;
        }

        public final long component5() {
            return this.e;
        }

        public final GoodNetworkCondition copy(double d, double d2, double d3, double d4, long j) {
            return new GoodNetworkCondition(d, d2, d3, d4, j);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GoodNetworkCondition)) {
                return false;
            }
            GoodNetworkCondition goodNetworkCondition = (GoodNetworkCondition) obj;
            return Double.compare(this.a, goodNetworkCondition.a) == 0 && Double.compare(this.b, goodNetworkCondition.b) == 0 && Double.compare(this.c, goodNetworkCondition.c) == 0 && Double.compare(this.d, goodNetworkCondition.d) == 0 && this.e == goodNetworkCondition.e;
        }

        public final double getLostPacketsLimitForRttHighBound() {
            return this.d;
        }

        public final double getLostPacketsLimitForRttLowBound() {
            return this.b;
        }

        public final long getRecoveryTimeoutMs() {
            return this.e;
        }

        public final double getRttHighBound() {
            return this.c;
        }

        public final double getRttLowBound() {
            return this.a;
        }

        public int hashCode() {
            return Long.hashCode(this.e) + be.b(this.d, be.b(this.c, be.b(this.b, Double.hashCode(this.a) * 31)));
        }

        public String toString() {
            double d = this.a;
            double d2 = this.b;
            double d3 = this.c;
            double d4 = this.d;
            long j = this.e;
            StringBuilder a = lby.a("GoodNetworkCondition(rttLowBound=", d, ", lostPacketsLimitForRttLowBound=");
            a.append(d2);
            a.a(a, ", rttHighBound=", d3, ", lostPacketsLimitForRttHighBound=");
            a.append(d4);
            return e630.c(a, ", recoveryTimeoutMs=", j, ")");
        }

        public GoodNetworkCondition(double d, double d2, double d3, double d4, long j) {
            this.a = d;
            this.b = d2;
            this.c = d3;
            this.d = d4;
            this.e = j;
        }

        public /* synthetic */ GoodNetworkCondition(double d, double d2, double d3, double d4, long j, int i, zcl zclVar) {
            this((i & 1) != 0 ? 90.0d : d, (i & 2) != 0 ? 0.02d : d2, (i & 4) != 0 ? 700.0d : d3, (i & 8) != 0 ? 0.02d : d4, (i & 16) != 0 ? 30000L : j);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MediaAdaptationConfig() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ MediaAdaptationConfig copy$default(MediaAdaptationConfig mediaAdaptationConfig, BadNetworkCondition badNetworkCondition, GoodNetworkCondition goodNetworkCondition, int i, Object obj) {
        if ((i & 1) != 0) {
            badNetworkCondition = mediaAdaptationConfig.a;
        }
        if ((i & 2) != 0) {
            goodNetworkCondition = mediaAdaptationConfig.b;
        }
        return mediaAdaptationConfig.copy(badNetworkCondition, goodNetworkCondition);
    }

    public static final MediaAdaptationConfig fromJSON(String str) {
        return Companion.fromJSON(str);
    }

    public final BadNetworkCondition component1() {
        return this.a;
    }

    public final GoodNetworkCondition component2() {
        return this.b;
    }

    public final MediaAdaptationConfig copy(BadNetworkCondition badNetworkCondition, GoodNetworkCondition goodNetworkCondition) {
        return new MediaAdaptationConfig(badNetworkCondition, goodNetworkCondition);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaAdaptationConfig)) {
            return false;
        }
        MediaAdaptationConfig mediaAdaptationConfig = (MediaAdaptationConfig) obj;
        return epx.f(this.a, mediaAdaptationConfig.a) && epx.f(this.b, mediaAdaptationConfig.b);
    }

    public final BadNetworkCondition getBadNetwork() {
        return this.a;
    }

    public final GoodNetworkCondition getGoodNetwork() {
        return this.b;
    }

    public int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final JSONObject toJSONObject$webrtc_android_sdk_release() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("rtt_threshold", this.a.getRttThreshold());
        jSONObject2.put("loss_limit_below_low_bound", this.a.getLostPacketsLimitForRttBelowLowBound());
        jSONObject2.put("loss_limit_above_low_bound", this.a.getLostPacketsLimitForRttAboveLowBound());
        jSONObject2.put("rtt_level2_enter", this.a.getRttEnterLevel2Mode());
        jSONObject2.put("rtt_level2_leave", this.a.getRttLeaveLevel2Mode());
        jSONObject2.put("prefer_hw_vpx_encoder", this.a.getPreferHardwareVPXEncoder());
        jSONObject2.put("limit_frame_size", this.a.getLimitFrameSize());
        jSONObject2.put("limit_bitrate", this.a.getLimitBitrate());
        JSONObject put = jSONObject.put("bad", jSONObject2.put("set_temporal_layers", this.a.getSetTemporalLayers()));
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("rtt_low_bound", this.b.getRttLowBound());
        jSONObject3.put("rtt_high_bound", this.b.getRttHighBound());
        jSONObject3.put("loss_limit_low_bound", this.b.getLostPacketsLimitForRttLowBound());
        jSONObject3.put("loss_limit_high_bound", this.b.getLostPacketsLimitForRttHighBound());
        return put.put(NetworkClass.GOOD, jSONObject3.put("recovery_timeout_ms", this.b.getRecoveryTimeoutMs()));
    }

    public String toString() {
        return "MediaAdaptationConfig(badNetwork=" + this.a + ", goodNetwork=" + this.b + ")";
    }

    public final boolean validate$webrtc_android_sdk_release(RTCLog rTCLog) {
        if (this.a.getRttLeaveLevel2Mode() <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
            String str = "Invalid badNetwork.rttLeaveLevel2Mode: " + this.a.getRttLeaveLevel2Mode() + " Must be >= 0";
            rTCLog.reportException(MediaAdaptation.LOG_TAG, str, new RuntimeException(str));
            return false;
        }
        if (this.a.getRttEnterLevel2Mode() <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
            String str2 = "Invalid badNetwork.rttEnterLevel2Mode: " + this.a.getRttEnterLevel2Mode() + " Must be >= 0";
            rTCLog.reportException(MediaAdaptation.LOG_TAG, str2, new RuntimeException(str2));
            return false;
        }
        if (this.a.getRttThreshold() <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
            String str3 = "Invalid badNetwork.rttThreshold: " + this.a.getRttThreshold() + " Must be >= 0";
            rTCLog.reportException(MediaAdaptation.LOG_TAG, str3, new RuntimeException(str3));
            return false;
        }
        if (this.a.getRttThreshold() >= this.a.getRttEnterLevel2Mode()) {
            double rttThreshold = this.a.getRttThreshold();
            double rttEnterLevel2Mode = this.a.getRttEnterLevel2Mode();
            StringBuilder a = lby.a("Invalid badNetwork.rttThreshold: ", rttThreshold, " Must be < badNetwork.rttEnterLevel2Mode (");
            a.append(rttEnterLevel2Mode);
            a.append(")");
            String sb = a.toString();
            rTCLog.reportException(MediaAdaptation.LOG_TAG, sb, new RuntimeException(sb));
            return false;
        }
        if (this.a.getRttLeaveLevel2Mode() >= this.a.getRttEnterLevel2Mode()) {
            double rttLeaveLevel2Mode = this.a.getRttLeaveLevel2Mode();
            double rttEnterLevel2Mode2 = this.a.getRttEnterLevel2Mode();
            StringBuilder a2 = lby.a("Invalid badNetwork.rttLeaveLevel2Mode: ", rttLeaveLevel2Mode, " Must be < badNetwork.rttEnterLevel2Mode (");
            a2.append(rttEnterLevel2Mode2);
            a2.append(")");
            String sb2 = a2.toString();
            rTCLog.reportException(MediaAdaptation.LOG_TAG, sb2, new RuntimeException(sb2));
            return false;
        }
        if (this.a.getLostPacketsLimitForRttBelowLowBound() <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
            String str4 = "Invalid badNetwork.lostPacketsLimitForRttBelowLowBound: " + this.a.getLostPacketsLimitForRttBelowLowBound() + " Must be >= 0";
            rTCLog.reportException(MediaAdaptation.LOG_TAG, str4, new RuntimeException(str4));
            return false;
        }
        if (this.a.getLostPacketsLimitForRttAboveLowBound() <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
            String str5 = "Invalid badNetwork.lostPacketsLimitForRttAboveLowBound: " + this.a.getLostPacketsLimitForRttAboveLowBound() + " Must be >= 0";
            rTCLog.reportException(MediaAdaptation.LOG_TAG, str5, new RuntimeException(str5));
            return false;
        }
        if (this.b.getRttLowBound() >= this.b.getRttHighBound()) {
            double rttLowBound = this.b.getRttLowBound();
            double rttHighBound = this.b.getRttHighBound();
            StringBuilder a3 = lby.a("Invalid goodNetwork.rttLowBound: ", rttLowBound, " Must be < goodNetwork.rttHighBound (");
            a3.append(rttHighBound);
            a3.append(")");
            String sb3 = a3.toString();
            rTCLog.reportException(MediaAdaptation.LOG_TAG, sb3, new RuntimeException(sb3));
            return false;
        }
        if (this.b.getLostPacketsLimitForRttLowBound() <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
            String str6 = "Invalid badNetwork.lostPacketsLimitForRttLowBound: " + this.b.getLostPacketsLimitForRttLowBound() + " Must be >= 0";
            rTCLog.reportException(MediaAdaptation.LOG_TAG, str6, new RuntimeException(str6));
            return false;
        }
        if (this.b.getLostPacketsLimitForRttHighBound() <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
            String str7 = "Invalid badNetwork.lostPacketsLimitForRttHighBound: " + this.b.getLostPacketsLimitForRttHighBound() + " Must be >= 0";
            rTCLog.reportException(MediaAdaptation.LOG_TAG, str7, new RuntimeException(str7));
            return false;
        }
        if (this.a.getVideoBitrateLevel1K() >= 0) {
            if (this.a.getVideoBitrateLevel2K() <= this.a.getVideoBitrateLevel1K()) {
                return true;
            }
            String c = sl9.c(this.a.getVideoBitrateLevel2K(), this.a.getVideoBitrateLevel1K(), "Invalid badNetwork.videoBitrateLevel2K : ", " Must be <= (", ")");
            rTCLog.reportException(MediaAdaptation.LOG_TAG, c, new RuntimeException(c));
            return false;
        }
        String str8 = "Invalid badNetwork.videoBitrateLevel1K : " + this.a.getVideoBitrateLevel1K() + " Must be >= 0 (" + this.a.getRttLeaveLevel2Mode() + ")";
        rTCLog.reportException(MediaAdaptation.LOG_TAG, str8, new RuntimeException(str8));
        return false;
    }

    public MediaAdaptationConfig(BadNetworkCondition badNetworkCondition, GoodNetworkCondition goodNetworkCondition) {
        this.a = badNetworkCondition;
        this.b = goodNetworkCondition;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ MediaAdaptationConfig(BadNetworkCondition badNetworkCondition, GoodNetworkCondition goodNetworkCondition, int i, zcl zclVar) {
        this(r1, r2);
        BadNetworkCondition badNetworkCondition2;
        GoodNetworkCondition goodNetworkCondition2;
        if ((i & 1) != 0) {
            badNetworkCondition2 = new BadNetworkCondition(ConnectivityTracker.DEFAULT_UPLINK_BITRATE, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, 0, 0, false, false, false, false, 2047, null);
        } else {
            badNetworkCondition2 = badNetworkCondition;
        }
        if ((i & 2) != 0) {
            goodNetworkCondition2 = new GoodNetworkCondition(ConnectivityTracker.DEFAULT_UPLINK_BITRATE, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, 0L, 31, null);
        } else {
            goodNetworkCondition2 = goodNetworkCondition;
        }
    }
}
