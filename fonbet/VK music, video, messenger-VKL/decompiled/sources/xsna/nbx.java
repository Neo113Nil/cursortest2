package xsna;

import android.content.Context;
import com.vk.media.player.PlayerError;
import com.vk.movika.sdk.base.hooks.i;
import com.vk.movika.sdk.base.hooks.q;
import com.vk.movika.sdk.base.logic.dto.c;
import com.vk.movika.sdk.base.ui.d;
import com.vk.movika.sdk.player.base.listener.PlaybackStateListener;
import com.vk.toggle.features.VideoFeatures;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.LazyThreadSafetyMode;
import one.video.player.BaseVideoPlayer;
import one.video.player.OneVideoPlayer;
import one.video.player.RepeatMode;
import one.video.player.error.OneVideoPlaybackException;
import xsna.acx;
import xsna.cbx;
import xsna.ocx;
import xsna.ugl;

/* compiled from: InteractivePlayerBundleHelper.kt */
/* loaded from: classes3.dex */
public final class nbx {
    public final Context a;
    public final m7q b;
    public final b c;
    public final opt0 d;
    public final wbx e;
    public final f f;
    public mc0 g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;
    public final Object n;
    public e o;
    public com.vk.movika.sdk.base.model.o p;
    public boolean q;
    public final boolean r;

    /* compiled from: InteractivePlayerBundleHelper.kt */
    public final class a implements com.vk.movika.sdk.player.base.listener.b, com.vk.movika.sdk.base.listener.a {
        public a() {
        }

        @Override // com.vk.movika.sdk.player.base.listener.b
        public final void a(Throwable th) {
            nbx.this.d();
        }

        @Override // com.vk.movika.sdk.base.listener.a
        public final void c(Throwable th) {
            nbx.this.d();
        }
    }

    /* compiled from: InteractivePlayerBundleHelper.kt */
    public static final class b {
        public final ugl.a a;
        public final ugl.a b;
        public final ugl.a c;
        public final ugl.a d;
        public final ugl.a e;
        public final ugl.a f;
        public final ugl.a g;
        public final ugl.a h;
        public final ugl.a i;
        public final ugl.a j;
        public final ugl.a k;
        public final ugl.a l;
        public final ugl.a m;
        public final ugl.a n;
        public final ugl.a o;
        public final ugl.a p;
        public final ugl.a q;
        public final ugl.a r;

        public b(ugl.a aVar, ugl.a aVar2, ugl.a aVar3, ugl.a aVar4, ugl.a aVar5, ugl.a aVar6, ugl.a aVar7, ugl.a aVar8, ugl.a aVar9, ugl.a aVar10, ugl.a aVar11, ugl.a aVar12, ugl.a aVar13, ugl.a aVar14, ugl.a aVar15, ugl.a aVar16, ugl.a aVar17, ugl.a aVar18) {
            this.a = aVar;
            this.b = aVar2;
            this.c = aVar3;
            this.d = aVar4;
            this.e = aVar5;
            this.f = aVar6;
            this.g = aVar7;
            this.h = aVar8;
            this.i = aVar9;
            this.j = aVar10;
            this.k = aVar11;
            this.l = aVar12;
            this.m = aVar13;
            this.n = aVar14;
            this.o = aVar15;
            this.p = aVar16;
            this.q = aVar17;
            this.r = aVar18;
        }
    }

    /* compiled from: InteractivePlayerBundleHelper.kt */
    public final class d implements PlaybackStateListener {
        public d() {
        }

        @Override // com.vk.movika.sdk.player.base.listener.PlaybackStateListener
        public final void i(PlaybackStateListener.PlaybackState playbackState) {
            mc0 mc0Var;
            OneVideoPlayer a;
            if (playbackState == PlaybackStateListener.PlaybackState.READY) {
                nbx nbxVar = nbx.this;
                ocx ocxVar = ((ugl) nbxVar.f.c.c).l;
                if (ocxVar.p != -1 && (mc0Var = nbxVar.g) != null && (a = ((d3b0) mc0Var.c).a()) != null) {
                    vm80.c(a, ocxVar.p);
                }
                nbxVar.o = null;
                nbxVar.p = null;
            }
        }
    }

