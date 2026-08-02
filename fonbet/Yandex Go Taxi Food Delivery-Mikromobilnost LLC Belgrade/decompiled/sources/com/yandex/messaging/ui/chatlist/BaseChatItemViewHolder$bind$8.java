package com.yandex.messaging.ui.chatlist;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcn4;", "badges", "Lzy11;", "<anonymous>", "(Ljava/util/List;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.chatlist.BaseChatItemViewHolder$bind$8", f = "BaseChatItemViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class BaseChatItemViewHolder$bind$8 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseChatItemViewHolder$bind$8(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BaseChatItemViewHolder$bind$8 baseChatItemViewHolder$bind$8 = new BaseChatItemViewHolder$bind$8(this.this$0, continuation);
        baseChatItemViewHolder$bind$8.L$0 = obj;
        return baseChatItemViewHolder$bind$8;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        BaseChatItemViewHolder$bind$8 baseChatItemViewHolder$bind$8 = (BaseChatItemViewHolder$bind$8) create((List) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        baseChatItemViewHolder$bind$8.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        List list = (List) this.L$0;
        this.this$0.Z().a(list);
        this.this$0.Y().i = list;
        return zy11.a;
    }
}
