package com.yandex.go.payments.lpm.navigation;

import com.yandex.go.payments.api.card.CardScrollMode;
import defpackage.c90;
import defpackage.cj8;
import defpackage.dj8;
import defpackage.fl8;
import defpackage.fyz;
import defpackage.g90;
import defpackage.gj8;
import defpackage.gyz;
import defpackage.jba0;
import defpackage.ka0;
import defpackage.m2v;
import defpackage.pea0;
import defpackage.qc8;
import defpackage.qir;
import defpackage.sls;
import defpackage.v931;
import defpackage.w931;
import defpackage.xvq;
import defpackage.zzs;

/* loaded from: classes13.dex */
public final class a implements jba0 {
    public final sls a;
    public final zzs b;
    public final gyz c;
    public final g90 d;

    public a(sls slsVar, zzs zzsVar, gyz gyzVar, g90 g90Var) {
        this.a = slsVar;
        this.b = zzsVar;
        this.c = gyzVar;
        this.d = g90Var;
    }

    @Override // defpackage.jba0
    public final gj8 a(String str) {
        return new gj8(new dj8(new m2v(j(), (String) null).o(str)), CardScrollMode.VERTICAL);
    }

    @Override // defpackage.jba0
    public final gj8 b(String str) {
        return new gj8(new dj8(new m2v(j(), (String) null).i(str)), CardScrollMode.VERTICAL);
    }

    @Override // defpackage.jba0
    public final gj8 c(String str) {
        return new gj8(new dj8(new m2v(j(), (String) null).m(str)), CardScrollMode.VERTICAL);
    }

    @Override // defpackage.jba0
    public final gj8 d(fl8 fl8Var) {
        ka0 j = j();
        xvq xvqVar = new xvq(29);
        this.c.getClass();
        m2v m2vVar = new m2v(j, (String) null);
        m2vVar.b = new qir(29, xvqVar);
        String str = fl8Var.a;
        String str2 = fl8Var.d;
        return new gj8(new dj8(m2vVar.f(str, str2, new qc8(str2, fl8Var.g, fl8Var.f, fl8Var.e), fyz.a[fl8Var.j.ordinal()] == 1 ? v931.a : new w931(fl8Var.n))), CardScrollMode.VERTICAL);
    }

    @Override // defpackage.jba0
    public final gj8 e(String str) {
        return new gj8(new dj8(new m2v(j(), (String) null).h(str)), CardScrollMode.VERTICAL);
    }

    @Override // defpackage.jba0
    public final gj8 f(String str) {
        return new gj8(new dj8(new m2v(j(), (String) null).k(str)), CardScrollMode.VERTICAL);
    }

    @Override // defpackage.jba0
    public final gj8 g() {
        return new gj8(new cj8(this.d.a(j(), new c90(0))), CardScrollMode.VERTICAL);
    }

    @Override // defpackage.jba0
    public final gj8 h(String str) {
        return new gj8(new dj8(new m2v(j(), (String) null).n(str)), CardScrollMode.VERTICAL);
    }

    @Override // defpackage.jba0
    public final gj8 i(String str) {
        return new gj8(new dj8(new m2v(j(), (String) null).j(str)), CardScrollMode.VERTICAL);
    }

    public final ka0 j() {
        pea0 pea0Var = (pea0) ((LpmPaymentRouterImpl$createPmlRouter$1) this.a).invoke();
        return new ka0(this.b, pea0Var != null ? pea0Var.b : null, pea0Var != null ? pea0Var.a : null);
    }
}
