package com.yandex.go.delivery.tracking.map_overlay;

import com.yandex.mapkit.directions.driving.DrivingSession;
import defpackage.apf;
import defpackage.bvf0;
import defpackage.gci0;
import defpackage.ike;
import defpackage.jel0;
import defpackage.jst;
import defpackage.lp00;
import defpackage.o400;
import defpackage.odi;
import defpackage.pji;
import defpackage.qnh;
import defpackage.r2u0;
import defpackage.sjh;
import defpackage.soi;
import defpackage.tcc;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.wsr0;
import defpackage.xsr0;
import defpackage.zgf;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.ConcurrentHashMap;
import ru.yandex.taxi.map_common.map.intersection.Participant;

/* loaded from: classes12.dex */
public final class q {
    public final ru.yandex.taxi.logistics.deliveries.map.android.a a;
    public final odi b;
    public final String c;
    public final jel0 d;
    public final ike e;
    public final gci0 f;
    public final gci0 g;

    public q(ru.yandex.taxi.logistics.deliveries.map.android.a aVar, tpr tprVar, odi odiVar, String str, jel0 jel0Var, tt2 tt2Var, qnh qnhVar, zgf zgfVar, k kVar) {
        this.a = aVar;
        this.b = odiVar;
        this.c = str;
        this.d = jel0Var;
        tt2Var.getClass();
        sjh sjhVar = uyj.a;
        ike a = bvf0.a(o400.a);
        this.e = a;
        kotlinx.coroutines.flow.internal.g X = kotlinx.coroutines.flow.e.X(tprVar, new DeliveryRoutePresenter$special$$inlined$flatMapLatest$1(null, this, qnhVar));
        xsr0.a.getClass();
        r2u0 r2u0Var = wsr0.c;
        gci0 R = kotlinx.coroutines.flow.e.R(X, a, r2u0Var, null);
        this.f = kotlinx.coroutines.flow.e.R(kotlinx.coroutines.flow.e.X(tprVar, new DeliveryRoutePresenter$special$$inlined$flatMapLatest$2(null, this, zgfVar)), a, r2u0Var, soi.a);
        this.g = kotlinx.coroutines.flow.e.R(kotlinx.coroutines.flow.e.n(tprVar, kVar, R, new DeliveryRoutePresenter$currentRouteParamsFlow$1(4, null)), a, r2u0Var, null);
    }

    public final void a() {
        String str = this.c;
        str.getClass();
        jst.e.getClass();
        bvf0.j(this.e, null);
        DrivingSession drivingSession = this.d.g;
        if (drivingSession != null) {
            drivingSession.cancel();
        }
        odi odiVar = this.b;
        ConcurrentHashMap concurrentHashMap = odiVar.d;
        concurrentHashMap.remove(str);
        odiVar.e.g(tcc.o(concurrentHashMap.values()));
        ru.yandex.taxi.logistics.deliveries.map.android.a aVar = this.a;
        apf apfVar = aVar.d;
        LinkedHashSet linkedHashSet = (LinkedHashSet) apfVar.x;
        lp00 lp00Var = (lp00) apfVar.b;
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            ((ru.yandex.taxi.map_common.map.intersection.a) lp00Var).j((Participant) it.next());
        }
        linkedHashSet.clear();
        LinkedHashMap linkedHashMap = aVar.b.b;
        Iterator it2 = linkedHashMap.values().iterator();
        while (it2.hasNext()) {
            ((pji) it2.next()).a();
        }
        linkedHashMap.clear();
        aVar.a.a();
        aVar.c.a();
    }
}
