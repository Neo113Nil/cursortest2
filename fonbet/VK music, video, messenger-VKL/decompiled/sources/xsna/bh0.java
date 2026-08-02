package xsna;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.VideoContentType;
import com.vk.libvideo.autoplay.b;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import com.vk.media.player.PlayerError;
import com.vk.toggle.features.VideoFeatures;
import java.math.BigInteger;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.random.Random;
import one.video.player.OneVideoPlayer;
import one.video.player.error.OneVideoPlaybackException;
import xsna.c8x;
import xsna.d8x;
import xsna.e8x;
import xsna.p7z0;
import xsna.ye0;

/* compiled from: AdPlayerProxy.kt */
/* loaded from: classes18.dex */
public final class bh0 implements d8x, e8x {
    public final Context a;
    public final ye0.f b;
    public final ye0.g c;
    public final ad0 d;
    public final boolean e;
    public final View f;
    public m7q g;
    public final a h;
    public d8x.a i;
    public rws0 j;

    public bh0(Context context, ye0.f fVar, ye0.g gVar, ad0 ad0Var) {
        this.a = context;
        this.b = fVar;
        this.c = gVar;
        this.d = ad0Var;
        VideoFeatures videoFeatures = VideoFeatures.REMOVE_IS_PREPARED;
        videoFeatures.getClass();
        this.e = com.vk.toggle.b.A.a(videoFeatures);
        this.f = new View(context);
        this.h = new a();
    }

    public static final void i(bh0 bh0Var, d3b0 d3b0Var) {
        yg5 yg5Var;
        d3b0 v0;
        VideoTextureView videoTextureView = (VideoTextureView) bh0Var.b.invoke();
        if (videoTextureView == null || d3b0Var == null) {
            return;
        }
        bh0Var.d.getClass();
        if (!ad0.w()) {
            d3b0Var.j(videoTextureView);
            qu5.c().c(videoTextureView, d3b0Var);
            return;
        }
        bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
        xh5 xh5Var = b.C1208b.a().c;
        if (xh5Var != null && (yg5Var = xh5Var.a) != null && (v0 = yg5Var.v0()) != null) {
            v0.C(false);
        }
        qu5.c().c(videoTextureView, d3b0Var);
        d3b0Var.j(videoTextureView);
    }

    @Override // xsna.d8x
    public final void a() {
        OneVideoPlayer a2;
        d3b0 j = j();
        if (j != null && (a2 = j.a()) != null) {
            a2.resume();
            return;
        }
        d8x.a aVar = this.i;
        if (aVar != null) {
            ((ihz0) aVar).f("player not found");
        }
    }

    @Override // xsna.d8x
    public final void b(d8x.a aVar) {
        this.i = aVar;
    }

    @Override // xsna.e8x
    public final void c() {
        p7z0.f fVar;
        c8x.d dVar;
        c8x.c cVar;
        rws0 rws0Var = this.j;
        if (rws0Var != null) {
            e8x.a aVar = rws0Var.b;
            Context context = rws0Var.a;
            n0z0 n0z0Var = (n0z0) aVar;
            bsz0 bsz0Var = n0z0Var.d;
            if (bsz0Var == null || (fVar = n0z0Var.c) == null) {
                return;
            }
            e5z0 e5z0Var = bsz0Var.a;
            h8z0.e(e5z0Var, "playbackStarted", 1, null);
            String t = c1z0.t(context);
            if (t != null) {
                h8z0.d(e5z0Var, t);
            }
            if (p7z0.this.j != null) {
                p7z0 p7z0Var = p7z0.this;
                if (p7z0Var.k != bsz0Var || (dVar = p7z0Var.m) == null || (cVar = p7z0Var.a.l) == null) {
                    return;
                }
                cVar.d(dVar);
            }
        }
    }

