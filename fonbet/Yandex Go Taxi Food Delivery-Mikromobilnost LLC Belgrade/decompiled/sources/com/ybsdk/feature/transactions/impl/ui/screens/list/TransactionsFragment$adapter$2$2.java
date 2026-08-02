package com.ybsdk.feature.transactions.impl.ui.screens.list;

import com.ybsdk.feature.transactions.api.entities.TransactionsLoadType;
import defpackage.sls;
import defpackage.uc5;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class TransactionsFragment$adapter$2$2 extends FunctionReferenceImpl implements sls {
    public TransactionsFragment$adapter$2$2(uc5 uc5Var) {
        super(0, uc5Var, a.class, "onTransactionsErrorClick", "onTransactionsErrorClick()V", 0);
    }

    @Override // defpackage.sls
    public final Object invoke() {
        a aVar = (a) this.receiver;
        aVar.getClass();
        aVar.b0(TransactionsLoadType.NEXT_PAGE);
        return zy11.a;
    }
}
