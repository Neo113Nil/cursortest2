package com.yandex.go.taxi.order.details.v2.state.elements.promoblock;

import com.yandex.go.slot.dto.d0;
import com.yandex.go.taxi.order.api.models.PromoPlaqueItem$DisplayOnType;
import com.yandex.go.taxi.order.api.models.PromoPlaqueItem$DividerType;
import com.yandex.go.taxi.order.details.v2.state.RideCardPresentationType;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import defpackage.a3y0;
import defpackage.cgk0;
import defpackage.dmk0;
import defpackage.emk0;
import defpackage.fck0;
import defpackage.fkk0;
import defpackage.fmk0;
import defpackage.gkk0;
import defpackage.gmk0;
import defpackage.h73;
import defpackage.hkk0;
import defpackage.jdk0;
import defpackage.kpf0;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.rcc;
import defpackage.scc;
import defpackage.zjk0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.builders.ListBuilder;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.communications.model.CommunicationItem;
import ru.yandex.taxi.communications.model.ConfigurationType;

/* loaded from: classes14.dex */
public final class b {
    public final cgk0 a;
    public final c b;
    public final o2y0 c;
    public final a3y0 d = new a3y0(TaxiOrderLogGroup.RIDE_CARD.getTag(), "PromoPlaqueItemsDataSource");

