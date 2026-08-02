package ru.ok.android.webrtc.connection;

import com.ironsource.X3;
import org.json.JSONObject;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import ru.ok.android.webrtc.topology.direct.CalcNetworkStatusConfig;
import ru.ok.android.webrtc.topology.direct.ReportNetworkStatusConfig;
import xsna.epx;
import xsna.sni0;
import xsna.y57;
import xsna.zcl;

/* loaded from: classes9.dex */
public final class BadNetworkIndicatorConfig {
    public static final Companion Companion = new Companion(null);
    public static final BadNetworkIndicatorConfig DEFAULT = new BadNetworkIndicatorConfig(null, null, new SignalingConfig(false, false), new DebugLoggingConfig(false, false));
    public final CalcNetworkStatusConfig a;
    public final ReportNetworkStatusConfig b;
    public final SignalingConfig c;
    public final DebugLoggingConfig d;

    public static final class Companion {
        public Companion(zcl zclVar) {
        }

        public final BadNetworkIndicatorConfig from(String str, RTCLog rTCLog) {
            CalcNetworkStatusConfig calcNetworkStatusConfig;
            ReportNetworkStatusConfig reportNetworkStatusConfig;
            double d;
            double d2;
            double d3;
            double d4;
            try {
                if (str == null) {
                    return BadNetworkIndicatorConfig.DEFAULT;
                }
                JSONObject jSONObject = new JSONObject(str);
                JSONObject optJSONObject = jSONObject.optJSONObject("calcNetworkStatusConfig");
                BadNetworkIndicatorConfig.Companion.getClass();
                if (optJSONObject != null ? optJSONObject.optBoolean("enabled", true) : true) {
                    double optDouble = optJSONObject != null ? optJSONObject.optDouble("redline", 0.3d) : 0.3d;
                    double optDouble2 = optJSONObject != null ? optJSONObject.optDouble("redlineMargin", 0.1d) : 0.1d;
                    double optDouble3 = optJSONObject != null ? optJSONObject.optDouble("ratingWeightUp", 1.0d) : 1.0d;
                    double optDouble4 = optJSONObject != null ? optJSONObject.optDouble("ratingWeightDown", 1.0d) : 1.0d;
                    double optDouble5 = optJSONObject != null ? optJSONObject.optDouble("goodRtt", 0.4d) : 0.4d;
                    double optDouble6 = optJSONObject != null ? optJSONObject.optDouble("rttWeightUp", 0.25d) : 0.25d;
                    double optDouble7 = optJSONObject != null ? optJSONObject.optDouble("rttWeightDown", 0.25d) : 0.25d;
                    double optDouble8 = optJSONObject != null ? optJSONObject.optDouble("rttStep", 0.055d) : 0.055d;
                    double optDouble9 = optJSONObject != null ? optJSONObject.optDouble("rttStepWeight", 0.12d) : 0.12d;
                    double d5 = optDouble5;
                    double optDouble10 = optJSONObject != null ? optJSONObject.optDouble("fastLossWeight", 0.6d) : 0.6d;
                    if (optJSONObject != null) {
                        d = optDouble10;
                        d2 = optJSONObject.optDouble("slowLossWeight", 0.25d);
                    } else {
                        d = optDouble10;
                        d2 = 0.25d;
                    }
                    double d6 = d2;
                    double optDouble11 = optJSONObject != null ? optJSONObject.optDouble("fastLossValue", 13.0d) : 13.0d;
                    double optDouble12 = optJSONObject != null ? optJSONObject.optDouble("slowLossValue", 7.0d) : 7.0d;
                    double optDouble13 = optJSONObject != null ? optJSONObject.optDouble("criticalRtt", -1.0d) : -1.0d;
                    double optDouble14 = optJSONObject != null ? optJSONObject.optDouble("criticalFastLoss", -1.0d) : -1.0d;
                    double optDouble15 = optJSONObject != null ? optJSONObject.optDouble("criticalSlowLoss", -1.0d) : -1.0d;
                    boolean optBoolean = optJSONObject != null ? optJSONObject.optBoolean("newNetworkRatingModelEnabled", true) : true;
                    double d7 = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
                    double d8 = optDouble15;
                    if (optJSONObject != null) {
                        d7 = optJSONObject.optDouble("goodLoss", ConnectivityTracker.DEFAULT_UPLINK_BITRATE);
                    }
                    double d9 = d7;
                    double optDouble16 = optJSONObject != null ? optJSONObject.optDouble("lossStep", 0.015d) : 0.015d;
                    double optDouble17 = optJSONObject != null ? optJSONObject.optDouble("lossStepWeight", 0.17d) : 0.17d;
                    boolean optBoolean2 = optJSONObject != null ? optJSONObject.optBoolean("bitrateRatingEnabled", true) : true;
                    if (optJSONObject != null) {
                        d3 = optDouble17;
                        d4 = optJSONObject.optDouble("bitrateRatingInfluenceFactor", 1.0d);
                    } else {
                        d3 = optDouble17;
                        d4 = 1.0d;
                    }
                    calcNetworkStatusConfig = new CalcNetworkStatusConfig(optDouble, optDouble2, optDouble3, optDouble4, d5, optDouble6, optDouble7, optDouble8, optDouble9, d, d6, optDouble11, optDouble12, optDouble13, optDouble14, d8, optBoolean, d9, optDouble16, d3, optBoolean2, d4, optJSONObject != null ? optJSONObject.optDouble("estimatedBitrateWeightUp", 0.75d) : 0.75d, optJSONObject != null ? optJSONObject.optDouble("estimatedBitrateWeightDown", 0.75d) : 0.75d, optJSONObject != null ? optJSONObject.optDouble("reportedBitrateWeightUp", 0.75d) : 0.75d, optJSONObject != null ? optJSONObject.optDouble("reportedBitrateWeightDown", 0.75d) : 0.75d);
                } else {
                    calcNetworkStatusConfig = null;
                }
                JSONObject optJSONObject2 = jSONObject.optJSONObject("reportNetworkStatusConfig");
                if (optJSONObject2 != null ? optJSONObject2.optBoolean("enabled", true) : true) {
                    reportNetworkStatusConfig = new ReportNetworkStatusConfig(optJSONObject2 != null ? optJSONObject2.optDouble("networkStatusReportThreshold", 0.15d) : 0.15d, optJSONObject2 != null ? optJSONObject2.optInt("networkStatusReportIntervalMs", 5000) : 5000, optJSONObject2 != null ? optJSONObject2.optInt("networkStatusReportForceIntervalMs", 10000) : 10000);
                } else {
                    reportNetworkStatusConfig = null;
                }
                JSONObject optJSONObject3 = jSONObject.optJSONObject("signalingConfig");
                SignalingConfig signalingConfig = new SignalingConfig(optJSONObject3 != null ? optJSONObject3.optBoolean("dcReportNetworkStatEnabled", true) : true, optJSONObject3 != null ? optJSONObject3.optBoolean("producerCommandV3", false) : false);
                JSONObject optJSONObject4 = jSONObject.optJSONObject("debugLoggingConfig");
                return new BadNetworkIndicatorConfig(calcNetworkStatusConfig, reportNetworkStatusConfig, signalingConfig, new DebugLoggingConfig(optJSONObject4 != null ? optJSONObject4.optBoolean("debugLogging", false) : false, optJSONObject4 != null ? optJSONObject4.optBoolean("debugVerboseLogging", false) : false));
            } catch (Exception e) {
                rTCLog.logException("BadNetworkIndicatorConfig", "Can't parse BadNetworkIndicatorConfig", e);
                return BadNetworkIndicatorConfig.DEFAULT;
            }
        }
    }

