package xsna;

import android.os.SystemClock;
import one.video.player.BaseVideoPlayer;
import one.video.player.OneVideoPlayer;
import one.video.player.RepeatMode;
import one.video.player.error.OneVideoPlaybackException;

/* compiled from: VideoStallDevNullReporter.kt */
/* loaded from: classes3.dex */
public final class fit0 {
    public dk80 a;
    public OneVideoPlayer b;
    public g4b0 c;
    public g4b0 d;
    public boolean f;
    public long e = -1;
    public final a g = new a();

    public static final void a(final fit0 fit0Var, final OneVideoPlayer oneVideoPlayer) {
        final g4b0 g4b0Var = fit0Var.c;
        if (g4b0Var == null || fit0Var.e <= 0) {
            return;
        }
        final long elapsedRealtime = SystemClock.elapsedRealtime() - fit0Var.e;
        i0q0.f(new gzs() { // from class: xsna.eit0
            @Override // xsna.gzs
            public final Object invoke() {
                new xep(g4b0.this, oneVideoPlayer, elapsedRealtime, false, fit0Var.a).q();
                return s3q0.a;
            }
        });
        fit0Var.e = -1L;
    }

    public static final void b(fit0 fit0Var, OneVideoPlayer oneVideoPlayer) {
        fit0Var.c(oneVideoPlayer);
        fit0Var.f = false;
        fit0Var.e = -1L;
        fit0Var.c(oneVideoPlayer);
        fit0Var.f = false;
        g4b0 g4b0Var = fit0Var.d;
        if (g4b0Var != null) {
            fit0Var.c = g4b0Var;
            fit0Var.d = null;
        }
        fit0Var.e = -1L;
        g4b0 g4b0Var2 = fit0Var.c;
        if (g4b0Var2 != null) {
            g4b0Var2.k = SystemClock.elapsedRealtime();
        }
    }

    public final void c(final OneVideoPlayer oneVideoPlayer) {
        final g4b0 g4b0Var = this.c;
        if (g4b0Var == null || this.e <= 0) {
            return;
        }
        final long elapsedRealtime = SystemClock.elapsedRealtime() - this.e;
        i0q0.f(new gzs() { // from class: xsna.dit0
            @Override // xsna.gzs
            public final Object invoke() {
                new xep(g4b0.this, oneVideoPlayer, elapsedRealtime, true, this.a).q();
                return s3q0.a;
            }
        });
        this.e = -1L;
    }

    public final void d(OneVideoPlayer oneVideoPlayer) {
        if (epx.f(this.b, oneVideoPlayer)) {
            return;
        }
        OneVideoPlayer oneVideoPlayer2 = this.b;
        if (oneVideoPlayer2 != null) {
            c(oneVideoPlayer2);
        }
        this.f = false;
        this.e = -1L;
        this.c = null;
        this.d = null;
        OneVideoPlayer oneVideoPlayer3 = this.b;
        a aVar = this.g;
        if (oneVideoPlayer3 != null) {
            oneVideoPlayer3.c0(aVar);
        }
        if (oneVideoPlayer != null) {
            oneVideoPlayer.d0(aVar);
        }
        this.b = oneVideoPlayer;
    }

    /* compiled from: VideoStallDevNullReporter.kt */
    public static final class a implements one.video.player.f {
        public a() {
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void a(OneVideoPlayer.DiscontinuityReason discontinuityReason, OneVideoPlayer oneVideoPlayer, deb0 deb0Var, deb0 deb0Var2) {
            OneVideoPlayer.DiscontinuityReason discontinuityReason2 = OneVideoPlayer.DiscontinuityReason.SEEK;
            fit0 fit0Var = fit0.this;
            if (discontinuityReason == discontinuityReason2) {
                fit0.a(fit0Var, oneVideoPlayer);
                fit0Var.f = false;
            }
            if (deb0Var.a != deb0Var2.a) {
                if (discontinuityReason == discontinuityReason2 || discontinuityReason == OneVideoPlayer.DiscontinuityReason.AUTO_TRANSITION) {
                    g4b0 g4b0Var = fit0Var.d;
                    if (g4b0Var == null) {
                        g4b0 g4b0Var2 = fit0Var.c;
                        g4b0Var = g4b0Var2 != null ? g4b0Var2.a() : null;
                    }
                    if (g4b0Var != null) {
                        fit0Var.d = g4b0Var;
                    }
                    fit0.b(fit0Var, oneVideoPlayer);
                }
            }
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void f(OneVideoPlayer oneVideoPlayer) {
            fit0.this.c(oneVideoPlayer);
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void s(OneVideoPlayer oneVideoPlayer) {
            fit0.a(fit0.this, oneVideoPlayer);
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void v(OneVideoPlayer oneVideoPlayer) {
            fit0 fit0Var = fit0.this;
            if (fit0Var.c != null) {
                if (fit0Var.f) {
                    fit0Var.e = SystemClock.elapsedRealtime();
                } else {
                    fit0Var.e = -1L;
                    fit0Var.f = true;
                }
            }
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void w(BaseVideoPlayer baseVideoPlayer) {
            fit0.b(fit0.this, baseVideoPlayer);
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void d(OneVideoPlayer oneVideoPlayer) {
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
        public final void q(OneVideoPlaybackException oneVideoPlaybackException, sht0 sht0Var, OneVideoPlayer oneVideoPlayer) {
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void z(BaseVideoPlayer baseVideoPlayer, OneVideoPlayer.State state, OneVideoPlayer.State state2) {
        }
    }
}
