package com.yandex.go.blockeduser.data;

import defpackage.jbh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rqo;
import defpackage.t1b0;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.blockeduser.data.EnableBlockedUserFlowExperimentRepository$isBlockedUserEnabledFlowLazy$1", f = "EnableBlockedUserFlowExperimentRepository.kt", l = {16}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class EnableBlockedUserFlowExperimentRepository$isBlockedUserEnabledFlowLazy$1 extends SuspendLambda implements tls {
    final /* synthetic */ rqo $experimentProviderFactory;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnableBlockedUserFlowExperimentRepository$isBlockedUserEnabledFlowLazy$1(rqo rqoVar, Continuation continuation) {
        super(1, continuation);
        this.$experimentProviderFactory = rqoVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new EnableBlockedUserFlowExperimentRepository$isBlockedUserEnabledFlowLazy$1(this.$experimentProviderFactory, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((EnableBlockedUserFlowExperimentRepository$isBlockedUserEnabledFlowLazy$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            t1b0 e = ((jbh) this.$experimentProviderFactory).e(EnableBlockedUserFlowExperiment.c);
            this.label = 1;
            obj = e.b(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return Boolean.valueOf(((EnableBlockedUserFlowExperiment) obj).getB());
    }
}
