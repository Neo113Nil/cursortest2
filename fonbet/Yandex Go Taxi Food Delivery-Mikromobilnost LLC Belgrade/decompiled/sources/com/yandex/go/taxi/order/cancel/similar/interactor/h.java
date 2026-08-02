package com.yandex.go.taxi.order.cancel.similar.interactor;

import com.yandex.go.taxi.order.cancel.similar.model.CancelSimilarButton$State;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.bvf0;
import defpackage.g08;
import defpackage.h980;
import defpackage.i3y;
import defpackage.ij7;
import defpackage.m2v;
import defpackage.n20;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.pdc;
import defpackage.pz7;
import defpackage.sr4;
import defpackage.tt2;
import defpackage.x980;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class h {
    public final String a;
    public final m2v b;
    public final x980 c;
    public final pz7 d;
    public final h980 e;
    public final n20 f;
    public final ru.yandex.taxi.widget.c g;
    public final pdc h;
    public final tt2 i;
    public final ru.yandex.taxi.widget.utils.e j;
    public final g08 k;
    public final i3y l = kotlin.a.b(LazyThreadSafetyMode.NONE, new ij7(10));
    public final r0 m = bvf0.c(null);
    public final r0 n = bvf0.c(CancelSimilarButton$State.IDLE);

    public h(String str, m2v m2vVar, x980 x980Var, pz7 pz7Var, h980 h980Var, n20 n20Var, ru.yandex.taxi.widget.c cVar, pdc pdcVar, tt2 tt2Var, ru.yandex.taxi.widget.utils.e eVar, g08 g08Var) {
        this.a = str;
        this.b = m2vVar;
        this.c = x980Var;
        this.d = pz7Var;
        this.e = h980Var;
        this.f = n20Var;
        this.g = cVar;
        this.h = pdcVar;
        this.i = tt2Var;
        this.j = eVar;
        this.k = g08Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(List list, ContinuationImpl continuationImpl) {
        CancelSimilarOrdersFeatureInteractor$cancelOrders$1 cancelSimilarOrdersFeatureInteractor$cancelOrders$1;
        int i;
        Iterator it;
        if (continuationImpl instanceof CancelSimilarOrdersFeatureInteractor$cancelOrders$1) {
            cancelSimilarOrdersFeatureInteractor$cancelOrders$1 = (CancelSimilarOrdersFeatureInteractor$cancelOrders$1) continuationImpl;
            int i2 = cancelSimilarOrdersFeatureInteractor$cancelOrders$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cancelSimilarOrdersFeatureInteractor$cancelOrders$1.label = i2 - Integer.MIN_VALUE;
                Object obj = cancelSimilarOrdersFeatureInteractor$cancelOrders$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cancelSimilarOrdersFeatureInteractor$cancelOrders$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    this.n.l(CancelSimilarButton$State.LOADING);
                    n20 n20Var = this.f;
                    cancelSimilarOrdersFeatureInteractor$cancelOrders$1.L$0 = list;
                    cancelSimilarOrdersFeatureInteractor$cancelOrders$1.label = 1;
                    obj = ((com.yandex.go.taxi.order.provider.a) n20Var).k(cancelSimilarOrdersFeatureInteractor$cancelOrders$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    list = (List) cancelSimilarOrdersFeatureInteractor$cancelOrders$1.L$0;
                    kotlin.b.b(obj);
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (Iterable) obj) {
                    if (list.contains(((o2y0) obj2).b().a)) {
                        arrayList.add(obj2);
                    }
                }
                it = arrayList.iterator();
                while (it.hasNext()) {
                    o2y0 o2y0Var = (o2y0) it.next();
                    TaxiOrder b = o2y0Var.b();
                    synchronized (b) {
                        b.l = b.l.C();
                    }
                    x980 x980Var = this.c;
                    sr4 sr4Var = new sr4(24, this);
                    ru.yandex.taxi.order.f fVar = (ru.yandex.taxi.order.f) x980Var;
                    fVar.getClass();
                    fVar.W(o2y0Var, o2y0Var.b().h.b, sr4Var);
                }
                return zy11.a;
            }
        }
        cancelSimilarOrdersFeatureInteractor$cancelOrders$1 = new CancelSimilarOrdersFeatureInteractor$cancelOrders$1(this, continuationImpl);
        Object obj3 = cancelSimilarOrdersFeatureInteractor$cancelOrders$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cancelSimilarOrdersFeatureInteractor$cancelOrders$1.label;
        if (i != 0) {
        }
        ArrayList arrayList2 = new ArrayList();
        while (r6.hasNext()) {
        }
        it = arrayList2.iterator();
        while (it.hasNext()) {
        }
        return zy11.a;
    }
}
