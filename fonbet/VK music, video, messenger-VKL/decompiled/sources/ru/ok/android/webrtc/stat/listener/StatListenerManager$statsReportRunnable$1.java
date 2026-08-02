package ru.ok.android.webrtc.stat.listener;

import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.webrtc.StatsReport;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.RTCStatsObserver;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.protocol.screenshare.recv.ScreenshareRecvStat;
import ru.ok.android.webrtc.stat.listener.StatListenerManager;
import ru.ok.android.webrtc.stat.rtc.RTCStat;
import ru.ok.android.webrtc.topology.CallTopology;
import ru.ok.android.webrtc.topology.StatsObserver;
import xsna.izs;

/* loaded from: classes9.dex */
public final class StatListenerManager$statsReportRunnable$1 implements Runnable {
    public final StatListenerManager$statsReportRunnable$1$statsObserver$1 a;
    public long b;
    public final /* synthetic */ StatListenerManager c;

    /* JADX WARN: Type inference failed for: r0v0, types: [ru.ok.android.webrtc.stat.listener.StatListenerManager$statsReportRunnable$1$statsObserver$1] */
    public StatListenerManager$statsReportRunnable$1(final StatListenerManager statListenerManager) {
        this.c = statListenerManager;
        this.a = new StatsObserver() { // from class: ru.ok.android.webrtc.stat.listener.StatListenerManager$statsReportRunnable$1$statsObserver$1
            public final ArrayList a = new ArrayList();

            @Override // ru.ok.android.webrtc.topology.StatsObserver
            public void onComplete(StatsReport[] statsReportArr, StatsReport[] statsReportArr2, StatsObserver.MediaTrackMapping[] mediaTrackMappingArr, Map<CallParticipant.ParticipantId, ScreenshareRecvStat> map, CallTopology callTopology) {
                StatListenerManager.ExtendedStatsObserver extendedStatsObserver;
                Set<RTCStatsObserver> set;
                RTCLog rTCLog;
                long j;
                long j2;
                extendedStatsObserver = StatListenerManager.this.d;
                extendedStatsObserver.handleStatReports(statsReportArr, statsReportArr2, mediaTrackMappingArr, map, callTopology.getIdentity());
                set = StatListenerManager.this.h;
                for (RTCStatsObserver rTCStatsObserver : set) {
                    j2 = this.b;
                    if (j2 % rTCStatsObserver.shouldCall == 0) {
                        this.a.add(rTCStatsObserver);
                    }
                }
                if (this.a.isEmpty()) {
                    return;
                }
                rTCLog = StatListenerManager.this.a;
                RTCStat from = RTCStat.from(statsReportArr, rTCLog);
                Iterator it = this.a.iterator();
                while (it.hasNext()) {
                    RTCStatsObserver rTCStatsObserver2 = (RTCStatsObserver) it.next();
                    j = this.b;
                    rTCStatsObserver2.onNewStat(from, j, callTopology);
                }
                this.a.clear();
            }
        };
    }

    @Override // java.lang.Runnable
    public void run() {
        izs izsVar;
        Handler handler;
        Handler handler2;
        izsVar = this.c.b;
        izsVar.invoke(this.a);
        handler = this.c.g;
        handler.removeCallbacks(this);
        handler2 = this.c.g;
        handler2.postDelayed(this, 1000L);
        this.b++;
    }
}
