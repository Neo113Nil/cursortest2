package com.yandex.payment.divkit.sbp;

import defpackage.ds31;
import defpackage.huf;
import defpackage.iuf;
import defpackage.sls;
import defpackage.tem0;
import defpackage.tje;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* synthetic */ class DKSbpFragment$setupContainersViews$1$3$1 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        a aVar = (a) this.receiver;
        tem0 tem0Var = aVar.C;
        tem0Var.b.invoke();
        tem0Var.a = false;
        if (aVar.J) {
            aVar.b0(iuf.a);
        } else {
            aVar.b0(huf.a);
            tje.N(ds31.a(aVar), null, null, new DKSbpViewModel$loadListBanks$1(aVar, null), 3);
        }
        return zy11.a;
    }
}
