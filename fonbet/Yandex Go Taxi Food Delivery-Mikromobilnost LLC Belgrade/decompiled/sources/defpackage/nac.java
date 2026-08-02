package defpackage;

import android.view.View;
import androidx.lifecycle.Lifecycle;
import coil3.c;

/* loaded from: classes.dex */
public final class nac implements lbm {
    public final View a;
    public final wls b;
    public final oav c;
    public final pwy0 d;
    public sls e;
    public aev f;
    public boolean g;
    public tls h;
    public sls i;

    public nac(View view, wls wlsVar, oav oavVar, pwy0 pwy0Var, ppr pprVar) {
        this.a = view;
        this.b = wlsVar;
        this.c = oavVar;
        this.d = pwy0Var;
        this.e = pprVar;
        aev aevVar = new aev(view.getContext());
        aevVar.d = new umf(wlsVar, view);
        aevVar.o = qjs0.a;
        this.f = aevVar;
        this.h = new qu(14);
        this.i = new bgc(12);
    }

    public final void a() {
        View view = this.a;
        qje.v(view).dispose();
        this.b.invoke(view, null);
    }

    public final g18 b(tbv tbvVar) {
        Lifecycle lifecycle;
        if (this.g) {
            return g18.u1;
        }
        tbv f0 = vez0.f0(tbvVar);
        boolean z = f0 instanceof obv;
        View view = this.a;
        if (z) {
            obv obvVar = (obv) f0;
            if (obvVar.c == null) {
                d(f0);
                n8a n8aVar = new n8a(23, this, obvVar);
                Object tag = view.getTag(pih0.image_view_tag_theme_switcher_listener);
                owy0 owy0Var = tag instanceof owy0 ? (owy0) tag : null;
                if (owy0Var != null) {
                    owy0Var.b = n8aVar;
                    r2 = owy0Var;
                } else {
                    pey b = unb1.b(view.getContext());
                    if (b != null && (lifecycle = b.getLifecycle()) != null) {
                        r2 = new owy0(view, this.d, lifecycle, n8aVar);
                    }
                }
                return new ebm(this, new l7b(21, r2));
            }
        }
        Object tag2 = view.getTag(pih0.image_view_tag_theme_switcher_listener);
        r2 = tag2 instanceof owy0 ? (owy0) tag2 : null;
        if (r2 != null) {
            r2.a();
        }
        return new tac(0, d(f0));
    }

    public final g18 c(String str) {
        Lifecycle lifecycle;
        if (this.g) {
            return g18.u1;
        }
        tbv e = vez0.e(str);
        boolean z = e instanceof obv;
        View view = this.a;
        if (z) {
            obv obvVar = (obv) e;
            if (obvVar.c == null) {
                d(e);
                ou ouVar = new ou(10, this, obvVar);
                Object tag = view.getTag(pih0.image_view_tag_theme_switcher_listener);
                owy0 owy0Var = tag instanceof owy0 ? (owy0) tag : null;
                if (owy0Var != null) {
                    owy0Var.b = ouVar;
                    r2 = owy0Var;
                } else {
                    pey b = unb1.b(view.getContext());
                    if (b != null && (lifecycle = b.getLifecycle()) != null) {
                        r2 = new owy0(view, this.d, lifecycle, ouVar);
                    }
                }
                return new ebm(this, new d9(29, r2));
            }
        }
        Object tag2 = view.getTag(pih0.image_view_tag_theme_switcher_listener);
        r2 = tag2 instanceof owy0 ? (owy0) tag2 : null;
        if (r2 != null) {
            r2.a();
        }
        return new tac(0, d(e));
    }

    public final d1k d(tbv tbvVar) {
        tbv S = tbvVar != null ? vez0.S(tbvVar, this.a.getContext(), this.d) : null;
        aev aevVar = this.f;
        aevVar.c = S;
        vac.c(aevVar, S, this.e);
        aevVar.e = new mac(null, null, this);
        return ((c) this.c).a(aevVar.a());
    }

    public final nac e(int i) {
        aev aevVar = this.f;
        uh uhVar = lev.a;
        aevVar.m = new ii8(i, 9);
        this.f = aevVar;
        return this;
    }

    public final nac f(int i, int i2) {
        aev aevVar = this.f;
        vac.d(aevVar, i, i2);
        this.f = aevVar;
        return this;
    }

    public final nac g(tfv tfvVar) {
        this.f = vac.e(this.f, this.a.getContext(), tfvVar);
        return this;
    }
}
