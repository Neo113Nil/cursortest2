package com.ybsdk.feature.transactions.impl.data;

import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import com.ybsdk.feature.transactions.impl.data.network.TransactionsApi;
import defpackage.mjl;
import defpackage.ny61;
import defpackage.rr51;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class c {
    public final TransactionsApi a;

    public c(TransactionsApi transactionsApi) {
        this.a = transactionsApi;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:
    
        if (r6 == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0067, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004f, code lost:
    
        if (r6 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0079 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        TransactionsRepository$getDivTransactionInfo$1 transactionsRepository$getDivTransactionInfo$1;
        int i;
        Object c;
        Throwable a;
        Object failure;
        if (continuationImpl instanceof TransactionsRepository$getDivTransactionInfo$1) {
            transactionsRepository$getDivTransactionInfo$1 = (TransactionsRepository$getDivTransactionInfo$1) continuationImpl;
            int i2 = transactionsRepository$getDivTransactionInfo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transactionsRepository$getDivTransactionInfo$1.label = i2 - Integer.MIN_VALUE;
                Object obj = transactionsRepository$getDivTransactionInfo$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transactionsRepository$getDivTransactionInfo$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    TransactionsRepository$getDivTransactionInfo$divDataResult$1 transactionsRepository$getDivTransactionInfo$divDataResult$1 = new TransactionsRepository$getDivTransactionInfo$divDataResult$1(this, str, null);
                    transactionsRepository$getDivTransactionInfo$1.label = 1;
                    c = com.ybsdk.core.utils.ext.c.c(transactionsRepository$getDivTransactionInfo$divDataResult$1, transactionsRepository$getDivTransactionInfo$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        failure = ((Result) obj).getValue();
                        return !(failure instanceof Result.Failure) ? new mjl((rr51) failure) : failure;
                    }
                    kotlin.b.b(obj);
                    c = ((Result) obj).getValue();
                }
                a = Result.a(c);
                if (a != null) {
                    com.ybsdk.feature.divkit.api.domain.a aVar = new com.ybsdk.feature.divkit.api.domain.a(null);
                    transactionsRepository$getDivTransactionInfo$1.label = 2;
                    failure = aVar.b((DivDataDto) c, transactionsRepository$getDivTransactionInfo$1);
                } else {
                    failure = new Result.Failure(a);
                }
                if (!(failure instanceof Result.Failure)) {
                }
            }
        }
        transactionsRepository$getDivTransactionInfo$1 = new TransactionsRepository$getDivTransactionInfo$1(this, continuationImpl);
        Object obj2 = transactionsRepository$getDivTransactionInfo$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transactionsRepository$getDivTransactionInfo$1.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a != null) {
        }
        if (!(failure instanceof Result.Failure)) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0058, code lost:
    
        if (r0 == r9) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(int i, String str, String str2, ContinuationImpl continuationImpl) {
        TransactionsRepository$getTransactions$1 transactionsRepository$getTransactions$1;
        int i2;
        Object c;
        Throwable a;
        if (continuationImpl instanceof TransactionsRepository$getTransactions$1) {
            transactionsRepository$getTransactions$1 = (TransactionsRepository$getTransactions$1) continuationImpl;
            int i3 = transactionsRepository$getTransactions$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                transactionsRepository$getTransactions$1.label = i3 - Integer.MIN_VALUE;
                Object obj = transactionsRepository$getTransactions$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = transactionsRepository$getTransactions$1.label;
                if (i2 != 0) {
                    kotlin.b.b(obj);
                    TransactionsRepository$getTransactions$2 transactionsRepository$getTransactions$2 = new TransactionsRepository$getTransactions$2(this, str2, null, i, str, null);
                    transactionsRepository$getTransactions$1.label = 1;
                    c = com.ybsdk.core.utils.ext.c.c(transactionsRepository$getTransactions$2, transactionsRepository$getTransactions$1);
                } else {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            kotlin.b.b(obj);
                            return ((Result) obj).getValue();
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    c = ((Result) obj).getValue();
                }
                a = Result.a(c);
                if (a == null) {
                    return new Result.Failure(a);
                }
                TransactionsRepository$getTransactions$3$1 transactionsRepository$getTransactions$3$1 = new TransactionsRepository$getTransactions$3$1(2, null);
                transactionsRepository$getTransactions$1.label = 2;
                Object a2 = com.ybsdk.core.utils.dto.b.a((DataWithStatusResponse) c, transactionsRepository$getTransactions$3$1, transactionsRepository$getTransactions$1);
                return a2 == coroutineSingletons ? coroutineSingletons : a2;
            }
        }
        transactionsRepository$getTransactions$1 = new TransactionsRepository$getTransactions$1(this, continuationImpl);
        Object obj2 = transactionsRepository$getTransactions$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = transactionsRepository$getTransactions$1.label;
        if (i2 != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
    
        if (r6 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(int i, String str, ContinuationImpl continuationImpl) {
        TransactionsRepository$getTransactionsInfo$1 transactionsRepository$getTransactionsInfo$1;
        int i2;
        Object c;
        Throwable a;
        if (continuationImpl instanceof TransactionsRepository$getTransactionsInfo$1) {
            transactionsRepository$getTransactionsInfo$1 = (TransactionsRepository$getTransactionsInfo$1) continuationImpl;
            int i3 = transactionsRepository$getTransactionsInfo$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                transactionsRepository$getTransactionsInfo$1.label = i3 - Integer.MIN_VALUE;
                Object obj = transactionsRepository$getTransactionsInfo$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = transactionsRepository$getTransactionsInfo$1.label;
                if (i2 != 0) {
                    kotlin.b.b(obj);
                    TransactionsRepository$getTransactionsInfo$2 transactionsRepository$getTransactionsInfo$2 = new TransactionsRepository$getTransactionsInfo$2(this, str, i, null);
                    transactionsRepository$getTransactionsInfo$1.label = 1;
                    c = com.ybsdk.core.utils.ext.c.c(transactionsRepository$getTransactionsInfo$2, transactionsRepository$getTransactionsInfo$1);
                } else {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            kotlin.b.b(obj);
                            return ((Result) obj).getValue();
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    c = ((Result) obj).getValue();
                }
                a = Result.a(c);
                if (a == null) {
                    return new Result.Failure(a);
                }
                TransactionsRepository$getTransactionsInfo$3$1 transactionsRepository$getTransactionsInfo$3$1 = TransactionsRepository$getTransactionsInfo$3$1.b;
                transactionsRepository$getTransactionsInfo$1.label = 2;
                Object a2 = com.ybsdk.core.utils.dto.b.a((DataWithStatusResponse) c, transactionsRepository$getTransactionsInfo$3$1, transactionsRepository$getTransactionsInfo$1);
                return a2 == coroutineSingletons ? coroutineSingletons : a2;
            }
        }
        transactionsRepository$getTransactionsInfo$1 = new TransactionsRepository$getTransactionsInfo$1(this, continuationImpl);
        Object obj2 = transactionsRepository$getTransactionsInfo$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = transactionsRepository$getTransactionsInfo$1.label;
        if (i2 != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }
}
