package com.yandex.go.taxi.order.details.v1.elements.payment;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.u6j;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v1.elements.payment.DetailsCardPaymentStateRepository$styleFlow$2", f = "DetailsCardPaymentStateRepository.kt", l = {27}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class DetailsCardPaymentStateRepository$styleFlow$2 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ u6j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailsCardPaymentStateRepository$styleFlow$2(u6j u6jVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = u6jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DetailsCardPaymentStateRepository$styleFlow$2 detailsCardPaymentStateRepository$styleFlow$2 = new DetailsCardPaymentStateRepository$styleFlow$2(this.this$0, continuation);
        detailsCardPaymentStateRepository$styleFlow$2.L$0 = obj;
        return detailsCardPaymentStateRepository$styleFlow$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DetailsCardPaymentStateRepository$styleFlow$2) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            String str = this.this$0.c.b().a;
            this.L$0 = null;
            this.label = 1;
            if (vprVar.emit(str, this) == coroutineSingletons) {
                return coroutineSingletons;
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
