package com.yandex.messaging.internal.view.timeline;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.um1;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.view.timeline.AiBotInteractionsUiDelegate$observeOverlaysToAdjustInteractions$1", f = "AiBotInteractionsUiDelegate.kt", l = {148}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class AiBotInteractionsUiDelegate$observeOverlaysToAdjustInteractions$1 extends SuspendLambda implements wls {
    final /* synthetic */ int $bubbleWidth;
    final /* synthetic */ int $topBlockWidth;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AiBotInteractionsUiDelegate$observeOverlaysToAdjustInteractions$1(a aVar, int i, int i2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$bubbleWidth = i;
        this.$topBlockWidth = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AiBotInteractionsUiDelegate$observeOverlaysToAdjustInteractions$1(this.this$0, this.$bubbleWidth, this.$topBlockWidth, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AiBotInteractionsUiDelegate$observeOverlaysToAdjustInteractions$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            a aVar = this.this$0;
            r0 r0Var = aVar.b.F;
            um1 um1Var = new um1(aVar, this.$bubbleWidth, this.$topBlockWidth, 0);
            this.label = 1;
            if (r0Var.collect(um1Var, this) == coroutineSingletons) {
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
