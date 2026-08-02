package com.yandex.go.taxi.order.details.v2.navigation;

import defpackage.a3y0;
import defpackage.cck0;
import defpackage.hst;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.navigation.TaxiOrderDetailsDynamicSwitcher$subscribeDetailsPresenceMonitoring$1$1", f = "TaxiOrderDetailsDynamicSwitcher.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TaxiOrderDetailsDynamicSwitcher$subscribeDetailsPresenceMonitoring$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ cck0 $availability;
    final /* synthetic */ com.yandex.go.taxi.order.stack.a $payload;
    final /* synthetic */ tls $showDetails;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiOrderDetailsDynamicSwitcher$subscribeDetailsPresenceMonitoring$1$1(c cVar, tls tlsVar, com.yandex.go.taxi.order.stack.a aVar, cck0 cck0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$showDetails = tlsVar;
        this.$payload = aVar;
        this.$availability = cck0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TaxiOrderDetailsDynamicSwitcher$subscribeDetailsPresenceMonitoring$1$1(this.this$0, this.$showDetails, this.$payload, this.$availability, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        TaxiOrderDetailsDynamicSwitcher$subscribeDetailsPresenceMonitoring$1$1 taxiOrderDetailsDynamicSwitcher$subscribeDetailsPresenceMonitoring$1$1 = (TaxiOrderDetailsDynamicSwitcher$subscribeDetailsPresenceMonitoring$1$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        taxiOrderDetailsDynamicSwitcher$subscribeDetailsPresenceMonitoring$1$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.this$0.e.getClass();
        a3y0.h(new String[]{"subscribeDetailsPresenceMonitoring"});
        hst hstVar = jst.e;
        this.$showDetails.invoke(this.$payload);
        return zy11.a;
    }
}
