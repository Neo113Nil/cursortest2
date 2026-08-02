package com.yandex.plus.home.graphql.analytics;

import com.yandex.plus.core.analytics.logging.PlusLogTag;
import com.yandex.plus.core.graphql.exception.GraphQLException;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.skd0;
import defpackage.t5o;
import defpackage.to2;
import defpackage.vo2;
import defpackage.wls;
import defpackage.y5e;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lza70;", CA20Status.STATUS_REQUEST_D, "Lvo2;", "response", "Lzy11;", "<anonymous>", "(Lvo2;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.home.graphql.analytics.StatboxApolloInterceptor$intercept$1", f = "StatboxApolloInterceptor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class StatboxApolloInterceptor$intercept$1 extends SuspendLambda implements wls {
    final /* synthetic */ to2 $request;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatboxApolloInterceptor$intercept$1(a aVar, to2 to2Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$request = to2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        StatboxApolloInterceptor$intercept$1 statboxApolloInterceptor$intercept$1 = new StatboxApolloInterceptor$intercept$1(this.this$0, this.$request, continuation);
        statboxApolloInterceptor$intercept$1.L$0 = obj;
        return statboxApolloInterceptor$intercept$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        StatboxApolloInterceptor$intercept$1 statboxApolloInterceptor$intercept$1 = (StatboxApolloInterceptor$intercept$1) create((vo2) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        statboxApolloInterceptor$intercept$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vo2 vo2Var = (vo2) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        t5o s = y5e.s(vo2Var);
        if (s != null) {
            a aVar = this.this$0;
            to2 to2Var = this.$request;
            aVar.getClass();
            String name = to2Var.a.name();
            List p = y5e.p(vo2Var);
            String r = p != null ? y5e.r(p) : null;
            GraphQLException e = com.yandex.plus.core.graphql.internal.a.e(s);
            skd0.c(PlusLogTag.SDK, a.b(name, e.getMessage(), r), e);
        }
        return zy11.a;
    }
}
