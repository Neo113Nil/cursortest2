package ru.ok.android.webrtc.topology.direct;

import android.os.SystemClock;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.core.w;
import io.reactivex.rxjava3.core.x;
import io.reactivex.rxjava3.core.y;
import io.reactivex.rxjava3.disposables.c;
import io.reactivex.rxjava3.internal.operators.observable.o0;
import io.reactivex.rxjava3.internal.operators.single.b;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Ref$LongRef;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.connection.BadNetworkIndicatorConfig;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import ru.ok.android.webrtc.stat.call.methods.call_stat.SsrcsReset;
import ru.ok.android.webrtc.stat.listener.mapper.WebRTCToInternalStatsMapper;
import ru.ok.android.webrtc.stat.rtc.CandidatePair;
import ru.ok.android.webrtc.stat.rtc.RTCStat;
import ru.ok.android.webrtc.stat.rtc.Ssrc;
import ru.ok.android.webrtc.stat.rtc.SsrcUtils;
import ru.ok.android.webrtc.stat.utils.BitrateCalc;
import ru.ok.android.webrtc.stat.utils.LossCalc;
import ru.ok.android.webrtc.topology.StatsCallback;
import ru.ok.android.webrtc.topology.direct.P2PNetworkStatusReporter;
import xsna.b9m;
import xsna.cfz;
import xsna.epx;
import xsna.izs;
import xsna.j5g;
import xsna.k8;
import xsna.lby;
import xsna.m6a;
import xsna.p8z0;
import xsna.s3q0;
import xsna.w9z0;
import xsna.zcl;

/* loaded from: classes9.dex */
public final class P2PNetworkStatusReporter {
    public static final Companion Companion = new Companion(null);
    public final ReportNetworkStatusConfig a;
    public final Calculator b;
    public final RTCLog c;
    public final izs d;
    public final izs e;
    public final izs f;
    public volatile c g;
    public volatile w h;
    public long j;
    public double l;
    public double m;
    public double i = 1.0d;
    public final SsrcsReset k = new SsrcsReset();
    public final LossCalc n = new LossCalc();
    public final BitrateCalc o = new BitrateCalc();
    public final BitrateCalc p = new BitrateCalc();

    public interface Calculator {
        double calc(double d, double d2, double d3, boolean z);

        void reset();

        void submitReportedBitrate(double d);
    }

    public static final class Companion {
        public Companion(zcl zclVar) {
        }

        public static final s3q0 a(BadNetworkIndicatorConfig badNetworkIndicatorConfig, RTCLog rTCLog, String str) {
            badNetworkIndicatorConfig.getDebugLoggingConfig().log(rTCLog, "P2PNetworkStatusReporter", str);
            return s3q0.a;
        }

        public final P2PNetworkStatusReporter create(BadNetworkIndicatorConfig badNetworkIndicatorConfig, RTCLog rTCLog, izs<? super StatsCallback, s3q0> izsVar, izs<? super Double, s3q0> izsVar2) {
            ReportNetworkStatusConfig reportNetworkStatusConfig;
            if (badNetworkIndicatorConfig == null || (reportNetworkStatusConfig = badNetworkIndicatorConfig.getReportNetworkStatusConfig()) == null) {
                return null;
            }
            k8 k8Var = new k8(26, badNetworkIndicatorConfig, rTCLog);
            return new P2PNetworkStatusReporter(reportNetworkStatusConfig, P2PNetworkStatusCalculator.Companion.create(badNetworkIndicatorConfig.getCalcNetworkStatusConfig(), k8Var), rTCLog, izsVar, izsVar2, k8Var, null);
        }
    }

    public P2PNetworkStatusReporter(ReportNetworkStatusConfig reportNetworkStatusConfig, Calculator calculator, RTCLog rTCLog, izs izsVar, izs izsVar2, izs izsVar3, zcl zclVar) {
        this.a = reportNetworkStatusConfig;
        this.b = calculator;
        this.c = rTCLog;
        this.d = izsVar;
        this.e = izsVar2;
        this.f = izsVar3;
    }

