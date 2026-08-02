package com.ybsdk.feature.transactions.impl.ui.screens.feed;

import com.ybsdk.core.utils.dto.common.FailDataException;
import defpackage.ff01;
import defpackage.s8j0;
import defpackage.sls;
import defpackage.u8j0;
import defpackage.uc5;
import defpackage.xf01;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class TransactionsFeedFragment$onViewCreated$1$9 extends FunctionReferenceImpl implements sls {
    public TransactionsFeedFragment$onViewCreated$1$9(uc5 uc5Var) {
        super(0, uc5Var, c.class, "onErrorSecondaryButtonClick", "onErrorSecondaryButtonClick()V", 0);
    }

    @Override // defpackage.sls
    public final Object invoke() {
        String supportUrl;
        c cVar = (c) this.receiver;
        u8j0 u8j0Var = ((ff01) cVar.X()).d;
        s8j0 s8j0Var = u8j0Var instanceof s8j0 ? (s8j0) u8j0Var : null;
        Object obj = s8j0Var != null ? s8j0Var.a : null;
        FailDataException failDataException = obj instanceof FailDataException ? (FailDataException) obj : null;
        if (failDataException != null && (supportUrl = failDataException.getSupportUrl()) != null) {
            ((xf01) cVar.E).a(supportUrl);
        }
        return zy11.a;
    }
}
