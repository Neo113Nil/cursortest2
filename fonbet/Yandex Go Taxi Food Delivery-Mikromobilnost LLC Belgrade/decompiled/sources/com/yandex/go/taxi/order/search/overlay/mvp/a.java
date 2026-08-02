package com.yandex.go.taxi.order.search.overlay.mvp;

import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.models.api.response.NearestDrivers;
import com.yandex.mapkit.geometry.Point;
import defpackage.a3y0;
import defpackage.ad5;
import defpackage.m58;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.o3z;
import defpackage.okg0;
import defpackage.pb30;
import defpackage.pzt0;
import defpackage.tcc;
import defpackage.tje;
import defpackage.wz8;
import defpackage.zzs;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes14.dex */
public final class a extends ad5 {
    public final a3y0 A;
    public final ArrayList B;
    public pzt0 C;
    public final o2y0 x;
    public final wz8 y;
    public final ru.yandex.taxi.single.a z;

    public a(o2y0 o2y0Var, wz8 wz8Var, ru.yandex.taxi.single.a aVar) {
        super(okg0.class);
        this.x = o2y0Var;
        this.y = wz8Var;
        this.z = aVar;
        this.A = new a3y0(TaxiOrderLogGroup.EMPTY.getTag(), "QueueSearchOverlayPresenter");
        this.B = new ArrayList();
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0081, code lost:
    
        if (r12 == r3) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0099 A[LOOP:0: B:11:0x0093->B:13:0x0099, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable Kg(a aVar, ContinuationImpl continuationImpl) {
        QueueSearchOverlayPresenter$fetchNearestDrivers$1 queueSearchOverlayPresenter$fetchNearestDrivers$1;
        int i;
        wz8 wz8Var = aVar.y;
        o2y0 o2y0Var = aVar.x;
        if (continuationImpl instanceof QueueSearchOverlayPresenter$fetchNearestDrivers$1) {
            queueSearchOverlayPresenter$fetchNearestDrivers$1 = (QueueSearchOverlayPresenter$fetchNearestDrivers$1) continuationImpl;
            int i2 = queueSearchOverlayPresenter$fetchNearestDrivers$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                queueSearchOverlayPresenter$fetchNearestDrivers$1.label = i2 - Integer.MIN_VALUE;
                Object obj = queueSearchOverlayPresenter$fetchNearestDrivers$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = queueSearchOverlayPresenter$fetchNearestDrivers$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ru.yandex.taxi.single.a aVar2 = aVar.z;
                    Set set = o2y0Var.b().b.O.b;
                    zzs Lg = aVar.Lg();
                    NearestDrivers nearestDrivers = o2y0Var.b().b.i0;
                    if (nearestDrivers == null) {
                        NearestDrivers.Companion.getClass();
                        nearestDrivers = NearestDrivers.c;
                    }
                    List list = nearestDrivers.a;
                    ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((NearestDrivers.Driver) it.next()).a);
                    }
                    queueSearchOverlayPresenter$fetchNearestDrivers$1.label = 1;
                    obj = aVar2.a(set, Lg, arrayList, queueSearchOverlayPresenter$fetchNearestDrivers$1);
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                Iterable<NearestDrivers.Driver> iterable = (Iterable) obj;
                ArrayList arrayList2 = new ArrayList(tcc.n(iterable, 10));
                for (NearestDrivers.Driver driver : iterable) {
                    String str = driver.b;
                    NearestDrivers.Position position = (NearestDrivers.Position) kotlin.collections.a.Z(driver.d);
                    Point point = new Point(position.a, position.b);
                    String str2 = driver.a;
                    pb30 pb30Var = new pb30(str, str2, true);
                    pb30Var.x = point;
                    pb30Var.w = (float) position.d;
                    pb30Var.c = true;
                    wz8Var.b(str, false);
                    arrayList2.add(new m58(str2, pb30Var, point));
                }
                obj2 = wz8Var.a(arrayList2);
                return (Serializable) obj2;
            }
        }
        queueSearchOverlayPresenter$fetchNearestDrivers$1 = new QueueSearchOverlayPresenter$fetchNearestDrivers$1(aVar, continuationImpl);
        Object obj3 = queueSearchOverlayPresenter$fetchNearestDrivers$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = queueSearchOverlayPresenter$fetchNearestDrivers$1.label;
        if (i != 0) {
        }
        Iterable<NearestDrivers.Driver> iterable2 = (Iterable) obj3;
        ArrayList arrayList22 = new ArrayList(tcc.n(iterable2, 10));
        while (r12.hasNext()) {
        }
        obj22 = wz8Var.a(arrayList22);
        return (Serializable) obj22;
    }

    @Override // defpackage.zc5
    public final void Fg() {
        pzt0 pzt0Var = this.C;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.C = null;
    }

    @Override // defpackage.zc5
    public final void Gg() {
        tje.N(Jg(), null, null, new QueueSearchOverlayPresenter$onResume$1(this, null), 3);
    }

    public final zzs Lg() {
        zzs v = this.x.b().v();
        if (v != null) {
            return v;
        }
        a3y0.d(this.A, "getOrderSourcePoint", null, new o3z(10), 2);
        return zzs.f;
    }
}
