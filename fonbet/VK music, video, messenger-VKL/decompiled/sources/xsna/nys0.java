package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import com.vk.libvideo.autoplay.b;
import com.vk.libvideo.video.queue.api.di.VideoQueueComponent;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import one.video.cast.manager.status.MediaRouteConnectStatus;
import one.video.exo.offline.DownloadInfo;
import one.video.player.error.OneVideoPlaybackException;
import one.video.player.model.text.SubtitleRenderItem;
import xsna.ye0;

/* compiled from: VideoNotificationEventListener.kt */
/* loaded from: classes2.dex */
public final class nys0 implements hnt0 {
    public yg5 b;
    public fqd c;
    public b8j0 d;
    public q8w e;
    public final Object f;
    public final bpn0 g;

    public nys0(VideoQueueComponent videoQueueComponent) {
        this.f = msy.a(LazyThreadSafetyMode.NONE, new jds0(videoQueueComponent, 3));
        this.g = new bpn0(new e1s0(videoQueueComponent, 4));
    }

    @Override // xsna.hnt0
    public final void J3(yg5 yg5Var, int i, int i2, OneVideoPlaybackException.ErrorCode errorCode, Throwable th) {
        h3(yg5Var, i, i2);
    }

    @Override // xsna.hnt0
    public final void T0(VideoAutoPlay videoAutoPlay) {
        fqd fqdVar = this.c;
        if (fqdVar != null) {
            fqdVar.invoke();
        }
    }

    @Override // xsna.hnt0
    public final void V3(yg5 yg5Var) {
        fqd fqdVar = this.c;
        if (fqdVar != null) {
            fqdVar.invoke();
        }
        q8w q8wVar = this.e;
        if (q8wVar != null) {
            q8wVar.invoke(yg5Var);
        }
    }

    @Override // xsna.hnt0
    public final void g(com.vk.libvideo.api.ad.a aVar, ye0.a aVar2) {
        fqd fqdVar = this.c;
        if (fqdVar != null) {
            fqdVar.invoke();
        }
    }

    @Override // xsna.hnt0
    public final void h3(yg5 yg5Var, int i, int i2) {
        fqd fqdVar = this.c;
        if (fqdVar != null) {
            fqdVar.invoke();
        }
    }

    @Override // xsna.hnt0
    public final void j() {
        fqd fqdVar = this.c;
        if (fqdVar != null) {
            fqdVar.invoke();
        }
    }

    @Override // xsna.hnt0
    public final void m(je0 je0Var, com.vk.libvideo.api.ad.a aVar) {
        fqd fqdVar = this.c;
        if (fqdVar != null) {
            fqdVar.invoke();
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.hnt0
    public final void m4(VideoAutoPlay videoAutoPlay) {
        if (fxc0.B().J().i0()) {
            com.vk.libvideo.autoplay.e eVar = com.vk.libvideo.autoplay.e.a;
            if (com.vk.libvideo.autoplay.e.a()) {
                a2s0 b = ((zst0) this.f.getValue()).b(false, true);
                if (b == null) {
                    fqd fqdVar = this.c;
                    if (fqdVar != null) {
                        fqdVar.invoke();
                        return;
                    }
                    return;
                }
                VideoFile videoFile = b.a;
                if (epx.f(videoAutoPlay.u.r1(), videoFile.r1())) {
                    videoAutoPlay.S(false);
                    fqd fqdVar2 = this.c;
                    if (fqdVar2 != null) {
                        fqdVar2.invoke();
                        return;
                    }
                    return;
                }
                videoAutoPlay.C(true);
                bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
                yg5 e = b.C1208b.a().e(videoFile, null);
                e.play();
                b8j0 b8j0Var = this.d;
                if (b8j0Var != null) {
                    b8j0Var.invoke(e);
                    return;
                }
                return;
            }
        }
        fqd fqdVar3 = this.c;
        if (fqdVar3 != null) {
            fqdVar3.invoke();
        }
    }

    @Override // xsna.hnt0
    public final void n2(yg5 yg5Var) {
        fqd fqdVar = this.c;
        if (fqdVar != null) {
            fqdVar.invoke();
        }
    }

    @Override // xsna.hnt0
    public final void p2(VideoAutoPlay videoAutoPlay) {
        fqd fqdVar = this.c;
        if (fqdVar != null) {
            fqdVar.invoke();
        }
    }

    @Override // xsna.hnt0
    public final void r1(yg5 yg5Var) {
        fqd fqdVar = this.c;
        if (fqdVar != null) {
            fqdVar.invoke();
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

    @Override // xsna.hnt0
    public final void X1(VideoAutoPlay videoAutoPlay, long j, long j2) {
    }
}
