package com.yandex.go.connection_prewarm;

import defpackage.h3y;
import defpackage.mdh;
import defpackage.sjh;
import defpackage.t61;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.ww60;

/* loaded from: classes.dex */
public final class a implements ww60 {
    public final h3y a;
    public final h3y b;
    public final tt2 c;
    public final t61 d;
    public final tse e;

    public a(h3y h3yVar, h3y h3yVar2, tt2 tt2Var, t61 t61Var, tse tseVar) {
        this.a = h3yVar;
        this.b = h3yVar2;
        this.c = tt2Var;
        this.d = t61Var;
        this.e = tseVar;
    }

    @Override // defpackage.ww60
    public final void f() {
        this.c.getClass();
        sjh sjhVar = uyj.a;
        tje.N(this.e, mdh.b, null, new ConnectionPrewarmer$onAppConfiguration$1(this, null), 2);
    }

    @Override // defpackage.s150
    public final String getName() {
        return "ConnectionPrewarmer";
    }
}
