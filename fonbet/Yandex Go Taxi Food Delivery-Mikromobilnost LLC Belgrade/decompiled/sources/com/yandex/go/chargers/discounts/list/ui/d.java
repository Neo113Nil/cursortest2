package com.yandex.go.chargers.discounts.list.ui;

import com.yandex.go.chargers.discounts.ChargersDiscountsAnalyticsProxy$TaskState;
import com.yandex.go.chargers.discounts.api.ChargersDiscountsListEntryPoint;
import defpackage.ew9;
import defpackage.fw9;
import defpackage.gw00;
import defpackage.h73;
import defpackage.hh5;
import defpackage.lna;
import defpackage.ny61;
import defpackage.pu9;
import defpackage.rsn;
import defpackage.su9;
import defpackage.tcc;
import defpackage.tu9;
import defpackage.vpr;
import defpackage.wv9;
import defpackage.yv9;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class d implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ h b;
    public final /* synthetic */ ChargersDiscountsListEntryPoint c;
    public final /* synthetic */ String w;

    public d(vpr vprVar, h hVar, ChargersDiscountsListEntryPoint chargersDiscountsListEntryPoint, String str) {
        this.a = vprVar;
        this.b = hVar;
        this.c = chargersDiscountsListEntryPoint;
        this.w = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:137:0x0269, code lost:
    
        if (r0 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L136;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:158:0x00cc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0296 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0297 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v15, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r14v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v9 */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ChargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$2$2$1 chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$2$2$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        zy11 zy11Var;
        rsn rsnVar;
        Object obj2;
        vpr vprVar;
        ChargersDiscountsListUiState$Content$DiscountsTabType chargersDiscountsListUiState$Content$DiscountsTabType;
        Iterator it;
        Object obj3;
        wv9 wv9Var;
        ChargersDiscountsListUiState$Content$DiscountsTabType chargersDiscountsListUiState$Content$DiscountsTabType2;
        Object obj4;
        ?? r14;
        Object obj5;
        LinkedHashMap linkedHashMap;
        Object obj6;
        Object obj7;
        rsn rsnVar2;
        vpr vprVar2;
        lna lnaVar;
        List list;
        Object obj8;
        Object obj9;
        if (continuation instanceof ChargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$2$2$1) {
            chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$2$2$1 = (ChargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$2$2$1) continuation;
            int i2 = chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$2$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$2$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj10 = chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$2$2$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$2$2$1.label;
                zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj10);
                    rsnVar = (rsn) obj;
                    Object obj11 = rsnVar.a;
                    obj2 = rsnVar.b;
                    yv9 yv9Var = obj11 instanceof yv9 ? (yv9) obj11 : null;
                    yv9 yv9Var2 = obj2 instanceof yv9 ? (yv9) obj2 : null;
                    vprVar = this.a;
                    if (yv9Var2 == null) {
                        obj9 = null;
                        chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$2$2$1.L$0 = obj9;
                        chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$2$2$1.L$1 = obj9;
                        chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$2$2$1.L$2 = obj9;
                        chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$2$2$1.L$3 = obj9;
                        chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$2$2$1.L$4 = obj9;
                        chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$2$2$1.L$5 = obj9;
                        chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$2$2$1.L$6 = obj9;
                        chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$2$2$1.L$7 = obj9;
                        chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$2$2$1.L$8 = obj9;
                        chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$2$2$1.L$9 = obj9;
                        chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$2$2$1.L$10 = obj9;
                        chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$2$2$1.label = 2;
                        return vprVar.emit(obj2, chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$2$2$1) == coroutineSingletons ? coroutineSingletons : zy11Var;
                    }
                    List list2 = yv9Var2.c;
                    if (yv9Var != null && (list = yv9Var.c) != null) {
                        Iterator it2 = list.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj8 = null;
                                break;
                            }
                            obj8 = it2.next();
                            if (((wv9) obj8).c) {
                                break;
                            }
                        }
                        wv9 wv9Var2 = (wv9) obj8;
                        if (wv9Var2 != null) {
                            chargersDiscountsListUiState$Content$DiscountsTabType = wv9Var2.a;
                            List list3 = list2;
                            it = list3.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj3 = null;
                                    break;
                                }
                                obj3 = it.next();
                                if (((wv9) obj3).c) {
                                    break;
                                }
                            }
                            wv9Var = (wv9) obj3;
                            if (wv9Var != null && (chargersDiscountsListUiState$Content$DiscountsTabType2 = wv9Var.a) != null) {
                                if (chargersDiscountsListUiState$Content$DiscountsTabType != chargersDiscountsListUiState$Content$DiscountsTabType2) {
                                    chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$2$2$1.L$0 = null;
                                    chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$2$2$1.L$1 = null;
                                    chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$2$2$1.L$2 = null;
                                    chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$2$2$1.L$3 = null;
                                    chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$2$2$1.L$4 = vprVar;
                                    chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$2$2$1.L$5 = null;
                                    chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$2$2$1.L$6 = rsnVar;
                                    chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$2$2$1.L$7 = null;
                                    chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$2$2$1.L$8 = null;
                                    chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$2$2$1.L$9 = null;
                                    chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$2$2$1.L$10 = null;
                                    chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$2$2$1.label = 1;
                                    pu9 pu9Var = (pu9) kotlin.sequences.b.j(kotlin.sequences.b.g(kotlin.sequences.b.l(new h73(1, list3), new ew9(0)), fw9.a));
                                    h hVar = this.b;
                                    hh5 hh5Var = hVar.e;
                                    String str = yv9Var2.a;
                                    boolean z = yv9Var2.e != null;
                                    Iterator it3 = list3.iterator();
                                    while (true) {
                                        if (!it3.hasNext()) {
                                            obj4 = null;
                                            break;
                                        }
                                        obj4 = it3.next();
                                        if (((wv9) obj4).c) {
                                            break;
                                        }
                                    }
                                    wv9 wv9Var3 = (wv9) obj4;
                                    if (wv9Var3 != null) {
                                        List list4 = wv9Var3.f;
                                        r14 = new ArrayList(tcc.n(list4, 10));
                                        Iterator it4 = list4.iterator();
                                        while (it4.hasNext()) {
                                            r14.add(((tu9) it4.next()).b().b);
                                        }
                                    } else {
                                        r14 = 0;
                                    }
                                    if (r14 == 0) {
                                        r14 = EmptyList.a;
                                    }
                                    List list5 = r14;
                                    String str2 = (pu9Var == null || (lnaVar = pu9Var.d) == null) ? null : lnaVar.b;
                                    Iterator it5 = list3.iterator();
                                    while (true) {
                                        if (!it5.hasNext()) {
                                            obj5 = null;
                                            break;
                                        }
                                        obj5 = it5.next();
                                        wv9 wv9Var4 = (wv9) obj5;
                                        if (wv9Var4.a == ChargersDiscountsListUiState$Content$DiscountsTabType.TASKS && wv9Var4.c) {
                                            break;
                                        }
                                    }
                                    wv9 wv9Var5 = (wv9) obj5;
                                    if (wv9Var5 != null) {
                                        List list6 = wv9Var5.f;
                                        ArrayList arrayList = new ArrayList();
                                        for (Object obj12 : list6) {
                                            if (obj12 instanceof su9) {
                                                arrayList.add(obj12);
                                            }
                                        }
                                        int d = gw00.d(tcc.n(arrayList, 10));
                                        if (d < 16) {
                                            d = 16;
                                        }
                                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(d);
                                        Iterator it6 = arrayList.iterator();
                                        while (it6.hasNext()) {
                                            su9 su9Var = (su9) it6.next();
                                            String str3 = su9Var.a.b;
                                            int i3 = su9Var.f;
                                            Pair pair = new Pair(str3, i3 == 0 ? ChargersDiscountsAnalyticsProxy$TaskState.NEW : i3 == su9Var.d ? ChargersDiscountsAnalyticsProxy$TaskState.SUCCESS : ChargersDiscountsAnalyticsProxy$TaskState.IN_PROGRESS);
                                            linkedHashMap2.put(pair.c(), pair.f());
                                        }
                                        linkedHashMap = linkedHashMap2;
                                    } else {
                                        linkedHashMap = null;
                                    }
                                    hh5Var.e(this.c, str, chargersDiscountsListUiState$Content$DiscountsTabType2, z, list5, this.w, str2, linkedHashMap);
                                    Iterator it7 = list3.iterator();
                                    while (true) {
                                        if (!it7.hasNext()) {
                                            obj6 = null;
                                            break;
                                        }
                                        obj6 = it7.next();
                                        wv9 wv9Var6 = (wv9) obj6;
                                        if (wv9Var6.c && wv9Var6.e > 0) {
                                            break;
                                        }
                                    }
                                    wv9 wv9Var7 = (wv9) obj6;
                                    if (wv9Var7 != null) {
                                        com.yandex.go.chargers.discounts.list.data.a aVar = hVar.f;
                                        String name = wv9Var7.a.name();
                                        List list7 = wv9Var7.f;
                                        ArrayList arrayList2 = new ArrayList(tcc.n(list7, 10));
                                        Iterator it8 = list7.iterator();
                                        while (it8.hasNext()) {
                                            arrayList2.add(((tu9) it8.next()).b());
                                        }
                                        obj7 = aVar.b(name, arrayList2, chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$2$2$1);
                                    }
                                    obj7 = zy11Var;
                                    if (obj7 != coroutineSingletons) {
                                        rsnVar2 = rsnVar;
                                        vprVar2 = vprVar;
                                    }
                                }
                                obj2 = rsnVar.b;
                            }
                            obj9 = null;
                            chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$2$2$1.L$0 = obj9;
                            chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$2$2$1.L$1 = obj9;
                            chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$2$2$1.L$2 = obj9;
                            chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$2$2$1.L$3 = obj9;
                            chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$2$2$1.L$4 = obj9;
                            chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$2$2$1.L$5 = obj9;
                            chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$2$2$1.L$6 = obj9;
                            chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$2$2$1.L$7 = obj9;
                            chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$2$2$1.L$8 = obj9;
                            chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$2$2$1.L$9 = obj9;
                            chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$2$2$1.L$10 = obj9;
                            chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$2$2$1.label = 2;
                            if (vprVar.emit(obj2, chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$2$2$1) == coroutineSingletons) {
                            }
                        }
                    }
                    chargersDiscountsListUiState$Content$DiscountsTabType = null;
                    List list32 = list2;
                    it = list32.iterator();
                    while (true) {
                        if (it.hasNext()) {
                        }
                    }
                    wv9Var = (wv9) obj3;
                    if (wv9Var != null) {
                        if (chargersDiscountsListUiState$Content$DiscountsTabType != chargersDiscountsListUiState$Content$DiscountsTabType2) {
                        }
                        obj2 = rsnVar.b;
                    }
                    obj9 = null;
                    chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$2$2$1.L$0 = obj9;
                    chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$2$2$1.L$1 = obj9;
                    chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$2$2$1.L$2 = obj9;
                    chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$2$2$1.L$3 = obj9;
                    chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$2$2$1.L$4 = obj9;
                    chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$2$2$1.L$5 = obj9;
                    chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$2$2$1.L$6 = obj9;
                    chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$2$2$1.L$7 = obj9;
                    chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$2$2$1.L$8 = obj9;
                    chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$2$2$1.L$9 = obj9;
                    chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$2$2$1.L$10 = obj9;
                    chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$2$2$1.label = 2;
                    if (vprVar.emit(obj2, chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$2$2$1) == coroutineSingletons) {
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj10);
                        return zy11Var;
                    }
                    rsnVar2 = (rsn) chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$2$2$1.L$6;
                    vprVar2 = (vpr) chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$2$2$1.L$4;
                    kotlin.b.b(obj10);
                }
                rsnVar = rsnVar2;
                vprVar = vprVar2;
                obj2 = rsnVar.b;
                obj9 = null;
                chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$2$2$1.L$0 = obj9;
                chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$2$2$1.L$1 = obj9;
                chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$2$2$1.L$2 = obj9;
                chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$2$2$1.L$3 = obj9;
                chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$2$2$1.L$4 = obj9;
                chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$2$2$1.L$5 = obj9;
                chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$2$2$1.L$6 = obj9;
                chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$2$2$1.L$7 = obj9;
                chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$2$2$1.L$8 = obj9;
                chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$2$2$1.L$9 = obj9;
                chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$2$2$1.L$10 = obj9;
                chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$2$2$1.label = 2;
                if (vprVar.emit(obj2, chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$2$2$1) == coroutineSingletons) {
                }
            }
        }
        chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$2$2$1 = new ChargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$2$2$1(this, continuation);
        Object obj102 = chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$2$2$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$2$2$1.label;
        zy11Var = zy11.a;
        if (i != 0) {
        }
        rsnVar = rsnVar2;
        vprVar = vprVar2;
        obj2 = rsnVar.b;
        obj9 = null;
        chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$2$2$1.L$0 = obj9;
        chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$2$2$1.L$1 = obj9;
        chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$2$2$1.L$2 = obj9;
        chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$2$2$1.L$3 = obj9;
        chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$2$2$1.L$4 = obj9;
        chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$2$2$1.L$5 = obj9;
        chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$2$2$1.L$6 = obj9;
        chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$2$2$1.L$7 = obj9;
        chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$2$2$1.L$8 = obj9;
        chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$2$2$1.L$9 = obj9;
        chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$2$2$1.L$10 = obj9;
        chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$2$2$1.label = 2;
        if (vprVar.emit(obj2, chargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$map$2$2$1) == coroutineSingletons) {
        }
    }
}
