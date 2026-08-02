package com.yandex.go.scooters.discovery;

import defpackage.jbh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.t1b0;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.SimplePersistentBooleanExperiment;

@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.scooters.discovery.ScootersDiscoveryPresenter$isOrderSelectorEnabled$1", f = "ScootersDiscoveryPresenter.kt", l = {56}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersDiscoveryPresenter$isOrderSelectorEnabled$1 extends SuspendLambda implements tls {
    int label;
    final /* synthetic */ j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersDiscoveryPresenter$isOrderSelectorEnabled$1(j jVar, Continuation continuation) {
        super(1, continuation);
        this.this$0 = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new ScootersDiscoveryPresenter$isOrderSelectorEnabled$1(this.this$0, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((ScootersDiscoveryPresenter$isOrderSelectorEnabled$1) create((Continuation) obj)).invokeSuspend(zy11.a);
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
        t1b0 f = ((jbh) this.this$0.D).f(SimplePersistentBooleanExperiment.SCOOTERS_CLIENT_ORDER_SELECTOR);
        this.label = 1;
        Object b = f.b(this);
        return b == coroutineSingletons ? coroutineSingletons : b;
    }
}
