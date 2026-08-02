package xsna;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.picture.VkImage;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import com.vk.libvideo.autoplay.b;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import com.vk.profile.community.impl.livecover.LiveCoverType;
import com.vk.profile.community.impl.ui.cover.redesign.delegate.BaseCommunityLiveCoverItemDelegate;
import com.vk.profile.community.impl.ui.cover.redesign.delegate.b;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.stat.scheme.MobileOfficialAppsGroupsStat$LiveCoverEvent;
import java.lang.ref.SoftReference;
import java.util.List;
import kotlin.Pair;
import one.video.cast.manager.status.MediaRouteConnectStatus;
import one.video.exo.offline.DownloadInfo;
import one.video.player.error.OneVideoPlaybackException;
import one.video.player.model.text.SubtitleRenderItem;
import xsna.pqs0;
import xsna.ye0;

/* compiled from: CommunityVideoCoverViewController.kt */
/* loaded from: classes5.dex */
public final class x4i implements y4i {
    public final b8h a;
    public pqs0 b;
    public final b.C1563b c;
    public r8h d;
    public yg5 e;
    public final pqs0.a f;
    public final b9h g;
    public boolean h;
    public boolean i;
    public final a j;

    public x4i(b8h b8hVar, pqs0 pqs0Var, r8h r8hVar, c8h c8hVar, b.a aVar, b.C1563b c1563b) {
        this.a = b8hVar;
        this.b = pqs0Var;
        this.c = c1563b;
        this.d = r8hVar;
        this.f = pqs0Var.a;
        b9h b9hVar = new b9h(LiveCoverType.VIDEO, r8hVar.b);
        this.g = b9hVar;
        this.j = new a(b8hVar, b9hVar, r8hVar, c8hVar, aVar, c1563b, new td8(0, this, x4i.class, "onComplete", "onComplete()V", 0, 1));
    }

    @Override // xsna.y4i
    public final void C(boolean z) {
        yg5 yg5Var;
        if (this.i) {
            this.i = false;
            yg5 yg5Var2 = this.e;
            if (yg5Var2 != null) {
                yg5Var2.c();
            }
            yg5 yg5Var3 = this.e;
            if (yg5Var3 != null) {
                yg5Var3.T(this.j);
            }
            k();
        }
        if (!z || (yg5Var = this.e) == null) {
            return;
        }
        yg5Var.seek(0L);
    }

    @Override // xsna.y4i
    public final void a(Float f) {
        if (f == null) {
            return;
        }
        h().seek((long) (f.floatValue() * h().getDuration()));
    }

    @Override // xsna.y4i
    public final void b(r8h r8hVar) {
        yg5 yg5Var;
        r8h r8hVar2 = this.d;
        this.d = r8hVar;
        this.j.d = r8hVar;
        if (r8hVar2.d == r8hVar.d || (yg5Var = this.e) == null) {
            return;
        }
        yg5Var.a0(i(this.b.b.b));
    }

    @Override // xsna.y4i
    public final void c(y4i y4iVar) {
        yg5 yg5Var;
        if (y4iVar instanceof x4i) {
            b8h b8hVar = this.a;
            VkImage foregroundImageView = b8hVar.getForegroundImageView();
            x4i x4iVar = (x4i) y4iVar;
            b8h b8hVar2 = x4iVar.a;
            foregroundImageView.setImageDrawable(b8hVar2.getForegroundImageView().getDrawable());
            b8hVar.getImageView().setImageDrawable(b8hVar2.getImageView().getDrawable());
            yg5 yg5Var2 = x4iVar.e;
            this.e = yg5Var2;
            if (yg5Var2 == null || yg5Var2.j0(b8hVar.getVideoTextureView()) || (yg5Var = this.e) == null) {
                return;
            }
            yg5Var.z0(b8hVar.getVideoTextureView(), i(this.b.b.b), null);
        }
    }

    @Override // xsna.y4i
    public final void d() {
        ImageSize Cb = this.f.b.e1().Cb(iah0.f().widthPixels, true, false);
        String str = Cb != null ? Cb.d.d : null;
        b8h b8hVar = this.a;
        b8hVar.getImageView().o0(str, null);
        b8hVar.getForegroundImageView().o0(str, null);
        b8hVar.getForegroundImageView().setVisibility(0);
    }

    @Override // xsna.y4i
    public final void e(pqs0 pqs0Var) {
        this.b = pqs0Var;
    }

    @Override // xsna.y4i
    public final void f(c8h c8hVar) {
        this.j.e = c8hVar;
    }

    @Override // xsna.y4i
    public final void g(boolean z) {
        C(true);
        yg5 yg5Var = this.e;
        if (yg5Var != null && z) {
            yg5Var.seek(0L);
            this.g.c = false;
            k15.y(LiveCoverType.VIDEO, Long.valueOf(this.d.b.b), this.h, yg5Var.getDuration(), j());
            yg5Var.k0();
        }
        if (z) {
            this.a.getForegroundImageView().setVisibility(0);
        }
        this.e = null;
    }

