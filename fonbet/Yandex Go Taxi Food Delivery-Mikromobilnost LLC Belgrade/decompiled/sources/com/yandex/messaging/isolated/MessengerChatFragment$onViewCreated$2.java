package com.yandex.messaging.isolated;

import defpackage.h8g;
import defpackage.k0x;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.internal.g;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.isolated.MessengerChatFragment$onViewCreated$2", f = "MessengerChatFragment.kt", l = {HProv.ALG_SID_GR3410_12_256}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class MessengerChatFragment$onViewCreated$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ MessengerChatFragment this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lk0x;", "it", "Lzy11;", "<anonymous>", "(Lk0x;)V"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "com.yandex.messaging.isolated.MessengerChatFragment$onViewCreated$2$1", f = "MessengerChatFragment.kt", l = {72}, m = "invokeSuspend")
    /* renamed from: com.yandex.messaging.isolated.MessengerChatFragment$onViewCreated$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        /* synthetic */ Object L$0;
        int label;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(2, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((k0x) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            zy11 zy11Var = zy11.a;
            if (i != 0) {
                if (i == 1) {
                    kotlin.b.b(obj);
                    return zy11Var;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            com.yandex.messaging.domain.botrequest.d dVar = (com.yandex.messaging.domain.botrequest.d) ((h8g) ((k0x) this.L$0)).F2.get();
            this.label = 1;
            dVar.getClass();
            return dVar.a(this) == coroutineSingletons ? coroutineSingletons : zy11Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessengerChatFragment$onViewCreated$2(MessengerChatFragment messengerChatFragment, Continuation continuation) {
        super(2, continuation);
        this.this$0 = messengerChatFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MessengerChatFragment$onViewCreated$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MessengerChatFragment$onViewCreated$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tpr componentFlow;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            componentFlow = this.this$0.componentFlow();
            g I = kotlinx.coroutines.flow.e.I(componentFlow, new AnonymousClass1(2, null));
            this.label = 1;
            if (kotlinx.coroutines.flow.e.j(I, this) == coroutineSingletons) {
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
