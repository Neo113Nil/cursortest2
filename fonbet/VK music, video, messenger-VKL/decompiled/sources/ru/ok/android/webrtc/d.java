package ru.ok.android.webrtc;

import ru.ok.android.webrtc.stat.listener.StatisticsListener;
import ru.ok.android.webrtc.stat.rtc.RTCStat;

/* loaded from: classes9.dex */
public final class d implements StatisticsListener {
    public final /* synthetic */ Call a;

    public d(Call call) {
        this.a = call;
    }

    @Override // ru.ok.android.webrtc.stat.listener.StatisticsListener
    public final void onStatistics(RTCStat rTCStat) {
        this.a.F0.logStatReport(rTCStat, this.a.g0.getScreenshareRecvStats(), !r1.isMuted(), this.a.isVideoEnabled());
        this.a.F0.onRtcStats(rTCStat);
        this.a.J0.getRtcStatsListenerProxy().onRtcStats(rTCStat);
    }
}
