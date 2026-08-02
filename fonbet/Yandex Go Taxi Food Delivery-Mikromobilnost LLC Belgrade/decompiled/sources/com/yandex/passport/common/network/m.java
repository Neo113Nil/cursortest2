package com.yandex.passport.common.network;

import com.yandex.passport.common.logger.LogLevel;
import defpackage.d5j0;
import defpackage.kvj0;
import defpackage.nci0;
import defpackage.ny61;
import defpackage.yf7;
import java.io.Serializable;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import okhttp3.OkHttpClient;

/* loaded from: classes8.dex */
public final class m extends com.yandex.passport.common.domain.a {
    public final OkHttpClient b;

    public m(com.yandex.passport.common.coroutine.a aVar, OkHttpClient okHttpClient) {
        super(((com.yandex.passport.common.coroutine.b) aVar).d);
        this.b = okHttpClient;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|(1:(1:10)(2:21|22))(5:23|24|(1:26)|27|(1:29))|11|12|(2:14|(1:16))|17|18))|36|6|7|(0)(0)|11|12|(0)|17|18|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x002c, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0070, code lost:
    
        r8 = new kotlin.Result.Failure(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006e, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006f, code lost:
    
        throw r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x002a, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0068, code lost:
    
        r8 = new kotlin.Result.Failure(r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // com.yandex.passport.common.domain.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(d5j0 d5j0Var, ContinuationImpl continuationImpl) {
        BaseOkHttpUseCase$run$1 baseOkHttpUseCase$run$1;
        int i;
        Throwable a;
        if (continuationImpl instanceof BaseOkHttpUseCase$run$1) {
            baseOkHttpUseCase$run$1 = (BaseOkHttpUseCase$run$1) continuationImpl;
            int i2 = baseOkHttpUseCase$run$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                baseOkHttpUseCase$run$1.label = i2 - Integer.MIN_VALUE;
                Object obj = baseOkHttpUseCase$run$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = baseOkHttpUseCase$run$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "Running request " + d5j0Var, 8);
                    }
                    yf7 newCall = this.b.newCall(d5j0Var);
                    baseOkHttpUseCase$run$1.label = 1;
                    obj = com.yandex.passport.common.util.a.a((nci0) newCall, baseOkHttpUseCase$run$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                Object failure = (kvj0) obj;
                a = Result.a(failure);
                if (a != null) {
                    com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.b(LogLevel.ERROR, null, "OkHttp request failed.", a);
                    }
                }
                return new Result(failure);
            }
        }
        baseOkHttpUseCase$run$1 = new BaseOkHttpUseCase$run$1(this, continuationImpl);
        Object obj2 = baseOkHttpUseCase$run$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = baseOkHttpUseCase$run$1.label;
        if (i != 0) {
        }
        Object failure2 = (kvj0) obj2;
        a = Result.a(failure2);
        if (a != null) {
        }
        return new Result(failure2);
    }
}
