package xsna;

import com.vk.libvideo.autoplay.VideoAutoPlay;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import java.util.List;
import one.video.cast.manager.status.MediaRouteConnectStatus;
import one.video.exo.offline.DownloadInfo;
import one.video.player.error.OneVideoPlaybackException;
import one.video.player.model.text.SubtitleRenderItem;
import xsna.ye0;

/* compiled from: VkAutoPlayVideo.kt */
/* loaded from: classes17.dex */
public final class fdu0 implements hnt0 {
    public final /* synthetic */ VideoTextureView b;
    public final /* synthetic */ wh50 c;
    public final /* synthetic */ wh50 d;
    public final /* synthetic */ wh50 e;
    public final /* synthetic */ wh50 f;
    public final /* synthetic */ wh50 g;
    public final /* synthetic */ wh50 h;
    public final /* synthetic */ wh50 i;
    public final /* synthetic */ wh50 j;
    public final /* synthetic */ wh50 k;
    public final /* synthetic */ wh50 l;
    public final /* synthetic */ wh50 m;
    public final /* synthetic */ wh50 n;

    public fdu0(VideoTextureView videoTextureView, wh50 wh50Var, wh50 wh50Var2, wh50 wh50Var3, wh50 wh50Var4, wh50 wh50Var5, wh50 wh50Var6, wh50 wh50Var7, wh50 wh50Var8, wh50 wh50Var9, wh50 wh50Var10, wh50 wh50Var11, wh50 wh50Var12) {
        this.b = videoTextureView;
        this.c = wh50Var;
        this.d = wh50Var2;
        this.e = wh50Var3;
        this.f = wh50Var4;
        this.g = wh50Var5;
        this.h = wh50Var6;
        this.i = wh50Var7;
        this.j = wh50Var8;
        this.k = wh50Var9;
        this.l = wh50Var10;
        this.m = wh50Var11;
        this.n = wh50Var12;
    }

    @Override // xsna.hnt0
    public final void J3(yg5 yg5Var, int i, int i2, OneVideoPlaybackException.ErrorCode errorCode, Throwable th) {
        h3(yg5Var, i, i2);
    }

    @Override // xsna.hnt0
    public final void P1(VideoAutoPlay videoAutoPlay, boolean z) {
        ((wzs) this.m.getValue()).invoke(videoAutoPlay, Boolean.valueOf(z));
    }

    @Override // xsna.hnt0
    public final void T0(VideoAutoPlay videoAutoPlay) {
        ((izs) this.l.getValue()).invoke(videoAutoPlay);
    }

    @Override // xsna.hnt0
    public final void U(VideoAutoPlay videoAutoPlay) {
        ((izs) this.i.getValue()).invoke(videoAutoPlay);
    }

    @Override // xsna.hnt0
    public final void V3(yg5 yg5Var) {
        this.b.getMatrixProvider().l(yg5Var.h0().a, yg5Var.h0().b);
        ((izs) this.e.getValue()).invoke(yg5Var);
    }

    @Override // xsna.hnt0
    public final void X1(VideoAutoPlay videoAutoPlay, long j, long j2) {
        ((yzs) this.n.getValue()).invoke(videoAutoPlay, Long.valueOf(j), Long.valueOf(j2));
    }

    @Override // xsna.hnt0
    public final void d4(yg5 yg5Var) {
        ((izs) this.k.getValue()).invoke(yg5Var);
    }

    @Override // xsna.hnt0
    public final void h3(yg5 yg5Var, int i, int i2) {
        ((wzs) this.j.getValue()).invoke(yg5Var, Integer.valueOf(i));
    }

    @Override // xsna.hnt0
    public final void m4(VideoAutoPlay videoAutoPlay) {
        ((izs) this.g.getValue()).invoke(videoAutoPlay);
    }

    @Override // xsna.hnt0
    public final void n2(yg5 yg5Var) {
        ((izs) this.d.getValue()).invoke(yg5Var);
    }

    @Override // xsna.hnt0
    public final void p2(VideoAutoPlay videoAutoPlay) {
        this.b.getMatrixProvider().l(videoAutoPlay.h0().a, videoAutoPlay.h0().b);
        ((izs) this.c.getValue()).invoke(videoAutoPlay);
    }

    @Override // xsna.hnt0
    public final void r1(yg5 yg5Var) {
        ((izs) this.h.getValue()).invoke(yg5Var);
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
    public final void E3(VideoAutoPlay videoAutoPlay, int i, int i2) {
    }
}
