package xsna;

import android.content.Context;
import android.net.Uri;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vk.dto.music.AudioLoudness;
import com.vk.music.player.PlaybackActionMeta;
import com.vk.music.player.PlayerAction;
import com.vk.music.player.error.ErrorType;
import com.vk.music.player.error.VkPlayerException;
import com.vk.music.playerservice.impl.PlayerService;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import xsna.g8x;
import xsna.i8x;
import xsna.ijz0;
import xsna.o6z0;

/* compiled from: AdPlayerHelperImpl.kt */
/* loaded from: classes3.dex */
public final class ah0 implements zg0, dx40, px40 {
    public final PlayerService b;
    public final hx40 c;
    public final List<PlayerAction> d;
    public int e;
    public wg0 f;
    public px40 g;
    public i8x.a h;

    public ah0(PlayerService playerService, hx40 hx40Var) {
        this.b = playerService;
        this.c = hx40Var;
        hx40Var.p(this);
        this.d = Collections.singletonList(PlayerAction.playPause);
        this.e = 28;
        this.f = new wg0(0);
    }

    @Override // xsna.i8x
    public final void A() {
        i8x.a aVar;
        if (!this.c.f(new PlaybackActionMeta(this.f.a, 0L, 2, null)) || (aVar = this.h) == null) {
            return;
        }
        o6z0 o6z0Var = o6z0.this;
        Context b = o6z0Var.b();
        if (o6z0Var.i != null && b != null) {
            o6z0Var.e.n();
        }
        o6z0Var.b.c(o6z0Var.c);
    }

    @Override // xsna.px40
    public final void B(ky40 ky40Var) {
        px40 px40Var = this.g;
        if (px40Var != null) {
            px40Var.B(ky40Var);
        }
    }

    @Override // xsna.ex40
    public final float C() {
        return this.c.C();
    }

    @Override // xsna.px40
    public final void D(v0q<? extends kw40> v0qVar) {
        px40 px40Var = this.g;
        if (px40Var != null) {
            px40Var.D(v0qVar);
        }
    }

    @Override // xsna.i8x
    public final float E() {
        return this.c.l() / 1000.0f;
    }

    @Override // xsna.ex40
    public final x6b0 H() {
        return this.c.j;
    }

    @Override // xsna.i8x
    public final float I() {
        return this.c.o.a() / 1000.0f;
    }

    @Override // xsna.i8x
    public final Context J() {
        return this.b;
    }

    @Override // xsna.px40
    public final void a(ry40 ry40Var) {
        px40 px40Var = this.g;
        if (px40Var != null) {
            px40Var.a(ry40Var);
        }
    }

    @Override // xsna.ex40
    public final float b() {
        return this.c.g;
    }

    @Override // xsna.ex40
    public final cz40 c() {
        return this.c.b;
    }

    @Override // xsna.px40
    public final void d(cz40 cz40Var) {
        px40 px40Var = this.g;
        if (px40Var != null) {
            px40Var.d(cz40Var);
        }
    }

    @Override // xsna.i8x
    public final void destroy() {
        this.c.release(26);
    }

    @Override // xsna.i8x
    public final void e() {
        i8x.a aVar;
        if (!this.c.pause(this.f.a) || (aVar = this.h) == null) {
            return;
        }
        o6z0 o6z0Var = o6z0.this;
        Context b = o6z0Var.b();
        if (o6z0Var.i != null && b != null) {
            o6z0Var.e.k();
        }
        o6z0Var.b.h(o6z0Var.c);
    }

    @Override // xsna.dx40
    public final boolean f(PlaybackActionMeta playbackActionMeta) {
        return this.c.f(playbackActionMeta);
    }

    @Override // xsna.ex40
    public final boolean g() {
        return this.c.g();
    }

    @Override // xsna.dx40
    public final int getAudioSessionId() {
        return this.c.getAudioSessionId();
    }

    @Override // xsna.dx40
    public final int getBufferedPercentage() {
        return this.c.getBufferedPercentage();
    }

    @Override // xsna.ex40
    public final fx40 getConfig() {
        return this.c.h;
    }

    @Override // xsna.dx40
    public final long getCurrentPosition() {
        return this.c.o.a();
    }

    @Override // xsna.dx40
    public final ry40 getState() {
        return this.c.o.e;
    }

    @Override // xsna.ex40
    public final String h() {
        return this.c.i;
    }

    @Override // xsna.px40
    public final void i(ly40 ly40Var) {
        px40 px40Var = this.g;
        if (px40Var != null) {
            px40Var.i(ly40Var);
        }
    }

