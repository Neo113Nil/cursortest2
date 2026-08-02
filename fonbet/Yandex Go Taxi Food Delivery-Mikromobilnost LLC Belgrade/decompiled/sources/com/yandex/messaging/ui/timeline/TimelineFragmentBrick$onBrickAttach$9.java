package com.yandex.messaging.ui.timeline;

import defpackage.e920;
import defpackage.kju0;
import defpackage.mvg;
import defpackage.nh20;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Le920;", kju0.j, "Lzy11;", "<anonymous>", "(Le920;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.timeline.TimelineFragmentBrick$onBrickAttach$9", f = "TimelineFragmentBrick.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class TimelineFragmentBrick$onBrickAttach$9 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimelineFragmentBrick$onBrickAttach$9(f fVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TimelineFragmentBrick$onBrickAttach$9 timelineFragmentBrick$onBrickAttach$9 = new TimelineFragmentBrick$onBrickAttach$9(this.this$0, continuation);
        timelineFragmentBrick$onBrickAttach$9.L$0 = obj;
        return timelineFragmentBrick$onBrickAttach$9;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        TimelineFragmentBrick$onBrickAttach$9 timelineFragmentBrick$onBrickAttach$9 = (TimelineFragmentBrick$onBrickAttach$9) create((e920) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        timelineFragmentBrick$onBrickAttach$9.invokeSuspend(zy11Var);
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
        e920 e920Var = (e920) this.L$0;
        f fVar = this.this$0;
        if (e920Var != null) {
            nh20 nh20Var = fVar.d0;
            if (nh20Var != null) {
                nh20Var.dismiss();
            }
            f fVar2 = this.this$0;
            nh20 nh20Var2 = e920Var.b ? fVar2.P : fVar2.Q;
            fVar2.d0 = nh20Var2;
            if (nh20Var2 != null) {
                nh20Var2.c(e920Var.a);
            }
        } else {
            nh20 nh20Var3 = fVar.d0;
            if (nh20Var3 != null && nh20Var3.isShowing()) {
                this.this$0.U.c("csat_cancel", CRLReasonCodeExtension.REASON, "null miniappUrl");
            }
            nh20 nh20Var4 = this.this$0.d0;
            if (nh20Var4 != null) {
                nh20Var4.dismiss();
            }
            this.this$0.d0 = null;
        }
        return zy11.a;
    }
}
