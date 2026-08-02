package com.yandex.go.taxi.order.common;

import com.yandex.go.taxi.order.domain.repositories.e0;
import defpackage.cvw;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.h0;
import kotlinx.coroutines.flow.i0;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.common.OrderFragmentPresenterDelegate$attach$2", f = "OrderFragmentPresenterDelegate.kt", l = {HProv.PP_SET_PIN}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderFragmentPresenterDelegate$attach$2 extends SuspendLambda implements wls {
    final /* synthetic */ tls $onMostActiveOrderUpdated;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ f this$0;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: com.yandex.go.taxi.order.common.OrderFragmentPresenterDelegate$attach$2$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements wls {
        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            ((tls) this.receiver).invoke((o2y0) obj);
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderFragmentPresenterDelegate$attach$2(f fVar, tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$onMostActiveOrderUpdated = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        OrderFragmentPresenterDelegate$attach$2 orderFragmentPresenterDelegate$attach$2 = new OrderFragmentPresenterDelegate$attach$2(this.this$0, this.$onMostActiveOrderUpdated, continuation);
        orderFragmentPresenterDelegate$attach$2.L$0 = obj;
        return orderFragmentPresenterDelegate$attach$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderFragmentPresenterDelegate$attach$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        r0 r0Var = ((e0) this.this$0.r).g;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(2, this.$onMostActiveOrderUpdated, cvw.class, "suspendConversion0", "suspendConversion0(Lkotlin/jvm/functions/Function1;Lcom/yandex/go/taxi/order/models/api/TaxiOrderHolder;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        a aVar = new a(this.this$0, tseVar);
        this.L$0 = null;
        this.label = 1;
        Object collect = r0Var.collect(new i0(new h0(aVar), anonymousClass1), this);
        if (collect != coroutineSingletons) {
            collect = zy11Var;
        }
        if (collect != coroutineSingletons) {
            collect = zy11Var;
        }
        return collect == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
