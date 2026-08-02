package com.yandex.go.lifecycle.processor;

import defpackage.a2f0;
import defpackage.e3n;
import defpackage.f8z0;
import defpackage.h3y;
import defpackage.hst;
import defpackage.jst;
import defpackage.pzt0;
import defpackage.s630;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import java.util.Set;

/* loaded from: classes.dex */
public final class b extends a {
    public final Set c;
    public final tse d;
    public pzt0 e;
    public final String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Set set, h3y h3yVar, tt2 tt2Var, tse tseVar) {
        super(h3yVar, uyj.a);
        tt2Var.getClass();
        this.c = set;
        this.d = tseVar;
        tje.N(tseVar, null, null, new OnActivityCreateProcessorImpl$1(this, null), 3);
        this.f = "OnActivityCreateProcessor";
    }

    @Override // com.yandex.go.lifecycle.processor.a
    public final String a() {
        return this.f;
    }

    public final void c() {
        jst.e.getClass();
        for (a2f0 a2f0Var : this.c) {
            long a = s630.a();
            a2f0Var.c();
            long a2 = f8z0.a(a);
            hst hstVar = jst.e;
            Thread.currentThread().getName();
            a2f0Var.getName();
            e3n.p(a2);
            hstVar.getClass();
        }
        pzt0 pzt0Var = this.e;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.e = tje.N(this.d, null, null, new OnActivityCreateProcessorImpl$onActivityCreated$2(this, null), 3);
    }
}
