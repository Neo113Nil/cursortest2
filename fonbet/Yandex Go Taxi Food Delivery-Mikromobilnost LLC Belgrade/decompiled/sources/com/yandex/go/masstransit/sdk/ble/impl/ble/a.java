package com.yandex.go.masstransit.sdk.ble.impl.ble;

import com.yandex.go.masstransit.sdk.ble.impl.network.MtVehiclesParam;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.v16;
import defpackage.vpr;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;

    public a(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        MtBleScannerRepository$special$$inlined$map$1$2$1 mtBleScannerRepository$special$$inlined$map$1$2$1;
        int i;
        Set set;
        if (continuation instanceof MtBleScannerRepository$special$$inlined$map$1$2$1) {
            mtBleScannerRepository$special$$inlined$map$1$2$1 = (MtBleScannerRepository$special$$inlined$map$1$2$1) continuation;
            int i2 = mtBleScannerRepository$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtBleScannerRepository$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = mtBleScannerRepository$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtBleScannerRepository$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Set set2 = (Set) obj;
                    if (set2 != null) {
                        Set<MtVehiclesParam.BleInfo> set3 = set2;
                        ArrayList arrayList = new ArrayList(tcc.n(set3, 10));
                        for (MtVehiclesParam.BleInfo bleInfo : set3) {
                            arrayList.add(new v16(bleInfo.a, bleInfo.b, bleInfo.c));
                        }
                        set = kotlin.collections.a.N0(arrayList);
                    } else {
                        set = null;
                    }
                    mtBleScannerRepository$special$$inlined$map$1$2$1.L$0 = null;
                    mtBleScannerRepository$special$$inlined$map$1$2$1.L$1 = null;
                    mtBleScannerRepository$special$$inlined$map$1$2$1.L$2 = null;
                    mtBleScannerRepository$special$$inlined$map$1$2$1.L$3 = null;
                    mtBleScannerRepository$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(set, mtBleScannerRepository$special$$inlined$map$1$2$1) == coroutineSingletons) {
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
        mtBleScannerRepository$special$$inlined$map$1$2$1 = new MtBleScannerRepository$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = mtBleScannerRepository$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtBleScannerRepository$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
