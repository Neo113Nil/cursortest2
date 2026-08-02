package com.yandex.go.route.interactor;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.taxi.order.models.api.preorder.Preorder;
import defpackage.d0l0;
import defpackage.dqe0;
import defpackage.ffx;
import defpackage.h3y;
import defpackage.jst;
import defpackage.k99;
import defpackage.l0j;
import defpackage.mqz0;
import defpackage.scc;
import defpackage.sre0;
import defpackage.t41;
import defpackage.tpr;
import defpackage.xv21;
import defpackage.ycc;
import defpackage.z81;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;
import ru.yandex.taxi.preorder.tollroad.analytics.TollRoadSetReason;

/* loaded from: classes8.dex */
public final class b {
    public final dqe0 a;
    public final t41 b;
    public final l0j c;
    public final h3y d;
    public final Set e;
    public final n0 f;
    public final n0 g;
    public volatile boolean h;
    public volatile zzs i;

    public b(dqe0 dqe0Var, t41 t41Var, l0j l0jVar, h3y h3yVar, Set set) {
        this.a = dqe0Var;
        this.b = t41Var;
        this.c = l0jVar;
        this.d = h3yVar;
        this.e = set;
        BufferOverflow bufferOverflow = BufferOverflow.DROP_OLDEST;
        this.f = ffx.b(0, 1, bufferOverflow);
        this.g = ffx.b(0, 1, bufferOverflow);
    }

    public final void a(Address address) {
        b(c().a().size(), address);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        if (r2.h == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001a, code lost:
    
        if (r0.a(r0.G.i(r4)) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i, Address address) {
        if (i >= c().b.size()) {
            Preorder preorder = this.a.a;
        }
        Preorder preorder2 = this.a.a;
        if (!preorder2.a(preorder2.G.j(i, address))) {
        }
        e();
        f();
    }

    public final d0l0 c() {
        return this.a.a.G;
    }

    public final zzs d() {
        Address h = this.a.a.G.h();
        return (this.i != null || h == null) ? this.i : h.B();
    }

    public final void e() {
        this.c.a(this.a.a());
        g();
        mqz0 mqz0Var = (mqz0) this.d.get();
        mqz0Var.a.e(false, TollRoadSetReason.DESTINATION_ADDRESS_CHANGED);
    }

    public final void f() {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((sre0) it.next()).a(this.a.a.G.b);
        }
    }

    public final void g() {
        com.yandex.go.analytics.e analyticsData;
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        String pickAction;
        com.yandex.go.analytics.e analyticsData2;
        this.h = false;
        d0l0 c = c();
        this.f.g(c);
        com.yandex.go.route.analytics.e eVar = (com.yandex.go.route.analytics.e) this.b;
        eVar.getClass();
        Address h = c.h();
        if (h == null) {
            return;
        }
        Address b = c.b();
        Pair pair = new Pair(h, b);
        if (pair.equals(eVar.n) || (analyticsData = h.getAnalyticsData()) == null) {
            return;
        }
        Address address = eVar.o;
        com.yandex.go.analytics.e analyticsData3 = address != null ? address.getAnalyticsData() : null;
        LinkedHashMap b2 = analyticsData.b();
        b2.put("needs_confirmation", Boolean.valueOf(eVar.p));
        Long l = analyticsData.getA().e;
        if (l != null) {
            b2.put("update_time", xv21.a(new Date(l.longValue())));
        }
        String pickAction2 = h.getPickAction();
        if (pickAction2 != null) {
            b2.put("action", pickAction2);
        }
        if (b == null || (analyticsData2 = b.getAnalyticsData()) == null) {
            linkedHashMap = null;
        } else {
            linkedHashMap = analyticsData2.b();
            linkedHashMap.put("needs_confirmation", Boolean.valueOf(eVar.q));
        }
        if (analyticsData3 != null) {
            linkedHashMap2 = analyticsData3.b();
            Long l2 = analyticsData3.getA().e;
            if (l2 != null) {
                linkedHashMap2.put("update_time", xv21.a(new Date(l2.longValue())));
            }
            Address address2 = eVar.o;
            if (address2 != null && (pickAction = address2.getPickAction()) != null) {
                linkedHashMap2.put("action", pickAction);
            }
        } else {
            linkedHashMap2 = null;
        }
        Map d = eVar.f.d();
        k99 k99Var = eVar.b;
        Object obj = d.get("app_launch_type");
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = d.get("timeSinceAppLaunch");
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        Object obj3 = d.get("time_since_app_launch_sec");
        String str3 = obj3 instanceof String ? (String) obj3 : null;
        k99Var.getClass();
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("app_launch_type", str);
        }
        if (linkedHashMap != null) {
            hashMap.put("destination", linkedHashMap);
        }
        if (linkedHashMap2 != null) {
            hashMap.put("prev_starting", linkedHashMap2);
        }
        hashMap.put("starting", b2);
        if (str2 != null) {
            hashMap.put("timeSinceAppLaunch", str2);
        }
        if (str3 != null) {
            hashMap.put("time_since_app_launch_sec", str3);
        }
        k99Var.a.a("ChangeAddressPoints", hashMap, 1, new HashMap());
        eVar.o = h;
        eVar.n = pair;
    }

    public final void h() {
        this.g.g(c());
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((sre0) it.next()).b(c().h());
        }
    }

    public final boolean i(int i) {
        if (i < 0) {
            jst.e.k(new IllegalArgumentException("stop index is out of range"), "stop index is out of range");
            return false;
        }
        Preorder preorder = this.a.a;
        boolean a = preorder.a(preorder.G.e(i));
        f();
        if (!a) {
            return false;
        }
        e();
        return true;
    }

    public final void j() {
        if (this.a.a.p(EmptyList.a)) {
            e();
        }
        f();
    }

    public final tpr k() {
        return com.yandex.go.coroutines.b.d(this.f, new PreorderRouteInteractorImpl$routeFlow$1(this, null));
    }

    public final void l(Address address) {
        if (this.a.a.p(Collections.singletonList(address))) {
            e();
        }
        f();
    }

    public final void m(ZoneAddress zoneAddress, zzs zzsVar) {
        this.i = zzsVar;
        boolean o = this.a.a.o(zoneAddress);
        if (o || this.h) {
            g();
        }
        if (o) {
            mqz0 mqz0Var = (mqz0) this.d.get();
            mqz0Var.a.e(false, TollRoadSetReason.SOURCE_ADDRESS_CHANGED);
        }
        h();
    }

    public final void o(List list) {
        if (this.a.a.p(list)) {
            e();
        }
        f();
    }

    public final boolean p(List list) {
        List list2 = this.a.a.G.b;
        o(list);
        if (list.size() != list2.size()) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            if (!z81.b((Address) kotlin.collections.a.S(i, list2), (Address) obj)) {
                arrayList.add(obj);
            }
            i = i2;
        }
        return !arrayList.isEmpty();
    }

    public final void q(Address address) {
        ArrayList arrayList = new ArrayList(this.a.a.G.b);
        ycc.A(arrayList);
        arrayList.add(address);
        if (this.a.a.p(arrayList)) {
            e();
        }
        f();
    }

    public final boolean r(ZoneAddress zoneAddress) {
        Address h = this.a.a.G.h();
        m(zoneAddress, null);
        return !z81.b(h, zoneAddress.a);
    }
}
