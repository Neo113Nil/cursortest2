package com.yandex.messaging.input.voice.reply;

import com.yandex.messaging.internal.ServerMessageRef;
import defpackage.abz0;
import defpackage.az31;
import defpackage.k020;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o1b0;
import defpackage.tse;
import defpackage.wls;
import defpackage.yab;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lrh3;", "<anonymous>", "(Ltse;)Lrh3;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.input.voice.reply.VoiceMessageReplyTrackLoader$load$2", f = "VoiceMessageReplyTrackLoader.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class VoiceMessageReplyTrackLoader$load$2 extends SuspendLambda implements wls {
    final /* synthetic */ k020 $cacheStorage;
    final /* synthetic */ String $chatId;
    final /* synthetic */ ServerMessageRef $originalServerMessageRef;
    final /* synthetic */ o1b0 $persistentChat;
    final /* synthetic */ abz0 $ref;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceMessageReplyTrackLoader$load$2(k020 k020Var, o1b0 o1b0Var, abz0 abz0Var, b bVar, String str, ServerMessageRef serverMessageRef, Continuation continuation) {
        super(2, continuation);
        this.$cacheStorage = k020Var;
        this.$persistentChat = o1b0Var;
        this.$ref = abz0Var;
        this.this$0 = bVar;
        this.$chatId = str;
        this.$originalServerMessageRef = serverMessageRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new VoiceMessageReplyTrackLoader$load$2(this.$cacheStorage, this.$persistentChat, this.$ref, this.this$0, this.$chatId, this.$originalServerMessageRef, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((VoiceMessageReplyTrackLoader$load$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        yab x = this.$cacheStorage.x(this.$persistentChat.a, this.$ref);
        try {
            az31 a = b.a(this.this$0, x, this.$chatId, this.$originalServerMessageRef);
            x.close();
            return a;
        } finally {
        }
    }
}
