package com.yandex.messaging.internal.authorized.chat;

import com.yandex.messaging.chat.activation.ChatActivationException;
import com.yandex.messaging.internal.LocalMessageRef;
import defpackage.c7b;
import defpackage.cn2;
import defpackage.i7b;
import defpackage.jsa0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.t3z;
import defpackage.tse;
import defpackage.wfz;
import defpackage.wls;
import defpackage.x08;
import defpackage.yw80;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.authorized.chat.ChatOutgoingMessageHandler$activateIfNecessary$$inlined$suspendCancelableWrapper$1$1", f = "ChatOutgoingMessageHandler.kt", l = {49}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class ChatOutgoingMessageHandler$activateIfNecessary$$inlined$suspendCancelableWrapper$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ jsa0 $callback$inlined;
    final /* synthetic */ yw80 $message$inlined;
    final /* synthetic */ long $msgInternalId$inlined;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ i7b this$0;
    final /* synthetic */ c7b this$0$inline_fun;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatOutgoingMessageHandler$activateIfNecessary$$inlined$suspendCancelableWrapper$1$1(c7b c7bVar, Continuation continuation, i7b i7bVar, yw80 yw80Var, long j, jsa0 jsa0Var) {
        super(2, continuation);
        this.this$0$inline_fun = c7bVar;
        this.this$0 = i7bVar;
        this.$message$inlined = yw80Var;
        this.$msgInternalId$inlined = j;
        this.$callback$inlined = jsa0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChatOutgoingMessageHandler$activateIfNecessary$$inlined$suspendCancelableWrapper$1$1 chatOutgoingMessageHandler$activateIfNecessary$$inlined$suspendCancelableWrapper$1$1 = new ChatOutgoingMessageHandler$activateIfNecessary$$inlined$suspendCancelableWrapper$1$1(this.this$0$inline_fun, continuation, this.this$0, this.$message$inlined, this.$msgInternalId$inlined, this.$callback$inlined);
        chatOutgoingMessageHandler$activateIfNecessary$$inlined$suspendCancelableWrapper$1$1.L$0 = obj;
        return chatOutgoingMessageHandler$activateIfNecessary$$inlined$suspendCancelableWrapper$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChatOutgoingMessageHandler$activateIfNecessary$$inlined$suspendCancelableWrapper$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        c7b c7bVar;
        ChatActivationException e;
        x08 x08Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            c7b c7bVar2 = this.this$0$inline_fun;
            try {
                com.yandex.messaging.chat.activation.a aVar = this.this$0.k;
                this.L$0 = c7bVar2;
                this.label = 1;
                if (aVar.b(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                c7bVar = c7bVar2;
            } catch (ChatActivationException e2) {
                c7bVar = c7bVar2;
                e = e2;
                if (e.getIsUnrecoverableActivationError()) {
                    i7b i7bVar = this.this$0;
                    t3z t3zVar = LocalMessageRef.Companion;
                    String str = this.$message$inlined.a;
                    t3zVar.getClass();
                    i7bVar.b(t3z.b(str));
                }
                x08Var = wfz.z;
                c7bVar.a = new cn2(x08Var, 1);
                return zy11.a;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c7bVar = (c7b) this.L$0;
            try {
                kotlin.b.b(obj);
            } catch (ChatActivationException e3) {
                e = e3;
                if (e.getIsUnrecoverableActivationError()) {
                }
                x08Var = wfz.z;
                c7bVar.a = new cn2(x08Var, 1);
                return zy11.a;
            }
        }
        x08Var = this.this$0.f(this.$message$inlined, this.$msgInternalId$inlined, this.$callback$inlined);
        c7bVar.a = new cn2(x08Var, 1);
        return zy11.a;
    }
}
