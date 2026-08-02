package com.yandex.go.chargers.order.domain;

import defpackage.mvg;
import defpackage.my11;
import defpackage.ny61;
import defpackage.taa;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.order.domain.ChargersActiveOrdersStatusNotifier$trackOrdersStatusChange$2$1", f = "ChargersActiveOrdersStatusNotifier.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersActiveOrdersStatusNotifier$trackOrdersStatusChange$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ taa $order;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersActiveOrdersStatusNotifier$trackOrdersStatusChange$2$1(g gVar, taa taaVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
        this.$order = taaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChargersActiveOrdersStatusNotifier$trackOrdersStatusChange$2$1(this.this$0, this.$order, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ChargersActiveOrdersStatusNotifier$trackOrdersStatusChange$2$1 chargersActiveOrdersStatusNotifier$trackOrdersStatusChange$2$1 = (ChargersActiveOrdersStatusNotifier$trackOrdersStatusChange$2$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        chargersActiveOrdersStatusNotifier$trackOrdersStatusChange$2$1.invokeSuspend(zy11Var);
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
        this.this$0.b.e(this.$order.a(), my11.a);
        return zy11.a;
    }
}
