package xsna;

import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.ExoPlaybackException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import one.video.exo.error.ErrorAssertion;
import one.video.exo.error.OneVideoExoPlaybackException;
import one.video.exo.error.OneVideoExoRendererException;
import one.video.exo.error.OneVideoExoSourceException;
import one.video.exo.error.OneVideoExoUnexpectedException;
import one.video.player.BaseVideoPlayer;
import one.video.player.OneVideoPlayer;
import one.video.player.error.OneVideoPlaybackException;
import xsna.jza0;

/* compiled from: OneVideoExoPlayer.kt */
/* loaded from: classes8.dex */
public final class al80 implements jza0.b {
    public final /* synthetic */ xk80 b;

    public al80(xk80 xk80Var) {
        this.b = xk80Var;
    }

    @Override // xsna.jza0.b
    public final void D(int i, jza0.c cVar, jza0.c cVar2) {
        xk80 xk80Var = this.b;
        one.video.player.j jVar = xk80Var.l;
        OneVideoPlayer.DiscontinuityReason discontinuityReason = (OneVideoPlayer.DiscontinuityReason) l1n.a.get(Integer.valueOf(i));
        if (discontinuityReason == null) {
            discontinuityReason = OneVideoPlayer.DiscontinuityReason.UNKNOWN;
        }
        jVar.a(discontinuityReason, xk80Var, xk80.t0(xk80Var, cVar), xk80.t0(xk80Var, cVar2));
    }

    @Override // xsna.jza0.b
    public final void f0(kr10 kr10Var, int i) {
        if (i == 1 || i == 2 || i == 3) {
            xk80 xk80Var = this.b;
            xk80Var.l.i(xk80Var, xk80Var.m0());
        }
    }

    @Override // xsna.jza0.b
    public final void onIsPlayingChanged(boolean z) {
        xk80 xk80Var = this.b;
        xk80Var.l.y(xk80Var, z);
    }

    @Override // xsna.jza0.b
    public final void onPlayWhenReadyChanged(boolean z, int i) {
        xk80 xk80Var = this.b;
        one.video.player.j jVar = xk80Var.l;
        jVar.b(xk80Var, z);
        if (xk80Var.m0.getPlaybackState() == 3) {
            if (z) {
                xk80Var.s0(OneVideoPlayer.State.PLAYING, null);
            } else {
                xk80Var.s0(OneVideoPlayer.State.PAUSED, null);
            }
            one.video.player.j jVar2 = xk80Var.l;
            if (z) {
                jVar2.j(xk80Var);
            } else {
                jVar2.r(xk80Var);
            }
        }
        if (i == 5) {
            jVar.d(xk80Var);
        }
    }

    @Override // xsna.jza0.b
    public final void onPlaybackStateChanged(int i) {
        g8l g8lVar;
        if (i == 1) {
            BaseVideoPlayer.d(null);
            if (this.b.getState() != OneVideoPlayer.State.ERROR) {
                this.b.s0(OneVideoPlayer.State.IDLE, null);
            }
            xk80 xk80Var = this.b;
            xk80Var.l.f(xk80Var);
            return;
        }
        if (i == 2) {
            BaseVideoPlayer.d(null);
            this.b.s0(OneVideoPlayer.State.BUFFERING, null);
            xk80 xk80Var2 = this.b;
            xk80Var2.c0 = xk80Var2.m0.getPlayWhenReady();
            xk80 xk80Var3 = this.b;
            xk80Var3.l.v(xk80Var3);
            return;
        }
        if (i != 3) {
            if (i != 4) {
                return;
            }
            BaseVideoPlayer.d(null);
            this.b.s0(OneVideoPlayer.State.ENDED, null);
            xk80 xk80Var4 = this.b;
            xk80Var4.l.h(xk80Var4);
            zmo zmoVar = (zmo) this.b.e0.getValue();
            if (zmoVar == null || (g8lVar = zmoVar.f) == null) {
                return;
            }
            zmoVar.a(g8lVar);
            return;
        }
        BaseVideoPlayer.d(null);
        boolean playWhenReady = this.b.m0.getPlayWhenReady();
        if (playWhenReady) {
            this.b.s0(OneVideoPlayer.State.PLAYING, null);
        } else {
            this.b.s0(OneVideoPlayer.State.PAUSED, null);
        }
        xk80 xk80Var5 = this.b;
        xk80Var5.l.s(xk80Var5);
        xk80 xk80Var6 = this.b;
        if (playWhenReady != xk80Var6.c0) {
            if (playWhenReady) {
                xk80Var6.l.j(xk80Var6);
            } else {
                xk80Var6.l.r(xk80Var6);
            }
        }
        androidx.media3.exoplayer.c cVar = this.b.m0;
        cVar.X();
        ArrayList n = qv20.n(cVar.h0);
        Iterator it = this.b.p.iterator();
        while (it.hasNext()) {
            ((OneVideoPlayer.e) it.next()).C(n);
        }
    }

