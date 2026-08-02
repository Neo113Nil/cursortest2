package com.yandex.go.taxi.order.details.v2.state.elements.driver;

import defpackage.dms;
import defpackage.hgk0;
import defpackage.ibk0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ogk0;
import defpackage.ygk0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lhgk0;", "avatarState", "Logk0;", "carIconState", "Libk0;", "driverAction", "carPlateAction", "Lygk0;", "<anonymous>", "(Lhgk0;Logk0;Libk0;Libk0;)Lygk0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.state.elements.driver.RideCardDriverItemDataSource$stateFlow$2", f = "RideCardDriverItemDataSource.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardDriverItemDataSource$stateFlow$2 extends SuspendLambda implements dms {
    final /* synthetic */ ygk0 $baseState;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    /* synthetic */ Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardDriverItemDataSource$stateFlow$2(ygk0 ygk0Var, Continuation continuation) {
        super(5, continuation);
        this.$baseState = ygk0Var;
    }

    @Override // defpackage.dms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        RideCardDriverItemDataSource$stateFlow$2 rideCardDriverItemDataSource$stateFlow$2 = new RideCardDriverItemDataSource$stateFlow$2(this.$baseState, (Continuation) obj5);
        rideCardDriverItemDataSource$stateFlow$2.L$0 = (hgk0) obj;
        rideCardDriverItemDataSource$stateFlow$2.L$1 = (ogk0) obj2;
        rideCardDriverItemDataSource$stateFlow$2.L$2 = (ibk0) obj3;
        rideCardDriverItemDataSource$stateFlow$2.L$3 = (ibk0) obj4;
        return rideCardDriverItemDataSource$stateFlow$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        hgk0 hgk0Var = (hgk0) this.L$0;
        ogk0 ogk0Var = (ogk0) this.L$1;
        ibk0 ibk0Var = (ibk0) this.L$2;
        ibk0 ibk0Var2 = (ibk0) this.L$3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return ygk0.c(this.$baseState, ogk0Var, hgk0Var, ibk0Var, ibk0Var2, 1183);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
