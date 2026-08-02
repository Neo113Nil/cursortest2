package ru.ok.android.webrtc.stat.call.methods.call_stat;

import java.math.BigInteger;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.externcalls.analytics.events.EventItemsMap;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.stat.call.methods.loss.LossStat;
import ru.ok.android.webrtc.stat.rtc.Ssrc;
import ru.ok.android.webrtc.stat.scheme.CallStatMetric;
import ru.ok.android.webrtc.stat.utils.LongDeltaStatExt;
import xsna.b4z0;
import xsna.epx;
import xsna.j5g;
import xsna.zcl;

/* loaded from: classes9.dex */
public final class OutgoingAudioStatistics {
    public static final int AUDIO_LEVEL_MULTIPLIER_FOR_BACKEND = 32767;
    public static final Companion Companion = new Companion(null);
    public final LossStat a = new LossStat();
    public final SsrcsReset b = new SsrcsReset();
    public final LossStat c = new LossStat();
    public final LongDeltaStatExt d = new LongDeltaStatExt();
    public final LongDeltaStatExt e = new LongDeltaStatExt();

    public static final class Companion {
        public Companion(zcl zclVar) {
        }
    }

    public OutgoingAudioStatistics(RTCLog rTCLog) {
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void addOutgoingAudioStatsForCallStat(boolean z, List<Ssrc.AudioSend> list, EventItemsMap eventItemsMap) {
        Object obj;
        b4z0 b4z0Var;
        long j;
        Long l;
        Long l2;
        if (!z) {
            reset();
        } else if (list.isEmpty()) {
            reset();
        } else {
            if (this.b.shouldReset(list)) {
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
            Ssrc.AudioSend audioSend = (Ssrc.AudioSend) ((Ssrc.Send) obj);
            if (audioSend != null) {
                Integer loss = this.a.getLoss(audioSend.packetsSent, audioSend.packetsLost);
                Ssrc.AudioSend audioSend2 = (Ssrc.AudioSend) j5g.a0(list);
                Integer valueOf = audioSend2 != null ? Integer.valueOf((int) (audioSend2.getAudioLevel() * AUDIO_LEVEL_MULTIPLIER_FOR_BACKEND)) : null;
                LongDeltaStatExt longDeltaStatExt = this.e;
                BigInteger bigInteger = audioSend.headerBytesSent;
                Long update = longDeltaStatExt.update(bigInteger != null ? Long.valueOf(bigInteger.longValue()) : null);
                LongDeltaStatExt longDeltaStatExt2 = this.d;
                BigInteger bigInteger2 = audioSend.bytesSent;
                b4z0Var = new b4z0(loss, valueOf, update, longDeltaStatExt2.update(bigInteger2 != null ? Long.valueOf(bigInteger2.longValue()) : null));
                eventItemsMap.set(CallStatMetric.AudioLoss.getKey(), b4z0Var == null ? b4z0Var.a : null);
                eventItemsMap.set(CallStatMetric.AudioLevel.getKey(), b4z0Var != null ? b4z0Var.b : null);
                j = 0;
                long longValue = (b4z0Var != null || (l2 = b4z0Var.c) == null) ? 0L : l2.longValue();
                if (b4z0Var != null && (l = b4z0Var.d) != null) {
                    j = l.longValue();
                }
                eventItemsMap.set(CallStatMetric.AudioBytesSent.getKey(), Long.valueOf(longValue + j));
            }
        }
        b4z0Var = null;
        eventItemsMap.set(CallStatMetric.AudioLoss.getKey(), b4z0Var == null ? b4z0Var.a : null);
        eventItemsMap.set(CallStatMetric.AudioLevel.getKey(), b4z0Var != null ? b4z0Var.b : null);
        j = 0;
        if (b4z0Var != null) {
        }
        if (b4z0Var != null) {
            j = l.longValue();
        }
        eventItemsMap.set(CallStatMetric.AudioBytesSent.getKey(), Long.valueOf(longValue + j));
    }

    public final void reset() {
        this.c.reset();
        this.d.reset();
        this.e.reset();
    }
}
