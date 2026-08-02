package xsna;

import one.video.player.BaseVideoPlayer;
import one.video.player.OneVideoPlayer;
import xsna.bu;

/* compiled from: ActionHandler.kt */
/* loaded from: classes8.dex */
public final class j10 implements one.video.player.f {
    public final /* synthetic */ i10 a;

    public j10(i10 i10Var) {
        this.a = i10Var;
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void e(BaseVideoPlayer baseVideoPlayer, one.video.player.tracks.c cVar) {
        g2b0 a = qm80.a(baseVideoPlayer);
        i10 i10Var = this.a;
        if (epx.f(i10Var.e, a)) {
            return;
        }
        i10Var.e = a;
        i10Var.c(bu.c.a.a);
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void k(OneVideoPlayer oneVideoPlayer, long j) {
        i10 i10Var = this.a;
        g2b0 g2b0Var = i10Var.e;
        if (g2b0Var == null || j != g2b0Var.g) {
            i10Var.e = g2b0Var != null ? g2b0.a(g2b0Var, null, 0L, 0L, j, false, 1983) : null;
            i10Var.c(bu.c.b.a);
        }
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void z(BaseVideoPlayer baseVideoPlayer, OneVideoPlayer.State state, OneVideoPlayer.State state2) {
        OneVideoPlayer.State state3 = OneVideoPlayer.State.PLAYING;
        bu.c.d dVar = bu.c.d.a;
        i10 i10Var = this.a;
        if ((state == state3 || state == OneVideoPlayer.State.PAUSED) && (state2 == state3 || state2 == OneVideoPlayer.State.PAUSED)) {
            if (state2 == state3) {
                i10Var.d(i10Var.z.b, true);
            } else {
                i10Var.d(i10Var.z.b, false);
            }
            g2b0 g2b0Var = i10Var.e;
            i10Var.e = g2b0Var != null ? g2b0.a(g2b0Var, state2, 0L, 0L, 0L, false, 2046) : null;
            i10Var.c(dVar);
            return;
        }
        if (state2 == OneVideoPlayer.State.ENDED) {
            g2b0 g2b0Var2 = i10Var.e;
            i10Var.e = g2b0Var2 != null ? g2b0.a(g2b0Var2, state2, 0L, 0L, 0L, false, 2046) : null;
            i10Var.c(dVar);
        } else {
            if (state2 == OneVideoPlayer.State.ERROR) {
                return;
            }
            g2b0 a = qm80.a(baseVideoPlayer);
            if (epx.f(i10Var.e, a)) {
                return;
            }
            i10Var.e = a;
            i10Var.c(bu.c.a.a);
        }
    }
}
