package com.yandex.go.scooters.domain;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/yandex/taxi/scooters/experiments/g0;", "experiment", "Lzy11;", "<anonymous>", "(Lru/yandex/taxi/scooters/experiments/g0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.domain.ScootersStateInteractor$onExperimentAvailable$3", f = "ScootersStateInteractor.kt", l = {MSException.ERROR_INVALID_PARAMETER}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class ScootersStateInteractor$onExperimentAvailable$3 extends SuspendLambda implements wls {
    final /* synthetic */ tls $action;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersStateInteractor$onExperimentAvailable$3(tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.$action = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersStateInteractor$onExperimentAvailable$3 scootersStateInteractor$onExperimentAvailable$3 = new ScootersStateInteractor$onExperimentAvailable$3(this.$action, continuation);
        scootersStateInteractor$onExperimentAvailable$3.L$0 = obj;
        return scootersStateInteractor$onExperimentAvailable$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersStateInteractor$onExperimentAvailable$3) create((ru.yandex.taxi.scooters.experiments.g0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ru.yandex.taxi.scooters.experiments.g0 g0Var = (ru.yandex.taxi.scooters.experiments.g0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            if (g0Var.h()) {
                tls tlsVar = this.$action;
                this.L$0 = null;
                this.label = 1;
                if (tlsVar.invoke(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
