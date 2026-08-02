package com.yandex.go.masstransit.sdk.ble.impl.ble;

import defpackage.ny61;
import defpackage.tcc;
import defpackage.v16;
import defpackage.vpr;
import defpackage.x26;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class d implements vpr {
    public final /* synthetic */ vpr a;

    public d(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        MtBleScannerRepositoryV2$special$$inlined$map$1$2$1 mtBleScannerRepositoryV2$special$$inlined$map$1$2$1;
        int i;
        ArrayList arrayList;
        if (continuation instanceof MtBleScannerRepositoryV2$special$$inlined$map$1$2$1) {
            mtBleScannerRepositoryV2$special$$inlined$map$1$2$1 = (MtBleScannerRepositoryV2$special$$inlined$map$1$2$1) continuation;
            int i2 = mtBleScannerRepositoryV2$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtBleScannerRepositoryV2$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = mtBleScannerRepositoryV2$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtBleScannerRepositoryV2$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    List list = (List) obj;
                    if (list != null) {
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj3 : list) {
                            if (obj3 instanceof x26) {
                                arrayList2.add(obj3);
                            }
                        }
                        arrayList = new ArrayList(tcc.n(arrayList2, 10));
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            x26 x26Var = (x26) it.next();
                            arrayList.add(new v16(x26Var.a, x26Var.b, x26Var.c));
                        }
                    } else {
                        arrayList = null;
                    }
                    mtBleScannerRepositoryV2$special$$inlined$map$1$2$1.L$0 = null;
                    mtBleScannerRepositoryV2$special$$inlined$map$1$2$1.L$1 = null;
                    mtBleScannerRepositoryV2$special$$inlined$map$1$2$1.L$2 = null;
                    mtBleScannerRepositoryV2$special$$inlined$map$1$2$1.L$3 = null;
                    mtBleScannerRepositoryV2$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(arrayList, mtBleScannerRepositoryV2$special$$inlined$map$1$2$1) == coroutineSingletons) {
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
        mtBleScannerRepositoryV2$special$$inlined$map$1$2$1 = new MtBleScannerRepositoryV2$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = mtBleScannerRepositoryV2$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtBleScannerRepositoryV2$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
