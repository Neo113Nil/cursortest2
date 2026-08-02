package com.yandex.messaging.ui.chatlist;

import defpackage.m8t;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.x221;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lx221;", "unreadInfo", "Lm8t;", "lastMessage", "", "<anonymous>", "(Lx221;Lm8t;)Z"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.chatlist.BaseChatItemViewHolder$bind$6", f = "BaseChatItemViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class BaseChatItemViewHolder$bind$6 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseChatItemViewHolder$bind$6(b bVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = bVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        BaseChatItemViewHolder$bind$6 baseChatItemViewHolder$bind$6 = new BaseChatItemViewHolder$bind$6(this.this$0, (Continuation) obj3);
        baseChatItemViewHolder$bind$6.L$0 = (x221) obj;
        baseChatItemViewHolder$bind$6.L$1 = (m8t) obj2;
        return baseChatItemViewHolder$bind$6.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        x221 x221Var = (x221) this.L$0;
        m8t m8tVar = (m8t) this.L$1;
        b bVar = this.this$0;
        int i = b.i0;
        bVar.getClass();
        return Boolean.valueOf(x221Var.c > 0 && m8tVar.e);
    }
}
