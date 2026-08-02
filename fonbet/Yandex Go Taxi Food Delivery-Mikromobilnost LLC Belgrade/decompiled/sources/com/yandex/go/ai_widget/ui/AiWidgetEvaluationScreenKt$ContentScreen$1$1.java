package com.yandex.go.ai_widget.ui;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.oz40;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.ai_widget.ui.AiWidgetEvaluationScreenKt$ContentScreen$1$1", f = "AiWidgetEvaluationScreen.kt", l = {196}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class AiWidgetEvaluationScreenKt$ContentScreen$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $isStackCompleted;
    final /* synthetic */ oz40 $showCompletionContent$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AiWidgetEvaluationScreenKt$ContentScreen$1$1(boolean z, oz40 oz40Var, Continuation continuation) {
        super(2, continuation);
        this.$isStackCompleted = z;
        this.$showCompletionContent$delegate = oz40Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AiWidgetEvaluationScreenKt$ContentScreen$1$1(this.$isStackCompleted, this.$showCompletionContent$delegate, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AiWidgetEvaluationScreenKt$ContentScreen$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            if (!this.$isStackCompleted) {
                this.$showCompletionContent$delegate.setValue(Boolean.FALSE);
                return zy11.a;
            }
            this.label = 1;
            if (kotlinx.coroutines.a.i(400L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        this.$showCompletionContent$delegate.setValue(Boolean.TRUE);
        return zy11.a;
    }
}
