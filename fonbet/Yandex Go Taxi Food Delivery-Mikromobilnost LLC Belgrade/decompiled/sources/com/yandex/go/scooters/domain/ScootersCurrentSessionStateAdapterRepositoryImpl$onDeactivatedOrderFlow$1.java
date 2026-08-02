package com.yandex.go.scooters.domain;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000j\u0002`\u00032\"\u0010\u0004\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000j\u0002`\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Pair;", "", "Lzuo0;", "Lcom/yandex/go/scooters/domain/PrevAndNewPair;", "previous", "newOne", "<anonymous>", "(Lkotlin/Pair;Ljava/util/List;)Lkotlin/Pair;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.domain.ScootersCurrentSessionStateAdapterRepositoryImpl$onDeactivatedOrderFlow$1", f = "ScootersCurrentSessionStateAdapterRepositoryImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class ScootersCurrentSessionStateAdapterRepositoryImpl$onDeactivatedOrderFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ScootersCurrentSessionStateAdapterRepositoryImpl$onDeactivatedOrderFlow$1 scootersCurrentSessionStateAdapterRepositoryImpl$onDeactivatedOrderFlow$1 = new ScootersCurrentSessionStateAdapterRepositoryImpl$onDeactivatedOrderFlow$1(3, (Continuation) obj3);
        scootersCurrentSessionStateAdapterRepositoryImpl$onDeactivatedOrderFlow$1.L$0 = (Pair) obj;
        scootersCurrentSessionStateAdapterRepositoryImpl$onDeactivatedOrderFlow$1.L$1 = (List) obj2;
        return scootersCurrentSessionStateAdapterRepositoryImpl$onDeactivatedOrderFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Pair pair = (Pair) this.L$0;
        List list = (List) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new Pair(pair.f(), list);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
