package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.autoplay.AutoPlayMinifiedState;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import com.vk.libvideo.autoplay.b;
import com.vk.libvideo.design.view.preview.PreviewImageView;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import com.vk.libvideo.minified_player.VideoMinifiedPlayerStateHolder;
import com.vk.libvideo.models.autoplay.RepeatMode;
import com.vk.libvideo.models.videotracker.PlayerType;
import com.vk.libvideo.models.videotracker.ScreenType;
import com.vk.libvideo.pip.VideoPipStateHolder;
import com.vk.libvideo.tracker.VideoPlayerMode;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vkontakte.android.R;
import java.util.ArrayList;
import one.video.cast.manager.status.MediaRouteConnectStatus;
import one.video.player.OneVideoPlayer;
import xsna.c63;
import xsna.ye0;

/* compiled from: LiveVideoState.kt */
/* loaded from: classes3.dex */
public final class nnz implements rnz, qtx0 {
    public final piz b;
    public final gzs<Boolean> c;
    public String d;
    public boolean e;
    public yg5 f;
    public final VideoTextureView g;
    public final Handler h;
    public fkz i;
    public Long j;
    public boolean k;
    public boolean l;
    public final String m;
    public final com.vk.libvideo.autoplay.a n;
    public final a o;
    public final b p;
    public VideoFile q;

    /* compiled from: LiveVideoState.kt */
    public static final class a extends c63.b {
        public a() {
        }

        @Override // xsna.c63.b
        public final void o(Activity activity) {
            nnz nnzVar;
            yg5 yg5Var;
            VideoPipStateHolder.a.getClass();
            if (VideoPipStateHolder.d() || (yg5Var = (nnzVar = nnz.this).f) == null) {
                return;
            }
            yg5Var.a0(nnzVar.n);
        }
    }

    /* compiled from: LiveVideoState.kt */
    public static final class b extends ont0 {
        public b() {
        }

        @Override // xsna.hnt0
        public final void E3(VideoAutoPlay videoAutoPlay, int i, int i2) {
            nnz.this.e();
        }

        @Override // xsna.hnt0
        public final void N3(VideoAutoPlay videoAutoPlay, long j) {
            Long l;
            nnz nnzVar = nnz.this;
            if (nnzVar.h() && ((l = nnzVar.j) == null || l.longValue() != j)) {
                L.e(defpackage.k0.a(j, "LiveVideoState.onPlaybackDurationChange: duration = "));
                nnzVar.b.B0(j);
            }
            nnzVar.j = Long.valueOf(j);
            fkz fkzVar = nnzVar.i;
            if (fkzVar == null || j == fkzVar.d || nnzVar.h()) {
                return;
            }
            L.e(defpackage.k0.a(j, "LiveVideoState.onPlaybackDurationChange: duration = "));
            fkzVar.d = j;
            nnzVar.h.post(new qnz(nnzVar, j, 0));
        }

        @Override // xsna.hnt0
        public final void R3(MediaRouteConnectStatus mediaRouteConnectStatus) {
            nnz.this.b.setMediaRouteConnectStatus(mediaRouteConnectStatus);
        }

        @Override // xsna.hnt0
        public final void S2(final long j) {
            final nnz nnzVar = nnz.this;
            nnzVar.h.post(new Runnable() { // from class: xsna.onz
                @Override // java.lang.Runnable
                public final void run() {
                    nnz nnzVar2 = nnz.this;
                    nnzVar2.b.M2(nnzVar2.a(), j, nnzVar2.g());
                }
            });
        }

        @Override // xsna.hnt0
        public final void T0(VideoAutoPlay videoAutoPlay) {
            nnz nnzVar = nnz.this;
            if (nnzVar.e) {
                nnzVar.k();
            }
        }

