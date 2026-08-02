package com.ybsdk.feature.transactions.impl.data;

import com.ybsdk.feature.transactions.impl.data.network.dto.TransactionsInfoResponseV2;
import defpackage.wls;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class TransactionsRepository$getTransactionsInfo$3$1 extends FunctionReferenceImpl implements wls {
    public static final TransactionsRepository$getTransactionsInfo$3$1 b = new TransactionsRepository$getTransactionsInfo$3$1(2, 1, com.ybsdk.feature.transactions.impl.data.network.dto.a.class, "toEntity", "toEntity(Lcom/ybsdk/feature/transactions/impl/data/network/dto/TransactionsInfoResponseV2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return com.ybsdk.feature.transactions.impl.data.network.dto.a.c((TransactionsInfoResponseV2) obj, (Continuation) obj2);
    }
}
