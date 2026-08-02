package com.yandex.go.taxi.order.chat.ui.chat;

import androidx.recyclerview.widget.i;
import defpackage.gs10;
import defpackage.hs10;
import defpackage.jv10;
import defpackage.kp50;
import defpackage.l9s;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.og20;
import defpackage.pw7;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/go/taxi/order/chat/ui/chat/MessageAdapter$TailState;", "<anonymous>", "(Ltse;)Lcom/yandex/go/taxi/order/chat/ui/chat/MessageAdapter$TailState;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.chat.ui.chat.MessageAdapter$DiffDispatcher$setMessages$2", f = "MessageAdapter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class MessageAdapter$DiffDispatcher$setMessages$2 extends SuspendLambda implements wls {
    final /* synthetic */ hs10 $adapter;
    final /* synthetic */ List<jv10> $models;
    final /* synthetic */ List<jv10> $oldModels;
    int label;
    final /* synthetic */ gs10 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageAdapter$DiffDispatcher$setMessages$2(List list, hs10 hs10Var, List list2, gs10 gs10Var, Continuation continuation) {
        super(2, continuation);
        this.$oldModels = list;
        this.$adapter = hs10Var;
        this.$models = list2;
        this.this$0 = gs10Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MessageAdapter$DiffDispatcher$setMessages$2(this.$oldModels, this.$adapter, this.$models, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MessageAdapter$DiffDispatcher$setMessages$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (this.$oldModels.isEmpty()) {
            hs10 hs10Var = this.$adapter;
            List<jv10> list = this.$models;
            hs10Var.b.y = false;
            hs10Var.y = list;
            hs10Var.notifyDataSetChanged();
            return list.isEmpty() ? MessageAdapter$TailState.NO_TAIL_CHANGES : MessageAdapter$TailState.TAIL_APPENDED;
        }
        gs10 gs10Var = this.this$0;
        List<jv10> list2 = this.$oldModels;
        List<jv10> list3 = this.$models;
        gs10Var.getClass();
        Pair pair = new Pair(list3, kp50.f(new og20(list2, list3, new pw7(4, gs10Var)), true));
        hs10 hs10Var2 = this.$adapter;
        hs10Var2.b.y = true;
        hs10Var2.y = (List) pair.c();
        l9s l9sVar = new l9s(hs10Var2);
        ((i) pair.f()).a(l9sVar);
        return l9sVar.a ? MessageAdapter$TailState.TAIL_APPENDED : l9sVar.b ? MessageAdapter$TailState.TAIL_MOVES : MessageAdapter$TailState.NO_TAIL_CHANGES;
    }
}
