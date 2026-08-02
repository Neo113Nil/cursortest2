package com.yandex.passport.common.domain;

import com.yandex.passport.common.logger.LogLevel;
import defpackage.d6z;
import defpackage.jse;
import defpackage.ny61;
import java.io.Serializable;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$IntRef;

/* loaded from: classes8.dex */
public abstract class b extends a {
    public final d b;
    public final long c;
    public final int d;

    public b(jse jseVar, a aVar) {
        super(jseVar);
        this.b = aVar;
        this.c = com.yandex.passport.common.time.a.c(0, 0, 300, 7);
        RetryStrategy retryStrategy = RetryStrategy.CONSTANT;
        this.d = 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object d(b bVar, Object obj, ContinuationImpl continuationImpl) {
        RetryingUseCase$baseOperation$1 retryingUseCase$baseOperation$1;
        int i;
        if (continuationImpl instanceof RetryingUseCase$baseOperation$1) {
            retryingUseCase$baseOperation$1 = (RetryingUseCase$baseOperation$1) continuationImpl;
            int i2 = retryingUseCase$baseOperation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                retryingUseCase$baseOperation$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = retryingUseCase$baseOperation$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = retryingUseCase$baseOperation$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    d dVar = bVar.b;
                    retryingUseCase$baseOperation$1.label = 1;
                    obj2 = dVar.a(obj, retryingUseCase$baseOperation$1);
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return ((Result) obj2).getValue();
            }
        }
        retryingUseCase$baseOperation$1 = new RetryingUseCase$baseOperation$1(bVar, continuationImpl);
        Object obj22 = retryingUseCase$baseOperation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = retryingUseCase$baseOperation$1.label;
        if (i != 0) {
        }
        return ((Result) obj22).getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ab, code lost:
    
        if (kotlinx.coroutines.a.i(r6, r0) == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00ab -> B:11:0x0034). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Serializable h(b bVar, Object obj, ContinuationImpl continuationImpl) {
        RetryingUseCase$run$1 retryingUseCase$run$1;
        int i;
        Ref$IntRef ref$IntRef;
        Object obj2;
        Ref$IntRef ref$IntRef2;
        b bVar2;
        Throwable a;
        Object c;
        if (continuationImpl instanceof RetryingUseCase$run$1) {
            retryingUseCase$run$1 = (RetryingUseCase$run$1) continuationImpl;
            int i2 = retryingUseCase$run$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                retryingUseCase$run$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = retryingUseCase$run$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = retryingUseCase$run$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    ref$IntRef = new Ref$IntRef();
                    retryingUseCase$run$1.L$0 = bVar;
                    retryingUseCase$run$1.L$1 = obj;
                    retryingUseCase$run$1.L$2 = ref$IntRef;
                    retryingUseCase$run$1.label = 1;
                    c = bVar.c(obj, retryingUseCase$run$1);
                    if (c != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ref$IntRef2 = (Ref$IntRef) retryingUseCase$run$1.L$2;
                    obj = retryingUseCase$run$1.L$1;
                    bVar2 = (b) retryingUseCase$run$1.L$0;
                    kotlin.b.b(obj3);
                    ref$IntRef = ref$IntRef2;
                    bVar = bVar2;
                    if (ref$IntRef.element > bVar.f()) {
                        return new Result(new Result.Failure(new RuntimeException("Internal error")));
                    }
                    retryingUseCase$run$1.L$0 = bVar;
                    retryingUseCase$run$1.L$1 = obj;
                    retryingUseCase$run$1.L$2 = ref$IntRef;
                    retryingUseCase$run$1.label = 1;
                    c = bVar.c(obj, retryingUseCase$run$1);
                    if (c != coroutineSingletons) {
                        bVar2 = bVar;
                        ref$IntRef2 = ref$IntRef;
                        obj2 = c;
                        a = Result.a(obj2);
                        if (a != null) {
                            return new Result(d6z.d(obj2));
                        }
                        int i3 = ref$IntRef2.element;
                        ref$IntRef2.element = i3 + 1;
                        if (i3 >= bVar2.f() || !bVar2.i(a)) {
                            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                com.yandex.passport.common.logger.a.c(LogLevel.ERROR, null, "Maximum retries reached " + ref$IntRef2.element, 8);
                            }
                            return new Result(new Result.Failure(a));
                        }
                        long d = com.yandex.passport.internal.ui.c.d(bVar2.g(), ref$IntRef2.element + 1, bVar2.e());
                        retryingUseCase$run$1.L$0 = bVar2;
                        retryingUseCase$run$1.L$1 = obj;
                        retryingUseCase$run$1.L$2 = ref$IntRef2;
                        retryingUseCase$run$1.label = 2;
                    }
                    return coroutineSingletons;
                }
                ref$IntRef2 = (Ref$IntRef) retryingUseCase$run$1.L$2;
                obj = retryingUseCase$run$1.L$1;
                bVar2 = (b) retryingUseCase$run$1.L$0;
                kotlin.b.b(obj3);
                obj2 = ((Result) obj3).getValue();
                a = Result.a(obj2);
                if (a != null) {
                }
            }
        }
        retryingUseCase$run$1 = new RetryingUseCase$run$1(bVar, continuationImpl);
        Object obj32 = retryingUseCase$run$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = retryingUseCase$run$1.label;
        if (i != 0) {
        }
    }

    @Override // com.yandex.passport.common.domain.d
    public final Object b(Object obj, Continuation continuation) {
        return h(this, obj, (ContinuationImpl) continuation);
    }

    public Object c(Object obj, Continuation continuation) {
        return d(this, obj, (ContinuationImpl) continuation);
    }

    public long e() {
        return this.c;
    }

    public int f() {
        return this.d;
    }

    public abstract RetryStrategy g();

    public boolean i(Throwable th) {
        return true;
    }
}
