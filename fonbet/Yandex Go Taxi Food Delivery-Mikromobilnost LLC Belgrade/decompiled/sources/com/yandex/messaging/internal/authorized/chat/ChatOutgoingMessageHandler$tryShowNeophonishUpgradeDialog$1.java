package com.yandex.messaging.internal.authorized.chat;

import defpackage.hm50;
import defpackage.i7b;
import defpackage.im50;
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
@mvg(c = "com.yandex.messaging.internal.authorized.chat.ChatOutgoingMessageHandler$tryShowNeophonishUpgradeDialog$1", f = "ChatOutgoingMessageHandler.kt", l = {585}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ChatOutgoingMessageHandler$tryShowNeophonishUpgradeDialog$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $messageId;
    int label;
    final /* synthetic */ i7b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatOutgoingMessageHandler$tryShowNeophonishUpgradeDialog$1(i7b i7bVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = i7bVar;
        this.$messageId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChatOutgoingMessageHandler$tryShowNeophonishUpgradeDialog$1(this.this$0, this.$messageId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChatOutgoingMessageHandler$tryShowNeophonishUpgradeDialog$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        im50 im50Var = (im50) this.this$0.t.get();
        String str = this.$messageId;
        String str2 = this.this$0.b.b;
        this.label = 1;
        Object emit = im50Var.a.emit(new hm50(str, str2), this);
        if (emit != coroutineSingletons) {
            emit = zy11Var;
        }
        return emit == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
