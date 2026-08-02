package yads;

import android.net.Uri;
import android.view.TextureView;
import androidx.media3.datasource.c;
import androidx.media3.datasource.cache.Cache;
import androidx.media3.datasource.cache.a;
import androidx.media3.exoplayer.ExoPlayer;
import com.google.common.collect.ImmutableList;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import kotlin.Pair;
import xsna.kr10;
import xsna.vr10;

/* loaded from: classes10.dex */
public final class sp0 implements q62 {
    public final ExoPlayer a;
    public final lo1 b;
    public final uj3 c;
    public final p62 d;
    public final ik3 e;
    public final qp0 f;
    public final po0 g;
    public p72 h;
    public p72 i;
    public gg3 j;
    public og3 k;
    public final HashSet l;
    public boolean m;
    public boolean n;

    public sp0(ExoPlayer exoPlayer, lo1 lo1Var, uj3 uj3Var, p62 p62Var, ik3 ik3Var) {
        this.a = exoPlayer;
        this.b = lo1Var;
        this.c = uj3Var;
        this.d = p62Var;
        this.e = ik3Var;
        qp0 qp0Var = new qp0(this);
        this.f = qp0Var;
        this.g = new po0(qp0Var);
        this.l = new HashSet();
        exoPlayer.c(qp0Var);
        exoPlayer.c(ik3Var);
        z6.a(this);
    }

    public final void a(gg3 gg3Var) {
        if (this.m) {
            return;
        }
        this.j = gg3Var;
        lo1 lo1Var = this.b;
        lo1Var.getClass();
        c.a aVar = new c.a(lo1Var.b, new pv2(((p63) ne.a().a).a(), dt2.a().a(lo1Var.b)));
        Cache a = bp0.a().a(lo1Var.b);
        a.b bVar = new a.b();
        bVar.a = a;
        bVar.e = aVar;
        androidx.media3.exoplayer.source.e eVar = new androidx.media3.exoplayer.source.e(bVar);
        lo1Var.a.getClass();
        String url = gg3Var.getUrl();
        int i = kr10.h;
        kr10.b.a aVar2 = new kr10.b.a();
        com.google.common.collect.h hVar = com.google.common.collect.h.h;
        ImmutableList.b bVar2 = ImmutableList.c;
        com.google.common.collect.g gVar = com.google.common.collect.g.f;
        List list = Collections.EMPTY_LIST;
        com.google.common.collect.g gVar2 = com.google.common.collect.g.f;
        kr10.e.a aVar3 = new kr10.e.a();
        kr10.g gVar3 = kr10.g.a;
        Uri parse = url == null ? null : Uri.parse(url);
        androidx.media3.exoplayer.source.i d = eVar.d(new kr10("", new kr10.c(aVar2), parse != null ? new kr10.f(parse, null, null, list, null, gVar2, C.TIME_UNSET) : null, new kr10.e(aVar3), vr10.B, gVar3));
        this.a.setPlayWhenReady(false);
        this.a.r(d);
        this.a.prepare();
        po0 po0Var = this.g;
        po0Var.getClass();
        ((ad2) po0Var.b).a(po0.c, new no0(po0Var));
    }

    @Override // yads.q62
    public final long b() {
        return this.a.getDuration();
    }

    @Override // yads.q62
    public final void c() {
        if (!this.m) {
            this.a.setPlayWhenReady(true);
        }
        if (this.n) {
            pauseAd();
        }
    }

    @Override // yads.q62
    public final void e() {
        if (this.m) {
            return;
        }
        this.m = true;
        this.n = false;
        ((ad2) this.g.b).a();
        this.a.setVideoTextureView(null);
        ik3 ik3Var = this.e;
        ik3Var.c = null;
        ik3Var.b();
        this.a.l(this.f);
        this.a.l(this.e);
        this.a.release();
    }

    @Override // yads.q62
    public final boolean f() {
        return this.m;
    }

    @Override // yads.lx0
    public final void g() {
        this.n = true;
        pauseAd();
    }

    @Override // yads.q62
    public final long getAdPosition() {
        return this.a.getCurrentPosition();
    }

    @Override // yads.q62
    public final float getVolume() {
        return this.a.getVolume();
    }

    @Override // yads.q62
    public final boolean isPlayingAd() {
        return this.a.isPlaying();
    }

    @Override // yads.q62
    public final void pauseAd() {
        if (this.m) {
            return;
        }
        this.a.setPlayWhenReady(false);
    }

    @Override // yads.q62
    public final void resumeAd() {
        if (this.m || this.n) {
            return;
        }
        this.a.setPlayWhenReady(true);
    }

    @Override // yads.q62
    public final void setVolume(float f) {
        if (this.m) {
            return;
        }
        this.a.setVolume(f);
        og3 og3Var = this.k;
        gg3 gg3Var = this.j;
        if (og3Var == null || gg3Var == null) {
            return;
        }
        og3Var.onVolumeChanged(f);
    }

    @Override // yads.q62
    public final void a(p72 p72Var, p72 p72Var2) {
        this.h = p72Var;
        this.i = p72Var2;
        Pair pair = p72Var2 != null ? new Pair(p72Var, p72Var2) : null;
        if (pair != null && this.l.contains(pair)) {
            a(p72Var2);
        } else {
            a(p72Var);
        }
    }

    @Override // yads.q62
    public final void a(og3 og3Var) {
        this.k = og3Var;
    }

    @Override // yads.q62
    public final void a(TextureView textureView) {
        if (this.m) {
            return;
        }
        ik3 ik3Var = this.e;
        ik3Var.c = textureView;
        ik3Var.b();
        this.a.setVideoTextureView(textureView);
    }

    @Override // yads.q62
    public final void a(ok3 ok3Var) {
        if (this.m) {
            return;
        }
        ik3 ik3Var = this.e;
        ik3Var.d = ok3Var;
        ik3Var.b();
    }

    @Override // yads.q62
    public final void a() {
        if (this.m) {
            return;
        }
        og3 og3Var = this.k;
        gg3 gg3Var = this.j;
        if (og3Var != null && gg3Var != null) {
            og3Var.e();
        }
        this.m = true;
        this.n = false;
        ((ad2) this.g.b).a();
        this.a.setVideoTextureView(null);
        ik3 ik3Var = this.e;
        ik3Var.c = null;
        ik3Var.b();
        this.a.l(this.f);
        this.a.l(this.e);
        this.a.release();
    }
}
