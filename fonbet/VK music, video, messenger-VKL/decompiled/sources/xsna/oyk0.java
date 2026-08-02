package xsna;

import android.net.Uri;
import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicLong;
import one.video.player.BaseVideoPlayer;
import one.video.player.OneVideoPlayer;
import one.video.player.error.OneVideoPlaybackException;
import one.video.statistics2.FirstSendEventManager;

/* compiled from: StatisticListener.kt */
@ozl
/* loaded from: classes8.dex */
public abstract class oyk0 {
    public final ww40 a;
    public final boolean b;
    public final a c;
    public final fgq d;
    public final egq e;
    public OneVideoPlayer f;
    public final a g;
    public pjz h;
    public g4b0 i;
    public g4b0 j;
    public long k;
    public final FirstSendEventManager l;
    public final AtomicLong m;
    public final b n;
    public boolean o;
    public boolean p;
    public final c q;
    public final d r;
    public final e s;
    public final nyk0 t;

    /* compiled from: StatisticListener.kt */
    public final class a {
        public a() {
        }

        public final void a(OneVideoPlaybackException oneVideoPlaybackException, OneVideoPlayer oneVideoPlayer, awp awpVar) {
            oyk0 oyk0Var = oyk0.this;
            g4b0 g4b0Var = oyk0Var.i;
            if (g4b0Var != null) {
                oyk0Var.l(oneVideoPlaybackException, awpVar, oyk0.f(oyk0Var, oneVideoPlayer, oyk0Var.d), g4b0Var);
            }
        }
    }

    /* compiled from: StatisticListener.kt */
    public final class b extends uds0 {
        public b() {
        }
    }

