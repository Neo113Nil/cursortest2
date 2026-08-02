package com.yandex.plus.core.graphql.internal;

import defpackage.ejg0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oo2;
import defpackage.qo2;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "T", "Lvo2;", "<anonymous>", "()Lvo2;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.core.graphql.internal.ApolloClientExtensionsKt$awaitQuery$2", f = "ApolloClientExtensions.kt", l = {30}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ApolloClientExtensionsKt$awaitQuery$2 extends SuspendLambda implements tls {
    final /* synthetic */ ejg0 $query;
    final /* synthetic */ qo2 $this_awaitQuery;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApolloClientExtensionsKt$awaitQuery$2(qo2 qo2Var, ejg0 ejg0Var, Continuation continuation) {
        super(1, continuation);
        this.$this_awaitQuery = qo2Var;
        this.$query = ejg0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new ApolloClientExtensionsKt$awaitQuery$2(this.$this_awaitQuery, this.$query, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((ApolloClientExtensionsKt$awaitQuery$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        qo2 qo2Var = this.$this_awaitQuery;
        ejg0 ejg0Var = this.$query;
        qo2Var.getClass();
        oo2 oo2Var = new oo2(qo2Var, ejg0Var);
        this.label = 1;
        Object g = oo2Var.g(this);
        return g == coroutineSingletons ? coroutineSingletons : g;
    }
}
