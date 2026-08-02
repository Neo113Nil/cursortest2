package xsna;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import com.unity3d.services.UnityAdsConstants;
import com.vk.common.links.LaunchContext;
import com.vk.dto.common.VideoFile;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.dto.video.VideoAlbum;
import com.vk.libvideo.api.NotificationsPermission;
import com.vk.libvideo.api.ad.AdsDataProvider;
import com.vk.libvideo.api.minimizable.VideoMinimizableState;
import com.vk.libvideo.api.quality.QualitySettingsType;
import com.vk.libvideo.api.ui.VideoResizer;
import com.vk.libvideo.autoplay.b;
import com.vk.libvideo.dialogs.BaseAnimationDialog;
import com.vk.libvideo.videobottomsheet.api.VideoBottomSheetSideEffectOptions;
import com.vk.movika.api.InteractiveData;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.video.ui.discovery.minimizable.announce.VideoAnnounceState;
import com.vk.video.ui.discovery.minimizable.player.a;
import com.vk.video.ui.discovery.minimizable.player.controllers.MiniPlayerControllersWrapper;
import com.vk.video.ui.discovery.minimizable.player.controllers.PlayerRemoteController;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import xsna.acx;
import xsna.exr0;
import xsna.rcx;
import xsna.vts0;
import xsna.yks0;

/* compiled from: InteractiveMiniPlayerController.kt */
/* loaded from: classes7.dex */
public final class ibx implements com.vk.video.ui.discovery.minimizable.player.controllers.a, no2, yks0.a, rcx.e {
    public final Context b;
    public final er20 c;
    public final yks0.a d;
    public final com.vk.video.ui.discovery.minimizable.j e;
    public final a f;
    public kz20 g;
    public yks0 h;
    public final exr0 i = new exr0(new b());
    public final c j = new c();
    public final bpn0 k;
    public final Object l;
    public final Object m;
    public boolean n;
    public final Object o;
    public yg5 p;
    public final Object q;
    public final Object r;
    public final AppCompatActivity s;

    /* compiled from: InteractiveMiniPlayerController.kt */
    public static final class a {
        public final m2j a;
        public final qbj b;
        public final tvj c;
        public final k7z d;

        public a(m2j m2jVar, qbj qbjVar, tvj tvjVar, k7z k7zVar) {
            this.a = m2jVar;
            this.b = qbjVar;
            this.c = tvjVar;
            this.d = k7zVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b.equals(aVar.b) && this.c.equals(aVar.c) && this.d.equals(aVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "MetaProvider(playerStateProvider=" + this.a + ", minimizableState=" + this.b + ", currentVideoInfo=" + this.c + ", isScreenResumed=" + this.d + ')';
        }
    }

    public ibx(Context context, er20 er20Var, yks0.a aVar, com.vk.video.ui.discovery.minimizable.j jVar, a aVar2) {
        this.b = context;
        this.c = er20Var;
        this.d = aVar;
        this.e = jVar;
        this.f = aVar2;
        int i = 11;
        this.k = new bpn0(new bfm(this, i));
        qfj qfjVar = new qfj(this, 12);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.l = msy.a(lazyThreadSafetyMode, qfjVar);
        this.m = msy.a(lazyThreadSafetyMode, new w4u(this, 5));
        this.o = msy.a(lazyThreadSafetyMode, new pvh(this, i));
        this.q = msy.a(lazyThreadSafetyMode, new obh(this, 15));
        this.r = msy.a(lazyThreadSafetyMode, new wnh(this, 22));
        bpn0 bpn0Var = enj.a;
        this.s = (AppCompatActivity) e3m.h(context);
    }

    public static void h(ibx ibxVar) {
        ibxVar.e().a(new acx.g(false, false, false));
    }

    public static void i(ibx ibxVar) {
        if (!com.vk.libvideo.api.minimizable.a.d(((MiniPlayerControllersWrapper) ibxVar.f.b.c).p) || ibxVar.n) {
            h(ibxVar);
        } else {
            ibxVar.e().a(new acx.g(true, false, false));
        }
    }