    public b(cgk0 cgk0Var, c cVar, o2y0 o2y0Var) {
        this.a = cgk0Var;
        this.b = cVar;
        this.c = o2y0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(Map map, ContinuationImpl continuationImpl) {
        RideCardPromoPlaqueItemsDataSource$filterCommunicationItems$1 rideCardPromoPlaqueItemsDataSource$filterCommunicationItems$1;
        int i;
        if (continuationImpl instanceof RideCardPromoPlaqueItemsDataSource$filterCommunicationItems$1) {
            rideCardPromoPlaqueItemsDataSource$filterCommunicationItems$1 = (RideCardPromoPlaqueItemsDataSource$filterCommunicationItems$1) continuationImpl;
            int i2 = rideCardPromoPlaqueItemsDataSource$filterCommunicationItems$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rideCardPromoPlaqueItemsDataSource$filterCommunicationItems$1.label = i2 - Integer.MIN_VALUE;
                Object obj = rideCardPromoPlaqueItemsDataSource$filterCommunicationItems$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rideCardPromoPlaqueItemsDataSource$filterCommunicationItems$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ArrayList arrayList = new ArrayList(map.size());
                    Iterator it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        arrayList.add(((dmk0) ((Map.Entry) it.next()).getValue()).c);
                    }
                    rideCardPromoPlaqueItemsDataSource$filterCommunicationItems$1.L$0 = null;
                    rideCardPromoPlaqueItemsDataSource$filterCommunicationItems$1.L$1 = null;
                    rideCardPromoPlaqueItemsDataSource$filterCommunicationItems$1.label = 1;
                    obj = this.b.b(arrayList, this.c, rideCardPromoPlaqueItemsDataSource$filterCommunicationItems$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : (Iterable) obj) {
                    CommunicationItem communicationItem = (CommunicationItem) obj2;
                    if (communicationItem.i.a() == ConfigurationType.LIST || communicationItem.i.a() == ConfigurationType.BUBBLE) {
                        arrayList2.add(obj2);
                    }
                }
                return arrayList2;
            }
        }
        rideCardPromoPlaqueItemsDataSource$filterCommunicationItems$1 = new RideCardPromoPlaqueItemsDataSource$filterCommunicationItems$1(this, continuationImpl);
        Object obj3 = rideCardPromoPlaqueItemsDataSource$filterCommunicationItems$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rideCardPromoPlaqueItemsDataSource$filterCommunicationItems$1.label;
        if (i != 0) {
        }
        ArrayList arrayList22 = new ArrayList();
        while (r6.hasNext()) {
        }
        return arrayList22;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01bd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01b3 A[EDGE_INSN: B:73:0x01b3->B:64:0x01b3 BREAK  A[LOOP:1: B:28:0x0115->B:52:0x0115], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, List list, LinkedHashMap linkedHashMap, Map map, String str2, RideCardPresentationType rideCardPresentationType, ContinuationImpl continuationImpl) {
        RideCardPromoPlaqueItemsDataSource$mapItems$1 rideCardPromoPlaqueItemsDataSource$mapItems$1;
        int i;
        Map map2;
        RideCardPresentationType rideCardPresentationType2;
        List list2;
        String str3;
        Map map3;
        String str4;
        List<CommunicationItem> list3;
        Map j;
        int i2;
        ListBuilder j2;
        PromoPlaqueItem$DisplayOnType promoPlaqueItem$DisplayOnType;
        if (continuationImpl instanceof RideCardPromoPlaqueItemsDataSource$mapItems$1) {
            rideCardPromoPlaqueItemsDataSource$mapItems$1 = (RideCardPromoPlaqueItemsDataSource$mapItems$1) continuationImpl;
            int i3 = rideCardPromoPlaqueItemsDataSource$mapItems$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                rideCardPromoPlaqueItemsDataSource$mapItems$1.label = i3 - Integer.MIN_VALUE;
                Object obj = rideCardPromoPlaqueItemsDataSource$mapItems$1.result;
                Serializable serializable = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rideCardPromoPlaqueItemsDataSource$mapItems$1.label;
                int i4 = 1;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Map r = kotlin.collections.b.r(kotlin.sequences.b.o(new h73(1, linkedHashMap.values()), new jdk0(20)));
                    rideCardPromoPlaqueItemsDataSource$mapItems$1.L$0 = str;
                    rideCardPromoPlaqueItemsDataSource$mapItems$1.L$1 = list;
                    rideCardPromoPlaqueItemsDataSource$mapItems$1.L$2 = null;
                    map2 = map;
                    rideCardPromoPlaqueItemsDataSource$mapItems$1.L$3 = map2;
                    rideCardPromoPlaqueItemsDataSource$mapItems$1.L$4 = str2;
                    rideCardPresentationType2 = rideCardPresentationType;
                    rideCardPromoPlaqueItemsDataSource$mapItems$1.L$5 = rideCardPresentationType2;
                    rideCardPromoPlaqueItemsDataSource$mapItems$1.L$6 = r;
                    rideCardPromoPlaqueItemsDataSource$mapItems$1.label = 1;
                    Serializable a = a(r, rideCardPromoPlaqueItemsDataSource$mapItems$1);
                    if (a == serializable) {
                        return serializable;
                    }
                    list2 = list;
                    str3 = str2;
                    map3 = r;
                    obj = a;
                    str4 = str;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    map3 = (Map) rideCardPromoPlaqueItemsDataSource$mapItems$1.L$6;
                    RideCardPresentationType rideCardPresentationType3 = (RideCardPresentationType) rideCardPromoPlaqueItemsDataSource$mapItems$1.L$5;
                    str3 = (String) rideCardPromoPlaqueItemsDataSource$mapItems$1.L$4;
                    map2 = (Map) rideCardPromoPlaqueItemsDataSource$mapItems$1.L$3;
                    list2 = (List) rideCardPromoPlaqueItemsDataSource$mapItems$1.L$1;
                    str4 = (String) rideCardPromoPlaqueItemsDataSource$mapItems$1.L$0;
                    kotlin.b.b(obj);
                    rideCardPresentationType2 = rideCardPresentationType3;
                }
                list3 = (List) obj;
                if (list3.isEmpty()) {
                    MapBuilder mapBuilder = new MapBuilder();
                    for (CommunicationItem communicationItem : list3) {
                        dmk0 dmk0Var = (dmk0) map3.get(communicationItem.a);
                        if (dmk0Var != null) {
                            String str5 = dmk0Var.a;
                            mapBuilder.put(str5, new dmk0(str5, dmk0Var.b, communicationItem));
                        }
                    }
                    j = mapBuilder.j();
                } else {
                    j = kotlin.collections.b.f();
                }
                MapBuilder mapBuilder2 = new MapBuilder();
                for (Map.Entry entry : map2.entrySet()) {
                    String str6 = (String) entry.getKey();
                    zjk0 b = this.a.b((d0) entry.getValue());
                    hkk0 hkk0Var = b instanceof hkk0 ? (hkk0) b : null;
                    if (hkk0Var != null) {
                        mapBuilder2.put(str6, hkk0Var);
                    }
                }
                MapBuilder j3 = mapBuilder2.j();
                ListBuilder a2 = rcc.a();
                i2 = 0;
                while (true) {
                    if (i2 >= list2.size()) {
                        break;
                    }
                    dmk0 dmk0Var2 = (dmk0) j.get((String) list2.get(i2));
                    if (dmk0Var2 == null) {
                        i2++;
                    } else {
                        String str7 = dmk0Var2.b;
                        String str8 = dmk0Var2.a;
                        CommunicationItem communicationItem2 = dmk0Var2.c;
                        int i5 = i2 + 1;
                        if (i5 == scc.f(list2)) {
                            a2.add(new fmk0(str8, str7, new kpf0(communicationItem2, PromoPlaqueItem$DividerType.NONE, PromoPlaqueItem$DisplayOnType.DETAILS)));
                            break;
                        }
                        int f = scc.f(list2);
                        if (i5 <= f) {
                            f = i5;
                        }
                        hkk0 hkk0Var2 = (hkk0) j3.get((String) list2.get(f));
                        PromoPlaqueItem$DividerType promoPlaqueItem$DividerType = hkk0Var2 instanceof fkk0 ? PromoPlaqueItem$DividerType.MARGIN_BOTTOM : hkk0Var2 instanceof gkk0 ? PromoPlaqueItem$DividerType.ICON_MARGIN_BOTTOM : PromoPlaqueItem$DividerType.NONE;
                        Map map4 = j;
                        int i6 = emk0.a[rideCardPresentationType2.ordinal()];
                        if (i6 == i4) {
                            promoPlaqueItem$DisplayOnType = PromoPlaqueItem$DisplayOnType.DETAILS;
                        } else if (i6 != 2) {
                            a3y0.m(this.d, "promoblockItemUiState", null, new fck0(rideCardPresentationType2, 1), 2);
                            j = map4;
                            i4 = 1;
                        } else {
                            promoPlaqueItem$DisplayOnType = PromoPlaqueItem$DisplayOnType.MULTI_ORDER;
                        }
                        a2.add(new fmk0(str8, str7, new kpf0(communicationItem2, promoPlaqueItem$DividerType, promoPlaqueItem$DisplayOnType)));
                        if (hkk0Var2 != null) {
                            i2 = i5;
                        }
                        i2++;
                        j = map4;
                        i4 = 1;
                    }
                }
                j2 = a2.j();
                if (j2.isEmpty()) {
                    return new gmk0(str4, str3, j2);
                }
                return null;
            }
        }
        rideCardPromoPlaqueItemsDataSource$mapItems$1 = new RideCardPromoPlaqueItemsDataSource$mapItems$1(this, continuationImpl);
        Object obj2 = rideCardPromoPlaqueItemsDataSource$mapItems$1.result;
        Serializable serializable2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rideCardPromoPlaqueItemsDataSource$mapItems$1.label;
        int i42 = 1;
        if (i != 0) {
        }
        list3 = (List) obj2;
        if (list3.isEmpty()) {
        }
        MapBuilder mapBuilder22 = new MapBuilder();
        while (r4.hasNext()) {
        }
        MapBuilder j32 = mapBuilder22.j();
        ListBuilder a22 = rcc.a();
        i2 = 0;
        while (true) {
            if (i2 >= list2.size()) {
            }
        }
        j2 = a22.j();
        if (j2.isEmpty()) {
        }
    }
}
