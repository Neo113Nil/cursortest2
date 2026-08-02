package com.yandex.go.scooters.requirements;

import defpackage.bso0;
import defpackage.cso0;
import defpackage.gdn0;
import defpackage.m950;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o6p0;
import defpackage.p6p0;
import defpackage.sls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.requirements.ScootersRequirementsRouter$checkDebt$1", f = "ScootersRequirementsRouter.kt", l = {49}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersRequirementsRouter$checkDebt$1 extends SuspendLambda implements wls {
    final /* synthetic */ sls $onSuccess;
    int label;
    final /* synthetic */ cso0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersRequirementsRouter$checkDebt$1(sls slsVar, cso0 cso0Var, Continuation continuation) {
        super(2, continuation);
        this.$onSuccess = slsVar;
        this.this$0 = cso0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersRequirementsRouter$checkDebt$1(this.$onSuccess, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersRequirementsRouter$checkDebt$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        o6p0 o6p0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ScootersRequirementsRouter$checkDebt$1$userState$1 scootersRequirementsRouter$checkDebt$1$userState$1 = new ScootersRequirementsRouter$checkDebt$1$userState$1(this.this$0, null);
            this.label = 1;
            obj = kotlinx.coroutines.a.w(1500L, scootersRequirementsRouter$checkDebt$1$userState$1, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        p6p0 p6p0Var = (p6p0) obj;
        zy11 zy11Var = zy11.a;
        if (p6p0Var == null || (o6p0Var = p6p0Var.c) == null) {
            this.$onSuccess.invoke();
            return zy11Var;
        }
        cso0 cso0Var = this.this$0;
        cso0Var.A((m950) cso0Var.D.get(), new gdn0(o6p0Var), new bso0(this.$onSuccess, cso0Var));
        return zy11Var;
    }
}
