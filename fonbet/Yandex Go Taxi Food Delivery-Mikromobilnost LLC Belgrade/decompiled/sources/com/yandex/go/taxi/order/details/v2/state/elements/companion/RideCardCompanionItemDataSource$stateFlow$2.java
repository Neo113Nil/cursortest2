package com.yandex.go.taxi.order.details.v2.state.elements.companion;

import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$ComboCompanion;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rek0;
import defpackage.vek0;
import defpackage.wek0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lrek0;", "body", "Lvek0;", "trail", "Lwek0;", "<anonymous>", "(Lrek0;Lvek0;)Lwek0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.state.elements.companion.RideCardCompanionItemDataSource$stateFlow$2", f = "RideCardCompanionItemDataSource.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardCompanionItemDataSource$stateFlow$2 extends SuspendLambda implements zls {
    final /* synthetic */ RideCardItemDto$ComboCompanion $item;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardCompanionItemDataSource$stateFlow$2(RideCardItemDto$ComboCompanion rideCardItemDto$ComboCompanion, Continuation continuation) {
        super(3, continuation);
        this.$item = rideCardItemDto$ComboCompanion;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        RideCardCompanionItemDataSource$stateFlow$2 rideCardCompanionItemDataSource$stateFlow$2 = new RideCardCompanionItemDataSource$stateFlow$2(this.$item, (Continuation) obj3);
        rideCardCompanionItemDataSource$stateFlow$2.L$0 = (rek0) obj;
        rideCardCompanionItemDataSource$stateFlow$2.L$1 = (vek0) obj2;
        return rideCardCompanionItemDataSource$stateFlow$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        rek0 rek0Var = (rek0) this.L$0;
        vek0 vek0Var = (vek0) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        RideCardItemDto$ComboCompanion rideCardItemDto$ComboCompanion = this.$item;
        return new wek0(rideCardItemDto$ComboCompanion.a, rideCardItemDto$ComboCompanion.b, rek0Var, vek0Var);
    }
}
