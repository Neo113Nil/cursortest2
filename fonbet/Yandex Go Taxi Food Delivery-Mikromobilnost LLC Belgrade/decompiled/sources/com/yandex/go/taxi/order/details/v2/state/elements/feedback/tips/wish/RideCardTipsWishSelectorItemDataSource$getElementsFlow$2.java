package com.yandex.go.taxi.order.details.v2.state.elements.feedback.tips.wish;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.feedback.TaxiOrderTipsState;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$TipsWishSelector;
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
import defpackage.wck0;
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
@mvg(c = "com.yandex.go.taxi.order.details.v2.state.elements.feedback.tips.wish.RideCardTipsWishSelectorItemDataSource$getElementsFlow$2", f = "RideCardTipsWishSelectorItemDataSource.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardTipsWishSelectorItemDataSource$getElementsFlow$2 extends SuspendLambda implements wls {
    final /* synthetic */ List<wck0> $buttonStyles;
    final /* synthetic */ fef $currencyRules;
    final /* synthetic */ RideCardItemDto$TipsWishSelector $item;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardTipsWishSelectorItemDataSource$getElementsFlow$2(a aVar, RideCardItemDto$TipsWishSelector rideCardItemDto$TipsWishSelector, fef fefVar, List list, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$item = rideCardItemDto$TipsWishSelector;
        this.$currencyRules = fefVar;
        this.$buttonStyles = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RideCardTipsWishSelectorItemDataSource$getElementsFlow$2 rideCardTipsWishSelectorItemDataSource$getElementsFlow$2 = new RideCardTipsWishSelectorItemDataSource$getElementsFlow$2(this.this$0, this.$item, this.$currencyRules, this.$buttonStyles, continuation);
        rideCardTipsWishSelectorItemDataSource$getElementsFlow$2.L$0 = obj;
        return rideCardTipsWishSelectorItemDataSource$getElementsFlow$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RideCardTipsWishSelectorItemDataSource$getElementsFlow$2) create((Pair) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        TaxiOrder taxiOrder;
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
        RideCardItemDto$TipsWishSelector rideCardItemDto$TipsWishSelector = this.$item;
        fef fefVar = this.$currencyRules;
        List<wck0> list = this.$buttonStyles;
        aVar.getClass();
        List<e> list2 = rideCardItemDto$TipsWishSelector.j;
        ArrayList arrayList = new ArrayList();
        for (e eVar : list2) {
            bpk0 f = eVar instanceof RideCardTipsChoiceDto$ZeroTipsChoiceDto ? aVar.f.f((RideCardTipsChoiceDto$ZeroTipsChoiceDto) eVar, taxiOrderTipsState, list, booleanValue) : eVar instanceof RideCardTipsChoiceDto$CustomTipsChoiceDto ? aVar.e.b((RideCardTipsChoiceDto$CustomTipsChoiceDto) eVar, taxiOrderTipsState, fefVar, list) : eVar instanceof RideCardTipsChoiceDto$ValueTipsChoiceDto ? aVar.g.a((RideCardTipsChoiceDto$ValueTipsChoiceDto) eVar, taxiOrderTipsState, fefVar, list) : null;
            if (f != null) {
                arrayList.add(f);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        bpk0 d = aVar.d.d(taxiOrderTipsState, list);
        boolean z = false;
        if (d != null) {
            int size = arrayList2.size();
            Integer num = rideCardItemDto$TipsWishSelector.c;
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
            return EmptyList.a;
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
