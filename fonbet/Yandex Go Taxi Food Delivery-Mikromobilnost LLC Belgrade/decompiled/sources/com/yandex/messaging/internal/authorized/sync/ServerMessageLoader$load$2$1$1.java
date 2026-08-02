package com.yandex.messaging.internal.authorized.sync;

import com.yandex.messaging.core.net.entities.proto.message.ServerMessage;
import com.yandex.messaging.internal.ServerMessageRef;
import defpackage.l020;
import defpackage.m8g;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.s020;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/messaging/core/net/entities/proto/message/ServerMessage;", "<anonymous>", "(Ltse;)Lcom/yandex/messaging/core/net/entities/proto/message/ServerMessage;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.authorized.sync.ServerMessageLoader$load$2$1$1", f = "ServerMessageLoader.kt", l = {71}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ServerMessageLoader$load$2$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $chatName;
    final /* synthetic */ ServerMessageRef $serverMessageRef;
    Object L$0;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServerMessageLoader$load$2$1$1(ServerMessageRef serverMessageRef, f fVar, String str, Continuation continuation) {
        super(2, continuation);
        this.$serverMessageRef = serverMessageRef;
        this.this$0 = fVar;
        this.$chatName = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ServerMessageLoader$load$2$1$1(this.$serverMessageRef, this.this$0, this.$chatName, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ServerMessageLoader$load$2$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            String requiredChatId = this.$serverMessageRef.getRequiredChatId();
            f fVar = this.this$0;
            ServerMessageRef serverMessageRef = this.$serverMessageRef;
            this.L$0 = requiredChatId;
            this.label = 1;
            Object a = f.a(fVar, serverMessageRef, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
            str = requiredChatId;
            obj = a;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = (String) this.L$0;
            kotlin.b.b(obj);
        }
        ServerMessage serverMessage = (ServerMessage) obj;
        if (serverMessage == null) {
            return null;
        }
        f fVar2 = this.this$0;
        String str2 = this.$chatName;
        if (str2 == null) {
            fVar2.getClass();
            str2 = serverMessage.serverMessageInfo.from.displayName;
            if (str2 == null) {
                str2 = "";
            }
        }
        s020 e = fVar2.e.e(str);
        if ((e != null ? ((m8g) e).d() : null) == null) {
            l020 C = fVar2.c.C();
            try {
                C.B.g(str, str2);
                C.s();
                C.close();
            } finally {
            }
        }
        fVar2.b.d(serverMessage);
        return serverMessage;
    }
}
