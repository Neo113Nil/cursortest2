package ru.ok.android.webrtc.di.factory;

import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.stat.listener.StatListenerManager;
import ru.ok.android.webrtc.topology.StatsCallback;
import ru.ok.android.webrtc.topology.StatsObserver;
import ru.ok.android.webrtc.utils.time.TimeProvider;
import xsna.izs;
import xsna.s3q0;

/* loaded from: classes9.dex */
public final class StatListenerManagerFactory {
    public final RTCLog a;
    public final TimeProvider b;
    public final boolean c;

    public StatListenerManagerFactory(RTCLog rTCLog, TimeProvider timeProvider, boolean z) {
        this.a = rTCLog;
        this.b = timeProvider;
        this.c = z;
    }

    public final StatListenerManager createStatListenerManager(izs<? super StatsObserver, s3q0> izsVar, izs<? super StatsCallback, s3q0> izsVar2, StatListenerManager.ExtendedStatsObserver extendedStatsObserver) {
        return new StatListenerManager(this.a, izsVar, izsVar2, extendedStatsObserver, this.b, this.c);
    }
}
