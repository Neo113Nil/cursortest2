package com.yandex.go.intercity.flex.dashboard.presentation;

import defpackage.jl40;
import defpackage.lbl0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Llbl0;", "routeStatsParam", "", "tariffClass", "<anonymous>", "(Llbl0;Ljava/lang/String;)Llbl0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.intercity.flex.dashboard.presentation.IntercityDashboardFlexSdkInteractorImpl$routeStatsParamFlow$2", f = "IntercityDashboardFlexSdkInteractorImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class IntercityDashboardFlexSdkInteractorImpl$routeStatsParamFlow$2 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntercityDashboardFlexSdkInteractorImpl$routeStatsParamFlow$2(g gVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = gVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        IntercityDashboardFlexSdkInteractorImpl$routeStatsParamFlow$2 intercityDashboardFlexSdkInteractorImpl$routeStatsParamFlow$2 = new IntercityDashboardFlexSdkInteractorImpl$routeStatsParamFlow$2(this.this$0, (Continuation) obj3);
        intercityDashboardFlexSdkInteractorImpl$routeStatsParamFlow$2.L$0 = (lbl0) obj;
        intercityDashboardFlexSdkInteractorImpl$routeStatsParamFlow$2.L$1 = (String) obj2;
        return intercityDashboardFlexSdkInteractorImpl$routeStatsParamFlow$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        lbl0 lbl0Var = (lbl0) this.L$0;
        String str = (String) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.this$0.getClass();
        return !jl40.l(lbl0Var.c, str) ? new lbl0(lbl0Var.a, lbl0Var.b, str, lbl0Var.d, lbl0Var.e, lbl0Var.f, lbl0Var.g, lbl0Var.h, lbl0Var.i, lbl0Var.j, lbl0Var.k, lbl0Var.l, lbl0Var.m, lbl0Var.n, lbl0Var.o, lbl0Var.p, lbl0Var.q, lbl0Var.r, lbl0Var.s, lbl0Var.t, lbl0Var.u, lbl0Var.v, lbl0Var.w, lbl0Var.x, lbl0Var.y, lbl0Var.z, lbl0Var.A, lbl0Var.B, lbl0Var.C, lbl0Var.D, lbl0Var.E, lbl0Var.F, lbl0Var.G, lbl0Var.H, lbl0Var.I, lbl0Var.J, lbl0Var.K, lbl0Var.L, lbl0Var.M, lbl0Var.N, lbl0Var.O, lbl0Var.P, lbl0Var.Q) : lbl0Var;
    }
}
