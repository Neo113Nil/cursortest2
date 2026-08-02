package com.yandex.messaging.input;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lzy11;", "<anonymous>", "(J)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.input.TimelineSendMessageFacade$1", f = "SendMessageFacade.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class TimelineSendMessageFacade$1 extends SuspendLambda implements wls {
    /* synthetic */ long J$0;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimelineSendMessageFacade$1(g gVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TimelineSendMessageFacade$1 timelineSendMessageFacade$1 = new TimelineSendMessageFacade$1(this.this$0, continuation);
        timelineSendMessageFacade$1.J$0 = ((Number) obj).longValue();
        return timelineSendMessageFacade$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        TimelineSendMessageFacade$1 timelineSendMessageFacade$1 = (TimelineSendMessageFacade$1) create(Long.valueOf(((Number) obj).longValue()), (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        timelineSendMessageFacade$1.invokeSuspend(zy11Var);
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
        this.this$0.o = this.J$0;
        return zy11.a;
    }
}
