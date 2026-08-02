package com.yandex.messaging.ui.timeline;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\"\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0010\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u00010\u0000j\u0002`\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "Lcom/yandex/messaging/domain/personal/mentions/Mentions;", "mentions", "Lzy11;", "<anonymous>", "(Ljava/util/Set;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.timeline.TimelineFloatingButtonController$onCreate$2", f = "TimelineFloatingButtonController.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class TimelineFloatingButtonController$onCreate$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimelineFloatingButtonController$onCreate$2(d dVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TimelineFloatingButtonController$onCreate$2 timelineFloatingButtonController$onCreate$2 = new TimelineFloatingButtonController$onCreate$2(this.this$0, continuation);
        timelineFloatingButtonController$onCreate$2.L$0 = obj;
        return timelineFloatingButtonController$onCreate$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        TimelineFloatingButtonController$onCreate$2 timelineFloatingButtonController$onCreate$2 = (TimelineFloatingButtonController$onCreate$2) create((Set) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        timelineFloatingButtonController$onCreate$2.invokeSuspend(zy11Var);
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
        Set set = (Set) this.L$0;
        boolean isEmpty = set.isEmpty();
        d dVar = this.this$0;
        if (isEmpty) {
            dVar.H = -1L;
            dVar.F.hide();
        } else {
            dVar.H = ((Number) kotlin.collections.a.O(set)).longValue();
            this.this$0.F.show();
        }
        return zy11.a;
    }
}
