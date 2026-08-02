package com.yandex.plus.core.graphql.internal;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.b050;
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
@mvg(c = "com.yandex.plus.core.graphql.internal.ApolloClientExtensionsKt$awaitMutation$2", f = "ApolloClientExtensions.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SAFETY_TIPS_VALUE}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ApolloClientExtensionsKt$awaitMutation$2 extends SuspendLambda implements tls {
    final /* synthetic */ b050 $mutation;
    final /* synthetic */ qo2 $this_awaitMutation;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApolloClientExtensionsKt$awaitMutation$2(qo2 qo2Var, b050 b050Var, Continuation continuation) {
        super(1, continuation);
        this.$this_awaitMutation = qo2Var;
        this.$mutation = b050Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new ApolloClientExtensionsKt$awaitMutation$2(this.$this_awaitMutation, this.$mutation, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((ApolloClientExtensionsKt$awaitMutation$2) create((Continuation) obj)).invokeSuspend(zy11.a);
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
        qo2 qo2Var = this.$this_awaitMutation;
        b050 b050Var = this.$mutation;
        qo2Var.getClass();
        oo2 oo2Var = new oo2(qo2Var, b050Var);
        this.label = 1;
        Object g = oo2Var.g(this);
        return g == coroutineSingletons ? coroutineSingletons : g;
    }
}