    public static final void a(P2PNetworkStatusReporter p2PNetworkStatusReporter, double d) {
        p2PNetworkStatusReporter.b.submitReportedBitrate(d);
    }

    public static final boolean access$shouldSubmitNetworkStatus(P2PNetworkStatusReporter p2PNetworkStatusReporter, double d) {
        p2PNetworkStatusReporter.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = d > p2PNetworkStatusReporter.a.getNetworkStatusReportThreshold();
        boolean z2 = elapsedRealtime - p2PNetworkStatusReporter.j > ((long) p2PNetworkStatusReporter.a.getNetworkStatusReportForceIntervalMs());
        if (!z && !z2) {
            return false;
        }
        p2PNetworkStatusReporter.j = elapsedRealtime;
        return true;
    }

    public static final P2PNetworkStatusReporter create(BadNetworkIndicatorConfig badNetworkIndicatorConfig, RTCLog rTCLog, izs<? super StatsCallback, s3q0> izsVar, izs<? super Double, s3q0> izsVar2) {
        return Companion.create(badNetworkIndicatorConfig, rTCLog, izsVar, izsVar2);
    }

    public final void start(w wVar) {
        this.f.invoke("start reporter");
        c cVar = this.g;
        if (cVar != null) {
            cVar.dispose();
        }
        this.h = wVar;
        this.g = new o0(q.R(this.a.getNetworkStatusReportIntervalMs(), TimeUnit.MILLISECONDS).a0(wVar), new m6a(this)).U(new b9m(this)).subscribe(new p8z0(this), new w9z0(this));
    }

    public final void stop() {
        this.f.invoke("stop reporter");
        c cVar = this.g;
        if (cVar != null) {
            cVar.dispose();
        }
        this.g = null;
        this.h = null;
    }

    public final void submitBitrate(final double d) {
        this.f.invoke("submit bitrate: " + d);
        w wVar = this.h;
        if (wVar != null) {
            wVar.c(new Runnable() { // from class: xsna.k690
                @Override // java.lang.Runnable
                public final void run() {
                    P2PNetworkStatusReporter.a(P2PNetworkStatusReporter.this, d);
                }
            });
        }
    }

    public final x a() {
        return new b(new cfz(this, 7));
    }

    public static final void a(final P2PNetworkStatusReporter p2PNetworkStatusReporter, final y yVar) {
        p2PNetworkStatusReporter.d.invoke(new StatsCallback() { // from class: ru.ok.android.webrtc.topology.direct.P2PNetworkStatusReporter$getStatsObservable$1$1
            @Override // ru.ok.android.webrtc.topology.StatsCallback
            public void onStatsReady(StatsCallback.Stats stats) {
                RTCLog rTCLog;
                y yVar2 = y.this;
                rTCLog = p2PNetworkStatusReporter.c;
                yVar2.onSuccess(new WebRTCToInternalStatsMapper(rTCLog).transform(stats));
            }
        });
    }

