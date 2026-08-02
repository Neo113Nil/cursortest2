package com.yandex.go.ai_widget.ui.component;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.yur;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.ai_widget.ui.component.AiWidgetEvaluationSwipeableCardKt$AiWidgetEvaluationSwipeableCard$1$1", f = "AiWidgetEvaluationSwipeableCard.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class AiWidgetEvaluationSwipeableCardKt$AiWidgetEvaluationSwipeableCard$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ int $focusRequestId;
    final /* synthetic */ yur $focusRequester;
    final /* synthetic */ boolean $isTop;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AiWidgetEvaluationSwipeableCardKt$AiWidgetEvaluationSwipeableCard$1$1(boolean z, int i, yur yurVar, Continuation continuation) {
        super(2, continuation);
        this.$isTop = z;
        this.$focusRequestId = i;
        this.$focusRequester = yurVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AiWidgetEvaluationSwipeableCardKt$AiWidgetEvaluationSwipeableCard$1$1(this.$isTop, this.$focusRequestId, this.$focusRequester, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        AiWidgetEvaluationSwipeableCardKt$AiWidgetEvaluationSwipeableCard$1$1 aiWidgetEvaluationSwipeableCardKt$AiWidgetEvaluationSwipeableCard$1$1 = (AiWidgetEvaluationSwipeableCardKt$AiWidgetEvaluationSwipeableCard$1$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        aiWidgetEvaluationSwipeableCardKt$AiWidgetEvaluationSwipeableCard$1$1.invokeSuspend(zy11Var);
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
        if (this.$isTop && this.$focusRequestId > 0) {
            yur.b(this.$focusRequester);
        }
        return zy11.a;
    }
}
