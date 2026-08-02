package com.yandex.go.chargers.order.domain;

import com.yandex.go.chargers.data.model.ChargersExperiment;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yandex/go/chargers/data/model/ChargersExperiment;", "exp", "Lzy11;", "<anonymous>", "(Lcom/yandex/go/chargers/data/model/ChargersExperiment;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.order.domain.ChargersActiveOrdersPollingInteractor$onExperimentAvailable$3", f = "ChargersActiveOrdersPollingInteractor.kt", l = {HProv.ALG_SID_SHA3_256}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class ChargersActiveOrdersPollingInteractor$onExperimentAvailable$3 extends SuspendLambda implements wls {
    final /* synthetic */ tls $onAvailable;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersActiveOrdersPollingInteractor$onExperimentAvailable$3(tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.$onAvailable = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChargersActiveOrdersPollingInteractor$onExperimentAvailable$3 chargersActiveOrdersPollingInteractor$onExperimentAvailable$3 = new ChargersActiveOrdersPollingInteractor$onExperimentAvailable$3(this.$onAvailable, continuation);
        chargersActiveOrdersPollingInteractor$onExperimentAvailable$3.L$0 = obj;
        return chargersActiveOrdersPollingInteractor$onExperimentAvailable$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersActiveOrdersPollingInteractor$onExperimentAvailable$3) create((ChargersExperiment) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ChargersExperiment chargersExperiment = (ChargersExperiment) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            if (chargersExperiment.getB()) {
                tls tlsVar = this.$onAvailable;
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
