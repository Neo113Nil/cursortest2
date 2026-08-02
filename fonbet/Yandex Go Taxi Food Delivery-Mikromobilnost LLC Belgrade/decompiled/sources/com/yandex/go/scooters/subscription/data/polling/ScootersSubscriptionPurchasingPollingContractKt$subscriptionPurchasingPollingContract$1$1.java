package com.yandex.go.scooters.subscription.data.polling;

import defpackage.iyo0;
import defpackage.kyo0;
import defpackage.lyo0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.nyo0;
import defpackage.oyo0;
import defpackage.pyo0;
import defpackage.qyo0;
import defpackage.vyo0;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "purchaseId", "Lqyo0;", "<anonymous>", "(Ljava/lang/String;)Lqyo0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.subscription.data.polling.ScootersSubscriptionPurchasingPollingContractKt$subscriptionPurchasingPollingContract$1$1", f = "ScootersSubscriptionPurchasingPollingContract.kt", l = {19}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersSubscriptionPurchasingPollingContractKt$subscriptionPurchasingPollingContract$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ com.yandex.go.scooters.subscription.data.a $scootersSubscriptionPurchaseStatusRepository;
    final /* synthetic */ vyo0 $scootersSubscriptionPurchasingStateRepository;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersSubscriptionPurchasingPollingContractKt$subscriptionPurchasingPollingContract$1$1(com.yandex.go.scooters.subscription.data.a aVar, vyo0 vyo0Var, Continuation continuation) {
        super(2, continuation);
        this.$scootersSubscriptionPurchaseStatusRepository = aVar;
        this.$scootersSubscriptionPurchasingStateRepository = vyo0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersSubscriptionPurchasingPollingContractKt$subscriptionPurchasingPollingContract$1$1 scootersSubscriptionPurchasingPollingContractKt$subscriptionPurchasingPollingContract$1$1 = new ScootersSubscriptionPurchasingPollingContractKt$subscriptionPurchasingPollingContract$1$1(this.$scootersSubscriptionPurchaseStatusRepository, this.$scootersSubscriptionPurchasingStateRepository, continuation);
        scootersSubscriptionPurchasingPollingContractKt$subscriptionPurchasingPollingContract$1$1.L$0 = obj;
        return scootersSubscriptionPurchasingPollingContractKt$subscriptionPurchasingPollingContract$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersSubscriptionPurchasingPollingContractKt$subscriptionPurchasingPollingContract$1$1) create((String) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str = (String) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            com.yandex.go.scooters.subscription.data.a aVar = this.$scootersSubscriptionPurchaseStatusRepository;
            this.L$0 = str;
            this.label = 1;
            obj = aVar.a(str, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        qyo0 qyo0Var = (qyo0) obj;
        if (qyo0Var instanceof oyo0) {
            ((com.yandex.go.scooters.subscription.data.b) this.$scootersSubscriptionPurchasingStateRepository).a(new lyo0(str));
            return qyo0Var;
        }
        if (qyo0Var instanceof pyo0) {
            ((com.yandex.go.scooters.subscription.data.b) this.$scootersSubscriptionPurchasingStateRepository).a(new kyo0((pyo0) qyo0Var));
            return qyo0Var;
        }
        if (!(qyo0Var instanceof nyo0)) {
            w511.b();
            return null;
        }
        ((com.yandex.go.scooters.subscription.data.b) this.$scootersSubscriptionPurchasingStateRepository).a(new iyo0((nyo0) qyo0Var));
        return qyo0Var;
    }
}
