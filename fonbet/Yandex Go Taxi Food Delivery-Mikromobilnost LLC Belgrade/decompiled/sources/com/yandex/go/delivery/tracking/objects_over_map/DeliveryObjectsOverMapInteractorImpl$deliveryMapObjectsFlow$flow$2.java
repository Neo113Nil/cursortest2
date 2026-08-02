package com.yandex.go.delivery.tracking.objects_over_map;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.vei;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0014\u0010\u0003\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Pair;", "", "Lvei;", "<destruct>", "", "Lcom/yandex/go/shortcuts/dto/response/ObjectOverMap;", "<anonymous>", "(Lkotlin/Pair;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.delivery.tracking.objects_over_map.DeliveryObjectsOverMapInteractorImpl$deliveryMapObjectsFlow$flow$2", f = "DeliveryObjectsOverMapInteractorImpl.kt", l = {40}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class DeliveryObjectsOverMapInteractorImpl$deliveryMapObjectsFlow$flow$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryObjectsOverMapInteractorImpl$deliveryMapObjectsFlow$flow$2(e eVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DeliveryObjectsOverMapInteractorImpl$deliveryMapObjectsFlow$flow$2 deliveryObjectsOverMapInteractorImpl$deliveryMapObjectsFlow$flow$2 = new DeliveryObjectsOverMapInteractorImpl$deliveryMapObjectsFlow$flow$2(this.this$0, continuation);
        deliveryObjectsOverMapInteractorImpl$deliveryMapObjectsFlow$flow$2.L$0 = obj;
        return deliveryObjectsOverMapInteractorImpl$deliveryMapObjectsFlow$flow$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DeliveryObjectsOverMapInteractorImpl$deliveryMapObjectsFlow$flow$2) create((Pair) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Pair pair = (Pair) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            String str = (String) pair.getFirst();
            vei veiVar = (vei) pair.getSecond();
            if (str == null) {
                return EmptyList.a;
            }
            e eVar = this.this$0;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            obj = e.a(eVar, str, veiVar, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return (List) obj;
    }
}
