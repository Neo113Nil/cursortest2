package com.yandex.go.taxi.order.details.v2.state.elements.driver;

import defpackage.mvg;
import defpackage.n9k0;
import defpackage.ny61;
import defpackage.q48;
import defpackage.s9k0;
import defpackage.web1;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.models.CopySource;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lq48;", "carData", "Libk0;", "<anonymous>", "(Lq48;)Libk0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.state.elements.driver.RideCardDriverItemDataSource$collectCarPlateClickAction$2", f = "RideCardDriverItemDataSource.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardDriverItemDataSource$collectCarPlateClickAction$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RideCardDriverItemDataSource$collectCarPlateClickAction$2 rideCardDriverItemDataSource$collectCarPlateClickAction$2 = new RideCardDriverItemDataSource$collectCarPlateClickAction$2(2, continuation);
        rideCardDriverItemDataSource$collectCarPlateClickAction$2.L$0 = obj;
        return rideCardDriverItemDataSource$collectCarPlateClickAction$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RideCardDriverItemDataSource$collectCarPlateClickAction$2) create((q48) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        q48 q48Var = (q48) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return web1.i(q48Var) ? new n9k0(q48Var, CopySource.DETAILS, null) : s9k0.a;
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
