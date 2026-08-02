package xsna;

import com.vk.media.player.PlayerError;
import com.vk.media.player.video.view.PlaylistPlayerVideoView;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import one.video.player.BaseVideoPlayer;
import one.video.player.OneVideoPlayer;
import one.video.player.RepeatMode;
import one.video.player.error.OneVideoPlaybackException;
import one.video.player.error.OneVideoSourceException;
import one.video.player.model.FrameSize;
import xsna.c360;
import xsna.o1b0;
import xsna.tu70;

/* compiled from: PlayerListeners.kt */
/* loaded from: classes6.dex */
public final class q2b0 implements p2b0 {
    public final PlaylistPlayerVideoView a;
    public final p3h b;
    public final CopyOnWriteArrayList<OneVideoPlayer.c> c = new CopyOnWriteArrayList<>();
    public final ujs0 d = new ujs0(false, c360.a.e, tu70.a.C3775a.b, null, false);
    public final g2z e = new g2z();
    public d3b0 f;

    public q2b0(PlaylistPlayerVideoView playlistPlayerVideoView, p3h p3hVar) {
        this.a = playlistPlayerVideoView;
        this.b = p3hVar;
    }

    @Override // xsna.p2b0
    public final void A(d3b0 d3b0Var) {
        this.f = d3b0Var;
    }

    @Override // xsna.p2b0
    public final List<String> B() {
        return j5g.O0((LinkedHashSet) this.e.b);
    }

