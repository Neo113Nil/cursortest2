package xsna;

import com.vk.reefton.ReefEvent;
import kotlin.LazyThreadSafetyMode;
import one.video.player.BaseVideoPlayer;
import one.video.player.OneVideoPlayer;
import one.video.player.RepeatMode;
import one.video.player.error.OneVideoPlaybackException;

/* compiled from: StoringAsyncReefPlayerListener.kt */
/* loaded from: classes3.dex */
public final class nwl0 implements one.video.player.f {
    public final owl0 a;
    public final y3l0 b;
    public final Object c = msy.a(LazyThreadSafetyMode.NONE, new kr50(this, 28));

    public nwl0(owl0 owl0Var, y3l0 y3l0Var) {
        this.a = owl0Var;
        this.b = y3l0Var;
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void a(final OneVideoPlayer.DiscontinuityReason discontinuityReason, OneVideoPlayer oneVideoPlayer, deb0 deb0Var, final deb0 deb0Var2) {
        final long duration = oneVideoPlayer.getDuration();
        this.a.execute(new Runnable() { // from class: xsna.lwl0
            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // java.lang.Runnable
            public final void run() {
                knf0 knf0Var = (knf0) nwl0.this.c.getValue();
                if (knf0Var != null) {
                    knf0Var.b(discontinuityReason, deb0Var2, duration);
                }
            }
        });
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void e(BaseVideoPlayer baseVideoPlayer, one.video.player.tracks.c cVar) {
        if (cVar == null) {
            return;
        }
        this.a.execute(new tdh0(this, cVar, baseVideoPlayer.getDuration(), baseVideoPlayer.k0()));
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void q(OneVideoPlaybackException oneVideoPlaybackException, sht0 sht0Var, OneVideoPlayer oneVideoPlayer) {
        this.a.execute(new vv4(6, this, oneVideoPlaybackException));
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void s(OneVideoPlayer oneVideoPlayer) {
        final long duration = oneVideoPlayer.getDuration();
        final long currentPosition = oneVideoPlayer.getCurrentPosition();
        this.a.execute(new Runnable() { // from class: xsna.kwl0
            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // java.lang.Runnable
            public final void run() {
                knf0 knf0Var = (knf0) nwl0.this.c.getValue();
                if (knf0Var != null) {
                    knf0Var.a.a(new ReefEvent.m(currentPosition, duration));
                }
            }
        });
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void v(OneVideoPlayer oneVideoPlayer) {
        final long duration = oneVideoPlayer.getDuration();
        final long currentPosition = oneVideoPlayer.getCurrentPosition();
        this.a.execute(new Runnable() { // from class: xsna.mwl0
            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // java.lang.Runnable
            public final void run() {
                knf0 knf0Var = (knf0) nwl0.this.c.getValue();
                if (knf0Var != null) {
                    knf0Var.a.a(new ReefEvent.l(currentPosition, duration));
                }
            }
        });
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
    public final void h(OneVideoPlayer oneVideoPlayer) {
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
    public final void g(BaseVideoPlayer baseVideoPlayer, float f) {
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void i(OneVideoPlayer oneVideoPlayer, int i) {
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
