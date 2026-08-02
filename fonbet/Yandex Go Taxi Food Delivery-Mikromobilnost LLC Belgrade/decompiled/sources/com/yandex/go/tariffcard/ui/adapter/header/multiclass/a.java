package com.yandex.go.tariffcard.ui.adapter.header.multiclass;

import android.graphics.drawable.Drawable;
import defpackage.i5l0;
import defpackage.ny61;
import defpackage.p68;
import defpackage.tcc;
import defpackage.wls;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes14.dex */
public final class a {
    public static final a a = new a();

    /* JADX WARN: Removed duplicated region for block: B:13:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x008b -> B:10:0x008f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ArrayList arrayList, wls wlsVar, ContinuationImpl continuationImpl) {
        CarPlacementFactory$createCarPlacements$1 carPlacementFactory$createCarPlacements$1;
        int i;
        Iterator it;
        Collection collection;
        if (continuationImpl instanceof CarPlacementFactory$createCarPlacements$1) {
            carPlacementFactory$createCarPlacements$1 = (CarPlacementFactory$createCarPlacements$1) continuationImpl;
            int i2 = carPlacementFactory$createCarPlacements$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                carPlacementFactory$createCarPlacements$1.label = i2 - Integer.MIN_VALUE;
                Object obj = carPlacementFactory$createCarPlacements$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = carPlacementFactory$createCarPlacements$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                    it = arrayList.iterator();
                    collection = arrayList2;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    collection = (Collection) carPlacementFactory$createCarPlacements$1.L$8;
                    i5l0 i5l0Var = (i5l0) carPlacementFactory$createCarPlacements$1.L$7;
                    it = (Iterator) carPlacementFactory$createCarPlacements$1.L$5;
                    Collection collection2 = (Collection) carPlacementFactory$createCarPlacements$1.L$4;
                    wls wlsVar2 = (wls) carPlacementFactory$createCarPlacements$1.L$1;
                    kotlin.b.b(obj);
                    collection.add(new p68((Drawable) obj, i5l0Var.b));
                    collection = collection2;
                    wlsVar = wlsVar2;
                    if (it.hasNext()) {
                        i5l0 i5l0Var2 = (i5l0) it.next();
                        String str = i5l0Var2.a;
                        carPlacementFactory$createCarPlacements$1.L$0 = null;
                        carPlacementFactory$createCarPlacements$1.L$1 = wlsVar;
                        carPlacementFactory$createCarPlacements$1.L$2 = null;
                        carPlacementFactory$createCarPlacements$1.L$3 = null;
                        carPlacementFactory$createCarPlacements$1.L$4 = collection;
                        carPlacementFactory$createCarPlacements$1.L$5 = it;
                        carPlacementFactory$createCarPlacements$1.L$6 = null;
                        carPlacementFactory$createCarPlacements$1.L$7 = i5l0Var2;
                        carPlacementFactory$createCarPlacements$1.L$8 = collection;
                        carPlacementFactory$createCarPlacements$1.label = 1;
                        Object invoke = wlsVar.invoke(str, carPlacementFactory$createCarPlacements$1);
                        if (invoke == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        wlsVar2 = wlsVar;
                        i5l0Var = i5l0Var2;
                        obj = invoke;
                        collection2 = collection;
                        collection.add(new p68((Drawable) obj, i5l0Var.b));
                        collection = collection2;
                        wlsVar = wlsVar2;
                        if (it.hasNext()) {
                            return (List) collection;
                        }
                    }
                }
            }
        }
        carPlacementFactory$createCarPlacements$1 = new CarPlacementFactory$createCarPlacements$1(this, continuationImpl);
        Object obj2 = carPlacementFactory$createCarPlacements$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = carPlacementFactory$createCarPlacements$1.label;
        if (i != 0) {
        }
    }
}
