package com.yandex.go.taxi.order.bubble;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.uxu0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.bubble.StyledOrderBubbleViewHolder$loadPinAndCollapsedIcon$2$asyncPinIcon$1", f = "StyledOrderBubbleViewHolder.kt", l = {142}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class StyledOrderBubbleViewHolder$loadPinAndCollapsedIcon$2$asyncPinIcon$1 extends SuspendLambda implements wls {
    final /* synthetic */ uxu0 $icon;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StyledOrderBubbleViewHolder$loadPinAndCollapsedIcon$2$asyncPinIcon$1(uxu0 uxu0Var, g gVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
        this.$icon = uxu0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new StyledOrderBubbleViewHolder$loadPinAndCollapsedIcon$2$asyncPinIcon$1(this.$icon, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((StyledOrderBubbleViewHolder$loadPinAndCollapsedIcon$2$asyncPinIcon$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            g gVar = this.this$0;
            uxu0 uxu0Var = this.$icon;
            this.label = 1;
            if (g.c(gVar, uxu0Var, this) == coroutineSingletons) {
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
