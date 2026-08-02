package com.yandex.go.order.bundle.map.impl.data.repository;

import defpackage.gw00;
import defpackage.lia1;
import defpackage.ny61;
import defpackage.pu6;
import defpackage.tcc;
import defpackage.vpr;
import defpackage.w201;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class e implements vpr {
    public final /* synthetic */ vpr a;

    public e(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        FilterOverlayOrderRepositoryImpl$special$$inlined$map$1$2$1 filterOverlayOrderRepositoryImpl$special$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof FilterOverlayOrderRepositoryImpl$special$$inlined$map$1$2$1) {
            filterOverlayOrderRepositoryImpl$special$$inlined$map$1$2$1 = (FilterOverlayOrderRepositoryImpl$special$$inlined$map$1$2$1) continuation;
            int i2 = filterOverlayOrderRepositoryImpl$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                filterOverlayOrderRepositoryImpl$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = filterOverlayOrderRepositoryImpl$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = filterOverlayOrderRepositoryImpl$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    List<pu6> list = (List) obj;
                    int d = gw00.d(tcc.n(list, 10));
                    if (d < 16) {
                        d = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(d);
                    for (pu6 pu6Var : list) {
                        String e = lia1.e(pu6Var);
                        List list2 = pu6Var.g;
                        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((w201) it.next()).getId());
                        }
                        linkedHashMap.put(e, kotlin.collections.a.N0(arrayList));
                    }
                    filterOverlayOrderRepositoryImpl$special$$inlined$map$1$2$1.L$0 = null;
                    filterOverlayOrderRepositoryImpl$special$$inlined$map$1$2$1.L$1 = null;
                    filterOverlayOrderRepositoryImpl$special$$inlined$map$1$2$1.L$2 = null;
                    filterOverlayOrderRepositoryImpl$special$$inlined$map$1$2$1.L$3 = null;
                    filterOverlayOrderRepositoryImpl$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(linkedHashMap, filterOverlayOrderRepositoryImpl$special$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        filterOverlayOrderRepositoryImpl$special$$inlined$map$1$2$1 = new FilterOverlayOrderRepositoryImpl$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = filterOverlayOrderRepositoryImpl$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = filterOverlayOrderRepositoryImpl$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
