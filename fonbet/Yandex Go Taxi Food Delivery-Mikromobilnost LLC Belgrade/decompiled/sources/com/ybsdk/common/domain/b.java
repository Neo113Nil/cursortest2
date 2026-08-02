package com.ybsdk.common.domain;

import defpackage.ny61;
import defpackage.xj1;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes8.dex */
public final class b {
    public final com.ybsdk.common.repositiories.balance.a a;
    public final com.ybsdk.common.repositiories.agreements.a b;
    public final r0 c;

    public b(com.ybsdk.common.repositiories.balance.a aVar, com.ybsdk.common.repositiories.agreements.a aVar2) {
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar.e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0066, code lost:
    
        if (r5 == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0068, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0051, code lost:
    
        if (r6 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058 A[Catch: all -> 0x006d, TRY_ENTER, TryCatch #0 {all -> 0x006d, blocks: (B:11:0x0026, B:12:0x0069, B:21:0x0058), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        GetBalanceInteractor$request$1 getBalanceInteractor$request$1;
        int i;
        boolean z;
        Object b;
        Object a;
        try {
            if (continuationImpl instanceof GetBalanceInteractor$request$1) {
                getBalanceInteractor$request$1 = (GetBalanceInteractor$request$1) continuationImpl;
                int i2 = getBalanceInteractor$request$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    getBalanceInteractor$request$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = getBalanceInteractor$request$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = getBalanceInteractor$request$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        z = false;
                        getBalanceInteractor$request$1.Z$0 = false;
                        getBalanceInteractor$request$1.label = 1;
                        b = this.b.b(getBalanceInteractor$request$1);
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj);
                            a = ((Result) obj).getValue();
                            kotlin.b.b(a);
                            return a;
                        }
                        z = getBalanceInteractor$request$1.Z$0;
                        kotlin.b.b(obj);
                        b = ((Result) obj).getValue();
                    }
                    if (!(b instanceof Result.Failure)) {
                        return b;
                    }
                    com.ybsdk.common.repositiories.balance.a aVar = this.a;
                    String a2 = ((xj1) b).a();
                    getBalanceInteractor$request$1.label = 2;
                    a = aVar.a(a2, getBalanceInteractor$request$1, z);
                }
            }
            if (i != 0) {
            }
            if (!(b instanceof Result.Failure)) {
            }
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
        getBalanceInteractor$request$1 = new GetBalanceInteractor$request$1(this, continuationImpl);
        Object obj2 = getBalanceInteractor$request$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getBalanceInteractor$request$1.label;
    }
}
