package ru.ok.android.webrtc.listeners.collection;

import ru.ok.android.webrtc.listeners.CallStatsListener;

/* loaded from: classes9.dex */
public interface StatsListenersCollection {
    void addStatsListener(CallStatsListener callStatsListener);

    void removeStatsListener(CallStatsListener callStatsListener);
}