    @Override // xsna.yks0.a
    public final void He(List list, VideoFile videoFile) {
        e().t1(videoFile);
    }

    @Override // xsna.no2
    public final io2 Ia() {
        return this.j;
    }

    @Override // com.vk.video.ui.discovery.minimizable.player.controllers.a
    public final kz20 Lc() {
        return this.g;
    }

    @Override // com.vk.video.ui.discovery.minimizable.player.controllers.a
    public final void Q(VideoMinimizableState videoMinimizableState) {
        VideoMinimizableState videoMinimizableState2 = ((MiniPlayerControllersWrapper) this.f.b.c).p;
        if (this.p != null) {
            if (videoMinimizableState instanceof VideoMinimizableState.Collapsed) {
                h(this);
            } else if (!com.vk.libvideo.api.minimizable.a.d(videoMinimizableState2) && com.vk.libvideo.api.minimizable.a.d(videoMinimizableState)) {
                if (!com.vk.libvideo.api.minimizable.a.d(videoMinimizableState) || this.n) {
                    h(this);
                } else {
                    e().a(new acx.g(true, false, false));
                }
            }
        }
        if ((videoMinimizableState instanceof VideoMinimizableState.Collapsed) || (videoMinimizableState instanceof VideoMinimizableState.Animating)) {
            e().j2(false, false);
            e().b3(false);
        }
        if (com.vk.libvideo.api.minimizable.a.d(videoMinimizableState)) {
            e().b3(true);
        }
        if (!(videoMinimizableState instanceof VideoMinimizableState.Animating)) {
            j(videoMinimizableState);
        }
        if (videoMinimizableState instanceof VideoMinimizableState.Hidden) {
            ((com.vk.movika.api.a) this.k.getValue()).disable();
        }
    }

