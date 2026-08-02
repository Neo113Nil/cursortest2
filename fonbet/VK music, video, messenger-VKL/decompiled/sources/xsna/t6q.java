package xsna;

import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.ExoPlaybackException;
import com.vk.music.player.api.helper.AudioPlayer;
import com.vk.music.player.api.helper.dto.AudioDiscontinuityReason;
import com.vk.music.player.api.helper.dto.AudioPlaybackError;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import xsna.jza0;

/* compiled from: ExoPlayerListenerWrapper.kt */
/* loaded from: classes3.dex */
public final class t6q implements jza0.b {
    public final CopyOnWriteArrayList<rs4> b = new CopyOnWriteArrayList<>();

    @Override // xsna.jza0.b
    public final void D(int i, jza0.c cVar, jza0.c cVar2) {
        AudioDiscontinuityReason audioDiscontinuityReason;
        switch (i) {
            case 0:
                audioDiscontinuityReason = AudioDiscontinuityReason.AUTO_TRANSITION;
                break;
            case 1:
                audioDiscontinuityReason = AudioDiscontinuityReason.SEEK;
                break;
            case 2:
                audioDiscontinuityReason = AudioDiscontinuityReason.SEEK_ADJUSTMENT;
                break;
            case 3:
                audioDiscontinuityReason = AudioDiscontinuityReason.SKIP;
                break;
            case 4:
                audioDiscontinuityReason = AudioDiscontinuityReason.REMOVE;
                break;
            case 5:
                audioDiscontinuityReason = AudioDiscontinuityReason.INTERNAL;
                break;
            case 6:
                audioDiscontinuityReason = AudioDiscontinuityReason.SILENCE_SKIP;
                break;
            default:
                audioDiscontinuityReason = null;
                break;
        }
        if (audioDiscontinuityReason != null) {
            Iterator<rs4> it = this.b.iterator();
            while (it.hasNext()) {
                it.next().g(audioDiscontinuityReason);
            }
        }
    }

    @Override // xsna.jza0.b
    public final void a(int i) {
        Iterator<rs4> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().a(i);
        }
    }

    @Override // xsna.jza0.b
    public final void onIsLoadingChanged(boolean z) {
        Iterator<rs4> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().onIsLoadingChanged(z);
        }
    }

    @Override // xsna.jza0.b
    public final void onIsPlayingChanged(boolean z) {
        Iterator<rs4> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().onIsPlayingChanged(z);
        }
    }

    @Override // xsna.jza0.b
    public final void onPlayerError(PlaybackException playbackException) {
        AudioPlaybackError.Type type;
        for (rs4 rs4Var : this.b) {
            String message = playbackException.getMessage();
            if (message == null) {
                message = "";
            }
            Throwable cause = playbackException.getCause();
            if (playbackException instanceof ExoPlaybackException) {
                int i = ((ExoPlaybackException) playbackException).type;
                type = i != 0 ? i != 1 ? i != 2 ? i != 3 ? AudioPlaybackError.Type.UNRESOLVED : AudioPlaybackError.Type.REMOTE : AudioPlaybackError.Type.UNEXPECTED : AudioPlaybackError.Type.RENDERER : AudioPlaybackError.Type.SOURCE;
            } else {
                type = AudioPlaybackError.Type.UNRESOLVED;
            }
            rs4Var.c(new AudioPlaybackError(message, cause, type, playbackException.d()));
        }
    }

    @Override // xsna.jza0.b
    public final void onPlayerStateChanged(boolean z, int i) {
        AudioPlayer.State state = i != 1 ? i != 2 ? i != 3 ? i != 4 ? null : AudioPlayer.State.ENDED : z ? AudioPlayer.State.PLAYING : AudioPlayer.State.PAUSED : AudioPlayer.State.BUFFERING : AudioPlayer.State.IDLE;
        if (state == null) {
            return;
        }
        Iterator<T> it = this.b.iterator();
        while (it.hasNext()) {
            ((rs4) it.next()).e(state);
        }
    }
}
