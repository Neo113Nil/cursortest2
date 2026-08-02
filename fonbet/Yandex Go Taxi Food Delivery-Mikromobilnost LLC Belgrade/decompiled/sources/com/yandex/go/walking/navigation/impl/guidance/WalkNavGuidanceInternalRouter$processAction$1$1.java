package com.yandex.go.walking.navigation.impl.guidance;

import com.yandex.go.walking.navigation.impl.analytics.WalkingNavigationAnalytics$GuidanceTapType;
import com.yandex.go.walking.navigation.impl.guidance.interactor.FocusAction;
import com.yandex.go.walking.navigation.impl.guidance.interactor.k;
import defpackage.b341;
import defpackage.c341;
import defpackage.d341;
import defpackage.e341;
import defpackage.f341;
import defpackage.g341;
import defpackage.gh00;
import defpackage.h341;
import defpackage.i341;
import defpackage.j341;
import defpackage.jl40;
import defpackage.k341;
import defpackage.l341;
import defpackage.m341;
import defpackage.m950;
import defpackage.mvg;
import defpackage.n341;
import defpackage.ny61;
import defpackage.qu;
import defpackage.sy60;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.x141;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.walking.navigation.impl.guidance.WalkNavGuidanceInternalRouter$processAction$1$1", f = "WalkNavGuidanceInternalRouter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class WalkNavGuidanceInternalRouter$processAction$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ m341 $action;
    final /* synthetic */ boolean $isRouteFinished;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalkNavGuidanceInternalRouter$processAction$1$1(e eVar, m341 m341Var, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$action = m341Var;
        this.$isRouteFinished = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WalkNavGuidanceInternalRouter$processAction$1$1(this.this$0, this.$action, this.$isRouteFinished, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        WalkNavGuidanceInternalRouter$processAction$1$1 walkNavGuidanceInternalRouter$processAction$1$1 = (WalkNavGuidanceInternalRouter$processAction$1$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        walkNavGuidanceInternalRouter$processAction$1$1.invokeSuspend(zy11Var);
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
        e eVar = this.this$0;
        n341 n341Var = eVar.H;
        m341 m341Var = this.$action;
        boolean z = this.$isRouteFinished;
        com.yandex.go.walking.navigation.impl.navigation_core.guidance.b bVar = n341Var.a;
        k kVar = n341Var.b;
        int i = 9;
        if (jl40.l(m341Var, e341.a)) {
            n341Var.a(WalkingNavigationAnalytics$GuidanceTapType.Back);
            if (z) {
                bVar.d();
                eVar.r(new qu(i));
            } else {
                eVar.z((m950) eVar.K.get(), new x141(eVar));
            }
        } else if (jl40.l(m341Var, b341.a)) {
            n341Var.a(z ? WalkingNavigationAnalytics$GuidanceTapType.Finish : WalkingNavigationAnalytics$GuidanceTapType.FinishInProgress);
            bVar.d();
            eVar.r(new qu(i));
        } else if (jl40.l(m341Var, f341.a)) {
            kVar.d();
            ((gh00) kVar.c).w();
        } else if (jl40.l(m341Var, c341.a)) {
            kVar.c(FocusAction.FOCUS_ROUTE);
        } else if (jl40.l(m341Var, d341.a)) {
            kVar.c(FocusAction.FOCUS_USER);
        } else if (jl40.l(m341Var, i341.a)) {
            n341Var.b(1.0f, true);
        } else if (jl40.l(m341Var, k341.a)) {
            n341Var.b(-1.0f, true);
        } else if (jl40.l(m341Var, j341.a)) {
            n341Var.b(0.8f, false);
        } else if (jl40.l(m341Var, l341.a)) {
            n341Var.b(-0.8f, false);
        } else if (jl40.l(m341Var, g341.a)) {
            eVar.z((m950) eVar.L.get(), sy60.Q2);
        } else {
            if (!jl40.l(m341Var, h341.a)) {
                w511.b();
                return null;
            }
            n341Var.a(WalkingNavigationAnalytics$GuidanceTapType.Swiped);
        }
        return zy11.a;
    }
}
