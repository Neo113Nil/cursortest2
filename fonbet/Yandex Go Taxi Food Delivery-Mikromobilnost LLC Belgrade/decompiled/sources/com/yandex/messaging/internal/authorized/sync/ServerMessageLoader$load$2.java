package com.yandex.messaging.internal.authorized.sync;

import com.yandex.messaging.core.net.entities.proto.message.ServerMessage;
import com.yandex.messaging.internal.ServerMessageRef;
import defpackage.i0x0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.io.Closeable;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/messaging/core/net/entities/proto/message/ServerMessage;", "<anonymous>", "(Ltse;)Lcom/yandex/messaging/core/net/entities/proto/message/ServerMessage;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.authorized.sync.ServerMessageLoader$load$2", f = "ServerMessageLoader.kt", l = {69}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ServerMessageLoader$load$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $chatName;
    final /* synthetic */ ServerMessageRef $serverMessageRef;
    final /* synthetic */ SyncSource $syncSource;
    final /* synthetic */ long $timeout;
    Object L$0;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServerMessageLoader$load$2(f fVar, SyncSource syncSource, long j, ServerMessageRef serverMessageRef, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$syncSource = syncSource;
        this.$timeout = j;
        this.$serverMessageRef = serverMessageRef;
        this.$chatName = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ServerMessageLoader$load$2(this.this$0, this.$syncSource, this.$timeout, this.$serverMessageRef, this.$chatName, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ServerMessageLoader$load$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        Closeable closeable;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            i0x0 c = this.this$0.a.c(false, false, this.$syncSource);
            long j = this.$timeout;
            try {
                ServerMessageLoader$load$2$1$1 serverMessageLoader$load$2$1$1 = new ServerMessageLoader$load$2$1$1(this.$serverMessageRef, this.this$0, this.$chatName, null);
                this.L$0 = c;
                this.label = 1;
                Object w = kotlinx.coroutines.a.w(j, serverMessageLoader$load$2$1$1, this);
                if (w == coroutineSingletons) {
                    return coroutineSingletons;
                }
                obj = w;
                closeable = c;
            } catch (Throwable th2) {
                th = th2;
                closeable = c;
                throw th;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            closeable = (Closeable) this.L$0;
            try {
                kotlin.b.b(obj);
            } catch (Throwable th3) {
                th = th3;
                try {
                    throw th;
                } catch (Throwable th4) {
                    ooc.g(closeable, th);
                    throw th4;
                }
            }
        }
        ServerMessage serverMessage = (ServerMessage) obj;
        ooc.g(closeable, null);
        return serverMessage;
    }
}