    /* compiled from: StatisticListener.kt */
    public static final class c implements one.video.player.f {
        public c() {
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void a(OneVideoPlayer.DiscontinuityReason discontinuityReason, OneVideoPlayer oneVideoPlayer, deb0 deb0Var, deb0 deb0Var2) {
            oyk0 oyk0Var = oyk0.this;
            oyk0Var.n.r0();
            oyk0Var.g(oneVideoPlayer);
            b bVar = oyk0Var.n;
            long j = deb0Var2.b;
            bVar.q0(j);
            oyk0Var.g(oneVideoPlayer);
            g4b0 g4b0Var = null;
            if (deb0Var.a != deb0Var2.a) {
                g4b0 g4b0Var2 = oyk0Var.j;
                if (g4b0Var2 == null) {
                    g4b0 g4b0Var3 = oyk0Var.i;
                    if (g4b0Var3 != null) {
                        g4b0Var = g4b0Var3.a();
                    }
                } else {
                    g4b0Var = g4b0Var2;
                }
                if (g4b0Var != null) {
                    oyk0Var.y(g4b0Var);
                }
                oyk0.b(oyk0Var, oneVideoPlayer);
                return;
            }
            if (discontinuityReason == OneVideoPlayer.DiscontinuityReason.SEEK || discontinuityReason == OneVideoPlayer.DiscontinuityReason.AUTO_TRANSITION) {
                g4b0 g4b0Var4 = oyk0Var.j;
                if (g4b0Var4 != null) {
                    String str = g4b0Var4.b;
                    g4b0 g4b0Var5 = oyk0Var.i;
                    if (!epx.f(str, g4b0Var5 != null ? g4b0Var5.b : null)) {
                        oyk0.b(oyk0Var, oneVideoPlayer);
                    }
                }
                g4b0 g4b0Var6 = oyk0Var.i;
                if (g4b0Var6 != null) {
                    oyk0Var.s(g4b0Var6, oyk0.f(oyk0Var, oneVideoPlayer, oyk0Var.d), j);
                }
                oyk0.a(oyk0Var, oneVideoPlayer);
                oyk0Var.o = false;
            }
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void e(BaseVideoPlayer baseVideoPlayer, one.video.player.tracks.c cVar) {
            oyk0 oyk0Var = oyk0.this;
            g4b0 g4b0Var = oyk0Var.i;
            if (g4b0Var != null) {
                oyk0Var.j(g4b0Var, oyk0.f(oyk0Var, baseVideoPlayer, oyk0Var.d), cVar);
            }
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        @ozl
        public final void f(OneVideoPlayer oneVideoPlayer) {
            oyk0 oyk0Var = oyk0.this;
            oyk0Var.w(oneVideoPlayer);
            g4b0 g4b0Var = oyk0Var.i;
            if (g4b0Var != null) {
                oyk0Var.t(g4b0Var, oyk0.f(oyk0Var, oneVideoPlayer, oyk0Var.d));
            }
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void l(OneVideoPlayer oneVideoPlayer) {
            oyk0 oyk0Var = oyk0.this;
            g4b0 g4b0Var = oyk0Var.i;
            if (g4b0Var != null) {
                FirstSendEventManager firstSendEventManager = oyk0Var.l;
                if (firstSendEventManager.a.add(FirstSendEventManager.Event.FIRST_FRAME_RENDERED)) {
                    oyk0Var.n(g4b0Var, oyk0.f(oyk0Var, oneVideoPlayer, oyk0Var.d), SystemClock.elapsedRealtime() - g4b0Var.k);
                }
            }
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void n(xk80 xk80Var, one.video.player.tracks.c cVar) {
            if (wn80.p) {
                return;
            }
            oyk0 oyk0Var = oyk0.this;
            oyk0.a(oyk0Var, xk80Var);
            oyk0Var.o = false;
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void p(OneVideoPlayer oneVideoPlayer) {
            oyk0 oyk0Var = oyk0.this;
            g4b0 g4b0Var = oyk0Var.i;
            if (g4b0Var != null) {
                oyk0Var.m(g4b0Var, oyk0.f(oyk0Var, oneVideoPlayer, oyk0Var.d), SystemClock.elapsedRealtime() - g4b0Var.k);
            }
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void q(OneVideoPlaybackException oneVideoPlaybackException, sht0 sht0Var, OneVideoPlayer oneVideoPlayer) {
            oyk0 oyk0Var = oyk0.this;
            if (oyk0Var.b) {
                return;
            }
            oyk0Var.c.a(oneVideoPlaybackException, oneVideoPlayer, null);
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        @ozl
        public final void r(OneVideoPlayer oneVideoPlayer) {
            oyk0 oyk0Var = oyk0.this;
            g4b0 g4b0Var = oyk0Var.i;
            if (g4b0Var != null) {
                oyk0Var.p(g4b0Var, oyk0.f(oyk0Var, oneVideoPlayer, oyk0Var.d), oneVideoPlayer.getCurrentPosition());
            }
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        @ozl
        public final void s(OneVideoPlayer oneVideoPlayer) {
            oyk0 oyk0Var = oyk0.this;
            oyk0.a(oyk0Var, oneVideoPlayer);
            g4b0 g4b0Var = oyk0Var.i;
            if (g4b0Var != null) {
                FirstSendEventManager firstSendEventManager = oyk0Var.l;
                if (firstSendEventManager.a.add(FirstSendEventManager.Event.READY)) {
                    oyk0Var.r(g4b0Var, oyk0.f(oyk0Var, oneVideoPlayer, oyk0Var.d), SystemClock.elapsedRealtime() - g4b0Var.k);
                }
            }
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        @ozl
        public final void v(OneVideoPlayer oneVideoPlayer) {
            oyk0 oyk0Var = oyk0.this;
            if (oyk0Var.i != null) {
                if (oyk0Var.o) {
                    oyk0Var.k = SystemClock.elapsedRealtime();
                } else {
                    oyk0Var.k = -1L;
                    oyk0Var.o = true;
                }
            }
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void w(BaseVideoPlayer baseVideoPlayer) {
            oyk0.b(oyk0.this, baseVideoPlayer);
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        @ozl
        public final void y(OneVideoPlayer oneVideoPlayer, boolean z) {
            oyk0 oyk0Var = oyk0.this;
            g4b0 g4b0Var = oyk0Var.i;
            if (g4b0Var != null) {
                if (!z) {
                    oyk0Var.n.r0();
                    oyk0Var.g(oneVideoPlayer);
                    return;
                }
                FirstSendEventManager firstSendEventManager = oyk0Var.l;
                if (firstSendEventManager.a.add(FirstSendEventManager.Event.PLAYING)) {
                    oyk0Var.o(g4b0Var, oyk0.f(oyk0Var, oneVideoPlayer, oyk0Var.d), SystemClock.elapsedRealtime() - g4b0Var.k);
                }
                oyk0Var.n.q0(oneVideoPlayer.getCurrentPosition());
            }
        }
    }

    /* compiled from: StatisticListener.kt */
    public static final class d implements OneVideoPlayer.d {
        public d() {
        }

        @Override // one.video.player.OneVideoPlayer.d
        public final void C(BaseVideoPlayer baseVideoPlayer, long j) {
            oyk0 oyk0Var = oyk0.this;
            if (oyk0Var.i != null) {
                b bVar = oyk0Var.n;
                g4b0 g4b0Var = oyk0.this.i;
                if (g4b0Var != null ? g4b0Var.h : false) {
                    j = SystemClock.elapsedRealtime();
                }
                oyk0 oyk0Var2 = oyk0.this;
                OneVideoPlayer oneVideoPlayer = oyk0Var2.f;
                if (oneVideoPlayer != null && wn80.c) {
                    g4b0 g4b0Var2 = oyk0Var2.i;
                    if (g4b0Var2 != null ? g4b0Var2.h : false) {
                        epx.f(Looper.myLooper(), Looper.getMainLooper());
                        if (oneVideoPlayer.getState() == OneVideoPlayer.State.PLAYING && oneVideoPlayer.getCurrentPosition() == 0) {
                            oyk0Var2.h = new pjz(oneVideoPlayer.u(), oneVideoPlayer.getBufferedPosition() - oneVideoPlayer.Z());
                        }
                    }
                }
                tds0 tds0Var = bVar.b;
                long j2 = tds0Var.a;
                if (j2 >= 0 && j > tds0Var.b) {
                    tds0Var.b = j;
                }
                if (!oyk0Var2.p || j - j2 <= bVar.c) {
                    return;
                }
                bVar.r0();
                bVar.q0(j);
            }
        }
    }

    /* compiled from: StatisticListener.kt */
    public static final class e implements one.video.player.g {
        public e() {
        }

        @Override // one.video.player.g, one.video.player.OneVideoPlayer.f
        public final void a(OneVideoPlayer oneVideoPlayer, Uri uri, long j, boolean z, int i) {
            oyk0.this.m.addAndGet(i);
        }
    }

    public /* synthetic */ oyk0(ww40 ww40Var, int i) {
        this((i & 1) != 0 ? null : ww40Var, false);
    }

    public static final void a(oyk0 oyk0Var, OneVideoPlayer oneVideoPlayer) {
        g4b0 g4b0Var = oyk0Var.i;
        if (g4b0Var == null || oyk0Var.k <= 0) {
            return;
        }
        oyk0Var.k(g4b0Var, f(oyk0Var, oneVideoPlayer, oyk0Var.d), SystemClock.elapsedRealtime() - oyk0Var.k);
        oyk0Var.k = -1L;
    }

    public static final void b(oyk0 oyk0Var, OneVideoPlayer oneVideoPlayer) {
        FirstSendEventManager firstSendEventManager = oyk0Var.l;
        oyk0Var.x(oneVideoPlayer);
        oyk0Var.g(oneVideoPlayer);
        oyk0Var.w(oneVideoPlayer);
        oyk0Var.o = false;
        g4b0 g4b0Var = oyk0Var.j;
        if (g4b0Var != null) {
            oyk0Var.i = g4b0Var;
            oyk0Var.j = null;
        }
        firstSendEventManager.a.clear();
        oyk0Var.k = -1L;
        g4b0 g4b0Var2 = oyk0Var.i;
        if (g4b0Var2 != null) {
            oyk0Var.n.b.a();
            g4b0Var2.k = SystemClock.elapsedRealtime();
        }
        g4b0 g4b0Var3 = oyk0Var.i;
        if (g4b0Var3 != null) {
            if (firstSendEventManager.a.add(FirstSendEventManager.Event.PLAY)) {
                oyk0Var.q(g4b0Var3, f(oyk0Var, oneVideoPlayer, oyk0Var.d));
            }
        }
    }

    public static omx f(oyk0 oyk0Var, OneVideoPlayer oneVideoPlayer, fgq fgqVar) {
        ww40 ww40Var = oyk0Var.a;
        return new omx(oneVideoPlayer, fgqVar, null, null, ww40Var != null ? ww40Var.a() : null);
    }

    public final void c(Object obj, String str) {
        bj80 bj80Var = (bj80) this;
        defpackage.d0 d0Var = new defpackage.d0(str, obj, bj80Var, 5);
        nyk0 nyk0Var = this.t;
        e(d0Var, nyk0Var);
        g4b0 g4b0Var = this.i;
        if (g4b0Var != null) {
            g4b0Var.j.put(str, obj);
        }
        e(new z4d0(bj80Var, 8), nyk0Var);
    }

    public final String d() {
        return y57.a("statInfo: ", this.i != null ? "YES" : "NO", " nextStatInfo: ", this.j != null ? "YES" : "NO");
    }

    public final void e(gzs gzsVar, nyk0 nyk0Var) {
        if (!wn80.h) {
            if (nyk0Var != null) {
                new Exception();
            }
            int i = wn80.a;
            return;
        }
        if (wn80.q) {
            if (nyk0Var != null) {
                new Exception();
            }
        }
    }

    public final void g(OneVideoPlayer oneVideoPlayer) {
        g4b0 g4b0Var = this.i;
        if (g4b0Var != null) {
            long andSet = this.m.getAndSet(0L);
            if (andSet > 0) {
                h(g4b0Var, f(this, oneVideoPlayer, this.d), andSet);
            }
        }
    }

    public abstract void h(g4b0 g4b0Var, omx omxVar, long j);

    public abstract void i(g4b0 g4b0Var, omx omxVar, long j);

    public abstract void j(g4b0 g4b0Var, omx omxVar, one.video.player.tracks.c cVar);

    public abstract void k(g4b0 g4b0Var, omx omxVar, long j);

    public abstract void l(OneVideoPlaybackException oneVideoPlaybackException, awp awpVar, omx omxVar, g4b0 g4b0Var);

    public abstract void m(g4b0 g4b0Var, omx omxVar, long j);

    public abstract void n(g4b0 g4b0Var, omx omxVar, long j);

    public abstract void o(g4b0 g4b0Var, omx omxVar, long j);

    public abstract void p(g4b0 g4b0Var, omx omxVar, long j);

    public abstract void q(g4b0 g4b0Var, omx omxVar);

    public abstract void r(g4b0 g4b0Var, omx omxVar, long j);

    public abstract void s(g4b0 g4b0Var, omx omxVar, long j);

    public abstract void t(g4b0 g4b0Var, omx omxVar);

    public abstract void u(g4b0 g4b0Var, omx omxVar, long j, long j2);

    public abstract void v(g4b0 g4b0Var, omx omxVar, long j, long j2);

    public final void w(OneVideoPlayer oneVideoPlayer) {
        g4b0 g4b0Var = this.i;
        if (g4b0Var == null || this.k <= 0) {
            return;
        }
        i(g4b0Var, f(this, oneVideoPlayer, this.d), SystemClock.elapsedRealtime() - this.k);
        this.k = -1L;
    }

    public final void x(OneVideoPlayer oneVideoPlayer) {
        b bVar = this.n;
        if (oneVideoPlayer != null) {
            long r0 = bVar.r0();
            if (r0 >= 0) {
                bVar.q0(r0);
            }
            g(oneVideoPlayer);
            w(oneVideoPlayer);
        }
        this.o = false;
        this.h = null;
        this.k = -1L;
        this.l.a.clear();
        this.m.set(0L);
        bVar.b.a();
    }

    public final void y(g4b0 g4b0Var) {
        e(new wp40(g4b0Var, 23), this.t);
        this.j = g4b0Var;
    }

    public final void z(OneVideoPlayer oneVideoPlayer) {
        OneVideoPlayer oneVideoPlayer2;
        if (epx.f(this.f, oneVideoPlayer)) {
            return;
        }
        e(new rs0(22, this, oneVideoPlayer), this.t);
        x(this.f);
        this.i = null;
        this.j = null;
        OneVideoPlayer oneVideoPlayer3 = this.f;
        c cVar = this.q;
        if (oneVideoPlayer3 != null) {
            oneVideoPlayer3.c0(cVar);
        }
        OneVideoPlayer oneVideoPlayer4 = this.f;
        d dVar = this.r;
        if (oneVideoPlayer4 != null) {
            oneVideoPlayer4.T(dVar);
        }
        OneVideoPlayer oneVideoPlayer5 = this.f;
        e eVar = this.s;
        if (oneVideoPlayer5 != null) {
            oneVideoPlayer5.r(eVar);
        }
        egq egqVar = this.e;
        if (egqVar != null && (oneVideoPlayer2 = this.f) != null) {
            oneVideoPlayer2.K(egqVar);
        }
        if (oneVideoPlayer != null) {
            oneVideoPlayer.d0(cVar);
        }
        if (oneVideoPlayer != null) {
            oneVideoPlayer.s(dVar);
        }
        if (oneVideoPlayer != null) {
            oneVideoPlayer.W(eVar);
        }
        if (egqVar != null && oneVideoPlayer != null) {
            oneVideoPlayer.D(egqVar);
        }
        this.f = oneVideoPlayer;
    }

    public oyk0(ww40 ww40Var, boolean z) {
        this.a = ww40Var;
        this.b = z;
        a aVar = new a();
        this.c = aVar;
        fgq fgqVar = wn80.v ? new fgq() : null;
        this.d = fgqVar;
        this.e = fgqVar != null ? new egq(fgqVar) : null;
        this.g = z ? aVar : null;
        this.k = -1L;
        this.l = new FirstSendEventManager();
        this.m = new AtomicLong(0L);
        this.n = new b();
        this.p = true;
        this.q = new c();
        this.r = new d();
        this.s = new e();
        this.t = new nyk0(0);
    }
}
