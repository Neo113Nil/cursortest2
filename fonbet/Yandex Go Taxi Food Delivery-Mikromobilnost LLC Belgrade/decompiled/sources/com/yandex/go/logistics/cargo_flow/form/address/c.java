package com.yandex.go.logistics.cargo_flow.form.address;

import com.yandex.delivery.mapper.model.PointType;
import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.clarify_address.AddressClarificationReason;
import com.yandex.go.taxi.order.models.api.preorder.Preorder;
import com.yandex.go.zone.model.Zone;
import defpackage.a0t;
import defpackage.bvf0;
import defpackage.cni;
import defpackage.cyq;
import defpackage.d0l0;
import defpackage.dyq;
import defpackage.e0l0;
import defpackage.eyq;
import defpackage.f4l0;
import defpackage.fyq;
import defpackage.g8l0;
import defpackage.gw00;
import defpackage.gyq;
import defpackage.hyq;
import defpackage.i2t;
import defpackage.j2t;
import defpackage.jl40;
import defpackage.jsq0;
import defpackage.kkb0;
import defpackage.kr0;
import defpackage.ksq0;
import defpackage.lud0;
import defpackage.mkb0;
import defpackage.mqz0;
import defpackage.nkb0;
import defpackage.ny61;
import defpackage.oo0;
import defpackage.qv0;
import defpackage.r0i;
import defpackage.r0l0;
import defpackage.r0t;
import defpackage.s9e;
import defpackage.scc;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tse;
import defpackage.vuh;
import defpackage.w511;
import defpackage.y5i;
import defpackage.zy11;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.internal.g;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.preorder.tollroad.analytics.TollRoadSetReason;

/* loaded from: classes5.dex */
public final class c implements f4l0 {
    public final y5i a;
    public final com.yandex.go.route.interactor.b b;
    public final com.yandex.go.zone.interactors.b c;
    public final kr0 d;
    public final j2t e;
    public final tse f;
    public final r0 g;
    public final g h;

    public c(y5i y5iVar, com.yandex.go.route.interactor.b bVar, com.yandex.go.zone.interactors.b bVar2, kr0 kr0Var, j2t j2tVar, tse tseVar) {
        this.a = y5iVar;
        this.b = bVar;
        this.c = bVar2;
        this.d = kr0Var;
        this.e = j2tVar;
        this.f = tseVar;
        r0 c = bvf0.c(Boolean.FALSE);
        this.g = c;
        this.h = e.X(c, new DeliveryRouteInteractorImpl$special$$inlined$flatMapLatest$1(this, null));
    }