    @Override // xsna.dx40
    public final boolean isRunning() {
        return this.c.o.d();
    }

    @Override // xsna.dx40
    public final boolean j(int i, PlaybackActionMeta playbackActionMeta) {
        return this.c.j(i, playbackActionMeta);
    }

    @Override // xsna.dx40
    public final List<PlayerAction> k() {
        return this.d;
    }

    @Override // xsna.px40
    public final void l(cz40 cz40Var) {
        px40 px40Var = this.g;
        if (px40Var != null) {
            px40Var.l(cz40Var);
        }
        i8x.a aVar = this.h;
        if (aVar != null) {
            o6z0 o6z0Var = o6z0.this;
            int i = o6z0Var.n;
            kwy0 kwy0Var = o6z0Var.e;
            if (i != 2) {
                if (o6z0Var.i != null && o6z0Var.h != null) {
                    o6z0Var.a();
                    lgz0 lgz0Var = o6z0Var.i;
                    o6z0Var.i = null;
                    if (lgz0Var != null) {
                        float f = lgz0Var.D;
                        kwy0Var.b(f, f);
                        kwy0Var.i();
                        ijz0.c cVar = o6z0Var.h;
                        ijz0 ijz0Var = ijz0.this;
                        if (!cVar.b(lgz0Var)) {
                            g8x g8xVar = ijz0Var.a;
                            g8x.d dVar = g8xVar.j;
                            if (dVar != null) {
                                dVar.d(g8xVar, ijz0Var.l);
                            }
                            xrz0 xrz0Var = ijz0Var.j;
                            if (xrz0Var != null) {
                                xrz0Var.f();
                            }
                        }
                    }
                }
                o6z0Var.n = 2;
            }
            o6z0Var.b.h(o6z0Var.c);
        }
    }

    @Override // xsna.i8x
    public final void m(Uri uri, g8x.c cVar) {
        try {
            String scheme = uri.getScheme();
            if (epx.f(scheme != null ? scheme.toLowerCase(Locale.ROOT) : null, "http")) {
                uri = uri.buildUpon().scheme(HttpRequest.DEFAULT_SCHEME).build();
            }
            uz4 uz4Var = new uz4(uri.toString(), 4);
            boolean z = this.f.b;
            PlaybackActionMeta playbackActionMeta = new PlaybackActionMeta(28, 0L, 2, null);
            c900 c900Var = cVar.m;
            this.c.u(new kx40(uz4Var, null, null, null, playbackActionMeta, z, c900Var != null ? new AudioLoudness(c900Var.a, c900Var.b) : null, 398));
        } catch (Throwable th) {
            bn40.c(th, new Object[0]);
        }
    }

    @Override // xsna.px40
    public final void n(cz40 cz40Var, int i, long j) {
        px40 px40Var = this.g;
        if (px40Var != null) {
            px40Var.n(cz40Var, i, j);
        }
    }

    @Override // xsna.i8x
    public final void o(i8x.a aVar) {
        this.h = aVar;
    }

    @Override // xsna.px40
    public final void onStop() {
        ijz0 ijz0Var;
        g8x g8xVar;
        g8x.d dVar;
        px40 px40Var = this.g;
        if (px40Var != null) {
            px40Var.onStop();
        }
        i8x.a aVar = this.h;
        if (aVar != null) {
            o6z0 o6z0Var = o6z0.this;
            if (o6z0Var.n == 1) {
                if (o6z0Var.i != null && o6z0Var.h != null) {
                    o6z0Var.e.o();
                    ijz0.c cVar = o6z0Var.h;
                    if (!cVar.b(o6z0Var.i) && (dVar = (g8xVar = (ijz0Var = ijz0.this).a).j) != null) {
                        dVar.d(g8xVar, ijz0Var.l);
                    }
                }
                o6z0Var.n = 0;
            }
            o6z0Var.b.h(o6z0Var.c);
        }
    }

    @Override // xsna.dx40
    public final void p(px40 px40Var) {
        this.g = px40Var;
    }

    @Override // xsna.dx40
    public final boolean pause(int i) {
        return this.c.pause(i);
    }

