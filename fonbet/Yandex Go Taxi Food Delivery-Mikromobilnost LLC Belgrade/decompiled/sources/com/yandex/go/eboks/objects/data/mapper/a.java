package com.yandex.go.eboks.objects.data.mapper;

import com.yandex.go.eboks.objects.data.model.EboksObject;
import com.yandex.go.eboks.objects.data.model.EboksObjectsResponse;
import com.yandex.go.eboks.objects.data.model.EboksObjectsSet;
import com.yandex.go.eboks.objects.data.model.EboksOption;
import com.yandex.go.eboks.objects.data.model.EboksRowanObjectsSet;
import com.yandex.go.eboks.objects.data.model.EboksType;
import com.yandex.go.eboks.objects.experiments.EboksObjectsParamsExperiment;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.VisibleRegion;
import defpackage.ah00;
import defpackage.bin;
import defpackage.din;
import defpackage.g6u;
import defpackage.gw00;
import defpackage.gy40;
import defpackage.lhn;
import defpackage.m2a1;
import defpackage.mhn;
import defpackage.nhn;
import defpackage.ny61;
import defpackage.o400;
import defpackage.ohn;
import defpackage.phn;
import defpackage.pwy0;
import defpackage.qcx;
import defpackage.qhn;
import defpackage.qoh;
import defpackage.rgn;
import defpackage.rhn;
import defpackage.scc;
import defpackage.sf00;
import defpackage.sjh;
import defpackage.tcc;
import defpackage.thn;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uf00;
import defpackage.uhn;
import defpackage.uyj;
import defpackage.vf00;
import defpackage.vhn;
import defpackage.yzh;
import defpackage.zlz;
import defpackage.zzs;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.yandex.taxi.common_models.net.map_object.Trigger;

/* loaded from: classes12.dex */
public final class a {
    public final ah00 a;
    public final tt2 b;
    public final pwy0 c;
    public final c d;
    public final yzh e;
    public final b f;
    public final bin g;
    public final din h;

