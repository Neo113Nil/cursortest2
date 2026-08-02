package com.yandex.plus.home.common.utils.flow;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "T", "it", "Lkotlin/Pair;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@mvg(c = "com.yandex.plus.home.common.utils.flow.ColdFlow$terminableFlow$1", f = "ColdFlow.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ColdFlow$terminableFlow$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ColdFlow$terminableFlow$1 coldFlow$terminableFlow$1 = new ColdFlow$terminableFlow$1(2, continuation);
        coldFlow$terminableFlow$1.L$0 = obj;
        return coldFlow$terminableFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ColdFlow$terminableFlow$1) create((Pair) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Pair pair = (Pair) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return pair.c();
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
