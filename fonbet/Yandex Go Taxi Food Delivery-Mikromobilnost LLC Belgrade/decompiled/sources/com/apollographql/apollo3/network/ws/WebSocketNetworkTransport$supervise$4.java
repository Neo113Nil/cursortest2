package com.apollographql.apollo3.network.ws;

import defpackage.l8x;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {1, 5, 1})
@mvg(c = "com.apollographql.apollo3.network.ws.WebSocketNetworkTransport$supervise$4", f = "WebSocketNetworkTransport.kt", l = {254}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class WebSocketNetworkTransport$supervise$4 extends SuspendLambda implements wls {
    final /* synthetic */ Ref$ObjectRef<l8x> $connectionJob;
    final /* synthetic */ Ref$ObjectRef<l8x> $idleJob;
    final /* synthetic */ Ref$ObjectRef<f> $protocol;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebSocketNetworkTransport$supervise$4(e eVar, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, Ref$ObjectRef ref$ObjectRef3, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$protocol = ref$ObjectRef;
        this.$connectionJob = ref$ObjectRef2;
        this.$idleJob = ref$ObjectRef3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WebSocketNetworkTransport$supervise$4(this.this$0, this.$protocol, this.$connectionJob, this.$idleJob, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((WebSocketNetworkTransport$supervise$4) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            long j = this.this$0.d;
            this.label = 1;
            if (kotlinx.coroutines.a.i(j, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        e.b(this.$protocol, this.$connectionJob, this.$idleJob);
        return zy11.a;
    }
}
