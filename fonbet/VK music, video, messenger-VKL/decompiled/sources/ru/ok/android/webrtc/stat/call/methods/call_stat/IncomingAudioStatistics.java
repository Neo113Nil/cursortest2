package ru.ok.android.webrtc.stat.call.methods.call_stat;

import java.math.BigInteger;
import java.util.List;
import ru.ok.android.externcalls.analytics.events.EventItemsMap;
import ru.ok.android.webrtc.stat.rtc.Ssrc;
import ru.ok.android.webrtc.stat.scheme.CallStatMetric;
import ru.ok.android.webrtc.stat.utils.LongDeltaStatExt;
import xsna.j5g;
import xsna.k9x;
import xsna.swe0;
import xsna.wgz0;

/* loaded from: classes9.dex */
public final class IncomingAudioStatistics {
    public final LongDeltaStatExt a = new LongDeltaStatExt();
    public final LongDeltaStatExt b = new LongDeltaStatExt();
    public final LongDeltaStatExt c = new LongDeltaStatExt();
    public final LongDeltaStatExt d = new LongDeltaStatExt();
    public final LongDeltaStatExt e = new LongDeltaStatExt();
    public final LongDeltaStatExt f = new LongDeltaStatExt();
    public final LongDeltaStatExt g = new LongDeltaStatExt();
    public final LongDeltaStatExt h = new LongDeltaStatExt();
    public final SsrcsReset i = new SsrcsReset();

    public final void addIncomingAudioStatsForCallStat(List<Ssrc.AudioRecv> list, EventItemsMap eventItemsMap) {
        wgz0 wgz0Var = null;
        wgz0Var = null;
        wgz0Var = null;
        if (list.isEmpty()) {
            reset();
        } else {
            if (this.i.shouldReset(list)) {
                reset();
            }
            Ssrc.AudioRecv audioRecv = (Ssrc.AudioRecv) j5g.Y(list);
            Long update = this.a.update(Long.valueOf(audioRecv.totalSamplesReceived));
            if ((update == null || update.longValue() != 0) && update != null) {
                wgz0 wgz0Var2 = new wgz0();
                wgz0Var2.a = null;
                wgz0Var2.b = null;
                wgz0Var2.c = null;
                wgz0Var2.d = null;
                wgz0Var2.e = null;
                wgz0Var2.f = null;
                wgz0Var2.g = null;
                wgz0Var2.h = null;
                long longValue = update.longValue();
                if (this.b.update(Long.valueOf(audioRecv.insertedSamplesForDeceleration)) != null) {
                    wgz0Var2.a = Float.valueOf((r7.longValue() / longValue) * 1000);
                }
                long longValue2 = update.longValue();
                if (this.c.update(Long.valueOf(audioRecv.removedSamplesForAcceleration)) != null) {
                    wgz0Var2.b = Float.valueOf((r7.longValue() / longValue2) * 1000);
                }
                Long update2 = this.d.update(Long.valueOf(audioRecv.concealedSamples));
                long longValue3 = update.longValue();
                if (update2 != null) {
                    wgz0Var2.c = Float.valueOf((update2.longValue() / longValue3) * 1000);
                }
                long longValue4 = update.longValue();
                if (this.e.update(Long.valueOf(audioRecv.silentConcealedSamples)) != null) {
                    wgz0Var2.e = Float.valueOf((r0.longValue() / longValue4) * 1000);
                }
                Long update3 = this.f.update(Long.valueOf(audioRecv.concealmentEvents));
                if (update3 != null && update3.longValue() != 0 && update2 != null) {
                    wgz0Var2.f = Float.valueOf(update2.longValue() / update3.longValue());
                }
                long j = audioRecv.jitterBufferMs;
                if (j != -1) {
                    wgz0Var2.d = Long.valueOf(j);
                }
                double d = audioRecv.totalAudioEnergy;
                if (d != -1.0d) {
                    wgz0Var2.g = Long.valueOf((long) (d * 1000));
                }
                LongDeltaStatExt longDeltaStatExt = this.g;
                BigInteger bigInteger = audioRecv.packetsLost;
                Long update4 = longDeltaStatExt.update(bigInteger != null ? Long.valueOf(bigInteger.longValue()) : null);
                LongDeltaStatExt longDeltaStatExt2 = this.h;
                BigInteger bigInteger2 = audioRecv.packetsReceived;
                Long update5 = longDeltaStatExt2.update(bigInteger2 != null ? Long.valueOf(bigInteger2.longValue()) : null);
                if (update4 != null && update5 != null) {
                    if (update5.longValue() + update4.longValue() != 0) {
                        wgz0Var2.h = Integer.valueOf(swe0.h((int) ((update4.longValue() * 100) / (update5.longValue() + update4.longValue())), new k9x(0, 100, 1)));
                    }
                }
                wgz0Var = wgz0Var2;
            }
        }
        if (wgz0Var == null) {
            return;
        }
        eventItemsMap.set(CallStatMetric.InsertedAudioSamplesForDeceleration.getKey(), wgz0Var.a);
        eventItemsMap.set(CallStatMetric.RemovedAudioSamplesForAcceleration.getKey(), wgz0Var.b);
        eventItemsMap.set(CallStatMetric.ConcealedAudioSamples.getKey(), wgz0Var.c);
        eventItemsMap.set(CallStatMetric.JitterAudio.getKey(), wgz0Var.d);
        eventItemsMap.set(CallStatMetric.ConcealedSilentAudioSamples.getKey(), wgz0Var.e);
        eventItemsMap.set(CallStatMetric.ConcealmentAudioAverageSize.getKey(), wgz0Var.f);
        eventItemsMap.set(CallStatMetric.TotalAudioEnergy.getKey(), wgz0Var.g);
        eventItemsMap.set(CallStatMetric.AudioLossIn.getKey(), wgz0Var.h);
    }

    public final void reset() {
        this.a.reset();
        this.b.reset();
        this.c.reset();
        this.d.reset();
        this.e.reset();
        this.f.reset();
        this.g.reset();
        this.h.reset();
    }
}
