package com.yandex.go.taxi.order.details.v2.state.elements.container.collapsing;

import com.yandex.go.slot.dto.d0;
import com.yandex.go.taxi.order.details.v2.state.RideCardPresentationType;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$CollapsingContainer;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$Promoblock;
import com.yandex.go.taxi.order.models.api.response.a7;
import defpackage.gmk0;
import defpackage.gw00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rcc;
import defpackage.tcc;
import defpackage.vdk0;
import defpackage.yjk0;
import defpackage.zjk0;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000 \n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u00072\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "Lru/yandex/taxi/communications/model/CommunicationItem;", "communications", "", "", "Lcom/yandex/go/taxi/order/models/api/response/a7;", "itemPool", "Lzjk0;", "<anonymous>", "(Ljava/util/List;Ljava/util/Map;)Lzjk0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.state.elements.container.collapsing.RideCardCollapsingContainerItemDataSource$getPromoPlaquesContainer$2", f = "RideCardCollapsingContainerItemDataSource.kt", l = {HProv.PROV_GOST_2001_DH}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardCollapsingContainerItemDataSource$getPromoPlaquesContainer$2 extends SuspendLambda implements zls {
    final /* synthetic */ RideCardItemDto$CollapsingContainer $item;
    final /* synthetic */ RideCardPresentationType $presentationType;
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardCollapsingContainerItemDataSource$getPromoPlaquesContainer$2(RideCardItemDto$CollapsingContainer rideCardItemDto$CollapsingContainer, c cVar, RideCardPresentationType rideCardPresentationType, Continuation continuation) {
        super(3, continuation);
        this.$item = rideCardItemDto$CollapsingContainer;
        this.this$0 = cVar;
        this.$presentationType = rideCardPresentationType;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        RideCardCollapsingContainerItemDataSource$getPromoPlaquesContainer$2 rideCardCollapsingContainerItemDataSource$getPromoPlaquesContainer$2 = new RideCardCollapsingContainerItemDataSource$getPromoPlaquesContainer$2(this.$item, this.this$0, this.$presentationType, (Continuation) obj3);
        rideCardCollapsingContainerItemDataSource$getPromoPlaquesContainer$2.L$0 = (Map) obj2;
        return rideCardCollapsingContainerItemDataSource$getPromoPlaquesContainer$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        RideCardCollapsingContainerItemDataSource$getPromoPlaquesContainer$2 rideCardCollapsingContainerItemDataSource$getPromoPlaquesContainer$2;
        List list;
        Map map;
        zjk0 b;
        Map map2 = (Map) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            List list2 = this.$item.c;
            Map map3 = (Map) this.this$0.b.j.a.getValue();
            ArrayList arrayList = new ArrayList();
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                a7 a7Var = (a7) map2.get((String) it.next());
                if (a7Var != null) {
                    arrayList.add(a7Var);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                if (next instanceof RideCardItemDto$Promoblock) {
                    arrayList2.add(next);
                }
            }
            int d = gw00.d(tcc.n(arrayList2, 10));
            if (d < 16) {
                d = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(d);
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                Object next2 = it3.next();
                linkedHashMap.put(((a7) next2).getA(), next2);
            }
            com.yandex.go.taxi.order.details.v2.state.elements.promoblock.b bVar = this.this$0.c;
            RideCardItemDto$CollapsingContainer rideCardItemDto$CollapsingContainer = this.$item;
            String str = rideCardItemDto$CollapsingContainer.a;
            String str2 = rideCardItemDto$CollapsingContainer.b;
            RideCardPresentationType rideCardPresentationType = this.$presentationType;
            this.L$0 = null;
            this.L$1 = list2;
            this.L$2 = map3;
            this.L$3 = null;
            this.label = 1;
            rideCardCollapsingContainerItemDataSource$getPromoPlaquesContainer$2 = this;
            obj = bVar.b(str, list2, linkedHashMap, map3, str2, rideCardPresentationType, rideCardCollapsingContainerItemDataSource$getPromoPlaquesContainer$2);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            list = list2;
            map = map3;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            map = (Map) this.L$2;
            list = (List) this.L$1;
            kotlin.b.b(obj);
            rideCardCollapsingContainerItemDataSource$getPromoPlaquesContainer$2 = this;
        }
        gmk0 gmk0Var = (gmk0) obj;
        if (gmk0Var == null || gmk0Var.c.isEmpty()) {
            d0 d0Var = (d0) map.get(rideCardCollapsingContainerItemDataSource$getPromoPlaquesContainer$2.$item.d);
            if (d0Var == null || (b = rideCardCollapsingContainerItemDataSource$getPromoPlaquesContainer$2.this$0.a.b(d0Var)) == null) {
                return new yjk0(rideCardCollapsingContainerItemDataSource$getPromoPlaquesContainer$2.$item.a);
            }
            RideCardItemDto$CollapsingContainer rideCardItemDto$CollapsingContainer2 = rideCardCollapsingContainerItemDataSource$getPromoPlaquesContainer$2.$item;
            return new vdk0(rideCardItemDto$CollapsingContainer2.a, rideCardItemDto$CollapsingContainer2.b, Collections.singletonList(b));
        }
        d0 d0Var2 = (d0) map.get(kotlin.collections.a.R(list));
        zjk0 b2 = d0Var2 != null ? rideCardCollapsingContainerItemDataSource$getPromoPlaquesContainer$2.this$0.a.b(d0Var2) : null;
        d0 d0Var3 = (d0) map.get(kotlin.collections.a.b0(list));
        zjk0 b3 = d0Var3 != null ? rideCardCollapsingContainerItemDataSource$getPromoPlaquesContainer$2.this$0.a.b(d0Var3) : null;
        ListBuilder a = rcc.a();
        if (b2 != null) {
            a.add(b2);
        }
        a.add(gmk0Var);
        if (b3 != null) {
            a.add(b3);
        }
        ListBuilder j = a.j();
        RideCardItemDto$CollapsingContainer rideCardItemDto$CollapsingContainer3 = rideCardCollapsingContainerItemDataSource$getPromoPlaquesContainer$2.$item;
        return new vdk0(rideCardItemDto$CollapsingContainer3.a, rideCardItemDto$CollapsingContainer3.b, j);
    }
}