    @Override // com.vk.video.ui.discovery.minimizable.player.controllers.a
    public final yks0 W() {
        return this.h;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.l6s0
    public final k6s0 Y4() {
        return (k6s0) this.o.getValue();
    }

    @Override // com.vk.video.ui.discovery.minimizable.player.controllers.PlayerRemoteController
    public final void Z0(PlayerRemoteController.Properties properties) {
        e().E2(properties.b);
    }

    @Override // xsna.i2b0
    public final boolean a() {
        return false;
    }

    @Override // com.vk.video.ui.discovery.minimizable.player.controllers.PlayerRemoteController
    public final void a1() {
        this.p = null;
        rts0.b.b(null);
        yks0 yks0Var = this.h;
        if (yks0Var != null) {
            yks0Var.c();
        }
        this.h = null;
        this.g = null;
        h(this);
        e().r2(this);
        e().G3(((MiniPlayerControllersWrapper) this.f.a.c).v);
        e().destroy();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.rcx.e
    public final void ab(rcx.d dVar) {
        if (dVar.equals(rcx.d.c.a)) {
            this.e.m();
            return;
        }
        if (dVar instanceof rcx.d.b) {
            this.n = true;
            e().a(new acx.g(false, true, false));
            maz.c(((qdz) this.l.getValue()).e(), this.b, ((rcx.d.b) dVar).a, LaunchContext.A, null, null, 24);
        }
    }

    @Override // xsna.i2b0
    public final Boolean b() {
        return null;
    }

    @Override // com.vk.video.ui.discovery.minimizable.player.controllers.PlayerRemoteController
    public final void b1(MiniPlayerControllersWrapper.VideoInfo videoInfo) {
        bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
        com.vk.libvideo.autoplay.b a2 = b.C1208b.a();
        VideoFile videoFile = videoInfo.b;
        yg5 e = a2.e(videoFile, null);
        this.p = e;
        rts0.b.b(e);
        kz20 kz20Var = new kz20(videoFile, this);
        String str = videoInfo.c;
        kz20Var.h = str;
        this.g = kz20Var;
        String str2 = videoInfo.d;
        yks0 yks0Var = new yks0(videoFile, str2, "");
        yks0Var.b(this);
        yks0Var.b(this.d);
        this.h = yks0Var;
        e().L1(this);
        rcx e2 = e();
        a aVar = this.f;
        e2.X0(((MiniPlayerControllersWrapper) aVar.a.c).v);
        rcx e3 = e();
        boolean z = videoInfo.g.b;
        InteractiveData.From from = InteractiveData.From.DISCOVER_VIDEO;
        yks0 yks0Var2 = this.h;
        e3.y0(new InteractiveData(videoFile, str2, str, from, (SearchStatsLoggingInfo) null, this, yks0Var2 != null ? yks0Var2.d : false, z, 48));
        ((MiniPlayerControllersWrapper) aVar.a.c).v.c(new a.c.C1994a(e().getState()));
        rcx e4 = e();
        e4.setVideoFocused(true);
        i(this);
        e4.a(new acx.n(1.0f));
    }

    @Override // xsna.ebs0
    public final void bk(dbs0 dbs0Var) {
        if (dbs0Var instanceof w0t0) {
            return;
        }
        boolean z = dbs0Var instanceof yct0;
        a aVar = this.f;
        com.vk.video.ui.discovery.minimizable.j jVar = this.e;
        if (z) {
            if (!com.vk.libvideo.api.minimizable.a.d(((MiniPlayerControllersWrapper) aVar.b.c).p) || this.n) {
                h(this);
            } else {
                e().a(new acx.g(true, true, true));
            }
            jVar.r();
        } else if (dbs0Var instanceof hkt0) {
            h(this);
        } else if (dbs0Var instanceof sdt0) {
            i(this);
        } else if (dbs0Var instanceof nqs0) {
            if (!com.vk.libvideo.api.minimizable.a.g(((MiniPlayerControllersWrapper) aVar.b.c).p)) {
                jVar.n();
            }
        } else if (dbs0Var instanceof pws0) {
            jVar.o();
        } else if (dbs0Var instanceof d8s0) {
            jVar.n();
        } else if (dbs0Var instanceof ass0) {
            jVar.k();
        } else if (dbs0Var instanceof fat0) {
            QualitySettingsType qualitySettingsType = ((fat0) dbs0Var).b;
            if (qualitySettingsType != null) {
                jVar.q(qualitySettingsType);
            }
        } else if (dbs0Var instanceof q8s0) {
            jVar.h();
        } else if (dbs0Var instanceof det0) {
            jVar.s(((det0) dbs0Var).a);
        } else if (dbs0Var instanceof u0t0) {
            jVar.i(vts0.b.a);
        } else if (dbs0Var instanceof r0t0) {
            jVar.i(vts0.d.a);
        } else if (dbs0Var instanceof t0t0) {
            jVar.i(vts0.f.a);
        } else {
            g(dbs0Var);
        }
        if (dbs0Var instanceof b1t0) {
            jVar.t();
        }
        if (dbs0Var instanceof t6t0) {
            jVar.o();
        }
    }

    @Override // com.vk.video.ui.discovery.minimizable.player.controllers.PlayerRemoteController
    public final void c() {
        e().a(new acx.g(false, true, false));
    }

    @Override // com.vk.video.ui.discovery.minimizable.player.controllers.PlayerRemoteController
    public final void c1() {
        e().a(new acx.g(false, false, false));
    }

    @Override // com.vk.video.ui.discovery.minimizable.player.controllers.a
    public final void d() {
        ((com.vk.movika.api.a) this.k.getValue()).enable();
    }

    @Override // com.vk.video.ui.discovery.minimizable.player.controllers.PlayerRemoteController
    public final void d1(MiniPlayerControllersWrapper.VideoInfo videoInfo) {
        String str = videoInfo.d;
        String str2 = videoInfo.c;
        bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
        com.vk.libvideo.autoplay.b a2 = b.C1208b.a();
        VideoFile videoFile = videoInfo.b;
        yg5 e = a2.e(videoFile, null);
        this.p = e;
        rts0.b.b(e);
        e().setVideoFocused(false);
        kz20 kz20Var = this.g;
        if (kz20Var != null) {
            kz20Var.g = videoFile;
            kz20Var.h = str2;
        }
        yks0 yks0Var = this.h;
        if (yks0Var != null) {
            yks0Var.j(videoFile);
            yks0Var.a = str;
            yks0Var.b = "";
        }
        rcx e2 = e();
        boolean z = videoInfo.g.b;
        boolean z2 = false;
        InteractiveData.From from = InteractiveData.From.DISCOVER_VIDEO;
        yks0 yks0Var2 = this.h;
        if (yks0Var2 != null) {
            z2 = yks0Var2.d;
        }
        e2.y0(new InteractiveData(videoFile, str, str2, from, (SearchStatsLoggingInfo) null, this, z2, z, 48));
        rcx e3 = e();
        e3.setVideoFocused(true);
        i(this);
        e3.a(new acx.n(1.0f));
        ((MiniPlayerControllersWrapper) this.f.a.c).v.c(new a.c.C1994a(e().getState()));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final rcx e() {
        return (rcx) this.r.getValue();
    }

    @Override // com.vk.video.ui.discovery.minimizable.player.controllers.PlayerRemoteController
    public final boolean e1() {
        return e().getVideoFocused();
    }

    @Override // com.vk.video.ui.discovery.minimizable.player.controllers.PlayerRemoteController
    public final void f() {
        e().a(new acx.g(true, true, false));
    }

    @Override // com.vk.video.ui.discovery.minimizable.player.controllers.PlayerRemoteController
    public final void f1() {
        yks0 yks0Var = this.h;
        yg5 yg5Var = this.p;
        if (yks0Var == null || yg5Var == null) {
            return;
        }
        yks0Var.d(yg5Var);
    }

    public final void g(dbs0 dbs0Var) {
        this.i.b(dbs0Var instanceof qws0 ? qws0.a((qws0) dbs0Var, ((MiniPlayerControllersWrapper) this.f.b.c).p instanceof VideoMinimizableState.FullscreenHorizontal) : dbs0Var);
        boolean f = epx.f(dbs0Var, sms0.a);
        com.vk.video.ui.discovery.minimizable.j jVar = this.e;
        if (f) {
            jVar.n();
        } else if (epx.f(dbs0Var, ngt0.a)) {
            jVar.u();
        }
    }

    @Override // com.vk.video.ui.discovery.minimizable.player.controllers.a
    public final View getPlayerView() {
        return e().getView();
    }

    public final void j(VideoMinimizableState videoMinimizableState) {
        if (((Boolean) this.f.d.invoke()).booleanValue()) {
            rcx e = e();
            Configuration configuration = this.b.getResources().getConfiguration();
            boolean z = false;
            if (configuration != null && configuration.orientation == 2) {
                z = true;
            }
            e.P(z, com.vk.libvideo.api.minimizable.a.g(videoMinimizableState));
        }
    }

    @Override // com.vk.video.ui.discovery.minimizable.player.controllers.a
    public final void onPause() {
        h(this);
        e().setVideoFocused(false);
    }

    @Override // com.vk.video.ui.discovery.minimizable.player.controllers.a
    public final void onResume() {
        e().setVideoFocused(true);
        a aVar = this.f;
        if (((Boolean) aVar.d.invoke()).booleanValue()) {
            i(this);
            j(((MiniPlayerControllersWrapper) aVar.b.c).p);
        }
        this.n = false;
    }

    @Override // com.vk.video.ui.discovery.minimizable.player.controllers.PlayerRemoteController
    public final void seekTo(long j) {
        e().a(new acx.h(j));
    }

    @Override // com.vk.video.ui.discovery.minimizable.player.controllers.a
    public final void t() {
        ((com.vk.movika.api.a) this.k.getValue()).disable();
    }

    @Override // xsna.yks0.a
    public final void uf(boolean z) {
        e().a(new acx.k(z));
    }

    /* compiled from: InteractiveMiniPlayerController.kt */
    public final class b implements exr0.a {
        public final C3049b a;
        public final a b;

        /* compiled from: InteractiveMiniPlayerController.kt */
        /* renamed from: xsna.ibx$b$b, reason: collision with other inner class name */
        public static final class C3049b implements ows0 {
            public final /* synthetic */ ibx b;

            public C3049b(ibx ibxVar) {
                this.b = ibxVar;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // xsna.ows0
            public final io.reactivex.rxjava3.subjects.d<VideoMinimizableState> b3() {
                return (io.reactivex.rxjava3.subjects.d) this.b.m.getValue();
            }
        }

        public b() {
            this.a = new C3049b(ibx.this);
            this.b = new a(ibx.this, this);
        }

        @Override // xsna.exr0.a
        public final u9t0 L() {
            return ibx.this.c.e;
        }

        @Override // xsna.exr0.a
        public final com.vk.video.ui.share.api.b S() {
            return ibx.this.c.k;
        }

        @Override // xsna.exr0.a
        public final NotificationsPermission V() {
            return ibx.this.c.a;
        }

        @Override // xsna.exr0.a
        public final yks0 W() {
            yks0 stub = yks0.i.getSTUB();
            yks0 yks0Var = ibx.this.h;
            return yks0Var == null ? stub : yks0Var;
        }

        @Override // xsna.exr0.a
        public final SearchStatsLoggingInfo a() {
            MiniPlayerControllersWrapper.VideoInfo videoInfo = ((MiniPlayerControllersWrapper) ibx.this.f.c.c).q;
            if (videoInfo != null) {
                return videoInfo.e;
            }
            return null;
        }

        @Override // xsna.exr0.a
        public final ows0 b() {
            return this.a;
        }

        @Override // xsna.exr0.a
        public final wzs<Boolean, String, s3q0> d() {
            return null;
        }

        @Override // xsna.exr0.a
        public final gzs<s3q0> e() {
            return null;
        }

        @Override // xsna.exr0.a
        public final gzs<VideoAlbum> f() {
            return null;
        }

        @Override // xsna.exr0.a
        public final ljt0 g() {
            return ibx.this.c.h;
        }

        @Override // xsna.exr0.a
        public final vit0 g0() {
            return ibx.this.c.b;
        }

        @Override // xsna.exr0.a
        public final FragmentActivity getActivity() {
            return ibx.this.s;
        }

        @Override // xsna.exr0.a
        public final View getView() {
            return ibx.this.getPlayerView();
        }

        @Override // xsna.exr0.a
        public final zet0 h() {
            return null;
        }

        @Override // xsna.exr0.a
        public final y6s0 i() {
            return this.b;
        }

        @Override // xsna.exr0.a
        public final kz20 j() {
            kz20 stub = kz20.m.getSTUB();
            kz20 kz20Var = ibx.this.g;
            return kz20Var == null ? stub : kz20Var;
        }

        @Override // xsna.exr0.a
        public final wzs<Boolean, String, s3q0> k() {
            return null;
        }

        @Override // xsna.exr0.a
        public final MobileOfficialAppsCoreNavStat$EventScreen l() {
            return MobileOfficialAppsCoreNavStat$EventScreen.VIDEO_DISCOVERY;
        }

        @Override // xsna.exr0.a
        public final com.vk.video.kidsprofile.restricteduseractions.a m() {
            return ibx.this.c.d;
        }

        @Override // xsna.exr0.a
        public final v3t0 m0() {
            return ibx.this.c.c;
        }

        @Override // xsna.exr0.a
        public final hfs0 n() {
            return ibx.this.c.j;
        }

        @Override // xsna.exr0.a
        public final AdsDataProvider o() {
            return null;
        }

        @Override // xsna.exr0.a
        public final gzs<s3q0> p() {
            return null;
        }

        @Override // xsna.exr0.a
        public final com.vk.video.ui.share.api.a p0() {
            return ibx.this.c.f;
        }

        @Override // xsna.exr0.a
        public final void c() {
        }

        /* compiled from: InteractiveMiniPlayerController.kt */
        public static final class a implements y6s0 {
            public final /* synthetic */ ibx a;
            public final /* synthetic */ b b;

            /* compiled from: InteractiveMiniPlayerController.kt */
            /* renamed from: xsna.ibx$b$a$a, reason: collision with other inner class name */
            public static final /* synthetic */ class C3048a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[VideoBottomSheetSideEffectOptions.values().length];
                    try {
                        iArr[VideoBottomSheetSideEffectOptions.REMOVE_FROM_DOWNLOADABLE.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[VideoBottomSheetSideEffectOptions.SHARE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[VideoBottomSheetSideEffectOptions.UNSUBSCRIBE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[VideoBottomSheetSideEffectOptions.SUBSCRIBE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public a(ibx ibxVar, b bVar) {
                this.a = ibxVar;
                this.b = bVar;
            }

            @Override // xsna.y6s0
            public final void b(VideoBottomSheetSideEffectOptions videoBottomSheetSideEffectOptions, VideoFile videoFile) {
                int i = C3048a.$EnumSwitchMapping$0[videoBottomSheetSideEffectOptions.ordinal()];
                ibx ibxVar = this.a;
                if (i == 1) {
                    ibxVar.getClass();
                    return;
                }
                if (i == 2) {
                    this.b.getClass();
                } else if (i == 3 || i == 4) {
                    ibxVar.g(uit0.a);
                }
            }

            @Override // xsna.y6s0
            public final int c2() {
                return -1;
            }

            @Override // xsna.y6s0
            public final void a(VideoBottomSheetSideEffectOptions videoBottomSheetSideEffectOptions, VideoFile videoFile) {
            }
        }
    }

    /* compiled from: InteractiveMiniPlayerController.kt */
    public final class c extends c56 implements gsx0 {
        public c() {
        }

        @Override // xsna.io2
        public final void C() {
            ibx ibxVar = ibx.this;
            ibxVar.e().setVideoFocused(true);
            ibxVar.e().getView().setAlpha(1.0f);
        }

        @Override // xsna.io2
        public final void D0() {
            ibx.this.e().getView().setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }

        @Override // xsna.io2
        public final boolean M() {
            return true;
        }

        @Override // xsna.io2
        public final void e0() {
            ibx ibxVar = ibx.this;
            if (ibxVar.e().getView().isAttachedToWindow()) {
                ViewPropertyAnimator alpha = ibxVar.e().getView().animate().alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                pkk pkkVar = BaseAnimationDialog.Z;
                alpha.setStartDelay(BaseAnimationDialog.b0).setDuration(BaseAnimationDialog.c0).start();
            }
        }

        @Override // xsna.c56
        public final View f() {
            return ibx.this.e().getView();
        }

        @Override // xsna.io2
        public final VideoResizer.VideoFitType getContentScaleType() {
            return VideoResizer.VideoFitType.CROP;
        }

        @Override // xsna.io2
        public final void J() {
        }
    }

    @Override // com.vk.video.ui.discovery.minimizable.player.controllers.a
    public final void J2() {
    }

    @Override // com.vk.video.ui.discovery.minimizable.player.controllers.a
    public final void Y2() {
    }

    @Override // xsna.yks0.a
    public final void dismiss() {
    }

    @Override // com.vk.video.ui.discovery.minimizable.player.controllers.a
    public final void vm() {
    }

    @Override // com.vk.video.ui.discovery.minimizable.player.controllers.a
    public final void L2(lat0 lat0Var) {
    }

    @Override // com.vk.video.ui.discovery.minimizable.player.controllers.a
    public final void L3(fys fysVar) {
    }

    @Override // com.vk.video.ui.discovery.minimizable.player.controllers.a
    public final void Q5(boolean z) {
    }

    @Override // com.vk.video.ui.discovery.minimizable.player.controllers.a
    public final void Wf(boolean z) {
    }

    @Override // com.vk.video.ui.discovery.minimizable.player.controllers.a
    public final void a2(VideoAnnounceState videoAnnounceState) {
    }

    @Override // com.vk.video.ui.discovery.minimizable.player.controllers.a
    public final void ba(com.vk.video.ui.discovery.minimizable.b bVar) {
    }

    @Override // com.vk.video.ui.discovery.minimizable.player.controllers.PlayerRemoteController
    public final void g1(ArrayList arrayList) {
    }

    @Override // com.vk.video.ui.discovery.minimizable.player.controllers.a
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // xsna.yks0.a
    public final void vk(boolean z) {
    }

    @Override // xsna.yks0.a
    public final void L9(VideoFile videoFile, boolean z) {
    }
}
