package com.yandex.messaging.internal.authorized.chat.notifications;

import defpackage.l8x;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.authorized.chat.notifications.ChatNotificationPublisher$waitRequestsWithThrottle$1", f = "ChatNotificationPublisher.kt", l = {211, 215}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ChatNotificationPublisher$waitRequestsWithThrottle$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatNotificationPublisher$waitRequestsWithThrottle$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChatNotificationPublisher$waitRequestsWithThrottle$1 chatNotificationPublisher$waitRequestsWithThrottle$1 = new ChatNotificationPublisher$waitRequestsWithThrottle$1(this.this$0, continuation);
        chatNotificationPublisher$waitRequestsWithThrottle$1.L$0 = obj;
        return chatNotificationPublisher$waitRequestsWithThrottle$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChatNotificationPublisher$waitRequestsWithThrottle$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        if (r7.j(r6) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003c, code lost:
    
        if (r7 == r0) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [l8x] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        pzt0 pzt0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            pzt0 N = tje.N((tse) this.L$0, null, null, new ChatNotificationPublisher$waitRequestsWithThrottle$1$waitJob$1(2, null), 3);
            this.this$0.D = N;
            this.L$0 = N;
            this.label = 1;
            Object u0 = N.u0(this);
            pzt0Var = N;
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ?? r1 = (l8x) this.L$0;
            kotlin.b.b(obj);
            pzt0Var = r1;
        }
        this.this$0.D = null;
        if (!pzt0Var.isCancelled()) {
            a aVar = this.this$0;
            this.L$0 = null;
            this.label = 2;
        }
        return zy11.a;
    }
}
