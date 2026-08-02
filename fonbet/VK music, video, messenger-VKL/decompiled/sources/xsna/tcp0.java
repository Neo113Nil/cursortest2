package xsna;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.dto.ui.UIBlockTopshelf;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoTopshelfVh;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.imageloader.view.VKImageView;
import com.vk.libvideo.api.minimizable.VideoMinimizableState;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import com.vk.libvideo.tracker.VideoPlayerMode;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoTopshelfMuteClick;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import one.video.cast.manager.status.MediaRouteConnectStatus;
import one.video.exo.offline.DownloadInfo;
import one.video.player.error.OneVideoPlaybackException;
import one.video.player.model.text.SubtitleRenderItem;
import one.video.transform.TransformController;
import xsna.bcp0;
import xsna.ybp0;
import xsna.ye0;

/* compiled from: TopshelfVideoView.kt */
/* loaded from: classes16.dex */
public abstract class tcp0 extends jp6 {
    public final UIBlockTopshelf.TopshelfItem d;
    public final g7s0 e;
    public final tu10 f;
    public final gzs<VideoMinimizableState> g;
    public final zbp0 h;
    public final VideoTopshelfVh.d i;
    public final gzs<Boolean> j;
    public yg5 k;
    public com.vk.libvideo.autoplay.a l;
    public b m;
    public w6x0 n;
    public final Object o;
    public yfw p;
    public VideoTextureView q;
    public boolean r;

    /* compiled from: TopshelfVideoView.kt */
    public final class a implements a7x0 {
        public a() {
        }

