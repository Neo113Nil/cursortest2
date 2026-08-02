package com.yandex.go.taxi.order.details.v2.state.elements.feedback.tips;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.feedback.TaxiOrderTipsState;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$TipsSelector;
import com.yandex.go.taxi.order.models.api.response.tips.RideCardTipsChoiceDto$CustomTipsChoiceDto;
import com.yandex.go.taxi.order.models.api.response.tips.RideCardTipsChoiceDto$ValueTipsChoiceDto;
import com.yandex.go.taxi.order.models.api.response.tips.RideCardTipsChoiceDto$ZeroTipsChoiceDto;
import com.yandex.go.taxi.order.models.api.response.tips.e;
import defpackage.bpk0;
import defpackage.diz0;
import defpackage.fef;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.tcc;
import defpackage.wls;
import defpackage.y6i0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Pair;", "Lcom/yandex/go/taxi/order/models/api/feedback/TaxiOrderTipsState;", "", "<destruct>", "", "Lbpk0;", "<anonymous>", "(Lkotlin/Pair;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.state.elements.feedback.tips.RideCardTipsSelectorItemDataSource$getElementsFlow$2", f = "RideCardTipsSelectorItemDataSource.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardTipsSelectorItemDataSource$getElementsFlow$2 extends SuspendLambda implements wls {
    final /* synthetic */ fef $currencyRules;
    final /* synthetic */ RideCardItemDto$TipsSelector $item;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardTipsSelectorItemDataSource$getElementsFlow$2(a aVar, RideCardItemDto$TipsSelector rideCardItemDto$TipsSelector, fef fefVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$item = rideCardItemDto$TipsSelector;
        this.$currencyRules = fefVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RideCardTipsSelectorItemDataSource$getElementsFlow$2 rideCardTipsSelectorItemDataSource$getElementsFlow$2 = new RideCardTipsSelectorItemDataSource$getElementsFlow$2(this.this$0, this.$item, this.$currencyRules, continuation);
        rideCardTipsSelectorItemDataSource$getElementsFlow$2.L$0 = obj;
        return rideCardTipsSelectorItemDataSource$getElementsFlow$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RideCardTipsSelectorItemDataSource$getElementsFlow$2) create((Pair) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        TaxiOrder taxiOrder;
        EmptyList emptyList = EmptyList.a;
        Pair pair = (Pair) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        TaxiOrderTipsState taxiOrderTipsState = (TaxiOrderTipsState) pair.getFirst();
        boolean booleanValue = ((Boolean) pair.getSecond()).booleanValue();
        a aVar = this.this$0;
        RideCardItemDto$TipsSelector rideCardItemDto$TipsSelector = this.$item;
        fef fefVar = this.$currencyRules;
        aVar.getClass();
        List<e> list = rideCardItemDto$TipsSelector.e;
        ArrayList arrayList = new ArrayList();
        for (e eVar : list) {
            bpk0 f = eVar instanceof RideCardTipsChoiceDto$ZeroTipsChoiceDto ? aVar.e.f((RideCardTipsChoiceDto$ZeroTipsChoiceDto) eVar, taxiOrderTipsState, emptyList, booleanValue) : eVar instanceof RideCardTipsChoiceDto$ValueTipsChoiceDto ? aVar.d.a((RideCardTipsChoiceDto$ValueTipsChoiceDto) eVar, taxiOrderTipsState, fefVar, emptyList) : eVar instanceof RideCardTipsChoiceDto$CustomTipsChoiceDto ? aVar.f.b((RideCardTipsChoiceDto$CustomTipsChoiceDto) eVar, taxiOrderTipsState, fefVar, emptyList) : null;
            if (f != null) {
                arrayList.add(f);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        bpk0 d = aVar.c.d(taxiOrderTipsState, emptyList);
        boolean z = false;
        if (d != null) {
            int size = arrayList2.size();
            Integer num = rideCardItemDto$TipsSelector.c;
            if (num != null) {
                size = y6i0.d(num.intValue(), 0, size);
            }
            arrayList2.add(size, d);
        }
        a aVar2 = this.this$0;
        aVar2.getClass();
        boolean e = diz0.e(taxiOrderTipsState);
        if (!arrayList2.isEmpty()) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                if (((bpk0) it.next()).b) {
                    break;
                }
            }
        }
        z = true;
        if (e && z) {
            aVar2.b.c();
        }
        if (arrayList2.isEmpty()) {
            return emptyList;
        }
        a aVar3 = this.this$0;
        aVar3.getClass();
        ArrayList arrayList3 = new ArrayList(tcc.n(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            String str = ((bpk0) it2.next()).e;
            if (str == null) {
                str = "0";
            }
            arrayList3.add(str);
        }
        o2y0 o2y0Var = aVar3.b.a;
        r0 r0Var = o2y0Var.a;
        do {
            value = r0Var.getValue();
            taxiOrder = (TaxiOrder) value;
            synchronized (taxiOrder) {
                taxiOrder.l = taxiOrder.l.J(arrayList3);
            }
        } while (!r0Var.k(value, taxiOrder));
        o2y0Var.f();
        return arrayList2;
    }
}
