package com.yandex.go.preorder.deeplinks.route;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lkotlin/Result;", "Lu1l0;", "<anonymous>", "(Ltse;)Lkotlin/Result;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.preorder.deeplinks.route.RouteDataInteractor$toRouteData$2", f = "RouteDataInteractor.kt", l = {HProv.PP_SIGNATUREOID}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class RouteDataInteractor$toRouteData$2 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $hasSourcePointInIntent;
    final /* synthetic */ IntentData $intentData;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteDataInteractor$toRouteData$2(c cVar, IntentData intentData, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$intentData = intentData;
        this.$hasSourcePointInIntent = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RouteDataInteractor$toRouteData$2 routeDataInteractor$toRouteData$2 = new RouteDataInteractor$toRouteData$2(this.this$0, this.$intentData, this.$hasSourcePointInIntent, continuation);
        routeDataInteractor$toRouteData$2.L$0 = obj;
        return routeDataInteractor$toRouteData$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RouteDataInteractor$toRouteData$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            c cVar = this.this$0;
            IntentData intentData = this.$intentData;
            boolean z = this.$hasSourcePointInIntent;
            this.L$0 = null;
            this.label = 1;
            a = c.a(cVar, tseVar, intentData, z, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            a = ((Result) obj).getValue();
        }
        return new Result(a);
    }
}
