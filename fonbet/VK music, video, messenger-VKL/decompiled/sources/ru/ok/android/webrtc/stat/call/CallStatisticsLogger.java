package ru.ok.android.webrtc.stat.call;

import java.util.Map;
import ru.ok.android.annotation.CallInternalApi;
import ru.ok.android.external.sdk.TopologyChangedListener;
import ru.ok.android.externcalls.analytics.events.EventItemsMap;
import ru.ok.android.webrtc.Topology;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.protocol.screenshare.recv.ScreenshareRecvStat;
import ru.ok.android.webrtc.stat.CallAnalytics;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import ru.ok.android.webrtc.stat.call.methods.CallStatLog;
import ru.ok.android.webrtc.stat.call.methods.battery.CallBatteryStatSender;
import ru.ok.android.webrtc.stat.call.methods.battery.CallBatteryStatSenderImpl;
import ru.ok.android.webrtc.stat.call.methods.call_stat.ConnectionStatistics;
import ru.ok.android.webrtc.stat.call.methods.call_stat.ConversationInfoStatistics;
import ru.ok.android.webrtc.stat.call.methods.call_stat.NetworkInfoStatistics;
import ru.ok.android.webrtc.stat.call.methods.call_stat.TopologyStatistics;
import ru.ok.android.webrtc.stat.call.methods.eventual.CallEventualStatSender;
import ru.ok.android.webrtc.stat.call.methods.eventual.CallEventualStatSenderImpl;
import ru.ok.android.webrtc.stat.codec.ActiveEncodersStats;
import ru.ok.android.webrtc.stat.cpu.HardwareInfoPeriodicRetriever;
import ru.ok.android.webrtc.stat.data.FirstDataSentStat;
import ru.ok.android.webrtc.stat.rtc.CandidatePair;
import ru.ok.android.webrtc.stat.rtc.RTCStat;
import xsna.zcl;

@CallInternalApi
/* loaded from: classes9.dex */
public final class CallStatisticsLogger implements TopologyChangedListener {
    public static final Companion Companion = new Companion(null);
    public final CallAnalytics a;
    public final TopologyStatistics b;
    public final ConnectionStatistics c;
    public final ConversationInfoStatistics d;
    public final NetworkInfoStatistics e;
    public final CallStatLog f;
    public final HardwareInfoPeriodicRetriever g;
    public final CallEventualStatSenderImpl h;
    public final ConnectivityTracker i;
    public final CallBatteryStatSenderImpl j;
    public final FirstDataSentStat k;
    public final ActiveEncodersStats l;

    public static final class Companion {
        public Companion(zcl zclVar) {
        }
    }

    public CallStatisticsLogger(CallAnalytics callAnalytics, TopologyStatistics topologyStatistics, ConnectionStatistics connectionStatistics, ConversationInfoStatistics conversationInfoStatistics, NetworkInfoStatistics networkInfoStatistics, CallStatLog callStatLog, HardwareInfoPeriodicRetriever hardwareInfoPeriodicRetriever, CallEventualStatSenderImpl callEventualStatSenderImpl, ConnectivityTracker connectivityTracker, CallBatteryStatSenderImpl callBatteryStatSenderImpl, FirstDataSentStat firstDataSentStat, ActiveEncodersStats activeEncodersStats) {
        this.a = callAnalytics;
        this.b = topologyStatistics;
        this.c = connectionStatistics;
        this.d = conversationInfoStatistics;
        this.e = networkInfoStatistics;
        this.f = callStatLog;
        this.g = hardwareInfoPeriodicRetriever;
        this.h = callEventualStatSenderImpl;
        this.i = connectivityTracker;
        this.j = callBatteryStatSenderImpl;
        this.k = firstDataSentStat;
        this.l = activeEncodersStats;
        hardwareInfoPeriodicRetriever.start(5000L, 1000L);
    }

    public final ActiveEncodersStats getActiveEncodersStats() {
        return this.l;
    }

    public final CallBatteryStatSender getCallBatteryStatSender() {
        return this.j;
    }

    public final CallEventualStatSender getCallEventualStatSender() {
        return this.h;
    }

    public final void logStatReport(RTCStat rTCStat, Map<CallParticipant.ParticipantId, ? extends ScreenshareRecvStat> map, boolean z, boolean z2) {
        if (this.i.isPeerConnectionConnected()) {
            this.f.logStatReport(rTCStat, map, z, z2, this.g.getCpuInfo(), this.g.getMemoryInfo());
        }
    }

    public final void onPeerConnectionConnected(boolean z) {
        this.i.onPeerConnectionConnectedChange(z);
    }

    public final void onRtcStats(RTCStat rTCStat) {
        EventItemsMap eventItemsMap;
        CandidatePair firstActiveConnection = rTCStat.firstActiveConnection();
        if (firstActiveConnection == null) {
            eventItemsMap = null;
        } else {
            EventItemsMap eventItemsMap2 = new EventItemsMap();
            this.c.addStats(eventItemsMap2, firstActiveConnection);
            this.b.addStats(eventItemsMap2);
            this.d.addStats(eventItemsMap2);
            this.e.addStats(eventItemsMap2);
            eventItemsMap = eventItemsMap2;
        }
        if (eventItemsMap == null) {
            return;
        }
        this.j.onRtcStats(eventItemsMap);
        this.h.onRtcStats(eventItemsMap);
        this.l.onRTCStat(rTCStat);
        this.i.onRtcStats(rTCStat);
        this.k.onRtcStats(rTCStat);
    }

    public final void onSignalingConnected(boolean z) {
        this.i.onSignalingConnectedChange(z);
    }

    @Override // ru.ok.android.external.sdk.TopologyChangedListener
    public void onTopologyUpdated(Topology topology, Topology topology2) {
        this.h.onTopologyUpdated(topology, topology2);
    }

    public final void release() {
        this.a.release();
        this.g.stop();
        getCallEventualStatSender().notifyCallEnded();
    }

    public final void reset() {
        this.f.reset();
    }
}
