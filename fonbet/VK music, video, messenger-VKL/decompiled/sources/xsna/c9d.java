package xsna;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Size;
import android.view.View;
import com.vk.media.MediaUtils;
import com.vk.media.playback.di.MediaPlaybackComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
import kotlin.collections.EmptyList;
import one.video.player.BaseVideoPlayer;
import one.video.player.OneVideoPlayer;
import one.video.player.RepeatMode;
import one.video.player.error.OneVideoPlaybackException;
import one.video.view.OneVideoPlayerView;
import xsna.bzd;
import xsna.rpa0;
import xsna.x8d;

/* compiled from: ClipPlaybackControllerImplNew.kt */
/* loaded from: classes16.dex */
public final class c9d implements x8d {
    public final Context a;
    public final e2e b;
    public final OneVideoPlayerView c;
    public final szd d;
    public final bzd.c e;
    public final lxd f;
    public cv10 g;
    public Boolean j;
    public volatile boolean k;
    public long l;
    public io.reactivex.rxjava3.disposables.c o;
    public int q;
    public Long r;
    public Long s;
    public final Handler h = new Handler(Looper.getMainLooper());
    public final a i = new a();
    public final CopyOnWriteArraySet<x8d.b> m = new CopyOnWriteArraySet<>();
    public final CopyOnWriteArraySet<x8d.a> n = new CopyOnWriteArraySet<>();
    public Object p = EmptyList.b;

    /* compiled from: ViewExt.kt */
    public static final class b implements View.OnLayoutChangeListener {
        public final /* synthetic */ com.vk.clips.editor.state.model.a c;
        public final /* synthetic */ Long d;
        public final /* synthetic */ boolean e;

        public b(com.vk.clips.editor.state.model.a aVar, Long l, boolean z) {
            this.c = aVar;
            this.d = l;
            this.e = z;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            view.removeOnLayoutChangeListener(this);
            c9d c9dVar = c9d.this;
            c9d.a(c9dVar, this.c, this.d, this.e, c9dVar.c.getWidth(), c9d.this.c.getHeight());
        }
    }

    public c9d(Context context, e2e e2eVar, OneVideoPlayerView oneVideoPlayerView, szd szdVar, bzd.c cVar, lxd lxdVar) {
        this.a = context;
        this.b = e2eVar;
        this.c = oneVideoPlayerView;
        this.d = szdVar;
        this.e = cVar;
        this.f = lxdVar;
    }

    public static final void a(c9d c9dVar, com.vk.clips.editor.state.model.a aVar, Long l, boolean z, int i, int i2) {
        lxd lxdVar = c9dVar.f;
        if (c9dVar.g == null) {
            MediaPlaybackComponent mediaPlaybackComponent = (MediaPlaybackComponent) ((bpn0) lxdVar.b).getValue();
            Context context = c9dVar.a;
            cv10 Yb = mediaPlaybackComponent.Yb(context.getApplicationContext(), "editor-player");
            c9dVar.g = Yb;
            c9dVar.c.setPlayer(Yb != null ? Yb.a() : null);
            c9dVar.v(new h5(c9dVar, 29));
            cv10 cv10Var = c9dVar.g;
            if (cv10Var != null) {
                cv10Var.d(new d80(3));
                cv10Var.g(new apk(EmptyList.b, context, lxdVar.b().Gd()));
            }
        }
        if (z) {
            c9dVar.k = false;
            c9dVar.e.a(true);
            bzd.this.c.getStickersInteractor().k();
            io.reactivex.rxjava3.disposables.c cVar = c9dVar.o;
            if (cVar != null) {
                cVar.dispose();
            }
        } else {
            c9dVar.q();
        }
        List<com.vk.clips.editor.state.model.c> list = aVar.c;
        ArrayList arrayList = new ArrayList();
        for (com.vk.clips.editor.state.model.c cVar2 : list) {
            q500 q500Var = (q500) j5g.k0(arrayList);
            Long valueOf = q500Var != null ? Long.valueOf(q500Var.c) : null;
            long j = 0;
            long longValue = valueOf != null ? valueOf.longValue() + 1 : 0L;
            if (valueOf != null) {
                j = valueOf.longValue();
            }
            arrayList.add(new q500(longValue, cVar2.getDurationMs() + j));
        }
        c9dVar.p = arrayList;
        rpa0.a a2 = new rpa0(new Size(i, i2), lxdVar.b().Gd()).a(aVar, false, new MediaUtils.d(i, i2));
        long longValue2 = l != null ? l.longValue() : c9dVar.n();
        cv10 cv10Var2 = c9dVar.g;
        if (cv10Var2 != null) {
            cv10Var2.b(new g0b0(a2.a, i, i2), longValue2, new qc(c9dVar, 14));
        }
        c9dVar.r(longValue2);
    }

