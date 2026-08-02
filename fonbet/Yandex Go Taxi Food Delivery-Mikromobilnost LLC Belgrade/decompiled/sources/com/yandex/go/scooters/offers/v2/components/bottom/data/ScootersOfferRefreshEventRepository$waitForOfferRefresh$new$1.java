package com.yandex.go.scooters.offers.v2.components.bottom.data;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.x5n0;
import defpackage.z5n0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lz5n0;", "it", "", "<anonymous>", "(Lz5n0;)Z"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.offers.v2.components.bottom.data.ScootersOfferRefreshEventRepository$waitForOfferRefresh$new$1", f = "ScootersOfferRefreshEventRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersOfferRefreshEventRepository$waitForOfferRefresh$new$1 extends SuspendLambda implements wls {
    final /* synthetic */ z5n0 $lastState;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersOfferRefreshEventRepository$waitForOfferRefresh$new$1(z5n0 z5n0Var, Continuation continuation) {
        super(2, continuation);
        this.$lastState = z5n0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersOfferRefreshEventRepository$waitForOfferRefresh$new$1 scootersOfferRefreshEventRepository$waitForOfferRefresh$new$1 = new ScootersOfferRefreshEventRepository$waitForOfferRefresh$new$1(this.$lastState, continuation);
        scootersOfferRefreshEventRepository$waitForOfferRefresh$new$1.L$0 = obj;
        return scootersOfferRefreshEventRepository$waitForOfferRefresh$new$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersOfferRefreshEventRepository$waitForOfferRefresh$new$1) create((z5n0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        z5n0 z5n0Var = (z5n0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            b.b(obj);
            return Boolean.valueOf((z5n0Var == this.$lastState || (z5n0Var instanceof x5n0)) ? false : true);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
