package com.apollographql.apollo3.network.http;

import com.apollographql.apollo3.exception.ApolloException;
import com.apollographql.apollo3.exception.ApolloParseException;
import defpackage.mvg;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u008a@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lza70;", CA20Status.STATUS_REQUEST_D, "Lvpr;", "Lvo2;", "", "it", "Lzy11;", "<anonymous>", "(Lvpr;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 5, 1})
@mvg(c = "com.apollographql.apollo3.network.http.HttpNetworkTransport$multipleResponses$2", f = "HttpNetworkTransport.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class HttpNetworkTransport$multipleResponses$2 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    int label;

    public HttpNetworkTransport$multipleResponses$2() {
        super(3, null);
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        HttpNetworkTransport$multipleResponses$2 httpNetworkTransport$multipleResponses$2 = new HttpNetworkTransport$multipleResponses$2(3, (Continuation) obj3);
        httpNetworkTransport$multipleResponses$2.L$0 = (Throwable) obj2;
        httpNetworkTransport$multipleResponses$2.invokeSuspend(zy11.a);
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        Throwable th = (Throwable) this.L$0;
        if (th instanceof ApolloException) {
            throw ((ApolloException) th);
        }
        throw new ApolloParseException(th);
    }
}
