package com.yandex.go.chargers.order.data;

import defpackage.mvg;
import defpackage.nar;
import defpackage.ny61;
import defpackage.rl9;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.g;

@Metadata(d1 = {"\u0000\n\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "it", "Ltpr;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.order.data.ChargersActiveOrdersRemoveEventsRepository$special$$inlined$flatMapConcat$1", f = "ChargersActiveOrdersRemoveEventsRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class ChargersActiveOrdersRemoveEventsRepository$special$$inlined$flatMapConcat$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChargersActiveOrdersRemoveEventsRepository$special$$inlined$flatMapConcat$1 chargersActiveOrdersRemoveEventsRepository$special$$inlined$flatMapConcat$1 = new ChargersActiveOrdersRemoveEventsRepository$special$$inlined$flatMapConcat$1(2, continuation);
        chargersActiveOrdersRemoveEventsRepository$special$$inlined$flatMapConcat$1.L$0 = obj;
        return chargersActiveOrdersRemoveEventsRepository$special$$inlined$flatMapConcat$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersActiveOrdersRemoveEventsRepository$special$$inlined$flatMapConcat$1) create(obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2 = this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        List list = ((rl9) obj2).a;
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : list) {
            if (obj3 instanceof nar) {
                arrayList.add(obj3);
            }
        }
        return new g(arrayList);
    }
}
