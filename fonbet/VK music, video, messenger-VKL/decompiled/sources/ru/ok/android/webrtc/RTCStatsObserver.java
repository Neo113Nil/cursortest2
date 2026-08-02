package ru.ok.android.webrtc;

import androidx.annotation.NonNull;
import ru.ok.android.webrtc.stat.rtc.RTCStat;
import ru.ok.android.webrtc.topology.CallTopology;

/* loaded from: classes9.dex */
public abstract class RTCStatsObserver {
    public final long shouldCall;

    public RTCStatsObserver(long j) {
        this.shouldCall = j;
    }

    public abstract void onNewStat(@NonNull RTCStat rTCStat, long j, @NonNull CallTopology callTopology);
}
