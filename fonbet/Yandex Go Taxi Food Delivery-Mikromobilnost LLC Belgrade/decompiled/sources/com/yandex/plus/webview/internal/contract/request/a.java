package com.yandex.plus.webview.internal.contract.request;

import android.net.Uri;
import defpackage.bvf0;
import defpackage.ike;
import defpackage.in41;
import defpackage.kn41;
import defpackage.ny61;
import defpackage.qv10;
import defpackage.swh;
import defpackage.tcc;
import defpackage.tg21;
import defpackage.unr0;
import defpackage.uvu;
import defpackage.ycc;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class a {
    public final swh a;
    public final tg21 b;

    public a(swh swhVar, tg21 tg21Var) {
        this.a = swhVar;
        this.b = tg21Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b2 A[LOOP:0: B:18:0x00ac->B:20:0x00b2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0137 A[LOOP:3: B:50:0x0131->B:52:0x0137, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0231  */
    /* JADX WARN: Type inference failed for: r13v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r17v0, types: [com.yandex.plus.webview.internal.contract.request.a] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, Map map, ContinuationImpl continuationImpl) {
        HttpRequestFromContractParamsCreator$create$1 httpRequestFromContractParamsCreator$create$1;
        int i;
        String str2;
        ArrayList arrayList;
        Object obj;
        Map map2;
        LinkedHashSet linkedHashSet;
        Iterator it;
        Iterator it2;
        Iterator it3;
        Iterator it4;
        Iterator it5;
        Map map3;
        Object obj2;
        ?? singletonList;
        if (continuationImpl instanceof HttpRequestFromContractParamsCreator$create$1) {
            httpRequestFromContractParamsCreator$create$1 = (HttpRequestFromContractParamsCreator$create$1) continuationImpl;
            int i2 = httpRequestFromContractParamsCreator$create$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                httpRequestFromContractParamsCreator$create$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = httpRequestFromContractParamsCreator$create$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = httpRequestFromContractParamsCreator$create$1.label;
                if (i != 0) {
                    b.b(obj3);
                    ArrayList arrayList2 = this.a.a;
                    str2 = str;
                    httpRequestFromContractParamsCreator$create$1.L$0 = str2;
                    httpRequestFromContractParamsCreator$create$1.L$1 = map;
                    httpRequestFromContractParamsCreator$create$1.L$2 = arrayList2;
                    httpRequestFromContractParamsCreator$create$1.label = 1;
                    Serializable b = b(arrayList2, httpRequestFromContractParamsCreator$create$1);
                    if (b != coroutineSingletons) {
                        arrayList = arrayList2;
                        obj = b;
                        map2 = map;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    map3 = (Map) httpRequestFromContractParamsCreator$create$1.L$12;
                    b.b(obj3);
                    return new uvu((String) obj3, map3);
                }
                ?? r4 = (List) httpRequestFromContractParamsCreator$create$1.L$2;
                map2 = (Map) httpRequestFromContractParamsCreator$create$1.L$1;
                String str3 = (String) httpRequestFromContractParamsCreator$create$1.L$0;
                b.b(obj3);
                obj = obj3;
                str2 = str3;
                arrayList = r4;
                List list = (List) obj;
                linkedHashSet = new LinkedHashSet();
                it = arrayList.iterator();
                while (it.hasNext()) {
                    ((in41) it.next()).getClass();
                }
                if (linkedHashSet.isEmpty()) {
                    linkedHashSet = null;
                }
                Collection singletonList2 = linkedHashSet == null ? Collections.singletonList(new kn41(kotlin.collections.a.N0(linkedHashSet))) : EmptyList.a;
                Set<String> queryParameterNames = Uri.parse(str2).getQueryParameterNames();
                List list2 = list;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : list2) {
                    if (obj4 instanceof kn41) {
                        arrayList3.add(obj4);
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    ((kn41) next).getClass();
                    if (!queryParameterNames.contains("available_features")) {
                        arrayList4.add(next);
                    }
                }
                ArrayList m0 = kotlin.collections.a.m0(arrayList4, singletonList2);
                ArrayList arrayList5 = new ArrayList();
                it3 = list2.iterator();
                while (it3.hasNext()) {
                    it3.next();
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                it4 = m0.iterator();
                while (it4.hasNext()) {
                    Object next2 = it4.next();
                    ((kn41) next2).getClass();
                    Object obj5 = linkedHashMap.get("available_features");
                    if (obj5 == null) {
                        obj5 = qv10.w("available_features", linkedHashMap);
                    }
                    ((List) obj5).add(next2);
                }
                ArrayList arrayList6 = new ArrayList(linkedHashMap.size());
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    String str4 = (String) entry.getKey();
                    List list3 = (List) entry.getValue();
                    Iterator it6 = list3.iterator();
                    if (it6.hasNext()) {
                        obj2 = it6.next();
                        ((kn41) obj2).getClass();
                    } else {
                        obj2 = null;
                    }
                    kn41 kn41Var = (kn41) obj2;
                    if (kn41Var != null) {
                        list3 = Collections.singletonList(kn41Var);
                    }
                    ArrayList arrayList7 = new ArrayList();
                    Iterator it7 = list3.iterator();
                    while (it7.hasNext()) {
                        Set set = ((kn41) it7.next()).a;
                        Set set2 = set instanceof Collection ? set : null;
                        if (set2 != null) {
                            Set set3 = set2;
                            singletonList = new ArrayList(tcc.n(set3, 10));
                            Iterator it8 = set3.iterator();
                            while (it8.hasNext()) {
                                singletonList.add(String.valueOf(it8.next()));
                            }
                        } else {
                            singletonList = Collections.singletonList(set.toString());
                        }
                        ycc.r((Iterable) singletonList, arrayList7);
                    }
                    arrayList6.add(new Pair(str4, kotlin.collections.a.N0(arrayList7)));
                }
                Map s = kotlin.collections.b.s(arrayList6);
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(arrayList5.size() + (map2 == null ? map2.size() : 0));
                it5 = arrayList5.iterator();
                if (!it5.hasNext()) {
                    throw unr0.i(it5);
                }
                if (map2 != null) {
                    for (Map.Entry entry2 : map2.entrySet()) {
                        if (!linkedHashMap2.containsKey(entry2.getKey())) {
                            linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                        }
                    }
                }
                httpRequestFromContractParamsCreator$create$1.L$0 = null;
                httpRequestFromContractParamsCreator$create$1.L$1 = null;
                httpRequestFromContractParamsCreator$create$1.L$2 = null;
                httpRequestFromContractParamsCreator$create$1.L$3 = null;
                httpRequestFromContractParamsCreator$create$1.L$4 = null;
                httpRequestFromContractParamsCreator$create$1.L$5 = null;
                httpRequestFromContractParamsCreator$create$1.L$6 = null;
                httpRequestFromContractParamsCreator$create$1.L$7 = null;
                httpRequestFromContractParamsCreator$create$1.L$8 = null;
                httpRequestFromContractParamsCreator$create$1.L$9 = null;
                httpRequestFromContractParamsCreator$create$1.L$10 = null;
                httpRequestFromContractParamsCreator$create$1.L$11 = null;
                httpRequestFromContractParamsCreator$create$1.L$12 = linkedHashMap2;
                httpRequestFromContractParamsCreator$create$1.label = 2;
                obj3 = this.b.a(str2, s, httpRequestFromContractParamsCreator$create$1);
                if (obj3 != coroutineSingletons) {
                    map3 = linkedHashMap2;
                    return new uvu((String) obj3, map3);
                }
                return coroutineSingletons;
            }
        }
        httpRequestFromContractParamsCreator$create$1 = new HttpRequestFromContractParamsCreator$create$1(this, continuationImpl);
        Object obj32 = httpRequestFromContractParamsCreator$create$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = httpRequestFromContractParamsCreator$create$1.label;
        if (i != 0) {
        }
        List list4 = (List) obj;
        linkedHashSet = new LinkedHashSet();
        it = arrayList.iterator();
        while (it.hasNext()) {
        }
        if (linkedHashSet.isEmpty()) {
        }
        if (linkedHashSet == null) {
        }
        Set<String> queryParameterNames2 = Uri.parse(str2).getQueryParameterNames();
        List list22 = list4;
        ArrayList arrayList32 = new ArrayList();
        while (r11.hasNext()) {
        }
        ArrayList arrayList42 = new ArrayList();
        it2 = arrayList32.iterator();
        while (it2.hasNext()) {
        }
        ArrayList m02 = kotlin.collections.a.m0(arrayList42, singletonList2);
        ArrayList arrayList52 = new ArrayList();
        it3 = list22.iterator();
        while (it3.hasNext()) {
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        it4 = m02.iterator();
        while (it4.hasNext()) {
        }
        ArrayList arrayList62 = new ArrayList(linkedHashMap3.size());
        while (r4.hasNext()) {
        }
        Map s2 = kotlin.collections.b.s(arrayList62);
        LinkedHashMap linkedHashMap22 = new LinkedHashMap(arrayList52.size() + (map2 == null ? map2.size() : 0));
        it5 = arrayList52.iterator();
        if (!it5.hasNext()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(ArrayList arrayList, ContinuationImpl continuationImpl) {
        HttpRequestFromContractParamsCreator$getStaticParams$1 httpRequestFromContractParamsCreator$getStaticParams$1;
        int i;
        if (continuationImpl instanceof HttpRequestFromContractParamsCreator$getStaticParams$1) {
            httpRequestFromContractParamsCreator$getStaticParams$1 = (HttpRequestFromContractParamsCreator$getStaticParams$1) continuationImpl;
            int i2 = httpRequestFromContractParamsCreator$getStaticParams$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                httpRequestFromContractParamsCreator$getStaticParams$1.label = i2 - Integer.MIN_VALUE;
                Object obj = httpRequestFromContractParamsCreator$getStaticParams$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = httpRequestFromContractParamsCreator$getStaticParams$1.label;
                if (i != 0) {
                    b.b(obj);
                    ike a = bvf0.a(httpRequestFromContractParamsCreator$getStaticParams$1.get_context());
                    HttpRequestFromContractParamsCreator$getStaticParams$2 httpRequestFromContractParamsCreator$getStaticParams$2 = new HttpRequestFromContractParamsCreator$getStaticParams$2(3, null);
                    httpRequestFromContractParamsCreator$getStaticParams$1.L$0 = null;
                    httpRequestFromContractParamsCreator$getStaticParams$1.L$1 = null;
                    httpRequestFromContractParamsCreator$getStaticParams$1.label = 1;
                    obj = com.yandex.plus.home.common.utils.a.d(arrayList, a, httpRequestFromContractParamsCreator$getStaticParams$2, httpRequestFromContractParamsCreator$getStaticParams$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                return tcc.o((Iterable) obj);
            }
        }
        httpRequestFromContractParamsCreator$getStaticParams$1 = new HttpRequestFromContractParamsCreator$getStaticParams$1(this, continuationImpl);
        Object obj2 = httpRequestFromContractParamsCreator$getStaticParams$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = httpRequestFromContractParamsCreator$getStaticParams$1.label;
        if (i != 0) {
        }
        return tcc.o((Iterable) obj2);
    }
}
