package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.newsfeed.entries.MyTargetNativeAdEntry;
import com.vk.feed.core.models.Description;
import com.vk.feed.core.models.Text;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.design.view.newsfeed.ads_mytarget.MyTargetAdDescriptionView;
import com.vk.feed.design.view.newsfeed.ads_mytarget.MyTargetAdHideReasonsView;
import com.vk.feed.design.view.newsfeed.header.VkFeedPostHeaderView;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import com.vk.newsfeed.common.data.displayitems.AdVkFeedItemState;
import com.vkontakte.android.R;
import com.vkontakte.android.data.PostInteract;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import one.video.cast.manager.status.MediaRouteConnectStatus;
import one.video.exo.offline.DownloadInfo;
import one.video.player.BaseVideoPlayer;
import one.video.player.OneVideoPlayer;
import one.video.player.RepeatMode;
import one.video.player.error.OneVideoPlaybackException;
import one.video.player.model.text.SubtitleRenderItem;
import xsna.mp50;
import xsna.tps0;
import xsna.ye0;

/* compiled from: MyTargetInternalNativeAdVideoSinglePartViewHolder.kt */
/* loaded from: classes4.dex */
public final class pr50 extends pq50<nr50, MyTargetNativeAdEntry> implements ent0 {
    public final wvn M;
    public final h170 N;
    public boolean O;
    public final FrameLayout P;
    public final MyTargetAdDescriptionView Q;
    public final io.reactivex.rxjava3.subjects.d<Boolean> R;
    public io.reactivex.rxjava3.disposables.c S;
    public final zmk T;
    public final Object U;
    public final Object V;
    public final Object W;
    public final op50 X;
    public final u3s0 Y;
    public final cfd Z;
    public final jf0 a0;
    public final d b0;
    public final c c0;
    public final t2m d0;
    public final LinearLayout e0;
    public final MyTargetAdHideReasonsView f0;

    /* compiled from: MyTargetInternalNativeAdVideoSinglePartViewHolder.kt */
    public static final class a implements mp50 {
        public final cjx a;
        public WeakReference<pr50> b;

        public a(cjx cjxVar) {
            this.a = cjxVar;
        }

