package yads;

import android.media.MediaDrm;
import android.media.metrics.LogSessionId;

/* loaded from: classes10.dex */
public abstract class wx0 {
    public static boolean a(MediaDrm mediaDrm, String str) {
        boolean requiresSecureDecoder;
        requiresSecureDecoder = mediaDrm.requiresSecureDecoder(str);
        return requiresSecureDecoder;
    }

    public static void a(MediaDrm mediaDrm, byte[] bArr, zf2 zf2Var) {
        boolean equals;
        MediaDrm.PlaybackComponent playbackComponent;
        LogSessionId unused;
        yf2 yf2Var = zf2Var.a;
        yf2Var.getClass();
        LogSessionId logSessionId = yf2Var.a;
        unused = LogSessionId.LOG_SESSION_ID_NONE;
        equals = logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE);
        if (equals) {
            return;
        }
        playbackComponent = mediaDrm.getPlaybackComponent(bArr);
        playbackComponent.getClass();
        playbackComponent.setLogSessionId(logSessionId);
    }
}
