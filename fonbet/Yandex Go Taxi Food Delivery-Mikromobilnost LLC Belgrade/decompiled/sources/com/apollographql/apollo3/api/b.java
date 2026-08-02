package com.apollographql.apollo3.api;

import defpackage.ovn;
import defpackage.rko;
import defpackage.sko;
import defpackage.tko;
import defpackage.wls;

/* loaded from: classes.dex */
public final class b implements tko {
    public final tko a;
    public final rko b;

    public b(tko tkoVar, rko rkoVar) {
        this.a = tkoVar;
        this.b = rkoVar;
    }

    @Override // defpackage.tko
    public final tko a(sko skoVar) {
        rko rkoVar = this.b;
        rko c = rkoVar.c(skoVar);
        tko tkoVar = this.a;
        if (c != null) {
            return tkoVar;
        }
        tko a = tkoVar.a(skoVar);
        return a == tkoVar ? this : a == ovn.a ? rkoVar : new b(a, rkoVar);
    }

    @Override // defpackage.tko
    public final tko b(tko tkoVar) {
        return d.a(this, tkoVar);
    }

    @Override // defpackage.tko
    public final rko c(sko skoVar) {
        while (true) {
            rko c = this.b.c(skoVar);
            if (c != null) {
                return c;
            }
            tko tkoVar = this.a;
            if (!(tkoVar instanceof b)) {
                return tkoVar.c(skoVar);
            }
            this = (b) tkoVar;
        }
    }

    @Override // defpackage.tko
    public final Object fold(Object obj, wls wlsVar) {
        tko tkoVar = this.a;
        ExecutionContext$plus$1 executionContext$plus$1 = ExecutionContext$plus$1.w;
        return executionContext$plus$1.invoke(tkoVar.fold(obj, executionContext$plus$1), this.b);
    }
}
