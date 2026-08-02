package com.yandex.go.scooters.passes.super_pass.grace.state_bar;

import com.yandex.go.scooters.passes.super_pass.experiments.ScootersSuperPassGracePeriodExperiment;
import defpackage.fcl0;
import defpackage.fef;
import defpackage.gdc;
import defpackage.j0p0;
import defpackage.mqg0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p6p0;
import defpackage.t3u0;
import defpackage.u3u0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.statebar.StateBarViewModel$Type;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/go/scooters/passes/super_pass/experiments/ScootersSuperPassGracePeriodExperiment;", "experiment", "Lp6p0;", "userState", "Lu3u0;", "<anonymous>", "(Lcom/yandex/go/scooters/passes/super_pass/experiments/ScootersSuperPassGracePeriodExperiment;Lp6p0;)Lu3u0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.passes.super_pass.grace.state_bar.ScootersSuperPassGraceStateBarPresenter$attachView$1", f = "ScootersSuperPassGraceStateBarPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersSuperPassGraceStateBarPresenter$attachView$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ j0p0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersSuperPassGraceStateBarPresenter$attachView$1(j0p0 j0p0Var, Continuation continuation) {
        super(3, continuation);
        this.this$0 = j0p0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ScootersSuperPassGraceStateBarPresenter$attachView$1 scootersSuperPassGraceStateBarPresenter$attachView$1 = new ScootersSuperPassGraceStateBarPresenter$attachView$1(this.this$0, (Continuation) obj3);
        scootersSuperPassGraceStateBarPresenter$attachView$1.L$0 = (ScootersSuperPassGracePeriodExperiment) obj;
        scootersSuperPassGraceStateBarPresenter$attachView$1.L$1 = (p6p0) obj2;
        return scootersSuperPassGraceStateBarPresenter$attachView$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ScootersSuperPassGracePeriodExperiment scootersSuperPassGracePeriodExperiment = (ScootersSuperPassGracePeriodExperiment) this.L$0;
        p6p0 p6p0Var = (p6p0) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        Integer num = p6p0Var.h;
        fef fefVar = p6p0Var.f;
        if (!scootersSuperPassGracePeriodExperiment.b || num == null) {
            t3u0 t3u0Var = new t3u0(StateBarViewModel$Type.SCOOTERS_SUPER_PASS_GRACE);
            t3u0Var.b = false;
            return new u3u0(t3u0Var);
        }
        t3u0 t3u0Var2 = new t3u0(StateBarViewModel$Type.SCOOTERS_SUPER_PASS_GRACE);
        t3u0Var2.b = true;
        t3u0Var2.e = j0p0.Kg(this.this$0, scootersSuperPassGracePeriodExperiment.d, scootersSuperPassGracePeriodExperiment, num.intValue(), fefVar);
        t3u0Var2.g = j0p0.Kg(this.this$0, scootersSuperPassGracePeriodExperiment.e, scootersSuperPassGracePeriodExperiment, num.intValue(), fefVar);
        t3u0Var2.h = new gdc(mqg0.component_red_normal);
        int i = mqg0.component_white;
        t3u0Var2.k = new gdc(i);
        t3u0Var2.l = new gdc(i);
        t3u0Var2.j = true;
        t3u0Var2.i = new fcl0(13, this.this$0.B);
        return new u3u0(t3u0Var2);
    }
}
