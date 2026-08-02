package com.yandex.go.scooters.data.mapper;

import defpackage.a9j;
import defpackage.b9j;
import defpackage.bvf0;
import defpackage.c9j;
import defpackage.cno0;
import defpackage.ds60;
import defpackage.er;
import defpackage.f9s;
import defpackage.fef;
import defpackage.hs60;
import defpackage.k7x0;
import defpackage.lp;
import defpackage.m7x0;
import defpackage.n8j;
import defpackage.ny61;
import defpackage.qp;
import defpackage.ro;
import defpackage.tcc;
import defpackage.u8j;
import defpackage.v8j;
import defpackage.w8j;
import defpackage.wo;
import defpackage.xdf;
import defpackage.xp;
import defpackage.y8j;
import defpackage.z8j;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes13.dex */
public final class c {
    public final k7x0 a;
    public final xdf b;
    public final ru.yandex.taxi.widget.c c;
    public final cno0 d;

    public c(k7x0 k7x0Var, xdf xdfVar, ru.yandex.taxi.widget.c cVar, cno0 cno0Var) {
        this.a = k7x0Var;
        this.b = xdfVar;
        this.c = cVar;
        this.d = cno0Var;
    }

    public static final Object a(c cVar, FormattedText formattedText, fef fefVar, SuspendLambda suspendLambda) {
        return ru.yandex.taxi.widget.c.e(cVar.c, f9s.c(cVar.b, fefVar, formattedText), null, false, suspendLambda, 30);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00e6 -> B:10:0x00e7). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(List list, fef fefVar, boolean z, ContinuationImpl continuationImpl) {
        ScootersDetailsMapper$mapOfferDetails$1 scootersDetailsMapper$mapOfferDetails$1;
        int i;
        fef fefVar2;
        boolean z2;
        Iterator it;
        ScootersDetailsMapper$mapOfferDetails$1 scootersDetailsMapper$mapOfferDetails$12;
        ArrayList arrayList;
        String d;
        c cVar = this;
        if (continuationImpl instanceof ScootersDetailsMapper$mapOfferDetails$1) {
            scootersDetailsMapper$mapOfferDetails$1 = (ScootersDetailsMapper$mapOfferDetails$1) continuationImpl;
            int i2 = scootersDetailsMapper$mapOfferDetails$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersDetailsMapper$mapOfferDetails$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersDetailsMapper$mapOfferDetails$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersDetailsMapper$mapOfferDetails$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (list == null) {
                        return EmptyList.a;
                    }
                    List list2 = list;
                    ArrayList arrayList2 = new ArrayList(tcc.n(list2, 10));
                    fefVar2 = fefVar;
                    z2 = z;
                    it = list2.iterator();
                    scootersDetailsMapper$mapOfferDetails$12 = scootersDetailsMapper$mapOfferDetails$1;
                    arrayList = arrayList2;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    boolean z3 = scootersDetailsMapper$mapOfferDetails$1.Z$0;
                    Collection collection = (Collection) scootersDetailsMapper$mapOfferDetails$1.L$11;
                    Iterator it2 = (Iterator) scootersDetailsMapper$mapOfferDetails$1.L$5;
                    ?? r6 = (Collection) scootersDetailsMapper$mapOfferDetails$1.L$4;
                    fef fefVar3 = (fef) scootersDetailsMapper$mapOfferDetails$1.L$1;
                    kotlin.b.b(obj);
                    z2 = z3;
                    it = it2;
                    arrayList = r6;
                    fefVar2 = fefVar3;
                    scootersDetailsMapper$mapOfferDetails$12 = scootersDetailsMapper$mapOfferDetails$1;
                    collection.add((b9j) obj);
                    cVar = this;
                    if (it.hasNext()) {
                        n8j n8jVar = (n8j) it.next();
                        ru.yandex.taxi.common_models.net.b bVar = FormattedText.Companion;
                        FormattedText c = bVar.c(n8jVar.a);
                        String str = n8jVar.d;
                        cno0 cno0Var = cVar.d;
                        FormattedText c2 = (str == null || (d = cno0Var.d(fefVar2, str)) == null) ? null : bVar.c(d);
                        FormattedText c3 = bVar.c(cno0Var.d(fefVar2, n8jVar.b));
                        er erVar = n8jVar.e;
                        String str2 = n8jVar.c;
                        scootersDetailsMapper$mapOfferDetails$12.L$0 = null;
                        scootersDetailsMapper$mapOfferDetails$12.L$1 = fefVar2;
                        scootersDetailsMapper$mapOfferDetails$12.L$2 = null;
                        scootersDetailsMapper$mapOfferDetails$12.L$3 = null;
                        scootersDetailsMapper$mapOfferDetails$12.L$4 = arrayList;
                        scootersDetailsMapper$mapOfferDetails$12.L$5 = it;
                        scootersDetailsMapper$mapOfferDetails$12.L$6 = null;
                        scootersDetailsMapper$mapOfferDetails$12.L$7 = null;
                        scootersDetailsMapper$mapOfferDetails$12.L$8 = null;
                        scootersDetailsMapper$mapOfferDetails$12.L$9 = null;
                        scootersDetailsMapper$mapOfferDetails$12.L$10 = null;
                        scootersDetailsMapper$mapOfferDetails$12.L$11 = arrayList;
                        scootersDetailsMapper$mapOfferDetails$12.Z$0 = z2;
                        scootersDetailsMapper$mapOfferDetails$12.label = 1;
                        obj = cVar.e(erVar, c, c2, c3, fefVar2, str2, scootersDetailsMapper$mapOfferDetails$12);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        collection = arrayList;
                        collection.add((b9j) obj);
                        cVar = this;
                        if (it.hasNext()) {
                            ArrayList arrayList3 = new ArrayList();
                            for (Object obj2 : arrayList) {
                                if (!(((b9j) obj2) instanceof w8j) || z2) {
                                    arrayList3.add(obj2);
                                }
                            }
                            return Collections.singletonList(new c9j(null, arrayList3));
                        }
                    }
                }
            }
        }
        scootersDetailsMapper$mapOfferDetails$1 = new ScootersDetailsMapper$mapOfferDetails$1(cVar, continuationImpl);
        Object obj3 = scootersDetailsMapper$mapOfferDetails$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersDetailsMapper$mapOfferDetails$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00a0 -> B:10:0x00a6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(List list, fef fefVar, boolean z, ContinuationImpl continuationImpl) {
        ScootersDetailsMapper$mapOfferDetailsSections$1 scootersDetailsMapper$mapOfferDetailsSections$1;
        int i;
        Iterator it;
        fef fefVar2;
        Collection collection;
        if (continuationImpl instanceof ScootersDetailsMapper$mapOfferDetailsSections$1) {
            scootersDetailsMapper$mapOfferDetailsSections$1 = (ScootersDetailsMapper$mapOfferDetailsSections$1) continuationImpl;
            int i2 = scootersDetailsMapper$mapOfferDetailsSections$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersDetailsMapper$mapOfferDetailsSections$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersDetailsMapper$mapOfferDetailsSections$1.result;
                Serializable serializable = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersDetailsMapper$mapOfferDetailsSections$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    List list2 = list;
                    ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                    it = list2.iterator();
                    fefVar2 = fefVar;
                    collection = arrayList;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    boolean z2 = scootersDetailsMapper$mapOfferDetailsSections$1.Z$0;
                    collection = (Collection) scootersDetailsMapper$mapOfferDetailsSections$1.L$9;
                    String str = (String) scootersDetailsMapper$mapOfferDetailsSections$1.L$8;
                    Iterator it2 = (Iterator) scootersDetailsMapper$mapOfferDetailsSections$1.L$5;
                    Collection collection2 = (Collection) scootersDetailsMapper$mapOfferDetailsSections$1.L$4;
                    fef fefVar3 = (fef) scootersDetailsMapper$mapOfferDetailsSections$1.L$1;
                    kotlin.b.b(obj);
                    boolean z3 = z2;
                    fefVar2 = fefVar3;
                    Iterator it3 = it2;
                    ScootersDetailsMapper$mapOfferDetailsSections$1 scootersDetailsMapper$mapOfferDetailsSections$12 = scootersDetailsMapper$mapOfferDetailsSections$1;
                    Object obj2 = obj;
                    collection.add(new c9j(str, (List) obj2));
                    z = z3;
                    scootersDetailsMapper$mapOfferDetailsSections$1 = scootersDetailsMapper$mapOfferDetailsSections$12;
                    collection = collection2;
                    it = it3;
                    if (it.hasNext()) {
                        ds60 ds60Var = (ds60) it.next();
                        String str2 = ds60Var.a;
                        List list3 = ds60Var.b;
                        scootersDetailsMapper$mapOfferDetailsSections$1.L$0 = null;
                        scootersDetailsMapper$mapOfferDetailsSections$1.L$1 = fefVar2;
                        scootersDetailsMapper$mapOfferDetailsSections$1.L$2 = null;
                        scootersDetailsMapper$mapOfferDetailsSections$1.L$3 = null;
                        scootersDetailsMapper$mapOfferDetailsSections$1.L$4 = collection;
                        scootersDetailsMapper$mapOfferDetailsSections$1.L$5 = it;
                        scootersDetailsMapper$mapOfferDetailsSections$1.L$6 = null;
                        scootersDetailsMapper$mapOfferDetailsSections$1.L$7 = null;
                        scootersDetailsMapper$mapOfferDetailsSections$1.L$8 = str2;
                        scootersDetailsMapper$mapOfferDetailsSections$1.L$9 = collection;
                        scootersDetailsMapper$mapOfferDetailsSections$1.Z$0 = z;
                        scootersDetailsMapper$mapOfferDetailsSections$1.label = 1;
                        Serializable d = d(list3, fefVar2, z, scootersDetailsMapper$mapOfferDetailsSections$1);
                        if (d == serializable) {
                            return serializable;
                        }
                        it3 = it;
                        scootersDetailsMapper$mapOfferDetailsSections$12 = scootersDetailsMapper$mapOfferDetailsSections$1;
                        obj2 = d;
                        z3 = z;
                        str = str2;
                        collection2 = collection;
                        collection.add(new c9j(str, (List) obj2));
                        z = z3;
                        scootersDetailsMapper$mapOfferDetailsSections$1 = scootersDetailsMapper$mapOfferDetailsSections$12;
                        collection = collection2;
                        it = it3;
                        if (it.hasNext()) {
                            return (List) collection;
                        }
                    }
                }
            }
        }
        scootersDetailsMapper$mapOfferDetailsSections$1 = new ScootersDetailsMapper$mapOfferDetailsSections$1(this, continuationImpl);
        Object obj3 = scootersDetailsMapper$mapOfferDetailsSections$1.result;
        Serializable serializable2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersDetailsMapper$mapOfferDetailsSections$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00be -> B:10:0x00c1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable d(List list, fef fefVar, boolean z, ContinuationImpl continuationImpl) {
        ScootersDetailsMapper$mapToDetailItems$1 scootersDetailsMapper$mapToDetailItems$1;
        int i;
        fef fefVar2;
        Collection arrayList;
        ScootersDetailsMapper$mapToDetailItems$1 scootersDetailsMapper$mapToDetailItems$12;
        Iterator it;
        boolean z2;
        if (continuationImpl instanceof ScootersDetailsMapper$mapToDetailItems$1) {
            scootersDetailsMapper$mapToDetailItems$1 = (ScootersDetailsMapper$mapToDetailItems$1) continuationImpl;
            int i2 = scootersDetailsMapper$mapToDetailItems$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersDetailsMapper$mapToDetailItems$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersDetailsMapper$mapToDetailItems$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersDetailsMapper$mapToDetailItems$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    List list2 = list;
                    fefVar2 = fefVar;
                    arrayList = new ArrayList(tcc.n(list2, 10));
                    scootersDetailsMapper$mapToDetailItems$12 = scootersDetailsMapper$mapToDetailItems$1;
                    it = list2.iterator();
                    z2 = z;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z2 = scootersDetailsMapper$mapToDetailItems$1.Z$0;
                    arrayList = (Collection) scootersDetailsMapper$mapToDetailItems$1.L$10;
                    Iterator it2 = (Iterator) scootersDetailsMapper$mapToDetailItems$1.L$5;
                    Collection collection = (Collection) scootersDetailsMapper$mapToDetailItems$1.L$4;
                    fef fefVar3 = (fef) scootersDetailsMapper$mapToDetailItems$1.L$1;
                    kotlin.b.b(obj);
                    scootersDetailsMapper$mapToDetailItems$12 = scootersDetailsMapper$mapToDetailItems$1;
                    fefVar2 = fefVar3;
                    arrayList.add((b9j) obj);
                    it = it2;
                    arrayList = collection;
                    if (it.hasNext()) {
                        hs60 hs60Var = (hs60) it.next();
                        FormattedText formattedText = hs60Var.c;
                        xdf xdfVar = this.b;
                        FormattedText c = formattedText != null ? f9s.c(xdfVar, fefVar2, formattedText) : null;
                        FormattedText c2 = f9s.c(xdfVar, fefVar2, hs60Var.b);
                        er erVar = hs60Var.d;
                        FormattedText formattedText2 = hs60Var.a;
                        scootersDetailsMapper$mapToDetailItems$12.L$0 = null;
                        scootersDetailsMapper$mapToDetailItems$12.L$1 = fefVar2;
                        scootersDetailsMapper$mapToDetailItems$12.L$2 = null;
                        scootersDetailsMapper$mapToDetailItems$12.L$3 = null;
                        scootersDetailsMapper$mapToDetailItems$12.L$4 = arrayList;
                        scootersDetailsMapper$mapToDetailItems$12.L$5 = it;
                        scootersDetailsMapper$mapToDetailItems$12.L$6 = null;
                        scootersDetailsMapper$mapToDetailItems$12.L$7 = null;
                        scootersDetailsMapper$mapToDetailItems$12.L$8 = null;
                        scootersDetailsMapper$mapToDetailItems$12.L$9 = null;
                        scootersDetailsMapper$mapToDetailItems$12.L$10 = arrayList;
                        scootersDetailsMapper$mapToDetailItems$12.Z$0 = z2;
                        scootersDetailsMapper$mapToDetailItems$12.label = 1;
                        Object e = e(erVar, formattedText2, c, c2, fefVar2, null, scootersDetailsMapper$mapToDetailItems$12);
                        if (e == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        it2 = it;
                        obj = e;
                        collection = arrayList;
                        arrayList.add((b9j) obj);
                        it = it2;
                        arrayList = collection;
                        if (it.hasNext()) {
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj2 : (List) arrayList) {
                                if ((((b9j) obj2) instanceof w8j) && !z2) {
                                    arrayList2.add(obj2);
                                }
                            }
                            return arrayList2;
                        }
                    }
                }
            }
        }
        scootersDetailsMapper$mapToDetailItems$1 = new ScootersDetailsMapper$mapToDetailItems$1(this, continuationImpl);
        Object obj3 = scootersDetailsMapper$mapToDetailItems$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersDetailsMapper$mapToDetailItems$1.label;
        if (i != 0) {
        }
    }

    public final Object e(er erVar, FormattedText formattedText, FormattedText formattedText2, FormattedText formattedText3, fef fefVar, String str, ContinuationImpl continuationImpl) {
        boolean z = erVar instanceof wo;
        k7x0 k7x0Var = this.a;
        if (z) {
            String a = str != null ? ((m7x0) k7x0Var).a(str) : null;
            wo.a aVar = ((wo) erVar).a;
            return new v8j(formattedText, formattedText2, formattedText3, a, aVar.a, aVar.b);
        }
        if (erVar instanceof ro) {
            return new u8j(formattedText, formattedText2, ((ro) erVar).a.a);
        }
        if (erVar instanceof xp) {
            return new y8j(formattedText, formattedText2, formattedText3);
        }
        if (erVar instanceof lp) {
            return new w8j(formattedText, formattedText2, formattedText3);
        }
        if (!(erVar instanceof qp)) {
            return str != null ? new z8j(((m7x0) k7x0Var).a(str), formattedText, formattedText2) : new a9j(formattedText, formattedText2, formattedText3);
        }
        qp.a aVar2 = ((qp) erVar).a;
        FormattedText formattedText4 = aVar2.b;
        FormattedText formattedText5 = aVar2.c;
        FormattedText formattedText6 = aVar2.d;
        if (formattedText4 == null || formattedText6 == null) {
            return new a9j(formattedText, formattedText2, formattedText3);
        }
        Object n = bvf0.n(new ScootersDetailsMapper$toDetailsItem$3(formattedText, formattedText2, erVar, this, formattedText4, fefVar, formattedText5, formattedText6, null), continuationImpl);
        return n == CoroutineSingletons.COROUTINE_SUSPENDED ? n : (b9j) n;
    }
}
