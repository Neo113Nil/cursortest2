package com.yandex.go.walking.navigation.impl.guidance.exit_options;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.rz20;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.walking.navigation.impl.guidance.exit_options.WalkNavGuidanceExitOptionsModalScreenKt$WalkNavGuidanceExitOptionsModalScreen$1$1$1", f = "WalkNavGuidanceExitOptionsModalScreen.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes11.dex */
final class WalkNavGuidanceExitOptionsModalScreenKt$WalkNavGuidanceExitOptionsModalScreen$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ rz20 $modalState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalkNavGuidanceExitOptionsModalScreenKt$WalkNavGuidanceExitOptionsModalScreen$1$1$1(rz20 rz20Var, Continuation continuation) {
        super(2, continuation);
        this.$modalState = rz20Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WalkNavGuidanceExitOptionsModalScreenKt$WalkNavGuidanceExitOptionsModalScreen$1$1$1(this.$modalState, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        WalkNavGuidanceExitOptionsModalScreenKt$WalkNavGuidanceExitOptionsModalScreen$1$1$1 walkNavGuidanceExitOptionsModalScreenKt$WalkNavGuidanceExitOptionsModalScreen$1$1$1 = (WalkNavGuidanceExitOptionsModalScreenKt$WalkNavGuidanceExitOptionsModalScreen$1$1$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        walkNavGuidanceExitOptionsModalScreenKt$WalkNavGuidanceExitOptionsModalScreen$1$1$1.invokeSuspend(zy11Var);
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
        this.$modalState.a.b(Boolean.TRUE);
        return zy11.a;
    }
}
