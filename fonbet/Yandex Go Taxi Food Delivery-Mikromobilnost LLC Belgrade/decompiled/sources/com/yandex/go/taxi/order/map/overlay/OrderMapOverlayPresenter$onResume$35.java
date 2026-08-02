package com.yandex.go.taxi.order.map.overlay;

import defpackage.bms;
import defpackage.e430;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Le430;", "modeStyle", "", "Lsq00;", "intermediateStopsPinsInfo", "Lru/yandex/taxi/theme/ThemeType;", "<unused var>", "Lkotlin/Pair;", "<anonymous>", "(Le430;Ljava/util/List;Lru/yandex/taxi/theme/ThemeType;)Lkotlin/Pair;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.map.overlay.OrderMapOverlayPresenter$onResume$35", f = "OrderMapOverlayPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderMapOverlayPresenter$onResume$35 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        OrderMapOverlayPresenter$onResume$35 orderMapOverlayPresenter$onResume$35 = new OrderMapOverlayPresenter$onResume$35(4, (Continuation) obj4);
        orderMapOverlayPresenter$onResume$35.L$0 = (e430) obj;
        orderMapOverlayPresenter$onResume$35.L$1 = (List) obj2;
        return orderMapOverlayPresenter$onResume$35.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        e430 e430Var = (e430) this.L$0;
        List list = (List) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new Pair(e430Var, list);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
