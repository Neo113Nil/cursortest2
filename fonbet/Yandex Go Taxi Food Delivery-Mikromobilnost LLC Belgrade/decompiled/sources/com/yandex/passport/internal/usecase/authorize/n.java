package com.yandex.passport.internal.usecase.authorize;

import com.yandex.passport.common.account.MasterToken;
import com.yandex.passport.internal.usecase.o;
import defpackage.ny61;
import java.io.Serializable;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public abstract class n extends com.yandex.passport.common.domain.a {
    public final com.yandex.passport.internal.usecase.h b;
    public final com.yandex.passport.internal.usecase.n c;

    public n(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.usecase.h hVar, com.yandex.passport.internal.usecase.n nVar) {
        super(((com.yandex.passport.common.coroutine.b) aVar).d);
        this.b = hVar;
        this.c = nVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:(1:(5:12|13|14|15|16)(2:19|20))(5:21|22|(1:24)|15|16))(1:27))(3:31|(1:33)|35)|28|(5:30|22|(0)|15|16)|26))|38|6|7|(0)(0)|28|(0)|26) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c5, code lost:
    
        if (r2 == r4) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0087, code lost:
    
        if (r2.a(r5, r3) == r4) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d3, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d4, code lost:
    
        r2 = new kotlin.Result.Failure(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a4 A[Catch: all -> 0x00d3, TRY_ENTER, TryCatch #0 {all -> 0x00d3, blocks: (B:12:0x0030, B:13:0x00c8, B:24:0x00a4), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Serializable d(n nVar, m mVar, ContinuationImpl continuationImpl) {
        BaseAuthorizeByMasterTokenUseCase$run$1 baseAuthorizeByMasterTokenUseCase$run$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        Object failure;
        m mVar2;
        Object c;
        n nVar2;
        m mVar3;
        n nVar3 = nVar;
        m mVar4 = mVar;
        if (continuationImpl instanceof BaseAuthorizeByMasterTokenUseCase$run$1) {
            baseAuthorizeByMasterTokenUseCase$run$1 = (BaseAuthorizeByMasterTokenUseCase$run$1) continuationImpl;
            int i2 = baseAuthorizeByMasterTokenUseCase$run$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                baseAuthorizeByMasterTokenUseCase$run$1.label = i2 - Integer.MIN_VALUE;
                Object obj = baseAuthorizeByMasterTokenUseCase$run$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = baseAuthorizeByMasterTokenUseCase$run$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (mVar4.b() != 0) {
                        com.yandex.passport.internal.usecase.h hVar = nVar3.b;
                        com.yandex.passport.internal.usecase.g gVar = new com.yandex.passport.internal.usecase.g(mVar4.getEnvironment(), mVar4.b());
                        baseAuthorizeByMasterTokenUseCase$run$1.L$0 = nVar3;
                        baseAuthorizeByMasterTokenUseCase$run$1.L$1 = mVar4;
                        baseAuthorizeByMasterTokenUseCase$run$1.L$2 = mVar4;
                        baseAuthorizeByMasterTokenUseCase$run$1.label = 1;
                    }
                    mVar2 = mVar4;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj);
                            Object value = ((Result) obj).getValue();
                            kotlin.b.b(value);
                            failure = value;
                            return new Result(failure);
                        }
                        mVar3 = (m) baseAuthorizeByMasterTokenUseCase$run$1.L$1;
                        nVar2 = (n) baseAuthorizeByMasterTokenUseCase$run$1.L$0;
                        kotlin.b.b(obj);
                        failure = ((Result) obj).getValue();
                        if (!(failure instanceof Result.Failure)) {
                            com.yandex.passport.internal.usecase.n nVar4 = nVar2.c;
                            o oVar = new o(mVar3.getEnvironment(), mVar3.b(), (MasterToken) failure, null, mVar3.a());
                            baseAuthorizeByMasterTokenUseCase$run$1.L$0 = null;
                            baseAuthorizeByMasterTokenUseCase$run$1.L$1 = null;
                            baseAuthorizeByMasterTokenUseCase$run$1.label = 3;
                            obj = nVar4.a(oVar, baseAuthorizeByMasterTokenUseCase$run$1);
                        }
                        return new Result(failure);
                    }
                    m mVar5 = (m) baseAuthorizeByMasterTokenUseCase$run$1.L$2;
                    mVar4 = (m) baseAuthorizeByMasterTokenUseCase$run$1.L$1;
                    n nVar5 = (n) baseAuthorizeByMasterTokenUseCase$run$1.L$0;
                    kotlin.b.b(obj);
                    mVar2 = mVar5;
                    nVar3 = nVar5;
                }
                baseAuthorizeByMasterTokenUseCase$run$1.L$0 = nVar3;
                baseAuthorizeByMasterTokenUseCase$run$1.L$1 = mVar2;
                baseAuthorizeByMasterTokenUseCase$run$1.L$2 = null;
                baseAuthorizeByMasterTokenUseCase$run$1.label = 2;
                c = nVar3.c(mVar4, baseAuthorizeByMasterTokenUseCase$run$1);
                if (c != coroutineSingletons) {
                    nVar2 = nVar3;
                    mVar3 = mVar2;
                    failure = c;
                    if (!(failure instanceof Result.Failure)) {
                    }
                    return new Result(failure);
                }
                return coroutineSingletons;
            }
        }
        baseAuthorizeByMasterTokenUseCase$run$1 = new BaseAuthorizeByMasterTokenUseCase$run$1(nVar3, continuationImpl);
        Object obj2 = baseAuthorizeByMasterTokenUseCase$run$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = baseAuthorizeByMasterTokenUseCase$run$1.label;
        if (i != 0) {
        }
        baseAuthorizeByMasterTokenUseCase$run$1.L$0 = nVar3;
        baseAuthorizeByMasterTokenUseCase$run$1.L$1 = mVar2;
        baseAuthorizeByMasterTokenUseCase$run$1.L$2 = null;
        baseAuthorizeByMasterTokenUseCase$run$1.label = 2;
        c = nVar3.c(mVar4, baseAuthorizeByMasterTokenUseCase$run$1);
        if (c != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    @Override // com.yandex.passport.common.domain.d
    public final Object b(Object obj, Continuation continuation) {
        return d(this, (m) obj, (ContinuationImpl) continuation);
    }

    public abstract Object c(m mVar, Continuation continuation);
}
