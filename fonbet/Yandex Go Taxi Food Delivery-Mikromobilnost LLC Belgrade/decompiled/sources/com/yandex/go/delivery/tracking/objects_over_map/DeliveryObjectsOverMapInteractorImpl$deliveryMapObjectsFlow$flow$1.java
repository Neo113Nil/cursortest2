package com.yandex.go.delivery.tracking.objects_over_map;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.vei;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0004\u0012\u00020\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", MetaDataField.SCREEN_FIELD, "Lvei;", "requestArea", "Lkotlin/Pair;", "<anonymous>", "(Ljava/lang/String;Lvei;)Lkotlin/Pair;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.delivery.tracking.objects_over_map.DeliveryObjectsOverMapInteractorImpl$deliveryMapObjectsFlow$flow$1", f = "DeliveryObjectsOverMapInteractorImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class DeliveryObjectsOverMapInteractorImpl$deliveryMapObjectsFlow$flow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public DeliveryObjectsOverMapInteractorImpl$deliveryMapObjectsFlow$flow$1() {
        super(3, null);
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        DeliveryObjectsOverMapInteractorImpl$deliveryMapObjectsFlow$flow$1 deliveryObjectsOverMapInteractorImpl$deliveryMapObjectsFlow$flow$1 = new DeliveryObjectsOverMapInteractorImpl$deliveryMapObjectsFlow$flow$1(3, (Continuation) obj3);
        deliveryObjectsOverMapInteractorImpl$deliveryMapObjectsFlow$flow$1.L$0 = (String) obj;
        deliveryObjectsOverMapInteractorImpl$deliveryMapObjectsFlow$flow$1.L$1 = (vei) obj2;
        return deliveryObjectsOverMapInteractorImpl$deliveryMapObjectsFlow$flow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str = (String) this.L$0;
        vei veiVar = (vei) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new Pair(str, veiVar);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
