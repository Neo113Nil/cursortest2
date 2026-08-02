package com.yandex.messaging.internal.view.timeline;

import com.yandex.messaging.internal.ServerMessageRef;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.view.timeline.ChatTimelineViewController$messageSwipeController$1$checkThreadExistingForMessage$1", f = "ChatTimelineViewController.kt", l = {229}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ChatTimelineViewController$messageSwipeController$1$checkThreadExistingForMessage$1 extends SuspendLambda implements wls {
    final /* synthetic */ Ref$BooleanRef $check;
    final /* synthetic */ ServerMessageRef $messageRef;
    Object L$0;
    int label;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatTimelineViewController$messageSwipeController$1$checkThreadExistingForMessage$1(Ref$BooleanRef ref$BooleanRef, i iVar, ServerMessageRef serverMessageRef, Continuation continuation) {
        super(2, continuation);
        this.$check = ref$BooleanRef;
        this.this$0 = iVar;
        this.$messageRef = serverMessageRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChatTimelineViewController$messageSwipeController$1$checkThreadExistingForMessage$1(this.$check, this.this$0, this.$messageRef, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChatTimelineViewController$messageSwipeController$1$checkThreadExistingForMessage$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Ref$BooleanRef ref$BooleanRef;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Ref$BooleanRef ref$BooleanRef2 = this.$check;
            i iVar = this.this$0;
            ServerMessageRef serverMessageRef = this.$messageRef;
            this.L$0 = ref$BooleanRef2;
            this.label = 1;
            Object q = i.q(iVar, serverMessageRef, this);
            if (q == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj = q;
            ref$BooleanRef = ref$BooleanRef2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ref$BooleanRef = (Ref$BooleanRef) this.L$0;
            kotlin.b.b(obj);
        }
        ref$BooleanRef.element = ((Boolean) obj).booleanValue();
        return zy11.a;
    }
}
