package com.yandex.go.taxi.order.navigation;

import defpackage.a3y0;
import defpackage.a5y0;
import defpackage.hst;
import defpackage.i5y0;
import defpackage.jst;
import defpackage.m950;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.navigation.TaxiOrderRootRouterImpl$maybeBackToActiveOrder$1", f = "TaxiOrderRootRouterImpl.kt", l = {HProv.PP_DELETE_KEYSET}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TaxiOrderRootRouterImpl$maybeBackToActiveOrder$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    boolean Z$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiOrderRootRouterImpl$maybeBackToActiveOrder$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TaxiOrderRootRouterImpl$maybeBackToActiveOrder$1 taxiOrderRootRouterImpl$maybeBackToActiveOrder$1 = new TaxiOrderRootRouterImpl$maybeBackToActiveOrder$1(this.this$0, continuation);
        taxiOrderRootRouterImpl$maybeBackToActiveOrder$1.L$0 = obj;
        return taxiOrderRootRouterImpl$maybeBackToActiveOrder$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TaxiOrderRootRouterImpl$maybeBackToActiveOrder$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            b.b(obj);
            boolean d = this.this$0.P.d();
            this.this$0.Z.getClass();
            a3y0.h(new String[]{"maybeBackToActiveOrder"});
            hst hstVar = jst.e;
            a aVar = this.this$0;
            if (d) {
                aVar.E.b((m950) aVar.J.get(), new a5y0("back to active order with active orders to show", null, null, 30));
                return zy11Var;
            }
            com.yandex.go.taxi.order.provider.a aVar2 = aVar.N;
            this.L$0 = tseVar;
            this.Z$0 = d;
            this.label = 1;
            obj = aVar2.t(this);
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
        o2y0 o2y0Var = (o2y0) obj;
        a aVar3 = this.this$0;
        if (o2y0Var != null) {
            aVar3.E.b((m950) aVar3.J.get(), new a5y0("back to active order with most active order", o2y0Var, null, 28));
            return zy11Var;
        }
        aVar3.Z.j(new String[]{"maybeBackToActiveOrder"}, null, new i5y0(0, aVar3, tseVar));
        return zy11Var;
    }
}