    @Override // xsna.jza0.b
    public final void onPlayerError(PlaybackException playbackException) {
        OneVideoExoPlaybackException oneVideoExoPlaybackException = new OneVideoExoPlaybackException(playbackException.getMessage(), playbackException.getCause());
        HashMap hashMap = dwa0.a;
        OneVideoPlaybackException.ErrorCode errorCode = (OneVideoPlaybackException.ErrorCode) dwa0.a.get(Integer.valueOf(playbackException.errorCode));
        if (errorCode == null) {
            errorCode = OneVideoPlaybackException.ErrorCode.NO_ERROR;
        }
        oneVideoExoPlaybackException.l(errorCode);
        oneVideoExoPlaybackException.m(playbackException.d());
        vw3 vw3Var = ErrorAssertion.a;
        boolean z = playbackException instanceof ExoPlaybackException;
        vw3Var.b(z, ErrorAssertion.AssertionType.INVALID_EXCEPTION_CLASS, new uw3(0));
        if (z) {
            HashMap hashMap2 = ewa0.a;
            ExoPlaybackException exoPlaybackException = (ExoPlaybackException) playbackException;
            OneVideoPlaybackException.Type type = (OneVideoPlaybackException.Type) ewa0.a.get(Integer.valueOf(exoPlaybackException.type));
            if (type == null) {
                type = OneVideoPlaybackException.Type.UNRESOLVED;
            }
            oneVideoExoPlaybackException.p(type);
            vw3Var.b(oneVideoExoPlaybackException.j() != OneVideoPlaybackException.Type.UNRESOLVED, ErrorAssertion.AssertionType.ERROR_TYPE_IS_NOT_RESOLVED, new uw3(0));
            int i = OneVideoExoPlaybackException.a.$EnumSwitchMapping$0[oneVideoExoPlaybackException.j().ordinal()];
            if (i == 1) {
                oneVideoExoPlaybackException.o(new OneVideoExoSourceException(exoPlaybackException.g()));
            } else if (i == 2) {
                oneVideoExoPlaybackException.n(new OneVideoExoRendererException(exoPlaybackException));
            } else if (i == 3) {
                fxc0.z(exoPlaybackException.type == 2);
                Throwable cause = exoPlaybackException.getCause();
                cause.getClass();
                oneVideoExoPlaybackException.q(new OneVideoExoUnexpectedException((RuntimeException) cause));
            } else if (i != 4 && i != 5) {
                throw new NoWhenBranchMatchedException();
            }
        }
        if (!wn80.h) {
            oneVideoExoPlaybackException.toString();
        } else if (wn80.q) {
            oneVideoExoPlaybackException.toString();
        }
        OneVideoPlayer.State state = OneVideoPlayer.State.ERROR;
        xk80 xk80Var = this.b;
        xk80Var.s0(state, oneVideoExoPlaybackException);
        xk80Var.l.q(oneVideoExoPlaybackException, xk80Var.j(), xk80Var);
    }

    @Override // xsna.jza0.b
    public final void onRenderedFirstFrame() {
        xk80 xk80Var = this.b;
        xk80Var.l.l(xk80Var);
        if (xk80Var.e == null) {
            xk80Var.h0 = true;
            xk80Var.l.x(xk80Var);
        }
    }

    @Override // xsna.jza0.b
    public final void z(ewo0 ewo0Var, int i) {
        xk80 xk80Var = this.b;
        if (xk80Var.d0 != i) {
            xk80Var.d0 = i;
            if (i == 1) {
                xk80Var.A0(ewo0Var);
            }
        }
        if (xk80Var.o()) {
            int i2 = wn80.a;
        }
    }
}
