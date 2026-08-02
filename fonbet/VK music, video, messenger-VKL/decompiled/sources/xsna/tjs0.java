package xsna;

import java.util.Set;
import one.video.player.error.OneVideoPlaybackException;

/* compiled from: VideoErrorExt.kt */
/* loaded from: classes2.dex */
public final class tjs0 {
    public static final Set<OneVideoPlaybackException.ErrorCode> a = rl3.y0(new OneVideoPlaybackException.ErrorCode[]{OneVideoPlaybackException.ErrorCode.IO_NETWORK_CONNECTION_FAILED, OneVideoPlaybackException.ErrorCode.IO_NETWORK_CONNECTION_TIMEOUT});

    public static boolean a(Throwable th) {
        Throwable cause;
        if (th == null || (cause = th.getCause()) == null || !h03.a(cause)) {
            if (!(th instanceof OneVideoPlaybackException)) {
                return false;
            }
            if (!a.contains(((OneVideoPlaybackException) th).d())) {
                return false;
            }
        }
        return true;
    }
}
