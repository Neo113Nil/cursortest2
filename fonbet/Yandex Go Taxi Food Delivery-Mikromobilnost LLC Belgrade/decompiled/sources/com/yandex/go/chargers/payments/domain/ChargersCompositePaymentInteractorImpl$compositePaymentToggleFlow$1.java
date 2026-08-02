package com.yandex.go.chargers.payments.domain;

import defpackage.hfa0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lzy11;", "it", "Lcom/yandex/go/chargers/domain/ChargersCompositePaymentInteractor$ChargersCompositePaymentState;", "<anonymous>", "(V)Lcom/yandex/go/chargers/domain/ChargersCompositePaymentInteractor$ChargersCompositePaymentState;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.payments.domain.ChargersCompositePaymentInteractorImpl$compositePaymentToggleFlow$1", f = "ChargersCompositePaymentInteractorImpl.kt", l = {39}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersCompositePaymentInteractorImpl$compositePaymentToggleFlow$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersCompositePaymentInteractorImpl$compositePaymentToggleFlow$1(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChargersCompositePaymentInteractorImpl$compositePaymentToggleFlow$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersCompositePaymentInteractorImpl$compositePaymentToggleFlow$1) create((zy11) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        c cVar = this.this$0;
        hfa0 c = cVar.c.c();
        this.label = 1;
        Enum a = c.a(cVar, c, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
