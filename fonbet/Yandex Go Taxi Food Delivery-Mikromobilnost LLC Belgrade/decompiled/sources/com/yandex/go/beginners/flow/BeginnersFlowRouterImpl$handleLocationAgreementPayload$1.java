package com.yandex.go.beginners.flow;

import defpackage.cb0;
import defpackage.jl40;
import defpackage.lge0;
import defpackage.m950;
import defpackage.mge0;
import defpackage.mvg;
import defpackage.nge0;
import defpackage.ny61;
import defpackage.oge0;
import defpackage.ok5;
import defpackage.qk1;
import defpackage.qk5;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.beginners.flow.BeginnersFlowRouterImpl$handleLocationAgreementPayload$1", f = "BeginnersFlowRouterImpl.kt", l = {66}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class BeginnersFlowRouterImpl$handleLocationAgreementPayload$1 extends SuspendLambda implements wls {
    final /* synthetic */ qk1 $locationPermission;
    int label;
    final /* synthetic */ qk5 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BeginnersFlowRouterImpl$handleLocationAgreementPayload$1(qk5 qk5Var, qk1 qk1Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = qk5Var;
        this.$locationPermission = qk1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BeginnersFlowRouterImpl$handleLocationAgreementPayload$1(this.this$0, this.$locationPermission, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BeginnersFlowRouterImpl$handleLocationAgreementPayload$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.beginners.domain.interactor.b bVar = this.this$0.M;
            this.label = 1;
            obj = bVar.a(this);
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
        oge0 oge0Var = (oge0) obj;
        if (jl40.l(oge0Var, lge0.a)) {
            qk5.Q(this.this$0, this.$locationPermission);
        } else if (jl40.l(oge0Var, mge0.a)) {
            qk5 qk5Var = this.this$0;
            qk5Var.z((m950) qk5Var.J.get(), new ok5(qk5Var, this.$locationPermission, 0));
        } else {
            if (!(oge0Var instanceof nge0)) {
                w511.b();
                return null;
            }
            qk5 qk5Var2 = this.this$0;
            qk5Var2.A((m950) qk5Var2.K.get(), ((nge0) oge0Var).a, new cb0(3, this.this$0, this.$locationPermission));
        }
        return zy11.a;
    }
}
