package com.yandex.payment.divkit.select;

import defpackage.sls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* synthetic */ class DKSelectViewModelRefactor$observePaymentMethodsInner$1$params$3 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        n nVar = (n) this.receiver;
        int indexOf = nVar.k0.indexOf(nVar.j0);
        Integer valueOf = Integer.valueOf(indexOf);
        if (indexOf != -1) {
            return valueOf;
        }
        return null;
    }
}
