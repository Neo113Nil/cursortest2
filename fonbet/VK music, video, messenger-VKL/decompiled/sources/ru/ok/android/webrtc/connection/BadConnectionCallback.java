package ru.ok.android.webrtc.connection;

import java.util.Set;

/* loaded from: classes9.dex */
public interface BadConnectionCallback {

    public enum Cause {
        REMOTE,
        LOCAL_RTT,
        LOCAL_LOSS,
        REMOTE_RTT,
        REMOTE_LOSS
    }

    void onBadConnection();

    void onBadConnectionCauseSetChanged(Set<Cause> set);

    void onConnectionStats(double d, double d2, double d3, long j);

    void onGoodConnection();
}
