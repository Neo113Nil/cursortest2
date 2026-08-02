package ru.ok.android.webrtc.stat.call.methods.call_stat;

import java.math.BigInteger;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.externcalls.analytics.events.EventItemsMap;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.stat.call.methods.loss.LossStat;
import ru.ok.android.webrtc.stat.rtc.RTCStat;
import ru.ok.android.webrtc.stat.rtc.Ssrc;
import ru.ok.android.webrtc.stat.scheme.CallStatMetric;
import ru.ok.android.webrtc.stat.utils.BitrateCalc;
import ru.ok.android.webrtc.stat.utils.LongDeltaStatExt;
import xsna.epx;
import xsna.s3q0;
import xsna.swe0;

/* loaded from: classes9.dex */
public final class OutgoingVideoStatistics {

    @Deprecated
    public static final long MAX_FRAMES_ENCODED = 10000;
    public final LossStat a = new LossStat();
    public final LongDeltaStatExt b = new LongDeltaStatExt();
    public final LongDeltaStatExt c = new LongDeltaStatExt();
    public final LongDeltaStatExt d = new LongDeltaStatExt();
    public final LongDeltaStatExt e = new LongDeltaStatExt();
    public final LongDeltaStatExt f = new LongDeltaStatExt();
    public final BitrateCalc g = new BitrateCalc();
    public final BitrateCalc h = new BitrateCalc();
    public final BitrateCalc i = new BitrateCalc();
    public final SsrcsReset j = new SsrcsReset();

    public OutgoingVideoStatistics(RTCLog rTCLog) {
    }

    public final void addOutgoingVideoStatisticsForCallStat(RTCStat rTCStat, List<Ssrc.VideoSend> list, boolean z, EventItemsMap eventItemsMap) {
        Object obj;
        if (!z) {
            reset();
            return;
        }
        if (list.isEmpty()) {
            reset();
            return;
        }
        if (this.j.shouldReset(list)) {
            reset();
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (epx.f(((Ssrc.Send) obj).isMediaShare, Boolean.FALSE)) {
                    break;
                }
            }
        }
        Ssrc.VideoSend videoSend = (Ssrc.VideoSend) ((Ssrc.Send) obj);
        if (videoSend == null) {
            s3q0 s3q0Var = s3q0.a;
            reset();
            return;
        }
        eventItemsMap.set(CallStatMetric.VideoLoss.getKey(), this.a.getLoss(videoSend.packetsSent, videoSend.packetsLost));
        if (videoSend.nacksReceived != -1) {
            eventItemsMap.set(CallStatMetric.VideoNackReceived.getKey(), this.b.update(Long.valueOf(videoSend.nacksReceived)));
        }
        if (videoSend.pliReceived != -1) {
            eventItemsMap.set(CallStatMetric.VideoPliReceived.getKey(), this.c.update(Long.valueOf(videoSend.pliReceived)));
        }
        if (videoSend.firReceived != -1) {
            eventItemsMap.set(CallStatMetric.VideoFirReceived.getKey(), this.d.update(Long.valueOf(videoSend.firReceived)));
        }
        if (videoSend.adaptationChanges != -1) {
            eventItemsMap.set(CallStatMetric.VideoAdaptationChanges.getKey(), Long.valueOf(videoSend.adaptationChanges));
        }
        if (videoSend.framesEncoded != -1) {
            String key = CallStatMetric.VideoFramesEncoded.getKey();
            Long update = this.f.update(Long.valueOf(videoSend.framesEncoded));
            eventItemsMap.set(key, update != null ? Long.valueOf(swe0.i(update.longValue(), 0L, 10000L)) : null);
        }
        BigInteger bigInteger = videoSend.bytesSent;
        long longValue = bigInteger != null ? bigInteger.longValue() : 0L;
        BigInteger bigInteger2 = videoSend.retransmittedBytesSent;
        long longValue2 = bigInteger2 != null ? bigInteger2.longValue() : 0L;
        double d = 1024;
        eventItemsMap.set(CallStatMetric.VideoBrEncode.getKey(), Long.valueOf((long) (BitrateCalc.update$default(this.g, longValue - longValue2, 0L, 2, null) / d)));
        eventItemsMap.set(CallStatMetric.VideoBrTransmit.getKey(), Long.valueOf((long) (BitrateCalc.update$default(this.h, longValue, 0L, 2, null) / d)));
        eventItemsMap.set(CallStatMetric.VideoBrRetransmit.getKey(), Long.valueOf((long) (BitrateCalc.update$default(this.i, longValue2, 0L, 2, null) / d)));
    }

    public final void reset() {
        this.b.reset();
        this.c.reset();
        this.d.reset();
        this.e.reset();
        this.g.reset();
        this.h.reset();
        this.i.reset();
    }
}
