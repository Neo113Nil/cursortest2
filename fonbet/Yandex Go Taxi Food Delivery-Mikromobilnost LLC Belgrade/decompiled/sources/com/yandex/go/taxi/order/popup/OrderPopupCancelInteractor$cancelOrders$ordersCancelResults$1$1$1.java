package com.yandex.go.taxi.order.popup;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.bp5;
import defpackage.dvw;
import defpackage.j18;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.order.f;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Z"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.popup.OrderPopupCancelInteractor$cancelOrders$ordersCancelResults$1$1$1", f = "OrderPopupCancelInteractor.kt", l = {38}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderPopupCancelInteractor$cancelOrders$ordersCancelResults$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ o2y0 $it;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderPopupCancelInteractor$cancelOrders$ordersCancelResults$1$1$1(a aVar, o2y0 o2y0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$it = o2y0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderPopupCancelInteractor$cancelOrders$ordersCancelResults$1$1$1(this.this$0, this.$it, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderPopupCancelInteractor$cancelOrders$ordersCancelResults$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        a aVar = this.this$0;
        o2y0 o2y0Var = this.$it;
        this.label = 1;
        aVar.getClass();
        j18 j18Var = new j18(1, dvw.b(this));
        j18Var.u();
        TaxiOrder b = o2y0Var.b();
        synchronized (b) {
            b.l = b.l.C();
        }
        try {
            bp5 bp5Var = new bp5(j18Var);
            f fVar = (f) aVar.b;
            fVar.getClass();
            fVar.W(o2y0Var, o2y0Var.b().h.b, bp5Var);
        } catch (CancellationException unused) {
            j18Var.resumeWith(Boolean.FALSE);
        } catch (Exception unused2) {
            j18Var.resumeWith(Boolean.FALSE);
        }
        Object s = j18Var.s();
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        return s == coroutineSingletons ? coroutineSingletons : s;
    }
}
