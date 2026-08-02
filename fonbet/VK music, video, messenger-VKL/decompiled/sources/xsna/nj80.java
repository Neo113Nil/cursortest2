package xsna;

import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import one.video.player.BaseVideoPlayer;
import one.video.player.OneVideoPlayer;
import one.video.player.RepeatMode;
import one.video.player.error.OneVideoPlaybackException;

/* compiled from: OnePlayerEventController.kt */
/* loaded from: classes3.dex */
public final class nj80 implements one.video.player.f {
    public final xk80 a;
    public final ij80 b;
    public final jj80 c;
    public final kj80 d;
    public final com.vk.movika.sdk.base.hooks.f e;
    public final n2b0 f;
    public int g;

    public nj80(xk80 xk80Var, ij80 ij80Var, jj80 jj80Var, kj80 kj80Var, com.vk.movika.sdk.base.hooks.f fVar, n2b0 n2b0Var) {
        this.a = xk80Var;
        this.b = ij80Var;
        this.c = jj80Var;
        this.d = kj80Var;
        this.e = fVar;
        this.f = n2b0Var;
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void a(OneVideoPlayer.DiscontinuityReason discontinuityReason, OneVideoPlayer oneVideoPlayer, deb0 deb0Var, deb0 deb0Var2) {
        xk80 xk80Var = this.a;
        int m0 = xk80Var.m0();
        Integer valueOf = Integer.valueOf(m0);
        if (m0 < 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            int intValue = valueOf.intValue();
            if (intValue != this.g) {
                com.vk.movika.sdk.player.base.model.a p = vua0.p(xk80Var, xk80Var.m0(), this.e);
                this.f.q(p);
                this.b.a(p);
            }
            this.g = intValue;
        }
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void h(OneVideoPlayer oneVideoPlayer) {
        xk80 xk80Var = this.a;
        com.vk.movika.sdk.player.base.model.a p = vua0.p(xk80Var, xk80Var.m0(), this.e);
        if (p != null) {
            this.c.a(p);
            return;
        }
        L l = L.a;
        l.getClass();
        if (L.m(LoggerOutputTarget.NONE)) {
            return;
        }
        L.u(l, L.LogType.w, new Object[]{"OnePlayerEventController", "onPlayerEnded: item == null! RETURN"});
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void i(OneVideoPlayer oneVideoPlayer, int i) {
        if (i < 0) {
            L l = L.a;
            l.getClass();
            if (L.m(LoggerOutputTarget.NONE)) {
                return;
            }
            L.u(l, L.LogType.w, new Object[]{"OnePlayerEventController", tgw.b(i, "onPlaylistItemIndexChanged: index = ", ". IGNORE!")});
            return;
        }
        try {
            this.f.w(vua0.p(oneVideoPlayer, i, this.e));
        } catch (ArrayIndexOutOfBoundsException unused) {
            L l2 = L.a;
            l2.getClass();
            if (L.m(LoggerOutputTarget.NONE)) {
                return;
            }
            L.u(l2, L.LogType.w, new Object[]{"OnePlayerEventController", lhg.a(i, "onPlaylistItemIndexChanged: can not resolve item with index = ")});
        }
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void q(OneVideoPlaybackException oneVideoPlaybackException, sht0 sht0Var, OneVideoPlayer oneVideoPlayer) {
        this.d.a(oneVideoPlaybackException);
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void d(OneVideoPlayer oneVideoPlayer) {
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    @ozl
    public final void f(OneVideoPlayer oneVideoPlayer) {
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    @ozl
    public final void j(OneVideoPlayer oneVideoPlayer) {
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void l(OneVideoPlayer oneVideoPlayer) {
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void p(OneVideoPlayer oneVideoPlayer) {
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    @ozl
    public final void r(OneVideoPlayer oneVideoPlayer) {
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    @ozl
    public final void s(OneVideoPlayer oneVideoPlayer) {
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    @ozl
    public final void v(OneVideoPlayer oneVideoPlayer) {
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void w(BaseVideoPlayer baseVideoPlayer) {
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void x(OneVideoPlayer oneVideoPlayer) {
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    @ozl
    public final void b(OneVideoPlayer oneVideoPlayer, boolean z) {
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void c(BaseVideoPlayer baseVideoPlayer, hk0 hk0Var) {
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void e(BaseVideoPlayer baseVideoPlayer, one.video.player.tracks.c cVar) {
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void g(BaseVideoPlayer baseVideoPlayer, float f) {
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void k(OneVideoPlayer oneVideoPlayer, long j) {
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void n(xk80 xk80Var, one.video.player.tracks.c cVar) {
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void o(BaseVideoPlayer baseVideoPlayer, float f) {
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void t(OneVideoPlayer oneVideoPlayer, one.video.player.tracks.a aVar) {
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void u(BaseVideoPlayer baseVideoPlayer, RepeatMode repeatMode) {
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    @ozl
    public final void y(OneVideoPlayer oneVideoPlayer, boolean z) {
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void m(xk80 xk80Var, one.video.player.tracks.b bVar, boolean z) {
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void z(BaseVideoPlayer baseVideoPlayer, OneVideoPlayer.State state, OneVideoPlayer.State state2) {
    }
}
