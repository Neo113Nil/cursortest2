package com.apollographql.apollo3.network.http;

import com.yandex.div.state.db.StateEntry;
import defpackage.cvw;
import defpackage.fc70;
import defpackage.gw00;
import defpackage.i70;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qq6;
import defpackage.rq6;
import defpackage.uo2;
import defpackage.vkf;
import defpackage.vo2;
import defpackage.vpr;
import defpackage.woh;
import defpackage.xoh;
import defpackage.ycc;
import defpackage.ym11;
import defpackage.zj00;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes10.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ fc70 b;
    public final /* synthetic */ com.apollographql.apollo3.api.c c;
    public final /* synthetic */ Ref$ObjectRef w;

    public b(vpr vprVar, fc70 fc70Var, com.apollographql.apollo3.api.c cVar, Ref$ObjectRef ref$ObjectRef) {
        this.a = vprVar;
        this.b = fc70Var;
        this.c = cVar;
        this.w = ref$ObjectRef;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r7v4, types: [T, xoh] */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        HttpNetworkTransport$multipleResponses$$inlined$mapNotNull$1$2$1 httpNetworkTransport$multipleResponses$$inlined$mapNotNull$1$2$1;
        int i;
        HttpNetworkTransport$multipleResponses$$inlined$mapNotNull$1$2$1 httpNetworkTransport$multipleResponses$$inlined$mapNotNull$1$2$12;
        CoroutineSingletons coroutineSingletons;
        int i2;
        HttpNetworkTransport$multipleResponses$$inlined$mapNotNull$1$2$1 httpNetworkTransport$multipleResponses$$inlined$mapNotNull$1$2$13;
        b bVar;
        vo2 a;
        if (continuation instanceof HttpNetworkTransport$multipleResponses$$inlined$mapNotNull$1$2$1) {
            httpNetworkTransport$multipleResponses$$inlined$mapNotNull$1$2$1 = (HttpNetworkTransport$multipleResponses$$inlined$mapNotNull$1$2$1) continuation;
            int i3 = httpNetworkTransport$multipleResponses$$inlined$mapNotNull$1$2$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                httpNetworkTransport$multipleResponses$$inlined$mapNotNull$1$2$1.label = i3 - Integer.MIN_VALUE;
                Object obj2 = httpNetworkTransport$multipleResponses$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = httpNetworkTransport$multipleResponses$$inlined$mapNotNull$1$2$1.label;
                int i4 = 1;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    qq6 qq6Var = (qq6) obj;
                    Ref$ObjectRef ref$ObjectRef = this.w;
                    if (ref$ObjectRef.element == 0) {
                        ref$ObjectRef.element = new xoh();
                    }
                    xoh xohVar = (xoh) ref$ObjectRef.element;
                    Map map = (Map) ooc.y(new rq6(qq6Var));
                    LinkedHashMap linkedHashMap = xohVar.a;
                    LinkedHashMap linkedHashMap2 = xohVar.b;
                    if (linkedHashMap2.isEmpty()) {
                        linkedHashMap.putAll(map);
                        httpNetworkTransport$multipleResponses$$inlined$mapNotNull$1$2$12 = httpNetworkTransport$multipleResponses$$inlined$mapNotNull$1$2$1;
                        coroutineSingletons = coroutineSingletons2;
                        i2 = 1;
                    } else {
                        Object obj3 = map.get("incremental");
                        List list = obj3 instanceof List ? (List) obj3 : null;
                        if (list == null) {
                            xohVar.f = true;
                            httpNetworkTransport$multipleResponses$$inlined$mapNotNull$1$2$12 = httpNetworkTransport$multipleResponses$$inlined$mapNotNull$1$2$1;
                            coroutineSingletons = coroutineSingletons2;
                            i2 = 1;
                        } else {
                            xohVar.f = false;
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                Map map2 = (Map) it.next();
                                int i5 = i4;
                                Iterator it2 = it;
                                Map map3 = (Map) map2.get(Constants.KEY_DATA);
                                CoroutineSingletons coroutineSingletons3 = coroutineSingletons2;
                                List list2 = (List) map2.get(StateEntry.COLUMN_PATH);
                                Object obj4 = (Map) linkedHashMap2.get(Constants.KEY_DATA);
                                if (map3 != null) {
                                    for (Object obj5 : list2) {
                                        HttpNetworkTransport$multipleResponses$$inlined$mapNotNull$1$2$1 httpNetworkTransport$multipleResponses$$inlined$mapNotNull$1$2$14 = httpNetworkTransport$multipleResponses$$inlined$mapNotNull$1$2$1;
                                        obj4 = obj4 instanceof List ? ((List) obj4).get(((Integer) obj5).intValue()) : ((Map) obj4).get(obj5);
                                        httpNetworkTransport$multipleResponses$$inlined$mapNotNull$1$2$1 = httpNetworkTransport$multipleResponses$$inlined$mapNotNull$1$2$14;
                                    }
                                    httpNetworkTransport$multipleResponses$$inlined$mapNotNull$1$2$13 = httpNetworkTransport$multipleResponses$$inlined$mapNotNull$1$2$1;
                                    xoh.a(ym11.c(obj4), map3);
                                    xohVar.c.add(new woh(list2, (String) map2.get("label")));
                                } else {
                                    httpNetworkTransport$multipleResponses$$inlined$mapNotNull$1$2$13 = httpNetworkTransport$multipleResponses$$inlined$mapNotNull$1$2$1;
                                }
                                Object obj6 = map2.get("errors");
                                List list3 = obj6 instanceof List ? (List) obj6 : null;
                                if (list3 != null) {
                                    ycc.r(list3, arrayList);
                                }
                                Object obj7 = map2.get("extensions");
                                Map map4 = obj7 instanceof Map ? (Map) obj7 : null;
                                if (map4 != null) {
                                    arrayList2.add(map4);
                                }
                                i4 = i5;
                                coroutineSingletons2 = coroutineSingletons3;
                                it = it2;
                                httpNetworkTransport$multipleResponses$$inlined$mapNotNull$1$2$1 = httpNetworkTransport$multipleResponses$$inlined$mapNotNull$1$2$13;
                            }
                            httpNetworkTransport$multipleResponses$$inlined$mapNotNull$1$2$12 = httpNetworkTransport$multipleResponses$$inlined$mapNotNull$1$2$1;
                            coroutineSingletons = coroutineSingletons2;
                            i2 = i4;
                            if (arrayList.isEmpty()) {
                                linkedHashMap.remove("errors");
                            } else {
                                linkedHashMap.put("errors", arrayList);
                            }
                            if (arrayList2.isEmpty()) {
                                linkedHashMap.remove("extensions");
                            } else {
                                linkedHashMap.put("extensions", gw00.e(new Pair("incremental", arrayList2)));
                            }
                        }
                        Boolean bool = (Boolean) map.get("hasNext");
                        xohVar.e = bool != null ? bool.booleanValue() : false;
                    }
                    T t = ref$ObjectRef.element;
                    LinkedHashSet linkedHashSet = ((xoh) t).d;
                    xoh xohVar2 = (xoh) t;
                    boolean z = !xohVar2.e;
                    if (xohVar2.f) {
                        a = null;
                        bVar = this;
                    } else {
                        zj00 zj00Var = new zj00(linkedHashMap2, EmptyList.a);
                        vkf vkfVar = new vkf();
                        LinkedHashMap linkedHashMap3 = vkfVar.a;
                        bVar = this;
                        com.apollographql.apollo3.api.c cVar = bVar.c;
                        linkedHashMap3.putAll(cVar.c);
                        i70 a2 = cVar.a.a();
                        a2.b = linkedHashSet;
                        vkfVar.b = a2.a();
                        uo2 a3 = cvw.S(bVar.b, zj00Var, vkfVar.a()).a();
                        a3.a = z;
                        a = a3.a();
                    }
                    if (a != null) {
                        HttpNetworkTransport$multipleResponses$$inlined$mapNotNull$1$2$1 httpNetworkTransport$multipleResponses$$inlined$mapNotNull$1$2$15 = httpNetworkTransport$multipleResponses$$inlined$mapNotNull$1$2$12;
                        httpNetworkTransport$multipleResponses$$inlined$mapNotNull$1$2$15.label = i2;
                        CoroutineSingletons coroutineSingletons4 = coroutineSingletons;
                        if (bVar.a.emit(a, httpNetworkTransport$multipleResponses$$inlined$mapNotNull$1$2$15) == coroutineSingletons4) {
                            return coroutineSingletons4;
                        }
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        httpNetworkTransport$multipleResponses$$inlined$mapNotNull$1$2$1 = new HttpNetworkTransport$multipleResponses$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = httpNetworkTransport$multipleResponses$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = httpNetworkTransport$multipleResponses$$inlined$mapNotNull$1$2$1.label;
        int i42 = 1;
        if (i != 0) {
        }
        return zy11.a;
    }
}
