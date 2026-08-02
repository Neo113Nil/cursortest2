package com.yandex.messaging.ui.timeline;

import com.yandex.messaging.views.BadgedFloatingActionButton;
import defpackage.ewh0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oyh0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "count", "Lzy11;", "<anonymous>", "(I)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.timeline.TimelineFloatingButtonController$onCreate$1", f = "TimelineFloatingButtonController.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class TimelineFloatingButtonController$onCreate$1 extends SuspendLambda implements wls {
    /* synthetic */ int I$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimelineFloatingButtonController$onCreate$1(d dVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TimelineFloatingButtonController$onCreate$1 timelineFloatingButtonController$onCreate$1 = new TimelineFloatingButtonController$onCreate$1(this.this$0, continuation);
        timelineFloatingButtonController$onCreate$1.I$0 = ((Number) obj).intValue();
        return timelineFloatingButtonController$onCreate$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        TimelineFloatingButtonController$onCreate$1 timelineFloatingButtonController$onCreate$1 = (TimelineFloatingButtonController$onCreate$1) create(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        timelineFloatingButtonController$onCreate$1.invokeSuspend(zy11Var);
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
        int i = this.I$0;
        this.this$0.E.setUnreadCount(i);
        BadgedFloatingActionButton badgedFloatingActionButton = this.this$0.E;
        badgedFloatingActionButton.setContentDescription(i > 0 ? badgedFloatingActionButton.getContext().getResources().getQuantityString(ewh0.scroll_to_bottom_with_unread_content_desc, i, new Integer(i)) : badgedFloatingActionButton.getContext().getString(oyh0.scroll_to_bottom_content_desc));
        return zy11.a;
    }
}