    @Override // xsna.px40
    public final void q(ky40 ky40Var) {
        i8x i8xVar;
        lgz0 lgz0Var;
        ijz0.c cVar;
        px40 px40Var = this.g;
        if (px40Var != null) {
            px40Var.q(ky40Var);
        }
        i8x.a aVar = this.h;
        if (aVar != null) {
            o6z0 o6z0Var = o6z0.this;
            o6z0Var.n = 1;
            if (!o6z0Var.m && (i8xVar = o6z0Var.g) != null) {
                float E = i8xVar.E();
                lgz0 lgz0Var2 = o6z0Var.i;
                if (lgz0Var2 != null && (cVar = o6z0Var.h) != null && !cVar.b(lgz0Var2)) {
                    qjk0.a(new StringBuilder("InstreamAudioAdEngine: Ad shown, banner Id = "), lgz0Var2.F, null);
                    ijz0 ijz0Var = ijz0.this;
                    g8x g8xVar = ijz0Var.a;
                    g8x.d dVar = g8xVar.j;
                    if (dVar != null) {
                        dVar.b(g8xVar, ijz0Var.l);
                    }
                }
                ijz0.c cVar2 = o6z0Var.h;
                if (cVar2 != null && (lgz0Var = o6z0Var.i) != null) {
                    cVar2.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, E, lgz0Var);
                }
                o6z0Var.e.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, E);
                o6z0Var.m = true;
            }
            o6z0Var.b.c(o6z0Var.c);
        }
    }

    @Override // xsna.zg0
    public final void r(wg0 wg0Var) {
        this.f = wg0Var;
    }

    @Override // xsna.dx40
    public final void release(int i) {
        this.c.release(i);
    }

    @Override // xsna.ex40
    public final void s(float f) {
        this.c.s(f);
    }

    @Override // xsna.i8x
    public final void setVolume(float f) {
        this.c.s(f);
        i8x.a aVar = this.h;
        if (aVar != null) {
            o6z0.a aVar2 = (o6z0.a) aVar;
            o6z0 o6z0Var = o6z0.this;
            kwy0 kwy0Var = o6z0Var.e;
            float f2 = aVar2.a;
            if (f == f2) {
                return;
            }
            if (f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                if (o6z0Var.b() == null || o6z0Var.i == null) {
                    return;
                }
                kwy0Var.f(false);
                aVar2.a = f;
                o6z0Var.f = f;
                return;
            }
            if (f2 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || o6z0Var.b() == null || o6z0Var.i == null) {
                return;
            }
            kwy0Var.f(true);
            aVar2.a = f;
            o6z0Var.f = f;
        }
    }

    @Override // xsna.dx40
    public final void stop(int i) {
        this.c.stop(i);
    }

    @Override // xsna.zg0
    public final wg0 t() {
        return this.f;
    }

    @Override // xsna.dx40
    public final void u(kx40 kx40Var) {
        this.c.u(kx40Var);
    }

    @Override // xsna.px40
    public final void v(cz40 cz40Var, VkPlayerException vkPlayerException) {
        ijz0.c cVar;
        px40 px40Var = this.g;
        if (px40Var != null) {
            px40Var.v(cz40Var, vkPlayerException);
        }
        i8x.a aVar = this.h;
        if (aVar != null) {
            ErrorType d = vkPlayerException.d();
            if (d != null) {
                d.toString();
            }
            o6z0 o6z0Var = o6z0.this;
            i8x i8xVar = o6z0Var.g;
            if (i8xVar != null) {
                i8xVar.y();
            }
            lgz0 lgz0Var = o6z0Var.i;
            if (lgz0Var != null && (cVar = o6z0Var.h) != null) {
                ijz0 ijz0Var = ijz0.this;
                if (!cVar.b(lgz0Var)) {
                    g8x g8xVar = ijz0Var.a;
                    g8x.d dVar = g8xVar.j;
                    if (dVar != null) {
                        dVar.c(g8xVar);
                    }
                    xrz0 xrz0Var = ijz0Var.j;
                    if (xrz0Var != null) {
                        xrz0Var.f();
                    }
                }
            }
            o6z0Var.e.l();
            o6z0Var.b.h(o6z0Var.c);
        }
    }

    @Override // xsna.zg0
    public final void w(int i) {
        int i2 = 32;
        if (i != 32 && i != 34 && i != 12 && i != 36) {
            i2 = 28;
        }
        this.e = i2;
    }

    @Override // xsna.ex40
    public final boolean x() {
        return this.c.k;
    }

    @Override // xsna.i8x
    public final void y() {
        this.c.stop(this.e);
        w(28);
    }

    @Override // xsna.dx40
    public final boolean z() {
        return this.c.n.c();
    }

    @Override // xsna.px40
    public final void G() {
    }

    @Override // xsna.px40
    public final void F(cz40 cz40Var) {
    }
}
