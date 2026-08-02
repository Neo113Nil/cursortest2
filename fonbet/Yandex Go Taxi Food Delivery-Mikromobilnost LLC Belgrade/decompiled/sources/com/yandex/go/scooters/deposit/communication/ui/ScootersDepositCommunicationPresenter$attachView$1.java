package com.yandex.go.scooters.deposit.communication.ui;

import com.yandex.go.scooters.deposit.experiments.model.ScootersDepositCommunicationExperiment;
import defpackage.aen0;
import defpackage.d6z;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tdn0;
import defpackage.tse;
import defpackage.wls;
import defpackage.xdn0;
import defpackage.ydn0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.deposit.communication.ui.ScootersDepositCommunicationPresenter$attachView$1", f = "ScootersDepositCommunicationPresenter.kt", l = {19}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersDepositCommunicationPresenter$attachView$1 extends SuspendLambda implements wls {
    final /* synthetic */ xdn0 $mvpView;
    int label;
    final /* synthetic */ ydn0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersDepositCommunicationPresenter$attachView$1(ydn0 ydn0Var, xdn0 xdn0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = ydn0Var;
        this.$mvpView = xdn0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersDepositCommunicationPresenter$attachView$1(this.this$0, this.$mvpView, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersDepositCommunicationPresenter$attachView$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            tdn0 tdn0Var = this.this$0.x;
            this.label = 1;
            obj = tdn0Var.a.b(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        ScootersDepositCommunicationExperiment scootersDepositCommunicationExperiment = (ScootersDepositCommunicationExperiment) obj;
        xdn0 xdn0Var = this.$mvpView;
        this.this$0.getClass();
        String Y = d6z.Y(scootersDepositCommunicationExperiment, scootersDepositCommunicationExperiment.e.a);
        ScootersDepositCommunicationExperiment.CommunicationContent communicationContent = scootersDepositCommunicationExperiment.e;
        xdn0Var.render(new aen0(Y, d6z.Y(scootersDepositCommunicationExperiment, communicationContent.b), d6z.Y(scootersDepositCommunicationExperiment, communicationContent.c)));
        return zy11.a;
    }
}
