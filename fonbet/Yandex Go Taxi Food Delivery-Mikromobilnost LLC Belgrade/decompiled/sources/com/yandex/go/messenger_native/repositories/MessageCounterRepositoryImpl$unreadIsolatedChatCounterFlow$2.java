package com.yandex.go.messenger_native.repositories;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.messenger_native.repositories.MessageCounterRepositoryImpl$unreadIsolatedChatCounterFlow$2", f = "MessageCounterRepositoryImpl.kt", l = {32}, m = "invokeSuspend", v = 2)
/* loaded from: classes15.dex */
final class MessageCounterRepositoryImpl$unreadIsolatedChatCounterFlow$2 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MessageCounterRepositoryImpl$unreadIsolatedChatCounterFlow$2 messageCounterRepositoryImpl$unreadIsolatedChatCounterFlow$2 = new MessageCounterRepositoryImpl$unreadIsolatedChatCounterFlow$2(2, continuation);
        messageCounterRepositoryImpl$unreadIsolatedChatCounterFlow$2.L$0 = obj;
        return messageCounterRepositoryImpl$unreadIsolatedChatCounterFlow$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MessageCounterRepositoryImpl$unreadIsolatedChatCounterFlow$2) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Integer num = new Integer(0);
            this.L$0 = null;
            this.label = 1;
            if (vprVar.emit(num, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
