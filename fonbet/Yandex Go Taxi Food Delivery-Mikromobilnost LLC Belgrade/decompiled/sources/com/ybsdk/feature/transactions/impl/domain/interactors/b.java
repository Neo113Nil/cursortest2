package com.ybsdk.feature.transactions.impl.domain.interactors;

import com.ybsdk.feature.transactions.impl.data.c;
import defpackage.ny61;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class b {
    public final c a;

    public b(c cVar) {
        this.a = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, ContinuationImpl continuationImpl) {
        TransactionsInteractor$getTransactions$1 transactionsInteractor$getTransactions$1;
        int i;
        if (continuationImpl instanceof TransactionsInteractor$getTransactions$1) {
            transactionsInteractor$getTransactions$1 = (TransactionsInteractor$getTransactions$1) continuationImpl;
            int i2 = transactionsInteractor$getTransactions$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transactionsInteractor$getTransactions$1.label = i2 - Integer.MIN_VALUE;
                Object obj = transactionsInteractor$getTransactions$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transactionsInteractor$getTransactions$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    transactionsInteractor$getTransactions$1.label = 1;
                    Object b = this.a.b(50, str2, str, transactionsInteractor$getTransactions$1);
                    return b == coroutineSingletons ? coroutineSingletons : b;
                }
                if (i == 1) {
                    kotlin.b.b(obj);
                    return ((Result) obj).getValue();
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        transactionsInteractor$getTransactions$1 = new TransactionsInteractor$getTransactions$1(this, continuationImpl);
        Object obj2 = transactionsInteractor$getTransactions$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transactionsInteractor$getTransactions$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        TransactionsInteractor$getTransactionsInfo$1 transactionsInteractor$getTransactionsInfo$1;
        int i;
        if (continuationImpl instanceof TransactionsInteractor$getTransactionsInfo$1) {
            transactionsInteractor$getTransactionsInfo$1 = (TransactionsInteractor$getTransactionsInfo$1) continuationImpl;
            int i2 = transactionsInteractor$getTransactionsInfo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transactionsInteractor$getTransactionsInfo$1.label = i2 - Integer.MIN_VALUE;
                Object obj = transactionsInteractor$getTransactionsInfo$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transactionsInteractor$getTransactionsInfo$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    transactionsInteractor$getTransactionsInfo$1.label = 1;
                    Object c = this.a.c(50, str, transactionsInteractor$getTransactionsInfo$1);
                    return c == coroutineSingletons ? coroutineSingletons : c;
                }
                if (i == 1) {
                    kotlin.b.b(obj);
                    return ((Result) obj).getValue();
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        transactionsInteractor$getTransactionsInfo$1 = new TransactionsInteractor$getTransactionsInfo$1(this, continuationImpl);
        Object obj2 = transactionsInteractor$getTransactionsInfo$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transactionsInteractor$getTransactionsInfo$1.label;
        if (i != 0) {
        }
    }
}
