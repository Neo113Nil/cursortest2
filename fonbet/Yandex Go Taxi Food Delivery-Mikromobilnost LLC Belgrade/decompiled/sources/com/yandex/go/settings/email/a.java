package com.yandex.go.settings.email;

import defpackage.ad5;
import defpackage.bvf0;
import defpackage.csn;
import defpackage.evu0;
import defpackage.ga0;
import defpackage.jt4;
import defpackage.kyh0;
import defpackage.mum;
import defpackage.t8j;
import defpackage.tje;
import defpackage.xrn;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes13.dex */
public final class a extends ad5 {
    public boolean A;
    public boolean B;
    public String C;
    public final r0 D;
    public final mum x;
    public final c y;
    public final jt4 z;

    public a(mum mumVar, c cVar, jt4 jt4Var) {
        super(xrn.class);
        this.x = mumVar;
        this.y = cVar;
        this.z = jt4Var;
        this.D = bvf0.c(Boolean.TRUE);
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        this.y.e = false;
    }

    public final void Kg() {
        xrn xrnVar = (xrn) Dg();
        ga0 b = this.y.b();
        String str = b.a;
        xrnVar.Dd(str);
        xrnVar.T4(b.b);
        int i = 0;
        xrnVar.Mc(!(str == null || evu0.J(str)));
        if (str == null || evu0.J(str)) {
            xrnVar.N1(kyh0.favorites_summary_add, false);
        } else {
            xrnVar.N1(kyh0.common_done, true);
        }
        this.A = false;
        this.B = false;
        csn csnVar = new csn(this, i);
        this.z.c(csnVar);
        tje.N(Jg(), null, null, new EmailPresenter$subscribeForBanners$1(this, null), 3).w(new t8j(26, this, csnVar));
    }
}
