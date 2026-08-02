package com.yandex.messaging.ui.calllist;

import com.yandex.messaging.domain.statuses.StatusAvailability;
import com.yandex.messaging.telemost.domain.entities.CallHistoryData;
import defpackage.d2b;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vh7;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ld2b;", "chatDisplayData", "Lcom/yandex/messaging/domain/statuses/StatusAvailability;", "statusAvailability", "Lvh7;", "<anonymous>", "(Ld2b;Lcom/yandex/messaging/domain/statuses/StatusAvailability;)Lvh7;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.calllist.CallListViewModel$createItemDataFlow$1", f = "CallListViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class CallListViewModel$createItemDataFlow$1 extends SuspendLambda implements zls {
    final /* synthetic */ vh7 $call;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallListViewModel$createItemDataFlow$1(vh7 vh7Var, Continuation continuation) {
        super(3, continuation);
        this.$call = vh7Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        CallListViewModel$createItemDataFlow$1 callListViewModel$createItemDataFlow$1 = new CallListViewModel$createItemDataFlow$1(this.$call, (Continuation) obj3);
        callListViewModel$createItemDataFlow$1.L$0 = (d2b) obj;
        callListViewModel$createItemDataFlow$1.L$1 = (StatusAvailability) obj2;
        return callListViewModel$createItemDataFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        d2b d2bVar = (d2b) this.L$0;
        StatusAvailability statusAvailability = (StatusAvailability) this.L$1;
        vh7 vh7Var = this.$call;
        CallHistoryData callHistoryData = vh7Var.c;
        vh7Var.getClass();
        return new vh7(d2bVar, statusAvailability, callHistoryData);
    }
}
