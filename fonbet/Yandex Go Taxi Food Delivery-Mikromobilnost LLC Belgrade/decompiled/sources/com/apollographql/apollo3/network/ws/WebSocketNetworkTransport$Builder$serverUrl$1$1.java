package com.apollographql.apollo3.network.ws;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 5, 1}, xi = 48)
@mvg(c = "com.apollographql.apollo3.network.ws.WebSocketNetworkTransport$Builder$serverUrl$1$1", f = "WebSocketNetworkTransport.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class WebSocketNetworkTransport$Builder$serverUrl$1$1 extends SuspendLambda implements tls {
    final /* synthetic */ String $serverUrl;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebSocketNetworkTransport$Builder$serverUrl$1$1(String str, Continuation continuation) {
        super(1, continuation);
        this.$serverUrl = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new WebSocketNetworkTransport$Builder$serverUrl$1$1(this.$serverUrl, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((WebSocketNetworkTransport$Builder$serverUrl$1$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return this.$serverUrl;
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
