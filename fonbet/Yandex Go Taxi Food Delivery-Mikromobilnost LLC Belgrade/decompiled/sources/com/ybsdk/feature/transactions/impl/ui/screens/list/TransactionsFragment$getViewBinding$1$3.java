package com.ybsdk.feature.transactions.impl.ui.screens.list;

import defpackage.sls;
import defpackage.uc5;
import defpackage.uf01;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class TransactionsFragment$getViewBinding$1$3 extends FunctionReferenceImpl implements sls {
    public TransactionsFragment$getViewBinding$1$3(uc5 uc5Var) {
        super(0, uc5Var, a.class, "onErrorPrimaryButtonClick", "onErrorPrimaryButtonClick()V", 0);
    }

    @Override // defpackage.sls
    public final Object invoke() {
        a aVar = (a) this.receiver;
        if (((uf01) aVar.X()).g) {
            aVar.e0(true);
        } else {
            aVar.e0(false);
        }
        return zy11.a;
    }
}
