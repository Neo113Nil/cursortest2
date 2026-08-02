package xsna;

import com.vk.libvideo.autoplay.VideoAutoPlay;
import java.util.Iterator;
import java.util.List;
import one.video.cast.manager.status.MediaRouteConnectStatus;
import one.video.exo.offline.DownloadInfo;
import one.video.player.OneVideoPlayer;
import one.video.player.error.OneVideoPlaybackException;
import one.video.player.model.text.SubtitleRenderItem;
import xsna.ye0;

/* compiled from: AutoPlayStateListener.kt */
/* loaded from: classes3.dex */
public final class ji5 implements hnt0 {
    public final tu80 b;
    public final bzw c;
    public t6p0 d = new t6p0(false, false);
    public boolean e;
    public DownloadInfo f;
    public bwp g;

    public ji5(tu80 tu80Var, bzw bzwVar) {
        this.b = tu80Var;
        this.c = bzwVar;
    }

    @Override // xsna.hnt0
    public final void J3(yg5 yg5Var, int i, int i2, OneVideoPlaybackException.ErrorCode errorCode, Throwable th) {
        h3(yg5Var, i, i2);
    }

    @Override // xsna.hnt0
    public final void R3(MediaRouteConnectStatus mediaRouteConnectStatus) {
        b();
    }

    @Override // xsna.hnt0
    public final void T0(VideoAutoPlay videoAutoPlay) {
        this.g = null;
        b();
    }

    @Override // xsna.hnt0
    public final void U(VideoAutoPlay videoAutoPlay) {
        this.e = false;
        b();
    }

    @Override // xsna.hnt0
    public final void U0(one.video.player.tracks.b bVar) {
        b();
    }

    @Override // xsna.hnt0
    public final void U3(DownloadInfo downloadInfo) {
        this.f = downloadInfo;
        b();
    }

    @Override // xsna.hnt0
    public final void V3(yg5 yg5Var) {
        b();
    }

    @Override // xsna.hnt0
    public final void X1(VideoAutoPlay videoAutoPlay, long j, long j2) {
        this.c.invoke(Long.valueOf(j));
    }

    public final void b() {
        this.b.invoke();
    }

    @Override // xsna.hnt0
    public final void d4(yg5 yg5Var) {
        this.e = true;
        b();
    }

    @Override // xsna.hnt0
    public final void g(com.vk.libvideo.api.ad.a aVar, ye0.a aVar2) {
        b();
    }

    @Override // xsna.hnt0
    public final void h3(yg5 yg5Var, int i, int i2) {
        this.g = new bwp(i, i2);
        b();
    }

    @Override // xsna.hnt0
    public final void j() {
        b();
    }

    @Override // xsna.hnt0
    public final void m(je0 je0Var, com.vk.libvideo.api.ad.a aVar) {
        b();
    }

    @Override // xsna.hnt0
    public final void m4(VideoAutoPlay videoAutoPlay) {
        b();
    }

    @Override // xsna.hnt0
    public final void n2(yg5 yg5Var) {
        this.g = null;
        b();
    }

    @Override // xsna.hnt0
    public final void p2(VideoAutoPlay videoAutoPlay) {
        one.video.player.tracks.b bVar;
        OneVideoPlayer a;
        OneVideoPlayer a2;
        List<one.video.player.tracks.b> Y;
        Object obj;
        d3b0 d3b0Var = videoAutoPlay.p0;
        if (d3b0Var == null || (a2 = d3b0Var.a()) == null || (Y = a2.Y()) == null) {
            bVar = null;
        } else {
            Iterator<T> it = Y.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (epx.f(((who0) ((one.video.player.tracks.b) obj).c).c, "kk")) {
                        break;
                    }
                }
            }
            bVar = (one.video.player.tracks.b) obj;
        }
        boolean z = false;
        boolean z2 = bVar != null;
        if (d3b0Var != null && (a = d3b0Var.a()) != null && a.F().size() > 1) {
            z = true;
        }
        this.d = new t6p0(z2, z);
        this.g = null;
        b();
    }

    @Override // xsna.hnt0
    public final void r1(yg5 yg5Var) {
        b();
    }

    @Override // xsna.hnt0
    public final void u() {
        this.e = false;
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
    public final void t2() {
    }

    @Override // xsna.hnt0
    public final void K2(VideoAutoPlay videoAutoPlay) {
    }

    @Override // xsna.hnt0
    public final void O(one.video.player.tracks.c cVar) {
    }

    @Override // xsna.hnt0
    public final void S2(long j) {
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
    public final void z0(VideoAutoPlay videoAutoPlay, int i) {
    }

    @Override // xsna.hnt0
    public final void E3(VideoAutoPlay videoAutoPlay, int i, int i2) {
    }
}
