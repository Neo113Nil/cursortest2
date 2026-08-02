package ru.ok.android.webrtc.topology.direct;

import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import ru.ok.android.webrtc.stat.utils.Ema;
import ru.ok.android.webrtc.topology.direct.P2PNetworkStatusReporter;
import xsna.an10;
import xsna.izs;
import xsna.lby;
import xsna.s3q0;
import xsna.zcl;

/* loaded from: classes9.dex */
public final class P2PNetworkStatusCalculator implements P2PNetworkStatusReporter.Calculator {
    public static final Companion Companion = new Companion(null);
    public final CalcNetworkStatusConfig a;
    public final izs b;
    public final Ema c;
    public final Ema d;
    public final Ema e;
    public final Ema f;
    public final Ema g;
    public final Ema h;

    public static final class Companion {
        public Companion(zcl zclVar) {
        }

        public static final double access$diffRating(Companion companion, double d, double d2, double d3) {
            companion.getClass();
            if (Math.abs(d) > Double.MAX_VALUE || Math.abs(d2) > Double.MAX_VALUE) {
                return 1.0d;
            }
            double min = 1.0d - ((1.0d - (Math.min(d2, d) / Math.max(d2, d))) * d3);
            if (min > 1.0d) {
                return 1.0d;
            }
            return min;
        }

        public static final double access$simpleRating(Companion companion, double d, double d2, double d3, double d4) {
            companion.getClass();
            int a = an10.a((d - d2) / d3);
            if (a < 0) {
                a = 0;
            }
            return Math.pow(1.0d - d4, a);
        }

        public static final double access$slowFastRating(Companion companion, double d, double d2, double d3, double d4) {
            companion.getClass();
            if (d > ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                return (1.0d - (d * d3)) - (d2 * d4);
            }
            return 1.0d;
        }

        public final P2PNetworkStatusReporter.Calculator create(CalcNetworkStatusConfig calcNetworkStatusConfig, izs<? super String, s3q0> izsVar) {
            return calcNetworkStatusConfig != null ? new P2PNetworkStatusCalculator(calcNetworkStatusConfig, izsVar) : new Dummy();
        }
    }

    public P2PNetworkStatusCalculator(CalcNetworkStatusConfig calcNetworkStatusConfig, izs<? super String, s3q0> izsVar) {
        this.a = calcNetworkStatusConfig;
        this.b = izsVar;
        this.c = new Ema(calcNetworkStatusConfig.getRatingWeightUp(), calcNetworkStatusConfig.getRatingWeightDown(), 1.0d);
        this.d = new Ema(calcNetworkStatusConfig.getRttWeightUp(), calcNetworkStatusConfig.getRttWeightDown(), ConnectivityTracker.DEFAULT_UPLINK_BITRATE);
        this.e = new Ema(calcNetworkStatusConfig.getSlowLossWeight(), ConnectivityTracker.DEFAULT_UPLINK_BITRATE, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, 2, null);
        this.f = new Ema(calcNetworkStatusConfig.getFastLossWeight(), ConnectivityTracker.DEFAULT_UPLINK_BITRATE, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, 2, null);
        this.g = new Ema(calcNetworkStatusConfig.getEstimatedBitrateWeightUp(), calcNetworkStatusConfig.getEstimatedBitrateWeightDown(), ConnectivityTracker.DEFAULT_UPLINK_BITRATE, 4, null);
        this.h = new Ema(calcNetworkStatusConfig.getReportedBitrateWeightUp(), calcNetworkStatusConfig.getReportedBitrateWeightDown(), ConnectivityTracker.DEFAULT_UPLINK_BITRATE, 4, null);
    }

    @Override // ru.ok.android.webrtc.topology.direct.P2PNetworkStatusReporter.Calculator
    public double calc(double d, double d2, double d3, boolean z) {
        this.d.submit(d);
        if (z) {
            this.g.submit(d3);
            izs izsVar = this.b;
            double value = this.d.getValue();
            double value2 = this.g.getValue();
            double value3 = this.h.getValue();
            StringBuilder a = lby.a("EMAs: rtt=", value, " bitrateE=");
            a.append(value2);
            a.append(" bitrateR=");
            a.append(value3);
            izsVar.invoke(a.toString());
        } else {
            this.f.submit(d2);
            this.e.submit(d2);
            izs izsVar2 = this.b;
            double value4 = this.d.getValue();
            double value5 = this.f.getValue();
            double value6 = this.e.getValue();
            StringBuilder a2 = lby.a("EMAs: rtt=", value4, " lossFast=");
            a2.append(value5);
            a2.append(" lossSlow=");
            a2.append(value6);
            izsVar2.invoke(a2.toString());
        }
        double value7 = this.d.getValue();
        double criticalRtt = this.a.getCriticalRtt();
        double d4 = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
        double access$simpleRating = (criticalRtt <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE || value7 <= this.a.getCriticalRtt()) ? Companion.access$simpleRating(Companion, value7, this.a.getGoodRtt(), this.a.getRttStep(), this.a.getRttStepWeight()) : 0.0d;
        if (z) {
            d4 = this.a.getBitrateRatingEnabled() ? Companion.access$diffRating(Companion, this.h.getValue(), this.g.getValue(), this.a.getBitrateRatingInfluenceFactor()) : 1.0d;
        } else {
            double value8 = this.e.getValue();
            double value9 = this.f.getValue();
            double criticalFastLoss = this.a.getCriticalFastLoss();
            if (criticalFastLoss <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE || value9 <= criticalFastLoss) {
                double criticalSlowLoss = this.a.getCriticalSlowLoss();
                if (criticalSlowLoss <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE || value8 <= criticalSlowLoss) {
                    d4 = this.a.getNewNetworkRatingModelEnabled() ? Companion.access$simpleRating(Companion, value8, this.a.getGoodLoss(), this.a.getLossStep(), this.a.getLossStepWeight()) : Companion.access$slowFastRating(Companion, value9, value8, this.a.getFastLossValue(), this.a.getSlowLossValue());
                }
            }
        }
        return access$simpleRating * d4;
    }

    @Override // ru.ok.android.webrtc.topology.direct.P2PNetworkStatusReporter.Calculator
    public void reset() {
        this.c.reset();
        this.d.reset();
        this.e.reset();
        this.f.reset();
        this.g.reset();
        this.h.reset();
    }

    @Override // ru.ok.android.webrtc.topology.direct.P2PNetworkStatusReporter.Calculator
    public void submitReportedBitrate(double d) {
        this.h.submit(d);
    }

    public static final class Dummy implements P2PNetworkStatusReporter.Calculator {
        @Override // ru.ok.android.webrtc.topology.direct.P2PNetworkStatusReporter.Calculator
        public double calc(double d, double d2, double d3, boolean z) {
            return 1.0d;
        }

        @Override // ru.ok.android.webrtc.topology.direct.P2PNetworkStatusReporter.Calculator
        public void reset() {
        }

        @Override // ru.ok.android.webrtc.topology.direct.P2PNetworkStatusReporter.Calculator
        public void submitReportedBitrate(double d) {
        }
    }
}
