package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.newsfeed.entries.MyTargetNativeAdEntry;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import java.lang.ref.WeakReference;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.LazyThreadSafetyMode;
import one.video.cast.manager.status.MediaRouteConnectStatus;
import one.video.exo.offline.DownloadInfo;
import one.video.player.BaseVideoPlayer;
import one.video.player.OneVideoPlayer;
import one.video.player.RepeatMode;
import one.video.player.error.OneVideoPlaybackException;
import one.video.player.model.text.SubtitleRenderItem;
import xsna.tps0;
import xsna.ye0;

/* compiled from: MyTargetInternalNativeAdVideoViewHolder.kt */
/* loaded from: classes4.dex */
public final class rr50 extends rp6<qr50, MyTargetNativeAdEntry> implements ent0 {
    public final wvn E;
    public final h170 F;
    public final io.reactivex.rxjava3.subjects.d<Boolean> G;
    public io.reactivex.rxjava3.disposables.c H;
    public final Object I;
    public cjx J;
    public final zmk K;
    public final Object L;
    public final Object M;
    public final u3s0 N;
    public final c O;
    public final b P;

    /* compiled from: MyTargetInternalNativeAdVideoViewHolder.kt */
    public final class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            yg5 a;
            d3b0 v0;
            OneVideoPlayer a2;
            rr50 rr50Var = rr50.this;
            cjx cjxVar = rr50Var.J;
            if (cjxVar == null) {
                cjxVar = null;
            }
            cjxVar.q(rr50Var.O);
            rr50Var.H = new io.reactivex.rxjava3.internal.operators.observable.y(rr50Var.G.y(500L, TimeUnit.MILLISECONDS), io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a).subscribe(new be50(new o010(rr50Var, 12), 1));
            u1c0 J0 = rr50Var.J0();
            if (J0 == null || (a = J0.a()) == null || (v0 = a.v0()) == null || (a2 = v0.a()) == null) {
                return;
            }
            a2.d0((d) rr50Var.L.getValue());
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            yg5 a;
            yg5 a2;
            d3b0 v0;
            OneVideoPlayer a3;
            rr50 rr50Var = rr50.this;
            cjx cjxVar = rr50Var.J;
            if (cjxVar == null) {
                cjxVar = null;
            }
            cjxVar.f(rr50Var.O);
            io.reactivex.rxjava3.disposables.c cVar = rr50Var.H;
            if (cVar != null) {
                cVar.dispose();
            }
            rr50Var.H = null;
            u1c0 J0 = rr50Var.J0();
            if (J0 != null && (a2 = J0.a()) != null && (v0 = a2.v0()) != null && (a3 = v0.a()) != null) {
                a3.c0((d) rr50Var.L.getValue());
            }
            u1c0 J02 = rr50Var.J0();
            if (J02 != null && (a = J02.a()) != null) {
                a.T(rr50Var.b7());
            }
            rr50Var.b7().f = null;
        }
    }

    /* compiled from: MyTargetInternalNativeAdVideoViewHolder.kt */
    public final class b implements fjx {
        public final View a;

        public b(View view) {
            this.a = view;
        }

        @Override // xsna.fjx
        public final View a() {
            return this.a;
        }

        @Override // xsna.fjx
        public final float getDuration() {
            yg5 a;
            u1c0 J0 = rr50.this.J0();
            if (J0 == null || (a = J0.a()) == null) {
                return -1.0f;
            }
            return a.getDuration() / 1000.0f;
        }

        @Override // xsna.fjx
        public final float getProgress() {
            yg5 a;
            u1c0 J0 = rr50.this.J0();
            if (J0 == null || (a = J0.a()) == null) {
                return -1.0f;
            }
            return a.getPosition() / 1000.0f;
        }
    }

    /* compiled from: MyTargetInternalNativeAdVideoViewHolder.kt */
    public static final class c implements vix {
        public final ViewGroup b;

        public c(ViewGroup viewGroup) {
            this.b = viewGroup;
        }

        @Override // xsna.vix
        public final ViewGroup a() {
            return this.b;
        }

        @Override // xsna.vix
        public final zgx b() {
            return null;
        }
    }

    public rr50(ViewGroup viewGroup, wvn wvnVar, h170 h170Var) {
        super(new FrameLayout(viewGroup.getContext()), viewGroup);
        this.E = wvnVar;
        this.F = h170Var;
        FrameLayout frameLayout = (FrameLayout) this.itemView;
        this.G = io.reactivex.rxjava3.subjects.d.O0(Boolean.FALSE);
        xis xisVar = new xis(this, 25);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.I = msy.a(lazyThreadSafetyMode, xisVar);
        com.vk.toggle.data.a a2 = h170Var.a();
        this.K = (a2 == null || a2.c == null) ? null : new zmk();
        this.L = msy.a(lazyThreadSafetyMode, new m1y(this, 14));
        this.M = msy.a(lazyThreadSafetyMode, new x750(this, 2));
        u3s0 u3s0Var = new u3s0(frameLayout, new tps0.a(-1, -2, null, 0, 0, null, 480), null, 12);
        this.N = u3s0Var;
        this.O = new c(frameLayout);
        this.P = new b(u3s0Var.itemView);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        frameLayout.addView(u3s0Var.itemView);
        this.itemView.addOnAttachStateChangeListener(new a());
    }

    @Override // xsna.qi6
    public final void I6() {
        super.I6();
        if (t6() != null) {
            this.E.remove();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.rp6
    public final void R6(qr50 qr50Var) {
        NewsEntry t6;
        zmk zmkVar;
        qr50 qr50Var2 = qr50Var;
        hi60 hi60Var = this.D;
        u3s0 u3s0Var = this.N;
        u3s0Var.D = hi60Var;
        fkz0 b2 = ((yix) this.I.getValue()).b(qr50Var2.h);
        this.J = b2;
        b2.q(this.O);
        u1c0 J0 = J0();
        if (J0 != null) {
            yg5 a2 = J0.a();
            if (a2 != null) {
                a2.T(b7());
                e b7 = b7();
                b7.getClass();
                b7.f = new WeakReference<>(this);
                a2.f0(b7());
            }
            u3s0Var.a6(J0);
            u3s0Var.i7(qr50Var2.k);
        }
        com.vk.toggle.data.a a3 = this.F.a();
        if (a3 == null || a3.c == null || (t6 = t6()) == null || (zmkVar = this.K) == null) {
            return;
        }
        hg1.b(this.itemView, zmkVar.d.a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new qs2(new hn0(19, this, t6), 29), new f2u(new ow4(com.vk.metrics.eventtracking.b.a, 7), 7)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final e b7() {
        return (e) this.M.getValue();
    }

    @Override // xsna.ent0
    public final dnt0 q3() {
        return this.N.L;
    }

    /* compiled from: MyTargetInternalNativeAdVideoViewHolder.kt */
    public static final class e implements hnt0 {
        public final cjx b;
        public final b c;
        public final io.reactivex.rxjava3.subjects.d<Boolean> d;
        public final LinkedHashSet e = new LinkedHashSet();
        public WeakReference<rr50> f;

        public e(cjx cjxVar, b bVar, io.reactivex.rxjava3.subjects.d<Boolean> dVar) {
            this.b = cjxVar;
            this.c = bVar;
            this.d = dVar;
        }

        @Override // xsna.hnt0
        public final void K0(com.vk.libvideo.autoplay.a aVar, com.vk.libvideo.autoplay.a aVar2) {
            boolean z = aVar.a;
            boolean z2 = aVar2.a;
            if (z != z2) {
                this.b.e(z2);
            }
        }

        @Override // xsna.hnt0
        public final void K2(VideoAutoPlay videoAutoPlay) {
            b();
        }

        @Override // xsna.hnt0
        public final void P1(VideoAutoPlay videoAutoPlay, boolean z) {
            cjx cjxVar = this.b;
            if (z) {
                cjxVar.s(this.c);
                cjxVar.k();
            } else {
                cjxVar.l();
                cjxVar.a();
            }
        }

        public final void b() {
            String id;
            rr50 rr50Var;
            u1c0 J0;
            WeakReference<rr50> weakReference = this.f;
            ol60 ol60Var = (weakReference == null || (rr50Var = weakReference.get()) == null || (J0 = rr50Var.J0()) == null) ? null : J0.h;
            qr50 qr50Var = ol60Var instanceof qr50 ? (qr50) ol60Var : null;
            gjx gjxVar = qr50Var != null ? qr50Var.h : null;
            if (gjxVar == null || (id = gjxVar.getId()) == null) {
                return;
            }
            LinkedHashSet linkedHashSet = this.e;
            if (!linkedHashSet.contains(id)) {
                this.b.g();
            }
            linkedHashSet.add(id);
        }

        @Override // xsna.hnt0
        public final void j4(VideoAutoPlay videoAutoPlay) {
            this.d.onNext(Boolean.valueOf(videoAutoPlay.getVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        }

        @Override // xsna.hnt0
        public final void m4(VideoAutoPlay videoAutoPlay) {
            b();
        }

        @Override // xsna.hnt0
        public final void E() {
        }

        @Override // xsna.hnt0
        public final void c2() {
        }

        @Override // xsna.hnt0
        public final void h() {
        }

        @Override // xsna.hnt0
        public final void j() {
        }

        @Override // xsna.hnt0
        public final void t2() {
        }

        @Override // xsna.hnt0
        public final void u() {
        }

        @Override // xsna.hnt0
        public final void O(one.video.player.tracks.c cVar) {
        }

        @Override // xsna.hnt0
        public final void R3(MediaRouteConnectStatus mediaRouteConnectStatus) {
        }

        @Override // xsna.hnt0
        public final void S2(long j) {
        }

        @Override // xsna.hnt0
        public final void T0(VideoAutoPlay videoAutoPlay) {
        }

        @Override // xsna.hnt0
        public final void U(VideoAutoPlay videoAutoPlay) {
        }

        @Override // xsna.hnt0
        public final void U0(one.video.player.tracks.b bVar) {
        }

        @Override // xsna.hnt0
        public final void U3(DownloadInfo downloadInfo) {
        }

        @Override // xsna.hnt0
        public final void V3(yg5 yg5Var) {
        }

        @Override // xsna.hnt0
        public final void a(boolean z) {
        }

        @Override // xsna.hnt0
        public final void d4(yg5 yg5Var) {
        }

        @Override // xsna.hnt0
        public final void l(x2s0 x2s0Var) {
        }

        @Override // xsna.hnt0
        public final void n2(yg5 yg5Var) {
        }

        @Override // xsna.hnt0
        public final void p0(yg5 yg5Var) {
        }

        @Override // xsna.hnt0
        public final void p2(VideoAutoPlay videoAutoPlay) {
        }

        @Override // xsna.hnt0
        public final void q(List<? extends SubtitleRenderItem> list) {
        }

        @Override // xsna.hnt0
        public final void r1(yg5 yg5Var) {
        }

        @Override // xsna.hnt0
        public final void x0(boolean z) {
        }

        @Override // xsna.hnt0
        public final void H(long j, long j2) {
        }

        @Override // xsna.hnt0
        public final void N3(VideoAutoPlay videoAutoPlay, long j) {
        }

        @Override // xsna.hnt0
        public final void g(com.vk.libvideo.api.ad.a aVar, ye0.a aVar2) {
        }

        @Override // xsna.hnt0
        public final void m(je0 je0Var, com.vk.libvideo.api.ad.a aVar) {
        }

        @Override // xsna.hnt0
        public final void z0(VideoAutoPlay videoAutoPlay, int i) {
        }

        @Override // xsna.hnt0
        public final void E3(VideoAutoPlay videoAutoPlay, int i, int i2) {
        }

        @Override // xsna.hnt0
        public final void X1(VideoAutoPlay videoAutoPlay, long j, long j2) {
        }

        @Override // xsna.hnt0
        public final void h3(yg5 yg5Var, int i, int i2) {
        }

        @Override // xsna.hnt0
        public final void J3(yg5 yg5Var, int i, int i2, OneVideoPlaybackException.ErrorCode errorCode, Throwable th) {
        }
    }

    /* compiled from: MyTargetInternalNativeAdVideoViewHolder.kt */
    public static final class d implements one.video.player.f {
        public final cjx a;

        public d(cjx cjxVar) {
            this.a = cjxVar;
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void q(OneVideoPlaybackException oneVideoPlaybackException, sht0 sht0Var, OneVideoPlayer oneVideoPlayer) {
            this.a.n(oneVideoPlaybackException.d() == OneVideoPlaybackException.ErrorCode.TIMEOUT ? 1 : 0);
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

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void a(OneVideoPlayer.DiscontinuityReason discontinuityReason, OneVideoPlayer oneVideoPlayer, deb0 deb0Var, deb0 deb0Var2) {
        }
    }
}
