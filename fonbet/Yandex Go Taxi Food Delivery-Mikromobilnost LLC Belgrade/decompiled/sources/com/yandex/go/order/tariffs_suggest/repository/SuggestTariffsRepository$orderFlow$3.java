package com.yandex.go.order.tariffs_suggest.repository;

import com.yandex.go.taxi.order.models.api.ChangeOrderState$Source;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.e;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qv10;
import defpackage.tcc;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/TaxiOrder;", "it", "Lzy11;", "<anonymous>", "(Lcom/yandex/go/taxi/order/models/api/TaxiOrder;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.order.tariffs_suggest.repository.SuggestTariffsRepository$orderFlow$3", f = "SuggestTariffsRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class SuggestTariffsRepository$orderFlow$3 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuggestTariffsRepository$orderFlow$3(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SuggestTariffsRepository$orderFlow$3 suggestTariffsRepository$orderFlow$3 = new SuggestTariffsRepository$orderFlow$3(this.this$0, continuation);
        suggestTariffsRepository$orderFlow$3.L$0 = obj;
        return suggestTariffsRepository$orderFlow$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        SuggestTariffsRepository$orderFlow$3 suggestTariffsRepository$orderFlow$3 = (SuggestTariffsRepository$orderFlow$3) create((TaxiOrder) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        suggestTariffsRepository$orderFlow$3.invokeSuspend(zy11Var);
        return zy11Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
    
        if (r4 == true) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z;
        List e;
        TaxiOrder taxiOrder = (TaxiOrder) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        r0 r0Var = this.this$0.k;
        if (taxiOrder != null && (e = taxiOrder.i.e()) != null) {
            List list = e;
            ArrayList arrayList = new ArrayList(tcc.n(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((e) it.next()).getA());
            }
            boolean contains = arrayList.contains(ChangeOrderState$Source.TARIFF);
            z = true;
        }
        z = false;
        qv10.B(z, r0Var, null);
        return zy11.a;
    }
}
