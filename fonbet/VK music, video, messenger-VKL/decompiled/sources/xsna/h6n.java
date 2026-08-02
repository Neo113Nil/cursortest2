package xsna;

import com.vk.libvideo.autoplay.VideoAutoPlay;
import java.util.List;
import one.video.cast.manager.status.MediaRouteConnectStatus;
import one.video.exo.offline.DownloadInfo;
import one.video.player.error.OneVideoPlaybackException;
import one.video.player.model.text.SubtitleRenderItem;
import xsna.gfs0;
import xsna.ye0;

/* compiled from: DiscoverPreviewAutoPlayController.kt */
/* loaded from: classes4.dex */
public final class h6n implements hnt0 {
    public final /* synthetic */ i6n b;

    public h6n(i6n i6nVar) {
        this.b = i6nVar;
    }

    @Override // xsna.hnt0
    public final void E3(VideoAutoPlay videoAutoPlay, int i, int i2) {
        this.b.e.a(i, i2);
    }

    @Override // xsna.hnt0
    public final void J3(yg5 yg5Var, int i, int i2, OneVideoPlaybackException.ErrorCode errorCode, Throwable th) {
        h3(yg5Var, i, i2);
    }

    @Override // xsna.hnt0
    public final void P1(VideoAutoPlay videoAutoPlay, boolean z) {
        i6n i6nVar = this.b;
        gfs0.a aVar = i6nVar.e;
        if (z && i6nVar.i) {
            aVar.c(false);
            aVar.d(false);
        }
    }

    @Override // xsna.hnt0
    public final void V3(yg5 yg5Var) {
        this.b.e.a(yg5Var.h0().a, yg5Var.h0().b);
    }

    @Override // xsna.hnt0
    public final void d4(yg5 yg5Var) {
        i6n i6nVar = this.b;
        i6nVar.i = true;
        gfs0.a aVar = i6nVar.e;
        aVar.c(false);
        aVar.d(false);
    }

    @Override // xsna.hnt0
    public final void h3(yg5 yg5Var, int i, int i2) {
        gfs0.a aVar = this.b.e;
        aVar.c(false);
        aVar.b(true);
    }

    @Override // xsna.hnt0
    public final void m4(VideoAutoPlay videoAutoPlay) {
        if (videoAutoPlay.I0()) {
            return;
        }
        videoAutoPlay.S(false);
    }

    @Override // xsna.hnt0
    public final void n2(yg5 yg5Var) {
        this.b.e.c(true);
    }

    @Override // xsna.hnt0
    public final void p2(VideoAutoPlay videoAutoPlay) {
        this.b.e.a(videoAutoPlay.h0().a, videoAutoPlay.h0().b);
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
    public final void j4(VideoAutoPlay videoAutoPlay) {
    }

    @Override // xsna.hnt0
    public final void l(x2s0 x2s0Var) {
    }

    @Override // xsna.hnt0
    public final void p0(yg5 yg5Var) {
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
    public final void K0(com.vk.libvideo.autoplay.a aVar, com.vk.libvideo.autoplay.a aVar2) {
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
    public final void X1(VideoAutoPlay videoAutoPlay, long j, long j2) {
    }
}
