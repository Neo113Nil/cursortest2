package com.yandex.go.order.bundle.map.impl.data.repository;

import defpackage.ny61;
import defpackage.pu6;
import defpackage.tcc;
import defpackage.vpr;
import defpackage.w201;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;

    public c(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        FilterOverlayOrderRepositoryImpl$getScreenOrdersIdsFlow$$inlined$map$1$2$1 filterOverlayOrderRepositoryImpl$getScreenOrdersIdsFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof FilterOverlayOrderRepositoryImpl$getScreenOrdersIdsFlow$$inlined$map$1$2$1) {
            filterOverlayOrderRepositoryImpl$getScreenOrdersIdsFlow$$inlined$map$1$2$1 = (FilterOverlayOrderRepositoryImpl$getScreenOrdersIdsFlow$$inlined$map$1$2$1) continuation;
            int i2 = filterOverlayOrderRepositoryImpl$getScreenOrdersIdsFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                filterOverlayOrderRepositoryImpl$getScreenOrdersIdsFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = filterOverlayOrderRepositoryImpl$getScreenOrdersIdsFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = filterOverlayOrderRepositoryImpl$getScreenOrdersIdsFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : (List) obj) {
                        if (!(((w201) obj3) instanceof pu6)) {
                            arrayList.add(obj3);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((w201) it.next()).getId());
                    }
                    Set N0 = kotlin.collections.a.N0(arrayList2);
                    filterOverlayOrderRepositoryImpl$getScreenOrdersIdsFlow$$inlined$map$1$2$1.L$0 = null;
                    filterOverlayOrderRepositoryImpl$getScreenOrdersIdsFlow$$inlined$map$1$2$1.L$1 = null;
                    filterOverlayOrderRepositoryImpl$getScreenOrdersIdsFlow$$inlined$map$1$2$1.L$2 = null;
                    filterOverlayOrderRepositoryImpl$getScreenOrdersIdsFlow$$inlined$map$1$2$1.L$3 = null;
                    filterOverlayOrderRepositoryImpl$getScreenOrdersIdsFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(N0, filterOverlayOrderRepositoryImpl$getScreenOrdersIdsFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        filterOverlayOrderRepositoryImpl$getScreenOrdersIdsFlow$$inlined$map$1$2$1 = new FilterOverlayOrderRepositoryImpl$getScreenOrdersIdsFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = filterOverlayOrderRepositoryImpl$getScreenOrdersIdsFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = filterOverlayOrderRepositoryImpl$getScreenOrdersIdsFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
