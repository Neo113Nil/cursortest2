package com.yandex.go.scooters.offers.v2.newbie_guide;

import com.yandex.go.scooters.insurance.analytics.InsuranceOpenReason;
import defpackage.b4p0;
import defpackage.fee0;
import defpackage.gee0;
import defpackage.hee0;
import defpackage.jl40;
import defpackage.ktn0;
import defpackage.m950;
import defpackage.ptn0;
import defpackage.qu;
import defpackage.sy60;
import defpackage.tje;
import defpackage.w511;
import defpackage.x1o0;

/* loaded from: classes13.dex */
public final class a implements sy60 {
    public final /* synthetic */ hee0 a;
    public final /* synthetic */ b b;

    public a(hee0 hee0Var, b bVar) {
        this.a = hee0Var;
        this.b = bVar;
    }

    @Override // defpackage.sy60
    public final void a() {
        this.b.r(new qu(9));
    }

    public final void n1() {
        gee0 gee0Var = gee0.a;
        hee0 hee0Var = this.a;
        boolean l = jl40.l(hee0Var, gee0Var);
        b bVar = this.b;
        if (l) {
            m950 m950Var = (m950) bVar.L.get();
            ktn0 ktn0Var = new ktn0(InsuranceOpenReason.ONBOARDING);
            b4p0 a = bVar.F.a();
            bVar.A(m950Var, new ptn0(ktn0Var, a != null ? a.l : null), new x1o0(1, bVar));
            return;
        }
        if (jl40.l(hee0Var, gee0.b)) {
            b.P(bVar);
        } else if (hee0Var instanceof fee0) {
            tje.N(bVar.o(), null, null, new ScootersNewbieGuideRouter$showDisableInsurance$1(bVar, ((fee0) hee0Var).a, null), 3);
        } else {
            w511.b();
        }
    }
}
