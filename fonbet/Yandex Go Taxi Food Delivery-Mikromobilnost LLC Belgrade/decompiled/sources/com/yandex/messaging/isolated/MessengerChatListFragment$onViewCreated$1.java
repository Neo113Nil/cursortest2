package com.yandex.messaging.isolated;

import defpackage.e8g;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pk3;
import defpackage.szw;
import defpackage.wls;
import defpackage.xzw;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lszw;", "viewComponent", "Lzy11;", "<anonymous>", "(Lszw;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.isolated.MessengerChatListFragment$onViewCreated$1", f = "MessengerChatListFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class MessengerChatListFragment$onViewCreated$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MessengerChatListFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessengerChatListFragment$onViewCreated$1(MessengerChatListFragment messengerChatListFragment, Continuation continuation) {
        super(2, continuation);
        this.this$0 = messengerChatListFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MessengerChatListFragment$onViewCreated$1 messengerChatListFragment$onViewCreated$1 = new MessengerChatListFragment$onViewCreated$1(this.this$0, continuation);
        messengerChatListFragment$onViewCreated$1.L$0 = obj;
        return messengerChatListFragment$onViewCreated$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        MessengerChatListFragment$onViewCreated$1 messengerChatListFragment$onViewCreated$1 = (MessengerChatListFragment$onViewCreated$1) create((szw) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        messengerChatListFragment$onViewCreated$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        xzw ui;
        xzw ui2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        szw szwVar = (szw) this.L$0;
        ui = this.this$0.getUi();
        ui.c.a((c) ((e8g) szwVar).r.get());
        ui2 = this.this$0.getUi();
        ui2.w.a((pk3) ((e8g) szwVar).k.get());
        this.this$0.viewComponent = szwVar;
        return zy11.a;
    }
}
