package defpackage;

import java.util.Set;

/* loaded from: classes2.dex */
public final class ccd0 extends a85 {
    public final wkp h;
    public final wkp i;
    public final wkp j;

    public ccd0() {
        rzo.m(qoi0.a(Boolean.class), new agz0(3), new agz0(4), new agz0(5), new agz0(6), new agz0(7));
        Set set = dcd0.b;
        dro droVar = (dro) this.f.getValue();
        oo2 oo2Var = new oo2(qoi0.a(Set.class));
        oo2Var.h(droVar, "allowed_countries_for_yandex_payment");
        oo2Var.w = set;
        oo2Var.x = null;
        this.h = oo2Var.c();
        Boolean bool = Boolean.FALSE;
        dro droVar2 = (dro) this.f.getValue();
        oo2 oo2Var2 = new oo2(qoi0.a(Boolean.class));
        oo2Var2.h(droVar2, "tarifficator_presale_from_backend_sdk");
        oo2Var2.w = bool;
        oo2Var2.x = null;
        this.i = oo2Var2.c();
        dro droVar3 = (dro) this.f.getValue();
        oo2 oo2Var3 = new oo2(qoi0.a(Boolean.class));
        oo2Var3.h(droVar3, "mobile_metrica_rtm_regular_reporter_enabled");
        oo2Var3.w = bool;
        oo2Var3.x = null;
        this.j = oo2Var3.c();
    }

    public final wkp a() {
        return this.h;
    }

    public final wkp b() {
        return this.i;
    }

    public final wkp c() {
        return this.j;
    }
}
