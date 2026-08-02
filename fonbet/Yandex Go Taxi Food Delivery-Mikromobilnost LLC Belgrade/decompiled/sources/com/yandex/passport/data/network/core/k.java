package com.yandex.passport.data.network.core;

import com.yandex.passport.common.account.MasterToken;
import com.yandex.passport.common.network.l0;
import defpackage.ny61;
import java.io.Serializable;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public abstract class k extends a {
    public final o f;
    public final String g;

    public k(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.network.c cVar, l0 l0Var, d dVar, e eVar, o oVar, String str) {
        super(aVar, cVar, l0Var, dVar, eVar);
        this.f = oVar;
        this.g = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0049, code lost:
    
        if (r7 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Serializable f(k kVar, Object obj, ContinuationImpl continuationImpl) {
        GetMasterTokenBackendRequest$run$1 getMasterTokenBackendRequest$run$1;
        int i;
        Object value;
        Object obj2;
        if (continuationImpl instanceof GetMasterTokenBackendRequest$run$1) {
            getMasterTokenBackendRequest$run$1 = (GetMasterTokenBackendRequest$run$1) continuationImpl;
            int i2 = getMasterTokenBackendRequest$run$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getMasterTokenBackendRequest$run$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = getMasterTokenBackendRequest$run$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getMasterTokenBackendRequest$run$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    getMasterTokenBackendRequest$run$1.L$0 = kVar;
                    getMasterTokenBackendRequest$run$1.label = 1;
                    kVar.getClass();
                    obj3 = a.e(kVar, obj, getMasterTokenBackendRequest$run$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj2 = getMasterTokenBackendRequest$run$1.L$0;
                        kotlin.b.b(obj3);
                        value = obj2;
                        return new Result(value);
                    }
                    kVar = (k) getMasterTokenBackendRequest$run$1.L$0;
                    kotlin.b.b(obj3);
                }
                value = ((Result) obj3).getValue();
                if (!(value instanceof Result.Failure)) {
                    o oVar = kVar.f;
                    String value2 = ((MasterToken) value).getValue();
                    String str = kVar.g;
                    getMasterTokenBackendRequest$run$1.L$0 = value;
                    getMasterTokenBackendRequest$run$1.label = 2;
                    if (((com.yandex.passport.internal.network.n) oVar).b(value2, str, getMasterTokenBackendRequest$run$1) != coroutineSingletons) {
                        obj2 = value;
                        value = obj2;
                    }
                    return coroutineSingletons;
                }
                return new Result(value);
            }
        }
        getMasterTokenBackendRequest$run$1 = new GetMasterTokenBackendRequest$run$1(kVar, continuationImpl);
        Object obj32 = getMasterTokenBackendRequest$run$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getMasterTokenBackendRequest$run$1.label;
        if (i != 0) {
        }
        value = ((Result) obj32).getValue();
        if (!(value instanceof Result.Failure)) {
        }
        return new Result(value);
    }

    @Override // com.yandex.passport.data.network.core.a, com.yandex.passport.common.domain.d
    public final Object b(Object obj, Continuation continuation) {
        return f(this, obj, (ContinuationImpl) continuation);
    }

    @Override // com.yandex.passport.data.network.core.a
    /* renamed from: d */
    public final Object b(Object obj, Continuation continuation) {
        return f(this, obj, (ContinuationImpl) continuation);
    }
}