        @Override // xsna.hnt0
        public final void V3(yg5 yg5Var) {
            if (nnz.this.c.invoke().booleanValue()) {
                nnz.this.f();
                nnz.this.b.A4();
                oiz presenter = nnz.this.b.getPresenter();
                if (presenter != null) {
                    presenter.p();
                }
                yg5Var.a0(nnz.this.n);
                yg5Var.l0();
                i560.d.a();
                c63 c63Var = c63.a;
                if (c63.f) {
                    VideoPlayerMode videoPlayerMode = VideoPlayerMode.PREVIEW;
                    if (yg5Var instanceof VideoAutoPlay) {
                        i0q0.j(new tou(5, videoPlayerMode, yg5Var));
                    }
                }
            }
        }

        @Override // xsna.hnt0
        public final void X1(VideoAutoPlay videoAutoPlay, long j, long j2) {
            nnz.this.f();
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.hnt0
        public final void a(boolean z) {
            dhr0 dhr0Var = dhr0.a;
            Context viewContext = nnz.this.b.getViewContext();
            dhr0Var.getClass();
            l7s t = dhr0.t(viewContext);
            i560 i560Var = i560.d;
            de4 de4Var = new de4(26);
            i560Var.getClass();
            g560 g560Var = new g560(false, 0);
            ((com.vk.video.kidsprofile.restricteduseractions.a) i560Var.b.getValue()).getClass();
            i0q0.j(new h560(i560Var, g560Var, t, z, de4Var));
        }

        @Override // xsna.hnt0
        public final void d4(yg5 yg5Var) {
            nnz nnzVar = nnz.this;
            nnzVar.f();
            oiz presenter = nnzVar.b.getPresenter();
            if (presenter != null) {
                presenter.j2();
            }
        }

        @Override // xsna.hnt0
        public final void g(com.vk.libvideo.api.ad.a aVar, ye0.a aVar2) {
            nnz nnzVar = nnz.this;
            nnzVar.h.post(new pnz(nnzVar, aVar2, aVar, 0));
        }

        @Override // xsna.hnt0
        public final void h() {
            nnz nnzVar = nnz.this;
            nnzVar.h.post(new nq4(nnzVar, 7));
        }

        @Override // xsna.hnt0
        public final void h3(yg5 yg5Var, int i, int i2) {
            String string;
            nnz nnzVar = nnz.this;
            piz pizVar = nnzVar.b;
            try {
                string = pizVar.getViewContext().getString(i);
            } catch (Resources.NotFoundException unused) {
                string = pizVar.getViewContext().getString(R.string.live_general_error_description);
            }
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.d, new Object[]{go9.b("onError ", string)});
            }
            oiz presenter = pizVar.getPresenter();
            if (presenter != null) {
                presenter.n2(string, yg5Var.W());
            }
            nnzVar.f();
        }

        @Override // xsna.hnt0
        public final void j() {
            nnz nnzVar = nnz.this;
            nnzVar.h.post(new bi5(nnzVar, 4));
        }

        @Override // xsna.hnt0
        public final void j4(VideoAutoPlay videoAutoPlay) {
            oiz presenter = nnz.this.b.getPresenter();
            if (presenter != null) {
                presenter.z();
            }
        }

        @Override // xsna.hnt0
        public final void m(je0 je0Var, com.vk.libvideo.api.ad.a aVar) {
            nnz nnzVar = nnz.this;
            nnzVar.h.post(new n9k(nnzVar, je0Var, aVar, 2));
        }

        @Override // xsna.hnt0
        public final void m4(VideoAutoPlay videoAutoPlay) {
            oiz presenter = nnz.this.b.getPresenter();
            if (presenter != null) {
                presenter.onComplete();
            }
        }

        @Override // xsna.hnt0
        public final void n2(yg5 yg5Var) {
            nnz.this.k();
        }

        @Override // xsna.hnt0
        public final void p2(VideoAutoPlay videoAutoPlay) {
            nnz.this.f();
        }

        @Override // xsna.hnt0
        public final void r1(yg5 yg5Var) {
            oiz presenter = nnz.this.b.getPresenter();
            if (presenter != null) {
                presenter.onPause();
            }
        }

