package com.yandex.go.taxi.order.superapp.orders;

import com.yandex.go.taxi.order.details.v2.state.RideCardPresentationType;
import defpackage.g92;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.q6y0;
import defpackage.r1y0;
import defpackage.tcc;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.superapp.orders.TaxiOrderFlowTrackingSourceRepository$trackingsFlow$$inlined$flatMapLatest$1", f = "TaxiOrderFlowTrackingSourceRepository.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class TaxiOrderFlowTrackingSourceRepository$trackingsFlow$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ v this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiOrderFlowTrackingSourceRepository$trackingsFlow$$inlined$flatMapLatest$1(v vVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = vVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        TaxiOrderFlowTrackingSourceRepository$trackingsFlow$$inlined$flatMapLatest$1 taxiOrderFlowTrackingSourceRepository$trackingsFlow$$inlined$flatMapLatest$1 = new TaxiOrderFlowTrackingSourceRepository$trackingsFlow$$inlined$flatMapLatest$1(this.this$0, (Continuation) obj3);
        taxiOrderFlowTrackingSourceRepository$trackingsFlow$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        taxiOrderFlowTrackingSourceRepository$trackingsFlow$$inlined$flatMapLatest$1.L$1 = obj2;
        return taxiOrderFlowTrackingSourceRepository$trackingsFlow$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tpr oVar;
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            List list = (List) obj2;
            v vVar = this.this$0;
            vVar.getClass();
            if (list.isEmpty()) {
                oVar = new g92(2, EmptyList.a);
            } else {
                List<r1y0> list2 = list;
                ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                for (r1y0 r1y0Var : list2) {
                    q6y0 q6y0Var = r1y0Var instanceof q6y0 ? (q6y0) r1y0Var : null;
                    arrayList.add(q6y0Var == null ? new g92(2, r1y0Var) : new q(vVar.o.a(q6y0Var.c, RideCardPresentationType.COMPACT), q6y0Var, r1y0Var));
                }
                oVar = new o((tpr[]) kotlin.collections.a.J0(arrayList).toArray(new tpr[0]));
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (kotlinx.coroutines.flow.e.u(oVar, vprVar, this) == coroutineSingletons) {
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
