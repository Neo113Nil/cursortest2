package com.yandex.plus.pay.graphql.analytics;

import com.apollographql.apollo3.exception.ApolloException;
import com.apollographql.apollo3.exception.ApolloHttpException;
import com.yandex.plus.core.graphql.exception.GraphQLException;
import com.yandex.plus.core.network.api.exceptions.OfflineModeEnabledException;
import defpackage.b64;
import defpackage.gt90;
import defpackage.mvg;
import defpackage.rr50;
import defpackage.to2;
import defpackage.y5e;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lza70;", CA20Status.STATUS_REQUEST_D, "Lvpr;", "Lvo2;", "", "error", "Lzy11;", "<anonymous>", "(Lvpr;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.pay.graphql.analytics.NetworkDiagnosticApolloInterceptor$intercept$3", f = "NetworkDiagnosticApolloInterceptor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class NetworkDiagnosticApolloInterceptor$intercept$3 extends SuspendLambda implements zls {
    final /* synthetic */ to2 $request;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkDiagnosticApolloInterceptor$intercept$3(a aVar, to2 to2Var, Continuation continuation) {
        super(3, continuation);
        this.this$0 = aVar;
        this.$request = to2Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        NetworkDiagnosticApolloInterceptor$intercept$3 networkDiagnosticApolloInterceptor$intercept$3 = new NetworkDiagnosticApolloInterceptor$intercept$3(this.this$0, this.$request, (Continuation) obj3);
        networkDiagnosticApolloInterceptor$intercept$3.L$0 = (Throwable) obj2;
        networkDiagnosticApolloInterceptor$intercept$3.invokeSuspend(zy11.a);
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Throwable th = (Throwable) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        a aVar = this.this$0;
        to2 to2Var = this.$request;
        aVar.getClass();
        String name = to2Var.a.name();
        String str = null;
        ApolloException apolloException = th instanceof ApolloException ? (ApolloException) th : null;
        GraphQLException f = apolloException != null ? com.yandex.plus.core.graphql.internal.a.f(apolloException, name) : null;
        if (th instanceof ApolloHttpException) {
            String r = y5e.r(((ApolloHttpException) th).getHeaders());
            aVar.c(r, name, r != null ? (rr50) aVar.d.remove(r) : null, th, f);
            str = r;
        } else {
            if (th.getCause() instanceof OfflineModeEnabledException) {
                throw th;
            }
            aVar.c(null, name, null, th, f);
        }
        aVar.b.f(gt90.a, b64.l("Error during GraphQL operation. operationName = ", name, "; errorMessage = ", th.getMessage()), th, str);
        throw th;
    }
}