    @Override // xsna.x8d
    public final void b(boolean z) {
        bzd.this.c.getStickersInteractor().b(z);
    }

    @Override // xsna.x8d
    public final void c(com.vk.clips.editor.state.model.a aVar, Long l, boolean z) {
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        OneVideoPlayerView oneVideoPlayerView = this.c;
        if (oneVideoPlayerView.isLaidOut()) {
            a(this, aVar, l, z, oneVideoPlayerView.getWidth(), oneVideoPlayerView.getHeight());
        } else {
            oneVideoPlayerView.addOnLayoutChangeListener(new b(aVar, l, z));
        }
    }

    @Override // xsna.x8d
    public final void d(boolean z) {
        v(new b9d(this, z, 0));
    }

    @Override // xsna.x8d
    public final void e() {
        v(new j5(this, 18));
    }

    @Override // xsna.x8d
    public final void f(j0e j0eVar) {
        this.m.remove(j0eVar);
    }

    @Override // xsna.x8d
    public final void g(kyd kydVar) {
        if (kydVar == null) {
            this.r = null;
            this.s = null;
            return;
        }
        Long g = this.d.o.a.g(kydVar);
        long longValue = g != null ? g.longValue() : 0L;
        long durationMs = (kydVar.getDurationMs() + longValue) - 1;
        if (durationMs > longValue) {
            this.r = Long.valueOf(longValue);
            this.s = Long.valueOf(durationMs);
        }
    }

    @Override // xsna.x8d
    public final void h(x8d.a aVar) {
        this.n.remove(aVar);
    }

    @Override // xsna.x8d
    public final void i(x8d.b bVar) {
        this.m.add(bVar);
    }

    @Override // xsna.x8d
    public final void j() {
        Boolean bool = this.j;
        if (bool != null) {
            if (bool.booleanValue()) {
                u();
            } else {
                d(true);
            }
            this.j = null;
        }
    }

    @Override // xsna.x8d
    public final void k(x8d.a aVar) {
        this.n.add(aVar);
    }

    @Override // xsna.x8d
    public final void l() {
        v(new iz0(this, 9));
    }

    @Override // xsna.x8d
    public final void m(String str) {
        if (str == null) {
            g(null);
            return;
        }
        kyd d = this.d.o.a.d(str);
        if (d == null) {
            return;
        }
        g(d);
    }

    @Override // xsna.x8d
    public final long n() {
        OneVideoPlayer player = this.c.getPlayer();
        if (player != null) {
            return player.getCurrentPosition();
        }
        return 0L;
    }

    @Override // xsna.x8d
    public final void o() {
        if (this.k) {
            return;
        }
        this.e.a(false);
    }

    @Override // xsna.x8d
    public final void p() {
        if (this.k) {
            return;
        }
        this.e.a(true);
    }

