package com.yandex.go.yb.domain;

import defpackage.a5c;
import defpackage.fw51;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.tse;

/* loaded from: classes15.dex */
public final class a {
    public final tse a;
    public final fw51 b;
    public final a5c c;
    public pzt0 d;

    public a(tse tseVar, fw51 fw51Var, a5c a5cVar) {
        this.a = tseVar;
        this.b = fw51Var;
        this.c = a5cVar;
    }

    public final void a() {
        pzt0 pzt0Var = this.d;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.d = tje.N(this.a, null, null, new CloseLastYbScreenInteractor$onBankScreenOpened$1(this, null), 3);
    }
}