    @Override // xsna.d8x
    public final void d(Uri uri, int i, int i2) {
        OneVideoPlayer a2;
        m7q m7qVar = this.g;
        if (m7qVar != null && uri.equals(m7qVar.K)) {
            d3b0 j = j();
            if (j != null) {
                OneVideoPlayer a3 = j.a();
                if (a3 != null) {
                    a3.seekTo((long) UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                OneVideoPlayer a4 = j.a();
                if (a4 != null) {
                    a4.resume();
                    return;
                }
                return;
            }
            return;
        }
        Pair pair = y2r0.I(uri) == 2 ? new Pair(new x9v(uri), VideoContentType.HLS) : new Pair(new ag30(uri), VideoContentType.MP4);
        sht0 sht0Var = (sht0) pair.d();
        VideoContentType videoContentType = (VideoContentType) pair.g();
        String uri2 = uri.toString();
        long j2 = (long) UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        EmptyList emptyList = EmptyList.b;
        gpt0 gpt0Var = gpt0.a;
        Random.b.getClass();
        this.g = new m7q(uri2, 0, 0L, null, sht0Var, null, null, null, -1, videoContentType.h(), 0, i, i2, 6, false, false, false, null, j2, false, false, 0.3f, emptyList, null, false, new BigInteger(Long.toUnsignedString(Random.c.m()), 10).toString(36), false);
        if (!((Boolean) this.c.invoke()).booleanValue()) {
            h();
            return;
        }
        d3b0 j3 = j();
        if (j3 == null || (a2 = j3.a()) == null) {
            return;
        }
        a2.resume();
    }

    @Override // xsna.d8x
    public final float e() {
        OneVideoPlayer a2;
        d3b0 k = k();
        return (k == null || (a2 = k.a()) == null) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : a2.getDuration() / 1000.0f;
    }

    @Override // xsna.e8x
    public final void f(e8x.a aVar) {
        this.j = aVar == null ? null : new rws0(this.a, aVar);
    }

    @Override // xsna.d8x
    public final float g() {
        OneVideoPlayer a2;
        d3b0 k = k();
        return (k == null || (a2 = k.a()) == null) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : a2.getCurrentPosition() / 1000.0f;
    }

    @Override // xsna.d8x
    public final View getView() {
        VideoTextureView videoTextureView = (VideoTextureView) this.b.invoke();
        return videoTextureView != null ? videoTextureView : this.f;
    }

    @Override // xsna.d8x
    public final void h() {
        d3b0 k = k();
        d3b0 k2 = k();
        OneVideoPlayer a2 = k2 != null ? k2.a() : null;
        if (k == null || a2 == null) {
            return;
        }
        m7q m7qVar = this.g;
        if (m7qVar != null) {
            this.g = m7q.a(m7qVar, null, null, null, 0, false, false, null, a2.getCurrentPosition(), null, null, false, 133955583);
        }
        k.C(false);
    }

    public final d3b0 j() {
        m7q m7qVar = this.g;
        if (m7qVar == null) {
            return null;
        }
        d3b0 k = k();
        if (k != null && !rm80.b(k, m7qVar)) {
            return k;
        }
        Boolean bool = null;
        o1b0 c = qu5.c();
        sr10 sr10Var = dy2.a;
        if (sr10Var != null) {
            bool = sr10Var.g();
        }
        return o1b0.g(c, m7qVar, this.h, false, epx.f(bool, Boolean.TRUE), new v7(2), null, 992);
    }

    public final d3b0 k() {
        m7q m7qVar = this.g;
        if (m7qVar == null) {
            return null;
        }
        return qu5.c().l(jgz.e(m7qVar));
    }

    @Override // xsna.d8x
    public final void setVolume(float f) {
        OneVideoPlayer a2;
        d8x.a aVar = this.i;
        if (aVar != null) {
            ihz0 ihz0Var = (ihz0) aVar;
            kwy0 kwy0Var = ihz0Var.b;
            float f2 = ihz0Var.m;
            if (b920.b(f2, f) == 0) {
                kwy0Var.getClass();
            } else {
                if (!kwy0Var.e()) {
                    if (b920.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2) == 0) {
                        h8z0.e(kwy0Var.e, "volumeOn", 1, null);
                    } else if (b920.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f) == 0) {
                        h8z0.e(kwy0Var.e, "volumeOff", 1, null);
                    }
                }
                thz0 thz0Var = kwy0Var.c;
                if (thz0Var != null) {
                    thz0Var.b(f);
                }
            }
            ihz0Var.m = f;
        }
        d3b0 k = k();
        if (k == null || (a2 = k.a()) == null) {
            return;
        }
        a2.setVolume(f);
    }

