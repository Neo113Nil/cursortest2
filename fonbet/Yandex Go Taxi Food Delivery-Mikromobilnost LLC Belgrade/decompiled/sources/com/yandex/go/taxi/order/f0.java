package com.yandex.go.taxi.order;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.ny61;
import defpackage.scc;
import defpackage.sls;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes14.dex */
public final class f0 {
    public static final List b = scc.g(1000L, 2000L, 4000L);
    public final ru.yandex.taxi.orders.g a;

    public f0(ru.yandex.taxi.orders.g gVar) {
        this.a = gVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a9, code lost:
    
        if (r8.i().u0(r0) != r1) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0066, code lost:
    
        if (r8.i().u0(r0) == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00a9 -> B:12:0x0037). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(sls slsVar, ContinuationImpl continuationImpl) {
        PendingOrdersSearchInteractor$find$1 pendingOrdersSearchInteractor$find$1;
        int i;
        TaxiOrder taxiOrder;
        Iterator it;
        Iterator it2;
        long j;
        sls slsVar2;
        if (continuationImpl instanceof PendingOrdersSearchInteractor$find$1) {
            pendingOrdersSearchInteractor$find$1 = (PendingOrdersSearchInteractor$find$1) continuationImpl;
            int i2 = pendingOrdersSearchInteractor$find$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pendingOrdersSearchInteractor$find$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pendingOrdersSearchInteractor$find$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pendingOrdersSearchInteractor$find$1.label;
                ru.yandex.taxi.orders.g gVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    pendingOrdersSearchInteractor$find$1.L$0 = slsVar;
                    pendingOrdersSearchInteractor$find$1.label = 1;
                } else if (i == 1) {
                    slsVar = (sls) pendingOrdersSearchInteractor$find$1.L$0;
                    kotlin.b.b(obj);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        it2 = (Iterator) pendingOrdersSearchInteractor$find$1.L$1;
                        slsVar2 = (sls) pendingOrdersSearchInteractor$find$1.L$0;
                        kotlin.b.b(obj);
                        it = it2;
                        slsVar = slsVar2;
                        TaxiOrder taxiOrder2 = (TaxiOrder) slsVar.invoke();
                        if (taxiOrder2 != null) {
                            return taxiOrder2;
                        }
                        if (it.hasNext()) {
                            return null;
                        }
                        j = ((Number) it.next()).longValue();
                        pendingOrdersSearchInteractor$find$1.L$0 = slsVar;
                        pendingOrdersSearchInteractor$find$1.L$1 = it;
                        pendingOrdersSearchInteractor$find$1.J$0 = j;
                        pendingOrdersSearchInteractor$find$1.label = 2;
                        if (kotlinx.coroutines.a.i(j, pendingOrdersSearchInteractor$find$1) != coroutineSingletons) {
                            slsVar2 = slsVar;
                            it2 = it;
                            pendingOrdersSearchInteractor$find$1.L$0 = slsVar2;
                            pendingOrdersSearchInteractor$find$1.L$1 = it2;
                            pendingOrdersSearchInteractor$find$1.J$0 = j;
                            pendingOrdersSearchInteractor$find$1.label = 3;
                        }
                        return coroutineSingletons;
                    }
                    j = pendingOrdersSearchInteractor$find$1.J$0;
                    it2 = (Iterator) pendingOrdersSearchInteractor$find$1.L$1;
                    slsVar2 = (sls) pendingOrdersSearchInteractor$find$1.L$0;
                    kotlin.b.b(obj);
                    pendingOrdersSearchInteractor$find$1.L$0 = slsVar2;
                    pendingOrdersSearchInteractor$find$1.L$1 = it2;
                    pendingOrdersSearchInteractor$find$1.J$0 = j;
                    pendingOrdersSearchInteractor$find$1.label = 3;
                }
                taxiOrder = (TaxiOrder) slsVar.invoke();
                if (taxiOrder == null) {
                    return taxiOrder;
                }
                it = b.iterator();
                if (it.hasNext()) {
                }
            }
        }
        pendingOrdersSearchInteractor$find$1 = new PendingOrdersSearchInteractor$find$1(this, continuationImpl);
        Object obj2 = pendingOrdersSearchInteractor$find$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pendingOrdersSearchInteractor$find$1.label;
        ru.yandex.taxi.orders.g gVar2 = this.a;
        if (i != 0) {
        }
        taxiOrder = (TaxiOrder) slsVar.invoke();
        if (taxiOrder == null) {
        }
    }
}