        @Override // xsna.a7x0
        public final void a(boolean z, boolean z2) {
            tcp0 tcp0Var = tcp0.this;
            com.vk.libvideo.autoplay.a a = com.vk.libvideo.autoplay.a.a(tcp0Var.l, null, Float.valueOf(z ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), null, null, null, null, 524279);
            tcp0Var.l = a;
            yg5 yg5Var = tcp0Var.k;
            if (yg5Var != null) {
                yg5Var.a0(a);
            }
            w6x0 w6x0Var = tcp0Var.n;
            if (w6x0Var != null) {
                w6x0Var.a(w6x0Var.c, z);
            }
            if (z2) {
                com.vk.libvideo.autoplay.a aVar = tcp0Var.l;
                String d = tcp0Var.d.d.b.d();
                if (d != null) {
                    und0 und0Var = new und0();
                    UiTracker uiTracker = UiTracker.a;
                    MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
                    SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, d, null, 46, null), new MobileOfficialAppsVideoStat$TypeVideoTopshelfMuteClick(epx.d(aVar.d, 1.0f) ? MobileOfficialAppsVideoStat$TypeVideoTopshelfMuteClick.Subtype.UNMUTE_AUDIO : MobileOfficialAppsVideoStat$TypeVideoTopshelfMuteClick.Subtype.MUTE_AUDIO), 2);
                    und0Var.f = c;
                    und0Var.g = b;
                    und0Var.q();
                }
            }
        }

        @Override // xsna.a7x0
        public final boolean b() {
            Float f = tcp0.this.l.d;
            return (f != null ? f.floatValue() : 0.0f) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
    }

    /* compiled from: TopshelfVideoView.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<w6x0, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(w6x0 w6x0Var) {
            ((mcy) this.receiver).set(w6x0Var);
            return s3q0.a;
        }
    }

    /* compiled from: TopshelfVideoView.kt */
    public static final /* synthetic */ class d extends MutablePropertyReference0Impl {
        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.rcy
        public final Object get() {
            return ((tcp0) this.receiver).n;
        }

        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.mcy
        public final void set(Object obj) {
            ((tcp0) this.receiver).n = (w6x0) obj;
        }
    }

    public tcp0(UIBlockTopshelf.TopshelfItem topshelfItem, g7s0 g7s0Var, tu10 tu10Var, gzs gzsVar, zbp0 zbp0Var, VideoTopshelfVh.d dVar, gzs gzsVar2, boolean z) {
        super(z);
        this.d = topshelfItem;
        this.e = g7s0Var;
        this.f = tu10Var;
        this.g = gzsVar;
        this.h = zbp0Var;
        this.i = dVar;
        this.j = gzsVar2;
        this.l = com.vk.libvideo.autoplay.a.t;
        this.o = msy.a(LazyThreadSafetyMode.NONE, new ucp0(0, this, tcp0.class, "createVolumeHandler", "createVolumeHandler()Lcom/vk/catalog2/common/ui/holders/video/topshelf/components/VolumeHandler;", 0));
    }

    @Override // xsna.jp6, xsna.vcp0
    public final void a(boolean z) {
        if (!z) {
            yg5 yg5Var = this.k;
            if (yg5Var != null) {
                yg5Var.pause();
                return;
            }
            return;
        }
        VideoMinimizableState invoke = this.g.invoke();
        if ((invoke instanceof VideoMinimizableState.Collapsed) || (invoke instanceof VideoMinimizableState.Expanded) || com.vk.libvideo.api.minimizable.a.g(invoke)) {
            return;
        }
        if (!this.r) {
            f();
        }
        yg5 yg5Var2 = this.k;
        if (yg5Var2 == null || !yg5Var2.isPaused()) {
            return;
        }
        Long l = this.h.c;
        if (l != null) {
            yg5Var2.seek(l.longValue());
        }
        yg5 yg5Var3 = this.k;
        if (yg5Var3 != null && yg5Var3.p0() && this.j.invoke().booleanValue()) {
            yg5Var3.play();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.jp6, xsna.vcp0
    public final void b(ybp0.c cVar) {
        ((a7x0) this.o.getValue()).a(!cVar.a, false);
    }

    @Override // xsna.jp6
    public void d(ConstraintLayout constraintLayout) {
        this.c = constraintLayout;
        this.p = new yfw(constraintLayout.getContext(), this.d, this.i);
        if (this.e.o()) {
            f();
        }
        yfw yfwVar = this.p;
        if (yfwVar != null) {
            c(yfwVar, null);
        }
    }

    public abstract yg5 e(UIBlockTopshelf.TopshelfItem topshelfItem);

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
    public final void f() {
        VideoMinimizableState invoke = this.g.invoke();
        if ((invoke instanceof VideoMinimizableState.Collapsed) || (invoke instanceof VideoMinimizableState.Expanded) || com.vk.libvideo.api.minimizable.a.g(invoke) || !this.e.o()) {
            return;
        }
        yg5 e = e(this.d);
        this.k = e;
        ConstraintLayout constraintLayout = this.c;
        if (e == null || constraintLayout == null) {
            return;
        }
        VideoTextureView videoTextureView = new VideoTextureView(constraintLayout.getContext(), null, 6, 0);
        videoTextureView.getTransformController().f(TransformController.ScaleType.CROP, false);
        videoTextureView.setLayoutParams(new ConstraintLayout.b(-1, -1));
        constraintLayout.addView(videoTextureView);
        this.q = videoTextureView;
        e.z0(videoTextureView, this.l, null);
        e.G0(true);
        b bVar = new b();
        e.f0(bVar);
        this.m = bVar;
        new Handler(Looper.getMainLooper()).postDelayed(new vo2(6, this, e), this.h.b);
        ((bcp0.f) this.f.c).invoke(new xh5(e, this.l, videoTextureView, null, null));
        Context context = constraintLayout.getContext();
        ?? r7 = this.o;
        c(new w6x0(context, (a7x0) r7.getValue()), new c(1, new d(this, tcp0.class, "volumeButton", "getVolumeButton()Lcom/vk/catalog2/common/ui/holders/video/topshelf/components/VolumeButton;", 0), mcy.class, "set", "set(Ljava/lang/Object;)V", 0));
        ((a7x0) r7.getValue()).a(!r10.a, false);
        this.r = true;
    }

    @Override // xsna.jp6, xsna.vcp0
    public void onDestroyView() {
        super.onDestroyView();
        yg5 yg5Var = this.k;
        b bVar = this.m;
        if (yg5Var == null || bVar == null) {
            return;
        }
        yg5Var.T(bVar);
    }

    /* compiled from: TopshelfVideoView.kt */
    public final class b implements hnt0 {
        public b() {
        }

        @Override // xsna.hnt0
        public final void V3(yg5 yg5Var) {
            VKImageView vKImageView;
            tcp0 tcp0Var = tcp0.this;
            tu10 tu10Var = tcp0Var.f;
            yfw yfwVar = tcp0Var.p;
            if (yfwVar != null && (vKImageView = yfwVar.b) != null) {
                bwt0.p0(vKImageView, false);
            }
            ((bcp0.e) tu10Var.b).invoke(ybp0.f.a);
            ((bcp0.e) tu10Var.b).invoke(ybp0.b.a);
            VideoPlayerMode videoPlayerMode = VideoPlayerMode.PREVIEW;
            if (yg5Var instanceof VideoAutoPlay) {
                i0q0.j(new tou(5, videoPlayerMode, yg5Var));
            }
        }

        @Override // xsna.hnt0
        public final void j4(VideoAutoPlay videoAutoPlay) {
            boolean z = videoAutoPlay.getVolume() == 1.0f;
            tcp0 tcp0Var = tcp0.this;
            w6x0 w6x0Var = tcp0Var.n;
            if (w6x0Var != null) {
                w6x0Var.a(w6x0Var.c, z);
            }
            ((bcp0.e) tcp0Var.f.b).invoke(new ybp0.c(!z));
        }

        @Override // xsna.hnt0
        public final void r1(yg5 yg5Var) {
            VKImageView vKImageView;
            tcp0 tcp0Var = tcp0.this;
            yfw yfwVar = tcp0Var.p;
            if (yfwVar != null && (vKImageView = yfwVar.b) != null) {
                bwt0.p0(vKImageView, true);
            }
            ((bcp0.e) tcp0Var.f.b).invoke(ybp0.a.a);
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
        public final void K2(VideoAutoPlay videoAutoPlay) {
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
        public final void a(boolean z) {
        }

        @Override // xsna.hnt0
        public final void d4(yg5 yg5Var) {
        }

        @Override // xsna.hnt0
        public final void l(x2s0 x2s0Var) {
        }

        @Override // xsna.hnt0
        public final void m4(VideoAutoPlay videoAutoPlay) {
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
        public final void x0(boolean z) {
        }

        @Override // xsna.hnt0
        public final void H(long j, long j2) {
        }

        @Override // xsna.hnt0
        public final void K0(com.vk.libvideo.autoplay.a aVar, com.vk.libvideo.autoplay.a aVar2) {
        }

        @Override // xsna.hnt0
        public final void N3(VideoAutoPlay videoAutoPlay, long j) {
        }

        @Override // xsna.hnt0
        public final void P1(VideoAutoPlay videoAutoPlay, boolean z) {
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
}
