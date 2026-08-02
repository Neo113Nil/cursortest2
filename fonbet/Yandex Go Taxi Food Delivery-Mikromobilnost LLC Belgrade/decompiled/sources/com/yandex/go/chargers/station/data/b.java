package com.yandex.go.chargers.station.data;

import defpackage.gci0;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class b implements tpr {
    public final /* synthetic */ gci0 a;
    public final /* synthetic */ c b;
    public final /* synthetic */ String c;

    public b(gci0 gci0Var, c cVar, String str) {
        this.a = gci0Var;
        this.b = cVar;
        this.c = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        ChargersStationDetailsRepository$activeOrdersCountFlow$$inlined$map$1$1 chargersStationDetailsRepository$activeOrdersCountFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof ChargersStationDetailsRepository$activeOrdersCountFlow$$inlined$map$1$1) {
            chargersStationDetailsRepository$activeOrdersCountFlow$$inlined$map$1$1 = (ChargersStationDetailsRepository$activeOrdersCountFlow$$inlined$map$1$1) continuation;
            int i2 = chargersStationDetailsRepository$activeOrdersCountFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersStationDetailsRepository$activeOrdersCountFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersStationDetailsRepository$activeOrdersCountFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersStationDetailsRepository$activeOrdersCountFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar, this.b, this.c);
                    chargersStationDetailsRepository$activeOrdersCountFlow$$inlined$map$1$1.L$0 = null;
                    chargersStationDetailsRepository$activeOrdersCountFlow$$inlined$map$1$1.L$1 = null;
                    chargersStationDetailsRepository$activeOrdersCountFlow$$inlined$map$1$1.L$2 = null;
                    chargersStationDetailsRepository$activeOrdersCountFlow$$inlined$map$1$1.label = 1;
                    if (this.a.a.collect(aVar, chargersStationDetailsRepository$activeOrdersCountFlow$$inlined$map$1$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        chargersStationDetailsRepository$activeOrdersCountFlow$$inlined$map$1$1 = new ChargersStationDetailsRepository$activeOrdersCountFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = chargersStationDetailsRepository$activeOrdersCountFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersStationDetailsRepository$activeOrdersCountFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
