package com.yandex.go.preorder.confirm;

import android.location.Location;
import com.yandex.go.address.models.Address;
import com.yandex.go.route.analytics.e;
import com.yandex.go.superapp.order.multi.old.provider.g;
import com.yandex.go.taxi.order.models.api.preorder.Preorder;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import defpackage.b1;
import defpackage.d0l0;
import defpackage.eu2;
import defpackage.ffx;
import defpackage.fvd0;
import defpackage.g6y0;
import defpackage.g8e;
import defpackage.gvd0;
import defpackage.gw00;
import defpackage.h3y;
import defpackage.hif;
import defpackage.iw1;
import defpackage.l0j;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.sb2;
import defpackage.sho;
import defpackage.snx0;
import defpackage.t41;
import defpackage.tcc;
import defpackage.teh;
import defpackage.tje;
import defpackage.tnx0;
import defpackage.tse;
import defpackage.u8w;
import defpackage.unx0;
import defpackage.wiq0;
import defpackage.wpb0;
import defpackage.xcv0;
import defpackage.yh70;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.text.Regex;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;
import ru.yandex.taxi.persuggest.source.b;

/* loaded from: classes6.dex */
public final class a {
    public final tse a;
    public final ru.yandex.taxi.preorder.source.pickup.a b;
    public final t41 c;
    public final b d;
    public final wiq0 e;
    public final eu2 f;
    public final ru.yandex.taxi.orderforanother.repository.a g;
    public final l0j h;
    public final b1 i;
    public final unx0 j;
    public final iw1 k;
    public final g l;
    public final yh70 m;
    public final g6y0 n;
    public final h3y o;
    public teh p;
    public final n0 q = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);

    public a(tse tseVar, ru.yandex.taxi.preorder.source.pickup.a aVar, t41 t41Var, b bVar, wiq0 wiq0Var, eu2 eu2Var, ru.yandex.taxi.orderforanother.repository.a aVar2, l0j l0jVar, b1 b1Var, unx0 unx0Var, iw1 iw1Var, g gVar, yh70 yh70Var, g6y0 g6y0Var, h3y h3yVar) {
        this.a = tseVar;
        this.b = aVar;
        this.c = t41Var;
        this.d = bVar;
        this.e = wiq0Var;
        this.f = eu2Var;
        this.g = aVar2;
        this.h = l0jVar;
        this.i = b1Var;
        this.j = unx0Var;
        this.k = iw1Var;
        this.l = gVar;
        this.m = yh70Var;
        this.n = g6y0Var;
        this.o = h3yVar;
    }

    public final void a(Preorder preorder) {
        teh tehVar;
        Preorder preorder2;
        boolean z;
        zzs zzsVar;
        zzs zzsVar2;
        String str;
        String str2;
        ru.yandex.taxi.preorder.source.pickup.a aVar;
        teh tehVar2 = this.p;
        if (tehVar2 == null) {
            ny61.r("OrderConfirmInteractor state must be set before confirm");
            return;
        }
        ((e) this.c).b((Address) tehVar2.y, (Address) tehVar2.z, (String) tehVar2.A);
        hif hifVar = (hif) tehVar2.b;
        ArrayList arrayList = (ArrayList) hifVar.d;
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((gvd0) it.next()).a);
        }
        ArrayList o = tcc.o(arrayList2);
        HashMap hashMap = new HashMap();
        int size = o.size();
        for (int i = 0; i < size; i++) {
            hashMap.put(String.valueOf(i), ((fvd0) o.get(i)).a());
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("suggest", hashMap);
        int i2 = hifVar.b;
        int i3 = -1;
        if (i2 != -1) {
            if (i2 != -1) {
                i3 = hifVar.c;
                if (i2 > 0) {
                    Iterator it2 = arrayList.subList(0, i2).iterator();
                    int i4 = 0;
                    while (it2.hasNext()) {
                        i4 += ((gvd0) it2.next()).a.size();
                    }
                    i3 += i4;
                }
            }
            hashMap2.put("selected", Integer.valueOf(i3));
        }
        Object obj = hashMap2.get("suggest");
        Map map = obj instanceof Map ? (Map) obj : null;
        b1 b1Var = this.i;
        Object obj2 = hashMap2.get("selected");
        Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
        b1Var.getClass();
        HashMap hashMap3 = new HashMap();
        if (map != null) {
            hashMap3.put("suggest", map);
        }
        if (num != null) {
            hashMap3.put("selected", num);
        }
        b1Var.a.a("DestinationSuggests", hashMap3, 1, new HashMap());
        Address h = preorder.G.h();
        if (!tehVar2.a || h == null || (zzsVar = (zzs) tehVar2.w) == null || (zzsVar2 = (zzs) tehVar2.x) == null) {
            tehVar = tehVar2;
        } else {
            ru.yandex.taxi.preorder.source.pickup.a aVar2 = this.b;
            aVar2.h = zzsVar;
            aVar2.i = zzsVar2;
            zzs B = h.B();
            String q2 = h.q2();
            String pickAction = h.getPickAction();
            HashMap hashMap4 = new HashMap();
            HashMap hashMap5 = new HashMap();
            hashMap5.put("lat", Double.valueOf(B.a));
            double d = B.b;
            hashMap5.put("lon", Double.valueOf(d));
            int i5 = B.c;
            if (i5 > 0) {
                hashMap5.put("acc", Integer.valueOf(i5));
            }
            String str3 = "startingPoint.coordinate";
            hashMap4.put("startingPoint.coordinate", hashMap5);
            String str4 = "startingPoint.method";
            hashMap4.put("startingPoint.method", q2);
            hashMap4.put("startingPoint.action", pickAction);
            Location location = new Location("source");
            teh tehVar3 = tehVar2;
            location.setLatitude(B.a);
            location.setLongitude(d);
            if (aVar2.o.isEmpty()) {
                tehVar = tehVar3;
                str = "startingPoint.method";
                str2 = "startingPoint.coordinate";
                aVar = aVar2;
            } else {
                wpb0 wpb0Var = (wpb0) aVar2.o.b().get(0);
                zzs zzsVar3 = wpb0Var.b;
                Location location2 = new Location("pickup");
                location2.setLatitude(zzsVar3.a);
                location2.setLongitude(zzsVar3.b);
                float distanceTo = location.distanceTo(location2);
                ListIterator listIterator = aVar2.o.b().listIterator(1);
                wpb0 wpb0Var2 = wpb0Var;
                while (listIterator.hasNext()) {
                    ListIterator listIterator2 = listIterator;
                    wpb0 wpb0Var3 = (wpb0) listIterator.next();
                    teh tehVar4 = tehVar3;
                    zzs zzsVar4 = wpb0Var3.b;
                    String str5 = str4;
                    String str6 = str3;
                    location2.setLatitude(zzsVar4.a);
                    location2.setLongitude(zzsVar4.b);
                    float distanceTo2 = location.distanceTo(location2);
                    ru.yandex.taxi.preorder.source.pickup.a aVar3 = aVar2;
                    if (Double.compare(distanceTo2, distanceTo) < 0) {
                        wpb0Var2 = wpb0Var3;
                        tehVar3 = tehVar4;
                        listIterator = listIterator2;
                        str3 = str6;
                        str4 = str5;
                        aVar2 = aVar3;
                        distanceTo = distanceTo2;
                    } else {
                        tehVar3 = tehVar4;
                        listIterator = listIterator2;
                        str3 = str6;
                        str4 = str5;
                        aVar2 = aVar3;
                    }
                }
                tehVar = tehVar3;
                ru.yandex.taxi.preorder.source.pickup.a aVar4 = aVar2;
                str = str4;
                str2 = str3;
                hashMap4.put("closestPickupPoint.id", wpb0Var2.a);
                zzs zzsVar5 = wpb0Var2.b;
                HashMap hashMap6 = new HashMap();
                hashMap6.put("lat", Double.valueOf(zzsVar5.a));
                hashMap6.put("lon", Double.valueOf(zzsVar5.b));
                int i6 = zzsVar5.c;
                if (i6 > 0) {
                    hashMap6.put("acc", Integer.valueOf(i6));
                }
                hashMap4.put("closestPickupPoint.coordinate", hashMap6);
                aVar = aVar4;
            }
            zzs zzsVar6 = aVar.h;
            if (zzsVar6 != null) {
                HashMap hashMap7 = new HashMap();
                hashMap7.put("lat", Double.valueOf(zzsVar6.a));
                hashMap7.put("lon", Double.valueOf(zzsVar6.b));
                int i7 = zzsVar6.c;
                if (i7 > 0) {
                    hashMap7.put("acc", Integer.valueOf(i7));
                }
                hashMap4.put("nearestPosition.initial.coordinate", hashMap7);
            }
            zzs zzsVar7 = aVar.i;
            if (zzsVar7 != null) {
                HashMap hashMap8 = new HashMap();
                hashMap8.put("lat", Double.valueOf(zzsVar7.a));
                hashMap8.put("lon", Double.valueOf(zzsVar7.b));
                int i8 = zzsVar7.c;
                if (i8 > 0) {
                    hashMap8.put("acc", Integer.valueOf(i8));
                }
                hashMap4.put("nearestPosition.final.coordinate", hashMap8);
            }
            u8w u8wVar = aVar.a;
            String str7 = str2;
            Object obj3 = hashMap4.get(str7);
            Map map2 = obj3 instanceof Map ? (Map) obj3 : null;
            Object obj4 = hashMap4.get("startingPoint.action");
            String str8 = obj4 instanceof String ? (String) obj4 : null;
            String str9 = str;
            Object obj5 = hashMap4.get(str9);
            String str10 = obj5 instanceof String ? (String) obj5 : null;
            Object obj6 = hashMap4.get("closestPickupPoint.id");
            String str11 = obj6 instanceof String ? (String) obj6 : null;
            Object obj7 = hashMap4.get("closestPickupPoint.coordinate");
            Map map3 = obj7 instanceof Map ? (Map) obj7 : null;
            Object obj8 = hashMap4.get("nearestPosition.initial.coordinate");
            Map map4 = obj8 instanceof Map ? (Map) obj8 : null;
            Object obj9 = hashMap4.get("nearestPosition.final.coordinate");
            Map map5 = obj9 instanceof Map ? (Map) obj9 : null;
            u8wVar.getClass();
            HashMap hashMap9 = new HashMap();
            if (map2 != null) {
                hashMap9.put(str7, map2);
            }
            if (str8 != null) {
                hashMap9.put("startingPoint.action", str8);
            }
            if (str10 != null) {
                hashMap9.put(str9, str10);
            }
            if (str11 != null) {
                hashMap9.put("closestPickupPoint.id", str11);
            }
            if (map3 != null) {
                hashMap9.put("closestPickupPoint.coordinate", map3);
            }
            if (map4 != null) {
                hashMap9.put("nearestPosition.initial.coordinate", map4);
            }
            if (map5 != null) {
                hashMap9.put("nearestPosition.final.coordinate", map5);
            }
            u8wVar.a.a("OrderConfirmed.PickupPoints", hashMap9, 1, new HashMap());
        }
        tje.N(this.a, null, null, new OrderConfirmInteractorImpl$onOrderConfirm$2(this, null), 3);
        pex0 pex0Var = (pex0) tehVar.c;
        String str12 = pex0Var != null ? pex0Var.b : null;
        if (str12 == null || str12.length() == 0) {
            preorder2 = preorder;
        } else {
            preorder2 = preorder;
            String str13 = preorder2.V;
            d0l0 d0l0Var = preorder2.G;
            String str14 = preorder2.b;
            boolean e = this.l.e();
            yh70 yh70Var = this.m;
            int size2 = ((List) d0l0Var.e.getValue()).size();
            Boolean valueOf = Boolean.valueOf(e);
            if (!e) {
                valueOf = null;
            }
            yh70Var.getClass();
            HashMap hashMap10 = new HashMap();
            hashMap10.put(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, str12);
            if (str14 != null) {
                hashMap10.put("offer_id", str14);
            }
            hashMap10.put("intermediate_points", Integer.valueOf(size2));
            hashMap10.put("vertical_id", str13);
            if (valueOf != null) {
                hashMap10.put("is_multiorder", valueOf);
            }
            yh70Var.a.a("Order.Sent", hashMap10, 1, new HashMap());
            double d2 = preorder2.F;
            unx0 unx0Var = this.j;
            String valueOf2 = d2 > 0.0d ? String.valueOf(d2) : "1.0";
            unx0Var.getClass();
            tnx0 tnx0Var = new tnx0("Pressed", str12, valueOf2);
            snx0 snx0Var = unx0Var.d;
            tnx0 tnx0Var2 = snx0Var.d;
            if (tnx0Var2 == null || !tnx0Var2.equals(tnx0Var)) {
                xcv0 xcv0Var = unx0Var.a;
                Map e2 = gw00.e(new Pair("Next", gw00.e(new Pair("Pressed", gw00.e(new Pair(str12, g8e.z("Surge", valueOf2)))))));
                xcv0Var.getClass();
                HashMap hashMap11 = new HashMap();
                hashMap11.put("next", e2);
                HashMap hashMap12 = new HashMap();
                Regex regex = sho.a;
                z = true;
                xcv0Var.a.a(sb2.q("Summary", hashMap11), hashMap11, 1, hashMap12);
                snx0Var.d = tnx0Var;
                ru.yandex.taxi.orderforanother.repository.a aVar5 = this.g;
                aVar5.e.a = z;
                aVar5.h = false;
                this.k.c.a = false;
                this.f.getClass();
                this.p = null;
                ((com.yandex.go.taxi.order.network.e) this.o.get()).b(preorder2);
            }
        }
        z = true;
        ru.yandex.taxi.orderforanother.repository.a aVar52 = this.g;
        aVar52.e.a = z;
        aVar52.h = false;
        this.k.c.a = false;
        this.f.getClass();
        this.p = null;
        ((com.yandex.go.taxi.order.network.e) this.o.get()).b(preorder2);
    }

    public final void b(Address address, Address address2, String str) {
        hif hifVar = this.h.a;
        ru.yandex.taxi.preorder.source.pickup.a aVar = this.b;
        this.p = new teh(hifVar, !aVar.o.isEmpty(), ((k) this.e).m(), aVar.h, aVar.i, address, address2, str);
    }
}
