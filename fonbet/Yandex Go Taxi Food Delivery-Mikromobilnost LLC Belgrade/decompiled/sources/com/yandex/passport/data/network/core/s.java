package com.yandex.passport.data.network.core;

import com.yandex.passport.common.exception.InvalidTokenException;
import com.yandex.passport.common.logger.LogLevel;
import defpackage.ny61;
import defpackage.zy11;
import java.io.Serializable;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class s extends com.yandex.passport.common.domain.a {
    public final o b;

    public s(com.yandex.passport.common.coroutine.a aVar, o oVar) {
        super(((com.yandex.passport.common.coroutine.b) aVar).c);
        this.b = oVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x005a, code lost:
    
        if (r10 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.yandex.passport.common.domain.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(r rVar, ContinuationImpl continuationImpl) {
        UsingMasterTokenRequestUseCase$run$1 usingMasterTokenRequestUseCase$run$1;
        Object obj;
        int i;
        Object failure;
        Object obj2;
        if (continuationImpl instanceof UsingMasterTokenRequestUseCase$run$1) {
            usingMasterTokenRequestUseCase$run$1 = (UsingMasterTokenRequestUseCase$run$1) continuationImpl;
            int i2 = usingMasterTokenRequestUseCase$run$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                usingMasterTokenRequestUseCase$run$1.label = i2 - Integer.MIN_VALUE;
                obj = usingMasterTokenRequestUseCase$run$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = usingMasterTokenRequestUseCase$run$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String a = rVar.a().a();
                    usingMasterTokenRequestUseCase$run$1.L$0 = this;
                    usingMasterTokenRequestUseCase$run$1.L$1 = rVar;
                    usingMasterTokenRequestUseCase$run$1.label = 1;
                    obj = ((com.yandex.passport.internal.network.n) this.b).c(a, usingMasterTokenRequestUseCase$run$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj2 = usingMasterTokenRequestUseCase$run$1.L$0;
                        kotlin.b.b(obj);
                        failure = obj2;
                        return new Result(failure);
                    }
                    rVar = (r) usingMasterTokenRequestUseCase$run$1.L$1;
                    this = (s) usingMasterTokenRequestUseCase$run$1.L$0;
                    kotlin.b.b(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "Blocked request with invalid master token", 8);
                    }
                    failure = new Result.Failure(new InvalidTokenException());
                } else {
                    failure = ((Result) rVar.b().invoke(rVar.a())).getValue();
                    Throwable a2 = Result.a(failure);
                    if (a2 != null) {
                        String a3 = rVar.a().a();
                        String c = rVar.c();
                        usingMasterTokenRequestUseCase$run$1.L$0 = failure;
                        usingMasterTokenRequestUseCase$run$1.L$1 = null;
                        usingMasterTokenRequestUseCase$run$1.label = 2;
                        this.getClass();
                        boolean z = a2 instanceof InvalidTokenException;
                        Object obj3 = zy11.a;
                        if (z) {
                            com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
                            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "Found response with invalid token exception, blocking used masterToken from ".concat(c), 8);
                            }
                            Object a4 = ((com.yandex.passport.internal.network.n) this.b).a(a3, c, usingMasterTokenRequestUseCase$run$1);
                            if (a4 == coroutineSingletons) {
                                obj3 = a4;
                            }
                        }
                        if (obj3 != coroutineSingletons) {
                            obj2 = failure;
                            failure = obj2;
                        }
                        return coroutineSingletons;
                    }
                }
                return new Result(failure);
            }
        }
        usingMasterTokenRequestUseCase$run$1 = new UsingMasterTokenRequestUseCase$run$1(this, continuationImpl);
        obj = usingMasterTokenRequestUseCase$run$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = usingMasterTokenRequestUseCase$run$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        return new Result(failure);
    }
}
