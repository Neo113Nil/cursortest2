package com.yandex.messaging.sync;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.p8g;
import defpackage.tpr;
import defpackage.v320;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.sync.CrossProfileConnectionStatusUseCase$execute$$inlined$flatMapLatest$1", f = "CrossProfileConnectionStatusUseCase.kt", l = {189}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class CrossProfileConnectionStatusUseCase$execute$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        CrossProfileConnectionStatusUseCase$execute$$inlined$flatMapLatest$1 crossProfileConnectionStatusUseCase$execute$$inlined$flatMapLatest$1 = new CrossProfileConnectionStatusUseCase$execute$$inlined$flatMapLatest$1(3, (Continuation) obj3);
        crossProfileConnectionStatusUseCase$execute$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        crossProfileConnectionStatusUseCase$execute$$inlined$flatMapLatest$1.L$1 = obj2;
        return crossProfileConnectionStatusUseCase$execute$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        vpr vprVar = (vpr) this.L$0;
        tpr a = ((p8g) ((v320) this.L$1)).b().a();
        this.label = 1;
        e.w(vprVar);
        Object collect = a.collect(new a(vprVar), this);
        if (collect != coroutineSingletons) {
            collect = zy11Var;
        }
        if (collect != coroutineSingletons) {
            collect = zy11Var;
        }
        return collect == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
