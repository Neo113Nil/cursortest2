package ru.ok.android.webrtc.opengl;

import java.util.concurrent.TimeUnit;
import ru.ok.android.webrtc.RTCLog;

/* loaded from: classes9.dex */
public interface CallRenderereStatistics {
    public static final Companion Companion = Companion.a;

    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();

        public final String getAverageTimeAsString(long j, int i) {
            if (i <= 0) {
                return "-";
            }
            return TimeUnit.NANOSECONDS.toMicros(j / i) + " us";
        }
    }

    static String getAverageTimeAsString(long j, int i) {
        return Companion.getAverageTimeAsString(j, i);
    }

    void log(RTCLog rTCLog);

    void reset(long j);
}
