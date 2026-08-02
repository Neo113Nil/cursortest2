package xsna;

import android.content.Context;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import java.util.List;
import one.video.cast.manager.status.MediaRouteConnectStatus;
import one.video.exo.offline.DownloadInfo;
import one.video.player.error.OneVideoPlaybackException;
import one.video.player.model.text.SubtitleRenderItem;
import xsna.h4t0;
import xsna.ye0;

/* compiled from: VideoMediaSessionController.kt */
/* loaded from: classes3.dex */
public final class bts0 {
    public final gzs<yg5> a;
    public final hnt0 b;
    public final cts0 c = (cts0) cts0.f.getValue();
    public final yss0 d = new yss0();
    public final a e = new a();
    public final zss0 f = new zss0();
    public dts0 g;
    public io.reactivex.rxjava3.disposables.c h;

    public bts0(gzs gzsVar, h4t0.a aVar) {
        this.a = gzsVar;
        this.b = aVar;
    }

    public final void a() {
        yg5 invoke = this.a.invoke();
        if (invoke == null) {
            return;
        }
        dts0 dts0Var = this.g;
        if (dts0Var == null) {
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            dts0Var = this.c.a(context);
            this.g = dts0Var;
        }
        if (dts0Var != null) {
            b(dts0Var, invoke);
        }
    }

    public final void b(dts0 dts0Var, yg5 yg5Var) {
        yg5 invoke;
        ats0 ats0Var;
        zss0 zss0Var = this.f;
        zss0Var.a = yg5Var;
        cts0 cts0Var = this.c;
        if (cts0Var.b(dts0Var) && (ats0Var = cts0Var.d) != null) {
            ats0Var.a.add(zss0Var);
        }
        gzs<yg5> gzsVar = this.a;
        yg5 invoke2 = gzsVar.invoke();
        if (invoke2 != null) {
            invoke2.f0(this.e);
        }
        hnt0 hnt0Var = this.b;
        if (hnt0Var == null || (invoke = gzsVar.invoke()) == null) {
            return;
        }
        invoke.f0(hnt0Var);
    }

    public final void c() {
        yg5 invoke;
        ats0 ats0Var;
        cts0 cts0Var = this.c;
        zss0 zss0Var = this.f;
        dts0 dts0Var = this.g;
        if (dts0Var != null && cts0Var.b(dts0Var) && (ats0Var = cts0Var.d) != null) {
            ats0Var.a.remove(zss0Var);
        }
        gzs<yg5> gzsVar = this.a;
        yg5 invoke2 = gzsVar.invoke();
        if (invoke2 != null) {
            invoke2.T(this.e);
        }
        hnt0 hnt0Var = this.b;
        if (hnt0Var != null && (invoke = gzsVar.invoke()) != null) {
            invoke.T(hnt0Var);
        }
        dts0 dts0Var2 = this.g;
        if (dts0Var2 != null) {
            cts0Var.e(dts0Var2);
        }
        this.g = null;
        io.reactivex.rxjava3.disposables.c cVar = this.h;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    public final void d() {
        yg5 invoke;
        dts0 dts0Var = this.g;
        if (dts0Var == null || (invoke = this.a.invoke()) == null) {
            return;
        }
        this.c.g(dts0Var, this.d.a(invoke));
    }

    /* compiled from: VideoMediaSessionController.kt */
    public final class a implements hnt0 {
        public a() {
        }

        @Override // xsna.hnt0
        public final void V3(yg5 yg5Var) {
            bts0.this.d();
        }

        @Override // xsna.hnt0
        public final void j() {
            bts0.this.d();
        }

        @Override // xsna.hnt0
        public final void m(je0 je0Var, com.vk.libvideo.api.ad.a aVar) {
            bts0.this.d();
        }

        @Override // xsna.hnt0
        public final void m4(VideoAutoPlay videoAutoPlay) {
            bts0.this.d();
        }

        @Override // xsna.hnt0
        public final void r1(yg5 yg5Var) {
            bts0.this.d();
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
        public final void j4(VideoAutoPlay videoAutoPlay) {
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
