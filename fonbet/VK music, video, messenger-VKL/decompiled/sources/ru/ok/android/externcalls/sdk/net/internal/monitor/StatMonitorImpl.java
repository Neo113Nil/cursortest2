package ru.ok.android.externcalls.sdk.net.internal.monitor;

import com.unity3d.services.UnityAdsConstants;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.operators.observable.z0;
import io.reactivex.rxjava3.subjects.d;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.stat.rtc.CandidatePair;
import ru.ok.android.webrtc.stat.rtc.RTCStat;
import ru.ok.android.webrtc.stat.rtc.Ssrc;
import ru.ok.android.webrtc.stat.rtc.SsrcUtils;
import ru.ok.android.webrtc.stat.utils.LossCalc;
import xsna.an10;
import xsna.epx;
import xsna.swe0;
import xsna.zcl;

/* compiled from: StatMonitorImpl.kt */
/* loaded from: classes9.dex */
public final class StatMonitorImpl implements StatMonitor {
    public static final Companion Companion = new Companion(null);
    private static final String LOG_TAG = "StatMonitorImpl";
    private final RTCLog logger;
    private final d<NetworkStat> statSubject = d.N0();
    private final LossCalculator audioLossCalculator = new LossCalculator();
    private final LossCalculator videoLossCalculator = new LossCalculator();

    /* compiled from: StatMonitorImpl.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: StatMonitorImpl.kt */
    public final class LossCalculator {
        private final LossCalc lossCalc = new LossCalc();

        public LossCalculator() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Float calculateLoss(BigInteger bigInteger, BigInteger bigInteger2) {
            if (bigInteger2 == null || bigInteger == null) {
                return null;
            }
            return Float.valueOf(round(swe0.f((float) this.lossCalc.update(bigInteger.longValue(), bigInteger2.longValue()), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f)));
        }

        private final <T extends Ssrc.Send> T findSender(List<? extends Ssrc> list) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            Object obj = null;
            if (it.hasNext()) {
                it.next();
                epx.k();
                throw null;
            }
            RTCLog unused = StatMonitorImpl.this.logger;
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (epx.f(((Ssrc.Send) next).isMediaShare, Boolean.FALSE)) {
                    obj = next;
                    break;
                }
            }
            return (T) obj;
        }

        private final float round(float f) {
            return an10.b(f * 100.0f) / 100.0f;
        }

        public final <T extends Ssrc.Send> Float getLoss(List<? extends Ssrc> list) {
            Object obj;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            if (it.hasNext()) {
                it.next();
                epx.k();
                throw null;
            }
            RTCLog unused = StatMonitorImpl.this.logger;
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (epx.f(((Ssrc.Send) obj).isMediaShare, Boolean.FALSE)) {
                    break;
                }
            }
            Ssrc.Send send = (Ssrc.Send) obj;
            if (send != null) {
                return calculateLoss(send.packetsLost, send.packetsSent);
            }
            return null;
        }
    }

    public StatMonitorImpl(RTCLog rTCLog) {
        this.logger = rTCLog;
    }

    private final NetworkStat mapToMonitoringStat(RTCStat rTCStat) {
        Object obj;
        Object obj2;
        CandidatePair firstActiveConnection = rTCStat.firstActiveConnection();
        if (firstActiveConnection == null) {
            return new NetworkStat(null, null, null, null, 15, null);
        }
        Double d = firstActiveConnection.rtt;
        Integer valueOf = d != null ? Integer.valueOf(an10.a(d.doubleValue())) : null;
        List ssrcForConnection = SsrcUtils.ssrcForConnection(rTCStat.ssrcs, firstActiveConnection);
        LossCalculator lossCalculator = this.audioLossCalculator;
        List list = ssrcForConnection;
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : list) {
            if (obj3 instanceof Ssrc.AudioSend) {
                arrayList.add(obj3);
            }
        }
        RTCLog unused = StatMonitorImpl.this.logger;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (epx.f(((Ssrc.Send) obj).isMediaShare, Boolean.FALSE)) {
                break;
            }
        }
        Ssrc.Send send = (Ssrc.Send) obj;
        Float calculateLoss = send == null ? null : lossCalculator.calculateLoss(send.packetsLost, send.packetsSent);
        LossCalculator lossCalculator2 = this.videoLossCalculator;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj4 : list) {
            if (obj4 instanceof Ssrc.VideoSend) {
                arrayList2.add(obj4);
            }
        }
        RTCLog unused2 = StatMonitorImpl.this.logger;
        Iterator it2 = arrayList2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            if (epx.f(((Ssrc.Send) obj2).isMediaShare, Boolean.FALSE)) {
                break;
            }
        }
        Ssrc.Send send2 = (Ssrc.Send) obj2;
        NetworkStat networkStat = new NetworkStat(valueOf, calculateLoss, send2 != null ? lossCalculator2.calculateLoss(send2.packetsLost, send2.packetsSent) : null, firstActiveConnection.localCandidateType);
        this.logger.log(LOG_TAG, "measured stat: " + networkStat);
        return networkStat;
    }

    @Override // ru.ok.android.externcalls.sdk.net.internal.monitor.StatMonitor
    public q<NetworkStat> observeStat() {
        d<NetworkStat> dVar = this.statSubject;
        dVar.getClass();
        return new z0(dVar);
    }

    @Override // ru.ok.android.webrtc.listeners.CallRtcStatsListener
    public void onRtcStats(RTCStat rTCStat) {
        NetworkStat mapToMonitoringStat = mapToMonitoringStat(rTCStat);
        if (mapToMonitoringStat != null) {
            this.statSubject.onNext(mapToMonitoringStat);
        }
    }
}
