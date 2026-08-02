package com.ybsdk.feature.transactions.impl.data;

import com.ybsdk.feature.transactions.api.entities.TransactionsFeedFilterEntity;
import com.ybsdk.feature.transactions.impl.data.network.TransactionsApi;
import defpackage.ny61;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class b {
    public final TransactionsApi a;

    public b(TransactionsApi transactionsApi) {
        this.a = transactionsApi;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(TransactionsFeedFilterEntity transactionsFeedFilterEntity, boolean z, boolean z2, ContinuationImpl continuationImpl) {
        TransactionsFeedRepository$getTransactionsFeedFilters$1 transactionsFeedRepository$getTransactionsFeedFilters$1;
        int i;
        if (continuationImpl instanceof TransactionsFeedRepository$getTransactionsFeedFilters$1) {
            transactionsFeedRepository$getTransactionsFeedFilters$1 = (TransactionsFeedRepository$getTransactionsFeedFilters$1) continuationImpl;
            int i2 = transactionsFeedRepository$getTransactionsFeedFilters$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transactionsFeedRepository$getTransactionsFeedFilters$1.label = i2 - Integer.MIN_VALUE;
                Object obj = transactionsFeedRepository$getTransactionsFeedFilters$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transactionsFeedRepository$getTransactionsFeedFilters$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                TransactionsFeedRepository$getTransactionsFeedFilters$2 transactionsFeedRepository$getTransactionsFeedFilters$2 = new TransactionsFeedRepository$getTransactionsFeedFilters$2(this, transactionsFeedFilterEntity, z, z2, null);
                transactionsFeedRepository$getTransactionsFeedFilters$1.label = 1;
                Object c = com.ybsdk.core.utils.ext.c.c(transactionsFeedRepository$getTransactionsFeedFilters$2, transactionsFeedRepository$getTransactionsFeedFilters$1);
                return c == coroutineSingletons ? coroutineSingletons : c;
            }
        }
        transactionsFeedRepository$getTransactionsFeedFilters$1 = new TransactionsFeedRepository$getTransactionsFeedFilters$1(this, continuationImpl);
        Object obj2 = transactionsFeedRepository$getTransactionsFeedFilters$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transactionsFeedRepository$getTransactionsFeedFilters$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(TransactionsFeedFilterEntity transactionsFeedFilterEntity, String str, int i, int i2, boolean z, boolean z2, ContinuationImpl continuationImpl) {
        TransactionsFeedRepository$getTransactionsFeedList$1 transactionsFeedRepository$getTransactionsFeedList$1;
        int i3;
        if (continuationImpl instanceof TransactionsFeedRepository$getTransactionsFeedList$1) {
            transactionsFeedRepository$getTransactionsFeedList$1 = (TransactionsFeedRepository$getTransactionsFeedList$1) continuationImpl;
            int i4 = transactionsFeedRepository$getTransactionsFeedList$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                transactionsFeedRepository$getTransactionsFeedList$1.label = i4 - Integer.MIN_VALUE;
                Object obj = transactionsFeedRepository$getTransactionsFeedList$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i3 = transactionsFeedRepository$getTransactionsFeedList$1.label;
                if (i3 == 0) {
                    if (i3 == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                TransactionsFeedRepository$getTransactionsFeedList$2 transactionsFeedRepository$getTransactionsFeedList$2 = new TransactionsFeedRepository$getTransactionsFeedList$2(this, i, transactionsFeedFilterEntity, i2, str, z, z2, null);
                transactionsFeedRepository$getTransactionsFeedList$1.label = 1;
                Object c = com.ybsdk.core.utils.ext.c.c(transactionsFeedRepository$getTransactionsFeedList$2, transactionsFeedRepository$getTransactionsFeedList$1);
                return c == coroutineSingletons ? coroutineSingletons : c;
            }
        }
        transactionsFeedRepository$getTransactionsFeedList$1 = new TransactionsFeedRepository$getTransactionsFeedList$1(this, continuationImpl);
        Object obj2 = transactionsFeedRepository$getTransactionsFeedList$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i3 = transactionsFeedRepository$getTransactionsFeedList$1.label;
        if (i3 == 0) {
        }
    }
}
