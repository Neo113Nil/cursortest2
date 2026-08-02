package ru.ok.android.webrtc.stat.call.methods;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import ru.ok.android.annotation.CallInternalApi;
import ru.ok.android.externcalls.analytics.events.EventItemsMap;
import ru.ok.android.externcalls.analytics.events.SdkIntervalStatEvent;
import ru.ok.android.webrtc.CallParams;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.protocol.screenshare.recv.ScreenshareRecvStat;
import ru.ok.android.webrtc.stat.CallAnalytics;
import ru.ok.android.webrtc.stat.call.methods.call_stat.ConnectionStatistics;
import ru.ok.android.webrtc.stat.call.methods.call_stat.ConversationInfoStatistics;
import ru.ok.android.webrtc.stat.call.methods.call_stat.FeatureEnabledStatistics;
import ru.ok.android.webrtc.stat.call.methods.call_stat.HardwareUsageStatistics;
import ru.ok.android.webrtc.stat.call.methods.call_stat.IncomingAudioStatistics;
import ru.ok.android.webrtc.stat.call.methods.call_stat.IncomingScreenshareStatistics;
import ru.ok.android.webrtc.stat.call.methods.call_stat.IncomingVideoStatistics;
import ru.ok.android.webrtc.stat.call.methods.call_stat.NetworkInfoStatistics;
import ru.ok.android.webrtc.stat.call.methods.call_stat.OutgoingAudioStatistics;
import ru.ok.android.webrtc.stat.call.methods.call_stat.OutgoingVideoStatistics;
import ru.ok.android.webrtc.stat.call.methods.call_stat.TopologyStatistics;
import ru.ok.android.webrtc.stat.call.time.CallStatTimeDelta;
import ru.ok.android.webrtc.stat.call.time.TimeDelta;
import ru.ok.android.webrtc.stat.cpu.CpuInfo;
import ru.ok.android.webrtc.stat.cpu.ram.MemoryInfo;
import ru.ok.android.webrtc.stat.rtc.CandidatePair;
import ru.ok.android.webrtc.stat.rtc.RTCStat;
import ru.ok.android.webrtc.stat.rtc.Ssrc;
import ru.ok.android.webrtc.stat.rtc.SsrcUtils;
import ru.ok.android.webrtc.stat.scheme.CallStatMetric;
import ru.ok.android.webrtc.stat.scheme.StatCustomFieldKey;
import ru.ok.android.webrtc.utils.TopologyProvider;
import ru.ok.android.webrtc.utils.time.TimeProvider;
import xsna.c5g;
import xsna.j5g;
import xsna.zrp;

@CallInternalApi
/* loaded from: classes9.dex */
public final class CallStatLog {
    public static final Set p;
    public final CallAnalytics a;
    public final RTCLog b;
    public final TopologyStatistics c;
    public final ConnectionStatistics d;
    public final ConversationInfoStatistics e;
    public final NetworkInfoStatistics f;
    public final TimeProvider g;
    public final IncomingVideoStatistics j;
    public final OutgoingVideoStatistics k;
    public final OutgoingAudioStatistics l;
    public final FeatureEnabledStatistics o;
    public final TimeDelta h = new TimeDelta();
    public final IncomingAudioStatistics i = new IncomingAudioStatistics();
    public final IncomingScreenshareStatistics m = new IncomingScreenshareStatistics();
    public final HardwareUsageStatistics n = new HardwareUsageStatistics();

    static {
        zrp<CallStatMetric> entries = CallStatMetric.getEntries();
        ArrayList arrayList = new ArrayList(c5g.u(entries, 10));
        Iterator<E> it = entries.iterator();
        while (it.hasNext()) {
            arrayList.add(((CallStatMetric) it.next()).getKey());
        }
        p = j5g.S0(arrayList);
    }

    public CallStatLog(CallAnalytics callAnalytics, RTCLog rTCLog, TopologyStatistics topologyStatistics, ConnectionStatistics connectionStatistics, ConversationInfoStatistics conversationInfoStatistics, NetworkInfoStatistics networkInfoStatistics, TimeProvider timeProvider, CallParams callParams, TopologyProvider topologyProvider) {
        this.a = callAnalytics;
        this.b = rTCLog;
        this.c = topologyStatistics;
        this.d = connectionStatistics;
        this.e = conversationInfoStatistics;
        this.f = networkInfoStatistics;
        this.g = timeProvider;
        this.j = new IncomingVideoStatistics(callParams.getExperiments().O(), rTCLog);
        this.k = new OutgoingVideoStatistics(rTCLog);
        this.l = new OutgoingAudioStatistics(rTCLog);
        this.o = new FeatureEnabledStatistics(callParams.getExperiments().h().h(), topologyProvider);
    }

    public final void logStatReport(RTCStat rTCStat, Map<CallParticipant.ParticipantId, ? extends ScreenshareRecvStat> map, boolean z, boolean z2, CpuInfo cpuInfo, MemoryInfo memoryInfo) {
        Long timeDeltaMs = this.h.getTimeDeltaMs();
        if (timeDeltaMs != null) {
            long longValue = timeDeltaMs.longValue();
            if (!CallStatTimeDelta.INSTANCE.checkMeasuredTimeInRange(longValue)) {
                reset();
                return;
            }
            EventItemsMap eventItemsMap = new EventItemsMap();
            this.e.addStats(eventItemsMap);
            this.f.addStats(eventItemsMap);
            this.o.addStats(eventItemsMap);
            eventItemsMap.set(StatCustomFieldKey.STAT_TIME_DELTA, String.valueOf(longValue));
            CandidatePair firstActiveConnection = rTCStat.firstActiveConnection();
            if (firstActiveConnection != null) {
                this.d.addStats(eventItemsMap, firstActiveConnection);
                Ssrc.Pack split = SsrcUtils.split(SsrcUtils.ssrcForConnection(rTCStat.ssrcs, firstActiveConnection));
                this.k.addOutgoingVideoStatisticsForCallStat(rTCStat, split.outgoingVideo, z2, eventItemsMap);
                this.j.addIncomingVideoStatisticsForCallStat(split.incomingVideo, eventItemsMap);
                this.l.addOutgoingAudioStatsForCallStat(z, split.outgoingAudio, eventItemsMap);
                this.i.addIncomingAudioStatsForCallStat(split.incomingAudio, eventItemsMap);
            }
            this.c.addStats(eventItemsMap);
            this.m.addIncomingScreenshareStatisticsForCallStat(map, eventItemsMap);
            this.n.addStats(cpuInfo, memoryInfo, eventItemsMap);
            Long serverTimeMs = this.g.getServerTimeMs();
            if (serverTimeMs != null) {
                eventItemsMap.set("timestamp", serverTimeMs);
                Set<String> keySet = eventItemsMap.getItems().keySet();
                if ((keySet instanceof Collection) && keySet.isEmpty()) {
                    return;
                }
                Iterator<T> it = keySet.iterator();
                while (it.hasNext()) {
                    if (p.contains((String) it.next())) {
                        SdkIntervalStatEvent.Builder builder = new SdkIntervalStatEvent.Builder();
                        builder.addAll(eventItemsMap);
                        SdkIntervalStatEvent build = builder.build();
                        this.b.log("CallStatLog", "callStat: " + build.getItems());
                        this.a.getAnalyticsSender().send(build);
                        return;
                    }
                }
            }
        }
    }

    public final void reset() {
        this.i.reset();
        this.j.reset();
        this.l.reset();
        this.k.reset();
        this.m.reset();
    }
}
