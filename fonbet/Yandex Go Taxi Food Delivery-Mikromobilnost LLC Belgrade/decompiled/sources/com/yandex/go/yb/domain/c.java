package com.yandex.go.yb.domain;

import defpackage.czo0;
import defpackage.hbp0;
import defpackage.i4u;
import defpackage.jg51;
import defpackage.jj3;
import defpackage.kj;
import defpackage.lg51;
import defpackage.um3;
import defpackage.un9;
import ru.yandex.taxi.analytics.Events$Zalogin$LoginContext;

/* loaded from: classes13.dex */
public final class c implements jg51 {
    public final jj3 a;
    public final ru.yandex.taxi.am.e b;
    public final ru.yandex.taxi.am.g c;
    public final ru.yandex.taxi.am.j w;
    public final hbp0 x = new hbp0(new czo0(14), "", null);

    public c(jj3 jj3Var, ru.yandex.taxi.am.e eVar, ru.yandex.taxi.am.g gVar, ru.yandex.taxi.am.j jVar) {
        this.a = jj3Var;
        this.b = eVar;
        this.c = gVar;
        this.w = jVar;
    }

    @Override // defpackage.jg51
    public final void p(lg51 lg51Var) {
        this.a.b(new un9(2, this, lg51Var), Events$Zalogin$LoginContext.BANK);
    }

    @Override // defpackage.jg51
    public final void r(i4u i4uVar) {
        kj Ig = this.c.a.Ig();
        un9 un9Var = new un9(2, this, i4uVar);
        ru.yandex.taxi.am.e eVar = this.b;
        if (Ig == null || Ig.m) {
            Events$Zalogin$LoginContext events$Zalogin$LoginContext = Events$Zalogin$LoginContext.BANK;
            eVar.getClass();
            eVar.f(new um3(events$Zalogin$LoginContext, un9Var, false, false, 28));
            return;
        }
        if (Ig.p) {
            hbp0 hbp0Var = this.x;
            hbp0Var.f();
            hbp0.e(hbp0Var, null, null, new RealYbAccountFacade$startAccountUpgrade$1(this, Ig, i4uVar, null), 3);
        } else {
            Events$Zalogin$LoginContext events$Zalogin$LoginContext2 = Events$Zalogin$LoginContext.BANK;
            eVar.getClass();
            eVar.f(new um3(events$Zalogin$LoginContext2, un9Var, false, false, 28));
        }
    }
}
