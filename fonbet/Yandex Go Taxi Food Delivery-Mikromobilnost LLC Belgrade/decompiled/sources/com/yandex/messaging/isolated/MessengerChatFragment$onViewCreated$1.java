package com.yandex.messaging.isolated;

import android.content.Context;
import defpackage.h8g;
import defpackage.k0x;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pk3;
import defpackage.q5z;
import defpackage.wls;
import defpackage.x22;
import defpackage.xzw;
import defpackage.z8g;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lk0x;", "viewComponent", "Lzy11;", "<anonymous>", "(Lk0x;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.isolated.MessengerChatFragment$onViewCreated$1", f = "MessengerChatFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class MessengerChatFragment$onViewCreated$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MessengerChatFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessengerChatFragment$onViewCreated$1(MessengerChatFragment messengerChatFragment, Continuation continuation) {
        super(2, continuation);
        this.this$0 = messengerChatFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MessengerChatFragment$onViewCreated$1 messengerChatFragment$onViewCreated$1 = new MessengerChatFragment$onViewCreated$1(this.this$0, continuation);
        messengerChatFragment$onViewCreated$1.L$0 = obj;
        return messengerChatFragment$onViewCreated$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        MessengerChatFragment$onViewCreated$1 messengerChatFragment$onViewCreated$1 = (MessengerChatFragment$onViewCreated$1) create((k0x) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        messengerChatFragment$onViewCreated$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        xzw ui;
        xzw ui2;
        xzw ui3;
        xzw ui4;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        k0x k0xVar = (k0x) this.L$0;
        ui = this.this$0.getUi();
        IsolatedRootLayout isolatedRootLayout = (IsolatedRootLayout) ui.getRoot();
        z8g z8gVar = ((h8g) k0xVar).c.b;
        Context context = z8gVar.a.a;
        q5z.i(context);
        com.yandex.messaging.analytics.a aVar = new com.yandex.messaging.analytics.a(context, (x22) z8gVar.y.get());
        ui2 = this.this$0.getUi();
        isolatedRootLayout.setEventProcessor(aVar.a(ui2.getRoot()));
        ui3 = this.this$0.getUi();
        h8g h8gVar = (h8g) k0xVar;
        ui3.c.a((com.yandex.messaging.ui.timeline.f) h8gVar.C2.get());
        ui4 = this.this$0.getUi();
        ui4.w.a((pk3) h8gVar.V1.get());
        this.this$0.viewComponent = k0xVar;
        return zy11.a;
    }
}
