package com.yandex.go.superapp.order_tracking.eats.presentation.navigation;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvpr;", "Lcom/yandex/mapkit/geometry/BoundingBox;", "Lzzs;", "it", "Lzy11;", "<anonymous>", "(Lvpr;Lzzs;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.superapp.order_tracking.eats.presentation.navigation.EatsOrderDetailsRouter$launchRecenterJob$1", f = "EatsOrderDetailsRouter.kt", l = {113}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class EatsOrderDetailsRouter$launchRecenterJob$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EatsOrderDetailsRouter$launchRecenterJob$1(g gVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = gVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        EatsOrderDetailsRouter$launchRecenterJob$1 eatsOrderDetailsRouter$launchRecenterJob$1 = new EatsOrderDetailsRouter$launchRecenterJob$1(this.this$0, (Continuation) obj3);
        eatsOrderDetailsRouter$launchRecenterJob$1.L$0 = (vpr) obj;
        return eatsOrderDetailsRouter$launchRecenterJob$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            d dVar = new d(kotlinx.coroutines.flow.e.T(new f(new b(kotlinx.coroutines.flow.e.c(this.this$0.M.b)), this.this$0), 1));
            this.L$0 = null;
            this.label = 1;
            if (dVar.collect(vprVar, this) == coroutineSingletons) {
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
