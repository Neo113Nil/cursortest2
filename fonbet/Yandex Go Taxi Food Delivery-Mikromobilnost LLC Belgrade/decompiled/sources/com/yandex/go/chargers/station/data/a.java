package com.yandex.go.chargers.station.data;

import defpackage.ny61;
import defpackage.rl9;
import defpackage.vpr;
import defpackage.z8y;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ c b;
    public final /* synthetic */ String c;

    public a(vpr vprVar, c cVar, String str) {
        this.a = vprVar;
        this.b = cVar;
        this.c = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ChargersStationDetailsRepository$activeOrdersCountFlow$$inlined$map$1$2$1 chargersStationDetailsRepository$activeOrdersCountFlow$$inlined$map$1$2$1;
        int i;
        int size;
        if (continuation instanceof ChargersStationDetailsRepository$activeOrdersCountFlow$$inlined$map$1$2$1) {
            chargersStationDetailsRepository$activeOrdersCountFlow$$inlined$map$1$2$1 = (ChargersStationDetailsRepository$activeOrdersCountFlow$$inlined$map$1$2$1) continuation;
            int i2 = chargersStationDetailsRepository$activeOrdersCountFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersStationDetailsRepository$activeOrdersCountFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = chargersStationDetailsRepository$activeOrdersCountFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersStationDetailsRepository$activeOrdersCountFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    List list = ((rl9) kotlinx.coroutines.flow.e.d(this.b.n.d).a.getValue()).a;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : list) {
                        if (obj3 instanceof z8y) {
                            arrayList.add(obj3);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            if (((z8y) it.next()).a.equals(this.c)) {
                                size = 1;
                                break;
                            }
                        }
                    }
                    size = arrayList.size();
                    Integer num = new Integer(size);
                    chargersStationDetailsRepository$activeOrdersCountFlow$$inlined$map$1$2$1.L$0 = null;
                    chargersStationDetailsRepository$activeOrdersCountFlow$$inlined$map$1$2$1.L$1 = null;
                    chargersStationDetailsRepository$activeOrdersCountFlow$$inlined$map$1$2$1.L$2 = null;
                    chargersStationDetailsRepository$activeOrdersCountFlow$$inlined$map$1$2$1.L$3 = null;
                    chargersStationDetailsRepository$activeOrdersCountFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(num, chargersStationDetailsRepository$activeOrdersCountFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        chargersStationDetailsRepository$activeOrdersCountFlow$$inlined$map$1$2$1 = new ChargersStationDetailsRepository$activeOrdersCountFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = chargersStationDetailsRepository$activeOrdersCountFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersStationDetailsRepository$activeOrdersCountFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
