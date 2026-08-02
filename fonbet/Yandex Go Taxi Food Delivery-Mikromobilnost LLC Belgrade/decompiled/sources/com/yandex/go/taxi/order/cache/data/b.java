package com.yandex.go.taxi.order.cache.data;

import com.yandex.go.taxi.order.cache.data.model.OrderDetailsPresentationInfoSerializable;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import defpackage.a3y0;
import defpackage.eex;
import defpackage.fyi;
import defpackage.hk20;
import defpackage.i3y;
import defpackage.ny61;
import defpackage.t5c;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class b {
    public final a3y0 a = new a3y0(TaxiOrderLogGroup.EMPTY.getTag(), "OrderDetailsPresentationCache");
    public final i3y b;

    public b(eex eexVar) {
        this.b = kotlin.a.a(new t5c(eexVar, 3));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(ContinuationImpl continuationImpl) {
        OrderDetailsPresentationCache$obtainAsync$1 orderDetailsPresentationCache$obtainAsync$1;
        int i;
        if (continuationImpl instanceof OrderDetailsPresentationCache$obtainAsync$1) {
            orderDetailsPresentationCache$obtainAsync$1 = (OrderDetailsPresentationCache$obtainAsync$1) continuationImpl;
            int i2 = orderDetailsPresentationCache$obtainAsync$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderDetailsPresentationCache$obtainAsync$1.label = i2 - Integer.MIN_VALUE;
                Object obj = orderDetailsPresentationCache$obtainAsync$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderDetailsPresentationCache$obtainAsync$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    hk20 hk20Var = (hk20) this.b.getValue();
                    orderDetailsPresentationCache$obtainAsync$1.label = 1;
                    obj = hk20Var.a(orderDetailsPresentationCache$obtainAsync$1);
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
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (Iterable) obj) {
                    if (((OrderDetailsPresentationInfoSerializable) obj2).b > System.currentTimeMillis()) {
                        arrayList.add(obj2);
                    }
                }
                this.a.f(new fyi(arrayList, 2), "obtainSync");
                return arrayList;
            }
        }
        orderDetailsPresentationCache$obtainAsync$1 = new OrderDetailsPresentationCache$obtainAsync$1(this, continuationImpl);
        Object obj3 = orderDetailsPresentationCache$obtainAsync$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderDetailsPresentationCache$obtainAsync$1.label;
        if (i != 0) {
        }
        ArrayList arrayList2 = new ArrayList();
        while (r7.hasNext()) {
        }
        this.a.f(new fyi(arrayList2, 2), "obtainSync");
        return arrayList2;
    }
}
