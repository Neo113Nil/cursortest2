package xsna;

import one.video.pip.config.data.PlaybackStatus;
import one.video.player.BaseVideoPlayer;
import one.video.player.OneVideoPlayer;
import one.video.player.error.OneVideoPlaybackException;

/* compiled from: PipPlayerListenerImpl.kt */
/* loaded from: classes8.dex */
public final class fpa0 implements one.video.player.f {
    public final kxi a;
    public final bk30 b;

    public fpa0(kxi kxiVar, bk30 bk30Var) {
        this.a = kxiVar;
        this.b = bk30Var;
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void e(BaseVideoPlayer baseVideoPlayer, one.video.player.tracks.c cVar) {
        this.b.invoke(this.a.a(baseVideoPlayer));
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void h(OneVideoPlayer oneVideoPlayer) {
        this.b.invoke(this.a.b(oneVideoPlayer, PlaybackStatus.COMPLETE));
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void j(OneVideoPlayer oneVideoPlayer) {
        kxi kxiVar = this.a;
        boolean z = kxiVar.b;
        bk30 bk30Var = this.b;
        if (z) {
            bk30Var.invoke(kxiVar.b(oneVideoPlayer, PlaybackStatus.AD_PLAYING));
        } else {
            bk30Var.invoke(kxiVar.b(oneVideoPlayer, PlaybackStatus.PLAYING));
        }
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void q(OneVideoPlaybackException oneVideoPlaybackException, sht0 sht0Var, OneVideoPlayer oneVideoPlayer) {
        this.b.invoke(this.a.b(oneVideoPlayer, PlaybackStatus.ERROR));
        oneVideoPlaybackException.getMessage();
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void r(OneVideoPlayer oneVideoPlayer) {
        kxi kxiVar = this.a;
        boolean z = kxiVar.b;
        bk30 bk30Var = this.b;
        if (z) {
            bk30Var.invoke(kxiVar.b(oneVideoPlayer, PlaybackStatus.AD_PAUSE));
        } else {
            bk30Var.invoke(kxiVar.b(oneVideoPlayer, PlaybackStatus.PAUSE));
        }
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void s(OneVideoPlayer oneVideoPlayer) {
        OneVideoPlayer.State state = oneVideoPlayer.getState();
        OneVideoPlayer.State state2 = OneVideoPlayer.State.PLAYING;
        kxi kxiVar = this.a;
        bk30 bk30Var = this.b;
        if (state == state2) {
            bk30Var.invoke(kxiVar.b(oneVideoPlayer, PlaybackStatus.PLAYING));
        } else {
            bk30Var.invoke(kxiVar.b(oneVideoPlayer, PlaybackStatus.PAUSE));
        }
    }
}
