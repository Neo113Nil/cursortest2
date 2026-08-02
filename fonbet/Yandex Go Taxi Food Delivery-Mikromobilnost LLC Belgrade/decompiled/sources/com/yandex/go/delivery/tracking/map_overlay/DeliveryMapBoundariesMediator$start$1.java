package com.yandex.go.delivery.tracking.map_overlay;

import com.yandex.go.superapp.api.repository.SuperAppRecenterPointRepository$Type;
import defpackage.hst;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.odi;
import defpackage.wls;
import defpackage.yth;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.reprov.x509.CRLDistributionPointsExtension;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/yandex/mapkit/geometry/Point;", CRLDistributionPointsExtension.POINTS, "Lzy11;", "<anonymous>", "(Ljava/util/List;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.delivery.tracking.map_overlay.DeliveryMapBoundariesMediator$start$1", f = "DeliveryMapBoundariesMediator.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class DeliveryMapBoundariesMediator$start$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ odi this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryMapBoundariesMediator$start$1(odi odiVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = odiVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DeliveryMapBoundariesMediator$start$1 deliveryMapBoundariesMediator$start$1 = new DeliveryMapBoundariesMediator$start$1(this.this$0, continuation);
        deliveryMapBoundariesMediator$start$1.L$0 = obj;
        return deliveryMapBoundariesMediator$start$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        DeliveryMapBoundariesMediator$start$1 deliveryMapBoundariesMediator$start$1 = (DeliveryMapBoundariesMediator$start$1) create((List) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        deliveryMapBoundariesMediator$start$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list = (List) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        yth ythVar = this.this$0.a;
        ythVar.getClass();
        ythVar.a.c(list.size() == 1 ? SuperAppRecenterPointRepository$Type.LOGISTICS_NO_ANIMATION : SuperAppRecenterPointRepository$Type.LOGISTICS, list);
        hst hstVar = jst.e;
        list.size();
        hstVar.getClass();
        return zy11.a;
    }
}
