package com.yandex.messaging.ui.calllist.info;

import com.yandex.messaging.domain.statuses.StatusAvailability;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sh7;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0016\u0010\u0004\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/yandex/messaging/domain/statuses/StatusAvailability;", "statusAvailability", "Lkotlin/Pair;", "", "<destruct>", "Lsh7;", "<anonymous>", "(Lcom/yandex/messaging/domain/statuses/StatusAvailability;Lkotlin/Pair;)Lsh7;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.calllist.info.CallHistoryInfoViewModel$state$1", f = "CallHistoryInfoViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class CallHistoryInfoViewModel$state$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallHistoryInfoViewModel$state$1(c cVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = cVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        CallHistoryInfoViewModel$state$1 callHistoryInfoViewModel$state$1 = new CallHistoryInfoViewModel$state$1(this.this$0, (Continuation) obj3);
        callHistoryInfoViewModel$state$1.L$0 = (StatusAvailability) obj;
        callHistoryInfoViewModel$state$1.L$1 = (Pair) obj2;
        return callHistoryInfoViewModel$state$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        StatusAvailability statusAvailability = (StatusAvailability) this.L$0;
        Pair pair = (Pair) this.L$1;
        return new sh7(((Boolean) this.this$0.y.getValue()).booleanValue(), statusAvailability, (String) pair.getFirst(), (String) pair.getSecond());
    }
}
