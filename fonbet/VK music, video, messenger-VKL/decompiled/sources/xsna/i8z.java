package xsna;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import com.vk.donut.video.model.presentation.cardsize.DonutVideoCardSource;
import com.vk.donut.video.model.presentation.video.DonutVideoUiModel;
import com.vk.dto.common.VideoFile;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.dto.video.VideoAlbum;
import com.vk.libvideo.api.NotificationsPermission;
import com.vk.libvideo.api.ad.AdsDataProvider;
import com.vk.libvideo.api.di.VideoMinimizablePlayerComponent;
import com.vk.libvideo.api.minimizable.VideoMinimizableState;
import com.vk.libvideo.api.quality.QualitySettingsType;
import com.vk.libvideo.api.ui.VideoResizer;
import com.vk.libvideo.pip.VideoPipStateHolder;
import com.vk.libvideo.tracker.VideoSimilarAnalytics;
import com.vk.libvideo.videobottomsheet.api.VideoBottomSheetSideEffectOptions;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.video.ui.discovery.minimizable.announce.VideoAnnounceState;
import com.vk.video.ui.discovery.minimizable.b;
import com.vk.video.ui.discovery.minimizable.c;
import com.vk.video.ui.discovery.minimizable.player.controllers.MiniPlayerControllersWrapper;
import com.vk.video.ui.discovery.minimizable.player.controllers.PlayerRemoteController;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.exr0;
import xsna.fys;
import xsna.ir20;
import xsna.vts0;
import xsna.xn50;
import xsna.yks0;

/* compiled from: LinearMiniPlayerController.kt */
/* loaded from: classes7.dex */
public final class i8z implements com.vk.video.ui.discovery.minimizable.player.controllers.a, owa0, no2, yks0.a, dz20 {
    public final ViewGroup b;
    public final er20 c;
    public final yks0.a d;
    public final com.vk.video.ui.discovery.minimizable.j e;
    public final zy80 f;
    public final a g;
    public final boolean h;
    public final boolean i;
    public kz20 j;
    public yks0 k;
    public final Object l;
    public final Object m;
    public final AppCompatActivity n;
    public final c o;
    public boolean p;
    public final exr0 q;
    public final Object r;

    /* compiled from: LinearMiniPlayerController.kt */
    public static final class a {
        public final cty a;
        public final n7w b;
        public final xsw c;
        public final fm20 d;
        public final m40 e;

        public a(cty ctyVar, n7w n7wVar, xsw xswVar, fm20 fm20Var, m40 m40Var) {
            this.a = ctyVar;
            this.b = n7wVar;
            this.c = xswVar;
            this.d = fm20Var;
            this.e = m40Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b.equals(aVar.b) && this.c.equals(aVar.c) && this.d.equals(aVar.d) && this.e.equals(aVar.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "MetaProvider(playerStateProvider=" + this.a + ", minimizableState=" + this.b + ", currentVideoInfo=" + this.c + ", isScreenResumed=" + this.d + ", fullscreenLockStateProvider=" + this.e + ')';
        }
    }

