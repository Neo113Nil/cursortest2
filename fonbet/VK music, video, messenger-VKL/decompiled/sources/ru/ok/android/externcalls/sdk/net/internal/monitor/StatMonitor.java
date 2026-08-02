package ru.ok.android.externcalls.sdk.net.internal.monitor;

import io.reactivex.rxjava3.core.q;
import ru.ok.android.webrtc.listeners.CallRtcStatsListener;

/* compiled from: StatMonitor.kt */
/* loaded from: classes9.dex */
public interface StatMonitor extends CallRtcStatsListener {
    q<NetworkStat> observeStat();
}
