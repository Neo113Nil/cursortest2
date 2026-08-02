package xsna;

import android.widget.LinearLayout;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemAutoPlayVh;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import java.util.List;
import java.util.concurrent.TimeUnit;
import one.video.cast.manager.status.MediaRouteConnectStatus;
import one.video.exo.offline.DownloadInfo;
import one.video.player.error.OneVideoPlaybackException;
import one.video.player.model.text.SubtitleRenderItem;
import xsna.ye0;

/* compiled from: VideoItemAutoPlayVh.kt */
/* loaded from: classes16.dex */
public final class qqs0 implements hnt0 {
    public final /* synthetic */ VideoItemAutoPlayVh b;
    public final /* synthetic */ g7s0 c;

    public qqs0(VideoItemAutoPlayVh videoItemAutoPlayVh, g7s0 g7s0Var) {
        this.b = videoItemAutoPlayVh;
        this.c = g7s0Var;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [com.vk.catalog2.common.ui.mvp.holder.video.AutoPlayingVideoItemViewHolder, com.vk.catalog2.common.ui.mvp.holder.video.VideoItemVh] */
    @Override // xsna.hnt0
    public final void V3(yg5 yg5Var) {
        LinearLayout Ug = this.b.m.Ug();
        if (Ug != null) {
            bwt0.p0(Ug, false);
        }
    }

    @Override // xsna.hnt0
    public final void X1(VideoAutoPlay videoAutoPlay, long j, long j2) {
        VideoItemAutoPlayVh videoItemAutoPlayVh = this.b;
        fh5 fh5Var = videoItemAutoPlayVh.z;
        if (fh5Var == null) {
            fh5Var = null;
        }
        if (fh5Var.o.C2()) {
            djd b = com.vk.toggle.d.f0.b();
            if (b == null) {
                b = new djd(true, null);
            }
            boolean z = b.a;
            Long l = b.b;
            if (z || l == null || j < TimeUnit.SECONDS.toMillis(l.longValue())) {
                return;
            }
            fh5 fh5Var2 = videoItemAutoPlayVh.z;
            if (videoAutoPlay.j0((fh5Var2 != null ? fh5Var2 : null).v)) {
                if (this.c.J().b2()) {
                    videoAutoPlay.C(false);
                } else {
                    videoAutoPlay.S(false);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [com.vk.catalog2.common.ui.mvp.holder.video.AutoPlayingVideoItemViewHolder, com.vk.catalog2.common.ui.mvp.holder.video.VideoItemVh] */
    @Override // xsna.hnt0
    public final void r1(yg5 yg5Var) {
        LinearLayout Ug = this.b.m.Ug();
        if (Ug != null) {
            bwt0.p0(Ug, true);
        }
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
    public final void j4(VideoAutoPlay videoAutoPlay) {
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
    public final void h3(yg5 yg5Var, int i, int i2) {
    }

    @Override // xsna.hnt0
    public final void J3(yg5 yg5Var, int i, int i2, OneVideoPlaybackException.ErrorCode errorCode, Throwable th) {
    }
}
