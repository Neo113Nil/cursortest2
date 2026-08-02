package com.yandex.go.payments.plus.domain;

import com.yandex.go.payments.domain.j0;
import com.yandex.go.payments.paymentlist.domain.i;
import defpackage.kw90;
import defpackage.m6a0;
import defpackage.nid0;
import defpackage.qea0;
import defpackage.tpr;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes8.dex */
public final class c {
    public final qea0 a;
    public final i b;
    public final nid0 c;

    public c(qea0 qea0Var, i iVar, nid0 nid0Var) {
        this.a = qea0Var;
        this.b = iVar;
        this.c = nid0Var;
    }

    public final tpr a() {
        return kotlinx.coroutines.flow.e.t(new m0(this.c.a, new b(((j0) this.a).a(kw90.b)), new PlusPurchaseCardSelectionInteractor$getSelectedCardFlow$2(this, null)));
    }

    public final String b() {
        m6a0 m6a0Var = (m6a0) this.c.a.getValue();
        if (m6a0Var != null) {
            return m6a0Var.b;
        }
        return null;
    }
}
