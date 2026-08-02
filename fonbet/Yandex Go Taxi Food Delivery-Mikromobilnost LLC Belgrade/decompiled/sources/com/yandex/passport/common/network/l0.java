package com.yandex.passport.common.network;

import com.yandex.passport.common.domain.RetryStrategy;
import defpackage.d5j0;
import defpackage.kvj0;
import defpackage.ny61;
import java.io.IOException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class l0 extends com.yandex.passport.common.domain.b {
    public RetryStrategy e;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0075 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0049 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object j(l0 l0Var, d5j0 d5j0Var, ContinuationImpl continuationImpl) {
        RetryingOkHttpUseCase$baseOperation$1 retryingOkHttpUseCase$baseOperation$1;
        int i;
        Object d;
        if (continuationImpl instanceof RetryingOkHttpUseCase$baseOperation$1) {
            retryingOkHttpUseCase$baseOperation$1 = (RetryingOkHttpUseCase$baseOperation$1) continuationImpl;
            int i2 = retryingOkHttpUseCase$baseOperation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                retryingOkHttpUseCase$baseOperation$1.label = i2 - Integer.MIN_VALUE;
                Object obj = retryingOkHttpUseCase$baseOperation$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = retryingOkHttpUseCase$baseOperation$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    retryingOkHttpUseCase$baseOperation$1.label = 1;
                    l0Var.getClass();
                    d = com.yandex.passport.common.domain.b.d(l0Var, d5j0Var, retryingOkHttpUseCase$baseOperation$1);
                    if (d == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    d = ((Result) obj).getValue();
                }
                if (!(d instanceof Result.Failure)) {
                    return d;
                }
                try {
                    kvj0 kvj0Var = (kvj0) d;
                    boolean z = kvj0Var.J;
                    int i3 = kvj0Var.w;
                    if (!z && i3 != 304 && kvj0Var.z == null) {
                        throw new IOException("Response code " + i3);
                    }
                    return kvj0Var;
                } catch (Throwable th) {
                    return new Result.Failure(th);
                }
            }
        }
        retryingOkHttpUseCase$baseOperation$1 = new RetryingOkHttpUseCase$baseOperation$1(l0Var, continuationImpl);
        Object obj2 = retryingOkHttpUseCase$baseOperation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = retryingOkHttpUseCase$baseOperation$1.label;
        if (i != 0) {
        }
        if (!(d instanceof Result.Failure)) {
        }
    }

    @Override // com.yandex.passport.common.domain.b
    public final Object c(Object obj, Continuation continuation) {
        return j(this, (d5j0) obj, (ContinuationImpl) continuation);
    }

    @Override // com.yandex.passport.common.domain.b
    public final RetryStrategy g() {
        return this.e;
    }

    @Override // com.yandex.passport.common.domain.b
    public final boolean i(Throwable th) {
        return th instanceof IOException;
    }
}
