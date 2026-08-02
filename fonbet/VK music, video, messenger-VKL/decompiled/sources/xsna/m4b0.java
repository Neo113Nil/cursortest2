package xsna;

import android.util.Size;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.TimelineThumbs;
import com.vk.dto.common.VideoEpisode;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.libvideo.api.ad.a;
import com.vk.libvideo.autoplay.b;
import com.vk.libvideo.design.view.overlay.VideoOverlayView;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import com.vk.libvideo.ui.video2.PlayerState;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import one.video.cast.manager.status.MediaRouteConnectStatus;
import one.video.exo.offline.DownloadInfo;
import one.video.player.OneVideoPlayer;
import one.video.smartcast.api.ConnectionState;
import one.video.transform.TransformController;
import xsna.sox;
import xsna.ye0;

/* compiled from: PlayerStateAdapter.kt */
/* loaded from: classes3.dex */
public final class m4b0 {
    public final VideoTextureView a;
    public final yg5 b;
    public final boolean c;
    public final odm d;
    public final Object e;
    public final Object f;
    public final owo0 g;
    public final sox h;
    public final Size i;
    public boolean j;
    public TransformController.ScaleType k;
    public jya0 l;
    public boolean m;
    public ConnectionState n;
    public final ji5 o;
    public final io.reactivex.rxjava3.subjects.d<j4t0> p;
    public final io.reactivex.rxjava3.internal.operators.observable.c0 q;
    public final io.reactivex.rxjava3.subjects.d<Long> r;
    public final io.reactivex.rxjava3.internal.operators.observable.z0 s;

