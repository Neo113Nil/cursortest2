package com.yandex.plus.pay.graphql.upsale;

import com.yandex.plus.core.analytics.logging.PlusLogTag;
import com.yandex.plus.core.graphql.exception.GraphQLParseException;
import com.yandex.plus.pay.repository.api.model.upsale.CompositeUpsale;
import com.yandex.plus.pay.repository.api.model.upsale.CompositeUpsales;
import defpackage.atd;
import defpackage.b64;
import defpackage.dtd;
import defpackage.gtd;
import defpackage.gw00;
import defpackage.htd;
import defpackage.i3y;
import defpackage.itd;
import defpackage.k2d0;
import defpackage.mvt;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.qje;
import defpackage.qo2;
import defpackage.rya1;
import defpackage.skd0;
import defpackage.sls;
import defpackage.tcc;
import defpackage.vo2;
import defpackage.yf70;
import defpackage.ykv;
import defpackage.zkv;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class a {
    public final qo2 a;
    public final sls b;
    public final com.yandex.plus.experiments.impl.providers.a c;
    public final i3y d = kotlin.a.a(new mvt(10));

    public a(qo2 qo2Var, sls slsVar, com.yandex.plus.experiments.impl.providers.a aVar) {
        this.a = qo2Var;
        this.b = slsVar;
        this.c = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x0176, code lost:
    
        if (r6 != r8) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x013e A[LOOP:3: B:70:0x0138->B:72:0x013e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, List list, String str3, ArrayList arrayList, ContinuationImpl continuationImpl) {
        GraphQLCompositeUpsaleRepository$getUpsales$1 graphQLCompositeUpsaleRepository$getUpsales$1;
        int i;
        Object g;
        String str4;
        String str5;
        String str6;
        List list2;
        k2d0 k2d0Var;
        LinkedHashMap linkedHashMap;
        ArrayList arrayList2;
        Set set;
        Object failure;
        List list3 = list;
        if (continuationImpl instanceof GraphQLCompositeUpsaleRepository$getUpsales$1) {
            graphQLCompositeUpsaleRepository$getUpsales$1 = (GraphQLCompositeUpsaleRepository$getUpsales$1) continuationImpl;
            int i2 = graphQLCompositeUpsaleRepository$getUpsales$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                graphQLCompositeUpsaleRepository$getUpsales$1.label = i2 - Integer.MIN_VALUE;
                Object obj = graphQLCompositeUpsaleRepository$getUpsales$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = graphQLCompositeUpsaleRepository$getUpsales$1.label;
                if (i != 0) {
                    b.b(obj);
                    PlusLogTag plusLogTag = PlusLogTag.SDK;
                    StringBuilder v = b64.v("getCompositeUpsale() sessionId=", str, ", target=", str2, ", optionOffers=");
                    oyr.D(", tariffOffers=", str3, ", inAppPurchases=", v, list3);
                    v.append(arrayList);
                    skd0.b(plusLogTag, v.toString());
                    graphQLCompositeUpsaleRepository$getUpsales$1.L$0 = str;
                    graphQLCompositeUpsaleRepository$getUpsales$1.L$1 = str2;
                    graphQLCompositeUpsaleRepository$getUpsales$1.L$2 = list3;
                    graphQLCompositeUpsaleRepository$getUpsales$1.L$3 = str3;
                    graphQLCompositeUpsaleRepository$getUpsales$1.L$4 = arrayList;
                    graphQLCompositeUpsaleRepository$getUpsales$1.label = 1;
                    g = this.c.g(graphQLCompositeUpsaleRepository$getUpsales$1);
                    if (g != coroutineSingletons) {
                        str4 = str;
                        str5 = str2;
                        str6 = str3;
                        list2 = arrayList;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    vo2 vo2Var = (vo2) obj;
                    rya1.b(vo2Var);
                    skd0.g(PlusLogTag.SDK, "getCompositeUpsale() response=" + vo2Var);
                    dtd dtdVar = (dtd) vo2Var.c;
                    if (dtdVar == null) {
                        throw new GraphQLParseException("Composite upsale response data is null", null);
                    }
                    atd atdVar = (atd) this.d.getValue();
                    atdVar.getClass();
                    try {
                        htd htdVar = dtdVar.a;
                        String str7 = htdVar.b;
                        String str8 = htdVar.a;
                        ArrayList<gtd> arrayList3 = htdVar.c;
                        ArrayList arrayList4 = new ArrayList();
                        for (gtd gtdVar : arrayList3) {
                            CompositeUpsale a = gtdVar != null ? atdVar.a(gtdVar, str7, str8) : null;
                            if (a != null) {
                                arrayList4.add(a);
                            }
                        }
                        failure = new CompositeUpsales(str7, str8, arrayList4);
                    } catch (Throwable th) {
                        failure = new Result.Failure(th);
                    }
                    Throwable a2 = Result.a(failure);
                    if (a2 == null) {
                        return (CompositeUpsales) failure;
                    }
                    throw new GraphQLParseException(null, a2);
                }
                list2 = (List) graphQLCompositeUpsaleRepository$getUpsales$1.L$4;
                str6 = (String) graphQLCompositeUpsaleRepository$getUpsales$1.L$3;
                list3 = (List) graphQLCompositeUpsaleRepository$getUpsales$1.L$2;
                String str9 = (String) graphQLCompositeUpsaleRepository$getUpsales$1.L$1;
                String str10 = (String) graphQLCompositeUpsaleRepository$getUpsales$1.L$0;
                b.b(obj);
                g = ((Result) obj).getValue();
                str5 = str9;
                str4 = str10;
                List list4 = list3;
                if (g instanceof Result.Failure) {
                    g = null;
                }
                k2d0Var = (k2d0) g;
                yf70 c0 = qje.c0(str6);
                if (k2d0Var != null || (set = k2d0Var.d) == null) {
                    linkedHashMap = null;
                } else {
                    Set set2 = set;
                    int d = gw00.d(tcc.n(set2, 10));
                    if (d < 16) {
                        d = 16;
                    }
                    linkedHashMap = new LinkedHashMap(d);
                    for (Object obj2 : set2) {
                        linkedHashMap.put(obj2, Boolean.TRUE);
                    }
                }
                yf70 c02 = qje.c0(linkedHashMap);
                if (k2d0Var == null) {
                    List list5 = k2d0Var.c;
                    arrayList2 = new ArrayList(tcc.n(list5, 10));
                    Iterator it = list5.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(String.valueOf(((Number) it.next()).longValue()));
                    }
                } else {
                    arrayList2 = null;
                }
                yf70 c03 = qje.c0(arrayList2);
                List<ykv> list6 = list2;
                ArrayList arrayList5 = new ArrayList(tcc.n(list6, 10));
                for (ykv ykvVar : list6) {
                    arrayList5.add(new zkv(ykvVar.b, ykvVar.c, ykvVar.a));
                }
                itd itdVar = new itd(str4, list4, c0, c02, c03, str5, qje.c0(arrayList5), this.b.invoke());
                graphQLCompositeUpsaleRepository$getUpsales$1.L$0 = null;
                graphQLCompositeUpsaleRepository$getUpsales$1.L$1 = null;
                graphQLCompositeUpsaleRepository$getUpsales$1.L$2 = null;
                graphQLCompositeUpsaleRepository$getUpsales$1.L$3 = null;
                graphQLCompositeUpsaleRepository$getUpsales$1.L$4 = null;
                graphQLCompositeUpsaleRepository$getUpsales$1.L$5 = null;
                graphQLCompositeUpsaleRepository$getUpsales$1.label = 2;
                obj = com.yandex.plus.core.graphql.internal.a.d(this.a, itdVar, graphQLCompositeUpsaleRepository$getUpsales$1);
            }
        }
        graphQLCompositeUpsaleRepository$getUpsales$1 = new GraphQLCompositeUpsaleRepository$getUpsales$1(this, continuationImpl);
        Object obj3 = graphQLCompositeUpsaleRepository$getUpsales$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = graphQLCompositeUpsaleRepository$getUpsales$1.label;
        if (i != 0) {
        }
        List list42 = list3;
        if (g instanceof Result.Failure) {
        }
        k2d0Var = (k2d0) g;
        yf70 c04 = qje.c0(str6);
        if (k2d0Var != null) {
        }
        linkedHashMap = null;
        yf70 c022 = qje.c0(linkedHashMap);
        if (k2d0Var == null) {
        }
        yf70 c032 = qje.c0(arrayList2);
        List<ykv> list62 = list2;
        ArrayList arrayList52 = new ArrayList(tcc.n(list62, 10));
        while (r1.hasNext()) {
        }
        itd itdVar2 = new itd(str4, list42, c04, c022, c032, str5, qje.c0(arrayList52), this.b.invoke());
        graphQLCompositeUpsaleRepository$getUpsales$1.L$0 = null;
        graphQLCompositeUpsaleRepository$getUpsales$1.L$1 = null;
        graphQLCompositeUpsaleRepository$getUpsales$1.L$2 = null;
        graphQLCompositeUpsaleRepository$getUpsales$1.L$3 = null;
        graphQLCompositeUpsaleRepository$getUpsales$1.L$4 = null;
        graphQLCompositeUpsaleRepository$getUpsales$1.L$5 = null;
        graphQLCompositeUpsaleRepository$getUpsales$1.label = 2;
        obj3 = com.yandex.plus.core.graphql.internal.a.d(this.a, itdVar2, graphQLCompositeUpsaleRepository$getUpsales$1);
    }
}
