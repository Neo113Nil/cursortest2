package com.yandex.go.taxi.order.tariff_upgrade.domain;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.tariff_upgrade.domain.ActiveOrdersTariffUpgradeInteractor$activeOrdersTariffUpgradeFlow$$inlined$flatMapLatest$2", f = "ActiveOrdersTariffUpgradeInteractor.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class ActiveOrdersTariffUpgradeInteractor$activeOrdersTariffUpgradeFlow$$inlined$flatMapLatest$2 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActiveOrdersTariffUpgradeInteractor$activeOrdersTariffUpgradeFlow$$inlined$flatMapLatest$2(c cVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = cVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ActiveOrdersTariffUpgradeInteractor$activeOrdersTariffUpgradeFlow$$inlined$flatMapLatest$2 activeOrdersTariffUpgradeInteractor$activeOrdersTariffUpgradeFlow$$inlined$flatMapLatest$2 = new ActiveOrdersTariffUpgradeInteractor$activeOrdersTariffUpgradeFlow$$inlined$flatMapLatest$2(this.this$0, (Continuation) obj3);
        activeOrdersTariffUpgradeInteractor$activeOrdersTariffUpgradeFlow$$inlined$flatMapLatest$2.L$0 = (vpr) obj;
        activeOrdersTariffUpgradeInteractor$activeOrdersTariffUpgradeFlow$$inlined$flatMapLatest$2.L$1 = obj2;
        return activeOrdersTariffUpgradeInteractor$activeOrdersTariffUpgradeFlow$$inlined$flatMapLatest$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            o2y0 o2y0Var = (o2y0) obj2;
            b bVar = new b(this.this$0.a.d(o2y0Var), o2y0Var);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (kotlinx.coroutines.flow.e.u(bVar, vprVar, this) == coroutineSingletons) {
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
