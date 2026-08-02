package one.video.exo.error;

import androidx.media3.common.util.StuckPlayerException;
import java.util.HashMap;
import one.video.player.error.OneVideoPlaybackException;
import one.video.player.error.OneVideoUnexpectedException;
import xsna.tsm0;

/* compiled from: OneVideoExoUnexpectedException.kt */
/* loaded from: classes8.dex */
public final class OneVideoExoUnexpectedException extends OneVideoUnexpectedException {
    private final OneVideoUnexpectedException.a stuckExceptionInfo;

    public OneVideoExoUnexpectedException(RuntimeException runtimeException) {
        super(runtimeException);
        Throwable cause = getCause();
        OneVideoUnexpectedException.a aVar = null;
        StuckPlayerException stuckPlayerException = cause instanceof StuckPlayerException ? (StuckPlayerException) cause : null;
        if (stuckPlayerException != null) {
            HashMap<Integer, OneVideoPlaybackException.StuckType> hashMap = tsm0.a;
            OneVideoPlaybackException.StuckType stuckType = tsm0.a.get(Integer.valueOf(stuckPlayerException.stuckType));
            aVar = new OneVideoUnexpectedException.a(stuckType == null ? OneVideoPlaybackException.StuckType.UNKNOWN : stuckType, stuckPlayerException.timeoutMs);
        }
        this.stuckExceptionInfo = aVar;
    }

    @Override // one.video.player.error.OneVideoUnexpectedException
    public final OneVideoUnexpectedException.a d() {
        return this.stuckExceptionInfo;
    }
}
