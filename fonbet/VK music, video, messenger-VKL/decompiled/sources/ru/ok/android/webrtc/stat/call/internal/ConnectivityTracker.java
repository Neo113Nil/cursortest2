package ru.ok.android.webrtc.stat.call.internal;

import android.os.SystemClock;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.annotation.CallInternalApi;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.stat.CallAnalytics;
import ru.ok.android.webrtc.stat.call.methods.call_stat.SsrcsReset;
import ru.ok.android.webrtc.stat.rtc.RTCStat;
import ru.ok.android.webrtc.stat.rtc.Ssrc;
import ru.ok.android.webrtc.stat.rtc.SsrcUtils;
import ru.ok.android.webrtc.stat.utils.BitrateCalc;
import ru.ok.android.webrtc.stat.utils.LossCalc;
import xsna.be;
import xsna.epx;
import xsna.h5s;
import xsna.zcl;

@CallInternalApi
/* loaded from: classes9.dex */
public final class ConnectivityTracker {

    @Deprecated
    public static final double DEFAULT_UPLINK_BITRATE = 0.0d;

    @Deprecated
    public static final double DEFAULT_UPLINK_LOSS = 1.0d;

    @Deprecated
    public static final double MAX_UPLINK_LOSS = 0.01d;

    @Deprecated
    public static final double MIN_UPLINK_BITRATE = 48000.0d;

    @Deprecated
    public static final String TAG = "CallAnalyticsLoggerConnectivityTracker";
    public final CallAnalytics a;
    public final RTCLog b;
    public final Config c;
    public final BitrateCalc d;
    public double e;
    public final LossCalc f;
    public double g;
    public final SsrcsReset h;
    public volatile boolean i;
    public volatile boolean j;

    public ConnectivityTracker(CallAnalytics callAnalytics, RTCLog rTCLog, Config config) {
        this.a = callAnalytics;
        this.b = rTCLog;
        this.c = config;
        this.d = new BitrateCalc();
        this.f = new LossCalc();
        this.g = 1.0d;
        this.h = new SsrcsReset();
        rTCLog.log(TAG, "Configuration: " + config);
    }

    public final void a() {
        if (!this.i || !this.j || this.g > this.c.getMaxLoss() || this.e < this.c.getMinBandwidth()) {
            if (this.a.isIdle$webrtc_android_sdk_release()) {
                a("Disable upload analytics");
            } else {
                a("Already disabled");
            }
            this.a.setIdle(false);
            return;
        }
        if (this.a.isIdle$webrtc_android_sdk_release()) {
            a("Already enabled");
        } else {
            a("Enable upload analytics");
        }
        this.a.setIdle(true);
    }

    public final boolean isPeerConnectionConnected() {
        return this.j;
    }

    public final boolean onPeerConnectionConnectedChange(boolean z) {
        if (this.j == z) {
            return false;
        }
        this.j = z;
        if (z) {
            a();
            return true;
        }
        this.d.reset();
        this.f.reset();
        this.g = 1.0d;
        this.e = DEFAULT_UPLINK_BITRATE;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onRtcStats(RTCStat rTCStat) {
        double update;
        if (this.c.isEnabled()) {
            List<Ssrc> list = rTCStat.ssrcs;
            Ssrc.AudioSend audioSend = null;
            if (!this.h.shouldReset(list)) {
                Iterator<T> it = SsrcUtils.outgoingAudio(list).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (epx.f(((Ssrc.Send) next).isMediaShare, Boolean.FALSE)) {
                        audioSend = next;
                        break;
                    }
                }
                audioSend = audioSend;
            }
            double d = 1.0d;
            double d2 = DEFAULT_UPLINK_BITRATE;
            if (audioSend == null) {
                this.d.reset();
                this.f.reset();
                this.g = 1.0d;
                this.e = DEFAULT_UPLINK_BITRATE;
                a();
                return;
            }
            BigInteger bigInteger = audioSend.bytesSent;
            if (bigInteger == null && audioSend.headerBytesSent == null) {
                update = 0.0d;
            } else {
                long longValue = bigInteger != null ? bigInteger.longValue() : 0L;
                BigInteger bigInteger2 = audioSend.headerBytesSent;
                update = this.d.update(longValue + (bigInteger2 != null ? bigInteger2.longValue() : 0L), SystemClock.elapsedRealtime());
            }
            Long l = audioSend.targetBitrate;
            if (l != null) {
                d2 = l.longValue();
            }
            this.e = Math.max(update, d2);
            BigInteger bigInteger3 = audioSend.packetsLost;
            if (bigInteger3 != null && audioSend.packetsSent != null) {
                d = this.f.update(bigInteger3.longValue(), audioSend.packetsSent.longValue());
            }
            this.g = d;
            a();
        }
    }

    public final void onSignalingConnectedChange(boolean z) {
        if (this.i == z) {
            return;
        }
        this.i = z;
        if (this.c.isEnabled()) {
            a();
        }
    }

    public static final class Config {
        public final boolean a;
        public final double b;
        public final double c;

        public Config(boolean z, double d, double d2) {
            this.a = z;
            this.b = d;
            this.c = d2;
        }

        public static /* synthetic */ Config copy$default(Config config, boolean z, double d, double d2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = config.a;
            }
            if ((i & 2) != 0) {
                d = config.b;
            }
            if ((i & 4) != 0) {
                d2 = config.c;
            }
            return config.copy(z, d, d2);
        }

        public final boolean component1() {
            return this.a;
        }

        public final double component2() {
            return this.b;
        }

        public final double component3() {
            return this.c;
        }

        public final Config copy(boolean z, double d, double d2) {
            return new Config(z, d, d2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Config)) {
                return false;
            }
            Config config = (Config) obj;
            return this.a == config.a && Double.compare(this.b, config.b) == 0 && Double.compare(this.c, config.c) == 0;
        }

        public final double getMaxLoss() {
            return this.b;
        }

        public final double getMinBandwidth() {
            return this.c;
        }

        public int hashCode() {
            return Double.hashCode(this.c) + be.b(this.b, Boolean.hashCode(this.a) * 31);
        }

        public final boolean isEnabled() {
            return this.a;
        }

        public String toString() {
            return "Config(isEnabled=" + this.a + ", maxLoss=" + this.b + ", minBandwidth=" + this.c + ")";
        }

        public /* synthetic */ Config(boolean z, Double d, Double d2, int i, zcl zclVar) {
            this(z, (i & 2) != 0 ? null : d, (i & 4) != 0 ? null : d2);
        }

        public Config(boolean z, Double d, Double d2) {
            this(z, d != null ? d.doubleValue() : 0.01d, d2 != null ? d2.doubleValue() : 48000.0d);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ConnectivityTracker(CallAnalytics callAnalytics, RTCLog rTCLog, Config config, int i, zcl zclVar) {
        this(callAnalytics, rTCLog, config);
        if ((i & 4) != 0) {
            config = new Config(false, null, null, 6, null);
        }
    }

    public final void a(String str) {
        RTCLog rTCLog = this.b;
        boolean z = this.i;
        boolean z2 = this.j;
        String format = String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(this.e)}, 1));
        String format2 = String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(this.g)}, 1));
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(": signaling_connected=");
        sb.append(z);
        sb.append(", pc_connected=");
        sb.append(z2);
        rTCLog.log(TAG, h5s.d(sb, ", bitrate=", format, ", loss=", format2));
    }
}
