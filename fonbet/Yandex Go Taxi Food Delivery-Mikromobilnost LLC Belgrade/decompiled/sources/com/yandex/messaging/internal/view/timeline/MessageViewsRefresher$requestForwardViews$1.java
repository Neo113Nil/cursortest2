package com.yandex.messaging.internal.view.timeline;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.view.timeline.MessageViewsRefresher$requestForwardViews$1", f = "MessageViewsRefresher.kt", l = {33}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class MessageViewsRefresher$requestForwardViews$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $forwardOriginalChatId;
    final /* synthetic */ long $forwardTimestamp;
    final /* synthetic */ long $originalTimestamp;
    int label;
    final /* synthetic */ m this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageViewsRefresher$requestForwardViews$1(m mVar, String str, long j, long j2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = mVar;
        this.$forwardOriginalChatId = str;
        this.$forwardTimestamp = j;
        this.$originalTimestamp = j2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MessageViewsRefresher$requestForwardViews$1(this.this$0, this.$forwardOriginalChatId, this.$forwardTimestamp, this.$originalTimestamp, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MessageViewsRefresher$requestForwardViews$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            m mVar = this.this$0;
            String str = this.$forwardOriginalChatId;
            long j = this.$forwardTimestamp;
            long j2 = this.$originalTimestamp;
            this.label = 1;
            if (m.a(mVar, str, j, j2, this) == coroutineSingletons) {
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
