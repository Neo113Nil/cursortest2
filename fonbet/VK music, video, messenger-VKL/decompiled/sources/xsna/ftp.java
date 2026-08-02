package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import com.vk.libvideo.autoplay.b;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.functions.b;
import java.util.List;
import one.video.cast.manager.status.MediaRouteConnectStatus;
import one.video.exo.offline.DownloadInfo;
import one.video.player.error.OneVideoPlaybackException;
import one.video.player.model.text.SubtitleRenderItem;
import xsna.ye0;

/* compiled from: EpisodePresenter.kt */
/* loaded from: classes2.dex */
public final class ftp {
    public final VideoFile a;
    public final io.reactivex.rxjava3.subjects.d<Long> b;
    public final io.reactivex.rxjava3.subjects.d<Boolean> c;
    public final yg5 d;
    public final a e;
    public final io.reactivex.rxjava3.internal.operators.observable.c0 f;

    public ftp(VideoFile videoFile) {
        this.a = videoFile;
        io.reactivex.rxjava3.subjects.d<Long> O0 = io.reactivex.rxjava3.subjects.d.O0(Long.valueOf(com.vk.libvideo.autoplay.j.b(videoFile)));
        this.b = O0;
        io.reactivex.rxjava3.subjects.d<Boolean> O02 = io.reactivex.rxjava3.subjects.d.O0(Boolean.FALSE);
        this.c = O02;
        bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
        this.d = b.C1208b.a().e(videoFile, null);
        this.e = new a();
        io.reactivex.rxjava3.internal.operators.observable.j1 U = O0.U(new o7(new i4h(this, 16), 13));
        a.q qVar = io.reactivex.rxjava3.internal.functions.a.a;
        b.a aVar = io.reactivex.rxjava3.internal.functions.b.a;
        io.reactivex.rxjava3.internal.operators.observable.y yVar = new io.reactivex.rxjava3.internal.operators.observable.y(U, qVar, aVar);
        io.reactivex.rxjava3.internal.operators.observable.y yVar2 = new io.reactivex.rxjava3.internal.operators.observable.y(O02, qVar, aVar);
        com.vk.core.utils.newtork.b.a.getClass();
        io.reactivex.rxjava3.core.q l = io.reactivex.rxjava3.core.q.l(yVar, yVar2, com.vk.core.utils.newtork.b.d, new p7(new etp(this, 0), 26));
        n20 n20Var = new n20(new o1e(this, 20), 24);
        l.getClass();
        this.f = new io.reactivex.rxjava3.internal.operators.observable.c0(new io.reactivex.rxjava3.internal.operators.observable.c0(l, n20Var, io.reactivex.rxjava3.internal.functions.a.c), io.reactivex.rxjava3.internal.functions.a.d, new y96(this, 1));
    }

    /* compiled from: EpisodePresenter.kt */
    public static final class a implements hnt0 {
        public a() {
        }

        @Override // xsna.hnt0
        public final void J3(yg5 yg5Var, int i, int i2, OneVideoPlaybackException.ErrorCode errorCode, Throwable th) {
            h3(yg5Var, i, i2);
        }

        @Override // xsna.hnt0
        public final void V3(yg5 yg5Var) {
            ftp.this.c.onNext(Boolean.TRUE);
        }

        @Override // xsna.hnt0
        public final void X1(VideoAutoPlay videoAutoPlay, long j, long j2) {
            ftp.this.b.onNext(Long.valueOf(j));
        }

        @Override // xsna.hnt0
        public final void h3(yg5 yg5Var, int i, int i2) {
            ftp.this.c.onNext(Boolean.FALSE);
        }

        @Override // xsna.hnt0
        public final void m4(VideoAutoPlay videoAutoPlay) {
            ftp.this.c.onNext(Boolean.FALSE);
        }

        @Override // xsna.hnt0
        public final void r1(yg5 yg5Var) {
            ftp.this.c.onNext(Boolean.FALSE);
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
    }
}
