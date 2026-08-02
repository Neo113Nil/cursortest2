package com.yandex.go.suggest.impl.data.experiments;

import defpackage.jbh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rqo;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/yandex/go/suggest/impl/data/experiments/SuperappSuggestExperiment;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.suggest.impl.data.experiments.SuperappSuggestSettingsRepository$experiment$1", f = "SuperappSuggestSettingsRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class SuperappSuggestSettingsRepository$experiment$1 extends SuspendLambda implements tls {
    final /* synthetic */ rqo $experimentProviderFactory;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperappSuggestSettingsRepository$experiment$1(rqo rqoVar, Continuation continuation) {
        super(1, continuation);
        this.$experimentProviderFactory = rqoVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new SuperappSuggestSettingsRepository$experiment$1(this.$experimentProviderFactory, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((SuperappSuggestSettingsRepository$experiment$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        rqo rqoVar = this.$experimentProviderFactory;
        SuperappSuggestExperiment.Companion.getClass();
        return ((jbh) rqoVar).c(SuperappSuggestExperiment.n).b();
    }
}
