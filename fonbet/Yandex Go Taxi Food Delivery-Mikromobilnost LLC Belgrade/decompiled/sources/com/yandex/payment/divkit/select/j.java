package com.yandex.payment.divkit.select;

import defpackage.ds31;
import defpackage.sls;
import defpackage.tje;
import defpackage.yr31;
import defpackage.zy11;

/* loaded from: classes2.dex */
public final /* synthetic */ class j implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ yr31 b;

    public /* synthetic */ j(yr31 yr31Var, int i) {
        this.a = i;
        this.b = yr31Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        yr31 yr31Var = this.b;
        switch (i) {
            case 0:
                n nVar = (n) yr31Var;
                tje.N(ds31.a(nVar), null, null, new DKSelectViewModelRefactor$payBySbpToken$3$1(nVar, null), 3);
                break;
            case 1:
                n nVar2 = (n) yr31Var;
                tje.N(ds31.a(nVar2), null, null, new DKSelectViewModelRefactor$observePaymentMethodsInner$1$params$4$1(nVar2, null), 3);
                break;
            default:
                h hVar = (h) yr31Var;
                tje.N(ds31.a(hVar), null, null, new DKSelectViewModel$proceedPayment$1$6$1(hVar, null), 3);
                break;
        }
        return zy11Var;
    }
}
