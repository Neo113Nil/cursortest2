package com.yandex.go.taxi.order.search.overlay.ordinary.mvp;

import com.yandex.go.taxi.order.domain.repositories.n;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.models.api.response.NearestDrivers;
import com.yandex.go.taxi.order.search.overlay.ordinary.domain.d;
import com.yandex.go.taxi.order.state.search.SearchState;
import com.yandex.mapkit.geometry.Point;
import defpackage.a3y0;
import defpackage.ad5;
import defpackage.bm50;
import defpackage.cv00;
import defpackage.dvw;
import defpackage.hst;
import defpackage.jst;
import defpackage.kol0;
import defpackage.m58;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.o3z;
import defpackage.pb30;
import defpackage.pzt0;
import defpackage.tcc;
import defpackage.tje;
import defpackage.u8w;
import defpackage.ud80;
import defpackage.vd80;
import defpackage.wd80;
import defpackage.wz8;
import defpackage.z1e0;
import defpackage.zzs;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.map_common.map.o;

/* loaded from: classes14.dex */
public final class b extends ad5 {
    public final d A;
    public final ud80 B;
    public final ru.yandex.taxi.single.a C;
    public final a3y0 D;
    public final ArrayList E;
    public pzt0 F;
    public pzt0 G;
    public z1e0 H;
    public final o2y0 x;
    public final wz8 y;
    public final cv00 z;

    public b(o2y0 o2y0Var, wz8 wz8Var, cv00 cv00Var, d dVar, ud80 ud80Var, ru.yandex.taxi.single.a aVar) {
        super(wd80.class);
        this.x = o2y0Var;
        this.y = wz8Var;
        this.z = cv00Var;
        this.A = dVar;
        this.B = ud80Var;
        this.C = aVar;
        this.D = new a3y0(TaxiOrderLogGroup.ORDINARY_SEARCH.getTag(), "OrdinarySearchMVPPresenter");
        this.E = new ArrayList();
    }

    public static final Object Kg(b bVar, List list, SuspendLambda suspendLambda) {
        bVar.getClass();
        kol0 kol0Var = new kol0(dvw.b(suspendLambda));
        ((wd80) bVar.Dg()).p2(list, bVar.Mg(), new vd80(kol0Var));
        Object a = kol0Var.a();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return a;
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
    public static final Serializable Lg(b bVar, ContinuationImpl continuationImpl) {
        OrdinarySearchMVPPresenter$fetchNearestDrivers$1 ordinarySearchMVPPresenter$fetchNearestDrivers$1;
        int i;
        wz8 wz8Var = bVar.y;
        o2y0 o2y0Var = bVar.x;
        if (continuationImpl instanceof OrdinarySearchMVPPresenter$fetchNearestDrivers$1) {
            ordinarySearchMVPPresenter$fetchNearestDrivers$1 = (OrdinarySearchMVPPresenter$fetchNearestDrivers$1) continuationImpl;
            int i2 = ordinarySearchMVPPresenter$fetchNearestDrivers$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ordinarySearchMVPPresenter$fetchNearestDrivers$1.label = i2 - Integer.MIN_VALUE;
                Object obj = ordinarySearchMVPPresenter$fetchNearestDrivers$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ordinarySearchMVPPresenter$fetchNearestDrivers$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ru.yandex.taxi.single.a aVar = bVar.C;
                    Set set = o2y0Var.b().b.O.b;
                    zzs Mg = bVar.Mg();
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
                    ordinarySearchMVPPresenter$fetchNearestDrivers$1.label = 1;
                    obj = aVar.a(set, Mg, arrayList, ordinarySearchMVPPresenter$fetchNearestDrivers$1);
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
        ordinarySearchMVPPresenter$fetchNearestDrivers$1 = new OrdinarySearchMVPPresenter$fetchNearestDrivers$1(bVar, continuationImpl);
        Object obj3 = ordinarySearchMVPPresenter$fetchNearestDrivers$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ordinarySearchMVPPresenter$fetchNearestDrivers$1.label;
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
        d dVar = this.A;
        pzt0 pzt0Var = dVar.g;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        dVar.g = null;
        ud80 ud80Var = dVar.c;
        pzt0 pzt0Var2 = ud80Var.h;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        ud80Var.h = null;
        pzt0 pzt0Var3 = this.G;
        if (pzt0Var3 != null) {
            pzt0Var3.a(null);
        }
        this.G = null;
        pzt0 pzt0Var4 = this.F;
        if (pzt0Var4 != null) {
            pzt0Var4.a(null);
        }
        this.F = null;
    }

    @Override // defpackage.zc5
    public final void Gg() {
        SearchState k;
        this.A.b();
        tje.N(Jg(), null, null, new OrdinarySearchMVPPresenter$collectPollingModelUpdates$1(this, null), 3);
        tje.N(Jg(), null, null, new OrdinarySearchMVPPresenter$onResume$1(this, null), 3);
        String str = this.x.b().a;
        ud80 ud80Var = this.B;
        LinkedHashSet linkedHashSet = ud80Var.i;
        if (linkedHashSet.contains(str) || (k = ((n) ud80Var.d).k(str)) == null) {
            return;
        }
        linkedHashSet.add(str);
        u8w u8wVar = ud80Var.e;
        String str2 = k.a;
        String str3 = k.b;
        String format = ud80Var.g.format(new Date());
        String Hg = ud80Var.c.b.Hg();
        u8wVar.getClass();
        HashMap hashMap = new HashMap();
        if (str2 != null) {
            hashMap.put("order_id", str2);
        }
        if (str3 != null) {
            hashMap.put("tariff_zone", str3);
        }
        if (format != null) {
            hashMap.put(ClidProvider.TIMESTAMP, format);
        }
        if (Hg != null) {
            hashMap.put("user_phone_id", Hg);
        }
        u8wVar.a.a("SearchAnimation.HasSeen", hashMap, 1, new HashMap());
    }

    public final zzs Mg() {
        zzs v = this.x.b().v();
        if (v != null) {
            return v;
        }
        a3y0.d(this.D, "getOrderSourcePoint", null, new o3z(10), 2);
        return zzs.f;
    }

    public final void Ng() {
        this.D.getClass();
        a3y0.h(new String[]{"stopPolling"});
        hst hstVar = jst.e;
        z1e0 z1e0Var = this.H;
        if (z1e0Var != null) {
            ((o) this.z).d();
            m58 m58Var = z1e0Var.a;
            this.E.remove(m58Var);
            a3y0.h(new String[]{"stopPolling"});
            ((wd80) Dg()).p(new bm50(9, this, m58Var));
        }
        this.H = null;
    }
}
