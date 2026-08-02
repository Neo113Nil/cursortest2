package com.yandex.passport.data.network.core;

import com.yandex.passport.common.logger.LogLevel;
import defpackage.d5j0;
import defpackage.kvj0;
import defpackage.ny61;
import java.io.Serializable;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public abstract class a extends com.yandex.passport.common.domain.d {
    public final com.yandex.passport.internal.network.c b;
    public final com.yandex.passport.common.domain.a c;
    public final d d;
    public final e e;

    public a(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.network.c cVar, com.yandex.passport.common.domain.a aVar2, d dVar, e eVar) {
        super(((com.yandex.passport.common.coroutine.b) aVar).c);
        this.b = cVar;
        this.c = aVar2;
        this.d = dVar;
        this.e = eVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:0|1|(2:3|(15:5|6|7|(1:(1:(10:11|12|13|14|(5:33|34|(1:36)|37|38)|16|(5:23|24|(1:26)|27|28)|18|(1:20)|21)(2:44|45))(2:46|47))(5:56|57|(1:59)|60|(2:62|54))|48|49|50|(1:52)|14|(0)|16|(0)|18|(0)|21))|72|6|7|(0)(0)|48|49|50|(0)|14|(0)|16|(0)|18|(0)|21|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a6, code lost:
    
        if (r11 == r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0036, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00b5, code lost:
    
        r11 = new kotlin.Result.Failure(r11);
        r9 = r9;
        r10 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x004b, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x008e, code lost:
    
        r2 = new kotlin.Result.Failure(r11);
        r9 = r9;
        r10 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0087, code lost:
    
        r11 = r10;
        r10 = r9;
        r9 = r11;
        r11 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x008c, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x008d, code lost:
    
        throw r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0049, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0082, code lost:
    
        r2 = new kotlin.Result.Failure(r11);
        r9 = r9;
        r10 = r10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0098 A[Catch: all -> 0x0036, TRY_ENTER, TryCatch #2 {all -> 0x0036, blocks: (B:12:0x0031, B:13:0x00a9, B:52:0x0098), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Serializable e(a aVar, Object obj, ContinuationImpl continuationImpl) {
        AbstractBackendRequest$run$1 abstractBackendRequest$run$1;
        int i;
        Object obj2;
        a aVar2;
        a aVar3;
        Result.Failure failure;
        if (continuationImpl instanceof AbstractBackendRequest$run$1) {
            abstractBackendRequest$run$1 = (AbstractBackendRequest$run$1) continuationImpl;
            int i2 = abstractBackendRequest$run$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                abstractBackendRequest$run$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = abstractBackendRequest$run$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = abstractBackendRequest$run$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "transforming " + obj, 8);
                    }
                    c c = aVar.c();
                    abstractBackendRequest$run$1.L$0 = aVar;
                    abstractBackendRequest$run$1.L$1 = obj;
                    abstractBackendRequest$run$1.label = 1;
                    obj3 = c.a(obj, abstractBackendRequest$run$1);
                    aVar = aVar;
                    obj = obj;
                    if (obj3 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Object obj4 = abstractBackendRequest$run$1.L$1;
                        a aVar4 = (a) abstractBackendRequest$run$1.L$0;
                        kotlin.b.b(obj3);
                        aVar = obj4;
                        obj = aVar4;
                        Object value = ((Result) obj3).getValue();
                        kotlin.b.b(value);
                        obj2 = (kvj0) value;
                        aVar3 = aVar;
                        aVar2 = obj;
                        if (!(obj2 instanceof Result.Failure)) {
                            try {
                                kvj0 kvj0Var = (kvj0) obj2;
                                com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
                                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                    com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "transforming " + kvj0Var, 8);
                                }
                                com.yandex.passport.common.network.j e = aVar2.d.e(kvj0Var);
                                aVar2.b.a(e, kvj0Var.a);
                                failure = e;
                            } catch (Throwable th) {
                                failure = new Result.Failure(th);
                            }
                            obj2 = failure;
                        }
                        if (!(obj2 instanceof Result.Failure)) {
                            try {
                                com.yandex.passport.common.network.j jVar = (com.yandex.passport.common.network.j) obj2;
                                com.yandex.passport.common.logger.c cVar3 = com.yandex.passport.common.logger.a.a;
                                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                    com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "transforming " + jVar, 8);
                                }
                                obj2 = aVar2.e.a(aVar3, jVar);
                            } catch (Throwable th2) {
                                obj2 = new Result.Failure(th2);
                            }
                        }
                        Result result = new Result(obj2);
                        Object value2 = result.getValue();
                        com.yandex.passport.common.logger.c cVar4 = com.yandex.passport.common.logger.a.a;
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "Result is " + ((Object) Result.c(value2)), 8);
                        }
                        return result;
                    }
                    Object obj5 = abstractBackendRequest$run$1.L$1;
                    a aVar5 = (a) abstractBackendRequest$run$1.L$0;
                    kotlin.b.b(obj3);
                    aVar = aVar5;
                    obj = obj5;
                }
                obj2 = (d5j0) obj3;
                a aVar6 = obj;
                a aVar7 = aVar;
                a aVar8 = aVar6;
                aVar3 = aVar8;
                aVar2 = aVar7;
                if (!(obj2 instanceof Result.Failure)) {
                    com.yandex.passport.common.domain.a aVar9 = aVar7.c;
                    abstractBackendRequest$run$1.L$0 = aVar7;
                    abstractBackendRequest$run$1.L$1 = aVar8;
                    abstractBackendRequest$run$1.label = 2;
                    obj3 = aVar9.a((d5j0) obj2, abstractBackendRequest$run$1);
                    aVar = aVar8;
                    obj = aVar7;
                }
                if (!(obj2 instanceof Result.Failure)) {
                }
                if (!(obj2 instanceof Result.Failure)) {
                }
                Result result2 = new Result(obj2);
                Object value22 = result2.getValue();
                com.yandex.passport.common.logger.c cVar42 = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                }
                return result2;
            }
        }
        abstractBackendRequest$run$1 = new AbstractBackendRequest$run$1(aVar, continuationImpl);
        Object obj32 = abstractBackendRequest$run$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = abstractBackendRequest$run$1.label;
        if (i != 0) {
        }
        obj2 = (d5j0) obj32;
        a aVar62 = obj;
        a aVar72 = aVar;
        a aVar82 = aVar62;
        aVar3 = aVar82;
        aVar2 = aVar72;
        if (!(obj2 instanceof Result.Failure)) {
        }
        if (!(obj2 instanceof Result.Failure)) {
        }
        if (!(obj2 instanceof Result.Failure)) {
        }
        Result result22 = new Result(obj2);
        Object value222 = result22.getValue();
        com.yandex.passport.common.logger.c cVar422 = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
        }
        return result22;
    }

    public abstract c c();

    @Override // com.yandex.passport.common.domain.d
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object b(Object obj, Continuation continuation) {
        return e(this, obj, (ContinuationImpl) continuation);
    }
}
