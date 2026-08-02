package com.yandex.go.taxi.order.details.v2.state.elements.container.collapsing;

import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$CollapsingContainer;
import defpackage.bgk0;
import defpackage.idk0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rcc;
import defpackage.vdk0;
import defpackage.wls;
import defpackage.yjk0;
import defpackage.zjk0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "Lzjk0;", "uiStateMap", "<anonymous>", "(Ljava/util/Map;)Lzjk0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.state.elements.container.collapsing.RideCardCollapsingContainerItemDataSource$getCollapsingContainer$2", f = "RideCardCollapsingContainerItemDataSource.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardCollapsingContainerItemDataSource$getCollapsingContainer$2 extends SuspendLambda implements wls {
    final /* synthetic */ RideCardItemDto$CollapsingContainer $item;
    final /* synthetic */ List<String> $payloadIds;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardCollapsingContainerItemDataSource$getCollapsingContainer$2(RideCardItemDto$CollapsingContainer rideCardItemDto$CollapsingContainer, List list, Continuation continuation) {
        super(2, continuation);
        this.$item = rideCardItemDto$CollapsingContainer;
        this.$payloadIds = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RideCardCollapsingContainerItemDataSource$getCollapsingContainer$2 rideCardCollapsingContainerItemDataSource$getCollapsingContainer$2 = new RideCardCollapsingContainerItemDataSource$getCollapsingContainer$2(this.$item, this.$payloadIds, continuation);
        rideCardCollapsingContainerItemDataSource$getCollapsingContainer$2.L$0 = obj;
        return rideCardCollapsingContainerItemDataSource$getCollapsingContainer$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RideCardCollapsingContainerItemDataSource$getCollapsingContainer$2) create((Map) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        zjk0 zjk0Var;
        boolean z;
        Map map = (Map) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (!(((zjk0) entry.getValue()) instanceof yjk0)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (!linkedHashMap.isEmpty()) {
            Collection values = linkedHashMap.values();
            if (!(values instanceof Collection) || !values.isEmpty()) {
                Iterator it = values.iterator();
                while (it.hasNext()) {
                    if (!(((zjk0) it.next()) instanceof bgk0)) {
                        zjk0 zjk0Var2 = (zjk0) linkedHashMap.get(kotlin.collections.a.R(this.$payloadIds));
                        if (zjk0Var2 == null || !(zjk0Var2 instanceof bgk0)) {
                            zjk0Var2 = null;
                        }
                        zjk0 zjk0Var3 = (zjk0) linkedHashMap.get(kotlin.collections.a.b0(this.$payloadIds));
                        if (zjk0Var3 == null || !(zjk0Var3 instanceof bgk0)) {
                            zjk0Var3 = null;
                        }
                        List<String> list = this.$payloadIds;
                        ListBuilder a = rcc.a();
                        if (zjk0Var2 != null) {
                            a.add(zjk0Var2);
                        }
                        ArrayList arrayList = new ArrayList();
                        Iterator<T> it2 = list.iterator();
                        while (it2.hasNext()) {
                            zjk0 zjk0Var4 = (zjk0) linkedHashMap.get((String) it2.next());
                            if (zjk0Var4 != null) {
                                arrayList.add(zjk0Var4);
                            }
                        }
                        if (!arrayList.isEmpty() && (arrayList.size() != 1 || (((zjk0) arrayList.get(0)) instanceof bgk0))) {
                            ArrayList arrayList2 = new ArrayList(arrayList);
                            ListIterator listIterator = arrayList2.listIterator();
                            Object next = listIterator.next();
                            while (true) {
                                zjk0Var = (zjk0) next;
                                if (!(zjk0Var instanceof bgk0)) {
                                    break;
                                }
                                listIterator.remove();
                                next = listIterator.next();
                            }
                            do {
                                zjk0 zjk0Var5 = (zjk0) listIterator.next();
                                if (!(zjk0Var instanceof bgk0) || !(zjk0Var5 instanceof bgk0)) {
                                    zjk0Var = zjk0Var5;
                                } else if ((zjk0Var instanceof idk0) || !((z = zjk0Var5 instanceof idk0))) {
                                    listIterator.remove();
                                    zjk0Var = (zjk0) listIterator.previous();
                                    listIterator.next();
                                } else if (z) {
                                    listIterator.previous();
                                    listIterator.previous();
                                    listIterator.remove();
                                    zjk0Var = (zjk0) listIterator.next();
                                }
                            } while (listIterator.hasNext());
                            if (zjk0Var instanceof bgk0) {
                                listIterator.remove();
                            }
                            arrayList = arrayList2;
                        }
                        Iterator it3 = arrayList.iterator();
                        while (it3.hasNext()) {
                            a.add((zjk0) it3.next());
                        }
                        if (zjk0Var3 != null) {
                            a.add(zjk0Var3);
                        }
                        ListBuilder j = a.j();
                        RideCardItemDto$CollapsingContainer rideCardItemDto$CollapsingContainer = this.$item;
                        return new vdk0(rideCardItemDto$CollapsingContainer.a, rideCardItemDto$CollapsingContainer.b, j);
                    }
                }
            }
        }
        Object obj2 = linkedHashMap.get(this.$item.d);
        bgk0 bgk0Var = obj2 instanceof bgk0 ? (bgk0) obj2 : null;
        RideCardItemDto$CollapsingContainer rideCardItemDto$CollapsingContainer2 = this.$item;
        return bgk0Var == null ? new yjk0(rideCardItemDto$CollapsingContainer2.a) : new vdk0(rideCardItemDto$CollapsingContainer2.a, rideCardItemDto$CollapsingContainer2.b, Collections.singletonList(bgk0Var));
    }
}