    @Override // xsna.p2b0
    public final void D(one.video.player.f fVar) {
        this.c.add(fVar);
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void a(OneVideoPlayer.DiscontinuityReason discontinuityReason, OneVideoPlayer oneVideoPlayer, deb0 deb0Var, deb0 deb0Var2) {
        Iterator<OneVideoPlayer.c> it = this.c.iterator();
        while (it.hasNext()) {
            it.next().a(discontinuityReason, oneVideoPlayer, deb0Var, deb0Var2);
        }
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void b(OneVideoPlayer oneVideoPlayer, boolean z) {
        Iterator<OneVideoPlayer.c> it = this.c.iterator();
        while (it.hasNext()) {
            it.next().b(oneVideoPlayer, z);
        }
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void c(BaseVideoPlayer baseVideoPlayer, hk0 hk0Var) {
        Iterator<OneVideoPlayer.c> it = this.c.iterator();
        while (it.hasNext()) {
            it.next().c(baseVideoPlayer, hk0Var);
        }
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void d(OneVideoPlayer oneVideoPlayer) {
        Iterator<OneVideoPlayer.c> it = this.c.iterator();
        while (it.hasNext()) {
            it.next().d(oneVideoPlayer);
        }
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void e(BaseVideoPlayer baseVideoPlayer, one.video.player.tracks.c cVar) {
        Iterator<OneVideoPlayer.c> it = this.c.iterator();
        while (it.hasNext()) {
            it.next().e(baseVideoPlayer, cVar);
        }
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void f(OneVideoPlayer oneVideoPlayer) {
        Iterator<OneVideoPlayer.c> it = this.c.iterator();
        while (it.hasNext()) {
            it.next().f(oneVideoPlayer);
        }
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void g(BaseVideoPlayer baseVideoPlayer, float f) {
        Iterator<OneVideoPlayer.c> it = this.c.iterator();
        while (it.hasNext()) {
            it.next().g(baseVideoPlayer, f);
        }
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void h(OneVideoPlayer oneVideoPlayer) {
        Iterator<OneVideoPlayer.c> it = this.c.iterator();
        while (it.hasNext()) {
            it.next().h(oneVideoPlayer);
        }
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void i(OneVideoPlayer oneVideoPlayer, int i) {
        Iterator<OneVideoPlayer.c> it = this.c.iterator();
        while (it.hasNext()) {
            it.next().i(oneVideoPlayer, i);
        }
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void j(OneVideoPlayer oneVideoPlayer) {
        Iterator<OneVideoPlayer.c> it = this.c.iterator();
        while (it.hasNext()) {
            it.next().j(oneVideoPlayer);
        }
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void k(OneVideoPlayer oneVideoPlayer, long j) {
        Iterator<OneVideoPlayer.c> it = this.c.iterator();
        while (it.hasNext()) {
            it.next().k(oneVideoPlayer, j);
        }
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void l(OneVideoPlayer oneVideoPlayer) {
        Iterator<OneVideoPlayer.c> it = this.c.iterator();
        while (it.hasNext()) {
            it.next().l(oneVideoPlayer);
        }
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void m(xk80 xk80Var, one.video.player.tracks.b bVar, boolean z) {
        Iterator<OneVideoPlayer.c> it = this.c.iterator();
        while (it.hasNext()) {
            it.next().m(xk80Var, bVar, z);
        }
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void n(xk80 xk80Var, one.video.player.tracks.c cVar) {
        Iterator<OneVideoPlayer.c> it = this.c.iterator();
        while (it.hasNext()) {
            it.next().n(xk80Var, cVar);
        }
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void o(BaseVideoPlayer baseVideoPlayer, float f) {
        Iterator<OneVideoPlayer.c> it = this.c.iterator();
        while (it.hasNext()) {
            it.next().o(baseVideoPlayer, f);
        }
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void p(OneVideoPlayer oneVideoPlayer) {
        Iterator<OneVideoPlayer.c> it = this.c.iterator();
        while (it.hasNext()) {
            it.next().p(oneVideoPlayer);
        }
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void q(OneVideoPlaybackException oneVideoPlaybackException, sht0 sht0Var, OneVideoPlayer oneVideoPlayer) {
        PlayerError playerError;
        OneVideoSourceException.a g;
        OneVideoPlaybackException oneVideoPlaybackException2;
        sht0 e;
        OneVideoPlayer a;
        one.video.player.tracks.c E;
        cms0 cms0Var;
        FrameSize b;
        if (oneVideoPlaybackException.j() == OneVideoPlaybackException.Type.UNRESOLVED) {
            playerError = PlayerError.ERROR_NOT_SUPPORT;
        } else if (oneVideoPlaybackException.j() == OneVideoPlaybackException.Type.RENDERER) {
            playerError = PlayerError.ERROR_CANT_DECODE;
        } else {
            if (oneVideoPlaybackException.j() == OneVideoPlaybackException.Type.SOURCE) {
                OneVideoSourceException i = oneVideoPlaybackException.i();
                if (((i == null || (g = i.g()) == null) ? null : Integer.valueOf(g.a)) != null) {
                    playerError = PlayerError.ERROR_SERVER;
                }
            }
            playerError = oneVideoPlaybackException.j() == OneVideoPlaybackException.Type.UNEXPECTED ? PlayerError.ERROR_NOT_SUPPORT_RESOLUTION : PlayerError.ERROR_NETWORK;
        }
        PlayerError playerError2 = playerError;
        PlaylistPlayerVideoView playlistPlayerVideoView = this.a;
        m7q videoSource = playlistPlayerVideoView.getVideoSource();
        List<avp> a2 = this.d.a(oneVideoPlaybackException, videoSource, oneVideoPlayer.getCurrentPosition());
        rlt0 rlt0Var = ((q7r) this.b.c).n;
        boolean z = false;
        if (rlt0Var != null) {
            Integer a3 = vm80.a(oneVideoPlayer);
            int intValue = a3 != null ? a3.intValue() : -1;
            d3b0 d3b0Var = this.f;
            oneVideoPlaybackException2 = oneVideoPlaybackException;
            rlt0Var.k(playerError2, videoSource, intValue, (d3b0Var == null || (a = d3b0Var.a()) == null || (E = a.E()) == null || (cms0Var = (cms0) E.c) == null || (b = cms0Var.b()) == null) ? 0 : b.getHeight(), oneVideoPlaybackException2, a2.contains(yhj0.a));
        } else {
            oneVideoPlaybackException2 = oneVideoPlaybackException;
        }
        for (avp avpVar : a2) {
            if (epx.f(avpVar, l9g0.a)) {
                m7q m7qVar = (m7q) j5g.a0(playlistPlayerVideoView.p);
                if (m7qVar != null && (e = jgz.e(m7qVar)) != null) {
                    o1b0 c = qu5.c();
                    o1b0.a aVar = o1b0.a;
                    c.f(e, true);
                    playlistPlayerVideoView.e();
                    playlistPlayerVideoView.setPlayWhenReady(true);
                }
            } else if (epx.f(avpVar, b9l.a)) {
                o1b0 c2 = qu5.c();
                o1b0.a aVar2 = o1b0.a;
                c2.j(1);
            } else if (avpVar instanceof unn0) {
                playlistPlayerVideoView.f(((unn0) avpVar).a);
            } else if (avpVar instanceof h8l) {
                ((LinkedHashSet) this.e.b).add(((h8l) avpVar).a);
            } else {
                if (!(avpVar instanceof ova0) && !(avpVar instanceof pva0) && !epx.f(avpVar, mij0.a) && !epx.f(avpVar, yhj0.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                z = true;
            }
        }
        if (z) {
            Iterator<OneVideoPlayer.c> it = this.c.iterator();
            while (it.hasNext()) {
                it.next().q(oneVideoPlaybackException2, sht0Var, oneVideoPlayer);
            }
        }
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void r(OneVideoPlayer oneVideoPlayer) {
        Iterator<OneVideoPlayer.c> it = this.c.iterator();
        while (it.hasNext()) {
            it.next().r(oneVideoPlayer);
        }
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void s(OneVideoPlayer oneVideoPlayer) {
        Iterator<T> it = this.d.b.iterator();
        while (it.hasNext()) {
            ((owp) it.next()).reset();
        }
        Iterator<OneVideoPlayer.c> it2 = this.c.iterator();
        while (it2.hasNext()) {
            it2.next().s(oneVideoPlayer);
        }
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void t(OneVideoPlayer oneVideoPlayer, one.video.player.tracks.a aVar) {
        Iterator<OneVideoPlayer.c> it = this.c.iterator();
        while (it.hasNext()) {
            it.next().t(oneVideoPlayer, aVar);
        }
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void v(OneVideoPlayer oneVideoPlayer) {
        Iterator<OneVideoPlayer.c> it = this.c.iterator();
        while (it.hasNext()) {
            it.next().v(oneVideoPlayer);
        }
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void w(BaseVideoPlayer baseVideoPlayer) {
        Iterator<OneVideoPlayer.c> it = this.c.iterator();
        while (it.hasNext()) {
            it.next().w(baseVideoPlayer);
        }
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void x(OneVideoPlayer oneVideoPlayer) {
        Iterator<OneVideoPlayer.c> it = this.c.iterator();
        while (it.hasNext()) {
            it.next().x(oneVideoPlayer);
        }
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void y(OneVideoPlayer oneVideoPlayer, boolean z) {
        Iterator<OneVideoPlayer.c> it = this.c.iterator();
        while (it.hasNext()) {
            it.next().y(oneVideoPlayer, z);
        }
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void z(BaseVideoPlayer baseVideoPlayer, OneVideoPlayer.State state, OneVideoPlayer.State state2) {
        Iterator<OneVideoPlayer.c> it = this.c.iterator();
        while (it.hasNext()) {
            it.next().z(baseVideoPlayer, state, state2);
        }
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void u(BaseVideoPlayer baseVideoPlayer, RepeatMode repeatMode) {
    }
}
