package yads;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackSession;
import xsna.lc9;

/* loaded from: classes10.dex */
public abstract class wn0 {
    public static zf2 a(Context context, ao0 ao0Var, boolean z) {
        PlaybackSession createPlaybackSession;
        nn1 nn1Var;
        LogSessionId sessionId;
        LogSessionId logSessionId;
        MediaMetricsManager a = lc9.a(context.getSystemService("media_metrics"));
        if (a == null) {
            nn1Var = null;
        } else {
            createPlaybackSession = a.createPlaybackSession();
            nn1Var = new nn1(context, createPlaybackSession);
        }
        if (nn1Var == null) {
            ji1.d("ExoPlayerImpl", "MediaMetricsService unavailable.");
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            return new zf2(new yf2(logSessionId));
        }
        if (z) {
            ao0Var.getClass();
            kb0 kb0Var = (kb0) ao0Var.o;
            kb0Var.getClass();
            qg1 qg1Var = kb0Var.f;
            if (!qg1Var.g) {
                qg1Var.d.add(new pg1(nn1Var));
            }
        }
        sessionId = nn1Var.c.getSessionId();
        return new zf2(new yf2(sessionId));
    }
}
