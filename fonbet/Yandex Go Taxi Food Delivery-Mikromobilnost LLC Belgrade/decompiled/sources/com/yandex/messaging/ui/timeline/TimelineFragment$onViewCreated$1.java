package com.yandex.messaging.ui.timeline;

import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.timeline.TimelineFragment$onViewCreated$1", f = "TimelineFragment.kt", l = {43, 43}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class TimelineFragment$onViewCreated$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ TimelineFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimelineFragment$onViewCreated$1(TimelineFragment timelineFragment, Continuation continuation) {
        super(2, continuation);
        this.this$0 = timelineFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TimelineFragment$onViewCreated$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TimelineFragment$onViewCreated$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        noh nohVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            nohVar = this.this$0.component;
            this.label = 1;
            obj = nohVar.k(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        throw oyr.d(obj);
    }
}
