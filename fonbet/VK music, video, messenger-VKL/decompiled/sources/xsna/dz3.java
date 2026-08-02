package xsna;

import com.vk.reefton.Reef;
import com.vk.reefton.ReefEvent;
import java.util.List;
import java.util.concurrent.ExecutorService;
import one.video.player.BaseVideoPlayer;
import one.video.player.OneVideoPlayer;
import one.video.player.RepeatMode;
import one.video.player.error.OneVideoPlaybackException;

/* compiled from: AsyncReefPlayerListener.kt */
/* loaded from: classes3.dex */
public final class dz3 implements one.video.player.f {
    public final ExecutorService a;
    public final knf0 b;

    public dz3(Reef reef, ExecutorService executorService) {
        this.a = executorService;
        this.b = new knf0(reef);
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void a(final OneVideoPlayer.DiscontinuityReason discontinuityReason, OneVideoPlayer oneVideoPlayer, deb0 deb0Var, final deb0 deb0Var2) {
        final long duration = oneVideoPlayer.getDuration();
        this.a.submit(new Runnable() { // from class: xsna.cz3
            @Override // java.lang.Runnable
            public final void run() {
                dz3.this.b.b(discontinuityReason, deb0Var2, duration);
            }
        });
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void e(BaseVideoPlayer baseVideoPlayer, final one.video.player.tracks.c cVar) {
        if (cVar == null) {
            return;
        }
        final long duration = baseVideoPlayer.getDuration();
        final List<one.video.player.tracks.c> k0 = baseVideoPlayer.k0();
        this.a.submit(new Runnable() { // from class: xsna.az3
            @Override // java.lang.Runnable
            public final void run() {
                dz3.this.b.a(cVar, duration, k0);
            }
        });
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void q(OneVideoPlaybackException oneVideoPlaybackException, sht0 sht0Var, OneVideoPlayer oneVideoPlayer) {
        this.a.submit(new y(1, this, oneVideoPlaybackException));
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void s(OneVideoPlayer oneVideoPlayer) {
        final long duration = oneVideoPlayer.getDuration();
        final long currentPosition = oneVideoPlayer.getCurrentPosition();
        this.a.submit(new Runnable() { // from class: xsna.bz3
            @Override // java.lang.Runnable
            public final void run() {
                dz3.this.b.a.a(new ReefEvent.m(currentPosition, duration));
            }
        });
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void v(OneVideoPlayer oneVideoPlayer) {
        final long duration = oneVideoPlayer.getDuration();
        final long currentPosition = oneVideoPlayer.getCurrentPosition();
        this.a.submit(new Runnable() { // from class: xsna.zy3
            @Override // java.lang.Runnable
            public final void run() {
                dz3.this.b.a.a(new ReefEvent.l(currentPosition, duration));
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
