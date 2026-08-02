package ru.ok.android.webrtc.topology;

import org.webrtc.RTCStatsReport;

/* loaded from: classes9.dex */
public interface StatsCallback {

    public static final class Stats {
        public final RTCStatsReport a;

        public Stats(RTCStatsReport rTCStatsReport) {
            this.a = rTCStatsReport;
        }

        public final RTCStatsReport getReport() {
            return this.a;
        }
    }

    void onStatsReady(Stats stats);
}
