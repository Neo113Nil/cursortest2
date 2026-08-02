package one.video.player;

import android.os.Looper;
import com.vk.movika.sdk.base.ui.r;
import com.vk.movika.sdk.base.ui.s;
import com.vk.movika.sdk.base.ui.z;
import defpackage.c0;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import one.video.player.OneVideoPlayer;
import one.video.player.error.OneVideoPlaybackException;
import xsna.b44;
import xsna.bxb;
import xsna.deb0;
import xsna.dp0;
import xsna.f56;
import xsna.fk;
import xsna.gcj;
import xsna.gzs;
import xsna.hk0;
import xsna.ie3;
import xsna.og1;
import xsna.ozl;
import xsna.p9s;
import xsna.pw;
import xsna.q9s;
import xsna.sht0;
import xsna.t9s;
import xsna.tbb;
import xsna.vob;
import xsna.xk80;

/* compiled from: ForwardingListener.kt */
/* loaded from: classes8.dex */
public final class j implements OneVideoPlayer.c {
    public final vob a = new vob((Looper) null);
    public final CopyOnWriteArrayList<OneVideoPlayer.c> b = new CopyOnWriteArrayList<>();

    @Override // one.video.player.OneVideoPlayer.c
    public final void a(OneVideoPlayer.DiscontinuityReason discontinuityReason, OneVideoPlayer oneVideoPlayer, deb0 deb0Var, deb0 deb0Var2) {
        this.a.k(new q9s(this, oneVideoPlayer, discontinuityReason, deb0Var, deb0Var2, 0));
    }

    @Override // one.video.player.OneVideoPlayer.c
    @ozl
    public final void b(OneVideoPlayer oneVideoPlayer, boolean z) {
        this.a.k(new gcj(this, oneVideoPlayer, z));
    }

    @Override // one.video.player.OneVideoPlayer.c
    public final void c(BaseVideoPlayer baseVideoPlayer, hk0 hk0Var) {
        this.a.k(new og1(this, baseVideoPlayer, hk0Var, 2));
    }

    @Override // one.video.player.OneVideoPlayer.c
    public final void d(OneVideoPlayer oneVideoPlayer) {
        this.a.k(new com.vk.movika.sdk.base.ui.k(9, this, oneVideoPlayer));
    }

    @Override // one.video.player.OneVideoPlayer.c
    public final void e(BaseVideoPlayer baseVideoPlayer, one.video.player.tracks.c cVar) {
        this.a.k(new b44(this, baseVideoPlayer, cVar, 2));
    }

    @Override // one.video.player.OneVideoPlayer.c
    @ozl
    public final void f(OneVideoPlayer oneVideoPlayer) {
        this.a.k(new com.vk.movika.sdk.base.ui.i(14, this, oneVideoPlayer));
    }

    @Override // one.video.player.OneVideoPlayer.c
    public final void g(final BaseVideoPlayer baseVideoPlayer, final float f) {
        this.a.k(new gzs() { // from class: xsna.o9s
            @Override // xsna.gzs
            public final Object invoke() {
                Iterator<OneVideoPlayer.c> it = one.video.player.j.this.b.iterator();
                while (it.hasNext()) {
                    it.next().g(baseVideoPlayer, f);
                }
                return s3q0.a;
            }
        });
    }

    @Override // one.video.player.OneVideoPlayer.c
    @ozl
    public final void h(OneVideoPlayer oneVideoPlayer) {
        this.a.k(new z(3, this, oneVideoPlayer));
    }

    @Override // one.video.player.OneVideoPlayer.c
    public final void i(final OneVideoPlayer oneVideoPlayer, final int i) {
        this.a.k(new gzs() { // from class: xsna.n9s
            @Override // xsna.gzs
            public final Object invoke() {
                Iterator<OneVideoPlayer.c> it = one.video.player.j.this.b.iterator();
                while (it.hasNext()) {
                    it.next().i(oneVideoPlayer, i);
                }
                return s3q0.a;
            }
        });
    }

    @Override // one.video.player.OneVideoPlayer.c
    @ozl
    public final void j(OneVideoPlayer oneVideoPlayer) {
        this.a.k(new fk(7, this, oneVideoPlayer));
    }

    @Override // one.video.player.OneVideoPlayer.c
    public final void k(OneVideoPlayer oneVideoPlayer, long j) {
        this.a.k(new t9s(j, this, oneVideoPlayer, 0));
    }