    public a(ah00 ah00Var, tt2 tt2Var, pwy0 pwy0Var, c cVar, yzh yzhVar, b bVar, bin binVar, din dinVar) {
        this.a = ah00Var;
        this.b = tt2Var;
        this.c = pwy0Var;
        this.d = cVar;
        this.e = yzhVar;
        this.f = bVar;
        this.g = binVar;
        this.h = dinVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x012b, code lost:
    
        if (r3 == r6) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Type inference failed for: r13v0, types: [com.yandex.go.eboks.objects.data.mapper.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.util.Map] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x012b -> B:11:0x012e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, tse tseVar, List list, List list2, ContinuationImpl continuationImpl) {
        EboksObjectsObjectsMapper$mapRegularObjectsCollections$1 eboksObjectsObjectsMapper$mapRegularObjectsCollections$1;
        int i;
        LinkedHashMap linkedHashMap;
        List list3;
        tse tseVar2;
        EboksObjectsObjectsMapper$mapRegularObjectsCollections$1 eboksObjectsObjectsMapper$mapRegularObjectsCollections$12;
        LinkedHashMap linkedHashMap2;
        ArrayList arrayList;
        Iterator it;
        Map map;
        aVar.getClass();
        if (continuationImpl instanceof EboksObjectsObjectsMapper$mapRegularObjectsCollections$1) {
            eboksObjectsObjectsMapper$mapRegularObjectsCollections$1 = (EboksObjectsObjectsMapper$mapRegularObjectsCollections$1) continuationImpl;
            int i2 = eboksObjectsObjectsMapper$mapRegularObjectsCollections$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eboksObjectsObjectsMapper$mapRegularObjectsCollections$1.label = i2 - Integer.MIN_VALUE;
                Object obj = eboksObjectsObjectsMapper$mapRegularObjectsCollections$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = eboksObjectsObjectsMapper$mapRegularObjectsCollections$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : list) {
                        if (((EboksType) obj2).a != null) {
                            arrayList2.add(obj2);
                        }
                    }
                    int d = gw00.d(tcc.n(arrayList2, 10));
                    if (d < 16) {
                        d = 16;
                    }
                    linkedHashMap = new LinkedHashMap(d);
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        String str = ((EboksType) next).a;
                        if (str == null) {
                            str = "";
                        }
                        linkedHashMap.put(str, next);
                    }
                    eboksObjectsObjectsMapper$mapRegularObjectsCollections$1.L$0 = tseVar;
                    eboksObjectsObjectsMapper$mapRegularObjectsCollections$1.L$1 = null;
                    eboksObjectsObjectsMapper$mapRegularObjectsCollections$1.L$2 = list2;
                    eboksObjectsObjectsMapper$mapRegularObjectsCollections$1.L$3 = linkedHashMap;
                    eboksObjectsObjectsMapper$mapRegularObjectsCollections$1.label = 1;
                    Serializable g = aVar.g(tseVar, list, eboksObjectsObjectsMapper$mapRegularObjectsCollections$1);
                    if (g != coroutineSingletons) {
                        obj = g;
                        list3 = list2;
                        tseVar2 = tseVar;
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    ?? r1 = (Map) eboksObjectsObjectsMapper$mapRegularObjectsCollections$1.L$3;
                    list3 = (List) eboksObjectsObjectsMapper$mapRegularObjectsCollections$1.L$2;
                    tse tseVar3 = (tse) eboksObjectsObjectsMapper$mapRegularObjectsCollections$1.L$0;
                    kotlin.b.b(obj);
                    linkedHashMap = r1;
                    tseVar2 = tseVar3;
                } else {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Iterator it3 = (Iterator) eboksObjectsObjectsMapper$mapRegularObjectsCollections$1.L$9;
                    ?? r2 = (Collection) eboksObjectsObjectsMapper$mapRegularObjectsCollections$1.L$7;
                    Map map2 = (Map) eboksObjectsObjectsMapper$mapRegularObjectsCollections$1.L$4;
                    ?? r8 = (Map) eboksObjectsObjectsMapper$mapRegularObjectsCollections$1.L$3;
                    tse tseVar4 = (tse) eboksObjectsObjectsMapper$mapRegularObjectsCollections$1.L$0;
                    kotlin.b.b(obj);
                    it = it3;
                    tseVar2 = tseVar4;
                    arrayList = r2;
                    map = map2;
                    eboksObjectsObjectsMapper$mapRegularObjectsCollections$12 = eboksObjectsObjectsMapper$mapRegularObjectsCollections$1;
                    linkedHashMap2 = r8;
                    rhn rhnVar = (rhn) obj;
                    if (rhnVar != null) {
                        arrayList.add(rhnVar);
                    }
                    if (!it.hasNext()) {
                        return arrayList;
                    }
                    EboksObjectsSet eboksObjectsSet = (EboksObjectsSet) it.next();
                    eboksObjectsObjectsMapper$mapRegularObjectsCollections$12.L$0 = tseVar2;
                    eboksObjectsObjectsMapper$mapRegularObjectsCollections$12.L$1 = null;
                    eboksObjectsObjectsMapper$mapRegularObjectsCollections$12.L$2 = null;
                    eboksObjectsObjectsMapper$mapRegularObjectsCollections$12.L$3 = linkedHashMap2;
                    eboksObjectsObjectsMapper$mapRegularObjectsCollections$12.L$4 = map;
                    eboksObjectsObjectsMapper$mapRegularObjectsCollections$12.L$5 = null;
                    eboksObjectsObjectsMapper$mapRegularObjectsCollections$12.L$6 = null;
                    eboksObjectsObjectsMapper$mapRegularObjectsCollections$12.L$7 = arrayList;
                    eboksObjectsObjectsMapper$mapRegularObjectsCollections$12.L$8 = null;
                    eboksObjectsObjectsMapper$mapRegularObjectsCollections$12.L$9 = it;
                    eboksObjectsObjectsMapper$mapRegularObjectsCollections$12.L$10 = null;
                    eboksObjectsObjectsMapper$mapRegularObjectsCollections$12.L$11 = null;
                    eboksObjectsObjectsMapper$mapRegularObjectsCollections$12.L$12 = null;
                    eboksObjectsObjectsMapper$mapRegularObjectsCollections$12.label = 2;
                    obj = aVar.f(tseVar2, map, eboksObjectsSet, linkedHashMap2, eboksObjectsObjectsMapper$mapRegularObjectsCollections$12);
                }
                eboksObjectsObjectsMapper$mapRegularObjectsCollections$12 = eboksObjectsObjectsMapper$mapRegularObjectsCollections$1;
                linkedHashMap2 = linkedHashMap;
                arrayList = new ArrayList();
                it = list3.iterator();
                map = (Map) obj;
                if (!it.hasNext()) {
                }
            }
        }
        eboksObjectsObjectsMapper$mapRegularObjectsCollections$1 = new EboksObjectsObjectsMapper$mapRegularObjectsCollections$1(aVar, continuationImpl);
        Object obj3 = eboksObjectsObjectsMapper$mapRegularObjectsCollections$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = eboksObjectsObjectsMapper$mapRegularObjectsCollections$1.label;
        if (i != 0) {
        }
        eboksObjectsObjectsMapper$mapRegularObjectsCollections$12 = eboksObjectsObjectsMapper$mapRegularObjectsCollections$1;
        linkedHashMap2 = linkedHashMap;
        arrayList = new ArrayList();
        it = list3.iterator();
        map = (Map) obj3;
        if (!it.hasNext()) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:163:0x05a8, code lost:
    
        if (r0 == r8) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x00e8, code lost:
    
        if (r0 == r8) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0174, code lost:
    
        if (r0 == r8) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x040f, code lost:
    
        if (r0 == r8) goto L201;
     */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(a aVar, tse tseVar, List list, List list2, ContinuationImpl continuationImpl) {
        EboksObjectsObjectsMapper$mapRowanObjectsCollections$1 eboksObjectsObjectsMapper$mapRowanObjectsCollections$1;
        Object obj;
        Object obj2;
        int i;
        tse tseVar2;
        List list3;
        List list4;
        float floatValue;
        VisibleRegion visibleRegion;
        tse tseVar3;
        List<EboksRowanObjectsSet> list5;
        Object obj3;
        Double d;
        List<EboksRowanObjectsSet> list6;
        tse tseVar4;
        qoh h;
        int i2;
        List<zzs> list7;
        qhn qhnVar;
        List list8;
        qhn qhnVar2;
        List list9;
        a aVar2 = aVar;
        bin binVar = aVar2.g;
        if (continuationImpl instanceof EboksObjectsObjectsMapper$mapRowanObjectsCollections$1) {
            eboksObjectsObjectsMapper$mapRowanObjectsCollections$1 = (EboksObjectsObjectsMapper$mapRowanObjectsCollections$1) continuationImpl;
            int i3 = eboksObjectsObjectsMapper$mapRowanObjectsCollections$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                eboksObjectsObjectsMapper$mapRowanObjectsCollections$1.label = i3 - Integer.MIN_VALUE;
                EboksObjectsObjectsMapper$mapRowanObjectsCollections$1 eboksObjectsObjectsMapper$mapRowanObjectsCollections$12 = eboksObjectsObjectsMapper$mapRowanObjectsCollections$1;
                obj = eboksObjectsObjectsMapper$mapRowanObjectsCollections$12.result;
                obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = eboksObjectsObjectsMapper$mapRowanObjectsCollections$12.label;
                char c = 2;
                Double d2 = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    aVar2.b.getClass();
                    sjh sjhVar = uyj.a;
                    g6u g6uVar = o400.a;
                    EboksObjectsObjectsMapper$mapRowanObjectsCollections$2 eboksObjectsObjectsMapper$mapRowanObjectsCollections$2 = new EboksObjectsObjectsMapper$mapRowanObjectsCollections$2(aVar2, null);
                    tseVar2 = tseVar;
                    eboksObjectsObjectsMapper$mapRowanObjectsCollections$12.L$0 = tseVar2;
                    list3 = list;
                    eboksObjectsObjectsMapper$mapRowanObjectsCollections$12.L$1 = list3;
                    list4 = list2;
                    eboksObjectsObjectsMapper$mapRowanObjectsCollections$12.L$2 = list4;
                    eboksObjectsObjectsMapper$mapRowanObjectsCollections$12.label = 1;
                    obj = tje.k0(g6uVar, eboksObjectsObjectsMapper$mapRowanObjectsCollections$2, eboksObjectsObjectsMapper$mapRowanObjectsCollections$12);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                kotlin.b.b(obj);
                                return (List) obj;
                            }
                            if (i == 4) {
                                kotlin.b.b(obj);
                                return (List) obj;
                            }
                            if (i != 5) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            if (eboksObjectsObjectsMapper$mapRowanObjectsCollections$12.L$6 != null) {
                                ny61.u();
                                return null;
                            }
                            kotlin.b.b(obj);
                            return (List) obj;
                        }
                        floatValue = eboksObjectsObjectsMapper$mapRowanObjectsCollections$12.F$0;
                        visibleRegion = (VisibleRegion) eboksObjectsObjectsMapper$mapRowanObjectsCollections$12.L$3;
                        list5 = (List) eboksObjectsObjectsMapper$mapRowanObjectsCollections$12.L$2;
                        tseVar3 = (tse) eboksObjectsObjectsMapper$mapRowanObjectsCollections$12.L$0;
                        kotlin.b.b(obj);
                        Map map = (Map) obj;
                        if (binVar.a().f.isEmpty()) {
                            List<EboksRowanObjectsSet> list10 = list5;
                            ArrayList arrayList = new ArrayList();
                            Iterator it = list10.iterator();
                            while (it.hasNext()) {
                                char c2 = c;
                                List list11 = ((EboksRowanObjectsSet) it.next()).b;
                                Integer num = list11 != null ? new Integer(list11.size()) : null;
                                if (num != null) {
                                    arrayList.add(num);
                                }
                                c = c2;
                            }
                            int z0 = kotlin.collections.a.z0(arrayList);
                            Iterator it2 = binVar.a().f.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    obj3 = null;
                                    break;
                                }
                                obj3 = it2.next();
                                EboksObjectsParamsExperiment.RowanThinningItem rowanThinningItem = (EboksObjectsParamsExperiment.RowanThinningItem) obj3;
                                if (floatValue >= rowanThinningItem.a && floatValue < rowanThinningItem.b) {
                                    break;
                                }
                            }
                            EboksObjectsParamsExperiment.RowanThinningItem rowanThinningItem2 = (EboksObjectsParamsExperiment.RowanThinningItem) obj3;
                            if (rowanThinningItem2 == null) {
                                d = null;
                                list6 = list5;
                            } else {
                                int i4 = rowanThinningItem2.c;
                                if (i4 <= 0 || i4 >= z0) {
                                    d = null;
                                    list6 = list5;
                                } else {
                                    List<Point> g = scc.g(visibleRegion.getTopLeft(), visibleRegion.getTopRight(), visibleRegion.getBottomLeft(), visibleRegion.getBottomRight());
                                    ArrayList arrayList2 = new ArrayList(tcc.n(g, 10));
                                    for (Point point : g) {
                                        Double valueOf = Double.valueOf((point.getLongitude() + 180.0d) / 360.0d);
                                        double sin = Math.sin(Math.toRadians(point.getLatitude()));
                                        arrayList2.add(new Pair(valueOf, Double.valueOf(0.5d - (Math.log((1.0d + sin) / (1.0d - sin)) / 12.566370614359172d))));
                                    }
                                    Iterator it3 = arrayList2.iterator();
                                    if (!it3.hasNext()) {
                                        ny61.p();
                                        return null;
                                    }
                                    double doubleValue = ((Number) ((Pair) it3.next()).c()).doubleValue();
                                    while (it3.hasNext()) {
                                        doubleValue = Math.min(doubleValue, ((Number) ((Pair) it3.next()).c()).doubleValue());
                                        arrayList2 = arrayList2;
                                    }
                                    ArrayList arrayList3 = arrayList2;
                                    Iterator it4 = arrayList3.iterator();
                                    if (!it4.hasNext()) {
                                        ny61.p();
                                        return null;
                                    }
                                    double doubleValue2 = ((Number) ((Pair) it4.next()).c()).doubleValue();
                                    while (it4.hasNext()) {
                                        doubleValue2 = Math.max(doubleValue2, ((Number) ((Pair) it4.next()).c()).doubleValue());
                                        list5 = list5;
                                        d2 = d2;
                                    }
                                    d = d2;
                                    list6 = list5;
                                    Iterator it5 = arrayList3.iterator();
                                    if (!it5.hasNext()) {
                                        ny61.p();
                                        return d;
                                    }
                                    double doubleValue3 = ((Number) ((Pair) it5.next()).f()).doubleValue();
                                    while (it5.hasNext()) {
                                        doubleValue3 = Math.min(doubleValue3, ((Number) ((Pair) it5.next()).f()).doubleValue());
                                        it5 = it5;
                                        doubleValue2 = doubleValue2;
                                    }
                                    double d3 = doubleValue2;
                                    Iterator it6 = arrayList3.iterator();
                                    if (!it6.hasNext()) {
                                        ny61.p();
                                        return d;
                                    }
                                    double doubleValue4 = ((Number) ((Pair) it6.next()).f()).doubleValue();
                                    while (it6.hasNext()) {
                                        doubleValue4 = Math.max(doubleValue4, ((Number) ((Pair) it6.next()).f()).doubleValue());
                                        doubleValue = doubleValue;
                                    }
                                    double d4 = (doubleValue4 - doubleValue3) * (d3 - doubleValue);
                                    if (d4 > 0.0d) {
                                        double sqrt = Math.sqrt(d4 / i4);
                                        double pow = 1.0d / (Math.pow(2.0d, (int) Math.floor(floatValue)) * 256.0d);
                                        double d5 = sqrt / pow;
                                        if (d5 >= 1.0d) {
                                            double rint = Math.rint(d5);
                                            if (rint < 1.0d) {
                                                rint = 1.0d;
                                            }
                                            d2 = Double.valueOf(rint * pow);
                                        }
                                    }
                                }
                                d2 = d;
                            }
                            if (d2 == null) {
                                Double d6 = d;
                                eboksObjectsObjectsMapper$mapRowanObjectsCollections$12.L$0 = d6;
                                eboksObjectsObjectsMapper$mapRowanObjectsCollections$12.L$1 = d6;
                                eboksObjectsObjectsMapper$mapRowanObjectsCollections$12.L$2 = d6;
                                eboksObjectsObjectsMapper$mapRowanObjectsCollections$12.L$3 = d6;
                                eboksObjectsObjectsMapper$mapRowanObjectsCollections$12.L$4 = d6;
                                eboksObjectsObjectsMapper$mapRowanObjectsCollections$12.L$5 = d6;
                                eboksObjectsObjectsMapper$mapRowanObjectsCollections$12.F$0 = floatValue;
                                eboksObjectsObjectsMapper$mapRowanObjectsCollections$12.I$0 = z0;
                                eboksObjectsObjectsMapper$mapRowanObjectsCollections$12.label = 4;
                                ArrayList arrayList4 = new ArrayList();
                                for (EboksRowanObjectsSet eboksRowanObjectsSet : list10) {
                                    String str = eboksRowanObjectsSet.a;
                                    qoh h2 = (str == null || (qhnVar = (qhn) map.get(str)) == null || (list8 = eboksRowanObjectsSet.b) == null) ? null : tje.h(tseVar3, null, null, new EboksObjectsObjectsMapper$mapAllRowanObjects$2$1(aVar, str, list8, qhnVar, null), 3);
                                    if (h2 != null) {
                                        arrayList4.add(h2);
                                    }
                                }
                                obj = kotlinx.coroutines.a.b(arrayList4, eboksObjectsObjectsMapper$mapRowanObjectsCollections$12);
                            } else {
                                double doubleValue5 = d2.doubleValue();
                                gy40 a = zlz.a();
                                for (EboksRowanObjectsSet eboksRowanObjectsSet2 : list6) {
                                    String str2 = eboksRowanObjectsSet2.a;
                                    if (str2 != null && (list7 = eboksRowanObjectsSet2.b) != null) {
                                        for (zzs zzsVar : list7) {
                                            double d7 = zzsVar.b;
                                            double d8 = doubleValue5;
                                            double d9 = zzsVar.a;
                                            double sin2 = Math.sin(Math.toRadians(d9));
                                            long floor = (((long) Math.floor((0.5d - (Math.log((1.0d + sin2) / (1.0d - sin2)) / 12.566370614359172d)) / d8)) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (((long) Math.floor(((d7 + 180.0d) / 360.0d) / d8)) << 32);
                                            long doubleToRawLongBits = (Double.doubleToRawLongBits(d9) * 31) + Double.doubleToRawLongBits(zzsVar.b);
                                            thn thnVar = (thn) a.e(floor);
                                            tse tseVar5 = tseVar3;
                                            Map map2 = map;
                                            if (thnVar == null || doubleToRawLongBits > thnVar.c) {
                                                a.h(floor, new thn(zzsVar, str2, doubleToRawLongBits));
                                            }
                                            map = map2;
                                            tseVar3 = tseVar5;
                                            doubleValue5 = d8;
                                        }
                                    }
                                }
                                tse tseVar6 = tseVar3;
                                Map map3 = map;
                                MapBuilder mapBuilder = new MapBuilder(list6.size());
                                Object[] objArr = a.c;
                                long[] jArr = a.a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i5 = 0;
                                    while (true) {
                                        long j = jArr[i5];
                                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i6 = 8;
                                            int i7 = 8 - ((~(i5 - length)) >>> 31);
                                            int i8 = 0;
                                            while (i8 < i7) {
                                                if ((j & 255) < 128) {
                                                    thn thnVar2 = (thn) objArr[(i5 << 3) + i8];
                                                    String str3 = thnVar2.b;
                                                    Object obj4 = mapBuilder.get(str3);
                                                    if (obj4 == null) {
                                                        i2 = i6;
                                                        ArrayList arrayList5 = new ArrayList();
                                                        mapBuilder.put(str3, arrayList5);
                                                        obj4 = arrayList5;
                                                    } else {
                                                        i2 = i6;
                                                    }
                                                    ((List) obj4).add(thnVar2.a);
                                                } else {
                                                    i2 = i6;
                                                }
                                                j >>= i2;
                                                i8++;
                                                i6 = i2;
                                            }
                                            if (i7 != i6) {
                                                break;
                                            }
                                        }
                                        if (i5 == length) {
                                            break;
                                        }
                                        i5++;
                                    }
                                }
                                MapBuilder j2 = mapBuilder.j();
                                eboksObjectsObjectsMapper$mapRowanObjectsCollections$12.L$0 = null;
                                eboksObjectsObjectsMapper$mapRowanObjectsCollections$12.L$1 = null;
                                eboksObjectsObjectsMapper$mapRowanObjectsCollections$12.L$2 = null;
                                eboksObjectsObjectsMapper$mapRowanObjectsCollections$12.L$3 = null;
                                eboksObjectsObjectsMapper$mapRowanObjectsCollections$12.L$4 = null;
                                eboksObjectsObjectsMapper$mapRowanObjectsCollections$12.L$5 = null;
                                eboksObjectsObjectsMapper$mapRowanObjectsCollections$12.L$6 = null;
                                eboksObjectsObjectsMapper$mapRowanObjectsCollections$12.L$7 = null;
                                eboksObjectsObjectsMapper$mapRowanObjectsCollections$12.F$0 = floatValue;
                                eboksObjectsObjectsMapper$mapRowanObjectsCollections$12.I$0 = z0;
                                eboksObjectsObjectsMapper$mapRowanObjectsCollections$12.label = 5;
                                ArrayList arrayList6 = new ArrayList();
                                Object it7 = ((vf00) j2.entrySet()).iterator();
                                while (((uf00) it7).hasNext()) {
                                    Map.Entry entry = (Map.Entry) ((sf00) it7).next();
                                    String str4 = (String) entry.getKey();
                                    List list12 = (List) entry.getValue();
                                    Map map4 = map3;
                                    qhn qhnVar3 = (qhn) map4.get(str4);
                                    if (qhnVar3 == null) {
                                        tseVar4 = tseVar6;
                                        h = null;
                                    } else {
                                        tseVar4 = tseVar6;
                                        h = tje.h(tseVar4, null, null, new EboksObjectsObjectsMapper$buildRowanCollectionsFromSurvivors$2$1(aVar, str4, list12, qhnVar3, null), 3);
                                    }
                                    if (h != null) {
                                        arrayList6.add(h);
                                    }
                                    map3 = map4;
                                    tseVar6 = tseVar4;
                                }
                                obj = kotlinx.coroutines.a.b(arrayList6, eboksObjectsObjectsMapper$mapRowanObjectsCollections$12);
                            }
                        } else {
                            eboksObjectsObjectsMapper$mapRowanObjectsCollections$12.L$0 = null;
                            eboksObjectsObjectsMapper$mapRowanObjectsCollections$12.L$1 = null;
                            eboksObjectsObjectsMapper$mapRowanObjectsCollections$12.L$2 = null;
                            eboksObjectsObjectsMapper$mapRowanObjectsCollections$12.L$3 = null;
                            eboksObjectsObjectsMapper$mapRowanObjectsCollections$12.L$4 = null;
                            eboksObjectsObjectsMapper$mapRowanObjectsCollections$12.F$0 = floatValue;
                            eboksObjectsObjectsMapper$mapRowanObjectsCollections$12.label = 3;
                            ArrayList arrayList7 = new ArrayList();
                            for (EboksRowanObjectsSet eboksRowanObjectsSet3 : list5) {
                                String str5 = eboksRowanObjectsSet3.a;
                                qoh h3 = (str5 == null || (qhnVar2 = (qhn) map.get(str5)) == null || (list9 = eboksRowanObjectsSet3.b) == null) ? null : tje.h(tseVar3, null, null, new EboksObjectsObjectsMapper$mapAllRowanObjectsWithSimpleThinning$2$1(aVar2, list9, floatValue, str5, qhnVar2, null), 3);
                                if (h3 != null) {
                                    arrayList7.add(h3);
                                }
                                aVar2 = aVar;
                            }
                            obj = kotlinx.coroutines.a.b(arrayList7, eboksObjectsObjectsMapper$mapRowanObjectsCollections$12);
                        }
                        return obj2;
                    }
                    List list13 = (List) eboksObjectsObjectsMapper$mapRowanObjectsCollections$12.L$2;
                    List list14 = (List) eboksObjectsObjectsMapper$mapRowanObjectsCollections$12.L$1;
                    tseVar2 = (tse) eboksObjectsObjectsMapper$mapRowanObjectsCollections$12.L$0;
                    kotlin.b.b(obj);
                    list4 = list13;
                    list3 = list14;
                }
                Pair pair = (Pair) obj;
                floatValue = ((Number) pair.getFirst()).floatValue();
                visibleRegion = (VisibleRegion) pair.getSecond();
                eboksObjectsObjectsMapper$mapRowanObjectsCollections$12.L$0 = tseVar2;
                eboksObjectsObjectsMapper$mapRowanObjectsCollections$12.L$1 = null;
                eboksObjectsObjectsMapper$mapRowanObjectsCollections$12.L$2 = list4;
                eboksObjectsObjectsMapper$mapRowanObjectsCollections$12.L$3 = visibleRegion;
                eboksObjectsObjectsMapper$mapRowanObjectsCollections$12.F$0 = floatValue;
                eboksObjectsObjectsMapper$mapRowanObjectsCollections$12.label = 2;
                obj = aVar2.g(tseVar2, list3, eboksObjectsObjectsMapper$mapRowanObjectsCollections$12);
                if (obj != obj2) {
                    tseVar3 = tseVar2;
                    list5 = list4;
                    Map map5 = (Map) obj;
                    if (binVar.a().f.isEmpty()) {
                    }
                }
                return obj2;
            }
        }
        eboksObjectsObjectsMapper$mapRowanObjectsCollections$1 = new EboksObjectsObjectsMapper$mapRowanObjectsCollections$1(aVar2, continuationImpl);
        EboksObjectsObjectsMapper$mapRowanObjectsCollections$1 eboksObjectsObjectsMapper$mapRowanObjectsCollections$122 = eboksObjectsObjectsMapper$mapRowanObjectsCollections$1;
        obj = eboksObjectsObjectsMapper$mapRowanObjectsCollections$122.result;
        obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = eboksObjectsObjectsMapper$mapRowanObjectsCollections$122.label;
        char c3 = 2;
        Double d22 = null;
        if (i != 0) {
        }
        Pair pair2 = (Pair) obj;
        floatValue = ((Number) pair2.getFirst()).floatValue();
        visibleRegion = (VisibleRegion) pair2.getSecond();
        eboksObjectsObjectsMapper$mapRowanObjectsCollections$122.L$0 = tseVar2;
        eboksObjectsObjectsMapper$mapRowanObjectsCollections$122.L$1 = null;
        eboksObjectsObjectsMapper$mapRowanObjectsCollections$122.L$2 = list4;
        eboksObjectsObjectsMapper$mapRowanObjectsCollections$122.L$3 = visibleRegion;
        eboksObjectsObjectsMapper$mapRowanObjectsCollections$122.F$0 = floatValue;
        eboksObjectsObjectsMapper$mapRowanObjectsCollections$122.label = 2;
        obj = aVar2.g(tseVar2, list3, eboksObjectsObjectsMapper$mapRowanObjectsCollections$122);
        if (obj != obj2) {
        }
        return obj2;
    }

    public static final phn c(a aVar, String str, List list, qhn qhnVar) {
        aVar.getClass();
        List<zzs> list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        for (zzs zzsVar : list2) {
            double d = zzsVar.a;
            double d2 = zzsVar.b;
            StringBuilder sb = new StringBuilder();
            sb.append(d);
            sb.append(d2);
            arrayList.add(new ohn(sb.toString(), qhnVar, str, new Point(zzsVar.a, d2)));
        }
        TreeSet treeSet = new TreeSet(new vhn());
        kotlin.collections.a.F0(arrayList, treeSet);
        return new phn(str, treeSet, aVar.c.getThemeType());
    }

    public final Object d(EboksObjectsResponse eboksObjectsResponse, Continuation continuation) {
        this.b.getClass();
        return tje.k0(uyj.a, new EboksObjectsObjectsMapper$mapToEboksObjectsCollections$2(this, eboksObjectsResponse, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, qhn qhnVar, tse tseVar, EboksObject eboksObject, Map map, ContinuationImpl continuationImpl) {
        EboksObjectsObjectsMapper$mapToMapObject$1 eboksObjectsObjectsMapper$mapToMapObject$1;
        int i;
        List list;
        String str2;
        Point point;
        List list2;
        qhn qhnVar2;
        EboksType eboksType;
        zzs zzsVar;
        String str3;
        String str4;
        String str5 = str;
        EboksObject eboksObject2 = eboksObject;
        if (continuationImpl instanceof EboksObjectsObjectsMapper$mapToMapObject$1) {
            eboksObjectsObjectsMapper$mapToMapObject$1 = (EboksObjectsObjectsMapper$mapToMapObject$1) continuationImpl;
            int i2 = eboksObjectsObjectsMapper$mapToMapObject$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eboksObjectsObjectsMapper$mapToMapObject$1.label = i2 - Integer.MIN_VALUE;
                Object obj = eboksObjectsObjectsMapper$mapToMapObject$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = eboksObjectsObjectsMapper$mapToMapObject$1.label;
                lhn lhnVar = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String str6 = eboksObject2.a;
                    zzs zzsVar2 = eboksObject2.b;
                    if (str6 == null) {
                        m2a1.c("objects_by_type.objects[].id field is null in response");
                        return null;
                    }
                    if (zzsVar2 == null) {
                        m2a1.c("objects_by_type.objects[].geo field is null in response");
                        return null;
                    }
                    EboksType eboksType2 = (EboksType) map.get(str5);
                    if (eboksType2 == null || (list = eboksType2.g) == null) {
                        list = EmptyList.a;
                    }
                    str2 = eboksObject2.a;
                    point = new Point(zzsVar2.a, zzsVar2.b);
                    eboksObjectsObjectsMapper$mapToMapObject$1.L$0 = str5;
                    eboksObjectsObjectsMapper$mapToMapObject$1.L$1 = qhnVar;
                    eboksObjectsObjectsMapper$mapToMapObject$1.L$2 = null;
                    eboksObjectsObjectsMapper$mapToMapObject$1.L$3 = eboksObject2;
                    eboksObjectsObjectsMapper$mapToMapObject$1.L$4 = null;
                    eboksObjectsObjectsMapper$mapToMapObject$1.L$5 = eboksType2;
                    eboksObjectsObjectsMapper$mapToMapObject$1.L$6 = list;
                    eboksObjectsObjectsMapper$mapToMapObject$1.L$7 = str2;
                    eboksObjectsObjectsMapper$mapToMapObject$1.L$8 = point;
                    eboksObjectsObjectsMapper$mapToMapObject$1.label = 1;
                    Object a = this.f.a(tseVar, eboksType2, eboksObject2, eboksObjectsObjectsMapper$mapToMapObject$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    list2 = list;
                    qhnVar2 = qhnVar;
                    eboksType = eboksType2;
                    obj = a;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Point point2 = (Point) eboksObjectsObjectsMapper$mapToMapObject$1.L$8;
                    String str7 = (String) eboksObjectsObjectsMapper$mapToMapObject$1.L$7;
                    list2 = (List) eboksObjectsObjectsMapper$mapToMapObject$1.L$6;
                    eboksType = (EboksType) eboksObjectsObjectsMapper$mapToMapObject$1.L$5;
                    EboksObject eboksObject3 = (EboksObject) eboksObjectsObjectsMapper$mapToMapObject$1.L$3;
                    qhnVar2 = (qhn) eboksObjectsObjectsMapper$mapToMapObject$1.L$1;
                    String str8 = (String) eboksObjectsObjectsMapper$mapToMapObject$1.L$0;
                    kotlin.b.b(obj);
                    point = point2;
                    str2 = str7;
                    str5 = str8;
                    eboksObject2 = eboksObject3;
                }
                qhn qhnVar3 = (qhn) obj;
                yzh yzhVar = this.e;
                yzhVar.getClass();
                zzsVar = eboksObject2.b;
                if (zzsVar != null) {
                    kotlinx.serialization.json.c cVar = eboksObject2.d;
                    if (cVar == null) {
                        m2a1.c("Payload in eboks object is null");
                    } else {
                        MapBuilder mapBuilder = new MapBuilder(cVar.a.size() + 3);
                        mapBuilder.putAll(cVar);
                        if (eboksType != null && (str4 = eboksType.c) != null) {
                        }
                        if (eboksType != null && (str3 = eboksType.d) != null) {
                            mapBuilder.put("provider", qcx.c(str3));
                        }
                        kotlinx.serialization.json.c cVar2 = new kotlinx.serialization.json.c(mapBuilder.j());
                        List<EboksOption> list3 = list2;
                        int i3 = 10;
                        int d = gw00.d(tcc.n(list3, 10));
                        if (d < 16) {
                            d = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
                        for (EboksOption eboksOption : list3) {
                            Trigger trigger = eboksOption.a;
                            List<String> list4 = eboksOption.b;
                            ArrayList arrayList = new ArrayList(tcc.n(list4, i3));
                            for (String str9 : list4) {
                                rgn rgnVar = (rgn) yzhVar.a;
                                yzh yzhVar2 = yzhVar;
                                String str10 = eboksObject2.a;
                                if (str10 == null) {
                                    str10 = "";
                                }
                                arrayList.add(rgnVar.a(str9, str10, zzsVar, cVar2));
                                yzhVar = yzhVar2;
                            }
                            yzh yzhVar3 = yzhVar;
                            Pair pair = new Pair(trigger, arrayList);
                            linkedHashMap.put(pair.c(), pair.f());
                            yzhVar = yzhVar3;
                            i3 = 10;
                        }
                        lhnVar = new lhn(linkedHashMap);
                    }
                }
                return new mhn(str2, qhnVar2, str5, point, qhnVar3, lhnVar);
            }
        }
        eboksObjectsObjectsMapper$mapToMapObject$1 = new EboksObjectsObjectsMapper$mapToMapObject$1(this, continuationImpl);
        Object obj2 = eboksObjectsObjectsMapper$mapToMapObject$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = eboksObjectsObjectsMapper$mapToMapObject$1.label;
        lhn lhnVar2 = null;
        if (i != 0) {
        }
        qhn qhnVar32 = (qhn) obj2;
        yzh yzhVar4 = this.e;
        yzhVar4.getClass();
        zzsVar = eboksObject2.b;
        if (zzsVar != null) {
        }
        return new mhn(str2, qhnVar2, str5, point, qhnVar32, lhnVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r15v0, types: [com.yandex.go.eboks.objects.data.mapper.a] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00dc -> B:10:0x00e0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(tse tseVar, Map map, EboksObjectsSet eboksObjectsSet, Map map2, ContinuationImpl continuationImpl) {
        EboksObjectsObjectsMapper$mapToRegularObjects$1 eboksObjectsObjectsMapper$mapToRegularObjects$1;
        int i;
        qhn qhnVar;
        EboksObjectsSet eboksObjectsSet2;
        Iterator it;
        String str;
        ArrayList arrayList;
        Map map3;
        EboksObjectsObjectsMapper$mapToRegularObjects$1 eboksObjectsObjectsMapper$mapToRegularObjects$12;
        tse tseVar2;
        if (continuationImpl instanceof EboksObjectsObjectsMapper$mapToRegularObjects$1) {
            eboksObjectsObjectsMapper$mapToRegularObjects$1 = (EboksObjectsObjectsMapper$mapToRegularObjects$1) continuationImpl;
            int i2 = eboksObjectsObjectsMapper$mapToRegularObjects$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eboksObjectsObjectsMapper$mapToRegularObjects$1.label = i2 - Integer.MIN_VALUE;
                Object obj = eboksObjectsObjectsMapper$mapToRegularObjects$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = eboksObjectsObjectsMapper$mapToRegularObjects$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String str2 = eboksObjectsSet.a;
                    List list = eboksObjectsSet.b;
                    if (str2 == null) {
                        m2a1.c("Eboks type in objects_by_type list is null");
                        return null;
                    }
                    if (list == null) {
                        m2a1.c("objects_by_type.objects field is null in response");
                        return null;
                    }
                    qhnVar = (qhn) map.get(str2);
                    if (qhnVar == null) {
                        m2a1.c("Found unknown eboks type in objects_by_type list");
                        return null;
                    }
                    String str3 = eboksObjectsSet.a;
                    ArrayList arrayList2 = new ArrayList();
                    eboksObjectsSet2 = eboksObjectsSet;
                    it = list.iterator();
                    str = str3;
                    arrayList = arrayList2;
                    map3 = map2;
                    eboksObjectsObjectsMapper$mapToRegularObjects$12 = eboksObjectsObjectsMapper$mapToRegularObjects$1;
                    tseVar2 = tseVar;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str4 = (String) eboksObjectsObjectsMapper$mapToRegularObjects$1.L$13;
                    Iterator it2 = (Iterator) eboksObjectsObjectsMapper$mapToRegularObjects$1.L$9;
                    ?? r5 = (Collection) eboksObjectsObjectsMapper$mapToRegularObjects$1.L$7;
                    qhn qhnVar2 = (qhn) eboksObjectsObjectsMapper$mapToRegularObjects$1.L$4;
                    Map map4 = (Map) eboksObjectsObjectsMapper$mapToRegularObjects$1.L$3;
                    EboksObjectsSet eboksObjectsSet3 = (EboksObjectsSet) eboksObjectsObjectsMapper$mapToRegularObjects$1.L$2;
                    tse tseVar3 = (tse) eboksObjectsObjectsMapper$mapToRegularObjects$1.L$0;
                    kotlin.b.b(obj);
                    arrayList = r5;
                    map3 = map4;
                    eboksObjectsSet2 = eboksObjectsSet3;
                    str = str4;
                    EboksObjectsObjectsMapper$mapToRegularObjects$1 eboksObjectsObjectsMapper$mapToRegularObjects$13 = eboksObjectsObjectsMapper$mapToRegularObjects$1;
                    tseVar2 = tseVar3;
                    it = it2;
                    mhn mhnVar = (mhn) obj;
                    if (mhnVar != null) {
                        arrayList.add(mhnVar);
                    }
                    qhnVar = qhnVar2;
                    eboksObjectsObjectsMapper$mapToRegularObjects$12 = eboksObjectsObjectsMapper$mapToRegularObjects$13;
                    if (it.hasNext()) {
                        EboksObject eboksObject = (EboksObject) it.next();
                        String str5 = eboksObjectsSet2.a;
                        eboksObjectsObjectsMapper$mapToRegularObjects$12.L$0 = tseVar2;
                        eboksObjectsObjectsMapper$mapToRegularObjects$12.L$1 = null;
                        eboksObjectsObjectsMapper$mapToRegularObjects$12.L$2 = eboksObjectsSet2;
                        eboksObjectsObjectsMapper$mapToRegularObjects$12.L$3 = map3;
                        eboksObjectsObjectsMapper$mapToRegularObjects$12.L$4 = qhnVar;
                        eboksObjectsObjectsMapper$mapToRegularObjects$12.L$5 = null;
                        eboksObjectsObjectsMapper$mapToRegularObjects$12.L$6 = null;
                        eboksObjectsObjectsMapper$mapToRegularObjects$12.L$7 = arrayList;
                        eboksObjectsObjectsMapper$mapToRegularObjects$12.L$8 = null;
                        eboksObjectsObjectsMapper$mapToRegularObjects$12.L$9 = it;
                        eboksObjectsObjectsMapper$mapToRegularObjects$12.L$10 = null;
                        eboksObjectsObjectsMapper$mapToRegularObjects$12.L$11 = null;
                        eboksObjectsObjectsMapper$mapToRegularObjects$12.L$12 = null;
                        eboksObjectsObjectsMapper$mapToRegularObjects$12.L$13 = str;
                        eboksObjectsObjectsMapper$mapToRegularObjects$12.label = 1;
                        Object e = e(str5, qhnVar, tseVar2, eboksObject, map3, eboksObjectsObjectsMapper$mapToRegularObjects$12);
                        if (e == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        qhn qhnVar3 = qhnVar;
                        obj = e;
                        eboksObjectsObjectsMapper$mapToRegularObjects$13 = eboksObjectsObjectsMapper$mapToRegularObjects$12;
                        qhnVar2 = qhnVar3;
                        mhn mhnVar2 = (mhn) obj;
                        if (mhnVar2 != null) {
                        }
                        qhnVar = qhnVar2;
                        eboksObjectsObjectsMapper$mapToRegularObjects$12 = eboksObjectsObjectsMapper$mapToRegularObjects$13;
                        if (it.hasNext()) {
                            TreeSet treeSet = new TreeSet(new uhn());
                            kotlin.collections.a.F0(arrayList, treeSet);
                            return new nhn(str, treeSet, this.c.getThemeType());
                        }
                    }
                }
            }
        }
        eboksObjectsObjectsMapper$mapToRegularObjects$1 = new EboksObjectsObjectsMapper$mapToRegularObjects$1(this, continuationImpl);
        Object obj2 = eboksObjectsObjectsMapper$mapToRegularObjects$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = eboksObjectsObjectsMapper$mapToRegularObjects$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x008f -> B:10:0x0093). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable g(tse tseVar, List list, ContinuationImpl continuationImpl) {
        EboksObjectsObjectsMapper$prepareMapStylesMap$1 eboksObjectsObjectsMapper$prepareMapStylesMap$1;
        int i;
        ArrayList<qhn> arrayList;
        tse tseVar2;
        Iterator it;
        List list2;
        if (continuationImpl instanceof EboksObjectsObjectsMapper$prepareMapStylesMap$1) {
            eboksObjectsObjectsMapper$prepareMapStylesMap$1 = (EboksObjectsObjectsMapper$prepareMapStylesMap$1) continuationImpl;
            int i2 = eboksObjectsObjectsMapper$prepareMapStylesMap$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eboksObjectsObjectsMapper$prepareMapStylesMap$1.label = i2 - Integer.MIN_VALUE;
                Object obj = eboksObjectsObjectsMapper$prepareMapStylesMap$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = eboksObjectsObjectsMapper$prepareMapStylesMap$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    arrayList = new ArrayList();
                    Iterator it2 = list.iterator();
                    tseVar2 = tseVar;
                    it = it2;
                    list2 = list;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it = (Iterator) eboksObjectsObjectsMapper$prepareMapStylesMap$1.L$6;
                    ?? r10 = (Collection) eboksObjectsObjectsMapper$prepareMapStylesMap$1.L$4;
                    List list3 = (List) eboksObjectsObjectsMapper$prepareMapStylesMap$1.L$1;
                    tse tseVar3 = (tse) eboksObjectsObjectsMapper$prepareMapStylesMap$1.L$0;
                    kotlin.b.b(obj);
                    ArrayList arrayList2 = r10;
                    tseVar2 = tseVar3;
                    qhn qhnVar = (qhn) obj;
                    if (qhnVar != null) {
                        arrayList2.add(qhnVar);
                    }
                    list2 = list3;
                    arrayList = arrayList2;
                    if (it.hasNext()) {
                        EboksType eboksType = (EboksType) it.next();
                        eboksObjectsObjectsMapper$prepareMapStylesMap$1.L$0 = tseVar2;
                        eboksObjectsObjectsMapper$prepareMapStylesMap$1.L$1 = list2;
                        eboksObjectsObjectsMapper$prepareMapStylesMap$1.L$2 = null;
                        eboksObjectsObjectsMapper$prepareMapStylesMap$1.L$3 = null;
                        eboksObjectsObjectsMapper$prepareMapStylesMap$1.L$4 = arrayList;
                        eboksObjectsObjectsMapper$prepareMapStylesMap$1.L$5 = null;
                        eboksObjectsObjectsMapper$prepareMapStylesMap$1.L$6 = it;
                        eboksObjectsObjectsMapper$prepareMapStylesMap$1.L$7 = null;
                        eboksObjectsObjectsMapper$prepareMapStylesMap$1.L$8 = null;
                        eboksObjectsObjectsMapper$prepareMapStylesMap$1.L$9 = null;
                        eboksObjectsObjectsMapper$prepareMapStylesMap$1.label = 1;
                        Object a = this.d.a(tseVar2, eboksType, eboksObjectsObjectsMapper$prepareMapStylesMap$1);
                        if (a == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        ArrayList arrayList3 = arrayList;
                        list3 = list2;
                        obj = a;
                        arrayList2 = arrayList3;
                        qhn qhnVar2 = (qhn) obj;
                        if (qhnVar2 != null) {
                        }
                        list2 = list3;
                        arrayList = arrayList2;
                        if (it.hasNext()) {
                            HashMap hashMap = new HashMap(list2.size());
                            for (qhn qhnVar3 : arrayList) {
                                hashMap.put(qhnVar3.a, qhnVar3);
                            }
                            return hashMap;
                        }
                    }
                }
            }
        }
        eboksObjectsObjectsMapper$prepareMapStylesMap$1 = new EboksObjectsObjectsMapper$prepareMapStylesMap$1(this, continuationImpl);
        Object obj2 = eboksObjectsObjectsMapper$prepareMapStylesMap$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = eboksObjectsObjectsMapper$prepareMapStylesMap$1.label;
        if (i != 0) {
        }
    }
}
