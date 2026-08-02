package com.yandex.go.account.activity;

import defpackage.h3y;
import defpackage.lz60;
import defpackage.oep0;
import defpackage.tje;
import defpackage.tse;
import defpackage.yvf0;

/* loaded from: classes.dex */
public final class b implements lz60 {
    public final yvf0 a;
    public final h3y b;
    public final tse c;
    public final oep0 d;

    public b(yvf0 yvf0Var, h3y h3yVar, tse tseVar, oep0 oep0Var) {
        this.a = yvf0Var;
        this.b = h3yVar;
        this.c = tseVar;
        this.d = oep0Var;
    }

    @Override // defpackage.lz60
    public final void g() {
        tje.N(this.c, null, null, new UpgradeAccountLifecycleListener$onLargestContentfulPaint$1(this, null), 3);
    }

    @Override // defpackage.s150
    public final String getName() {
        return "UpgradeAccountLifecycleListener";
    }
}
