package com.yandex.go.transfer_requirement.mvp;

import defpackage.aw70;
import defpackage.jl01;
import defpackage.kcz0;
import defpackage.kux0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.op01;
import defpackage.t601;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.orderforanother.model.FormedFrom;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.transfer_requirement.mvp.TransferRequirementModalViewPresenter$onPassengerSelectorClicked$1", f = "TransferRequirementModalViewPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class TransferRequirementModalViewPresenter$onPassengerSelectorClicked$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ op01 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferRequirementModalViewPresenter$onPassengerSelectorClicked$1(op01 op01Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = op01Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TransferRequirementModalViewPresenter$onPassengerSelectorClicked$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        TransferRequirementModalViewPresenter$onPassengerSelectorClicked$1 transferRequirementModalViewPresenter$onPassengerSelectorClicked$1 = (TransferRequirementModalViewPresenter$onPassengerSelectorClicked$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        transferRequirementModalViewPresenter$onPassengerSelectorClicked$1.invokeSuspend(zy11Var);
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
        com.yandex.go.transfer_requirement.card_state.a aVar = this.this$0.A;
        kcz0 kcz0Var = aVar.g;
        jl01 jl01Var = new jl01(10, aVar);
        ((ru.yandex.taxi.orderforanother.repository.a) kcz0Var.a).i(FormedFrom.REQUIREMENTS);
        ((ru.yandex.taxi.orderforanother.router.a) ((aw70) kcz0Var.b)).b(new t601(3, kcz0Var, jl01Var), new kux0(23, jl01Var));
        return zy11.a;
    }
}
