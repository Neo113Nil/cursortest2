package com.yandex.messaging.internal.authorized.sync;

import com.yandex.messaging.internal.ServerMessageRef;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.authorized.sync.ServerMessageLoader$loadAsyncIfAbsent$1", f = "ServerMessageLoader.kt", l = {48}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ServerMessageLoader$loadAsyncIfAbsent$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $chatName;
    final /* synthetic */ sls $completeCallback;
    final /* synthetic */ ServerMessageRef $serverMessageRef;
    final /* synthetic */ SyncSource $syncSource;
    final /* synthetic */ long $timeout;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServerMessageLoader$loadAsyncIfAbsent$1(f fVar, ServerMessageRef serverMessageRef, SyncSource syncSource, String str, long j, sls slsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$serverMessageRef = serverMessageRef;
        this.$syncSource = syncSource;
        this.$chatName = str;
        this.$timeout = j;
        this.$completeCallback = slsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ServerMessageLoader$loadAsyncIfAbsent$1(this.this$0, this.$serverMessageRef, this.$syncSource, this.$chatName, this.$timeout, this.$completeCallback, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ServerMessageLoader$loadAsyncIfAbsent$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ServerMessageLoader$loadAsyncIfAbsent$1 serverMessageLoader$loadAsyncIfAbsent$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            f fVar = this.this$0;
            ServerMessageRef serverMessageRef = this.$serverMessageRef;
            SyncSource syncSource = this.$syncSource;
            String str = this.$chatName;
            long j = this.$timeout;
            this.label = 1;
            serverMessageLoader$loadAsyncIfAbsent$1 = this;
            if (fVar.b(serverMessageRef, syncSource, str, j, serverMessageLoader$loadAsyncIfAbsent$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            serverMessageLoader$loadAsyncIfAbsent$1 = this;
        }
        sls slsVar = serverMessageLoader$loadAsyncIfAbsent$1.$completeCallback;
        if (slsVar != null) {
            slsVar.invoke();
        }
        return zy11.a;
    }
}