    public static e0l0 h(d0l0 d0l0Var, cni cniVar) {
        r0i r0iVar;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        List a = d0l0Var.a();
        ArrayList arrayList = new ArrayList(tcc.n(a, 10));
        int i = 0;
        for (Object obj : a) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            Address address = (Address) obj;
            Pair pair = i == 0 ? new Pair(cniVar.a, PointType.SOURCE) : new Pair(kotlin.collections.a.S(i - 1, cniVar.b), PointType.DESTINATION);
            vuh vuhVar = (vuh) pair.getFirst();
            PointType pointType = (PointType) pair.getSecond();
            String D1 = address.D1();
            a0t a0tVar = new a0t(address.B().a, address.B().b, address.B().c);
            String uri = address.getUri();
            String str6 = address.getAddress().g;
            arrayList.add(new qv0(new oo0(D1, pointType, uri, str6 == null ? "" : str6, address.d(), a0tVar, address.q0(), address.getZoneName()), (vuhVar == null || (str5 = vuhVar.b) == null) ? "" : str5, (vuhVar == null || (str3 = vuhVar.e) == null) ? "" : str3, (vuhVar == null || (str4 = vuhVar.c) == null) ? "" : str4, (vuhVar == null || (str2 = vuhVar.d) == null) ? "" : str2, (vuhVar == null || (str = vuhVar.f) == null) ? "" : str, (vuhVar == null || (r0iVar = vuhVar.a) == null) ? new s9e(0) : new s9e(r0iVar.a, r0iVar.b), vuhVar != null ? vuhVar.h : EmptyList.a, 256));
            i = i2;
        }
        return new e0l0(arrayList);
    }

    public static r0i j(s9e s9eVar) {
        return new r0i(s9eVar.a, s9eVar.b, 4);
    }

    @Override // defpackage.f4l0
    public final void a(int i, int i2) {
        com.yandex.go.route.interactor.b bVar = this.b;
        ArrayList arrayList = new ArrayList(bVar.c().a());
        if (arrayList.size() < 2 || i == i2) {
            return;
        }
        arrayList.add(i, arrayList.remove(i2));
        if (i != 0 && i2 != 0) {
            bVar.o(kotlin.collections.a.J(arrayList, 1));
        } else {
            tje.N(this.f, null, null, new DeliveryRouteInteractorImpl$swapAddresses$1(this, arrayList, i, i2, null), 3);
        }
    }

    @Override // defpackage.f4l0
    public final void b(g8l0 g8l0Var, g8l0 g8l0Var2) {
        com.yandex.go.route.interactor.b bVar = this.b;
        ArrayList arrayList = new ArrayList(bVar.c().a());
        int i = g8l0Var.b;
        int i2 = g8l0Var.a;
        int i3 = (i - i2) + 1;
        int i4 = g8l0Var2.b;
        int i5 = g8l0Var2.a;
        Pair pair = i3 < (i4 - i5) + 1 ? new Pair(g8l0Var, g8l0Var2) : new Pair(g8l0Var2, g8l0Var);
        g8l0 g8l0Var3 = (g8l0) pair.getFirst();
        g8l0 g8l0Var4 = (g8l0) pair.getSecond();
        int i6 = g8l0Var3.b;
        int i7 = g8l0Var3.a;
        int i8 = (i6 - i7) + 1;
        for (int i9 = 0; i9 < i8; i9++) {
            Collections.swap(arrayList, i7 + i9, g8l0Var4.a + i9);
        }
        int i10 = (i6 - i7) + 1 + g8l0Var4.a;
        int i11 = g8l0Var4.b;
        if (i10 <= i11) {
            while (true) {
                arrayList.add(i6, arrayList.remove(i10));
                if (i10 == i11) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        if (i2 == 0 || i5 == 0) {
            tje.N(this.f, null, null, new DeliveryRouteInteractorImpl$swapAddressGroups$1(this, arrayList, g8l0Var, g8l0Var2, null), 3);
        } else {
            bVar.o(kotlin.collections.a.J(arrayList, 1));
        }
    }

    @Override // defpackage.f4l0
    public final void c(hyq hyqVar, String str, int i) {
        fyq fyqVar = fyq.a;
        dyq dyqVar = dyq.a;
        eyq eyqVar = eyq.a;
        gyq gyqVar = gyq.a;
        cyq cyqVar = cyq.a;
        if (i == 0) {
            if (jl40.l(hyqVar, cyqVar)) {
                y5i.q(this.a, null, null, str, null, null, null, null, 251);
                return;
            }
            if (jl40.l(hyqVar, gyqVar)) {
                y5i.q(this.a, null, null, null, null, str, null, null, 239);
                return;
            }
            if (jl40.l(hyqVar, eyqVar)) {
                y5i.q(this.a, null, null, null, str, null, null, null, 247);
                return;
            }
            if (jl40.l(hyqVar, dyqVar)) {
                y5i.q(this.a, null, null, null, null, null, str, null, 223);
                return;
            } else if (jl40.l(hyqVar, fyqVar)) {
                y5i.q(this.a, null, str, null, null, null, null, null, 253);
                return;
            } else {
                w511.b();
                return;
            }
        }
        if (jl40.l(hyqVar, cyqVar)) {
            y5i.n(this.a, i - 1, null, null, str, null, null, null, null, 502);
            return;
        }
        if (jl40.l(hyqVar, gyqVar)) {
            y5i.n(this.a, i - 1, null, null, null, null, str, null, null, 478);
            return;
        }
        if (jl40.l(hyqVar, eyqVar)) {
            y5i.n(this.a, i - 1, null, null, null, str, null, null, null, 494);
        } else if (jl40.l(hyqVar, dyqVar)) {
            y5i.n(this.a, i - 1, null, null, null, null, null, str, null, 446);
        } else if (!jl40.l(hyqVar, fyqVar)) {
            w511.b();
        } else {
            y5i.n(this.a, i - 1, null, str, null, null, null, null, null, 506);
        }
    }

    @Override // defpackage.f4l0
    public final tpr d() {
        return this.h;
    }

    @Override // defpackage.f4l0
    public final void e(int i, s9e s9eVar) {
        y5i y5iVar = this.a;
        if (i == 0) {
            y5i.q(y5iVar, j(s9eVar), null, null, null, null, null, null, 254);
        } else {
            y5i.n(y5iVar, i - 1, j(s9eVar), null, null, null, null, null, null, 508);
        }
    }

    @Override // defpackage.f4l0
    public final void f(int i, s9e s9eVar, String str, String str2, String str3, String str4, String str5, List list) {
        LinkedHashMap linkedHashMap = null;
        y5i y5iVar = this.a;
        if (i == 0) {
            r0i j = s9eVar != null ? j(s9eVar) : null;
            if (list != null) {
                List<nkb0> list2 = list;
                ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                for (nkb0 nkb0Var : list2) {
                    arrayList.add(new kkb0(nkb0Var.a, nkb0Var.b));
                }
                int d = gw00.d(tcc.n(arrayList, 10));
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(d >= 16 ? d : 16);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    linkedHashMap2.put(((kkb0) next).a, next);
                }
                linkedHashMap = new LinkedHashMap(linkedHashMap2);
            }
            y5i.q(y5iVar, j, str, str2, str3, str4, str5, linkedHashMap, 64);
            return;
        }
        int i2 = i - 1;
        r0i j2 = s9eVar != null ? j(s9eVar) : null;
        if (list != null) {
            List<nkb0> list3 = list;
            ArrayList arrayList2 = new ArrayList(tcc.n(list3, 10));
            for (nkb0 nkb0Var2 : list3) {
                arrayList2.add(new kkb0(nkb0Var2.a, nkb0Var2.b));
            }
            int d2 = gw00.d(tcc.n(arrayList2, 10));
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(d2 >= 16 ? d2 : 16);
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                linkedHashMap3.put(((kkb0) next2).a, next2);
            }
            linkedHashMap = new LinkedHashMap(linkedHashMap3);
        }
        y5i.n(y5iVar, i2, j2, str, str2, str3, str4, str5, linkedHashMap, 128);
    }

    @Override // defpackage.f4l0
    public final void g(int i) {
        this.b.i(i);
    }

    @Override // defpackage.f4l0
    public final e0l0 getRoute() {
        return h(this.b.c(), this.a.l());
    }

    public final void i(int i, vuh vuhVar) {
        y5i y5iVar = this.a;
        if (i == 0) {
            String str = vuhVar.c;
            String str2 = vuhVar.b;
            String str3 = vuhVar.d;
            r0i r0iVar = vuhVar.a;
            String str4 = vuhVar.e;
            String str5 = vuhVar.f;
            boolean z = vuhVar.g;
            List list = vuhVar.h;
            int d = gw00.d(tcc.n(list, 10));
            LinkedHashMap linkedHashMap = new LinkedHashMap(d >= 16 ? d : 16);
            for (Object obj : list) {
                linkedHashMap.put(((mkb0) obj).getId(), obj);
            }
            y5iVar.h(y5iVar.g, r0iVar, str, str4, str5, str2, str3, new LinkedHashMap(linkedHashMap), Boolean.valueOf(z));
            y5iVar.k();
            return;
        }
        int i2 = i - 1;
        String str6 = vuhVar.c;
        String str7 = vuhVar.b;
        String str8 = vuhVar.d;
        r0i r0iVar2 = vuhVar.a;
        String str9 = vuhVar.e;
        String str10 = vuhVar.f;
        boolean z2 = vuhVar.g;
        List list2 = vuhVar.h;
        int d2 = gw00.d(tcc.n(list2, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(d2 >= 16 ? d2 : 16);
        for (Object obj2 : list2) {
            linkedHashMap2.put(((mkb0) obj2).getId(), obj2);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(linkedHashMap2);
        Boolean valueOf = Boolean.valueOf(z2);
        lud0 lud0Var = (lud0) kotlin.collections.a.S(i2, y5iVar.h);
        if (lud0Var != null) {
            y5iVar.h(lud0Var, r0iVar2, str6, str9, str10, str7, str8, linkedHashMap3, valueOf);
            y5iVar.k();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(List list, g8l0 g8l0Var, g8l0 g8l0Var2, ContinuationImpl continuationImpl) {
        DeliveryRouteInteractorImpl$updateSourceAndDestAddresses$2 deliveryRouteInteractorImpl$updateSourceAndDestAddresses$2;
        int i;
        cni l;
        List list2;
        g8l0 g8l0Var3;
        g8l0 g8l0Var4;
        Address address;
        com.yandex.go.route.interactor.b bVar;
        Preorder preorder;
        boolean l2;
        r0l0 r0l0Var;
        zy11 zy11Var = zy11.a;
        if (continuationImpl instanceof DeliveryRouteInteractorImpl$updateSourceAndDestAddresses$2) {
            deliveryRouteInteractorImpl$updateSourceAndDestAddresses$2 = (DeliveryRouteInteractorImpl$updateSourceAndDestAddresses$2) continuationImpl;
            int i2 = deliveryRouteInteractorImpl$updateSourceAndDestAddresses$2.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deliveryRouteInteractorImpl$updateSourceAndDestAddresses$2.label = i2 - Integer.MIN_VALUE;
                Object obj = deliveryRouteInteractorImpl$updateSourceAndDestAddresses$2.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deliveryRouteInteractorImpl$updateSourceAndDestAddresses$2.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!list.isEmpty()) {
                        l = this.a.l();
                        Address address2 = (Address) kotlin.collections.a.P(list);
                        j2t j2tVar = this.e;
                        Set a0 = address2.a0();
                        j2tVar.getClass();
                        i2t i2tVar = new i2t(6);
                        Iterator it = a0.iterator();
                        while (it.hasNext()) {
                            j2tVar.a.put((r0t) it.next(), i2tVar);
                        }
                        com.yandex.go.zone.interactors.b bVar2 = this.c;
                        String zoneName = address2.getZoneName();
                        zzs B = address2.B();
                        list2 = list;
                        deliveryRouteInteractorImpl$updateSourceAndDestAddresses$2.L$0 = list2;
                        g8l0Var3 = g8l0Var;
                        deliveryRouteInteractorImpl$updateSourceAndDestAddresses$2.L$1 = g8l0Var3;
                        g8l0Var4 = g8l0Var2;
                        deliveryRouteInteractorImpl$updateSourceAndDestAddresses$2.L$2 = g8l0Var4;
                        deliveryRouteInteractorImpl$updateSourceAndDestAddresses$2.L$3 = l;
                        deliveryRouteInteractorImpl$updateSourceAndDestAddresses$2.L$4 = address2;
                        deliveryRouteInteractorImpl$updateSourceAndDestAddresses$2.label = 1;
                        Object d = bVar2.d(zoneName, B, deliveryRouteInteractorImpl$updateSourceAndDestAddresses$2);
                        if (d == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        address = address2;
                        obj = d;
                    }
                    return zy11Var;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                address = (Address) deliveryRouteInteractorImpl$updateSourceAndDestAddresses$2.L$4;
                l = (cni) deliveryRouteInteractorImpl$updateSourceAndDestAddresses$2.L$3;
                g8l0 g8l0Var5 = (g8l0) deliveryRouteInteractorImpl$updateSourceAndDestAddresses$2.L$2;
                g8l0 g8l0Var6 = (g8l0) deliveryRouteInteractorImpl$updateSourceAndDestAddresses$2.L$1;
                List list3 = (List) deliveryRouteInteractorImpl$updateSourceAndDestAddresses$2.L$0;
                kotlin.b.b(obj);
                list2 = list3;
                g8l0Var4 = g8l0Var5;
                g8l0Var3 = g8l0Var6;
                bVar = this.b;
                ZoneAddress zoneAddress = new ZoneAddress(address, (Zone) obj);
                List J = kotlin.collections.a.J(list2, 1);
                bVar.i = null;
                preorder = bVar.a.a;
                d0l0 d0l0Var = preorder.G;
                d0l0 k = d0l0Var.l(zoneAddress).k(J);
                l2 = jl40.l(d0l0Var.a, k.a);
                boolean z = !l2;
                boolean l3 = jl40.l(d0l0Var.b, k.b);
                boolean z2 = !l3;
                if (l2 || !l3) {
                    if (!l2) {
                        Address h = d0l0Var.h();
                        if (!jl40.l(h != null ? h.B() : null, address.B())) {
                            List W0 = address.W0();
                            jsq0 jsq0Var = ksq0.a;
                            preorder.U = new jsq0(W0);
                        }
                        preorder.A = address.b1();
                    }
                    preorder.G = k;
                    r0l0Var = new r0l0(z, z2);
                } else {
                    r0l0Var = new r0l0(false, false);
                }
                if (!r0l0Var.a || r0l0Var.b || bVar.h) {
                    bVar.g();
                    if (r0l0Var.a) {
                        ((mqz0) bVar.d.get()).a.e(false, TollRoadSetReason.SOURCE_ADDRESS_CHANGED);
                    }
                    if (r0l0Var.b) {
                        bVar.c.a(bVar.a.a());
                        ((mqz0) bVar.d.get()).a.e(false, TollRoadSetReason.DESTINATION_ADDRESS_CHANGED);
                    }
                }
                bVar.h();
                bVar.f();
                ((com.yandex.go.clarify_address.a) this.d).c(true, AddressClarificationReason.Other);
                if (g8l0Var3.a == 0) {
                    i(0, (vuh) l.b.get(g8l0Var4.b));
                    i(g8l0Var3.a, l.a);
                    return zy11Var;
                }
                int i3 = g8l0Var4.a;
                if (i3 != 0) {
                    i(0, (vuh) l.b.get(i3 - 1));
                    i(g8l0Var3.b + 1, l.a);
                }
                return zy11Var;
            }
        }
        deliveryRouteInteractorImpl$updateSourceAndDestAddresses$2 = new DeliveryRouteInteractorImpl$updateSourceAndDestAddresses$2(this, continuationImpl);
        Object obj2 = deliveryRouteInteractorImpl$updateSourceAndDestAddresses$2.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deliveryRouteInteractorImpl$updateSourceAndDestAddresses$2.label;
        if (i != 0) {
        }
        bVar = this.b;
        ZoneAddress zoneAddress2 = new ZoneAddress(address, (Zone) obj2);
        List J2 = kotlin.collections.a.J(list2, 1);
        bVar.i = null;
        preorder = bVar.a.a;
        d0l0 d0l0Var2 = preorder.G;
        d0l0 k2 = d0l0Var2.l(zoneAddress2).k(J2);
        l2 = jl40.l(d0l0Var2.a, k2.a);
        boolean z3 = !l2;
        boolean l32 = jl40.l(d0l0Var2.b, k2.b);
        boolean z22 = !l32;
        if (l2) {
        }
        if (!l2) {
        }
        preorder.G = k2;
        r0l0Var = new r0l0(z3, z22);
        if (!r0l0Var.a) {
        }
        bVar.g();
        if (r0l0Var.a) {
        }
        if (r0l0Var.b) {
        }
        bVar.h();
        bVar.f();
        ((com.yandex.go.clarify_address.a) this.d).c(true, AddressClarificationReason.Other);
        if (g8l0Var3.a == 0) {
        }
    }
}
