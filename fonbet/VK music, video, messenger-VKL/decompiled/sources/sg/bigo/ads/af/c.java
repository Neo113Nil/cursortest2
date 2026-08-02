package sg.bigo.ads.af;

import android.app.Activity;
import android.util.Pair;
import android.view.View;
import android.webkit.ValueCallback;
import androidx.annotation.NonNull;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.t;
import sg.bigo.ads.ad.interstitial.x;
import sg.bigo.ads.ad.interstitial.z;
import sg.bigo.ads.ae.g;
import sg.bigo.ads.an.i;
import sg.bigo.ads.common.utils.o;
import sg.bigo.ads.common.utils.s;

/* loaded from: classes9.dex */
public final class c extends g implements sg.bigo.ads.s.b {
    private final sg.bigo.ads.s.a M;
    private o R;

    public c(@NonNull Activity activity, sg.bigo.ads.s.a aVar) {
        super(activity);
        this.M = aVar;
    }

    public static /* synthetic */ boolean e(c cVar) {
        cVar.f = true;
        return true;
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    public final boolean G() {
        return false;
    }

    @Override // sg.bigo.ads.ad.interstitial.z, sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.r, sg.bigo.ads.ad.interstitial.i, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void J() {
        super.J();
        o oVar = this.R;
        if (oVar != null) {
            oVar.b();
            this.R = null;
        }
        o oVar2 = this.y;
        if (oVar2 != null) {
            oVar2.b();
            this.y = null;
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.z, sg.bigo.ads.ad.interstitial.a
    public final void N() {
        x xVar;
        int i;
        boolean z;
        sg.bigo.ads.cp.a f = ((t) this.A).f();
        if (!this.q.get()) {
            i = this.i.l;
            if (i < 0) {
                return;
            } else {
                z = false;
            }
        } else if (f.bq() != null || (xVar = this.i) == null || (i = xVar.o) < 0) {
            return;
        } else {
            z = true;
        }
        a(f, z, i);
    }

    @Override // sg.bigo.ads.ad.interstitial.z
    public final boolean aB() {
        return this.i.l == -2;
    }

    @Override // sg.bigo.ads.ad.interstitial.z
    public final boolean aF() {
        sg.bigo.ads.ai.o oVar = ((sg.bigo.ads.ad.interstitial.a) this).c;
        return oVar != null && 1 == oVar.a("endpage.companion_first", 0);
    }

    @Override // sg.bigo.ads.ad.interstitial.z
    public final void aK() {
        if (this.A == 0 || Q()) {
            return;
        }
        ((t) this.A).c(this.E);
    }

    @Override // sg.bigo.ads.ad.interstitial.z, sg.bigo.ads.ad.interstitial.i
    public final int ac() {
        int o = o();
        return (o == 1 || o == 2 || o == 3) ? R.layout.bigo_ad_activity_sub_interstitial_rich_video_1_3 : super.ac();
    }

    @Override // sg.bigo.ads.ad.interstitial.r
    public final ValueCallback<Double> ar() {
        return this.M.a();
    }

    @Override // sg.bigo.ads.ad.interstitial.z
    public final sg.bigo.ads.f.a ax() {
        Pair<sg.bigo.ads.f.c, sg.bigo.ads.f.a> b;
        T t = this.A;
        if (t == 0 || (b = ((t) t).b(this.E)) == null) {
            return null;
        }
        return (sg.bigo.ads.f.a) b.second;
    }

    @Override // sg.bigo.ads.ad.interstitial.z
    public final sg.bigo.ads.f.c ay() {
        Pair<sg.bigo.ads.f.c, sg.bigo.ads.f.a> b;
        T t = this.A;
        if (t == 0 || (b = ((t) t).b(this.E)) == null) {
            return null;
        }
        return (sg.bigo.ads.f.c) b.first;
    }

    @Override // sg.bigo.ads.s.b
    public final View b() {
        Pair<sg.bigo.ads.f.c, sg.bigo.ads.f.a> b;
        T t = this.A;
        if (t == 0 || (b = ((t) t).b(this.E)) == null) {
            return null;
        }
        sg.bigo.ads.f.c cVar = (sg.bigo.ads.f.c) b.first;
        if (cVar.a && cVar.b() && !cVar.b) {
            cVar.a(1);
            return cVar.o.k;
        }
        if (!cVar.b()) {
            cVar.o.f();
        }
        sg.bigo.ads.f.a aVar = (sg.bigo.ads.f.a) b.second;
        if (aVar.a && aVar.b()) {
            aVar.a(1);
            return aVar.a();
        }
        if (aVar.b()) {
            return null;
        }
        aVar.f();
        return null;
    }

    @Override // sg.bigo.ads.ad.interstitial.z, sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.r, sg.bigo.ads.ad.interstitial.i
    public final void j() {
        super.j();
        o oVar = this.R;
        if (oVar == null || oVar.e()) {
            return;
        }
        this.R.d();
    }

    @Override // sg.bigo.ads.ad.interstitial.z
    public final void m(int i) {
        if (Q()) {
            return;
        }
        super.m(i);
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    public final int v() {
        int i;
        x xVar = this.i;
        if (xVar == null || (i = xVar.p) <= 0) {
            return 5;
        }
        return i;
    }

    @Override // sg.bigo.ads.ad.interstitial.z, sg.bigo.ads.ad.interstitial.a
    public final boolean z() {
        return false;
    }

    @Override // sg.bigo.ads.s.b
    public final void a(int i) {
        sg.bigo.ads.s.a aVar = this.M;
        if (aVar != null) {
            aVar.a(i, i == 11 ? 2 : 1);
        }
    }

    @Override // sg.bigo.ads.s.b
    public final void b(int i) {
        sg.bigo.ads.s.a aVar = this.M;
        if (aVar != null) {
            aVar.a(i);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.z, sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.r, sg.bigo.ads.ad.interstitial.i
    public final void h() {
        super.h();
        o oVar = this.R;
        if (oVar == null || !oVar.e()) {
            return;
        }
        this.R.c();
    }

    @Override // sg.bigo.ads.ad.interstitial.z
    public final void a(sg.bigo.ads.cp.a aVar, boolean z, int i) {
        long j;
        if (z) {
            j = i == 0 ? 800L : s.a.a(i);
        } else {
            j = i * 1000;
            if (j == 0) {
                j = 500;
            }
        }
        o oVar = new o(j) { // from class: sg.bigo.ads.af.c.1
            @Override // sg.bigo.ads.common.utils.o
            public final void a() {
                int d = c.this.d();
                if (((z) c.this).J || c.this.f || c.this.M == null || c.this.M.e_() || d != 0) {
                    return;
                }
                c.e(c.this);
                c.this.M.d_();
                ((t) c.this.A).K().a((i) null, c.this.az(), 22);
            }

            @Override // sg.bigo.ads.common.utils.o
            public final void a(long j2) {
            }
        };
        this.y = oVar;
        oVar.c();
    }

    @Override // sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.i
    public final void h(int i) {
        super.h(i);
        if (this.i != null && this.F != null) {
            o oVar = new o(r6.c * 1000) { // from class: sg.bigo.ads.af.c.2
                @Override // sg.bigo.ads.common.utils.o
                public final void a() {
                    if (c.this.M == null || c.this.d() != 0 || sg.bigo.ads.d.c.a((sg.bigo.ads.d.c) c.this.E)) {
                        return;
                    }
                    c.this.M.a(0, 2);
                }

                @Override // sg.bigo.ads.common.utils.o
                public final void a(long j) {
                }
            };
            this.R = oVar;
            oVar.c();
        }
        b(0);
        aw();
    }

    @Override // sg.bigo.ads.s.b
    public final boolean a() {
        return f(true);
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    public final void n() {
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    public final void p() {
    }
}
