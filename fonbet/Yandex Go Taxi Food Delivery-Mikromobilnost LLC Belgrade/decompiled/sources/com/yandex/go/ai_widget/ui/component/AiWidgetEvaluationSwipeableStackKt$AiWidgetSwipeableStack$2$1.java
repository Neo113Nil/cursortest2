package com.yandex.go.ai_widget.ui.component;

import defpackage.co1;
import defpackage.do1;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.ai_widget.ui.component.AiWidgetEvaluationSwipeableStackKt$AiWidgetSwipeableStack$2$1", f = "AiWidgetEvaluationSwipeableStack.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class AiWidgetEvaluationSwipeableStackKt$AiWidgetSwipeableStack$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ do1 $currentCard;
    final /* synthetic */ b $swipeState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AiWidgetEvaluationSwipeableStackKt$AiWidgetSwipeableStack$2$1(b bVar, do1 do1Var, Continuation continuation) {
        super(2, continuation);
        this.$swipeState = bVar;
        this.$currentCard = do1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AiWidgetEvaluationSwipeableStackKt$AiWidgetSwipeableStack$2$1(this.$swipeState, this.$currentCard, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        AiWidgetEvaluationSwipeableStackKt$AiWidgetSwipeableStack$2$1 aiWidgetEvaluationSwipeableStackKt$AiWidgetSwipeableStack$2$1 = (AiWidgetEvaluationSwipeableStackKt$AiWidgetSwipeableStack$2$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        aiWidgetEvaluationSwipeableStackKt$AiWidgetSwipeableStack$2$1.invokeSuspend(zy11Var);
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
        b bVar = this.$swipeState;
        do1 do1Var = this.$currentCard;
        bVar.k.setValue(do1Var instanceof co1 ? ((co1) do1Var).g : null);
        return zy11.a;
    }
}
