package com.yandex.messaging.internal.translator;

import defpackage.mcb;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.translator.ChatTranslatorReporter$onMessageTranslatingOnBackend$1", f = "ChatTranslatorReporter.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ChatTranslatorReporter$onMessageTranslatingOnBackend$1 extends SuspendLambda implements wls {
    final /* synthetic */ tls $block;
    final /* synthetic */ long $messageTimestamp;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatTranslatorReporter$onMessageTranslatingOnBackend$1(b bVar, long j, tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$messageTimestamp = j;
        this.$block = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChatTranslatorReporter$onMessageTranslatingOnBackend$1(this.this$0, this.$messageTimestamp, this.$block, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ChatTranslatorReporter$onMessageTranslatingOnBackend$1 chatTranslatorReporter$onMessageTranslatingOnBackend$1 = (ChatTranslatorReporter$onMessageTranslatingOnBackend$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        chatTranslatorReporter$onMessageTranslatingOnBackend$1.invokeSuspend(zy11Var);
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
        mcb mcbVar = (mcb) this.this$0.g.get(this.$messageTimestamp);
        if (mcbVar != null) {
            this.$block.invoke(mcbVar);
        }
        return zy11.a;
    }
}
