package com.yandex.go.taxi.order.change.price.domain;

import com.yandex.go.taxi.order.change.price.data.dto.ApplyAdditionalPaymentResponse;
import com.yandex.go.taxi.order.models.api.ChangeOrderState$Pending;
import com.yandex.go.taxi.order.models.api.ChangeOrderState$Source;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.a3y0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.change.price.domain.ApplyAdditionalPaymentInteractor$changePrice$2", f = "ApplyAdditionalPaymentInteractor.kt", l = {44}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class ApplyAdditionalPaymentInteractor$changePrice$2 extends SuspendLambda implements wls {
    final /* synthetic */ o2y0 $orderHolder;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApplyAdditionalPaymentInteractor$changePrice$2(o2y0 o2y0Var, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$orderHolder = o2y0Var;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ApplyAdditionalPaymentInteractor$changePrice$2(this.$orderHolder, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ApplyAdditionalPaymentInteractor$changePrice$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        TaxiOrder taxiOrder;
        a aVar;
        o2y0 o2y0Var;
        o2y0 o2y0Var2;
        a aVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                b.b(obj);
                o2y0 o2y0Var3 = this.$orderHolder;
                r0 r0Var = o2y0Var3.a;
                do {
                    value = r0Var.getValue();
                    taxiOrder = (TaxiOrder) value;
                    taxiOrder.a(new ChangeOrderState$Pending(null, ChangeOrderState$Source.ADDITIONAL_PAYMENT));
                } while (!r0Var.k(value, taxiOrder));
                o2y0Var3.f();
                aVar = this.this$0;
                o2y0 o2y0Var4 = this.$orderHolder;
                try {
                    com.yandex.go.taxi.order.change.price.data.repository.a aVar3 = aVar.b;
                    String str = o2y0Var4.b().a;
                    this.L$0 = aVar;
                    this.L$1 = o2y0Var4;
                    this.L$2 = aVar;
                    this.L$3 = o2y0Var4;
                    this.label = 1;
                    Object a = aVar3.a(str, this);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    o2y0Var = o2y0Var4;
                    o2y0Var2 = o2y0Var;
                    obj = a;
                    aVar2 = aVar;
                } catch (Throwable th) {
                    th = th;
                    o2y0Var = o2y0Var4;
                    a3y0.d((a3y0) aVar.d.getValue(), "changePrice", th, null, 4);
                    a.c(o2y0Var, null);
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o2y0Var = (o2y0) this.L$3;
                aVar = (a) this.L$2;
                o2y0Var2 = (o2y0) this.L$1;
                aVar2 = (a) this.L$0;
                try {
                    b.b(obj);
                } catch (Throwable th2) {
                    th = th2;
                    a3y0.d((a3y0) aVar.d.getValue(), "changePrice", th, null, 4);
                    a.c(o2y0Var, null);
                    return zy11.a;
                }
            }
            a.a(aVar2, o2y0Var2, (ApplyAdditionalPaymentResponse) obj);
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
