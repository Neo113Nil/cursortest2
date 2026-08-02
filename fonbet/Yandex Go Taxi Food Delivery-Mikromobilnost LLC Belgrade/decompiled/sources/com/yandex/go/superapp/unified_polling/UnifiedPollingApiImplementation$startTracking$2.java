package com.yandex.go.superapp.unified_polling;

import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lvpr;", "Lfmt;", "Lcom/yandex/go/superapp/unified_polling/data/dto/SuperAppOrdersResponseDto;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.superapp.unified_polling.UnifiedPollingApiImplementation$startTracking$2", f = "UnifiedPollingApiImplementation.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class UnifiedPollingApiImplementation$startTracking$2 extends SuspendLambda implements wls {
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UnifiedPollingApiImplementation$startTracking$2(2, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        UnifiedPollingApiImplementation$startTracking$2 unifiedPollingApiImplementation$startTracking$2 = (UnifiedPollingApiImplementation$startTracking$2) create((vpr) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        unifiedPollingApiImplementation$startTracking$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        jst.e.getClass();
        return zy11.a;
    }
}
