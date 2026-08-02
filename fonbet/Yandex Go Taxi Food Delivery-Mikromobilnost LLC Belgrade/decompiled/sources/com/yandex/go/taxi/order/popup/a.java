package com.yandex.go.taxi.order.popup;

import defpackage.bvf0;
import defpackage.n20;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.tls;
import defpackage.x980;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes14.dex */
public final class a {
    public final n20 a;
    public final x980 b;

    public a(n20 n20Var, x980 x980Var) {
        this.a = n20Var;
        this.b = x980Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x012e, code lost:
    
        if (r13 == r1) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0106, code lost:
    
        if (r12.invoke(r0) == r1) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x011d, code lost:
    
        if (r13 == r1) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0084, code lost:
    
        if (r13 == r1) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(List list, tls tlsVar, ContinuationImpl continuationImpl) {
        OrderPopupCancelInteractor$cancelOrders$1 orderPopupCancelInteractor$cancelOrders$1;
        int i;
        Iterator it;
        ArrayList arrayList;
        Iterator it2;
        if (continuationImpl instanceof OrderPopupCancelInteractor$cancelOrders$1) {
            orderPopupCancelInteractor$cancelOrders$1 = (OrderPopupCancelInteractor$cancelOrders$1) continuationImpl;
            int i2 = orderPopupCancelInteractor$cancelOrders$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderPopupCancelInteractor$cancelOrders$1.label = i2 - Integer.MIN_VALUE;
                Object obj = orderPopupCancelInteractor$cancelOrders$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderPopupCancelInteractor$cancelOrders$1.label;
                boolean z = true;
                if (i != 0) {
                    kotlin.b.b(obj);
                    orderPopupCancelInteractor$cancelOrders$1.L$0 = list;
                    orderPopupCancelInteractor$cancelOrders$1.L$1 = tlsVar;
                    orderPopupCancelInteractor$cancelOrders$1.label = 1;
                    obj = ((com.yandex.go.taxi.order.provider.a) this.a).k(orderPopupCancelInteractor$cancelOrders$1);
                } else if (i == 1) {
                    tlsVar = (tls) orderPopupCancelInteractor$cancelOrders$1.L$1;
                    list = (List) orderPopupCancelInteractor$cancelOrders$1.L$0;
                    kotlin.b.b(obj);
                } else {
                    if (i == 2) {
                        kotlin.b.b(obj);
                        return Boolean.FALSE;
                    }
                    if (i != 3) {
                        if (i != 4) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        List list2 = (List) obj;
                        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                            Iterator it3 = list2.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    break;
                                }
                                if (!((Boolean) it3.next()).booleanValue()) {
                                    z = false;
                                    break;
                                }
                            }
                        }
                        return Boolean.valueOf(z);
                    }
                    kotlin.b.b(obj);
                    orderPopupCancelInteractor$cancelOrders$1.L$0 = null;
                    orderPopupCancelInteractor$cancelOrders$1.L$1 = null;
                    orderPopupCancelInteractor$cancelOrders$1.L$2 = null;
                    orderPopupCancelInteractor$cancelOrders$1.label = 4;
                    obj = kotlinx.coroutines.a.b((Collection) obj, orderPopupCancelInteractor$cancelOrders$1);
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : (Iterable) obj) {
                    if (list.contains(((o2y0) obj2).b().a)) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                it = arrayList2.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (((o2y0) next).c() != DriveState.WAITING) {
                        arrayList3.add(next);
                    }
                }
                arrayList = new ArrayList();
                it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    if (((o2y0) next2).c() != DriveState.TRANSPORTING) {
                        arrayList.add(next2);
                    }
                }
                if (arrayList.isEmpty()) {
                    OrderPopupCancelInteractor$cancelOrders$ordersCancelResults$1 orderPopupCancelInteractor$cancelOrders$ordersCancelResults$1 = new OrderPopupCancelInteractor$cancelOrders$ordersCancelResults$1(arrayList, this, null);
                    orderPopupCancelInteractor$cancelOrders$1.L$0 = null;
                    orderPopupCancelInteractor$cancelOrders$1.L$1 = null;
                    orderPopupCancelInteractor$cancelOrders$1.L$2 = null;
                    orderPopupCancelInteractor$cancelOrders$1.label = 3;
                    obj = bvf0.n(orderPopupCancelInteractor$cancelOrders$ordersCancelResults$1, orderPopupCancelInteractor$cancelOrders$1);
                } else {
                    orderPopupCancelInteractor$cancelOrders$1.L$0 = null;
                    orderPopupCancelInteractor$cancelOrders$1.L$1 = null;
                    orderPopupCancelInteractor$cancelOrders$1.L$2 = null;
                    orderPopupCancelInteractor$cancelOrders$1.label = 2;
                }
                return coroutineSingletons;
            }
        }
        orderPopupCancelInteractor$cancelOrders$1 = new OrderPopupCancelInteractor$cancelOrders$1(this, continuationImpl);
        Object obj3 = orderPopupCancelInteractor$cancelOrders$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderPopupCancelInteractor$cancelOrders$1.label;
        boolean z2 = true;
        if (i != 0) {
        }
        ArrayList arrayList22 = new ArrayList();
        while (r13.hasNext()) {
        }
        ArrayList arrayList32 = new ArrayList();
        it = arrayList22.iterator();
        while (it.hasNext()) {
        }
        arrayList = new ArrayList();
        it2 = arrayList32.iterator();
        while (it2.hasNext()) {
        }
        if (arrayList.isEmpty()) {
        }
        return coroutineSingletons2;
    }
}
