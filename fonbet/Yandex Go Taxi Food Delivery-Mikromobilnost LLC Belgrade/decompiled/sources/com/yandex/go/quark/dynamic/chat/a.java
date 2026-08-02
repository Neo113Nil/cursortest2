package com.yandex.go.quark.dynamic.chat;

import defpackage.bgc;
import defpackage.o400;
import defpackage.sjh;
import defpackage.sls;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;

/* loaded from: classes8.dex */
public final class a {
    public final tse a;
    public final tt2 b;
    public sls c = new bgc(12);

    public a(tse tseVar, tt2 tt2Var) {
        this.a = tseVar;
        this.b = tt2Var;
    }

    public final void a() {
        this.b.getClass();
        sjh sjhVar = uyj.a;
        tje.N(this.a, o400.a, null, new ChatBackHostRepository$dismissHostRequested$1(this, null), 2);
    }
}
