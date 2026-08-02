package com.yandex.go.chargers.order.domain;

import defpackage.hxx;
import defpackage.ll9;
import defpackage.mvg;
import defpackage.nar;
import defpackage.ny61;
import defpackage.pep0;
import defpackage.q2a;
import defpackage.tse;
import defpackage.wls;
import defpackage.x5a;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.order.domain.ChargersActiveOrdersRemovePollingInteractor$listenRemoveActiveOrders$1$1$1", f = "ChargersActiveOrdersRemovePollingInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersActiveOrdersRemovePollingInteractor$listenRemoveActiveOrders$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ ll9 $it;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersActiveOrdersRemovePollingInteractor$listenRemoveActiveOrders$1$1$1(d dVar, ll9 ll9Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$it = ll9Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChargersActiveOrdersRemovePollingInteractor$listenRemoveActiveOrders$1$1$1(this.this$0, this.$it, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ChargersActiveOrdersRemovePollingInteractor$listenRemoveActiveOrders$1$1$1 chargersActiveOrdersRemovePollingInteractor$listenRemoveActiveOrders$1$1$1 = (ChargersActiveOrdersRemovePollingInteractor$listenRemoveActiveOrders$1$1$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        chargersActiveOrdersRemovePollingInteractor$listenRemoveActiveOrders$1$1$1.invokeSuspend(zy11Var);
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
        x5a x5aVar = this.this$0.d;
        nar narVar = this.$it.a;
        com.yandex.go.chargers.e eVar = (com.yandex.go.chargers.e) x5aVar.b.get();
        if (eVar.x()) {
            eVar.X(new q2a(narVar, true));
        } else {
            ((pep0) x5aVar.a).f(eVar, new q2a(narVar, false), hxx.a);
        }
        return zy11.a;
    }
}
