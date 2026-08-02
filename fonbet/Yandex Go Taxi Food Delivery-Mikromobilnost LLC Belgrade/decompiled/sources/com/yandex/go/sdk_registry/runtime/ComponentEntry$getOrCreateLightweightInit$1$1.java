package com.yandex.go.sdk_registry.runtime;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lkotlin/Result;", "Lzy11;", "<anonymous>", "(Ltse;)Lkotlin/Result;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.sdk_registry.runtime.ComponentEntry$getOrCreateLightweightInit$1$1", f = "ComponentEntry.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ComponentEntry$getOrCreateLightweightInit$1$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComponentEntry$getOrCreateLightweightInit$1$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ComponentEntry$getOrCreateLightweightInit$1$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ComponentEntry$getOrCreateLightweightInit$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        com.yandex.go.sdk_registry.runtime.metrics.a aVar = this.this$0.e;
        synchronized (aVar.d) {
            if (!aVar.e) {
                aVar.e = true;
            }
        }
        a aVar2 = this.this$0;
        com.yandex.go.sdk_registry.runtime.metrics.a aVar3 = aVar2.e;
        try {
            aVar3.f();
            aVar2.c().c(aVar2.f);
            aVar3.e();
            d = zy11.a;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            aVar2.b(th);
            aVar3.d();
            d = aVar2.d(th);
        }
        return new Result(d);
    }
}
