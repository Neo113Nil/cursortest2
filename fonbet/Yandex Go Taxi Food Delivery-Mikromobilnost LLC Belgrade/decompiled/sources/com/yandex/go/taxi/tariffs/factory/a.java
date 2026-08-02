package com.yandex.go.taxi.tariffs.factory;

import com.yandex.go.address.models.Address;
import com.yandex.go.preorder.source.altpins.Alternatives;
import com.yandex.go.preorder.source.altpins.Alternatives$RoutePartItemDto$MultimodalTaxiTransportRoutePart;
import com.yandex.go.taxi.tariffs.interactor.SetTariffInfoInteractorImpl$updateCurrentTariffsFromZone$$inlined$setTariffInfoInternal$default$1;
import com.yandex.go.taxi.tariffs.repository.g;
import com.yandex.go.zone.dto.objects.DriveExtra;
import com.yandex.go.zone.dto.objects.ScootersExtra;
import com.yandex.go.zone.dto.objects.ServiceLevel;
import com.yandex.go.zone.dto.objects.TariffUnavailable;
import com.yandex.go.zone.dto.objects.ZoneTariffInfo;
import com.yandex.go.zone.dto.response.Selector;
import com.yandex.go.zone.model.Zone;
import com.yandex.go.zone.model.ZoneMulticlass;
import defpackage.av1;
import defpackage.awd;
import defpackage.ay1;
import defpackage.cwd;
import defpackage.dai0;
import defpackage.en40;
import defpackage.evu0;
import defpackage.fid0;
import defpackage.gbl0;
import defpackage.ghm;
import defpackage.gl2;
import defpackage.gq40;
import defpackage.gx1;
import defpackage.i2d0;
import defpackage.is60;
import defpackage.j63;
import defpackage.jc4;
import defpackage.jl40;
import defpackage.jn40;
import defpackage.jst;
import defpackage.k7s;
import defpackage.l7s;
import defpackage.m7s;
import defpackage.njc;
import defpackage.nu1;
import defpackage.pex0;
import defpackage.pho;
import defpackage.pjx0;
import defpackage.pnt0;
import defpackage.pnx0;
import defpackage.q7s;
import defpackage.q8f;
import defpackage.qex0;
import defpackage.qn11;
import defpackage.rcc;
import defpackage.s5p0;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tjx0;
import defpackage.tr40;
import defpackage.tt2;
import defpackage.umd0;
import defpackage.uyj;
import defpackage.v2h;
import defpackage.val0;
import defpackage.w511;
import defpackage.xax0;
import defpackage.xu1;
import defpackage.xx00;
import defpackage.yal0;
import defpackage.yax0;
import defpackage.ycc;
import defpackage.yx1;
import defpackage.zu1;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.yaplus.b;

/* loaded from: classes8.dex */
public final class a {
    public final tjx0 a;
    public final yax0 b;
    public final qex0 c;
    public final gq40 d;
    public final b e;
    public final tt2 f;
    public final q7s g;
    public final yx1 h;

    public a(tjx0 tjx0Var, yax0 yax0Var, qex0 qex0Var, gq40 gq40Var, b bVar, tt2 tt2Var, q7s q7sVar, yx1 yx1Var) {
        this.a = tjx0Var;
        this.b = yax0Var;
        this.c = qex0Var;
        this.d = gq40Var;
        this.e = bVar;
        this.f = tt2Var;
        this.g = q7sVar;
        this.h = yx1Var;
    }