    public static final class DebugLoggingConfig {
        public final boolean a;
        public final boolean b;

        public DebugLoggingConfig(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }

        public static void a(boolean z, RTCLog rTCLog, String str, String str2) {
            if (z) {
                rTCLog.log("BadNetworkIndicatorConfig", y57.a(X3.j.d, str, "]: ", str2));
            }
        }

        public static /* synthetic */ DebugLoggingConfig copy$default(DebugLoggingConfig debugLoggingConfig, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = debugLoggingConfig.a;
            }
            if ((i & 2) != 0) {
                z2 = debugLoggingConfig.b;
            }
            return debugLoggingConfig.copy(z, z2);
        }

        public final boolean component1() {
            return this.a;
        }

        public final boolean component2() {
            return this.b;
        }

        public final DebugLoggingConfig copy(boolean z, boolean z2) {
            return new DebugLoggingConfig(z, z2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DebugLoggingConfig)) {
                return false;
            }
            DebugLoggingConfig debugLoggingConfig = (DebugLoggingConfig) obj;
            return this.a == debugLoggingConfig.a && this.b == debugLoggingConfig.b;
        }

        public final boolean getDebugLogging() {
            return this.a;
        }

        public final boolean getDebugVerboseLogging() {
            return this.b;
        }

        public int hashCode() {
            return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
        }

        public final void log(RTCLog rTCLog, String str, String str2) {
            a(this.a, rTCLog, str, str2);
        }

        public final void logV(RTCLog rTCLog, String str, String str2) {
            a(this.b, rTCLog, str, str2);
        }

        public String toString() {
            return sni0.a("DebugLoggingConfig(debugLogging=", ", debugVerboseLogging=", ")", this.a, this.b);
        }
    }

    public static final class SignalingConfig {
        public final boolean a;
        public final boolean b;

        public SignalingConfig(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }

        public static /* synthetic */ SignalingConfig copy$default(SignalingConfig signalingConfig, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = signalingConfig.a;
            }
            if ((i & 2) != 0) {
                z2 = signalingConfig.b;
            }
            return signalingConfig.copy(z, z2);
        }

        public final boolean component1() {
            return this.a;
        }

        public final boolean component2() {
            return this.b;
        }

        public final SignalingConfig copy(boolean z, boolean z2) {
            return new SignalingConfig(z, z2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SignalingConfig)) {
                return false;
            }
            SignalingConfig signalingConfig = (SignalingConfig) obj;
            return this.a == signalingConfig.a && this.b == signalingConfig.b;
        }

        public final boolean getDcReportNetworkStatEnabled() {
            return this.a;
        }

        public final boolean getProducerCommandV3() {
            return this.b;
        }

        public int hashCode() {
            return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
        }

        public String toString() {
            return sni0.a("SignalingConfig(dcReportNetworkStatEnabled=", ", producerCommandV3=", ")", this.a, this.b);
        }
    }

    public BadNetworkIndicatorConfig(CalcNetworkStatusConfig calcNetworkStatusConfig, ReportNetworkStatusConfig reportNetworkStatusConfig, SignalingConfig signalingConfig, DebugLoggingConfig debugLoggingConfig) {
        this.a = calcNetworkStatusConfig;
        this.b = reportNetworkStatusConfig;
        this.c = signalingConfig;
        this.d = debugLoggingConfig;
    }

    public static /* synthetic */ BadNetworkIndicatorConfig copy$default(BadNetworkIndicatorConfig badNetworkIndicatorConfig, CalcNetworkStatusConfig calcNetworkStatusConfig, ReportNetworkStatusConfig reportNetworkStatusConfig, SignalingConfig signalingConfig, DebugLoggingConfig debugLoggingConfig, int i, Object obj) {
        if ((i & 1) != 0) {
            calcNetworkStatusConfig = badNetworkIndicatorConfig.a;
        }
        if ((i & 2) != 0) {
            reportNetworkStatusConfig = badNetworkIndicatorConfig.b;
        }
        if ((i & 4) != 0) {
            signalingConfig = badNetworkIndicatorConfig.c;
        }
        if ((i & 8) != 0) {
            debugLoggingConfig = badNetworkIndicatorConfig.d;
        }
        return badNetworkIndicatorConfig.copy(calcNetworkStatusConfig, reportNetworkStatusConfig, signalingConfig, debugLoggingConfig);
    }

    public final CalcNetworkStatusConfig component1() {
        return this.a;
    }

    public final ReportNetworkStatusConfig component2() {
        return this.b;
    }

    public final SignalingConfig component3() {
        return this.c;
    }

    public final DebugLoggingConfig component4() {
        return this.d;
    }

    public final BadNetworkIndicatorConfig copy(CalcNetworkStatusConfig calcNetworkStatusConfig, ReportNetworkStatusConfig reportNetworkStatusConfig, SignalingConfig signalingConfig, DebugLoggingConfig debugLoggingConfig) {
        return new BadNetworkIndicatorConfig(calcNetworkStatusConfig, reportNetworkStatusConfig, signalingConfig, debugLoggingConfig);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BadNetworkIndicatorConfig)) {
            return false;
        }
        BadNetworkIndicatorConfig badNetworkIndicatorConfig = (BadNetworkIndicatorConfig) obj;
        return epx.f(this.a, badNetworkIndicatorConfig.a) && epx.f(this.b, badNetworkIndicatorConfig.b) && epx.f(this.c, badNetworkIndicatorConfig.c) && epx.f(this.d, badNetworkIndicatorConfig.d);
    }

    public final CalcNetworkStatusConfig getCalcNetworkStatusConfig() {
        return this.a;
    }

    public final DebugLoggingConfig getDebugLoggingConfig() {
        return this.d;
    }

    public final ReportNetworkStatusConfig getReportNetworkStatusConfig() {
        return this.b;
    }

    public final SignalingConfig getSignalingConfig() {
        return this.c;
    }

    public int hashCode() {
        CalcNetworkStatusConfig calcNetworkStatusConfig = this.a;
        int hashCode = (calcNetworkStatusConfig == null ? 0 : calcNetworkStatusConfig.hashCode()) * 31;
        ReportNetworkStatusConfig reportNetworkStatusConfig = this.b;
        return this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (reportNetworkStatusConfig != null ? reportNetworkStatusConfig.hashCode() : 0)) * 31)) * 31);
    }

    public String toString() {
        return "BadNetworkIndicatorConfig(calcNetworkStatusConfig=" + this.a + ", reportNetworkStatusConfig=" + this.b + ", signalingConfig=" + this.c + ", debugLoggingConfig=" + this.d + ")";
    }
}
