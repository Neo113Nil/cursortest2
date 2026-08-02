package com.yandex.go.scooters.requirements;

import defpackage.cso0;
import defpackage.ehn0;
import defpackage.sls;
import defpackage.tje;
import defpackage.zy11;
import kotlinx.coroutines.CoroutineStart;

/* loaded from: classes13.dex */
public final /* synthetic */ class a implements sls {
    public final /* synthetic */ cso0 a;
    public final /* synthetic */ SkipCheck b;

    public /* synthetic */ a(cso0 cso0Var, SkipCheck skipCheck) {
        this.a = cso0Var;
        this.b = skipCheck;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        cso0 cso0Var = this.a;
        ehn0 ehn0Var = new ehn0(21, cso0Var);
        if (this.b == SkipCheck.DEBT) {
            ehn0Var.invoke();
        } else {
            tje.N(cso0Var.o(), null, CoroutineStart.UNDISPATCHED, new ScootersRequirementsRouter$checkDebt$1(ehn0Var, cso0Var, null), 1);
        }
        return zy11.a;
    }
}
