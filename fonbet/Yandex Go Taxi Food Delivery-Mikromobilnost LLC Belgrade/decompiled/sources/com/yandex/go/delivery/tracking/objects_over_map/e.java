package com.yandex.go.delivery.tracking.objects_over_map;

import com.yandex.go.delivery.tracking.shortcuts.DeliveryShortcutsResponse;
import com.yandex.go.shortcuts.dto.response.AnimationSourceType;
import com.yandex.go.shortcuts.dto.response.LottieAnimation;
import com.yandex.go.shortcuts.dto.response.ObjectOverMap;
import defpackage.ah00;
import defpackage.dib1;
import defpackage.g73;
import defpackage.gw00;
import defpackage.hrv;
import defpackage.irv;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.uc4;
import defpackage.uei;
import defpackage.vei;
import defpackage.wei;
import defpackage.xei;
import defpackage.zzs;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.internal.g;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes.dex */
public final class e implements uei {
    public final ah00 a;
    public final xei b;
    public final com.yandex.go.delivery.tracking.shortcuts.a c;

    public e(ah00 ah00Var, xei xeiVar, com.yandex.go.delivery.tracking.shortcuts.a aVar) {
        this.a = ah00Var;
        this.b = xeiVar;
        this.c = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0082 A[LOOP:0: B:14:0x0077->B:16:0x0082, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a1 A[EDGE_INSN: B:17:0x00a1->B:18:0x00a1 BREAK  A[LOOP:0: B:14:0x0077->B:16:0x0082], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable a(e eVar, String str, vei veiVar, ContinuationImpl continuationImpl) {
        DeliveryObjectsOverMapInteractorImpl$requestMapObjects$1 deliveryObjectsOverMapInteractorImpl$requestMapObjects$1;
        int i;
        int d;
        LinkedHashMap linkedHashMap;
        Iterator it;
        irv irvVar;
        eVar.getClass();
        if (continuationImpl instanceof DeliveryObjectsOverMapInteractorImpl$requestMapObjects$1) {
            deliveryObjectsOverMapInteractorImpl$requestMapObjects$1 = (DeliveryObjectsOverMapInteractorImpl$requestMapObjects$1) continuationImpl;
            int i2 = deliveryObjectsOverMapInteractorImpl$requestMapObjects$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deliveryObjectsOverMapInteractorImpl$requestMapObjects$1.label = i2 - Integer.MIN_VALUE;
                Object obj = deliveryObjectsOverMapInteractorImpl$requestMapObjects$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deliveryObjectsOverMapInteractorImpl$requestMapObjects$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.go.delivery.tracking.shortcuts.a aVar = eVar.c;
                    zzs b = veiVar.b();
                    uc4 a = veiVar.a();
                    deliveryObjectsOverMapInteractorImpl$requestMapObjects$1.L$0 = null;
                    deliveryObjectsOverMapInteractorImpl$requestMapObjects$1.L$1 = null;
                    deliveryObjectsOverMapInteractorImpl$requestMapObjects$1.label = 1;
                    obj = aVar.a(str, b, a, deliveryObjectsOverMapInteractorImpl$requestMapObjects$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                DeliveryShortcutsResponse deliveryShortcutsResponse = (DeliveryShortcutsResponse) obj;
                g73 O0 = kotlin.collections.a.O0(deliveryShortcutsResponse.getB());
                d = gw00.d(tcc.n(O0, 10));
                if (d < 16) {
                    d = 16;
                }
                linkedHashMap = new LinkedHashMap(d);
                it = O0.iterator();
                while (true) {
                    irvVar = (irv) it;
                    if (irvVar.c.hasNext()) {
                        break;
                    }
                    hrv hrvVar = (hrv) irvVar.next();
                    Pair pair = new Pair(hrvVar.b, Integer.valueOf(hrvVar.a));
                    linkedHashMap.put(pair.c(), pair.f());
                }
                List x0 = kotlin.collections.a.x0(deliveryShortcutsResponse.getA(), new wei(linkedHashMap, 0));
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : x0) {
                    ObjectOverMap objectOverMap = (ObjectOverMap) obj2;
                    if (!jl40.l(objectOverMap.getA(), "") && objectOverMap.getC() != null && objectOverMap.getF() != null && objectOverMap.getB() != null) {
                        com.yandex.go.shortcuts.dto.response.d c = objectOverMap.getC();
                        if ((c != null ? c.a() : null) != AnimationSourceType.LOTTIE_ANIMATION || ((LottieAnimation) objectOverMap.getC()).getD() != null) {
                            arrayList.add(obj2);
                        }
                    }
                }
                return arrayList;
            }
        }
        deliveryObjectsOverMapInteractorImpl$requestMapObjects$1 = new DeliveryObjectsOverMapInteractorImpl$requestMapObjects$1(eVar, continuationImpl);
        Object obj3 = deliveryObjectsOverMapInteractorImpl$requestMapObjects$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deliveryObjectsOverMapInteractorImpl$requestMapObjects$1.label;
        if (i != 0) {
        }
        DeliveryShortcutsResponse deliveryShortcutsResponse2 = (DeliveryShortcutsResponse) obj3;
        g73 O02 = kotlin.collections.a.O0(deliveryShortcutsResponse2.getB());
        d = gw00.d(tcc.n(O02, 10));
        if (d < 16) {
        }
        linkedHashMap = new LinkedHashMap(d);
        it = O02.iterator();
        while (true) {
            irvVar = (irv) it;
            if (irvVar.c.hasNext()) {
            }
            hrv hrvVar2 = (hrv) irvVar.next();
            Pair pair2 = new Pair(hrvVar2.b, Integer.valueOf(hrvVar2.a));
            linkedHashMap.put(pair2.c(), pair2.f());
        }
        List x02 = kotlin.collections.a.x0(deliveryShortcutsResponse2.getA(), new wei(linkedHashMap, 0));
        ArrayList arrayList2 = new ArrayList();
        while (r5.hasNext()) {
        }
        return arrayList2;
    }

    public final g b() {
        return kotlinx.coroutines.flow.e.I(new m0(this.b.b, kotlinx.coroutines.flow.e.t(new d(new b(dib1.c(this.a)), this)), new DeliveryObjectsOverMapInteractorImpl$deliveryMapObjectsFlow$flow$1()), new DeliveryObjectsOverMapInteractorImpl$deliveryMapObjectsFlow$flow$2(this, null));
    }
}
