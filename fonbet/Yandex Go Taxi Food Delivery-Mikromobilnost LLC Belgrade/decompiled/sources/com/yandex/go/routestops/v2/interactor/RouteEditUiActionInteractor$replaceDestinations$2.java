package com.yandex.go.routestops.v2.interactor;

import com.yandex.go.address.models.Address;
import defpackage.h3l0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.routestops.v2.interactor.RouteEditUiActionInteractor$replaceDestinations$2", f = "RouteEditUiActionInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class RouteEditUiActionInteractor$replaceDestinations$2 extends SuspendLambda implements wls {
    final /* synthetic */ List<Address> $restoredDestinations;
    int label;
    final /* synthetic */ h3l0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteEditUiActionInteractor$replaceDestinations$2(h3l0 h3l0Var, List list, Continuation continuation) {
        super(2, continuation);
        this.this$0 = h3l0Var;
        this.$restoredDestinations = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RouteEditUiActionInteractor$replaceDestinations$2(this.this$0, this.$restoredDestinations, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        RouteEditUiActionInteractor$replaceDestinations$2 routeEditUiActionInteractor$replaceDestinations$2 = (RouteEditUiActionInteractor$replaceDestinations$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        routeEditUiActionInteractor$replaceDestinations$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        com.yandex.go.taxi.summary.routestops.e eVar = this.this$0.a;
        eVar.a.c(this.$restoredDestinations);
        return zy11.a;
    }
}
