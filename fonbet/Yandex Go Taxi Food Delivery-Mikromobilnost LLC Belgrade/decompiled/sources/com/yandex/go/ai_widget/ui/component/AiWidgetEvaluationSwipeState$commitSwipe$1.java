package com.yandex.go.ai_widget.ui.component;

import com.yandex.go.ai_widget.data.model.AiWidgetEvaluationSwipeDirection;
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
@mvg(c = "com.yandex.go.ai_widget.ui.component.AiWidgetEvaluationSwipeState$commitSwipe$1", f = "AiWidgetEvaluationSwipeState.kt", l = {205}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class AiWidgetEvaluationSwipeState$commitSwipe$1 extends SuspendLambda implements wls {
    final /* synthetic */ AiWidgetEvaluationSwipeDirection $direction;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AiWidgetEvaluationSwipeState$commitSwipe$1(b bVar, AiWidgetEvaluationSwipeDirection aiWidgetEvaluationSwipeDirection, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$direction = aiWidgetEvaluationSwipeDirection;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AiWidgetEvaluationSwipeState$commitSwipe$1(this.this$0, this.$direction, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AiWidgetEvaluationSwipeState$commitSwipe$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar = this.this$0;
            AiWidgetEvaluationSwipeDirection aiWidgetEvaluationSwipeDirection = this.$direction;
            this.label = 1;
            if (b.a(bVar, aiWidgetEvaluationSwipeDirection, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
