package com.yandex.plus.home.graphql.analytics;

import com.apollographql.apollo3.exception.ApolloException;
import com.apollographql.apollo3.exception.ApolloHttpException;
import com.yandex.plus.core.analytics.logging.PlusLogTag;
import defpackage.mvg;
import defpackage.qq6;
import defpackage.skd0;
import defpackage.to2;
import defpackage.y5e;
import defpackage.zls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lza70;", CA20Status.STATUS_REQUEST_D, "Lvpr;", "Lvo2;", "", "error", "Lzy11;", "<anonymous>", "(Lvpr;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.home.graphql.analytics.StatboxApolloInterceptor$intercept$2", f = "StatboxApolloInterceptor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class StatboxApolloInterceptor$intercept$2 extends SuspendLambda implements zls {
    final /* synthetic */ to2 $request;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatboxApolloInterceptor$intercept$2(a aVar, to2 to2Var, Continuation continuation) {
        super(3, continuation);
        this.this$0 = aVar;
        this.$request = to2Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        StatboxApolloInterceptor$intercept$2 statboxApolloInterceptor$intercept$2 = new StatboxApolloInterceptor$intercept$2(this.this$0, this.$request, (Continuation) obj3);
        statboxApolloInterceptor$intercept$2.L$0 = (Throwable) obj2;
        statboxApolloInterceptor$intercept$2.invokeSuspend(zy11.a);
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        qq6 body;
        List headers;
        Throwable th = (Throwable) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        b.b(obj);
        a aVar = this.this$0;
        to2 to2Var = this.$request;
        aVar.getClass();
        String name = to2Var.a.name();
        ApolloHttpException apolloHttpException = th instanceof ApolloHttpException ? (ApolloHttpException) th : null;
        String r = (apolloHttpException == null || (headers = apolloHttpException.getHeaders()) == null) ? null : y5e.r(headers);
        if (apolloHttpException == null || (body = apolloHttpException.getBody()) == null) {
            str = null;
        } else {
            try {
                str = body.L();
                body.close();
            } finally {
            }
        }
        ApolloException apolloException = th instanceof ApolloException ? (ApolloException) th : null;
        Throwable f = apolloException != null ? com.yandex.plus.core.graphql.internal.a.f(apolloException, name) : null;
        PlusLogTag plusLogTag = PlusLogTag.SDK;
        String b = a.b(name, str, r);
        if (f == null) {
            f = th;
        }
        skd0.c(plusLogTag, b, f);
        throw th;
    }
}
