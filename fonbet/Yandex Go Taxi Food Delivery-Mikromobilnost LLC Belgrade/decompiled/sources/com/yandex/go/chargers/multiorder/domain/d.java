package com.yandex.go.chargers.multiorder.domain;

import defpackage.ny61;
import defpackage.taa;
import defpackage.tcc;
import defpackage.vpr;
import defpackage.xda;
import defpackage.zda;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes.dex */
public final class d implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ zda b;

    public d(vpr vprVar, zda zdaVar) {
        this.a = vprVar;
        this.b = zdaVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e8, code lost:
    
        if (r7.emit((java.util.List) r10, r0) == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00bc -> B:17:0x00bd). Please report as a decompilation issue!!! */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ChargersOrderTrackingSourceInteractor$listenOrders$$inlined$map$2$2$1 chargersOrderTrackingSourceInteractor$listenOrders$$inlined$map$2$2$1;
        int i;
        vpr vprVar;
        Iterator it;
        Collection collection;
        if (continuation instanceof ChargersOrderTrackingSourceInteractor$listenOrders$$inlined$map$2$2$1) {
            chargersOrderTrackingSourceInteractor$listenOrders$$inlined$map$2$2$1 = (ChargersOrderTrackingSourceInteractor$listenOrders$$inlined$map$2$2$1) continuation;
            int i2 = chargersOrderTrackingSourceInteractor$listenOrders$$inlined$map$2$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersOrderTrackingSourceInteractor$listenOrders$$inlined$map$2$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = chargersOrderTrackingSourceInteractor$listenOrders$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersOrderTrackingSourceInteractor$listenOrders$$inlined$map$2$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    List list = (List) obj;
                    ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                    Iterator it2 = list.iterator();
                    vprVar = this.a;
                    it = it2;
                    collection = arrayList;
                    if (it.hasNext()) {
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                    return zy11.a;
                }
                collection = (Collection) chargersOrderTrackingSourceInteractor$listenOrders$$inlined$map$2$2$1.L$13;
                it = (Iterator) chargersOrderTrackingSourceInteractor$listenOrders$$inlined$map$2$2$1.L$10;
                Collection collection2 = (Collection) chargersOrderTrackingSourceInteractor$listenOrders$$inlined$map$2$2$1.L$9;
                vprVar = (vpr) chargersOrderTrackingSourceInteractor$listenOrders$$inlined$map$2$2$1.L$4;
                kotlin.b.b(obj2);
                collection.add((xda) obj2);
                collection = collection2;
                if (it.hasNext()) {
                    taa taaVar = (taa) it.next();
                    a aVar = (a) this.b.e;
                    chargersOrderTrackingSourceInteractor$listenOrders$$inlined$map$2$2$1.L$0 = null;
                    chargersOrderTrackingSourceInteractor$listenOrders$$inlined$map$2$2$1.L$1 = null;
                    chargersOrderTrackingSourceInteractor$listenOrders$$inlined$map$2$2$1.L$2 = null;
                    chargersOrderTrackingSourceInteractor$listenOrders$$inlined$map$2$2$1.L$3 = null;
                    chargersOrderTrackingSourceInteractor$listenOrders$$inlined$map$2$2$1.L$4 = vprVar;
                    chargersOrderTrackingSourceInteractor$listenOrders$$inlined$map$2$2$1.L$5 = null;
                    chargersOrderTrackingSourceInteractor$listenOrders$$inlined$map$2$2$1.L$6 = null;
                    chargersOrderTrackingSourceInteractor$listenOrders$$inlined$map$2$2$1.L$7 = null;
                    chargersOrderTrackingSourceInteractor$listenOrders$$inlined$map$2$2$1.L$8 = null;
                    chargersOrderTrackingSourceInteractor$listenOrders$$inlined$map$2$2$1.L$9 = collection;
                    chargersOrderTrackingSourceInteractor$listenOrders$$inlined$map$2$2$1.L$10 = it;
                    chargersOrderTrackingSourceInteractor$listenOrders$$inlined$map$2$2$1.L$11 = null;
                    chargersOrderTrackingSourceInteractor$listenOrders$$inlined$map$2$2$1.L$12 = null;
                    chargersOrderTrackingSourceInteractor$listenOrders$$inlined$map$2$2$1.L$13 = collection;
                    chargersOrderTrackingSourceInteractor$listenOrders$$inlined$map$2$2$1.label = 1;
                    obj2 = aVar.a(taaVar, chargersOrderTrackingSourceInteractor$listenOrders$$inlined$map$2$2$1);
                    if (obj2 != coroutineSingletons) {
                        collection2 = collection;
                        collection.add((xda) obj2);
                        collection = collection2;
                        if (it.hasNext()) {
                            chargersOrderTrackingSourceInteractor$listenOrders$$inlined$map$2$2$1.L$0 = null;
                            chargersOrderTrackingSourceInteractor$listenOrders$$inlined$map$2$2$1.L$1 = null;
                            chargersOrderTrackingSourceInteractor$listenOrders$$inlined$map$2$2$1.L$2 = null;
                            chargersOrderTrackingSourceInteractor$listenOrders$$inlined$map$2$2$1.L$3 = null;
                            chargersOrderTrackingSourceInteractor$listenOrders$$inlined$map$2$2$1.L$4 = null;
                            chargersOrderTrackingSourceInteractor$listenOrders$$inlined$map$2$2$1.L$5 = null;
                            chargersOrderTrackingSourceInteractor$listenOrders$$inlined$map$2$2$1.L$6 = null;
                            chargersOrderTrackingSourceInteractor$listenOrders$$inlined$map$2$2$1.L$7 = null;
                            chargersOrderTrackingSourceInteractor$listenOrders$$inlined$map$2$2$1.L$8 = null;
                            chargersOrderTrackingSourceInteractor$listenOrders$$inlined$map$2$2$1.L$9 = null;
                            chargersOrderTrackingSourceInteractor$listenOrders$$inlined$map$2$2$1.L$10 = null;
                            chargersOrderTrackingSourceInteractor$listenOrders$$inlined$map$2$2$1.L$11 = null;
                            chargersOrderTrackingSourceInteractor$listenOrders$$inlined$map$2$2$1.L$12 = null;
                            chargersOrderTrackingSourceInteractor$listenOrders$$inlined$map$2$2$1.L$13 = null;
                            chargersOrderTrackingSourceInteractor$listenOrders$$inlined$map$2$2$1.label = 2;
                        }
                    }
                }
                return coroutineSingletons;
            }
        }
        chargersOrderTrackingSourceInteractor$listenOrders$$inlined$map$2$2$1 = new ChargersOrderTrackingSourceInteractor$listenOrders$$inlined$map$2$2$1(this, continuation);
        Object obj22 = chargersOrderTrackingSourceInteractor$listenOrders$$inlined$map$2$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersOrderTrackingSourceInteractor$listenOrders$$inlined$map$2$2$1.label;
        if (i != 0) {
        }
    }
}
