package com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor;

import defpackage.fnx0;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lfnx0;", "tariffSelection", "", "<anonymous>", "(Lfnx0;)Z"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.IntercityDashboardSeatsInteractorImpl$awaitTaxiTariffClassChangedTo$2", f = "IntercityDashboardSeatsInteractorImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class IntercityDashboardSeatsInteractorImpl$awaitTaxiTariffClassChangedTo$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $tariffClass;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntercityDashboardSeatsInteractorImpl$awaitTaxiTariffClassChangedTo$2(String str, Continuation continuation) {
        super(2, continuation);
        this.$tariffClass = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        IntercityDashboardSeatsInteractorImpl$awaitTaxiTariffClassChangedTo$2 intercityDashboardSeatsInteractorImpl$awaitTaxiTariffClassChangedTo$2 = new IntercityDashboardSeatsInteractorImpl$awaitTaxiTariffClassChangedTo$2(this.$tariffClass, continuation);
        intercityDashboardSeatsInteractorImpl$awaitTaxiTariffClassChangedTo$2.L$0 = obj;
        return intercityDashboardSeatsInteractorImpl$awaitTaxiTariffClassChangedTo$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((IntercityDashboardSeatsInteractorImpl$awaitTaxiTariffClassChangedTo$2) create((fnx0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        fnx0 fnx0Var = (fnx0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return Boolean.valueOf(jl40.l(fnx0Var.c.b, this.$tariffClass));
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
