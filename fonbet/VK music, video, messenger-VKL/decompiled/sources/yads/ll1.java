package yads;

import android.media.MediaFormat;
import android.media.metrics.LogSessionId;

/* loaded from: classes10.dex */
public abstract class ll1 {
    public static void a(bl1 bl1Var, zf2 zf2Var) {
        boolean equals;
        String stringId;
        LogSessionId unused;
        yf2 yf2Var = zf2Var.a;
        yf2Var.getClass();
        LogSessionId logSessionId = yf2Var.a;
        unused = LogSessionId.LOG_SESSION_ID_NONE;
        equals = logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE);
        if (equals) {
            return;
        }
        MediaFormat mediaFormat = bl1Var.b;
        stringId = logSessionId.getStringId();
        mediaFormat.setString("log-session-id", stringId);
    }
}
