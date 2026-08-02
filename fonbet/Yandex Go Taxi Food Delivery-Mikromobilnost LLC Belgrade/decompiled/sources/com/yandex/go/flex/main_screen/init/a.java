package com.yandex.go.flex.main_screen.init;

import defpackage.a2f0;
import defpackage.h3y;
import defpackage.mdh;
import defpackage.s66;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;

/* loaded from: classes.dex */
public final class a implements a2f0 {
    public final s66 a;
    public final h3y b;
    public final h3y c;
    public final tse d;
    public final tt2 e;

    public a(s66 s66Var, h3y h3yVar, h3y h3yVar2, tse tseVar, tt2 tt2Var) {
        this.a = s66Var;
        this.b = h3yVar;
        this.c = h3yVar2;
        this.d = tseVar;
        this.e = tt2Var;
    }

    @Override // defpackage.a2f0
    public final void c() {
        this.e.getClass();
        sjh sjhVar = uyj.a;
        tje.N(this.d, mdh.b, null, new SuperAppMainScreenPreWarmAppListener$onActivityCreate$1(this, null), 2);
    }

    @Override // defpackage.s150
    public final String getName() {
        return "SuperAppMainScreenPreWarm";
    }
}
