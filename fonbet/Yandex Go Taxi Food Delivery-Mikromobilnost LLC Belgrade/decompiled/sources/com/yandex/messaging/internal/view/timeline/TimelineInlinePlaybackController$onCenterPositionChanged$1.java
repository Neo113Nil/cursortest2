package com.yandex.messaging.internal.view.timeline;

import defpackage.kgx;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pbz0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.view.timeline.TimelineInlinePlaybackController$onCenterPositionChanged$1", f = "TimelineInlinePlaybackController.kt", l = {37}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class TimelineInlinePlaybackController$onCenterPositionChanged$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ pbz0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimelineInlinePlaybackController$onCenterPositionChanged$1(pbz0 pbz0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = pbz0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TimelineInlinePlaybackController$onCenterPositionChanged$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TimelineInlinePlaybackController$onCenterPositionChanged$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            this.label = 1;
            if (kotlinx.coroutines.a.i(300L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        pbz0 pbz0Var = this.this$0;
        kgx[] kgxVarArr = pbz0.e;
        pbz0Var.getClass();
        pbz0 pbz0Var2 = this.this$0;
        int intValue = ((Number) pbz0Var2.b.invoke()).intValue();
        if (intValue != -1) {
            pbz0Var2.a.findViewHolderForLayoutPosition(intValue);
        }
        return zy11.a;
    }
}
