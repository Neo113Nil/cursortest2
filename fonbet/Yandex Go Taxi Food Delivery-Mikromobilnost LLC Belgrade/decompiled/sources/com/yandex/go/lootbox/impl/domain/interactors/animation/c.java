package com.yandex.go.lootbox.impl.domain.interactors.animation;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.pqz;
import defpackage.qpz;
import defpackage.tcc;
import defpackage.tje;
import defpackage.vpr;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ e b;

    public c(vpr vprVar, e eVar) {
        this.a = vprVar;
        this.b = eVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x01d4, code lost:
    
        if (r1.emit(r4, r2) == r3) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Type inference failed for: r11v11, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r13v7, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0179 -> B:18:0x017b). Please report as a decompilation issue!!! */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        LootBoxAnimationInteractorImpl$attach$$inlined$map$2$2$1 lootBoxAnimationInteractorImpl$attach$$inlined$map$2$2$1;
        int i;
        vpr vprVar;
        ArrayList arrayList;
        Iterator it;
        vpr vprVar2;
        ArrayList arrayList2;
        Iterator it2;
        TaxiOrder taxiOrder;
        qpz qpzVar;
        if (continuation instanceof LootBoxAnimationInteractorImpl$attach$$inlined$map$2$2$1) {
            lootBoxAnimationInteractorImpl$attach$$inlined$map$2$2$1 = (LootBoxAnimationInteractorImpl$attach$$inlined$map$2$2$1) continuation;
            int i2 = lootBoxAnimationInteractorImpl$attach$$inlined$map$2$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lootBoxAnimationInteractorImpl$attach$$inlined$map$2$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = lootBoxAnimationInteractorImpl$attach$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = lootBoxAnimationInteractorImpl$attach$$inlined$map$2$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    vprVar = this.a;
                    List list = (List) obj;
                    arrayList = new ArrayList(tcc.n(list, 10));
                    it = list.iterator();
                    if (it.hasNext()) {
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    qpzVar = (qpz) lootBoxAnimationInteractorImpl$attach$$inlined$map$2$2$1.L$15;
                    TaxiOrder taxiOrder2 = (TaxiOrder) lootBoxAnimationInteractorImpl$attach$$inlined$map$2$2$1.L$14;
                    ?? r11 = (Collection) lootBoxAnimationInteractorImpl$attach$$inlined$map$2$2$1.L$13;
                    it2 = (Iterator) lootBoxAnimationInteractorImpl$attach$$inlined$map$2$2$1.L$10;
                    ?? r13 = (Collection) lootBoxAnimationInteractorImpl$attach$$inlined$map$2$2$1.L$9;
                    vprVar2 = (vpr) lootBoxAnimationInteractorImpl$attach$$inlined$map$2$2$1.L$4;
                    kotlin.b.b(obj2);
                    taxiOrder = taxiOrder2;
                    arrayList = r11;
                    arrayList2 = r13;
                    String str = taxiOrder.a;
                    lootBoxAnimationInteractorImpl$attach$$inlined$map$2$2$1.L$0 = null;
                    lootBoxAnimationInteractorImpl$attach$$inlined$map$2$2$1.L$1 = null;
                    lootBoxAnimationInteractorImpl$attach$$inlined$map$2$2$1.L$2 = null;
                    lootBoxAnimationInteractorImpl$attach$$inlined$map$2$2$1.L$3 = null;
                    lootBoxAnimationInteractorImpl$attach$$inlined$map$2$2$1.L$4 = vprVar2;
                    lootBoxAnimationInteractorImpl$attach$$inlined$map$2$2$1.L$5 = null;
                    lootBoxAnimationInteractorImpl$attach$$inlined$map$2$2$1.L$6 = null;
                    lootBoxAnimationInteractorImpl$attach$$inlined$map$2$2$1.L$7 = null;
                    lootBoxAnimationInteractorImpl$attach$$inlined$map$2$2$1.L$8 = null;
                    lootBoxAnimationInteractorImpl$attach$$inlined$map$2$2$1.L$9 = arrayList2;
                    lootBoxAnimationInteractorImpl$attach$$inlined$map$2$2$1.L$10 = it2;
                    lootBoxAnimationInteractorImpl$attach$$inlined$map$2$2$1.L$11 = null;
                    lootBoxAnimationInteractorImpl$attach$$inlined$map$2$2$1.L$12 = null;
                    lootBoxAnimationInteractorImpl$attach$$inlined$map$2$2$1.L$13 = arrayList;
                    lootBoxAnimationInteractorImpl$attach$$inlined$map$2$2$1.L$14 = null;
                    lootBoxAnimationInteractorImpl$attach$$inlined$map$2$2$1.L$15 = null;
                    lootBoxAnimationInteractorImpl$attach$$inlined$map$2$2$1.label = 2;
                    obj2 = ((com.yandex.go.lootbox.impl.data.mapper.promo.a) qpzVar).b(str, (List) obj2, lootBoxAnimationInteractorImpl$attach$$inlined$map$2$2$1);
                    if (obj2 != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
                if (i != 2) {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                    return zy11.a;
                }
                Collection collection = (Collection) lootBoxAnimationInteractorImpl$attach$$inlined$map$2$2$1.L$13;
                Iterator it3 = (Iterator) lootBoxAnimationInteractorImpl$attach$$inlined$map$2$2$1.L$10;
                ?? r112 = (Collection) lootBoxAnimationInteractorImpl$attach$$inlined$map$2$2$1.L$9;
                vpr vprVar3 = (vpr) lootBoxAnimationInteractorImpl$attach$$inlined$map$2$2$1.L$4;
                kotlin.b.b(obj2);
                ArrayList arrayList3 = r112;
                vprVar2 = vprVar3;
                collection.add((List) obj2);
                it = it3;
                arrayList = arrayList3;
                vprVar = vprVar2;
                if (it.hasNext()) {
                    taxiOrder = ((o2y0) it.next()).b();
                    if (!taxiOrder.I()) {
                        this.b.h.put(taxiOrder.a, taxiOrder.V().j());
                    }
                    tje.N(this.b.f.c(), null, null, new LootBoxAnimationInteractorImpl$attach$2$1$1(this.b, taxiOrder, null), 3);
                    e eVar = this.b;
                    qpz qpzVar2 = eVar.c;
                    ru.yandex.taxi.communications.b bVar = eVar.e;
                    List g = taxiOrder.V().g();
                    Set set = taxiOrder.l.U;
                    lootBoxAnimationInteractorImpl$attach$$inlined$map$2$2$1.L$0 = null;
                    lootBoxAnimationInteractorImpl$attach$$inlined$map$2$2$1.L$1 = null;
                    lootBoxAnimationInteractorImpl$attach$$inlined$map$2$2$1.L$2 = null;
                    lootBoxAnimationInteractorImpl$attach$$inlined$map$2$2$1.L$3 = null;
                    lootBoxAnimationInteractorImpl$attach$$inlined$map$2$2$1.L$4 = vprVar;
                    lootBoxAnimationInteractorImpl$attach$$inlined$map$2$2$1.L$5 = null;
                    lootBoxAnimationInteractorImpl$attach$$inlined$map$2$2$1.L$6 = null;
                    lootBoxAnimationInteractorImpl$attach$$inlined$map$2$2$1.L$7 = null;
                    lootBoxAnimationInteractorImpl$attach$$inlined$map$2$2$1.L$8 = null;
                    lootBoxAnimationInteractorImpl$attach$$inlined$map$2$2$1.L$9 = arrayList;
                    lootBoxAnimationInteractorImpl$attach$$inlined$map$2$2$1.L$10 = it;
                    lootBoxAnimationInteractorImpl$attach$$inlined$map$2$2$1.L$11 = null;
                    lootBoxAnimationInteractorImpl$attach$$inlined$map$2$2$1.L$12 = null;
                    lootBoxAnimationInteractorImpl$attach$$inlined$map$2$2$1.L$13 = arrayList;
                    lootBoxAnimationInteractorImpl$attach$$inlined$map$2$2$1.L$14 = taxiOrder;
                    lootBoxAnimationInteractorImpl$attach$$inlined$map$2$2$1.L$15 = qpzVar2;
                    lootBoxAnimationInteractorImpl$attach$$inlined$map$2$2$1.label = 1;
                    Object a = bVar.a(g, set, lootBoxAnimationInteractorImpl$attach$$inlined$map$2$2$1);
                    if (a != coroutineSingletons) {
                        vprVar2 = vprVar;
                        obj2 = a;
                        it2 = it;
                        qpzVar = qpzVar2;
                        arrayList2 = arrayList;
                        String str2 = taxiOrder.a;
                        lootBoxAnimationInteractorImpl$attach$$inlined$map$2$2$1.L$0 = null;
                        lootBoxAnimationInteractorImpl$attach$$inlined$map$2$2$1.L$1 = null;
                        lootBoxAnimationInteractorImpl$attach$$inlined$map$2$2$1.L$2 = null;
                        lootBoxAnimationInteractorImpl$attach$$inlined$map$2$2$1.L$3 = null;
                        lootBoxAnimationInteractorImpl$attach$$inlined$map$2$2$1.L$4 = vprVar2;
                        lootBoxAnimationInteractorImpl$attach$$inlined$map$2$2$1.L$5 = null;
                        lootBoxAnimationInteractorImpl$attach$$inlined$map$2$2$1.L$6 = null;
                        lootBoxAnimationInteractorImpl$attach$$inlined$map$2$2$1.L$7 = null;
                        lootBoxAnimationInteractorImpl$attach$$inlined$map$2$2$1.L$8 = null;
                        lootBoxAnimationInteractorImpl$attach$$inlined$map$2$2$1.L$9 = arrayList2;
                        lootBoxAnimationInteractorImpl$attach$$inlined$map$2$2$1.L$10 = it2;
                        lootBoxAnimationInteractorImpl$attach$$inlined$map$2$2$1.L$11 = null;
                        lootBoxAnimationInteractorImpl$attach$$inlined$map$2$2$1.L$12 = null;
                        lootBoxAnimationInteractorImpl$attach$$inlined$map$2$2$1.L$13 = arrayList;
                        lootBoxAnimationInteractorImpl$attach$$inlined$map$2$2$1.L$14 = null;
                        lootBoxAnimationInteractorImpl$attach$$inlined$map$2$2$1.L$15 = null;
                        lootBoxAnimationInteractorImpl$attach$$inlined$map$2$2$1.label = 2;
                        obj2 = ((com.yandex.go.lootbox.impl.data.mapper.promo.a) qpzVar).b(str2, (List) obj2, lootBoxAnimationInteractorImpl$attach$$inlined$map$2$2$1);
                        if (obj2 != coroutineSingletons) {
                            collection = arrayList;
                            it3 = it2;
                            arrayList3 = arrayList2;
                            collection.add((List) obj2);
                            it = it3;
                            arrayList = arrayList3;
                            vprVar = vprVar2;
                            if (it.hasNext()) {
                                ArrayList o = tcc.o(arrayList);
                                ArrayList arrayList4 = new ArrayList(tcc.n(o, 10));
                                Iterator it4 = o.iterator();
                                while (it4.hasNext()) {
                                    arrayList4.add(((pqz) it4.next()).a.getB());
                                }
                                lootBoxAnimationInteractorImpl$attach$$inlined$map$2$2$1.L$0 = null;
                                lootBoxAnimationInteractorImpl$attach$$inlined$map$2$2$1.L$1 = null;
                                lootBoxAnimationInteractorImpl$attach$$inlined$map$2$2$1.L$2 = null;
                                lootBoxAnimationInteractorImpl$attach$$inlined$map$2$2$1.L$3 = null;
                                lootBoxAnimationInteractorImpl$attach$$inlined$map$2$2$1.L$4 = null;
                                lootBoxAnimationInteractorImpl$attach$$inlined$map$2$2$1.L$5 = null;
                                lootBoxAnimationInteractorImpl$attach$$inlined$map$2$2$1.L$6 = null;
                                lootBoxAnimationInteractorImpl$attach$$inlined$map$2$2$1.L$7 = null;
                                lootBoxAnimationInteractorImpl$attach$$inlined$map$2$2$1.L$8 = null;
                                lootBoxAnimationInteractorImpl$attach$$inlined$map$2$2$1.L$9 = null;
                                lootBoxAnimationInteractorImpl$attach$$inlined$map$2$2$1.L$10 = null;
                                lootBoxAnimationInteractorImpl$attach$$inlined$map$2$2$1.L$11 = null;
                                lootBoxAnimationInteractorImpl$attach$$inlined$map$2$2$1.L$12 = null;
                                lootBoxAnimationInteractorImpl$attach$$inlined$map$2$2$1.L$13 = null;
                                lootBoxAnimationInteractorImpl$attach$$inlined$map$2$2$1.L$14 = null;
                                lootBoxAnimationInteractorImpl$attach$$inlined$map$2$2$1.label = 3;
                            }
                        }
                    }
                }
                return coroutineSingletons;
            }
        }
        lootBoxAnimationInteractorImpl$attach$$inlined$map$2$2$1 = new LootBoxAnimationInteractorImpl$attach$$inlined$map$2$2$1(this, continuation);
        Object obj22 = lootBoxAnimationInteractorImpl$attach$$inlined$map$2$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lootBoxAnimationInteractorImpl$attach$$inlined$map$2$2$1.label;
        if (i != 0) {
        }
    }
}
