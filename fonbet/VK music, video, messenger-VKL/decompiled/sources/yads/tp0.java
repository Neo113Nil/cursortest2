package yads;

import android.view.TextureView;
import java.util.HashSet;
import kotlin.Pair;

/* loaded from: classes10.dex */
public final class tp0 implements q62 {
    public final tn0 a;
    public final mo1 b;
    public final uj3 c;
    public final p62 d;
    public final jk3 e;
    public final rp0 f;
    public final qo0 g;
    public p72 h;
    public p72 i;
    public gg3 j;
    public og3 k;
    public final HashSet l;
    public boolean m;
    public boolean n;

    public tp0(ao0 ao0Var, mo1 mo1Var, uj3 uj3Var, p62 p62Var, jk3 jk3Var) {
        this.a = ao0Var;
        this.b = mo1Var;
        this.c = uj3Var;
        this.d = p62Var;
        this.e = jk3Var;
        rp0 rp0Var = new rp0(this);
        this.f = rp0Var;
        this.g = new qo0(rp0Var);
        this.l = new HashSet();
        ao0Var.a(rp0Var);
        ao0Var.a(jk3Var);
        a7.a(this);
    }

    public final void a(gg3 gg3Var) {
        if (this.m) {
            return;
        }
        this.j = gg3Var;
        mo1 mo1Var = this.b;
        mo1Var.getClass();
        oc0 oc0Var = new oc0(mo1Var.b, new qv2(((p63) ne.a().a).a(), dt2.a().a(mo1Var.b)));
        nr a = cp0.a().a(mo1Var.b);
        qr qrVar = new qr();
        qrVar.a = a;
        qrVar.d = oc0Var;
        ge0 ge0Var = new ge0(qrVar, new od0());
        mo1Var.a.getClass();
        mo a2 = ge0Var.a(gn1.a(gg3Var.getUrl()));
        ((ao0) this.a).a(false);
        ((ao0) this.a).a(a2);
        ((ao0) this.a).m();
        qo0 qo0Var = this.g;
        qo0Var.getClass();
        oo0 oo0Var = new oo0(qo0Var);
        ((ad2) qo0Var.b).a(qo0.c, oo0Var);
    }

    @Override // yads.q62
    public final long b() {
        return ((ao0) this.a).j();
    }

    @Override // yads.q62
    public final void c() {
        if (!this.m) {
            ((ao0) this.a).a(true);
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
        ((ao0) this.a).a((TextureView) null);
        jk3 jk3Var = this.e;
        jk3Var.c = null;
        jk3Var.b();
        ((ao0) this.a).d(this.f);
        ((ao0) this.a).d(this.e);
        ((ao0) this.a).n();
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
        ao0 ao0Var = (ao0) this.a;
        ao0Var.r();
        return mc3.b(ao0Var.a(ao0Var.Z));
    }

    @Override // yads.q62
    public final float getVolume() {
        ao0 ao0Var = (ao0) this.a;
        ao0Var.r();
        return ao0Var.T;
    }

    @Override // yads.q62
    public final boolean isPlayingAd() {
        qo qoVar = (qo) this.a;
        qoVar.getClass();
        ao0 ao0Var = (ao0) qoVar;
        ao0Var.r();
        if (ao0Var.Z.e != 3) {
            return false;
        }
        ao0Var.r();
        if (!ao0Var.Z.l) {
            return false;
        }
        ao0Var.r();
        return ao0Var.Z.m == 0;
    }

    @Override // yads.q62
    public final void pauseAd() {
        if (this.m) {
            return;
        }
        ((ao0) this.a).a(false);
    }

    @Override // yads.q62
    public final void resumeAd() {
        if (this.m || this.n) {
            return;
        }
        ((ao0) this.a).a(true);
    }

    @Override // yads.q62
    public final void setVolume(float f) {
        if (this.m) {
            return;
        }
        ((ao0) this.a).a(f);
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
        jk3 jk3Var = this.e;
        jk3Var.c = textureView;
        jk3Var.b();
        ((ao0) this.a).a(textureView);
    }

    @Override // yads.q62
    public final void a(ok3 ok3Var) {
        if (this.m) {
            return;
        }
        jk3 jk3Var = this.e;
        jk3Var.d = ok3Var;
        jk3Var.b();
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
        ((ao0) this.a).a((TextureView) null);
        jk3 jk3Var = this.e;
        jk3Var.c = null;
        jk3Var.b();
        ((ao0) this.a).d(this.f);
        ((ao0) this.a).d(this.e);
        ((ao0) this.a).n();
    }
}
