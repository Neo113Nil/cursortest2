package com.yandex.go.taxi.order.provider.chat;

import defpackage.bms;
import defpackage.h1b;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "unread", "failed", "", "translationEnable", "Lh1b;", "<anonymous>", "(IIZ)Lh1b;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.provider.chat.ChatButtonDelegate$subscribeChat$2", f = "ChatButtonDelegate.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class ChatButtonDelegate$subscribeChat$2 extends SuspendLambda implements bms {
    /* synthetic */ int I$0;
    /* synthetic */ int I$1;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatButtonDelegate$subscribeChat$2(c cVar, Continuation continuation) {
        super(4, continuation);
        this.this$0 = cVar;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        ChatButtonDelegate$subscribeChat$2 chatButtonDelegate$subscribeChat$2 = new ChatButtonDelegate$subscribeChat$2(this.this$0, (Continuation) obj4);
        chatButtonDelegate$subscribeChat$2.I$0 = intValue;
        chatButtonDelegate$subscribeChat$2.I$1 = intValue2;
        chatButtonDelegate$subscribeChat$2.Z$0 = booleanValue;
        return chatButtonDelegate$subscribeChat$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.I$0;
        int i2 = this.I$1;
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.this$0.getClass();
        if (i2 >= 1) {
            i = -1;
        }
        return new h1b(z, i, true);
    }
}