        @Override // xsna.hnt0
        public final void z0(VideoAutoPlay videoAutoPlay, int i) {
            nnz.this.f();
        }
    }

    public nnz(piz pizVar, com.vk.libvideo.autoplay.a aVar, gzs<Boolean> gzsVar) {
        this.b = pizVar;
        this.c = gzsVar;
        this.g = pizVar.A3();
        this.h = new Handler(Looper.getMainLooper());
        this.m = "LiveVideoState";
        this.n = aVar == null ? pizVar instanceof mnt0 ? ((mnt0) pizVar).getVideoConfig() : new com.vk.libvideo.autoplay.a(true, RepeatMode.BY_VIDEO_PARAMS, null, false, false, false, null, null, null, null, PlayerType.FULLSCREEN, ScreenType.PORTRAIT, false, null, 425980) : aVar;
        this.o = new a();
        this.p = new b();
    }

    @Override // xsna.rnz
    public final void D() {
        yg5 yg5Var = this.f;
        if (yg5Var != null) {
            yg5Var.D();
        }
        i();
    }

    @Override // xsna.qtx0
    public final String D9() {
        return this.m;
    }

    @Override // xsna.rnz
    public final long a() {
        if (h()) {
            yg5 yg5Var = this.f;
            if (yg5Var != null) {
                return yg5Var.getDuration();
            }
            return 0L;
        }
        fkz fkzVar = this.i;
        if (fkzVar != null) {
            return fkzVar.d;
        }
        return 0L;
    }

    @Override // xsna.rnz
    public final void b() {
        this.b.g4(false, true);
    }

    @Override // xsna.rnz
    public final boolean c() {
        if (this.i == null) {
            return false;
        }
        yg5 yg5Var = this.f;
        if (yg5Var != null && yg5Var.g0() == -5) {
            return false;
        }
        yg5 yg5Var2 = this.f;
        return yg5Var2 == null || yg5Var2.g0() != -3;
    }

    @Override // xsna.rnz
    public final void d() {
        this.b.g4(true, true);
    }

    public final void e() {
        Image image;
        ArrayList arrayList;
        tn10 matrixProvider;
        VideoFile videoFile = this.q;
        int width = videoFile != null ? videoFile.getWidth() : 0;
        VideoFile videoFile2 = this.q;
        int height = videoFile2 != null ? videoFile2.getHeight() : 0;
        yg5 yg5Var = this.f;
        if (yg5Var != null) {
            wgt0 h0 = yg5Var.h0();
            int i = h0.a;
            height = h0.b;
            width = i;
        }
        if (width == 0 || height == 0) {
            VideoFile videoFile3 = this.q;
            ImageSize imageSize = (videoFile3 == null || (image = videoFile3.getImage()) == null || (arrayList = image.c) == null) ? null : (ImageSize) ixj0.b(arrayList);
            if (imageSize != null) {
                com.vk.dto.common.im.Image image2 = imageSize.d;
                int i2 = image2.b;
                height = image2.c;
                width = i2;
            }
        }
        VideoTextureView videoTextureView = this.g;
        if (videoTextureView != null && (matrixProvider = videoTextureView.getMatrixProvider()) != null) {
            matrixProvider.l(width, height);
        }
        PreviewImageView previewImageView = this.b.getPreviewImageView();
        if (previewImageView != null) {
            previewImageView.c = width;
            previewImageView.d = height;
            previewImageView.U();
        }
    }

    public final void f() {
        if (this.k) {
            this.k = false;
            oiz presenter = this.b.getPresenter();
            if (presenter != null) {
                presenter.s2();
            }
        }
    }

    public final boolean g() {
        d3b0 v0;
        OneVideoPlayer a2;
        yg5 yg5Var = this.f;
        if (yg5Var == null || (v0 = yg5Var.v0()) == null || (a2 = v0.a()) == null) {
            return false;
        }
        return a2.i();
    }

    @Override // xsna.rnz
    public final float getVolume() {
        yg5 yg5Var = this.f;
        if (yg5Var != null) {
            return yg5Var.getVolume();
        }
        return 1.0f;
    }

    public final boolean h() {
        d3b0 v0;
        OneVideoPlayer a2;
        yg5 yg5Var = this.f;
        if (yg5Var == null || (v0 = yg5Var.v0()) == null || (a2 = v0.a()) == null) {
            return false;
        }
        return a2.o();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0063, code lost:
    
        if (com.vk.libvideo.minified_player.VideoMinifiedPlayerStateHolder.a() == false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i() {
        yg5 yg5Var;
        StringBuilder sb = new StringBuilder("autoPlay?.isPlaying=");
        yg5 yg5Var2 = this.f;
        sb.append(yg5Var2 != null ? Boolean.valueOf(yg5Var2.isPlaying()) : null);
        sb.append(' ');
        sb.append(this.f);
        L.e(sb.toString());
        boolean z = true;
        this.e = true;
        e();
        yg5 yg5Var3 = this.f;
        boolean z2 = (yg5Var3 == null || !yg5Var3.isPlaying()) && ((yg5Var = this.f) == null || !yg5Var.w0());
        yg5 yg5Var4 = this.f;
        VideoTextureView videoTextureView = this.g;
        if (yg5Var4 == null || !yg5Var4.j0(videoTextureView)) {
            VideoMinifiedPlayerStateHolder.a.getClass();
        }
        z = false;
        if (z2 || z) {
            if (z2) {
                k();
            }
            yg5 yg5Var5 = this.f;
            if (yg5Var5 != null) {
                yg5.o0(yg5Var5, this.d, null, null, yg5Var5.V(), 6);
                if (videoTextureView != null) {
                    yg5Var5.z0(videoTextureView, this.n, null);
                }
                yg5Var5.l0();
                yg5Var5.f0(this.p);
                c63 c63Var = c63.a;
                c63.a(this.o);
                yg5Var5.play();
            }
        }
    }

    public final void j(VideoFile videoFile) {
        Long l;
        this.q = videoFile;
        if (videoFile != null) {
            yg5 yg5Var = this.f;
            if (yg5Var != null) {
                VideoFile A = yg5Var.A();
                if (!epx.f(A != null ? A.r1() : null, videoFile.r1())) {
                    throw new IllegalStateException("Only single video file supported");
                }
            }
            bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
            yg5 e = b.C1208b.a().e(videoFile, null);
            e.I();
            this.f = e;
            fkz c = new gkz(videoFile).c();
            this.i = c;
            if (c != null && (l = this.j) != null) {
                c.d = l.longValue();
            }
            yg5 yg5Var2 = this.f;
            if (yg5Var2 != null) {
                yg5Var2.f0(this.p);
            }
        }
        e();
    }

    public final void k() {
        if (this.k || this.l) {
            return;
        }
        this.k = true;
        this.h.post(new wd2(this, 6));
    }

    public final void l() {
        yg5 yg5Var;
        AutoPlayMinifiedState R0;
        if (this.l) {
            return;
        }
        this.e = false;
        yg5 yg5Var2 = this.f;
        if ((yg5Var2 == null || (R0 = yg5Var2.R0()) == null || !R0.h()) && (yg5Var = this.f) != null) {
            yg5Var.stop();
        }
    }

    @Override // xsna.qtx0
    public final boolean lc() {
        return true;
    }

    @Override // xsna.qtx0
    public final yg5 q5() {
        return this.f;
    }

    @Override // xsna.rnz
    public final void setVolume(float f) {
        yg5 yg5Var = this.f;
        if (yg5Var != null) {
            yg5Var.setVolume(f);
        }
    }

    public /* synthetic */ nnz(piz pizVar) {
        this(pizVar, null, new aq0(10));
    }
}
