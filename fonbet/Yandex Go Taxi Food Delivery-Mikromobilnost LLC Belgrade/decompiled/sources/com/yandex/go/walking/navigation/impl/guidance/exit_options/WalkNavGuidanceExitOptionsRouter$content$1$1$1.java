package com.yandex.go.walking.navigation.impl.guidance.exit_options;

import com.yandex.go.walking.navigation.impl.analytics.WalkingNavigationAnalytics$ExitOptionsTapType;
import defpackage.a201;
import defpackage.jl40;
import defpackage.ke31;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qu;
import defpackage.r141;
import defpackage.s141;
import defpackage.t141;
import defpackage.tse;
import defpackage.u141;
import defpackage.v141;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.walking.navigation.impl.guidance.exit_options.WalkNavGuidanceExitOptionsRouter$content$1$1$1", f = "WalkNavGuidanceExitOptionsRouter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class WalkNavGuidanceExitOptionsRouter$content$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ v141 $action;
    int label;
    final /* synthetic */ r141 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalkNavGuidanceExitOptionsRouter$content$1$1$1(r141 r141Var, v141 v141Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = r141Var;
        this.$action = v141Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WalkNavGuidanceExitOptionsRouter$content$1$1$1(this.this$0, this.$action, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        WalkNavGuidanceExitOptionsRouter$content$1$1$1 walkNavGuidanceExitOptionsRouter$content$1$1$1 = (WalkNavGuidanceExitOptionsRouter$content$1$1$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        walkNavGuidanceExitOptionsRouter$content$1$1$1.invokeSuspend(zy11Var);
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
        r141 r141Var = this.this$0;
        a201 a201Var = r141Var.H;
        v141 v141Var = this.$action;
        a201Var.getClass();
        if (jl40.l(v141Var, t141.a)) {
            a201Var.v(WalkingNavigationAnalytics$ExitOptionsTapType.ContinueBackground);
            r141Var.r(new ke31(26));
        } else if (jl40.l(v141Var, s141.a)) {
            a201Var.v(WalkingNavigationAnalytics$ExitOptionsTapType.FinishInProgress);
            r141Var.r(new ke31(27));
        } else {
            if (!jl40.l(v141Var, u141.a)) {
                w511.b();
                return null;
            }
            a201Var.v(WalkingNavigationAnalytics$ExitOptionsTapType.GrayZone);
            r141Var.r(new qu(9));
        }
        return zy11.a;
    }
}