    @Override // xsna.y4i
    public final Float getCurrentProgress() {
        return Float.valueOf(j());
    }

    public final yg5 h() {
        yg5 yg5Var = this.e;
        if (yg5Var != null) {
            return yg5Var;
        }
        bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
        yg5 e = b.C1208b.a().e(this.f.b, null);
        this.e = e;
        return e;
    }

    public final com.vk.libvideo.autoplay.a i(boolean z) {
        return z ? com.vk.libvideo.autoplay.a.t : this.d.d ? new com.vk.libvideo.autoplay.a(true, null, null, false, false, false, null, null, null, null, null, null, false, null, 524286) : com.vk.libvideo.autoplay.a.t;
    }

    @Override // xsna.y4i
    public final boolean isPlaying() {
        yg5 yg5Var = this.e;
        return yg5Var != null && yg5Var.isPlaying() && !yg5Var.isPaused() && yg5Var.j0(this.a.getVideoTextureView());
    }

    public final float j() {
        yg5 h = h();
        return swe0.f(h.getPosition() / h.getDuration(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x009c, code lost:
    
        if (r4 >= com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k() {
        Bitmap bitmap;
        Pair pair;
        Pair pair2;
        BitmapDrawable bitmapDrawable;
        VideoFile A;
        VideoFile A2;
        float f;
        SoftReference<Bitmap> softReference = VideoTextureView.r;
        if (softReference == null || (bitmap = softReference.get()) == null) {
            return;
        }
        b8h b8hVar = this.a;
        float width = b8hVar.getVideoTextureView().getWidth();
        float height = b8hVar.getVideoTextureView().getHeight();
        float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (width <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || height <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            pair = new Pair(0, 0);
        } else {
            yg5 yg5Var = this.e;
            if (yg5Var != null && (A = yg5Var.A()) != null) {
                int width2 = A.getWidth();
                Integer valueOf = Integer.valueOf(width2);
                if (width2 <= 0) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    float intValue = valueOf.intValue();
                    yg5 yg5Var2 = this.e;
                    if (yg5Var2 != null && (A2 = yg5Var2.A()) != null) {
                        int height2 = A2.getHeight();
                        Integer valueOf2 = Integer.valueOf(height2);
                        if (height2 <= 0) {
                            valueOf2 = null;
                        }
                        if (valueOf2 != null) {
                            float intValue2 = valueOf2.intValue();
                            float f3 = width / height;
                            if (intValue / intValue2 > f3) {
                                float f4 = intValue - (f3 * intValue2);
                                float f5 = 2;
                                float f6 = (width / intValue) * (f4 / f5);
                                if (f6 < width / f5 && f6 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                    f = 0.0f;
                                    f2 = f6;
                                    pair2 = new Pair(Integer.valueOf((int) f2), Integer.valueOf((int) f));
                                    int intValue3 = ((Number) pair2.d()).intValue();
                                    int intValue4 = ((Number) pair2.g()).intValue();
                                    int width3 = bitmap.getWidth() - (intValue3 * 2);
                                    int height3 = bitmap.getHeight() - (intValue4 * 2);
                                    Bitmap createBitmap = (width3 > 0 || height3 <= 0) ? null : Bitmap.createBitmap(bitmap, intValue3, intValue4, width3, height3);
                                    bitmapDrawable = createBitmap != null ? new BitmapDrawable(b8hVar.getVideoTextureView().getResources(), createBitmap) : null;
                                    if (bitmapDrawable == null) {
                                        b8hVar.getVideoTextureView().setBackground(bitmapDrawable);
                                        return;
                                    }
                                    return;
                                }
                                f = 0.0f;
                                pair2 = new Pair(Integer.valueOf((int) f2), Integer.valueOf((int) f));
                                int intValue32 = ((Number) pair2.d()).intValue();
                                int intValue42 = ((Number) pair2.g()).intValue();
                                int width32 = bitmap.getWidth() - (intValue32 * 2);
                                int height32 = bitmap.getHeight() - (intValue42 * 2);
                                if (width32 > 0) {
                                }
                                if (createBitmap != null) {
                                }
                                if (bitmapDrawable == null) {
                                }
                            } else {
                                float f7 = intValue2 - (intValue / f3);
                                float f8 = 2;
                                f = (height / intValue2) * (f7 / f8);
                                if (f < height / f8) {
                                }
                                f = 0.0f;
                                pair2 = new Pair(Integer.valueOf((int) f2), Integer.valueOf((int) f));
                                int intValue322 = ((Number) pair2.d()).intValue();
                                int intValue422 = ((Number) pair2.g()).intValue();
                                int width322 = bitmap.getWidth() - (intValue322 * 2);
                                int height322 = bitmap.getHeight() - (intValue422 * 2);
                                if (width322 > 0) {
                                }
                                if (createBitmap != null) {
                                }
                                if (bitmapDrawable == null) {
                                }
                            }
                        }
                    }
                    pair = new Pair(0, 0);
                }
            }
            pair = new Pair(0, 0);
        }
        pair2 = pair;
        int intValue3222 = ((Number) pair2.d()).intValue();
        int intValue4222 = ((Number) pair2.g()).intValue();
        int width3222 = bitmap.getWidth() - (intValue3222 * 2);
        int height3222 = bitmap.getHeight() - (intValue4222 * 2);
        if (width3222 > 0) {
        }
        if (createBitmap != null) {
        }
        if (bitmapDrawable == null) {
        }
    }

    @Override // xsna.y4i
    public final void play() {
        this.c.invoke(Float.valueOf(j()));
        z4i videoTextureView = this.a.getVideoTextureView();
        yg5 h = h();
        if (!h.j0(videoTextureView)) {
            VideoFile A = h.A();
            videoTextureView.getMatrixProvider().l(A.getWidth(), A.getHeight());
            h.z0(videoTextureView, i(this.b.b.b), null);
            k();
            videoTextureView.setVisibility(0);
        }
        h().f0(this.j);
        yg5 h2 = h();
        if (this.h) {
            h2.S(false);
            this.h = false;
        } else {
            h2.f();
        }
        h2.l0();
        this.i = true;
    }

    /* compiled from: CommunityVideoCoverViewController.kt */
    public static final class a implements hnt0 {
        public final b8h b;
        public final b9h c;
        public r8h d;
        public c8h e;
        public final b.a f;
        public final b.C1563b g;
        public final td8 h;
        public Bitmap i;

        public a(b8h b8hVar, b9h b9hVar, r8h r8hVar, c8h c8hVar, b.a aVar, b.C1563b c1563b, td8 td8Var) {
            this.b = b8hVar;
            this.c = b9hVar;
            this.d = r8hVar;
            this.e = c8hVar;
            this.f = aVar;
            this.g = c1563b;
            this.h = td8Var;
        }

        @Override // xsna.hnt0
        public final void J3(yg5 yg5Var, int i, int i2, OneVideoPlaybackException.ErrorCode errorCode, Throwable th) {
            h3(yg5Var, i, i2);
        }

        @Override // xsna.hnt0
        public final void U(VideoAutoPlay videoAutoPlay) {
            this.c.c = false;
        }

        @Override // xsna.hnt0
        public final void V3(yg5 yg5Var) {
            this.b.setTooltipVisibility(false);
            b9h b9hVar = this.c;
            if (!b9hVar.c) {
                siz.b(Long.valueOf(b9hVar.b.b), MobileOfficialAppsGroupsStat$LiveCoverEvent.LiveCoverEventType.START_PLAY, siz.a(b9hVar.a), null, null);
            }
            b9hVar.c = true;
        }

        @Override // xsna.hnt0
        public final void X1(VideoAutoPlay videoAutoPlay, long j, long j2) {
            this.f.invoke(BaseCommunityLiveCoverItemDelegate.ViewState.COMMON);
            Bitmap bitmap = this.i;
            b8h b8hVar = this.b;
            if (bitmap == null) {
                int height = b8hVar.getHeight();
                int width = b8hVar.getWidth();
                if (height > 0 && width > 0) {
                    this.i = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                }
            }
            Bitmap bitmap2 = this.i;
            if (bitmap2 != null) {
                VideoTextureView.f(b8hVar.getVideoTextureView(), bitmap2, new am0(26), 4);
            }
            this.g.invoke(Float.valueOf(j / j2));
        }

        @Override // xsna.hnt0
        public final void d4(yg5 yg5Var) {
            b8h b8hVar = this.b;
            f4m.j(b8hVar.getForegroundImageView());
            f4m.j(b8hVar.getImageView());
            this.f.invoke(BaseCommunityLiveCoverItemDelegate.ViewState.COMMON);
        }

        @Override // xsna.hnt0
        public final void h3(yg5 yg5Var, int i, int i2) {
            this.f.invoke(BaseCommunityLiveCoverItemDelegate.ViewState.ERROR);
            siz.b(Long.valueOf(this.d.b.b), MobileOfficialAppsGroupsStat$LiveCoverEvent.LiveCoverEventType.DOWNLOADING_ERROR, siz.a(LiveCoverType.VIDEO), null, null);
        }

        @Override // xsna.hnt0
        public final void m4(VideoAutoPlay videoAutoPlay) {
            this.h.invoke();
            this.c.c = false;
            this.e.a.invoke(CommunityProfileAction.g.d.c.b);
        }

        @Override // xsna.hnt0
        public final void n2(yg5 yg5Var) {
            this.f.invoke(BaseCommunityLiveCoverItemDelegate.ViewState.PROGRESS);
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
        public final void p2(VideoAutoPlay videoAutoPlay) {
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
