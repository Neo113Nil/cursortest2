package xsna;

import one.video.player.OneVideoPlayer;
import one.video.player.error.OneVideoPlaybackException;

/* compiled from: OneVideoPlayerExt.kt */
/* loaded from: classes8.dex */
public final class qm80 {
    public static final g2b0 a(OneVideoPlayer oneVideoPlayer) {
        OneVideoPlayer.State state = oneVideoPlayer.getState();
        OneVideoPlaybackException error = oneVideoPlayer.getError();
        boolean canPause = oneVideoPlayer.canPause();
        boolean w = oneVideoPlayer.w();
        long currentPosition = oneVideoPlayer.getCurrentPosition();
        long bufferedPosition = oneVideoPlayer.getBufferedPosition();
        long duration = oneVideoPlayer.getDuration();
        sht0 j = oneVideoPlayer.j();
        return new g2b0(state, error, canPause, w, currentPosition, bufferedPosition, duration, j != null && j.c, oneVideoPlayer.o(), oneVideoPlayer.i(), oneVideoPlayer.k0());
    }
}