    @Override // one.video.player.OneVideoPlayer.c
    public final void l(OneVideoPlayer oneVideoPlayer) {
        this.a.k(new com.vk.catalog2.common.ui.holders.a(12, this, oneVideoPlayer));
    }

    @Override // one.video.player.OneVideoPlayer.c
    public final void m(final xk80 xk80Var, final one.video.player.tracks.b bVar, final boolean z) {
        this.a.k(new gzs() { // from class: xsna.s9s
            @Override // xsna.gzs
            public final Object invoke() {
                Iterator<OneVideoPlayer.c> it = one.video.player.j.this.b.iterator();
                while (it.hasNext()) {
                    it.next().m(xk80Var, bVar, z);
                }
                return s3q0.a;
            }
        });
    }

    @Override // one.video.player.OneVideoPlayer.c
    public final void n(xk80 xk80Var, one.video.player.tracks.c cVar) {
        this.a.k(new f56(this, xk80Var, cVar, 1));
    }

    @Override // one.video.player.OneVideoPlayer.c
    public final void o(final BaseVideoPlayer baseVideoPlayer, final float f) {
        this.a.k(new gzs() { // from class: xsna.u9s
            @Override // xsna.gzs
            public final Object invoke() {
                Iterator<OneVideoPlayer.c> it = one.video.player.j.this.b.iterator();
                while (it.hasNext()) {
                    it.next().o(baseVideoPlayer, f);
                }
                return s3q0.a;
            }
        });
    }

    @Override // one.video.player.OneVideoPlayer.c
    public final void p(OneVideoPlayer oneVideoPlayer) {
        this.a.k(new s(9, this, oneVideoPlayer));
    }

    @Override // one.video.player.OneVideoPlayer.c
    public final void q(OneVideoPlaybackException oneVideoPlaybackException, sht0 sht0Var, OneVideoPlayer oneVideoPlayer) {
        this.a.k(new bxb(this, oneVideoPlaybackException, sht0Var, oneVideoPlayer, 1));
    }

    @Override // one.video.player.OneVideoPlayer.c
    @ozl
    public final void r(OneVideoPlayer oneVideoPlayer) {
        this.a.k(new r(11, this, oneVideoPlayer));
    }

    @Override // one.video.player.OneVideoPlayer.c
    @ozl
    public final void s(OneVideoPlayer oneVideoPlayer) {
        this.a.k(new pw(11, this, oneVideoPlayer));
    }

    @Override // one.video.player.OneVideoPlayer.c
    public final void t(OneVideoPlayer oneVideoPlayer, one.video.player.tracks.a aVar) {
        this.a.k(new tbb(this, (BaseVideoPlayer) oneVideoPlayer, aVar, 1));
    }

    @Override // one.video.player.OneVideoPlayer.c
    public final void u(BaseVideoPlayer baseVideoPlayer, RepeatMode repeatMode) {
        this.a.k(new c0(this, baseVideoPlayer, repeatMode, 2));
    }

    @Override // one.video.player.OneVideoPlayer.c
    @ozl
    public final void v(OneVideoPlayer oneVideoPlayer) {
        this.a.k(new com.vk.movika.sdk.base.flow.binding.j(11, this, oneVideoPlayer));
    }

    @Override // one.video.player.OneVideoPlayer.c
    public final void w(BaseVideoPlayer baseVideoPlayer) {
        this.a.k(new dp0(8, this, baseVideoPlayer));
    }

    @Override // one.video.player.OneVideoPlayer.c
    public final void x(OneVideoPlayer oneVideoPlayer) {
        this.a.k(new ie3(11, this, oneVideoPlayer));
    }

    @Override // one.video.player.OneVideoPlayer.c
    @ozl
    public final void y(OneVideoPlayer oneVideoPlayer, boolean z) {
        this.a.k(new p9s(this, oneVideoPlayer, z));
    }

    @Override // one.video.player.OneVideoPlayer.c
    public final void z(final BaseVideoPlayer baseVideoPlayer, final OneVideoPlayer.State state, final OneVideoPlayer.State state2) {
        this.a.k(new gzs() { // from class: xsna.r9s
            @Override // xsna.gzs
            public final Object invoke() {
                Iterator<OneVideoPlayer.c> it = one.video.player.j.this.b.iterator();
                while (it.hasNext()) {
                    it.next().z(baseVideoPlayer, state, state2);
                }
                return s3q0.a;
            }
        });
    }
}
