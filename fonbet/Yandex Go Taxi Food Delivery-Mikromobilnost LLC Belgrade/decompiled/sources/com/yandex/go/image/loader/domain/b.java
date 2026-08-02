package com.yandex.go.image.loader.domain;

import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.vw60;
import defpackage.yvf0;

/* loaded from: classes.dex */
public final class b implements vw60 {
    public final yvf0 a;
    public final tse b;
    public final tt2 c;

    public b(yvf0 yvf0Var, tse tseVar, tt2 tt2Var) {
        this.a = yvf0Var;
        this.b = tseVar;
        this.c = tt2Var;
    }

    @Override // defpackage.vw60
    public final void c() {
        this.c.getClass();
        tje.N(this.b, uyj.a, null, new CoilPreWarmListener$onActivityCreate$1(this, null), 2);
    }

    @Override // defpackage.s150
    public final String getName() {
        return "CoilPreWarmListener";
    }
}
