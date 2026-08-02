package com.ybsdk.feature.transactions.impl.data.network.dto;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.transactions.impl.data.network.dto.TransactionsInfoResponseV2Kt", f = "TransactionsInfoResponseV2.kt", l = {22}, m = "toEntity")
/* loaded from: classes3.dex */
final class TransactionsInfoResponseV2Kt$toEntity$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return a.c(null, this);
    }
}