    public final void q() {
        this.k = true;
        this.e.a(false);
        bzd.this.c.getStickersInteractor().m();
        e2e e2eVar = this.b;
        io.reactivex.rxjava3.disposables.c cVar = this.o;
        if (cVar != null) {
            cVar.dispose();
        }
        this.o = hg1.h(io.reactivex.rxjava3.core.q.R(15L, TimeUnit.MILLISECONDS).r0(e2eVar.i.e().d()).a0(e2eVar.i.e().d()), new sz(this, 18));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    public final void r(final long j) {
        int b2;
        Long l = this.r;
        if (l != null) {
            long longValue = l.longValue();
            if (j < longValue) {
                seekTo(longValue);
                return;
            }
        }
        Long l2 = this.s;
        if (l2 != null && j > l2.longValue()) {
            d(true);
            seekTo(0L);
            return;
        }
        b2 = e43.b(r0.size(), this.p, new izs() { // from class: xsna.a9d
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                q500 q500Var = (q500) obj;
                long j2 = q500Var.c;
                long j3 = j;
                return Integer.valueOf(j3 > j2 ? -1 : j3 < q500Var.b ? 1 : 0);
            }
        });
        if (b2 < 0) {
            b2 = 0;
        }
        Iterator<x8d.a> it = this.n.iterator();
        while (it.hasNext()) {
            x8d.a next = it.next();
            this.l = j;
            next.c(j);
        }
        if (b2 < 0 || this.q == b2) {
            return;
        }
        this.q = b2;
        Iterator<x8d.b> it2 = this.m.iterator();
        while (it2.hasNext()) {
            it2.next().a(b2);
        }
    }

    public final void s() {
        io.reactivex.rxjava3.disposables.c cVar = this.o;
        if (cVar != null) {
            cVar.dispose();
        }
        cv10 cv10Var = this.g;
        if (cv10Var != null) {
            cv10Var.release();
        }
        this.g = null;
        OneVideoPlayerView oneVideoPlayerView = this.c;
        OneVideoPlayer player = oneVideoPlayerView.getPlayer();
        if (player != null) {
            player.c0(this.i);
        }
        OneVideoPlayer player2 = oneVideoPlayerView.getPlayer();
        if (player2 != null) {
            player2.release();
        }
        OneVideoPlayer player3 = oneVideoPlayerView.getPlayer();
        if (player3 != null) {
            player3.j0(null);
        }
    }

    @Override // xsna.x8d
    public final void seekTo(long j) {
        v(new sta(j, this, 1));
    }

    public final void t() {
        c(this.d.o.a, Long.valueOf(this.l), !this.k);
    }

    public final void u() {
        v(new po1(this, 18));
    }

    public final void v(izs<? super OneVideoPlayer, s3q0> izsVar) {
        OneVideoPlayer player = this.c.getPlayer();
        if (player != null) {
            Looper myLooper = Looper.myLooper();
            Handler handler = this.h;
            if (epx.f(myLooper, handler.getLooper())) {
                izsVar.invoke(player);
            } else {
                handler.post(new aw(1, izsVar, player));
            }
        }
    }

    /* compiled from: ClipPlaybackControllerImplNew.kt */
    public final class a implements one.video.player.f {
        public a() {
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void a(OneVideoPlayer.DiscontinuityReason discontinuityReason, OneVideoPlayer oneVideoPlayer, deb0 deb0Var, deb0 deb0Var2) {
            if (discontinuityReason == OneVideoPlayer.DiscontinuityReason.AUTO_TRANSITION || discontinuityReason == OneVideoPlayer.DiscontinuityReason.SEEK) {
                c9d.this.r(deb0Var2.b);
            }
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void h(OneVideoPlayer oneVideoPlayer) {
            c9d c9dVar = c9d.this;
            c9dVar.d(true);
            c9dVar.seekTo(0L);
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void q(OneVideoPlaybackException oneVideoPlaybackException, sht0 sht0Var, OneVideoPlayer oneVideoPlayer) {
            lyd.a.b(oneVideoPlaybackException);
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
}
