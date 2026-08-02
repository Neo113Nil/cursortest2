package yads;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;

/* loaded from: classes10.dex */
public abstract class ob0 {
    public static void a(AudioTrack audioTrack, zf2 zf2Var) {
        boolean equals;
        LogSessionId unused;
        yf2 yf2Var = zf2Var.a;
        yf2Var.getClass();
        LogSessionId logSessionId = yf2Var.a;
        unused = LogSessionId.LOG_SESSION_ID_NONE;
        equals = logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE);
        if (equals) {
            return;
        }
        audioTrack.setLogSessionId(logSessionId);
    }
}