    public m4b0(VideoTextureView videoTextureView, yg5 yg5Var, boolean z, TransformController.ScaleType scaleType, boolean z2, odm odmVar) {
        owo0 owo0Var;
        sox soxVar;
        this.a = videoTextureView;
        this.b = yg5Var;
        this.c = z2;
        this.d = odmVar;
        i21 i21Var = new i21(27);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.e = msy.a(lazyThreadSafetyMode, i21Var);
        this.f = msy.a(lazyThreadSafetyMode, new lz2(23));
        TimelineThumbs B0 = yg5Var.A().B0();
        if (B0 != null) {
            int i = B0.b;
            int i2 = B0.c;
            int i3 = B0.d;
            owo0Var = new owo0(i, i2, i3, B0.e / i3, B0.f, B0.i);
        } else {
            owo0Var = null;
        }
        this.g = owo0Var;
        long duration = yg5Var.A().getDuration() * 1000;
        List<VideoEpisode> Y3 = yg5Var.A().Y3();
        if (Y3.isEmpty()) {
            soxVar = null;
        } else {
            ArrayList arrayList = new ArrayList();
            int size = Y3.size();
            int i4 = 0;
            while (i4 < size) {
                int i5 = i4 + 1;
                arrayList.add(new sox.a(Y3.get(i4).b * 1000, ((VideoEpisode) j5g.b0(i5, Y3)) != null ? r11.b * 1000 : duration, Y3.get(i4).c));
                i4 = i5;
            }
            soxVar = new sox(arrayList, duration);
        }
        this.h = soxVar;
        this.i = new Size(this.b.A().getWidth(), this.b.A().getHeight());
        this.j = z;
        this.k = scaleType;
        this.m = true;
        this.n = null;
        this.o = new ji5(new tu80(this, 7), new bzw(this, 21));
        io.reactivex.rxjava3.subjects.d<j4t0> O0 = io.reactivex.rxjava3.subjects.d.O0(a());
        this.p = O0;
        this.q = new io.reactivex.rxjava3.internal.operators.observable.c0(new io.reactivex.rxjava3.internal.operators.observable.c0(O0, new ux00(new fv90(this, 5), 11), io.reactivex.rxjava3.internal.functions.a.c), io.reactivex.rxjava3.internal.functions.a.d, new l46(this, 8));
        io.reactivex.rxjava3.subjects.d<Long> N0 = io.reactivex.rxjava3.subjects.d.N0();
        this.r = N0;
        this.s = new io.reactivex.rxjava3.internal.operators.observable.z0(N0);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01bd  */
    /* JADX WARN: Type inference failed for: r7v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v19, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final j4t0 a() {
        VideoOverlayView.c cVar;
        VideoOverlayView.c gVar;
        boolean a;
        boolean z;
        PlayerState playerState;
        OneVideoPlayer a2;
        yg5 yg5Var = this.b;
        VideoFile A = yg5Var.A();
        d3b0 v0 = yg5Var.v0();
        PlayerState playerState2 = yg5Var.w0() ? PlayerState.AD_PLAYING : yg5Var.P0() ? PlayerState.AD_PAUSE : yg5Var.J() ? PlayerState.ERROR : yg5Var.d() ? PlayerState.BUFFERING : yg5Var.isPlaying() ? PlayerState.PLAYING : yg5Var.a() ? PlayerState.ENDED : yg5Var.v0() == null ? PlayerState.IDLE : yg5Var.isPaused() ? PlayerState.PAUSE : PlayerState.IDLE;
        je0 N0 = yg5Var.N0();
        czn cznVar = null;
        com.vk.libvideo.api.ad.a j = N0 != null ? ((ye0.a) N0).j() : null;
        a.AbstractC1195a abstractC1195a = j instanceof a.AbstractC1195a ? (a.AbstractC1195a) j : null;
        Size size = (!yg5Var.P0() || abstractC1195a == null) ? this.i : new Size(abstractC1195a.a().getWidth(), abstractC1195a.a().getHeight());
        boolean z2 = false;
        boolean z3 = true;
        boolean z4 = ((v0 == null || (a2 = v0.a()) == null) ? null : a2.Q()) != null;
        ji5 ji5Var = this.o;
        DownloadInfo downloadInfo = ji5Var.f;
        boolean z5 = A.m1() != null;
        bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
        boolean z6 = b.C1208b.a().x == MediaRouteConnectStatus.CONNECTED;
        ConnectionState connectionState = this.n;
        wya0 wya0Var = new wya0(playerState2, size, z4, this.g, this.h, downloadInfo, z5, z6, connectionState == ConnectionState.CONNECTED || connectionState == ConnectionState.CONNECTING || connectionState == ConnectionState.SELECTED, A.k0(), ji5Var.d, this.l, ji5Var.g, this.m);
        VideoTextureView videoTextureView = this.a;
        float width = videoTextureView.getWidth() / videoTextureView.getHeight();
        float abs = Math.abs(width - (r5.getWidth() / r5.getHeight())) / width;
        fgn fgnVar = new fgn(0.01f <= abs && abs <= 1.0f, yg5Var.P0() ? TransformController.ScaleType.FIT : this.k, ji5Var.e);
        VideoFile A2 = yg5Var.A();
        VideoRestriction O = A2.O();
        boolean B = yg5Var.B();
        boolean z7 = this.c;
        if (B && fxc0.B().c(A2) && O != null && (!e5o.b(O) || !z7)) {
            gVar = new VideoOverlayView.c.i(((a390) this.e.getValue()).a(O), ((s290) this.f.getValue()).a(A2.getImage()), true, new com.vk.movika.sdk.base.logic.processor.actions.e(17, A2, this));
        } else {
            if (!this.j) {
                cVar = null;
                boolean z8 = ji5Var.e;
                boolean z9 = yg5Var.v0() != null;
                a = yg5Var.a();
                boolean J = yg5Var.J();
                z = yg5Var.P0() && (!z8 || z9 || a || J || this.j);
                if (!a && !J) {
                    z3 = false;
                }
                boolean a3 = e5o.a(yg5Var.A());
                playerState = PlayerState.ENDED;
                if (playerState2 != playerState || (cVar != null && (!z7 || !a3))) {
                    z = false;
                }
                if ((z7 || !a3) && playerState2 != playerState) {
                    z2 = z3;
                }
                gpt0 gpt0Var = gpt0.a;
                ImageSize i = gpt0.i(videoTextureView.getContext(), yg5Var.A());
                g3k g3kVar = new g3k(z2, z, i == null ? i.d.d : null);
                rzj0 rzj0Var = new rzj0(new gy(1, this, m4b0.class, "onSeek", "onSeek(J)V", 0, 15));
                je0 N02 = yg5Var.N0();
                com.vk.libvideo.api.ad.a j2 = !yg5Var.P0() ? N02 == null ? ((ye0.a) N02).j() : null : null;
                if (z7 && e5o.a(yg5Var.A())) {
                    cznVar = (czn) this.d.invoke();
                }
                return new j4t0(wya0Var, fgnVar, g3kVar, cVar, j2, rzj0Var, cznVar);
            }
            gVar = new VideoOverlayView.c.g(videoTextureView.getContext().getString(R.string.video_such_videos_will_be_shown_less), videoTextureView.getContext().getString(R.string.video_hide_cancel), new yr00(A2, 18));
        }
        cVar = gVar;
        boolean z82 = ji5Var.e;
        if (yg5Var.v0() != null) {
        }
        a = yg5Var.a();
        boolean J2 = yg5Var.J();
        if (yg5Var.P0()) {
        }
        if (!a) {
            z3 = false;
        }
        boolean a32 = e5o.a(yg5Var.A());
        playerState = PlayerState.ENDED;
        if (playerState2 != playerState) {
        }
        z = false;
        if (z7) {
        }
        z2 = z3;
        gpt0 gpt0Var2 = gpt0.a;
        ImageSize i2 = gpt0.i(videoTextureView.getContext(), yg5Var.A());
        g3k g3kVar2 = new g3k(z2, z, i2 == null ? i2.d.d : null);
        rzj0 rzj0Var2 = new rzj0(new gy(1, this, m4b0.class, "onSeek", "onSeek(J)V", 0, 15));
        je0 N022 = yg5Var.N0();
        if (!yg5Var.P0()) {
        }
        if (z7) {
            cznVar = (czn) this.d.invoke();
        }
        return new j4t0(wya0Var, fgnVar, g3kVar2, cVar, j2, rzj0Var2, cznVar);
    }

    public final void b() {
        this.p.onNext(a());
    }
}
