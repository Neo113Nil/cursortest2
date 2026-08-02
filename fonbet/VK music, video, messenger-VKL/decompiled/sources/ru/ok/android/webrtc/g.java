package ru.ok.android.webrtc;

import java.util.Map;
import org.webrtc.StatsReport;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.protocol.screenshare.recv.ScreenshareRecvStat;
import ru.ok.android.webrtc.stat.MediaStat;
import ru.ok.android.webrtc.stat.listener.StatListenerManager;
import ru.ok.android.webrtc.stat.rtc.CandidatePair;
import ru.ok.android.webrtc.stat.rtc.RTCStat;
import ru.ok.android.webrtc.topology.ExtendedStatsCallback;
import ru.ok.android.webrtc.topology.StatsObserver;

/* loaded from: classes9.dex */
public final class g implements StatListenerManager.ExtendedStatsObserver {
    public final /* synthetic */ Call a;

    public g(Call call) {
        this.a = call;
    }

    @Override // ru.ok.android.webrtc.stat.listener.StatListenerManager.ExtendedStatsObserver
    public final void handleStatReports(StatsReport[] statsReportArr, StatsReport[] statsReportArr2, StatsObserver.MediaTrackMapping[] mediaTrackMappingArr, Map map, Topology topology) {
        Call call = this.a;
        call.W.handle(statsReportArr2, mediaTrackMappingArr);
        call.W.updateConnectivity(call.c0, !call.K, topology.equals(Topology.SERVER), call.w0, call.h.isSessionStateEnabled());
        call.W.handleScreenshareRecv(call.c0, map);
        Long timeSinceBytesReceivedMs = call.W.getTimeSinceBytesReceivedMs(call.isAudioMixEnabled());
        if (timeSinceBytesReceivedMs != null) {
            call.J0.getStatsListenerProxy().onMediaDataReceived(timeSinceBytesReceivedMs.longValue());
        }
        if (call.J) {
            RTCStat from = RTCStat.from(statsReportArr, call.logger);
            MediaStat mediaStat = call.W.getMediaStat(call.c0.getCurrentUserParticipant());
            if (mediaStat != null) {
                CandidatePair firstActiveConnection = from.firstActiveConnection();
                call.I.notifyLocalMediaStat(mediaStat, firstActiveConnection != null ? firstActiveConnection.transport.equals("tcp") : false, from.timestamp);
            }
        }
    }

    @Override // ru.ok.android.webrtc.stat.listener.StatListenerManager.ExtendedStatsObserver
    public final void handleStatReports(ExtendedStatsCallback.ExtendedStats extendedStats) {
        Call call = this.a;
        call.W.handle(extendedStats.getRtcStat(), extendedStats.getSsrcs(), extendedStats.getMediaMappings());
        Map<CallParticipant.ParticipantId, ScreenshareRecvStat> screenshareRecvStatMap = extendedStats.getScreenshareRecvStatMap();
        call.W.updateConnectivity(call.c0, !call.K, extendedStats.getTopology().getIdentity().equals(Topology.SERVER), call.w0, call.h.isSessionStateEnabled());
        call.W.handleScreenshareRecv(call.c0, screenshareRecvStatMap);
        Long timeSinceBytesReceivedMs = call.W.getTimeSinceBytesReceivedMs(call.isAudioMixEnabled());
        if (timeSinceBytesReceivedMs != null) {
            call.J0.getStatsListenerProxy().onMediaDataReceived(timeSinceBytesReceivedMs.longValue());
        }
        if (call.J) {
            RTCStat rtcStat = extendedStats.getRtcStat();
            MediaStat mediaStat = call.W.getMediaStat(call.c0.getCurrentUserParticipant());
            if (mediaStat != null) {
                CandidatePair firstActiveConnection = rtcStat.firstActiveConnection();
                call.I.notifyLocalMediaStat(mediaStat, firstActiveConnection != null ? firstActiveConnection.transport.equals("tcp") : false, rtcStat.timestamp);
            }
        }
    }
}
