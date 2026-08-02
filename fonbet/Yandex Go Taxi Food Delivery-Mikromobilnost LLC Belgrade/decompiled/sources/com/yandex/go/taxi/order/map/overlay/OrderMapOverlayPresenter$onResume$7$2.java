package com.yandex.go.taxi.order.map.overlay;

import com.yandex.go.taxi.order.models.api.promotions.ObjectAppearanceOverride;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.v48;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lv48;", "carIconData", "Lcom/yandex/go/taxi/order/models/api/promotions/ObjectAppearanceOverride;", "override", "Lkotlin/Pair;", "<anonymous>", "(Lv48;Lcom/yandex/go/taxi/order/models/api/promotions/ObjectAppearanceOverride;)Lkotlin/Pair;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.map.overlay.OrderMapOverlayPresenter$onResume$7$2", f = "OrderMapOverlayPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderMapOverlayPresenter$onResume$7$2 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        OrderMapOverlayPresenter$onResume$7$2 orderMapOverlayPresenter$onResume$7$2 = new OrderMapOverlayPresenter$onResume$7$2(3, (Continuation) obj3);
        orderMapOverlayPresenter$onResume$7$2.L$0 = (v48) obj;
        orderMapOverlayPresenter$onResume$7$2.L$1 = (ObjectAppearanceOverride) obj2;
        return orderMapOverlayPresenter$onResume$7$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        v48 v48Var = (v48) this.L$0;
        ObjectAppearanceOverride objectAppearanceOverride = (ObjectAppearanceOverride) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new Pair(v48Var, objectAppearanceOverride);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
