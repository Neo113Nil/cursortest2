package xsna;

import one.video.player.BaseVideoPlayer;
import one.video.player.OneVideoPlayer;
import one.video.player.RepeatMode;
import one.video.player.error.OneVideoPlaybackException;

/* compiled from: OpenTelemetryCollector.kt */
/* loaded from: classes17.dex */
public final class js80 implements one.video.player.f {
    public final /* synthetic */ ks80 a;

    public js80(ks80 ks80Var) {
        this.a = ks80Var;
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void a(OneVideoPlayer.DiscontinuityReason discontinuityReason, OneVideoPlayer oneVideoPlayer, deb0 deb0Var, deb0 deb0Var2) {
        ks80.e(oneVideoPlayer, new swe(discontinuityReason, deb0Var, deb0Var2, this.a, 5));
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void e(BaseVideoPlayer baseVideoPlayer, one.video.player.tracks.c cVar) {
        cms0 cms0Var;
        cms0 cms0Var2;
        final ks80 ks80Var = this.a;
        ks80.e(baseVideoPlayer, new ue40(2, cVar, ks80Var));
        final int i = 0;
        final int i2 = (cVar == null || (cms0Var2 = (cms0) cVar.c) == null) ? 0 : cms0Var2.e;
        if (cVar != null && (cms0Var = (cms0) cVar.c) != null) {
            i = cms0Var.f;
        }
        if (i2 != 0) {
            ks80.e(baseVideoPlayer, new izs() { // from class: xsna.hs80
                @Override // xsna.izs
                public final Object invoke(Object obj) {
                    ohk0 f = ks80.this.f().f((String) obj);
                    if (f != null) {
                        f.j("onVideoSizeChanged", new lk3().a(i2, "width").a(i, "height").a(0L, "unappliedRotationDegrees").a(1L, "pixelWidthHeightRatio").e());
                    }
                    return s3q0.a;
                }
            });
        }
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void f(OneVideoPlayer oneVideoPlayer) {
        ks80 ks80Var = this.a;
        ks80.d(ks80Var, oneVideoPlayer, new om9(ks80Var, 9));
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void h(OneVideoPlayer oneVideoPlayer) {
        ks80 ks80Var = this.a;
        ks80.d(ks80Var, oneVideoPlayer, new vg3(ks80Var, 6));
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void i(OneVideoPlayer oneVideoPlayer, int i) {
        ks80.e(oneVideoPlayer, new uf4(i, this.a));
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void j(OneVideoPlayer oneVideoPlayer) {
        ks80 ks80Var = this.a;
        ks80.e(oneVideoPlayer, new z63(ks80Var, oneVideoPlayer, new nz1(8, ks80Var, oneVideoPlayer), 10));
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void l(OneVideoPlayer oneVideoPlayer) {
        ks80.e(oneVideoPlayer, new c2u(this.a, 29));
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void o(BaseVideoPlayer baseVideoPlayer, final float f) {
        final ks80 ks80Var = this.a;
        ks80.e(baseVideoPlayer, new izs() { // from class: xsna.is80
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                jk3 e = new lk3().c(f, "playbackSpeed").e();
                ohk0 f2 = ks80Var.f().f((String) obj);
                if (f2 != null) {
                    f2.j("onPlaybackSpeedChanged", e);
                }
                return s3q0.a;
            }
        });
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void p(OneVideoPlayer oneVideoPlayer) {
        ks80 ks80Var = this.a;
        ks80Var.d.post(new lx5(ks80Var, oneVideoPlayer, new x2y(ks80Var, 22)));
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void q(OneVideoPlaybackException oneVideoPlaybackException, sht0 sht0Var, OneVideoPlayer oneVideoPlayer) {
        ks80 ks80Var = this.a;
        ks80.d(ks80Var, oneVideoPlayer, new t6n(ks80Var, sht0Var, oneVideoPlaybackException, 2));
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void r(OneVideoPlayer oneVideoPlayer) {
        ks80 ks80Var = this.a;
        ks80.e(oneVideoPlayer, new z63(ks80Var, oneVideoPlayer, new qg(5, ks80Var, oneVideoPlayer), 10));
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void t(OneVideoPlayer oneVideoPlayer, one.video.player.tracks.a aVar) {
        ks80.e(oneVideoPlayer, new gs80(0, aVar, this.a));
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void v(OneVideoPlayer oneVideoPlayer) {
        ks80 ks80Var = this.a;
        ks80.e(oneVideoPlayer, new z63(ks80Var, oneVideoPlayer, new r21(5, ks80Var, oneVideoPlayer), 10));
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void w(BaseVideoPlayer baseVideoPlayer) {
        ks80 ks80Var = this.a;
        ks80.e(baseVideoPlayer, new z63(ks80Var, baseVideoPlayer, new jz1(4, ks80Var, baseVideoPlayer), 10));
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void x(OneVideoPlayer oneVideoPlayer) {
        ks80.e(oneVideoPlayer, new bbw(this.a, 18));
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void d(OneVideoPlayer oneVideoPlayer) {
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    @ozl
    public final void s(OneVideoPlayer oneVideoPlayer) {
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
    public final void k(OneVideoPlayer oneVideoPlayer, long j) {
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void n(xk80 xk80Var, one.video.player.tracks.c cVar) {
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
