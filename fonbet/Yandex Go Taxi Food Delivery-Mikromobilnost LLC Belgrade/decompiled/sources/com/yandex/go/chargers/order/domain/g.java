package com.yandex.go.chargers.order.domain;

import defpackage.g6u;
import defpackage.gw00;
import defpackage.iy11;
import defpackage.ky11;
import defpackage.ny61;
import defpackage.o400;
import defpackage.rl9;
import defpackage.sjh;
import defpackage.taa;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.ul9;
import defpackage.uyj;
import defpackage.zy11;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class g {
    public final tt2 a;
    public final ky11 b;
    public final iy11 c;

    public g(tt2 tt2Var, ky11 ky11Var, iy11 iy11Var) {
        this.a = tt2Var;
        this.b = ky11Var;
        this.c = iy11Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0075, code lost:
    
        if (r12 == r1) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a7 A[LOOP:1: B:55:0x00a1->B:57:0x00a7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(rl9 rl9Var, rl9 rl9Var2, ContinuationImpl continuationImpl) {
        ChargersActiveOrdersStatusNotifier$trackOrdersStatusChange$1 chargersActiveOrdersStatusNotifier$trackOrdersStatusChange$1;
        int i;
        Boolean bool;
        boolean booleanValue;
        int d;
        Iterator it;
        boolean z;
        Map map;
        if (continuationImpl instanceof ChargersActiveOrdersStatusNotifier$trackOrdersStatusChange$1) {
            chargersActiveOrdersStatusNotifier$trackOrdersStatusChange$1 = (ChargersActiveOrdersStatusNotifier$trackOrdersStatusChange$1) continuationImpl;
            int i2 = chargersActiveOrdersStatusNotifier$trackOrdersStatusChange$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersActiveOrdersStatusNotifier$trackOrdersStatusChange$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersActiveOrdersStatusNotifier$trackOrdersStatusChange$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersActiveOrdersStatusNotifier$trackOrdersStatusChange$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    tpr tprVar = this.c.a;
                    chargersActiveOrdersStatusNotifier$trackOrdersStatusChange$1.L$0 = rl9Var;
                    chargersActiveOrdersStatusNotifier$trackOrdersStatusChange$1.L$1 = rl9Var2;
                    chargersActiveOrdersStatusNotifier$trackOrdersStatusChange$1.label = 1;
                    obj = kotlinx.coroutines.flow.e.A(tprVar, chargersActiveOrdersStatusNotifier$trackOrdersStatusChange$1);
                } else {
                    if (i != 1) {
                        if (i != 2 && i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z = chargersActiveOrdersStatusNotifier$trackOrdersStatusChange$1.Z$0;
                        it = (Iterator) chargersActiveOrdersStatusNotifier$trackOrdersStatusChange$1.L$5;
                        map = (Map) chargersActiveOrdersStatusNotifier$trackOrdersStatusChange$1.L$3;
                        kotlin.b.b(obj);
                        while (it.hasNext()) {
                            taa taaVar = (taa) it.next();
                            taa taaVar2 = (taa) map.get(taaVar.a());
                            if ((taaVar2 != null ? taaVar2.b() : null) != taaVar.b()) {
                                int i3 = ul9.a[taaVar.b().ordinal()];
                                tt2 tt2Var = this.a;
                                if (i3 == 1) {
                                    tt2Var.getClass();
                                    sjh sjhVar = uyj.a;
                                    g6u g6uVar = o400.a;
                                    ChargersActiveOrdersStatusNotifier$trackOrdersStatusChange$2$1 chargersActiveOrdersStatusNotifier$trackOrdersStatusChange$2$1 = new ChargersActiveOrdersStatusNotifier$trackOrdersStatusChange$2$1(this, taaVar, null);
                                    chargersActiveOrdersStatusNotifier$trackOrdersStatusChange$1.L$0 = null;
                                    chargersActiveOrdersStatusNotifier$trackOrdersStatusChange$1.L$1 = null;
                                    chargersActiveOrdersStatusNotifier$trackOrdersStatusChange$1.L$2 = null;
                                    chargersActiveOrdersStatusNotifier$trackOrdersStatusChange$1.L$3 = map;
                                    chargersActiveOrdersStatusNotifier$trackOrdersStatusChange$1.L$4 = null;
                                    chargersActiveOrdersStatusNotifier$trackOrdersStatusChange$1.L$5 = it;
                                    chargersActiveOrdersStatusNotifier$trackOrdersStatusChange$1.L$6 = null;
                                    chargersActiveOrdersStatusNotifier$trackOrdersStatusChange$1.L$7 = null;
                                    chargersActiveOrdersStatusNotifier$trackOrdersStatusChange$1.L$8 = null;
                                    chargersActiveOrdersStatusNotifier$trackOrdersStatusChange$1.Z$0 = z;
                                    chargersActiveOrdersStatusNotifier$trackOrdersStatusChange$1.label = 2;
                                    if (tje.k0(g6uVar, chargersActiveOrdersStatusNotifier$trackOrdersStatusChange$2$1, chargersActiveOrdersStatusNotifier$trackOrdersStatusChange$1) == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                } else if (i3 != 2) {
                                    continue;
                                } else {
                                    tt2Var.getClass();
                                    sjh sjhVar2 = uyj.a;
                                    g6u g6uVar2 = o400.a;
                                    ChargersActiveOrdersStatusNotifier$trackOrdersStatusChange$2$2 chargersActiveOrdersStatusNotifier$trackOrdersStatusChange$2$2 = new ChargersActiveOrdersStatusNotifier$trackOrdersStatusChange$2$2(this, taaVar, null);
                                    chargersActiveOrdersStatusNotifier$trackOrdersStatusChange$1.L$0 = null;
                                    chargersActiveOrdersStatusNotifier$trackOrdersStatusChange$1.L$1 = null;
                                    chargersActiveOrdersStatusNotifier$trackOrdersStatusChange$1.L$2 = null;
                                    chargersActiveOrdersStatusNotifier$trackOrdersStatusChange$1.L$3 = map;
                                    chargersActiveOrdersStatusNotifier$trackOrdersStatusChange$1.L$4 = null;
                                    chargersActiveOrdersStatusNotifier$trackOrdersStatusChange$1.L$5 = it;
                                    chargersActiveOrdersStatusNotifier$trackOrdersStatusChange$1.L$6 = null;
                                    chargersActiveOrdersStatusNotifier$trackOrdersStatusChange$1.L$7 = null;
                                    chargersActiveOrdersStatusNotifier$trackOrdersStatusChange$1.L$8 = null;
                                    chargersActiveOrdersStatusNotifier$trackOrdersStatusChange$1.Z$0 = z;
                                    chargersActiveOrdersStatusNotifier$trackOrdersStatusChange$1.label = 3;
                                    if (tje.k0(g6uVar2, chargersActiveOrdersStatusNotifier$trackOrdersStatusChange$2$2, chargersActiveOrdersStatusNotifier$trackOrdersStatusChange$1) == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                }
                            }
                        }
                        return zy11.a;
                    }
                    rl9Var2 = (rl9) chargersActiveOrdersStatusNotifier$trackOrdersStatusChange$1.L$1;
                    rl9Var = (rl9) chargersActiveOrdersStatusNotifier$trackOrdersStatusChange$1.L$0;
                    kotlin.b.b(obj);
                }
                bool = (Boolean) obj;
                if (bool != null && (booleanValue = bool.booleanValue())) {
                    List list = rl9Var.a;
                    d = gw00.d(tcc.n(list, 10));
                    if (d < 16) {
                        d = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(d);
                    for (Object obj2 : list) {
                        linkedHashMap.put(((taa) obj2).a(), obj2);
                    }
                    it = rl9Var2.a.iterator();
                    z = booleanValue;
                    map = linkedHashMap;
                    while (it.hasNext()) {
                    }
                }
                return zy11.a;
            }
        }
        chargersActiveOrdersStatusNotifier$trackOrdersStatusChange$1 = new ChargersActiveOrdersStatusNotifier$trackOrdersStatusChange$1(this, continuationImpl);
        Object obj3 = chargersActiveOrdersStatusNotifier$trackOrdersStatusChange$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersActiveOrdersStatusNotifier$trackOrdersStatusChange$1.label;
        if (i != 0) {
        }
        bool = (Boolean) obj3;
        if (bool != null) {
            List list2 = rl9Var.a;
            d = gw00.d(tcc.n(list2, 10));
            if (d < 16) {
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(d);
            while (r10.hasNext()) {
            }
            it = rl9Var2.a.iterator();
            z = booleanValue;
            map = linkedHashMap2;
            while (it.hasNext()) {
            }
        }
        return zy11.a;
    }
}
