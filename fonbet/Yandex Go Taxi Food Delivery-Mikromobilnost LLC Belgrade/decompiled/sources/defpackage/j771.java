package defpackage;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackSession;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes7.dex */
public abstract class j771 {
    public static wl61 a(Context context, ek71 ek71Var, boolean z) {
        PlaybackSession createPlaybackSession;
        b171 b171Var;
        LogSessionId sessionId;
        LogSessionId logSessionId;
        MediaMetricsManager g = xbm.g(context.getSystemService("media_metrics"));
        if (g == null) {
            b171Var = null;
        } else {
            createPlaybackSession = g.createPlaybackSession();
            b171Var = new b171(context, createPlaybackSession);
        }
        if (b171Var == null) {
            nba1.e();
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            return new wl61(logSessionId);
        }
        if (z) {
            ek71Var.getClass();
            ep71 ep71Var = ek71Var.p;
            ep71Var.getClass();
            xrr xrrVar = ep71Var.y;
            if (!xrrVar.b) {
                ((CopyOnWriteArraySet) xrrVar.y).add(new x181(b171Var));
            }
        }
        sessionId = b171Var.c.getSessionId();
        return new wl61(sessionId);
    }
}
