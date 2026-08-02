package ru.ok.android.webrtc;

import ru.ok.android.webrtc.stat.rtc.RTCStat;
import ru.ok.android.webrtc.topology.CallTopology;

/* loaded from: classes9.dex */
public final class c extends RTCStatsObserver {
    public final /* synthetic */ Call a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Call call) {
        super(5L);
        this.a = call;
    }

    @Override // ru.ok.android.webrtc.RTCStatsObserver
    public final void onNewStat(RTCStat rTCStat, long j, CallTopology callTopology) {
        this.a.g0.reportStats(rTCStat);
    }
}
