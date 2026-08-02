package com.yandex.go.scooters.ignition.data;

import android.os.SystemClock;
import defpackage.hst;
import defpackage.jst;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.tcc;
import defpackage.tje;
import defpackage.ton0;
import defpackage.vpr;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import org.altbeacon.beacon.Beacon;

/* loaded from: classes13.dex */
public final class f implements vpr {
    public final /* synthetic */ g a;

    public f(g gVar) {
        this.a = gVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0139, code lost:
    
        if (r4.d("scan", java.lang.Boolean.valueOf(r6.isEmpty()), new defpackage.bjj0(r6, (java.util.List) r1, r10), r2) != r3) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f4, code lost:
    
        if (r1.a(r10, r2) == r3) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ScootersIgnitionRangeNotifier$start$$inlined$safeCollectIn$1$2$1 scootersIgnitionRangeNotifier$start$$inlined$safeCollectIn$1$2$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        List list;
        Object e;
        com.yandex.go.scooters.ignition.analytics.a aVar;
        List list2;
        int i2;
        if (continuation instanceof ScootersIgnitionRangeNotifier$start$$inlined$safeCollectIn$1$2$1) {
            scootersIgnitionRangeNotifier$start$$inlined$safeCollectIn$1$2$1 = (ScootersIgnitionRangeNotifier$start$$inlined$safeCollectIn$1$2$1) continuation;
            int i3 = scootersIgnitionRangeNotifier$start$$inlined$safeCollectIn$1$2$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                scootersIgnitionRangeNotifier$start$$inlined$safeCollectIn$1$2$1.label = i3 - Integer.MIN_VALUE;
                Object obj2 = scootersIgnitionRangeNotifier$start$$inlined$safeCollectIn$1$2$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersIgnitionRangeNotifier$start$$inlined$safeCollectIn$1$2$1.label;
                g gVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    list = (List) obj;
                    if (!list.isEmpty()) {
                        scootersIgnitionRangeNotifier$start$$inlined$safeCollectIn$1$2$1.L$0 = null;
                        scootersIgnitionRangeNotifier$start$$inlined$safeCollectIn$1$2$1.L$1 = null;
                        scootersIgnitionRangeNotifier$start$$inlined$safeCollectIn$1$2$1.L$2 = list;
                        scootersIgnitionRangeNotifier$start$$inlined$safeCollectIn$1$2$1.label = 1;
                        gVar.getClass();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        b bVar = gVar.d;
                        List<Beacon> list3 = list;
                        ArrayList arrayList = new ArrayList(tcc.n(list3, 10));
                        for (Beacon beacon : list3) {
                            hst hstVar = jst.e;
                            ArrayList arrayList2 = arrayList;
                            arrayList2.add(new ton0(beacon.getId1().h(), beacon.getId3().g(), beacon.getId2().g(), beacon.getRssi() <= 0 ? beacon.getRssi() : beacon.getRunningAverageRssi() <= 0.0d ? (int) beacon.getRunningAverageRssi() : gVar.a, elapsedRealtime));
                            arrayList = arrayList2;
                        }
                    }
                } else if (i == 1) {
                    list = (List) scootersIgnitionRangeNotifier$start$$inlined$safeCollectIn$1$2$1.L$2;
                    kotlin.b.b(obj2);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        i2 = 1;
                        pzt0 pzt0Var = gVar.i;
                        if (pzt0Var == null || pzt0Var.isActive() != i2) {
                            gVar.i = tje.N(gVar.b, null, null, new ScootersIgnitionRangeNotifier$request$1(gVar, null), 3);
                        }
                        return zy11.a;
                    }
                    aVar = (com.yandex.go.scooters.ignition.analytics.a) scootersIgnitionRangeNotifier$start$$inlined$safeCollectIn$1$2$1.L$4;
                    list2 = (List) scootersIgnitionRangeNotifier$start$$inlined$safeCollectIn$1$2$1.L$3;
                    kotlin.b.b(obj2);
                    scootersIgnitionRangeNotifier$start$$inlined$safeCollectIn$1$2$1.L$0 = null;
                    scootersIgnitionRangeNotifier$start$$inlined$safeCollectIn$1$2$1.L$1 = null;
                    scootersIgnitionRangeNotifier$start$$inlined$safeCollectIn$1$2$1.L$2 = null;
                    scootersIgnitionRangeNotifier$start$$inlined$safeCollectIn$1$2$1.L$3 = null;
                    scootersIgnitionRangeNotifier$start$$inlined$safeCollectIn$1$2$1.L$4 = null;
                    scootersIgnitionRangeNotifier$start$$inlined$safeCollectIn$1$2$1.label = 3;
                    aVar.getClass();
                    i2 = 1;
                }
                com.yandex.go.scooters.ignition.analytics.a aVar2 = gVar.f;
                b bVar2 = gVar.d;
                scootersIgnitionRangeNotifier$start$$inlined$safeCollectIn$1$2$1.L$0 = null;
                scootersIgnitionRangeNotifier$start$$inlined$safeCollectIn$1$2$1.L$1 = null;
                scootersIgnitionRangeNotifier$start$$inlined$safeCollectIn$1$2$1.L$2 = null;
                scootersIgnitionRangeNotifier$start$$inlined$safeCollectIn$1$2$1.L$3 = list;
                scootersIgnitionRangeNotifier$start$$inlined$safeCollectIn$1$2$1.L$4 = aVar2;
                scootersIgnitionRangeNotifier$start$$inlined$safeCollectIn$1$2$1.label = 2;
                e = bVar2.e(scootersIgnitionRangeNotifier$start$$inlined$safeCollectIn$1$2$1);
                if (e != coroutineSingletons) {
                    List list4 = list;
                    aVar = aVar2;
                    obj2 = e;
                    list2 = list4;
                    scootersIgnitionRangeNotifier$start$$inlined$safeCollectIn$1$2$1.L$0 = null;
                    scootersIgnitionRangeNotifier$start$$inlined$safeCollectIn$1$2$1.L$1 = null;
                    scootersIgnitionRangeNotifier$start$$inlined$safeCollectIn$1$2$1.L$2 = null;
                    scootersIgnitionRangeNotifier$start$$inlined$safeCollectIn$1$2$1.L$3 = null;
                    scootersIgnitionRangeNotifier$start$$inlined$safeCollectIn$1$2$1.L$4 = null;
                    scootersIgnitionRangeNotifier$start$$inlined$safeCollectIn$1$2$1.label = 3;
                    aVar.getClass();
                    i2 = 1;
                }
                return coroutineSingletons;
            }
        }
        scootersIgnitionRangeNotifier$start$$inlined$safeCollectIn$1$2$1 = new ScootersIgnitionRangeNotifier$start$$inlined$safeCollectIn$1$2$1(this, continuation);
        Object obj22 = scootersIgnitionRangeNotifier$start$$inlined$safeCollectIn$1$2$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersIgnitionRangeNotifier$start$$inlined$safeCollectIn$1$2$1.label;
        g gVar2 = this.a;
        if (i != 0) {
        }
        com.yandex.go.scooters.ignition.analytics.a aVar22 = gVar2.f;
        b bVar22 = gVar2.d;
        scootersIgnitionRangeNotifier$start$$inlined$safeCollectIn$1$2$1.L$0 = null;
        scootersIgnitionRangeNotifier$start$$inlined$safeCollectIn$1$2$1.L$1 = null;
        scootersIgnitionRangeNotifier$start$$inlined$safeCollectIn$1$2$1.L$2 = null;
        scootersIgnitionRangeNotifier$start$$inlined$safeCollectIn$1$2$1.L$3 = list;
        scootersIgnitionRangeNotifier$start$$inlined$safeCollectIn$1$2$1.L$4 = aVar22;
        scootersIgnitionRangeNotifier$start$$inlined$safeCollectIn$1$2$1.label = 2;
        e = bVar22.e(scootersIgnitionRangeNotifier$start$$inlined$safeCollectIn$1$2$1);
        if (e != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
