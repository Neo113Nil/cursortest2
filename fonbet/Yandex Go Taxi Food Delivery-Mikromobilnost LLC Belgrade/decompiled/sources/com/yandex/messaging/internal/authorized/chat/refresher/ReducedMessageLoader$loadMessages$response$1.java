package com.yandex.messaging.internal.authorized.chat.refresher;

import com.yandex.messaging.core.net.entities.proto.HistoryRequest;
import defpackage.g6u;
import defpackage.mvg;
import defpackage.n5t0;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/messaging/core/net/entities/proto/ReducedHistoryResponse;", "<anonymous>", "(Ltse;)Lcom/yandex/messaging/core/net/entities/proto/ReducedHistoryResponse;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.authorized.chat.refresher.ReducedMessageLoader$loadMessages$response$1", f = "ReducedMessageLoader.kt", l = {34}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ReducedMessageLoader$loadMessages$response$1 extends SuspendLambda implements wls {
    final /* synthetic */ HistoryRequest $request;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReducedMessageLoader$loadMessages$response$1(HistoryRequest historyRequest, c cVar, Continuation continuation) {
        super(2, continuation);
        this.$request = historyRequest;
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReducedMessageLoader$loadMessages$response$1(this.$request, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ReducedMessageLoader$loadMessages$response$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        HistoryRequest historyRequest = this.$request;
        c cVar = this.this$0;
        n5t0 n5t0Var = cVar.b;
        g6u g6uVar = cVar.c.e;
        this.label = 1;
        Object b = com.yandex.messaging.internal.suspend.extensions.b.b(historyRequest, n5t0Var, g6uVar, this);
        return b == coroutineSingletons ? coroutineSingletons : b;
    }
}