    /* compiled from: AdPlayerProxy.kt */
    public final class a implements fuk0 {
        public a() {
        }

        @Override // xsna.fuk0
        public final void L0() {
            d8x.a aVar = bh0.this.i;
            if (aVar != null) {
                ihz0 ihz0Var = (ihz0) aVar;
                kwy0 kwy0Var = ihz0Var.b;
                if (ihz0Var.c(4)) {
                    ihz0Var.d();
                    ihz0Var.a.h(ihz0Var.c);
                    izy0 izy0Var = ihz0Var.d;
                    if (izy0Var != null) {
                        izy0Var.h();
                    }
                    lgz0 lgz0Var = ihz0Var.i;
                    if (lgz0Var == null) {
                        f5z0 f5z0Var = ihz0Var.e;
                        if (f5z0Var != null) {
                            f5z0Var.b();
                            ihz0Var.e = null;
                        }
                        izy0 izy0Var2 = ihz0Var.d;
                        if (izy0Var2 != null) {
                            izy0Var2.h();
                            ihz0Var.d = null;
                        }
                        thz0 thz0Var = ihz0Var.f;
                        if (thz0Var != null) {
                            thz0Var.g();
                            return;
                        }
                        return;
                    }
                    float f = lgz0Var.D;
                    kwy0Var.b(f, f);
                    f5z0 f5z0Var2 = ihz0Var.e;
                    if (f5z0Var2 != null) {
                        f5z0Var2.c(f, f);
                    }
                    ihz0Var.i = null;
                    f5z0 f5z0Var3 = ihz0Var.e;
                    if (f5z0Var3 != null) {
                        f5z0Var3.b();
                        ihz0Var.e = null;
                    }
                    izy0 izy0Var3 = ihz0Var.d;
                    if (izy0Var3 != null) {
                        izy0Var3.h();
                        ihz0Var.d = null;
                    }
                    thz0 thz0Var2 = ihz0Var.f;
                    if (thz0Var2 != null) {
                        thz0Var2.g();
                    }
                    if (ihz0Var.h != null) {
                        kwy0Var.i();
                        ihz0Var.h.a(lgz0Var);
                    }
                }
            }
        }

        @Override // xsna.fuk0
        public final void S0(a6q a6qVar) {
            bh0 bh0Var = bh0.this;
            bh0.i(bh0Var, bh0Var.k());
            d8x.a aVar = bh0Var.i;
            if (aVar != null) {
                ihz0 ihz0Var = (ihz0) aVar;
                if (ihz0Var.c(2)) {
                    ihz0Var.a.c(ihz0Var.c);
                    lgz0 lgz0Var = ihz0Var.i;
                    if (lgz0Var == null) {
                        return;
                    }
                    p7z0.e eVar = ihz0Var.h;
                    if (eVar != null) {
                        p7z0 p7z0Var = p7z0.this;
                        if (!eVar.b(lgz0Var) && p7z0Var.t == 0) {
                            qjk0.a(new StringBuilder("InstreamAdEngine$VideoControllerListener: Ad shown, banner Id = "), lgz0Var.F, null);
                            c8x.c cVar = p7z0Var.a.l;
                            if (cVar != null) {
                                cVar.j(p7z0Var.l);
                            }
                            if (lgz0Var.e0 != null) {
                                p7z0Var.r.getClass();
                            }
                        }
                    }
                    d8x d8xVar = ihz0Var.g;
                    if (d8xVar == null) {
                        return;
                    }
                    izy0 izy0Var = ihz0Var.d;
                    if (izy0Var != null && !izy0Var.g) {
                        izy0Var.f(d8xVar.getView());
                    }
                    float f = lgz0Var.D;
                    ihz0Var.a(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f);
                }
            }
        }