    public i8z(Context context, ViewGroup viewGroup, er20 er20Var, yks0.a aVar, com.vk.video.ui.discovery.minimizable.j jVar, zy80 zy80Var, a aVar2, boolean z, boolean z2) {
        Object d1zVar;
        m40 m40Var = aVar2.e;
        fm20 fm20Var = aVar2.d;
        cty ctyVar = aVar2.a;
        this.b = viewGroup;
        this.c = er20Var;
        this.d = aVar;
        this.e = jVar;
        this.f = zy80Var;
        this.g = aVar2;
        this.h = z;
        this.i = z2;
        boolean a2 = fxc0.B().J().a();
        com.vk.movika.sdk.base.ui.o0 o0Var = new com.vk.movika.sdk.base.ui.o0(22);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.l = msy.a(lazyThreadSafetyMode, o0Var);
        int i = 17;
        if (!a2 || z2) {
            d1zVar = new d1z(context, viewGroup, this, this, jVar, new ir20.a(ctyVar, fm20Var, new maj(this, 29), new foi(this, i), m40Var), z);
        } else {
            d1zVar = new gr20(context, viewGroup, new hr20(er20Var.d, er20Var.c, er20Var.g, er20Var.m), this, this, new ir20.a(ctyVar, fm20Var, new l9h(this, 28), new fgm(this, 21), m40Var), jVar);
        }
        this.m = d1zVar;
        bpn0 bpn0Var = enj.a;
        this.n = (AppCompatActivity) e3m.h(context);
        this.o = new c();
        this.q = new exr0(new b());
        this.r = msy.a(lazyThreadSafetyMode, new zq3(i));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.dz20
    public final void Ff(String str) {
        zy80 zy80Var;
        if ((((Boolean) this.l.getValue()).booleanValue() ? "video_bottom_sheet_redesign" : "video_bottom_sheet").equals(str) && com.vk.libvideo.api.minimizable.a.d(h()) && (zy80Var = this.f) != null) {
            zy80Var.e();
        }
    }

    @Override // xsna.yks0.a
    public final void He(List list, VideoFile videoFile) {
        VideoMinimizableState h = h();
        if (((Boolean) this.g.d.invoke()).booleanValue()) {
            e(h);
        }
    }

    @Override // xsna.no2
    public final io2 Ia() {
        return this.o;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xsna.ir20] */
    @Override // com.vk.video.ui.discovery.minimizable.player.controllers.a
    public final void L2(lat0 lat0Var) {
        this.m.L2(lat0Var);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, xsna.ir20] */
    @Override // com.vk.video.ui.discovery.minimizable.player.controllers.a
    public final void L3(fys fysVar) {
        this.m.Sf(!fysVar.equals(fys.d.a));
    }

    @Override // com.vk.video.ui.discovery.minimizable.player.controllers.a
    public final kz20 Lc() {
        return this.j;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xsna.ir20] */
    @Override // com.vk.video.ui.discovery.minimizable.player.controllers.a
    public final void Q(VideoMinimizableState videoMinimizableState) {
        ?? r0 = this.m;
        r0.Q(videoMinimizableState);
        if (((Boolean) this.g.d.invoke()).booleanValue()) {
            e(videoMinimizableState);
        }
        r0.e7(new ir20.d.g(videoMinimizableState));
        if (this.h || (videoMinimizableState instanceof VideoMinimizableState.Animating)) {
            return;
        }
        onConfigurationChanged(this.n.getResources().getConfiguration());
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, xsna.ir20] */
    @Override // com.vk.video.ui.discovery.minimizable.player.controllers.a
    public final void Q5(boolean z) {
        this.m.e7(new ir20.d.C3076d(z));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.dz20
    public final void Qc(String str) {
        zy80 zy80Var;
        if ((((Boolean) this.l.getValue()).booleanValue() ? "video_bottom_sheet_redesign" : "video_bottom_sheet").equals(str) && com.vk.libvideo.api.minimizable.a.d(h()) && (zy80Var = this.f) != null) {
            zy80Var.a();
        }
    }

    @Override // com.vk.video.ui.discovery.minimizable.player.controllers.a
    public final yks0 W() {
        return this.k;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xsna.l6s0] */
    @Override // xsna.l6s0
    public final k6s0 Y4() {
        return this.m.Y4();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xsna.ir20] */
    @Override // com.vk.video.ui.discovery.minimizable.player.controllers.PlayerRemoteController
    public final void Z0(PlayerRemoteController.Properties properties) {
        this.m.Z0(properties);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xsna.i2b0] */
    @Override // xsna.i2b0
    public final boolean a() {
        return this.m.a();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, xsna.ir20] */
    @Override // com.vk.video.ui.discovery.minimizable.player.controllers.PlayerRemoteController
    public final void a1() {
        yks0 yks0Var = this.k;
        if (yks0Var != null) {
            yks0Var.c();
        }
        this.k = null;
        this.j = null;
        this.m.b7();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xsna.ir20] */
    @Override // com.vk.video.ui.discovery.minimizable.player.controllers.a
    public final void a2(VideoAnnounceState videoAnnounceState) {
        this.m.a2(videoAnnounceState);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xsna.i2b0] */
    @Override // xsna.i2b0
    public final Boolean b() {
        return this.m.b();
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, xsna.ir20] */
    @Override // com.vk.video.ui.discovery.minimizable.player.controllers.PlayerRemoteController
    public final void b1(MiniPlayerControllersWrapper.VideoInfo videoInfo) {
        VideoFile videoFile = videoInfo.b;
        yks0 yks0Var = new yks0(videoFile, videoInfo.d, null);
        yks0Var.b(this);
        yks0Var.b(this.d);
        ?? r2 = this.m;
        yks0Var.b(r2.Gc());
        this.k = yks0Var;
        kz20 kz20Var = new kz20(videoFile, this, this);
        kz20Var.h = videoInfo.c;
        this.j = kz20Var;
        ir20.b g = g(videoInfo);
        yks0 stub = yks0.i.getSTUB();
        yks0 yks0Var2 = this.k;
        if (yks0Var2 != null) {
            stub = yks0Var2;
        }
        r2.j8(g, stub, new dxh(this, 20));
        e(h());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xsna.ir20] */
    @Override // com.vk.video.ui.discovery.minimizable.player.controllers.a
    public final void ba(com.vk.video.ui.discovery.minimizable.b bVar) {
        this.m.nm(!(bVar instanceof b.a));
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, xsna.ir20] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.ebs0
    public final void bk(dbs0 dbs0Var) {
        QualitySettingsType qualitySettingsType;
        com.vk.video.ui.discovery.minimizable.j jVar = this.e;
        VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment = jVar.a;
        this.m.e7(ir20.d.e.a);
        if (dbs0Var instanceof ygt0) {
            xn50.a.c(videoMinimizableDiscoveryFragment, c.o0.m.b);
        } else if (dbs0Var instanceof zgt0) {
            xn50.a.c(videoMinimizableDiscoveryFragment, c.o0.g.b);
        } else if (dbs0Var instanceof pws0) {
            jVar.o();
        } else if (dbs0Var instanceof d8s0) {
            jVar.n();
        } else if (dbs0Var instanceof ass0) {
            jVar.k();
        } else if (dbs0Var instanceof q8s0) {
            jVar.h();
        } else if (dbs0Var instanceof det0) {
            jVar.s(((det0) dbs0Var).a);
        } else if (dbs0Var instanceof ijj0) {
            yks0 yks0Var = this.k;
            VideoFile videoFile = yks0Var != null ? yks0Var.e : null;
            int i = VideoMinimizableDiscoveryFragment.p1;
            boolean z = ((VideoMinimizablePlayerComponent) videoMinimizableDiscoveryFragment.ko().a.getValue()).b3().P0() instanceof VideoMinimizableState.FullscreenHorizontal;
            if (videoFile != null) {
                VideoSimilarAnalytics.a(videoMinimizableDiscoveryFragment.b3().P0(), videoFile, VideoSimilarAnalytics.EventSource.BUTTON);
            }
            xn50.a.c(videoMinimizableDiscoveryFragment, new c.o0.r(z));
        } else if (dbs0Var instanceof u0t0) {
            jVar.i(vts0.b.a);
        } else if (dbs0Var instanceof r0t0) {
            jVar.i(vts0.d.a);
        } else if (dbs0Var instanceof t0t0) {
            jVar.i(vts0.f.a);
        } else {
            i(dbs0Var);
        }
        if (dbs0Var instanceof t6t0) {
            jVar.o();
        }
        if ((dbs0Var instanceof fat0) && (qualitySettingsType = ((fat0) dbs0Var).b) != null) {
            jVar.q(qualitySettingsType);
        }
        if (dbs0Var instanceof b1t0) {
            jVar.t();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xsna.ir20] */
    @Override // com.vk.video.ui.discovery.minimizable.player.controllers.PlayerRemoteController
    public final void c() {
        this.m.t5(ir20.c.d.a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, xsna.ir20] */
    @Override // com.vk.video.ui.discovery.minimizable.player.controllers.PlayerRemoteController
    public final void c1() {
        this.m.t5(new ir20.c.e());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xsna.ir20] */
    @Override // com.vk.video.ui.discovery.minimizable.player.controllers.a
    public final void d() {
        this.m.d();
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, xsna.ir20] */
    @Override // com.vk.video.ui.discovery.minimizable.player.controllers.PlayerRemoteController
    public final void d1(MiniPlayerControllersWrapper.VideoInfo videoInfo) {
        VideoFile videoFile = videoInfo.b;
        yks0 yks0Var = this.k;
        if (yks0Var != null) {
            String str = videoInfo.d;
            yks0Var.j(videoFile);
            yks0Var.a = str;
            yks0Var.b = null;
        }
        kz20 kz20Var = this.j;
        if (kz20Var != null) {
            String str2 = videoInfo.c;
            kz20Var.g = videoFile;
            kz20Var.h = str2;
        }
        this.m.ji(g(videoInfo), new vfk(this, 19));
        e(h());
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, xsna.ir20] */
    public final void e(VideoMinimizableState videoMinimizableState) {
        boolean z;
        PlayerRemoteController.Properties properties;
        yks0 yks0Var = this.k;
        if (yks0Var != null && com.vk.libvideo.api.minimizable.a.j(videoMinimizableState)) {
            MiniPlayerControllersWrapper.VideoInfo videoInfo = ((MiniPlayerControllersWrapper) this.g.c.c).q;
            Boolean valueOf = (videoInfo == null || (properties = videoInfo.g) == null) ? null : Boolean.valueOf(properties.c);
            VideoFile videoFile = yks0Var.e;
            DonutVideoUiModel a2 = this.c.m.wb().a(nkt0.a(yks0Var.e), DonutVideoCardSource.PLAYER);
            boolean z2 = videoMinimizableState instanceof VideoMinimizableState.FullscreenHorizontal;
            boolean f = epx.f(yks0Var.c, Boolean.TRUE);
            boolean booleanValue = valueOf != null ? valueOf.booleanValue() : false;
            VideoFile videoFile2 = yks0Var.e;
            if (videoFile2 != null && fxc0.B().s().k(videoFile2)) {
                com.vk.core.utils.newtork.b.a.getClass();
                if (!com.vk.core.utils.newtork.b.d()) {
                    z = true;
                    this.m.e7(new ir20.d.a(videoFile, a2, z2, f, (booleanValue || z) ? false : true));
                }
            }
            z = false;
            this.m.e7(new ir20.d.a(videoFile, a2, z2, f, (booleanValue || z) ? false : true));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xsna.ir20] */
    @Override // com.vk.video.ui.discovery.minimizable.player.controllers.PlayerRemoteController
    public final boolean e1() {
        return this.m.H4();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xsna.ir20] */
    @Override // com.vk.video.ui.discovery.minimizable.player.controllers.PlayerRemoteController
    public final void f() {
        this.m.t5(ir20.c.f.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xsna.ir20] */
    @Override // com.vk.video.ui.discovery.minimizable.player.controllers.PlayerRemoteController
    public final void f1() {
        this.m.dg(this.k);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r1.d == true) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ir20.b g(MiniPlayerControllersWrapper.VideoInfo videoInfo) {
        boolean z;
        yks0 yks0Var = this.k;
        if (yks0Var != null) {
            z = true;
        }
        z = false;
        return new ir20.b(((MiniPlayerControllersWrapper) this.g.b.c).p, videoInfo, z, yks0Var != null ? epx.f(yks0Var.c, Boolean.TRUE) : false);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xsna.ir20] */
    @Override // com.vk.video.ui.discovery.minimizable.player.controllers.PlayerRemoteController
    public final void g1(ArrayList arrayList) {
        this.m.of(arrayList);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xsna.ir20] */
    @Override // com.vk.video.ui.discovery.minimizable.player.controllers.a
    public final View getPlayerView() {
        return this.m.getPlayerView();
    }

    public final VideoMinimizableState h() {
        return ((MiniPlayerControllersWrapper) this.g.b.c).p;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, xsna.ir20] */
    public final void i(dbs0 dbs0Var) {
        this.q.b(dbs0Var instanceof qws0 ? qws0.a((qws0) dbs0Var, h() instanceof VideoMinimizableState.FullscreenHorizontal) : dbs0Var);
        boolean f = epx.f(dbs0Var, cps0.a);
        ?? r1 = this.m;
        if (f) {
            r1.e7(ir20.d.c.a);
            return;
        }
        if (epx.f(dbs0Var, sms0.a)) {
            k(false);
            return;
        }
        if (epx.f(dbs0Var, tms0.a)) {
            k(true);
            return;
        }
        boolean f2 = epx.f(dbs0Var, yct0.a);
        com.vk.video.ui.discovery.minimizable.j jVar = this.e;
        if (f2) {
            r1.t5(ir20.c.g.a);
            jVar.r();
            return;
        }
        if (epx.f(dbs0Var, hkt0.a)) {
            r1.t5(ir20.c.C3075c.a);
            return;
        }
        if (epx.f(dbs0Var, sdt0.a)) {
            r1.t5(ir20.c.h.a);
            return;
        }
        if (dbs0Var instanceof d4s0) {
            r1.t5(new ir20.c.b(((d4s0) dbs0Var).a));
            return;
        }
        if (dbs0Var instanceof c4s0) {
            r1.t5(new ir20.c.a(((c4s0) dbs0Var).a));
            return;
        }
        if (dbs0Var instanceof eet0) {
            r1.t5(new ir20.c.i(((eet0) dbs0Var).a));
        } else if (epx.f(dbs0Var, ngt0.a)) {
            jVar.u();
        } else if (epx.f(dbs0Var, hsw.a)) {
            jVar.j();
        }
    }

    @Override // xsna.owa0
    public final yg5 j() {
        Object obj = this.m;
        owa0 owa0Var = obj != null ? (owa0) obj : null;
        if (owa0Var != null) {
            return owa0Var.j();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
    public final void k(boolean z) {
        boolean z2 = !com.vk.libvideo.api.minimizable.a.j(h());
        ir20.d[] dVarArr = {ir20.d.f.a, ir20.d.e.a};
        ir20 ir20Var = (ir20) this.m;
        ir20Var.getClass();
        for (ir20.d dVar : dVarArr) {
            ir20Var.e7(dVar);
        }
        this.e.n();
        dns0 dns0Var = (dns0) this.r.getValue();
        yks0 yks0Var = this.k;
        VideoFile videoFile = yks0Var != null ? yks0Var.e : null;
        Boolean valueOf = Boolean.valueOf(z2);
        dns0Var.getClass();
        dns0.a(videoFile, valueOf, z);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xsna.ir20] */
    @Override // com.vk.video.ui.discovery.minimizable.player.controllers.a
    public final void onConfigurationChanged(Configuration configuration) {
        this.m.onConfigurationChanged(configuration);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, xsna.ir20] */
    @Override // com.vk.video.ui.discovery.minimizable.player.controllers.a
    public final void onPause() {
        yks0 yks0Var = this.k;
        VideoFile videoFile = yks0Var != null ? yks0Var.e : null;
        if (this.n.isFinishing()) {
            if ((videoFile != null ? videoFile.O() : null) != null) {
                fxc0.B().b(videoFile);
            }
        }
        this.m.onPause();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xsna.ir20] */
    @Override // com.vk.video.ui.discovery.minimizable.player.controllers.a
    public final void onResume() {
        this.m.onResume();
        this.p = false;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, xsna.ir20] */
    @Override // com.vk.video.ui.discovery.minimizable.player.controllers.PlayerRemoteController
    public final void seekTo(long j) {
        this.m.t5(new ir20.c.j(j));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xsna.ir20] */
    @Override // com.vk.video.ui.discovery.minimizable.player.controllers.a
    public final void t() {
        this.m.t();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xsna.ir20] */
    @Override // com.vk.video.ui.discovery.minimizable.player.controllers.a
    public final void vm() {
        this.m.e7(ir20.d.h.a);
    }

    /* compiled from: LinearMiniPlayerController.kt */
    public final class c extends c56 {
        public c() {
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, xsna.ir20] */
        @Override // xsna.io2
        public final void C() {
            i8z.this.m.e7(ir20.d.b.a);
        }

        @Override // xsna.io2
        public final boolean M() {
            return true;
        }

        @Override // xsna.c56
        public final View f() {
            return i8z.this.b;
        }

        @Override // xsna.io2
        public final VideoResizer.VideoFitType getContentScaleType() {
            return VideoResizer.VideoFitType.FIT;
        }

        @Override // xsna.io2
        public final void D0() {
        }

        @Override // xsna.io2
        public final void J() {
        }

        @Override // xsna.io2
        public final void e0() {
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
    public final void Wf(boolean z) {
    }

    @Override // xsna.yks0.a
    public final void uf(boolean z) {
    }

    @Override // xsna.yks0.a
    public final void vk(boolean z) {
    }

    /* compiled from: LinearMiniPlayerController.kt */
    public final class b implements exr0.a {
        public final d a;

        /* compiled from: LinearMiniPlayerController.kt */
        public static final /* synthetic */ class a extends FunctionReferenceImpl implements gzs<s3q0> {
            @Override // xsna.gzs
            public final s3q0 invoke() {
                ((MiniPlayerControllersWrapper.a) this.receiver).c();
                return s3q0.a;
            }
        }

        /* compiled from: LinearMiniPlayerController.kt */
        /* renamed from: xsna.i8z$b$b, reason: collision with other inner class name */
        public static final /* synthetic */ class C3040b extends FunctionReferenceImpl implements wzs<Boolean, String, s3q0> {
            @Override // xsna.wzs
            public final s3q0 invoke(Boolean bool, String str) {
                boolean booleanValue = bool.booleanValue();
                ((MiniPlayerControllersWrapper.a) this.receiver).a(str, booleanValue);
                return s3q0.a;
            }
        }

        /* compiled from: LinearMiniPlayerController.kt */
        public static final /* synthetic */ class c extends FunctionReferenceImpl implements wzs<Boolean, String, s3q0> {
            @Override // xsna.wzs
            public final s3q0 invoke(Boolean bool, String str) {
                boolean booleanValue = bool.booleanValue();
                ((MiniPlayerControllersWrapper.a) this.receiver).b(str, booleanValue);
                return s3q0.a;
            }
        }

        public b() {
            this.a = new d(i8z.this, this);
        }

        @Override // xsna.exr0.a
        public final u9t0 L() {
            return i8z.this.c.e;
        }

        @Override // xsna.exr0.a
        public final com.vk.video.ui.share.api.b S() {
            return i8z.this.c.k;
        }

        @Override // xsna.exr0.a
        public final NotificationsPermission V() {
            return i8z.this.c.a;
        }

        @Override // xsna.exr0.a
        public final yks0 W() {
            yks0 stub = yks0.i.getSTUB();
            yks0 yks0Var = i8z.this.k;
            return yks0Var == null ? stub : yks0Var;
        }

        @Override // xsna.exr0.a
        public final SearchStatsLoggingInfo a() {
            MiniPlayerControllersWrapper.VideoInfo videoInfo = ((MiniPlayerControllersWrapper) i8z.this.g.c.c).q;
            if (videoInfo != null) {
                return videoInfo.e;
            }
            return null;
        }

        @Override // xsna.exr0.a
        public final ows0 b() {
            return i8z.this.c.i;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, xsna.ir20] */
        @Override // xsna.exr0.a
        public final void c() {
            boolean z;
            i8z i8zVar = i8z.this;
            if (i8zVar.m.o8()) {
                VideoPipStateHolder.a.getClass();
                if (!VideoPipStateHolder.d()) {
                    z = true;
                    i8zVar.p = z;
                }
            }
            z = false;
            i8zVar.p = z;
        }

        @Override // xsna.exr0.a
        public final wzs<Boolean, String, s3q0> d() {
            return new c(2, i8z.this.e, MiniPlayerControllersWrapper.a.class, "onSubscribeClicked", "onSubscribeClicked(ZLjava/lang/String;)V", 0);
        }

        @Override // xsna.exr0.a
        public final gzs<s3q0> e() {
            return new a(0, i8z.this.e, MiniPlayerControllersWrapper.a.class, "onFullscreenLockClick", "onFullscreenLockClick()V", 0);
        }

        @Override // xsna.exr0.a
        public final gzs<VideoAlbum> f() {
            return i8z.this.c.l;
        }

        @Override // xsna.exr0.a
        public final ljt0 g() {
            return i8z.this.c.h;
        }

        @Override // xsna.exr0.a
        public final vit0 g0() {
            return i8z.this.c.b;
        }

        @Override // xsna.exr0.a
        public final FragmentActivity getActivity() {
            return i8z.this.n;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, xsna.ir20] */
        @Override // xsna.exr0.a
        public final View getView() {
            return i8z.this.m.getPlayerView();
        }

        @Override // xsna.exr0.a
        public final zet0 h() {
            return i8z.this.c.g;
        }

        @Override // xsna.exr0.a
        public final y6s0 i() {
            return this.a;
        }

        @Override // xsna.exr0.a
        public final kz20 j() {
            kz20 stub = kz20.m.getSTUB();
            kz20 kz20Var = i8z.this.j;
            return kz20Var == null ? stub : kz20Var;
        }

        @Override // xsna.exr0.a
        public final wzs<Boolean, String, s3q0> k() {
            return new C3040b(2, i8z.this.e, MiniPlayerControllersWrapper.a.class, "onLikeClicked", "onLikeClicked(ZLjava/lang/String;)V", 0);
        }

        @Override // xsna.exr0.a
        public final MobileOfficialAppsCoreNavStat$EventScreen l() {
            return MobileOfficialAppsCoreNavStat$EventScreen.VIDEO_DISCOVERY;
        }

        @Override // xsna.exr0.a
        public final com.vk.video.kidsprofile.restricteduseractions.a m() {
            return i8z.this.c.d;
        }

        @Override // xsna.exr0.a
        public final v3t0 m0() {
            return i8z.this.c.c;
        }

        @Override // xsna.exr0.a
        public final hfs0 n() {
            return i8z.this.c.j;
        }

        @Override // xsna.exr0.a
        public final AdsDataProvider o() {
            return null;
        }

        @Override // xsna.exr0.a
        public final gzs<s3q0> p() {
            return new b1z(i8z.this, 1);
        }

        @Override // xsna.exr0.a
        public final com.vk.video.ui.share.api.a p0() {
            return i8z.this.c.f;
        }

        /* compiled from: LinearMiniPlayerController.kt */
        public static final class d implements y6s0 {
            public final /* synthetic */ i8z a;
            public final /* synthetic */ b b;

            /* compiled from: LinearMiniPlayerController.kt */
            public static final /* synthetic */ class a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[VideoBottomSheetSideEffectOptions.values().length];
                    try {
                        iArr[VideoBottomSheetSideEffectOptions.REMOVE_FROM_DOWNLOADABLE.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[VideoBottomSheetSideEffectOptions.ADD_AS_CLIP.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[VideoBottomSheetSideEffectOptions.SHARE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[VideoBottomSheetSideEffectOptions.UNSUBSCRIBE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[VideoBottomSheetSideEffectOptions.SUBSCRIBE.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public d(i8z i8zVar, b bVar) {
                this.a = i8zVar;
                this.b = bVar;
            }

            /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, xsna.ir20] */
            @Override // xsna.y6s0
            public final void b(VideoBottomSheetSideEffectOptions videoBottomSheetSideEffectOptions, VideoFile videoFile) {
                int i = a.$EnumSwitchMapping$0[videoBottomSheetSideEffectOptions.ordinal()];
                if (i != 1) {
                    i8z i8zVar = this.a;
                    if (i == 2) {
                        i8zVar.m.t5(ir20.c.C3075c.a);
                        return;
                    }
                    if (i == 3) {
                        this.b.c();
                    } else if (i == 4 || i == 5) {
                        i8zVar.i(uit0.a);
                    }
                }
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, xsna.ir20] */
            @Override // xsna.y6s0
            public final int c2() {
                return this.a.m.c2();
            }

            @Override // xsna.y6s0
            public final void a(VideoBottomSheetSideEffectOptions videoBottomSheetSideEffectOptions, VideoFile videoFile) {
            }
        }
    }

    @Override // xsna.yks0.a
    public final void L9(VideoFile videoFile, boolean z) {
    }
}