    /* compiled from: InteractivePlayerBundleHelper.kt */
    public static final class e {
        public final com.vk.movika.sdk.base.asset.b a;
        public final com.vk.movika.sdk.base.c b;

        public e(com.vk.movika.sdk.base.asset.b bVar, com.vk.movika.sdk.base.c cVar) {
            this.a = bVar;
            this.b = cVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return epx.f(this.a, eVar.a) && epx.f(this.b, eVar.b);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            com.vk.movika.sdk.base.c cVar = this.b;
            return hashCode + (cVar == null ? 0 : cVar.a.hashCode());
        }

        public final String toString() {
            return "PlayerState(assets=" + this.a + ", state=" + this.b + ')';
        }
    }

    /* compiled from: InteractivePlayerBundleHelper.kt */
    public static final class f {
        public final pce a;
        public final dof b;
        public final b1h c;

        public f(pce pceVar, dof dofVar, b1h b1hVar) {
            this.a = pceVar;
            this.b = dofVar;
            this.c = b1hVar;
        }
    }

    public nbx(Context context, m7q m7qVar, b bVar, opt0 opt0Var, wbx wbxVar, f fVar) {
        this.a = context;
        this.b = m7qVar;
        this.c = bVar;
        this.d = opt0Var;
        this.e = wbxVar;
        this.f = fVar;
        x84 x84Var = new x84(14);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.h = msy.a(lazyThreadSafetyMode, x84Var);
        this.i = msy.a(lazyThreadSafetyMode, new Cnew(this, 1));
        this.j = msy.a(lazyThreadSafetyMode, new b1h(this, 23));
        this.k = msy.a(lazyThreadSafetyMode, new ncg(this, 27));
        this.l = msy.a(lazyThreadSafetyMode, new r5i(this, 22));
        this.m = msy.a(lazyThreadSafetyMode, new yv2(17));
        this.n = msy.a(lazyThreadSafetyMode, new bv0(23));
        VideoFeatures videoFeatures = VideoFeatures.REMOVE_IS_PREPARED;
        videoFeatures.getClass();
        this.r = com.vk.toggle.b.A.a(videoFeatures);
    }

    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v25, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v28, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, java.util.Collection] */
    public final void a(mc0 mc0Var) {
        if (this.q) {
            return;
        }
        this.q = true;
        d3b0 d3b0Var = (d3b0) mc0Var.c;
        f fVar = this.f;
        d3b0Var.j((ujt0) fVar.a.invoke());
        com.vk.movika.sdk.base.ui.c cVar = (com.vk.movika.sdk.base.ui.c) mc0Var.a;
        com.vk.movika.sdk.base.ui.m0 m0Var = cVar.d;
        cVar.A((com.vk.movika.sdk.base.ui.d) fVar.b.invoke());
        mj80 mj80Var = (mj80) mc0Var.b;
        com.vk.movika.sdk.base.observable.d0 d0Var = m0Var.k;
        b bVar = this.c;
        d0Var.y(bVar.h);
        com.vk.movika.sdk.base.observable.n nVar = m0Var.d;
        ?? r4 = this.j;
        nVar.y((a) r4.getValue());
        m0Var.d.y(bVar.j);
        m0Var.i.y(bVar.k);
        m0Var.x.y(bVar.l);
        m0Var.u.y(bVar.b);
        m0Var.s.y(bVar.c);
        m0Var.D.y(bVar.d);
        m0Var.m.y(bVar.e);
        m0Var.q.y(bVar.f);
        m0Var.B.y(bVar.g);
        m0Var.o.y(bVar.m);
        mj80Var.e((d) this.k.getValue());
        mj80Var.e(bVar.a);
        ArrayList v0 = j5g.v0((a) r4.getValue(), (Collection) mj80Var.l);
        mj80Var.l = v0;
        mj80Var.l = j5g.v0(bVar.i, v0);
        com.vk.movika.sdk.base.hooks.q qVar = (com.vk.movika.sdk.base.hooks.q) this.m.getValue();
        ugl.a aVar = bVar.n;
        if (!qVar.c.contains(aVar)) {
            qVar.c = j5g.v0(aVar, qVar.c);
        }
        aVar.d(qVar.d);
        qVar.b(new q.b(cVar, cVar, mj80Var));
        com.vk.movika.sdk.base.hooks.i iVar = (com.vk.movika.sdk.base.hooks.i) this.n.getValue();
        ugl.a aVar2 = bVar.o;
        if (!iVar.b.contains(aVar2)) {
            iVar.b = j5g.v0(aVar2, iVar.b);
        }
        aVar2.b(iVar.c);
        iVar.b(new i.a(cVar, cVar, mj80Var));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    public final void b() {
        OneVideoPlayer a2;
        mc0 mc0Var = this.g;
        if (mc0Var != null && (a2 = ((d3b0) mc0Var.c).a()) != null) {
            a2.c0((c) this.l.getValue());
        }
        f();
        this.e.b(null, null);
        mc0 mc0Var2 = this.g;
        if (mc0Var2 != null) {
            ((com.vk.movika.sdk.base.ui.c) mc0Var2.a).destroy();
            OneVideoPlayer a3 = ((d3b0) mc0Var2.c).a();
            if (a3 != null) {
                a3.stop();
            }
        }
        this.g = null;
    }

    public final mc0 c() {
        mc0 mc0Var = this.g;
        if (mc0Var == null || !this.q) {
            return null;
        }
        return mc0Var;
    }

    public final void d() {
        mc0 mc0Var;
        com.vk.movika.sdk.base.ui.c cVar;
        com.vk.movika.sdk.base.asset.b bVar;
        ocx.c cVar2 = ((ugl) this.f.c.c).l.f;
        if ((cVar2 instanceof ocx.c.a) && !((ocx.c.a) cVar2).a) {
            this.o = null;
            return;
        }
        if (this.o != null || (mc0Var = this.g) == null || (bVar = (cVar = (com.vk.movika.sdk.base.ui.c) mc0Var.a).y) == null) {
            return;
        }
        com.vk.movika.sdk.base.presenter.d dVar = cVar.t;
        com.vk.movika.sdk.base.ui.v0 v0Var = cVar.r;
        Long valueOf = Long.valueOf(v0Var.o(v0Var.d.a.q()));
        com.vk.movika.sdk.base.ui.l0 l0Var = dVar.d;
        this.o = new e(bVar, new com.vk.movika.sdk.base.c(new com.vk.movika.sdk.base.presenter.a(l0Var.d, com.vk.movika.sdk.base.presenter.d.a(l0Var, valueOf), 4)));
    }

    public final void e(com.vk.movika.sdk.base.model.o oVar) {
        mc0 mc0Var = this.g;
        com.vk.movika.sdk.base.ui.c cVar = mc0Var != null ? (com.vk.movika.sdk.base.ui.c) mc0Var.a : null;
        if ((cVar != null ? cVar.y : null) == null) {
            this.p = oVar;
            return;
        }
        cVar.n = oVar;
        if (cVar.w(new c.l(oVar), true)) {
            return;
        }
        cVar.d.c.c(new IllegalStateException("Can not emit SetHistoryIntent"));
        cVar.n = null;
    }

    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Iterable, java.lang.Object] */
    public final void f() {
        d();
        mc0 mc0Var = this.g;
        if (mc0Var != null) {
            com.vk.movika.sdk.base.ui.c cVar = (com.vk.movika.sdk.base.ui.c) mc0Var.a;
            com.vk.movika.sdk.base.ui.m0 m0Var = cVar.d;
            this.q = false;
            cVar.y();
            mj80 mj80Var = (mj80) mc0Var.b;
            com.vk.movika.sdk.base.observable.d0 d0Var = m0Var.k;
            b bVar = this.c;
            d0Var.D(bVar.h);
            com.vk.movika.sdk.base.observable.n nVar = m0Var.d;
            ?? r6 = this.j;
            nVar.D((a) r6.getValue());
            m0Var.d.D(bVar.j);
            m0Var.i.D(bVar.k);
            m0Var.x.D(bVar.l);
            m0Var.u.D(bVar.b);
            m0Var.s.D(bVar.c);
            m0Var.D.D(bVar.d);
            m0Var.m.D(bVar.e);
            m0Var.q.D(bVar.f);
            m0Var.B.D(bVar.g);
            m0Var.o.D(bVar.m);
            mj80Var.f((d) this.k.getValue());
            mj80Var.f(bVar.a);
            ArrayList s0 = j5g.s0((Iterable) mj80Var.l, (a) r6.getValue());
            mj80Var.l = s0;
            mj80Var.l = j5g.s0(s0, bVar.i);
            ?? r2 = this.m;
            com.vk.movika.sdk.base.hooks.q qVar = (com.vk.movika.sdk.base.hooks.q) r2.getValue();
            qVar.c = j5g.s0(qVar.c, bVar.n);
            ((com.vk.movika.sdk.base.hooks.q) r2.getValue()).b(null);
            ?? r22 = this.n;
            com.vk.movika.sdk.base.hooks.i iVar = (com.vk.movika.sdk.base.hooks.i) r22.getValue();
            iVar.b = j5g.s0(iVar.b, bVar.o);
            ((com.vk.movika.sdk.base.hooks.i) r22.getValue()).b(null);
            ((d3b0) mc0Var.c).j(null);
            cVar.x = null;
        }
    }

    /* compiled from: InteractivePlayerBundleHelper.kt */
    public final class g implements fuk0 {
        public g() {
        }

        @Override // xsna.fuk0
        public final void m(long j, long j2) {
            ugl uglVar = ugl.this;
            ugl.i(uglVar, new cbx.c(j));
            ugl.b bVar = uglVar.s;
            if (bVar != null) {
                bVar.a.i(new d.a.b(j));
            }
        }

        @Override // xsna.fuk0
        public final void u(float f) {
            ugl.this.a(new acx.l(f));
        }

        @Override // xsna.fuk0
        public final void L0() {
        }

        @Override // xsna.fuk0
        public final void g() {
        }

        @Override // xsna.fuk0
        public final void h() {
        }

        @Override // xsna.fuk0
        public final void w() {
        }

        @Override // xsna.fuk0
        @ozl
        public final void E0(Long l) {
        }

        @Override // xsna.fuk0
        public final void H0(int i) {
        }

        @Override // xsna.fuk0
        public final void S0(a6q a6qVar) {
        }

        @Override // xsna.fuk0
        public final void l(boolean z) {
        }

        @Override // xsna.fuk0
        public final void o(d3b0 d3b0Var) {
        }

        @Override // xsna.fuk0
        public final void s(long j) {
        }

        @Override // xsna.fuk0
        public final void t(long j) {
        }

        @Override // xsna.fuk0
        public final void x(one.video.player.tracks.c cVar) {
        }

        @Override // xsna.fuk0
        public final void y(long j) {
        }

        @Override // xsna.fuk0
        public final void z(OneVideoPlayer.DiscontinuityReason discontinuityReason) {
        }

        @Override // xsna.fuk0
        public final void i(a6q a6qVar, one.video.player.tracks.a aVar) {
        }

        @Override // xsna.fuk0
        public final void k(PlayerError playerError, OneVideoPlaybackException oneVideoPlaybackException) {
        }

        @Override // xsna.fuk0
        public final void r(one.video.player.tracks.b bVar, boolean z) {
        }

        @Override // xsna.fuk0
        public final void n(d3b0 d3b0Var, int i, int i2) {
        }
    }

    /* compiled from: InteractivePlayerBundleHelper.kt */
    public final class c implements one.video.player.f {
        public c() {
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void n(xk80 xk80Var, one.video.player.tracks.c cVar) {
            Integer a = vm80.a(xk80Var);
            if (a != null) {
                ugl.this.a(new acx.m(a.intValue()));
            }
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

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void a(OneVideoPlayer.DiscontinuityReason discontinuityReason, OneVideoPlayer oneVideoPlayer, deb0 deb0Var, deb0 deb0Var2) {
        }
    }
}
