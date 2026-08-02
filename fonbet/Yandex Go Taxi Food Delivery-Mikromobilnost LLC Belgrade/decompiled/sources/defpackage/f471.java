package defpackage;

import android.media.MediaFormat;
import android.media.metrics.LogSessionId;

/* loaded from: classes7.dex */
public abstract class f471 {
    public static void a(si81 si81Var, wl61 wl61Var) {
        boolean equals;
        String stringId;
        LogSessionId unused;
        sh61 sh61Var = wl61Var.a;
        sh61Var.getClass();
        LogSessionId logSessionId = sh61Var.a;
        unused = LogSessionId.LOG_SESSION_ID_NONE;
        equals = logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE);
        if (equals) {
            return;
        }
        MediaFormat mediaFormat = si81Var.b;
        stringId = logSessionId.getStringId();
        mediaFormat.setString("log-session-id", stringId);
    }
}
