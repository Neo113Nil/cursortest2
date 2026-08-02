package com.ybsdk.feature.transactions.impl.ui.screens.list;

import com.ybsdk.core.utils.dto.common.FailDataException;
import defpackage.sls;
import defpackage.uc5;
import defpackage.uf01;
import defpackage.xf01;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class TransactionsFragment$getViewBinding$1$4 extends FunctionReferenceImpl implements sls {
    public TransactionsFragment$getViewBinding$1$4(uc5 uc5Var) {
        super(0, uc5Var, a.class, "onErrorSecondaryButtonClick", "onErrorSecondaryButtonClick()V", 0);
    }

    @Override // defpackage.sls
    public final Object invoke() {
        String supportUrl;
        a aVar = (a) this.receiver;
        Throwable th = ((uf01) aVar.X()).f;
        FailDataException failDataException = th instanceof FailDataException ? (FailDataException) th : null;
        if (failDataException != null && (supportUrl = failDataException.getSupportUrl()) != null) {
            ((xf01) aVar.D).a(supportUrl);
        }
        return zy11.a;
    }
}
