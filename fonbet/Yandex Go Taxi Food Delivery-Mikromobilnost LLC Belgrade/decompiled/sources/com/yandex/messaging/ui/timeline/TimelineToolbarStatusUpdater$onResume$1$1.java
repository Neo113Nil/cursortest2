package com.yandex.messaging.ui.timeline;

import com.yandex.messaging.domain.user.DeletedShownStatus;
import defpackage.edz0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.r0k;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr0k;", ACSPConstants.STATUS, "Lcom/yandex/messaging/domain/user/DeletedShownStatus;", "deletedStatus", "Lzy11;", "<anonymous>", "(Lr0k;Lcom/yandex/messaging/domain/user/DeletedShownStatus;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.timeline.TimelineToolbarStatusUpdater$onResume$1$1", f = "TimelineToolbarStatusUpdater.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class TimelineToolbarStatusUpdater$onResume$1$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ edz0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimelineToolbarStatusUpdater$onResume$1$1(edz0 edz0Var, Continuation continuation) {
        super(3, continuation);
        this.this$0 = edz0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        TimelineToolbarStatusUpdater$onResume$1$1 timelineToolbarStatusUpdater$onResume$1$1 = new TimelineToolbarStatusUpdater$onResume$1$1(this.this$0, (Continuation) obj3);
        timelineToolbarStatusUpdater$onResume$1$1.L$0 = (r0k) obj;
        timelineToolbarStatusUpdater$onResume$1$1.L$1 = (DeletedShownStatus) obj2;
        zy11 zy11Var = zy11.a;
        timelineToolbarStatusUpdater$onResume$1$1.invokeSuspend(zy11Var);
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
        edz0.a(this.this$0, (r0k) this.L$0, (DeletedShownStatus) this.L$1);
        return zy11.a;
    }
}
