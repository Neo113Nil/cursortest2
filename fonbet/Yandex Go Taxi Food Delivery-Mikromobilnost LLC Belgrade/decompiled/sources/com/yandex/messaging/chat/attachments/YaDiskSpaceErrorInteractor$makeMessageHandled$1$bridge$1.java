package com.yandex.messaging.chat.attachments;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00070\u0001¢\u0006\u0002\b\u0002*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lcom/yandex/messaging/internal/authorized/chat/b;", "Lkotlin/jvm/internal/EnhancedNullability;", "<anonymous>", "(Ltse;)Lcom/yandex/messaging/internal/authorized/chat/b;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.chat.attachments.YaDiskSpaceErrorInteractor$makeMessageHandled$1$bridge$1", f = "YaDiskSpaceErrorInteractor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class YaDiskSpaceErrorInteractor$makeMessageHandled$1$bridge$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YaDiskSpaceErrorInteractor$makeMessageHandled$1$bridge$1(d dVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new YaDiskSpaceErrorInteractor$makeMessageHandled$1$bridge$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((YaDiskSpaceErrorInteractor$makeMessageHandled$1$bridge$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return this.this$0.a.get();
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