        @Override // xsna.mp50
        public final void a(mp50.a aVar) {
            egz0 c;
            ArrayList arrayList;
            pr50 pr50Var;
            u1c0 J0;
            pr50 pr50Var2;
            WeakReference<pr50> weakReference = this.b;
            Object obj = null;
            View view = (weakReference == null || (pr50Var2 = weakReference.get()) == null) ? null : pr50Var2.itemView;
            if (view != null) {
                boolean z = aVar instanceof mp50.a.b;
                cjx cjxVar = this.a;
                if (z) {
                    cjxVar.p(new View(view.getContext()), NativeAdContent.ViewTag.CTA);
                    return;
                }
                if (aVar instanceof mp50.a.c) {
                    cjxVar.p(new View(view.getContext()), "DEFAULT");
                    return;
                }
                if (!(aVar instanceof mp50.a.C3362a)) {
                    throw new NoWhenBranchMatchedException();
                }
                WeakReference<pr50> weakReference2 = this.b;
                ol60 ol60Var = (weakReference2 == null || (pr50Var = weakReference2.get()) == null || (J0 = pr50Var.J0()) == null) ? null : J0.h;
                nr50 nr50Var = ol60Var instanceof nr50 ? (nr50) ol60Var : null;
                gjx gjxVar = nr50Var != null ? nr50Var.i : null;
                if (gjxVar == null || (c = gjxVar.c()) == null || (arrayList = c.b) == null) {
                    return;
                }
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (epx.f(((ajx) next).b(), ((mp50.a.C3362a) aVar).a)) {
                        obj = next;
                        break;
                    }
                }
                ajx ajxVar = (ajx) obj;
                if (ajxVar != null) {
                    cjxVar.b(ajxVar);
                }
            }
        }
    }

    /* compiled from: MyTargetInternalNativeAdVideoSinglePartViewHolder.kt */
    public final class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            yg5 a;
            d3b0 v0;
            OneVideoPlayer a2;
            pr50 pr50Var = pr50.this;
            ?? r0 = pr50Var.W;
            cjx cjxVar = pr50Var.E;
            if (cjxVar == null) {
                cjxVar = null;
            }
            cjxVar.q(pr50Var.b0);
            pr50Var.S = new io.reactivex.rxjava3.internal.operators.observable.y(pr50Var.R.y(500L, TimeUnit.MILLISECONDS), io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a).subscribe(new vk40(new h440(pr50Var, 3), 3));
            u1c0 J0 = pr50Var.J0();
            if (J0 != null && (a = J0.a()) != null && (v0 = a.v0()) != null && (a2 = v0.a()) != null) {
                a2.d0((e) pr50Var.U.getValue());
            }
            a aVar = (a) r0.getValue();
            aVar.getClass();
            aVar.b = new WeakReference<>(pr50Var);
            pr50Var.X.e = new bq50((a) r0.getValue());
        }

        /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            yg5 a;
            yg5 a2;
            d3b0 v0;
            OneVideoPlayer a3;
            pr50 pr50Var = pr50.this;
            cjx cjxVar = pr50Var.E;
            if (cjxVar == null) {
                cjxVar = null;
            }
            cjxVar.f(pr50Var.b0);
            io.reactivex.rxjava3.disposables.c cVar = pr50Var.S;
            if (cVar != null) {
                cVar.dispose();
            }
            pr50Var.S = null;
            u1c0 J0 = pr50Var.J0();
            if (J0 != null && (a2 = J0.a()) != null && (v0 = a2.v0()) != null && (a3 = v0.a()) != null) {
                a3.c0((e) pr50Var.U.getValue());
            }
            u1c0 J02 = pr50Var.J0();
            if (J02 != null && (a = J02.a()) != null) {
                a.T(pr50Var.h7());
            }
            pr50Var.h7().f = null;
            ((a) pr50Var.W.getValue()).b = null;
            pr50Var.X.e = null;
        }
    }

    /* compiled from: MyTargetInternalNativeAdVideoSinglePartViewHolder.kt */
    public final class c implements fjx {
        public final View a;

        public c(View view) {
            this.a = view;
        }

        @Override // xsna.fjx
        public final View a() {
            return this.a;
        }

        @Override // xsna.fjx
        public final float getDuration() {
            yg5 a;
            u1c0 J0 = pr50.this.J0();
            if (J0 == null || (a = J0.a()) == null) {
                return -1.0f;
            }
            return a.getDuration() / 1000.0f;
        }

        @Override // xsna.fjx
        public final float getProgress() {
            yg5 a;
            u1c0 J0 = pr50.this.J0();
            if (J0 == null || (a = J0.a()) == null) {
                return -1.0f;
            }
            return a.getPosition() / 1000.0f;
        }
    }

    /* compiled from: MyTargetInternalNativeAdVideoSinglePartViewHolder.kt */
    public static final class d implements vix {
        public final FrameLayout b;

        public d(FrameLayout frameLayout) {
            this.b = frameLayout;
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

    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object, kotlin.Lazy] */
    public pr50(ViewGroup viewGroup, p20 p20Var, wvn wvnVar, h170 h170Var) {
        super(R.layout.news_internal_native_ad_video_view_holder, viewGroup);
        this.M = wvnVar;
        this.N = h170Var;
        this.O = false;
        FrameLayout frameLayout = (FrameLayout) this.itemView.findViewById(R.id.rootView);
        VkFeedPostHeaderView vkFeedPostHeaderView = (VkFeedPostHeaderView) this.itemView.findViewById(R.id.header_view);
        FrameLayout frameLayout2 = (FrameLayout) this.itemView.findViewById(R.id.video_container);
        this.P = frameLayout2;
        FrameLayout frameLayout3 = (FrameLayout) this.itemView.findViewById(R.id.cta_button_container);
        MyTargetAdDescriptionView myTargetAdDescriptionView = (MyTargetAdDescriptionView) this.itemView.findViewById(R.id.description_view);
        this.Q = myTargetAdDescriptionView;
        this.R = io.reactivex.rxjava3.subjects.d.O0(Boolean.FALSE);
        com.vk.toggle.data.a a2 = h170Var.a();
        zmk zmkVar = (a2 == null || a2.c == null) ? null : new zmk();
        this.T = zmkVar;
        x4u x4uVar = new x4u(this, 18);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.U = msy.a(lazyThreadSafetyMode, x4uVar);
        this.V = msy.a(lazyThreadSafetyMode, new Cnew(this, 15));
        this.W = msy.a(lazyThreadSafetyMode, new m130(this, 8));
        op50 op50Var = new op50(frameLayout.getContext(), g620.f().a(), g620.f().e0());
        this.X = op50Var;
        u3s0 u3s0Var = new u3s0(frameLayout, new tps0.a(-1, -2, null, 0, 0, null, 480), null, 12);
        this.Y = u3s0Var;
        cfd cfdVar = new cfd(frameLayout, op50Var, new tps0.a(-1, -2, null, 0, 0, null, 480), zmkVar, h170Var, 48);
        this.Z = cfdVar;
        jf0 jf0Var = new jf0(viewGroup, p20Var, null, wvnVar, h170Var);
        this.a0 = jf0Var;
        this.b0 = new d(frameLayout);
        this.c0 = new c(u3s0Var.itemView);
        this.d0 = new t2m(myTargetAdDescriptionView);
        this.e0 = (LinearLayout) this.itemView.findViewById(R.id.ad_container);
        this.f0 = (MyTargetAdHideReasonsView) this.itemView.findViewById(R.id.hide_reasons_view);
        frameLayout2.addView(u3s0Var.itemView);
        frameLayout2.addView(cfdVar.itemView);
        frameLayout3.addView(jf0Var.itemView);
        f4m.j(u3s0Var.itemView);
        f4m.j(cfdVar.itemView);
        this.K = new fwu(vkFeedPostHeaderView, (r3c0) this.J.getValue());
        this.itemView.addOnAttachStateChangeListener(new b());
    }

    @Override // xsna.qi6
    public final void I6() {
        super.I6();
        if (t6() != null) {
            this.M.remove();
        }
    }

    @Override // xsna.t0n
    public final View R0() {
        return this.P;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.rp6
    public final void R6(ol60 ol60Var) {
        NewsEntry t6;
        zmk zmkVar;
        Text text;
        u1c0 J0;
        nr50 nr50Var = (nr50) ol60Var;
        fkz0 b2 = ((yix) this.G.getValue()).b(nr50Var.i);
        this.E = b2;
        b2.q(this.b0);
        vpn vpnVar = new vpn(this, nr50Var);
        cjx cjxVar = this.E;
        String str = null;
        if (cjxVar == null) {
            cjxVar = null;
        }
        cjxVar.m(vpnVar);
        f7(nr50Var);
        e7(nr50Var);
        AdVkFeedItemState adVkFeedItemState = nr50Var.k;
        float f2 = nr50Var.s;
        if (adVkFeedItemState == AdVkFeedItemState.AD_SHOWING && (J0 = J0()) != null) {
            yg5 a2 = J0.a();
            if (a2 != null) {
                a2.T(h7());
                f h7 = h7();
                h7.getClass();
                h7.f = new WeakReference<>(this);
                a2.f0(h7());
            }
            boolean z = nr50Var.t;
            cfd cfdVar = this.Z;
            u3s0 u3s0Var = this.Y;
            if (z) {
                f4m.j(u3s0Var.itemView);
                cfdVar.itemView.setVisibility(0);
                cfdVar.a6(J0);
                cfdVar.i7(f2);
            } else {
                f4m.j(cfdVar.itemView);
                u3s0Var.itemView.setVisibility(0);
                u3s0Var.a6(J0);
                u3s0Var.i7(f2);
            }
        }
        u1c0 u1c0Var = nr50Var.r;
        jf0 jf0Var = this.a0;
        jf0Var.a6(u1c0Var);
        bwt0.n(jf0Var.itemView, new j4x(this, 22));
        bwt0.i0(jf0Var.itemView, new yhu(this, 12));
        u1c0 J02 = J0();
        if (J02 != null) {
            MyTargetNativeAdEntry myTargetNativeAdEntry = nr50Var.j;
            PostInteract postInteract = this.w;
            String str2 = this.u;
            t2m t2mVar = this.d0;
            t2mVar.a(J02, myTargetNativeAdEntry, postInteract, str2);
            Description description = nr50Var.o;
            if (description != null && (text = description.b) != null) {
                str = text.b;
            }
            t2mVar.c(str);
            t2mVar.k = new or50(this, 0);
            this.Q.setOnClickListener(new wg(this, 1));
        }
        d7(nr50Var);
        com.vk.toggle.data.a a3 = this.N.a();
        if (a3 == null || a3.c == null || (t6 = t6()) == null || (zmkVar = this.T) == null) {
            return;
        }
        hg1.b(this.itemView, zmkVar.d.a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new k130(new hl1(24, this, t6), 8), new ff3(new q69(com.vk.metrics.eventtracking.b.a, 8), 25)));
    }

    @Override // xsna.a1n
    public final void U5() {
        this.O = true;
    }

    @Override // xsna.pq50
    public final LinearLayout b7() {
        return this.e0;
    }

    @Override // xsna.pq50
    public final MyTargetAdHideReasonsView c7() {
        return this.f0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final f h7() {
        return (f) this.V.getValue();
    }

    @Override // xsna.a1n
    public final boolean o5() {
        return this.O;
    }

    @Override // xsna.ent0
    public final dnt0 q3() {
        u1c0 J0 = J0();
        ol60 ol60Var = J0 != null ? J0.h : null;
        nr50 nr50Var = ol60Var instanceof nr50 ? (nr50) ol60Var : null;
        if ((nr50Var != null ? nr50Var.k : null) == AdVkFeedItemState.AD_SHOWING) {
            return nr50Var.t ? this.Z.L : this.Y.L;
        }
        return null;
    }

    /* compiled from: MyTargetInternalNativeAdVideoSinglePartViewHolder.kt */
    public static final class f implements hnt0 {
        public final cjx b;
        public final c c;
        public final io.reactivex.rxjava3.subjects.d<Boolean> d;
        public final LinkedHashSet e = new LinkedHashSet();
        public WeakReference<pr50> f;

        public f(cjx cjxVar, c cVar, io.reactivex.rxjava3.subjects.d<Boolean> dVar) {
            this.b = cjxVar;
            this.c = cVar;
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
            pr50 pr50Var;
            u1c0 J0;
            WeakReference<pr50> weakReference = this.f;
            ol60 ol60Var = (weakReference == null || (pr50Var = weakReference.get()) == null || (J0 = pr50Var.J0()) == null) ? null : J0.h;
            nr50 nr50Var = ol60Var instanceof nr50 ? (nr50) ol60Var : null;
            gjx gjxVar = nr50Var != null ? nr50Var.i : null;
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

    /* compiled from: MyTargetInternalNativeAdVideoSinglePartViewHolder.kt */
    public static final class e implements one.video.player.f {
        public final cjx a;

        public e(cjx cjxVar) {
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
