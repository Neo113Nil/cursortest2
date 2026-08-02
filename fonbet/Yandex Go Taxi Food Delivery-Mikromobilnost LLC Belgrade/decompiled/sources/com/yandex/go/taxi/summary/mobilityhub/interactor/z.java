package com.yandex.go.taxi.summary.mobilityhub.interactor;

import com.yandex.mapkit.transport.masstransit.Route;
import com.yandex.mapkit.transport.masstransit.Section;
import defpackage.a201;
import defpackage.bvf0;
import defpackage.c611;
import defpackage.cyu;
import defpackage.e3n;
import defpackage.h2v;
import defpackage.hpi0;
import defpackage.jqr;
import defpackage.kp50;
import defpackage.mdh;
import defpackage.mth;
import defpackage.mu60;
import defpackage.nzs;
import defpackage.o430;
import defpackage.o7r0;
import defpackage.qbl0;
import defpackage.sjh;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.uze0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class z {
    public final String a;
    public final tt2 b;
    public final o7r0 c;
    public final cyu d;
    public final qbl0 e;
    public final com.yandex.go.route.interactor.b f;
    public final uze0 g;
    public final hpi0 h;
    public final com.yandex.go.taxi.summary.mobilityhub.repository.a i;
    public final a201 j;
    public final com.yandex.go.taxi.summary.mobilityhub.experiment.g k;

    public z(String str, tt2 tt2Var, o7r0 o7r0Var, cyu cyuVar, qbl0 qbl0Var, com.yandex.go.route.interactor.b bVar, uze0 uze0Var, hpi0 hpi0Var, com.yandex.go.taxi.summary.mobilityhub.repository.a aVar, a201 a201Var, com.yandex.go.taxi.summary.mobilityhub.experiment.g gVar) {
        this.a = str;
        this.b = tt2Var;
        this.c = o7r0Var;
        this.d = cyuVar;
        this.e = qbl0Var;
        this.f = bVar;
        this.g = uze0Var;
        this.h = hpi0Var;
        this.i = aVar;
        this.j = a201Var;
        this.k = gVar;
    }

    public static final List a(z zVar, List list, h2v h2vVar) {
        ArrayList arrayList;
        zVar.getClass();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            List<Section> sections = ((c611) obj).b.getSections();
            if (!(sections instanceof Collection) || !sections.isEmpty()) {
                Iterator<T> it = sections.iterator();
                while (it.hasNext()) {
                    if (((Section) it.next()).getMetadata().getData().getTaxi() != null) {
                        break;
                    }
                }
            }
            arrayList2.add(obj);
        }
        if ((h2vVar != null ? h2vVar.a.c : null) == null) {
            arrayList = new ArrayList();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                if (b(((c611) next).b)) {
                    arrayList.add(next);
                }
            }
        } else {
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                Object next2 = it3.next();
                c611 c611Var = (c611) next2;
                if (!b(c611Var.b)) {
                    Route route = c611Var.b;
                    o430 o430Var = e3n.b;
                    if (e3n.o(kp50.T(nzs.a(route), DurationUnit.SECONDS), DurationUnit.MINUTES) <= r0.a) {
                    }
                }
                arrayList3.add(next2);
            }
            arrayList = arrayList3;
        }
        Integer valueOf = h2vVar != null ? Integer.valueOf(h2vVar.a.d) : null;
        return valueOf == null ? arrayList : kotlin.collections.a.A0(arrayList, valueOf.intValue());
    }

    public static boolean b(Route route) {
        List<Section> sections = route.getSections();
        if ((sections instanceof Collection) && sections.isEmpty()) {
            return false;
        }
        Iterator<T> it = sections.iterator();
        while (it.hasNext()) {
            if (((Section) it.next()).getMetadata().getData().getTransports() != null && (!r0.isEmpty())) {
                return true;
            }
        }
        return false;
    }

    public final tpr c() {
        r0 c = bvf0.c(null);
        mth a = ((com.yandex.go.taxi.tariffs.internal.repository.k) this.g).j.a();
        qbl0 qbl0Var = this.e;
        jqr jqrVar = new jqr(com.yandex.go.coroutines.b.d(kotlinx.coroutines.flow.e.X(kotlinx.coroutines.flow.e.l(new m0(a, com.yandex.go.coroutines.b.d(qbl0Var.a(), new VerticalOffersStateInteractor$routeStatsFlow$$inlined$start$1(qbl0Var.b(), null)), new VerticalOffersStateInteractor$routeStatsFlow$1(3, null)), this.i.b(), this.k.a(), com.yandex.go.coroutines.b.d(new y(new mth(this.d.b, 4)), new VerticalOffersStateInteractor$selectedFilterFlow$$inlined$start$1(this, null)), com.yandex.go.coroutines.b.d(this.h.b, new VerticalOffersStateInteractor$offersStateFlow$$inlined$start$1(zy11.a, null)), new VerticalOffersStateInteractor$offersStateFlow$1(this, null)), new VerticalOffersStateInteractor$offersStateFlow$$inlined$flatMapLatest$1(null, this, c)), new VerticalOffersStateInteractor$offersStateFlow$$inlined$start$2(new mu60(null), null)), new VerticalOffersStateInteractor$offersStateFlow$3(2, this, z.class, "reportRouteOptionsLoaded", "reportRouteOptionsLoaded(Lcom/yandex/go/taxi/summary/mobilityhub/model/OffersState;)V", 4), 3);
        this.b.getClass();
        sjh sjhVar = uyj.a;
        return kotlinx.coroutines.flow.e.F(jqrVar, mdh.b);
    }
}
