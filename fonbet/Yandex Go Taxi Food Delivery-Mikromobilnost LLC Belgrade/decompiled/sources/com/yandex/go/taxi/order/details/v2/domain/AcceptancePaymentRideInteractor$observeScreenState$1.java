package com.yandex.go.taxi.order.details.v2.domain;

import defpackage.gci0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.ye;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.domain.AcceptancePaymentRideInteractor$observeScreenState$1", f = "AcceptancePaymentRideInteractor.kt", l = {44}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class AcceptancePaymentRideInteractor$observeScreenState$1 extends SuspendLambda implements wls {
    final /* synthetic */ tls $dismissChild;
    final /* synthetic */ tls $launchChild;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AcceptancePaymentRideInteractor$observeScreenState$1(a aVar, tls tlsVar, tls tlsVar2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$launchChild = tlsVar;
        this.$dismissChild = tlsVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AcceptancePaymentRideInteractor$observeScreenState$1(this.this$0, this.$launchChild, this.$dismissChild, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AcceptancePaymentRideInteractor$observeScreenState$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            a aVar = this.this$0;
            gci0 gci0Var = ((com.yandex.go.payments.acceptance.domain.c) aVar.a).m;
            ye yeVar = new ye(0, aVar, this.$launchChild, this.$dismissChild);
            this.label = 1;
            if (gci0Var.a.collect(yeVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        ny61.A();
        return null;
    }
}
