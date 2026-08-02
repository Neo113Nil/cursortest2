package ru.ok.android.webrtc.stat.call.methods.call_stat;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptySet;
import ru.ok.android.externcalls.analytics.events.EventItemsMap;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.protocol.screenshare.recv.ScreenshareRecvStat;
import ru.ok.android.webrtc.stat.scheme.CallStatMetric;
import ru.ok.android.webrtc.stat.utils.LongDeltaStatExt;
import xsna.epx;
import xsna.jge0;

/* loaded from: classes9.dex */
public final class IncomingScreenshareStatistics {
    public final LongDeltaStatExt a = new LongDeltaStatExt();
    public final LongDeltaStatExt b = new LongDeltaStatExt();
    public Set c = EmptySet.b;

    public final void addIncomingScreenshareStatisticsForCallStat(Map<CallParticipant.ParticipantId, ? extends ScreenshareRecvStat> map, EventItemsMap eventItemsMap) {
        jge0 jge0Var;
        if (map == null || map.isEmpty()) {
            reset();
            jge0Var = null;
        } else {
            Set<CallParticipant.ParticipantId> keySet = map.keySet();
            if (!epx.f(this.c, keySet)) {
                reset();
                this.c = keySet;
            }
            Iterator<T> it = map.values().iterator();
            int i = 0;
            while (it.hasNext()) {
                i += ((ScreenshareRecvStat) it.next()).freeze.getFreezeCount();
            }
            long j = i;
            Iterator<T> it2 = map.values().iterator();
            long j2 = 0;
            while (it2.hasNext()) {
                j2 += ((ScreenshareRecvStat) it2.next()).freeze.getTotalFreezeDuration();
            }
            jge0Var = new jge0(this.a.update(Long.valueOf(j)), this.b.update(Long.valueOf(j2)));
        }
        if (jge0Var == null) {
            return;
        }
        Long l = (Long) jge0Var.c;
        eventItemsMap.set(CallStatMetric.ScreenShareFreezeCount.getKey(), (Long) jge0Var.b);
        if (l != null && l.longValue() == 0) {
            return;
        }
        eventItemsMap.set(CallStatMetric.ScreenShareFreezeDuration.getKey(), l);
    }

    public final void reset() {
        this.a.reset();
        this.b.reset();
    }
}