    public final Object a(Zone zone, String str, List list, SetTariffInfoInteractorImpl$updateCurrentTariffsFromZone$$inlined$setTariffInfoInternal$default$1 setTariffInfoInteractorImpl$updateCurrentTariffsFromZone$$inlined$setTariffInfoInternal$default$1) {
        this.f.getClass();
        return tje.k0(uyj.a, new CompoundTariffInfoFactoryImpl$createFromZone$2(this, zone, str, list, null), setTariffInfoInteractorImpl$updateCurrentTariffsFromZone$$inlined$setTariffInfoInternal$default$1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03d2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0585  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x058f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0137 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:488:0x0855  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x088c  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x08ad  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x088f  */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final cwd b(Zone zone, yal0 yal0Var, Address address, Address address2, String str) {
        int i;
        HashMap hashMap;
        boolean z;
        ArrayList arrayList;
        LinkedHashSet linkedHashSet;
        boolean z2;
        boolean z3;
        boolean booleanValue;
        Alternatives.RouteStatsMulticlassDetails routeStatsMulticlassDetails;
        String str2;
        String str3;
        ?? arrayList2;
        ZoneTariffInfo zoneTariffInfo;
        awd awdVar;
        int i2;
        LinkedHashMap linkedHashMap;
        pjx0 pjx0Var;
        pnt0 pnt0Var;
        Iterator it;
        ZoneTariffInfo zoneTariffInfo2;
        ArrayList arrayList3;
        ServiceLevel serviceLevel;
        Alternatives alternatives;
        Iterator it2;
        ServiceLevel serviceLevel2;
        Alternatives alternatives2;
        tr40 tr40Var;
        String a;
        ArrayList arrayList4;
        String b;
        Iterator it3;
        Iterator it4;
        Object obj;
        Object fid0Var;
        Iterator it5;
        Iterator it6;
        nu1 a2;
        Iterator it7;
        Iterator it8;
        av1 b2;
        ?? r3;
        Zone zone2 = zone;
        yal0 yal0Var2 = yal0Var;
        List list = zone2.k;
        List list2 = yal0Var2.b;
        Alternatives alternatives3 = yal0Var2.e;
        pnt0 pnt0Var2 = new pnt0(list.size());
        Iterator it9 = list.iterator();
        while (true) {
            i = 0;
            if (!it9.hasNext()) {
                break;
            }
            ZoneTariffInfo zoneTariffInfo3 = (ZoneTariffInfo) it9.next();
            Integer num = (Integer) kotlin.collections.a.S(0, zoneTariffInfo3.h);
            pnt0Var2.d(num != null ? num.intValue() : -1, zoneTariffInfo3);
        }
        ArrayList arrayList5 = new ArrayList(list2.size());
        HashMap hashMap2 = new HashMap();
        awd awdVar2 = new awd(i, hashMap2);
        ArrayList arrayList6 = new ArrayList();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Iterator it10 = list2.iterator();
        while (true) {
            boolean hasNext = it10.hasNext();
            EmptyList emptyList = EmptyList.a;
            if (!hasNext) {
                Zone zone3 = zone2;
                awd awdVar3 = awdVar2;
                ArrayList arrayList7 = arrayList6;
                Alternatives alternatives4 = alternatives3;
                LinkedHashMap linkedHashMap3 = linkedHashMap2;
                String obj2 = address.toString();
                String valueOf = String.valueOf(address2);
                String str4 = yal0Var2.s;
                q7s q7sVar = this.g;
                int i3 = 10;
                if (((Boolean) q7sVar.b.b.b()).booleanValue() && !linkedHashMap3.isEmpty()) {
                    Set entrySet = linkedHashMap3.entrySet();
                    ArrayList arrayList8 = new ArrayList();
                    Iterator it11 = entrySet.iterator();
                    while (it11.hasNext()) {
                        Map.Entry entry = (Map.Entry) it11.next();
                        String str5 = (String) entry.getKey();
                        Set set = (Set) entry.getValue();
                        Iterator it12 = it11;
                        ArrayList arrayList9 = new ArrayList(tcc.n(set, i3));
                        Iterator it13 = set.iterator();
                        while (it13.hasNext()) {
                            m7s m7sVar = (m7s) it13.next();
                            Iterator it14 = it13;
                            String a3 = m7sVar.a();
                            HashMap hashMap3 = hashMap2;
                            if (m7sVar instanceof k7s) {
                                str3 = "insufficientParametersSupplied";
                            } else {
                                if (!(m7sVar instanceof l7s)) {
                                    w511.b();
                                    return null;
                                }
                                str3 = "priceFormatNotFound";
                            }
                            arrayList9.add(new val0(str5, a3, str3));
                            it13 = it14;
                            hashMap2 = hashMap3;
                        }
                        ycc.r(arrayList9, arrayList8);
                        it11 = it12;
                        i3 = 10;
                    }
                    hashMap = hashMap2;
                    jc4 jc4Var = q7sVar.a;
                    jc4Var.getClass();
                    HashMap hashMap4 = new HashMap();
                    hashMap4.put(Constants.KEY_MESSAGE, "Prices formatting failed with errors");
                    if (obj2 != null) {
                        hashMap4.put("startingAddress", obj2);
                    }
                    hashMap4.put("destinationAddress", valueOf);
                    if (str4 != null) {
                        hashMap4.put("traceId", str4);
                    }
                    ArrayList arrayList10 = new ArrayList(tcc.n(arrayList8, 10));
                    Iterator it15 = arrayList8.iterator();
                    while (it15.hasNext()) {
                        arrayList10.add(((val0) it15.next()).a());
                    }
                    hashMap4.put("errors", arrayList10);
                    HashMap hashMap5 = new HashMap();
                    pho phoVar = jc4Var.a;
                    z = true;
                    phoVar.a("RouteStatisticsPriceFormatting", hashMap4, 1, hashMap5);
                } else {
                    hashMap = hashMap2;
                    z = true;
                }
                gq40 gq40Var = this.d;
                g gVar = gq40Var.d;
                if (arrayList5.isEmpty() || alternatives4 == null) {
                    arrayList = gq40Var.b(arrayList5, zone3, yal0Var2);
                } else {
                    if (yal0Var2.t) {
                        qn11 qn11Var = gbl0.c;
                        qn11 b3 = zone3.b(gbl0.class);
                        if (b3 != null) {
                            qn11Var = b3;
                        }
                        if (((gbl0) qn11Var).b) {
                            arrayList = gq40Var.b(arrayList5, zone3, yal0Var2);
                        }
                    }
                    Alternatives.MulticlassOptionDto a4 = alternatives4.a();
                    if (a4 == null) {
                        jst.e.getClass();
                        arrayList = arrayList5;
                    } else {
                        List list3 = a4.b;
                        ArrayList arrayList11 = new ArrayList(tcc.n(list3, 10));
                        Iterator it16 = list3.iterator();
                        while (it16.hasNext()) {
                            arrayList11.add(((ServiceLevel) it16.next()).f);
                        }
                        ArrayList arrayList12 = new ArrayList();
                        Iterator it17 = arrayList5.iterator();
                        while (it17.hasNext()) {
                            Object next = it17.next();
                            if (arrayList11.contains(((pex0) next).b)) {
                                arrayList12.add(next);
                            }
                        }
                        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                        Iterator it18 = arrayList12.iterator();
                        while (it18.hasNext()) {
                            linkedHashSet2.add(((pex0) it18.next()).b);
                        }
                        Set b4 = gVar.b();
                        ArrayList arrayList13 = new ArrayList();
                        for (Object obj3 : b4) {
                            if (linkedHashSet2.contains((String) obj3)) {
                                arrayList13.add(obj3);
                            }
                        }
                        Set N0 = kotlin.collections.a.N0(arrayList13);
                        ZoneMulticlass zoneMulticlass = zone3.x;
                        if (zoneMulticlass == null || !zoneMulticlass.b) {
                            linkedHashSet = linkedHashSet2;
                            z2 = false;
                        } else {
                            linkedHashSet = linkedHashSet2;
                            z2 = z;
                        }
                        Alternatives.MulticlassRequirementSupportedDto multiclassRequirementSupportedDto = a4.h;
                        Boolean bool = multiclassRequirementSupportedDto != null ? multiclassRequirementSupportedDto.a : null;
                        if (bool != null) {
                            booleanValue = bool.booleanValue();
                        } else {
                            Boolean bool2 = zoneMulticlass != null ? zoneMulticlass.g : null;
                            if (bool2 != null) {
                                booleanValue = bool2.booleanValue();
                            } else {
                                z3 = false;
                                String str6 = a4.i;
                                routeStatsMulticlassDetails = a4.d;
                                if (routeStatsMulticlassDetails == null) {
                                    routeStatsMulticlassDetails = new Alternatives.RouteStatsMulticlassDetails(0);
                                }
                                en40 en40Var = new en40(routeStatsMulticlassDetails.a, routeStatsMulticlassDetails.b, routeStatsMulticlassDetails.e, dai0.k(routeStatsMulticlassDetails.f, a4.j, gVar.b()), routeStatsMulticlassDetails.d, null, routeStatsMulticlassDetails.c);
                                Selector selector = a4.g;
                                TariffUnavailable tariffUnavailable = a4.f;
                                ?? r9 = a4.k;
                                jn40 jn40Var = new jn40(str6, en40Var, selector, tariffUnavailable, linkedHashSet, N0, r9 != 0 ? emptyList : r9, a4.j, z3, a4.e, false);
                                String str7 = yal0Var2.h;
                                int i4 = yal0Var2.i;
                                str2 = a4.c;
                                if (str2 == null) {
                                    str2 = "";
                                }
                                yal0 yal0Var3 = yal0Var2;
                                pex0 a5 = gq40Var.a(yal0Var3, arrayList12, jn40Var, str7, i4, z2, (is60) awdVar3.invoke(str2));
                                yal0Var2 = yal0Var3;
                                int c = gq40.c(zone3, yal0Var2, arrayList5.size());
                                ArrayList arrayList14 = new ArrayList(arrayList5);
                                arrayList14.add(c, a5);
                                arrayList = kotlin.collections.a.J0(arrayList14);
                            }
                        }
                        z3 = booleanValue;
                        String str62 = a4.i;
                        routeStatsMulticlassDetails = a4.d;
                        if (routeStatsMulticlassDetails == null) {
                        }
                        en40 en40Var2 = new en40(routeStatsMulticlassDetails.a, routeStatsMulticlassDetails.b, routeStatsMulticlassDetails.e, dai0.k(routeStatsMulticlassDetails.f, a4.j, gVar.b()), routeStatsMulticlassDetails.d, null, routeStatsMulticlassDetails.c);
                        Selector selector2 = a4.g;
                        TariffUnavailable tariffUnavailable2 = a4.f;
                        ?? r92 = a4.k;
                        jn40 jn40Var2 = new jn40(str62, en40Var2, selector2, tariffUnavailable2, linkedHashSet, N0, r92 != 0 ? emptyList : r92, a4.j, z3, a4.e, false);
                        String str72 = yal0Var2.h;
                        int i42 = yal0Var2.i;
                        str2 = a4.c;
                        if (str2 == null) {
                        }
                        yal0 yal0Var32 = yal0Var2;
                        pex0 a52 = gq40Var.a(yal0Var32, arrayList12, jn40Var2, str72, i42, z2, (is60) awdVar3.invoke(str2));
                        yal0Var2 = yal0Var32;
                        int c2 = gq40.c(zone3, yal0Var2, arrayList5.size());
                        ArrayList arrayList142 = new ArrayList(arrayList5);
                        arrayList142.add(c2, a52);
                        arrayList = kotlin.collections.a.J0(arrayList142);
                    }
                }
                return new cwd(zone3, yal0Var2, arrayList, arrayList7, new j63(hashMap.values()), jl40.l(yal0Var2.j.a, Boolean.TRUE));
            }
            ServiceLevel serviceLevel3 = (ServiceLevel) it10.next();
            String str8 = serviceLevel3.S;
            ScootersExtra scootersExtra = serviceLevel3.M;
            if (str8 == null) {
                str8 = "";
            }
            is60 is60Var = (is60) awdVar2.invoke(str8);
            int i5 = serviceLevel3.l;
            ZoneTariffInfo zoneTariffInfo4 = (ZoneTariffInfo) pnt0Var2.b(i5);
            boolean z4 = serviceLevel3.A;
            if (zoneTariffInfo4 != null) {
                boolean z5 = zoneTariffInfo4.s;
            }
            if (!z4 && (zoneTariffInfo4 == null || !zoneTariffInfo4.a(str))) {
                if (jl40.l(serviceLevel3.f, "scooters")) {
                    if ((scootersExtra != null ? scootersExtra.getA() : null) == null || scootersExtra.getB() == null) {
                        zone2 = zone;
                    }
                }
                this.a.getClass();
                ArrayList arrayList15 = new ArrayList();
                DriveExtra driveExtra = serviceLevel3.L;
                if (driveExtra == null) {
                    arrayList2 = emptyList;
                } else {
                    List<DriveExtra.Offer> b5 = driveExtra.getB();
                    arrayList2 = new ArrayList();
                    for (DriveExtra.Offer offer : b5) {
                        ScootersExtra scootersExtra2 = scootersExtra;
                        String a6 = offer.getA();
                        if (a6 == null) {
                            zoneTariffInfo = zoneTariffInfo4;
                        } else {
                            zoneTariffInfo = zoneTariffInfo4;
                            DriveExtra.LayersExtra c3 = offer.getC();
                            if (c3 != null) {
                                awdVar = awdVar2;
                                ServiceLevel d = offer.getD();
                                if (d != null) {
                                    i2 = i5;
                                    String b6 = offer.getB();
                                    if (b6 != null) {
                                        linkedHashMap = linkedHashMap2;
                                        pnt0Var = pnt0Var2;
                                        pjx0Var = new pjx0(d, b6, new ghm(a6, c3, 4));
                                        if (pjx0Var == null) {
                                            arrayList2.add(pjx0Var);
                                        }
                                        linkedHashMap2 = linkedHashMap;
                                        scootersExtra = scootersExtra2;
                                        zoneTariffInfo4 = zoneTariffInfo;
                                        awdVar2 = awdVar;
                                        i5 = i2;
                                        pnt0Var2 = pnt0Var;
                                    }
                                    linkedHashMap = linkedHashMap2;
                                    pnt0Var = pnt0Var2;
                                    pjx0Var = null;
                                    if (pjx0Var == null) {
                                    }
                                    linkedHashMap2 = linkedHashMap;
                                    scootersExtra = scootersExtra2;
                                    zoneTariffInfo4 = zoneTariffInfo;
                                    awdVar2 = awdVar;
                                    i5 = i2;
                                    pnt0Var2 = pnt0Var;
                                }
                                i2 = i5;
                                linkedHashMap = linkedHashMap2;
                                pnt0Var = pnt0Var2;
                                pjx0Var = null;
                                if (pjx0Var == null) {
                                }
                                linkedHashMap2 = linkedHashMap;
                                scootersExtra = scootersExtra2;
                                zoneTariffInfo4 = zoneTariffInfo;
                                awdVar2 = awdVar;
                                i5 = i2;
                                pnt0Var2 = pnt0Var;
                            }
                        }
                        awdVar = awdVar2;
                        i2 = i5;
                        linkedHashMap = linkedHashMap2;
                        pnt0Var = pnt0Var2;
                        pjx0Var = null;
                        if (pjx0Var == null) {
                        }
                        linkedHashMap2 = linkedHashMap;
                        scootersExtra = scootersExtra2;
                        zoneTariffInfo4 = zoneTariffInfo;
                        awdVar2 = awdVar;
                        i5 = i2;
                        pnt0Var2 = pnt0Var;
                    }
                }
                ScootersExtra scootersExtra3 = scootersExtra;
                ZoneTariffInfo zoneTariffInfo5 = zoneTariffInfo4;
                awd awdVar4 = awdVar2;
                int i6 = i5;
                LinkedHashMap linkedHashMap4 = linkedHashMap2;
                pnt0 pnt0Var3 = pnt0Var2;
                arrayList15.addAll((Collection) arrayList2);
                arrayList15.addAll(scootersExtra3 == null ? emptyList : Collections.singletonList(new pjx0(serviceLevel3, "scooters", new s5p0(scootersExtra3.getD(), 2))));
                arrayList6.addAll(arrayList15);
                ServiceLevel serviceLevel4 = serviceLevel3;
                gx1 gx1Var = new gx1(zone, yal0Var, address, address2, zoneTariffInfo5, awdVar4, i6);
                ZoneTariffInfo zoneTariffInfo6 = zoneTariffInfo5;
                yax0 yax0Var = this.b;
                yax0Var.getClass();
                if (alternatives3 != null && (r3 = alternatives3.a) != 0) {
                    emptyList = r3;
                }
                ListBuilder a7 = rcc.a();
                Iterator it19 = emptyList.iterator();
                while (it19.hasNext()) {
                    com.yandex.go.preorder.source.altpins.b bVar = (com.yandex.go.preorder.source.altpins.b) it19.next();
                    if (bVar instanceof Alternatives.AltpinBOptionDto) {
                        Alternatives.AltpinBOptionDto altpinBOptionDto = (Alternatives.AltpinBOptionDto) bVar;
                        for (ServiceLevel serviceLevel5 : altpinBOptionDto.b) {
                            Iterator it20 = it19;
                            String str9 = serviceLevel5.S;
                            ZoneTariffInfo zoneTariffInfo7 = zoneTariffInfo6;
                            if (str9 != null && serviceLevel5.l == i6 && (b2 = yax0Var.b(gx1Var, altpinBOptionDto, serviceLevel5, str9)) != null) {
                                a7.add(b2);
                            }
                            it19 = it20;
                            zoneTariffInfo6 = zoneTariffInfo7;
                        }
                        it = it19;
                        zoneTariffInfo2 = zoneTariffInfo6;
                    } else {
                        it = it19;
                        zoneTariffInfo2 = zoneTariffInfo6;
                        if (bVar instanceof Alternatives.AltpinAOptionDto) {
                            Alternatives.AltpinAOptionDto altpinAOptionDto = (Alternatives.AltpinAOptionDto) bVar;
                            Iterator it21 = altpinAOptionDto.b.iterator();
                            while (it21.hasNext()) {
                                ServiceLevel serviceLevel6 = (ServiceLevel) it21.next();
                                String str10 = serviceLevel6.S;
                                if (str10 == null || serviceLevel6.l != i6) {
                                    it8 = it21;
                                } else {
                                    it8 = it21;
                                    Address d2 = yax0Var.d(gx1Var.d, altpinAOptionDto.c);
                                    zu1 zu1Var = d2 == null ? null : new zu1(yax0Var.e(gx1Var, serviceLevel6, str10, yax0Var.c(altpinAOptionDto, serviceLevel6)), d2);
                                    if (zu1Var != null) {
                                        a7.add(zu1Var);
                                    }
                                }
                                it21 = it8;
                            }
                        } else if (bVar instanceof Alternatives.PlusPromoOptionDto) {
                            Alternatives.PlusPromoOptionDto plusPromoOptionDto = (Alternatives.PlusPromoOptionDto) bVar;
                            Iterator it22 = plusPromoOptionDto.b.iterator();
                            while (it22.hasNext()) {
                                ServiceLevel serviceLevel7 = (ServiceLevel) it22.next();
                                String str11 = serviceLevel7.S;
                                if (str11 == null || serviceLevel7.l != i6) {
                                    it7 = it22;
                                } else {
                                    it7 = it22;
                                    a7.add(new fid0(yax0Var.e(gx1Var, serviceLevel7, str11, yax0Var.c(plusPromoOptionDto, serviceLevel7))));
                                }
                                it22 = it7;
                            }
                        } else if (bVar instanceof Alternatives.RequirementOptionDto) {
                            Alternatives.RequirementOptionDto requirementOptionDto = (Alternatives.RequirementOptionDto) bVar;
                            for (ServiceLevel serviceLevel8 : requirementOptionDto.b) {
                                String str12 = serviceLevel8.S;
                                if (str12 != null && serviceLevel8.l == i6 && (a2 = yax0Var.a(gx1Var, requirementOptionDto, serviceLevel8, str12)) != null) {
                                    a7.add(a2);
                                }
                            }
                        } else if (bVar instanceof Alternatives.TariffSelectorOptionDto) {
                            Alternatives.TariffSelectorOptionDto tariffSelectorOptionDto = (Alternatives.TariffSelectorOptionDto) bVar;
                            Iterator it23 = tariffSelectorOptionDto.b.iterator();
                            while (it23.hasNext()) {
                                ServiceLevel serviceLevel9 = (ServiceLevel) it23.next();
                                String str13 = serviceLevel9.S;
                                if (str13 == null || serviceLevel9.l != i6) {
                                    it6 = it23;
                                } else {
                                    it6 = it23;
                                    if (jl40.l(tariffSelectorOptionDto.a, "explicit_antisurge")) {
                                        a7.add(new gl2(yax0Var.e(gx1Var, serviceLevel9, str13, yax0Var.c(tariffSelectorOptionDto, serviceLevel9))));
                                    } else {
                                        a7.add(new pnx0(yax0Var.e(gx1Var, serviceLevel9, str13, yax0Var.c(tariffSelectorOptionDto, serviceLevel9))));
                                    }
                                }
                                it23 = it6;
                            }
                        } else if (bVar instanceof Alternatives.ComboOptionDto) {
                            Alternatives.ComboOptionDto comboOptionDto = (Alternatives.ComboOptionDto) bVar;
                            Iterator it24 = comboOptionDto.b.iterator();
                            while (it24.hasNext()) {
                                ServiceLevel serviceLevel10 = (ServiceLevel) it24.next();
                                String str14 = serviceLevel10.S;
                                if (str14 == null || serviceLevel10.l != i6) {
                                    it5 = it24;
                                } else {
                                    it5 = it24;
                                    a7.add(new njc(yax0Var.e(gx1Var, serviceLevel10, str14, yax0Var.c(comboOptionDto, serviceLevel10))));
                                }
                                it24 = it5;
                            }
                        } else if (!(bVar instanceof Alternatives.MulticlassOptionDto)) {
                            if (bVar instanceof Alternatives.CommonOptionLegacyDto) {
                                Alternatives.CommonOptionLegacyDto commonOptionLegacyDto = (Alternatives.CommonOptionLegacyDto) bVar;
                                Iterator it25 = commonOptionLegacyDto.b.iterator();
                                while (it25.hasNext()) {
                                    ServiceLevel serviceLevel11 = (ServiceLevel) it25.next();
                                    String str15 = serviceLevel11.S;
                                    if (str15 != null && serviceLevel11.l == i6) {
                                        switch (xax0.a[commonOptionLegacyDto.a.ordinal()]) {
                                            case 1:
                                            case 2:
                                            case 3:
                                                it4 = it25;
                                                obj = null;
                                                if (obj != null) {
                                                    a7.add(obj);
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            case 4:
                                                it4 = it25;
                                                obj = yax0Var.b(gx1Var, com.yandex.go.preorder.source.altpins.a.a(commonOptionLegacyDto), serviceLevel11, str15);
                                                if (obj != null) {
                                                }
                                                break;
                                            case 5:
                                                it4 = it25;
                                                fid0Var = new fid0(yax0Var.e(gx1Var, serviceLevel11, str15, yax0Var.c(com.yandex.go.preorder.source.altpins.a.d(commonOptionLegacyDto), serviceLevel11)));
                                                obj = fid0Var;
                                                if (obj != null) {
                                                }
                                                break;
                                            case 6:
                                                it4 = it25;
                                                obj = yax0Var.a(gx1Var, com.yandex.go.preorder.source.altpins.a.e(commonOptionLegacyDto), serviceLevel11, str15);
                                                if (obj != null) {
                                                }
                                                break;
                                            case 7:
                                                it4 = it25;
                                                fid0Var = new gl2(yax0Var.e(gx1Var, serviceLevel11, str15, yax0Var.c(com.yandex.go.preorder.source.altpins.a.f(commonOptionLegacyDto), serviceLevel11)));
                                                obj = fid0Var;
                                                if (obj != null) {
                                                }
                                                break;
                                            case 8:
                                                it4 = it25;
                                                fid0Var = new pnx0(yax0Var.e(gx1Var, serviceLevel11, str15, yax0Var.c(com.yandex.go.preorder.source.altpins.a.f(commonOptionLegacyDto), serviceLevel11)));
                                                obj = fid0Var;
                                                if (obj != null) {
                                                }
                                                break;
                                            case 9:
                                            case 10:
                                                it4 = it25;
                                                obj = new njc(yax0Var.e(gx1Var, serviceLevel11, str15, yax0Var.c(com.yandex.go.preorder.source.altpins.a.b(commonOptionLegacyDto), serviceLevel11)));
                                                if (obj != null) {
                                                }
                                                break;
                                            default:
                                                w511.b();
                                                break;
                                        }
                                        return null;
                                    }
                                    it4 = it25;
                                    it25 = it4;
                                }
                            } else if (bVar instanceof Alternatives.CreateYandexCardOptionDto) {
                                Alternatives.CreateYandexCardOptionDto createYandexCardOptionDto = (Alternatives.CreateYandexCardOptionDto) bVar;
                                Iterator it26 = createYandexCardOptionDto.b.iterator();
                                while (it26.hasNext()) {
                                    ServiceLevel serviceLevel12 = (ServiceLevel) it26.next();
                                    String str16 = serviceLevel12.S;
                                    if (str16 == null || serviceLevel12.l != i6) {
                                        it3 = it26;
                                    } else {
                                        it3 = it26;
                                        a7.add(new q8f(yax0Var.e(gx1Var, serviceLevel12, str16, yax0Var.c(createYandexCardOptionDto, serviceLevel12))));
                                    }
                                    it26 = it3;
                                }
                            } else if (bVar instanceof Alternatives.AltPaymentMethodOptionDto) {
                                Alternatives.AltPaymentMethodOptionDto altPaymentMethodOptionDto = (Alternatives.AltPaymentMethodOptionDto) bVar;
                                Alternatives.AlternativePaymentMethod alternativePaymentMethod = altPaymentMethodOptionDto.c;
                                Iterator it27 = altPaymentMethodOptionDto.b.iterator();
                                while (it27.hasNext()) {
                                    ServiceLevel serviceLevel13 = (ServiceLevel) it27.next();
                                    String str17 = serviceLevel13.S;
                                    Iterator it28 = it27;
                                    if (str17 == null || serviceLevel13.l != i6) {
                                        arrayList4 = arrayList6;
                                    } else {
                                        String a8 = alternativePaymentMethod.getA();
                                        arrayList4 = arrayList6;
                                        if (jl40.l(a8, PaymentMethod$Type.CASH.getCode()) || jl40.l(a8, PaymentMethod$Type.GOOGLE_PAY.getCode()) || ((b = alternativePaymentMethod.getB()) != null && !evu0.J(b))) {
                                            pex0 e = yax0Var.e(gx1Var, serviceLevel13, str17, yax0Var.c(altPaymentMethodOptionDto, serviceLevel13));
                                            String str18 = altPaymentMethodOptionDto.d;
                                            if (str18 == null) {
                                                str18 = "";
                                            }
                                            a7.add(new xu1(e, alternativePaymentMethod, str18));
                                        }
                                    }
                                    it27 = it28;
                                    arrayList6 = arrayList4;
                                }
                            } else {
                                arrayList3 = arrayList6;
                                if (bVar instanceof Alternatives.DeeplinkOptionDto) {
                                    Alternatives.DeeplinkOptionDto deeplinkOptionDto = (Alternatives.DeeplinkOptionDto) bVar;
                                    for (ServiceLevel serviceLevel14 : deeplinkOptionDto.b) {
                                        String str19 = serviceLevel14.S;
                                        if (str19 != null && serviceLevel14.l == i6) {
                                            a7.add(new v2h(yax0Var.e(gx1Var, serviceLevel14, str19, yax0Var.c(deeplinkOptionDto, serviceLevel14))));
                                        }
                                    }
                                } else if (bVar instanceof Alternatives.MarketplaceOptionDto) {
                                    Alternatives.MarketplaceOptionDto marketplaceOptionDto = (Alternatives.MarketplaceOptionDto) bVar;
                                    for (ServiceLevel serviceLevel15 : marketplaceOptionDto.c) {
                                        String str20 = serviceLevel15.S;
                                        if (str20 != null && serviceLevel15.l == i6) {
                                            a7.add(new xx00(yax0Var.e(gx1Var, serviceLevel15, str20, yax0Var.c(marketplaceOptionDto, serviceLevel15))));
                                        }
                                    }
                                } else if (bVar instanceof Alternatives.MultimodalOptionDto) {
                                    Alternatives.MultimodalOptionDto multimodalOptionDto = (Alternatives.MultimodalOptionDto) bVar;
                                    Iterator it29 = multimodalOptionDto.b.iterator();
                                    while (it29.hasNext()) {
                                        ServiceLevel serviceLevel16 = (ServiceLevel) it29.next();
                                        String str21 = serviceLevel16.S;
                                        if (str21 == null || serviceLevel16.l != i6) {
                                            it2 = it29;
                                            serviceLevel2 = serviceLevel4;
                                            alternatives2 = alternatives3;
                                        } else {
                                            ay1 c4 = yax0Var.c(multimodalOptionDto, serviceLevel16);
                                            List list4 = multimodalOptionDto.d;
                                            it2 = it29;
                                            Alternatives.MultimodalPointsDto multimodalPointsDto = multimodalOptionDto.h;
                                            if (list4 != null) {
                                                ArrayList arrayList16 = new ArrayList();
                                                for (Object obj4 : list4) {
                                                    ServiceLevel serviceLevel17 = serviceLevel4;
                                                    Alternatives alternatives5 = alternatives3;
                                                    if (obj4 instanceof Alternatives$RoutePartItemDto$MultimodalTaxiTransportRoutePart) {
                                                        arrayList16.add(obj4);
                                                    }
                                                    serviceLevel4 = serviceLevel17;
                                                    alternatives3 = alternatives5;
                                                }
                                                serviceLevel2 = serviceLevel4;
                                                alternatives2 = alternatives3;
                                                Alternatives$RoutePartItemDto$MultimodalTaxiTransportRoutePart alternatives$RoutePartItemDto$MultimodalTaxiTransportRoutePart = (Alternatives$RoutePartItemDto$MultimodalTaxiTransportRoutePart) kotlin.collections.a.R(arrayList16);
                                                if (alternatives$RoutePartItemDto$MultimodalTaxiTransportRoutePart != null && (a = alternatives$RoutePartItemDto$MultimodalTaxiTransportRoutePart.getA()) != null) {
                                                    tr40Var = new tr40(yax0Var.e(gx1Var, serviceLevel16, str21, c4), a, multimodalOptionDto.c, multimodalOptionDto.g, multimodalOptionDto.d, multimodalPointsDto != null ? multimodalPointsDto.getA() : null, multimodalPointsDto != null ? multimodalPointsDto.getB() : null);
                                                    if (tr40Var == null) {
                                                        a7.add(tr40Var);
                                                    }
                                                }
                                            } else {
                                                serviceLevel2 = serviceLevel4;
                                                alternatives2 = alternatives3;
                                            }
                                            tr40Var = null;
                                            if (tr40Var == null) {
                                            }
                                        }
                                        it29 = it2;
                                        serviceLevel4 = serviceLevel2;
                                        alternatives3 = alternatives2;
                                    }
                                } else {
                                    serviceLevel = serviceLevel4;
                                    alternatives = alternatives3;
                                    if (bVar instanceof Alternatives.PlusSubscriptionOptionDto) {
                                        Alternatives.PlusSubscriptionOptionDto plusSubscriptionOptionDto = (Alternatives.PlusSubscriptionOptionDto) bVar;
                                        for (ServiceLevel serviceLevel18 : plusSubscriptionOptionDto.c) {
                                            String str22 = serviceLevel18.S;
                                            if (str22 != null && serviceLevel18.l == i6) {
                                                a7.add(new umd0(yax0Var.e(gx1Var, serviceLevel18, str22, yax0Var.c(plusSubscriptionOptionDto, serviceLevel18))));
                                            }
                                        }
                                    } else {
                                        if (!(bVar instanceof Alternatives.PlusDummySubscriptionOptionDto)) {
                                            w511.b();
                                            return null;
                                        }
                                        Alternatives.PlusDummySubscriptionOptionDto plusDummySubscriptionOptionDto = (Alternatives.PlusDummySubscriptionOptionDto) bVar;
                                        for (ServiceLevel serviceLevel19 : plusDummySubscriptionOptionDto.c) {
                                            String str23 = serviceLevel19.S;
                                            if (str23 != null && serviceLevel19.l == i6) {
                                                a7.add(new i2d0(yax0Var.e(gx1Var, serviceLevel19, str23, yax0Var.c(plusDummySubscriptionOptionDto, serviceLevel19))));
                                            }
                                        }
                                    }
                                    it19 = it;
                                    zoneTariffInfo6 = zoneTariffInfo2;
                                    arrayList6 = arrayList3;
                                    serviceLevel4 = serviceLevel;
                                    alternatives3 = alternatives;
                                }
                                serviceLevel = serviceLevel4;
                                alternatives = alternatives3;
                                it19 = it;
                                zoneTariffInfo6 = zoneTariffInfo2;
                                arrayList6 = arrayList3;
                                serviceLevel4 = serviceLevel;
                                alternatives3 = alternatives;
                            }
                        }
                    }
                    arrayList3 = arrayList6;
                    serviceLevel = serviceLevel4;
                    alternatives = alternatives3;
                    it19 = it;
                    zoneTariffInfo6 = zoneTariffInfo2;
                    arrayList6 = arrayList3;
                    serviceLevel4 = serviceLevel;
                    alternatives3 = alternatives;
                }
                ArrayList arrayList17 = arrayList6;
                Alternatives alternatives6 = alternatives3;
                ru.yandex.taxi.tariffs.model.a aVar = new ru.yandex.taxi.tariffs.model.a(a7.j());
                LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                yal0Var2 = yal0Var;
                pex0 a9 = qex0.a(this.c, zone, yal0Var2, serviceLevel4, zoneTariffInfo6, is60Var, null, aVar, linkedHashSet3, 32);
                arrayList5.add(a9);
                if (!linkedHashSet3.isEmpty()) {
                    linkedHashMap4.put(a9.b, linkedHashSet3);
                }
                zone2 = zone;
                linkedHashMap2 = linkedHashMap4;
                awdVar2 = awdVar4;
                arrayList6 = arrayList17;
                pnt0Var2 = pnt0Var3;
                alternatives3 = alternatives6;
            }
        }
    }
}
