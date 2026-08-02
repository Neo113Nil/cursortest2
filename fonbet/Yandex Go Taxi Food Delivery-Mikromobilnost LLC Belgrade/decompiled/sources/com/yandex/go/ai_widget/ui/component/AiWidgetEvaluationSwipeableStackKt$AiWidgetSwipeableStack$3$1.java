package com.yandex.go.ai_widget.ui.component;

import defpackage.do1;
import defpackage.jo0;
import defpackage.m3u0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oz40;
import defpackage.rb0;
import defpackage.tse;
import defpackage.wls;
import defpackage.yx40;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.ai_widget.ui.component.AiWidgetEvaluationSwipeableStackKt$AiWidgetSwipeableStack$3$1", f = "AiWidgetEvaluationSwipeableStack.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class AiWidgetEvaluationSwipeableStackKt$AiWidgetSwipeableStack$3$1 extends SuspendLambda implements wls {
    final /* synthetic */ yx40 $currentIndex$delegate;
    final /* synthetic */ m3u0 $currentOnStackCompleted$delegate;
    final /* synthetic */ m3u0 $currentOnSwiped$delegate;
    final /* synthetic */ oz40 $exitingCard$delegate;
    final /* synthetic */ List<do1> $items;
    final /* synthetic */ b $swipeState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AiWidgetEvaluationSwipeableStackKt$AiWidgetSwipeableStack$3$1(b bVar, List list, yx40 yx40Var, oz40 oz40Var, m3u0 m3u0Var, m3u0 m3u0Var2, Continuation continuation) {
        super(2, continuation);
        this.$swipeState = bVar;
        this.$items = list;
        this.$currentIndex$delegate = yx40Var;
        this.$exitingCard$delegate = oz40Var;
        this.$currentOnSwiped$delegate = m3u0Var;
        this.$currentOnStackCompleted$delegate = m3u0Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AiWidgetEvaluationSwipeableStackKt$AiWidgetSwipeableStack$3$1(this.$swipeState, this.$items, this.$currentIndex$delegate, this.$exitingCard$delegate, this.$currentOnSwiped$delegate, this.$currentOnStackCompleted$delegate, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        AiWidgetEvaluationSwipeableStackKt$AiWidgetSwipeableStack$3$1 aiWidgetEvaluationSwipeableStackKt$AiWidgetSwipeableStack$3$1 = (AiWidgetEvaluationSwipeableStackKt$AiWidgetSwipeableStack$3$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        aiWidgetEvaluationSwipeableStackKt$AiWidgetSwipeableStack$3$1.invokeSuspend(zy11Var);
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
        List<do1> list = this.$items;
        yx40 yx40Var = this.$currentIndex$delegate;
        oz40 oz40Var = this.$exitingCard$delegate;
        bVar.p = new rb0(list, yx40Var, oz40Var, this.$currentOnSwiped$delegate, 4);
        bVar.q = new jo0(list, oz40Var, yx40Var, this.$currentOnStackCompleted$delegate, 2);
        return zy11.a;
    }
}
