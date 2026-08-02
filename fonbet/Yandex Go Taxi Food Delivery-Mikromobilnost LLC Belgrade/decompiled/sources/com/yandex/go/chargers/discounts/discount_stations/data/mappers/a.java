package com.yandex.go.chargers.discounts.discount_stations.data.mappers;

import defpackage.bvf0;
import defpackage.ny61;
import java.util.Collection;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.widget.c;

/* loaded from: classes12.dex */
public final class a {
    public final c a;

    public a(c cVar) {
        this.a = cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
    
        if (r8 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(List list, ContinuationImpl continuationImpl) {
        ChargersDiscountStationsMapper$mapStationItems$1 chargersDiscountStationsMapper$mapStationItems$1;
        int i;
        if (continuationImpl instanceof ChargersDiscountStationsMapper$mapStationItems$1) {
            chargersDiscountStationsMapper$mapStationItems$1 = (ChargersDiscountStationsMapper$mapStationItems$1) continuationImpl;
            int i2 = chargersDiscountStationsMapper$mapStationItems$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersDiscountStationsMapper$mapStationItems$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersDiscountStationsMapper$mapStationItems$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersDiscountStationsMapper$mapStationItems$1.label;
                if (i != 0) {
                    b.b(obj);
                    ChargersDiscountStationsMapper$mapStationItems$2 chargersDiscountStationsMapper$mapStationItems$2 = new ChargersDiscountStationsMapper$mapStationItems$2(list, this, null);
                    chargersDiscountStationsMapper$mapStationItems$1.L$0 = null;
                    chargersDiscountStationsMapper$mapStationItems$1.label = 1;
                    obj = bvf0.n(chargersDiscountStationsMapper$mapStationItems$2, chargersDiscountStationsMapper$mapStationItems$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                        return obj;
                    }
                    b.b(obj);
                }
                chargersDiscountStationsMapper$mapStationItems$1.L$0 = null;
                chargersDiscountStationsMapper$mapStationItems$1.label = 2;
                Object b = kotlinx.coroutines.a.b((Collection) obj, chargersDiscountStationsMapper$mapStationItems$1);
                return b != coroutineSingletons ? coroutineSingletons : b;
            }
        }
        chargersDiscountStationsMapper$mapStationItems$1 = new ChargersDiscountStationsMapper$mapStationItems$1(this, continuationImpl);
        Object obj2 = chargersDiscountStationsMapper$mapStationItems$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersDiscountStationsMapper$mapStationItems$1.label;
        if (i != 0) {
        }
        chargersDiscountStationsMapper$mapStationItems$1.L$0 = null;
        chargersDiscountStationsMapper$mapStationItems$1.label = 2;
        Object b2 = kotlinx.coroutines.a.b((Collection) obj2, chargersDiscountStationsMapper$mapStationItems$1);
        if (b2 != coroutineSingletons2) {
        }
    }
}
