package com.yandex.go.promocodes;

import defpackage.gb0;
import defpackage.h55;
import defpackage.l3e;
import defpackage.m950;
import defpackage.qqj;
import defpackage.qrf0;
import defpackage.tje;
import defpackage.yvf0;
import defpackage.zlf0;

/* loaded from: classes13.dex */
public final class d extends h55 implements m950 {
    public final gb0 D;
    public final yvf0 E;
    public final qqj F;
    public final yvf0 G;
    public final l3e H;
    public final yvf0 I;
    public final zlf0 J;

    public d(gb0 gb0Var, yvf0 yvf0Var, qqj qqjVar, yvf0 yvf0Var2, l3e l3eVar, yvf0 yvf0Var3, zlf0 zlf0Var) {
        super(null);
        this.D = gb0Var;
        this.E = yvf0Var;
        this.F = qqjVar;
        this.G = yvf0Var2;
        this.H = l3eVar;
        this.I = yvf0Var3;
        this.J = zlf0Var;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        tje.N(o(), null, null, new PromocodesRouterImpl$onLaunch$1((qrf0) obj, this, null), 3);
    }
}
