package com.yandex.messaging.internal.storage;

import defpackage.lu5;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sb7;
import defpackage.wb7;
import defpackage.wls;
import defpackage.y6f0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly6f0;", "", "Lzy11;", "<anonymous>", "(Ly6f0;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.storage.CacheObserverKt$chatViewChangesFlow$3", f = "CacheObserver.kt", l = {513}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class CacheObserverKt$chatViewChangesFlow$3 extends SuspendLambda implements wls {
    final /* synthetic */ sb7 $this_chatViewChangesFlow;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CacheObserverKt$chatViewChangesFlow$3(sb7 sb7Var, Continuation continuation) {
        super(2, continuation);
        this.$this_chatViewChangesFlow = sb7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CacheObserverKt$chatViewChangesFlow$3 cacheObserverKt$chatViewChangesFlow$3 = new CacheObserverKt$chatViewChangesFlow$3(this.$this_chatViewChangesFlow, continuation);
        cacheObserverKt$chatViewChangesFlow$3.L$0 = obj;
        return cacheObserverKt$chatViewChangesFlow$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CacheObserverKt$chatViewChangesFlow$3) create((y6f0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            y6f0 y6f0Var = (y6f0) this.L$0;
            wb7 wb7Var = new wb7(y6f0Var);
            this.$this_chatViewChangesFlow.a(wb7Var);
            lu5 lu5Var = new lu5(18, this.$this_chatViewChangesFlow, wb7Var);
            this.label = 1;
            if (kotlinx.coroutines.channels.b.a(y6f0Var, lu5Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
