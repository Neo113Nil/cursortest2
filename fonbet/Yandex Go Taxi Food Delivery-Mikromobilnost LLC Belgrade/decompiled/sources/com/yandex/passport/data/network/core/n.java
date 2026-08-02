package com.yandex.passport.data.network.core;

import defpackage.ny61;
import java.io.Serializable;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public abstract class n extends a {
    public final o f;
    public final String g;

    public n(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.network.c cVar, com.yandex.passport.common.domain.a aVar2, d dVar, e eVar, o oVar, String str) {
        super(aVar, cVar, aVar2, dVar, eVar);
        this.f = oVar;
        this.g = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0050, code lost:
    
        if (r8 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Serializable g(n nVar, q qVar, ContinuationImpl continuationImpl) {
        MasterTokenBackendRequest$run$1 masterTokenBackendRequest$run$1;
        int i;
        Object value;
        Object obj;
        if (continuationImpl instanceof MasterTokenBackendRequest$run$1) {
            masterTokenBackendRequest$run$1 = (MasterTokenBackendRequest$run$1) continuationImpl;
            int i2 = masterTokenBackendRequest$run$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                masterTokenBackendRequest$run$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = masterTokenBackendRequest$run$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = masterTokenBackendRequest$run$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    masterTokenBackendRequest$run$1.L$0 = nVar;
                    masterTokenBackendRequest$run$1.L$1 = qVar;
                    masterTokenBackendRequest$run$1.label = 1;
                    nVar.getClass();
                    obj2 = a.e(nVar, qVar, masterTokenBackendRequest$run$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj = masterTokenBackendRequest$run$1.L$0;
                        kotlin.b.b(obj2);
                        value = obj;
                        return new Result(value);
                    }
                    qVar = (q) masterTokenBackendRequest$run$1.L$1;
                    nVar = (n) masterTokenBackendRequest$run$1.L$0;
                    kotlin.b.b(obj2);
                }
                value = ((Result) obj2).getValue();
                if (!(value instanceof Result.Failure)) {
                    o oVar = nVar.f;
                    String a = qVar.a();
                    String str = nVar.g;
                    masterTokenBackendRequest$run$1.L$0 = value;
                    masterTokenBackendRequest$run$1.L$1 = null;
                    masterTokenBackendRequest$run$1.label = 2;
                    if (((com.yandex.passport.internal.network.n) oVar).b(a, str, masterTokenBackendRequest$run$1) != coroutineSingletons) {
                        obj = value;
                        value = obj;
                    }
                    return coroutineSingletons;
                }
                return new Result(value);
            }
        }
        masterTokenBackendRequest$run$1 = new MasterTokenBackendRequest$run$1(nVar, continuationImpl);
        Object obj22 = masterTokenBackendRequest$run$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = masterTokenBackendRequest$run$1.label;
        if (i != 0) {
        }
        value = ((Result) obj22).getValue();
        if (!(value instanceof Result.Failure)) {
        }
        return new Result(value);
    }

    @Override // com.yandex.passport.data.network.core.a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Object b(q qVar, Continuation continuation) {
        return g(this, qVar, (ContinuationImpl) continuation);
    }
}
