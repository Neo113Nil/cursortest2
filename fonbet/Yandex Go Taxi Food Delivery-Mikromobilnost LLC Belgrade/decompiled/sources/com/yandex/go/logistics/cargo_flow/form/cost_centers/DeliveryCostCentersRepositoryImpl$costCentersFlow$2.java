package com.yandex.go.logistics.cargo_flow.form.cost_centers;

import com.yandex.go.payments.data.model.response.CorpAccount;
import com.yandex.go.payments.paymentlist.data.c;
import com.yandex.go.taxi.order.models.api.preorder.Preorder;
import defpackage.bwe;
import defpackage.e4a0;
import defpackage.jve;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.costcenters.api.CostCenterField;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Le4a0;", "selectedPayment", "Lzy11;", "<unused var>", "", "Lbwe;", "<anonymous>", "(Lru/yandex/taxi/gopayments/model/PaymentMethod;V)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.logistics.cargo_flow.form.cost_centers.DeliveryCostCentersRepositoryImpl$costCentersFlow$2", f = "DeliveryCostCentersRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DeliveryCostCentersRepositoryImpl$costCentersFlow$2 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryCostCentersRepositoryImpl$costCentersFlow$2(a aVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = aVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        DeliveryCostCentersRepositoryImpl$costCentersFlow$2 deliveryCostCentersRepositoryImpl$costCentersFlow$2 = new DeliveryCostCentersRepositoryImpl$costCentersFlow$2(this.this$0, (Continuation) obj3);
        deliveryCostCentersRepositoryImpl$costCentersFlow$2.L$0 = (e4a0) obj;
        return deliveryCostCentersRepositoryImpl$costCentersFlow$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        e4a0 e4a0Var = (e4a0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        if (e4a0Var.a() == PaymentMethod$Type.CORP) {
            String q = ((c) this.this$0.c).g.q(e4a0Var);
            c cVar = (c) this.this$0.c;
            CorpAccount j = cVar.g.j(q);
            jve b = j != null ? cVar.o.b(j) : null;
            if (b != null) {
                Preorder preorder = this.this$0.b.a;
                List list = b.e;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (((CostCenterField) obj2).c.contains(TariffOrderFlow.ORDER_FLOW_DELIVERY_KEY)) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    CostCenterField costCenterField = (CostCenterField) it.next();
                    arrayList2.add(new bwe(costCenterField.a, costCenterField.b, preorder.f(costCenterField.a), costCenterField.d));
                }
                if (!arrayList2.isEmpty()) {
                    return arrayList2;
                }
            }
        }
        return null;
    }
}