        @Override // xsna.fuk0
        public final void h() {
            p7z0.e eVar;
            d3b0 k;
            bh0 bh0Var = bh0.this;
            if (bh0Var.e || ((k = bh0Var.k()) != null && k.isPrepared())) {
                bh0.i(bh0Var, bh0Var.k());
                d8x.a aVar = bh0Var.i;
                if (aVar != null) {
                    ihz0 ihz0Var = (ihz0) aVar;
                    if (ihz0Var.c(2)) {
                        ihz0Var.b.n();
                        ihz0Var.a.c(ihz0Var.c);
                        lgz0 lgz0Var = ihz0Var.i;
                        if (lgz0Var == null || (eVar = ihz0Var.h) == null || eVar.b(lgz0Var)) {
                            return;
                        }
                        p7z0 p7z0Var = p7z0.this;
                        c8x.c cVar = p7z0Var.a.l;
                        if (cVar != null) {
                            cVar.h(p7z0Var.l);
                        }
                    }
                }
            }
        }

        @Override // xsna.fuk0
        public final void k(PlayerError playerError, OneVideoPlaybackException oneVideoPlaybackException) {
            d8x.a aVar = bh0.this.i;
            if (aVar != null) {
                ((ihz0) aVar).f("");
            }
        }

        @Override // xsna.fuk0
        public final void m(long j, long j2) {
            bh0.this.getClass();
        }

        @Override // xsna.fuk0
        public final void w() {
            p7z0.e eVar;
            c8x.c cVar;
            d8x.a aVar = bh0.this.i;
            if (aVar != null) {
                ihz0 ihz0Var = (ihz0) aVar;
                if (ihz0Var.c(3)) {
                    ihz0Var.b.k();
                    ihz0Var.a.h(ihz0Var.c);
                    lgz0 lgz0Var = ihz0Var.i;
                    if (lgz0Var == null || (eVar = ihz0Var.h) == null || eVar.b(lgz0Var) || (cVar = p7z0.this.a.l) == null) {
                        return;
                    }
                    cVar.b();
                }
            }
        }

        @Override // xsna.fuk0
        public final void g() {
        }

        @Override // xsna.fuk0
        @ozl
        public final void E0(Long l) {
        }

        @Override // xsna.fuk0
        public final void H0(int i) {
        }

        @Override // xsna.fuk0
        public final void l(boolean z) {
        }

        @Override // xsna.fuk0
        public final void o(d3b0 d3b0Var) {
        }

        @Override // xsna.fuk0
        public final void s(long j) {
        }

        @Override // xsna.fuk0
        public final void t(long j) {
        }

        @Override // xsna.fuk0
        public final void u(float f) {
        }

        @Override // xsna.fuk0
        public final void x(one.video.player.tracks.c cVar) {
        }

        @Override // xsna.fuk0
        public final void y(long j) {
        }

        @Override // xsna.fuk0
        public final void z(OneVideoPlayer.DiscontinuityReason discontinuityReason) {
        }

        @Override // xsna.fuk0
        public final void i(a6q a6qVar, one.video.player.tracks.a aVar) {
        }

        @Override // xsna.fuk0
        public final void r(one.video.player.tracks.b bVar, boolean z) {
        }

        @Override // xsna.fuk0
        public final void n(d3b0 d3b0Var, int i, int i2) {
        }
    }
}