    public final double a(RTCStat rTCStat) {
        double d;
        BigInteger bigInteger;
        BigInteger bigInteger2;
        Double d2;
        boolean shouldReset = this.k.shouldReset(rTCStat.ssrcs);
        double d3 = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
        if (shouldReset) {
            this.f.invoke("reset state");
            this.b.reset();
            this.l = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
            this.n.reset();
            this.m = Double.NaN;
            this.o.reset();
            this.p.reset();
        }
        CandidatePair firstActiveConnection = rTCStat.firstActiveConnection();
        Long l = null;
        boolean f = epx.f(firstActiveConnection != null ? firstActiveConnection.transport : null, "tcp");
        CandidatePair firstActiveConnection2 = rTCStat.firstActiveConnection();
        if (firstActiveConnection2 != null && (d2 = firstActiveConnection2.rtt) != null) {
            d3 = d2.doubleValue() / TimeUnit.SECONDS.toMillis(1L);
        }
        double d4 = d3;
        double a = a(rTCStat.ssrcs);
        List<Ssrc> list = rTCStat.ssrcs;
        Ssrc.VideoRecv videoRecv = (Ssrc.VideoRecv) j5g.a0(SsrcUtils.incomingVideo(list));
        Long valueOf = (videoRecv == null || (bigInteger2 = videoRecv.bytesReceived) == null) ? null : Long.valueOf(bigInteger2.longValue());
        Ssrc.AudioRecv audioRecv = (Ssrc.AudioRecv) j5g.a0(SsrcUtils.incomingAudio(list));
        if (audioRecv != null && (bigInteger = audioRecv.bytesReceived) != null) {
            l = Long.valueOf(bigInteger.longValue());
        }
        if (valueOf == null) {
            d = this.m;
        } else if (l != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            d = this.p.update(valueOf.longValue(), elapsedRealtime) + this.o.update(l.longValue(), elapsedRealtime);
            this.m = d;
        } else {
            d = this.m;
        }
        double d5 = d;
        double calc = this.b.calc(d4, a, d5, f);
        izs izsVar = this.f;
        StringBuilder a2 = lby.a("calc result: ", calc, " for: rtt=");
        a2.append(d4);
        com.vk.movika.sdk.android.defaultplayer.view.a.a(a2, ", loss=", a, ", bitrate=");
        a2.append(d5);
        a2.append(" isTCP=");
        a2.append(f);
        izsVar.invoke(a2.toString());
        return calc;
    }

    public final double a(List list) {
        Ssrc.Pack split = SsrcUtils.split(list);
        if (split.incomingAudio.isEmpty() && split.incomingVideo.isEmpty() && split.outgoingVideo.isEmpty() && split.outgoingAudio.isEmpty()) {
            return this.l;
        }
        Ref$LongRef ref$LongRef = new Ref$LongRef();
        Ref$LongRef ref$LongRef2 = new Ref$LongRef();
        Iterator<T> it = split.incomingAudio.iterator();
        while (it.hasNext()) {
            a(ref$LongRef, ref$LongRef2, (Ssrc.Recv) it.next());
        }
        Iterator<T> it2 = split.incomingVideo.iterator();
        while (it2.hasNext()) {
            a(ref$LongRef, ref$LongRef2, (Ssrc.Recv) it2.next());
        }
        Iterator<T> it3 = split.outgoingAudio.iterator();
        while (it3.hasNext()) {
            a(ref$LongRef, ref$LongRef2, (Ssrc.Send) it3.next());
        }
        Iterator<T> it4 = split.outgoingVideo.iterator();
        while (it4.hasNext()) {
            a(ref$LongRef, ref$LongRef2, (Ssrc.Send) it4.next());
        }
        long j = ref$LongRef2.element;
        if (j != 0) {
            long j2 = ref$LongRef.element;
            if (j2 != 0) {
                double update = this.n.update(j, j2);
                this.l = update;
                return update;
            }
        }
        this.l = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
        return ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
    }

    public static final s3q0 a(Ref$LongRef ref$LongRef, Ref$LongRef ref$LongRef2, Ssrc.Recv recv) {
        long j = ref$LongRef.element;
        BigInteger bigInteger = recv.packetsReceived;
        ref$LongRef.element = j + (bigInteger != null ? bigInteger.longValue() : 0L);
        long j2 = ref$LongRef2.element;
        BigInteger bigInteger2 = recv.packetsLost;
        ref$LongRef2.element = j2 + (bigInteger2 != null ? bigInteger2.longValue() : 0L);
        return s3q0.a;
    }

    public static final s3q0 a(Ref$LongRef ref$LongRef, Ref$LongRef ref$LongRef2, Ssrc.Send send) {
        long j = ref$LongRef.element;
        BigInteger bigInteger = send.packetsSent;
        ref$LongRef.element = j + (bigInteger != null ? bigInteger.longValue() : 0L);
        long j2 = ref$LongRef2.element;
        BigInteger bigInteger2 = send.packetsLost;
        ref$LongRef2.element = j2 + (bigInteger2 != null ? bigInteger2.longValue() : 0L);
        return s3q0.a;
    }
}
