package ru.ok.android.webrtc.listeners.collection;

import ru.ok.android.webrtc.listeners.CallRtcStatsListener;

/* loaded from: classes9.dex */
public interface RtcStatsListenersCollection {
    void addRtcStatsListener(CallRtcStatsListener callRtcStatsListener);

    void removeRtcStatsListener(CallRtcStatsListener callRtcStatsListener);
}
