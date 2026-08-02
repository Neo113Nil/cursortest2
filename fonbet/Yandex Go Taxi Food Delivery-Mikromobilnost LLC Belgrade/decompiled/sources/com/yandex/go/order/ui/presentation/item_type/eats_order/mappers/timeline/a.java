package com.yandex.go.order.ui.presentation.item_type.eats_order.mappers.timeline;

import android.net.Uri;
import com.yandex.go.superapp.orders.card.experiments.y;
import com.yandex.go.superapp.tracking.domain.f;
import defpackage.a3p;
import defpackage.b3p;
import defpackage.c501;
import defpackage.d501;
import defpackage.k7x0;
import defpackage.m7x0;
import defpackage.nfn;
import defpackage.ny61;
import defpackage.pfn;
import defpackage.scc;
import defpackage.tcc;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class a {
    public final k7x0 a;
    public final y b;
    public final d501 c;

    public a(k7x0 k7x0Var, y yVar, d501 d501Var) {
        this.a = k7x0Var;
        this.b = yVar;
        this.c = d501Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00e5 -> B:10:0x00e6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(List list, ContinuationImpl continuationImpl) {
        EatsOrderTimelineDomainToModelMapperImpl$getTimelineItemListModel$1 eatsOrderTimelineDomainToModelMapperImpl$getTimelineItemListModel$1;
        int i;
        Collection arrayList;
        Iterator it;
        boolean z;
        if (continuationImpl instanceof EatsOrderTimelineDomainToModelMapperImpl$getTimelineItemListModel$1) {
            eatsOrderTimelineDomainToModelMapperImpl$getTimelineItemListModel$1 = (EatsOrderTimelineDomainToModelMapperImpl$getTimelineItemListModel$1) continuationImpl;
            int i2 = eatsOrderTimelineDomainToModelMapperImpl$getTimelineItemListModel$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eatsOrderTimelineDomainToModelMapperImpl$getTimelineItemListModel$1.label = i2 - Integer.MIN_VALUE;
                Object obj = eatsOrderTimelineDomainToModelMapperImpl$getTimelineItemListModel$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = eatsOrderTimelineDomainToModelMapperImpl$getTimelineItemListModel$1.label;
                if (i != 0) {
                    b.b(obj);
                    boolean w = this.b.w();
                    List list2 = list;
                    arrayList = new ArrayList(tcc.n(list2, 10));
                    it = list2.iterator();
                    z = w;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = eatsOrderTimelineDomainToModelMapperImpl$getTimelineItemListModel$1.Z$0;
                    arrayList = (Collection) eatsOrderTimelineDomainToModelMapperImpl$getTimelineItemListModel$1.L$9;
                    String a = (String) eatsOrderTimelineDomainToModelMapperImpl$getTimelineItemListModel$1.L$8;
                    it = (Iterator) eatsOrderTimelineDomainToModelMapperImpl$getTimelineItemListModel$1.L$4;
                    Collection collection = (Collection) eatsOrderTimelineDomainToModelMapperImpl$getTimelineItemListModel$1.L$3;
                    b.b(obj);
                    arrayList.add(new b3p(a, (c501) obj));
                    arrayList = collection;
                    if (it.hasNext()) {
                        pfn pfnVar = (pfn) it.next();
                        k7x0 k7x0Var = this.a;
                        if (z) {
                            String b = pfnVar.b();
                            ((m7x0) k7x0Var).getClass();
                            a = new Uri.Builder().scheme("tag").authority("t").path("t").appendQueryParameter("t", b).appendQueryParameter("c", "l").build().toString();
                        } else {
                            a = ((m7x0) k7x0Var).a(pfnVar.b());
                        }
                        String a2 = pfnVar.a();
                        eatsOrderTimelineDomainToModelMapperImpl$getTimelineItemListModel$1.L$0 = null;
                        eatsOrderTimelineDomainToModelMapperImpl$getTimelineItemListModel$1.L$1 = null;
                        eatsOrderTimelineDomainToModelMapperImpl$getTimelineItemListModel$1.L$2 = null;
                        eatsOrderTimelineDomainToModelMapperImpl$getTimelineItemListModel$1.L$3 = arrayList;
                        eatsOrderTimelineDomainToModelMapperImpl$getTimelineItemListModel$1.L$4 = it;
                        eatsOrderTimelineDomainToModelMapperImpl$getTimelineItemListModel$1.L$5 = null;
                        eatsOrderTimelineDomainToModelMapperImpl$getTimelineItemListModel$1.L$6 = null;
                        eatsOrderTimelineDomainToModelMapperImpl$getTimelineItemListModel$1.L$7 = null;
                        eatsOrderTimelineDomainToModelMapperImpl$getTimelineItemListModel$1.L$8 = a;
                        eatsOrderTimelineDomainToModelMapperImpl$getTimelineItemListModel$1.L$9 = arrayList;
                        eatsOrderTimelineDomainToModelMapperImpl$getTimelineItemListModel$1.Z$0 = z;
                        eatsOrderTimelineDomainToModelMapperImpl$getTimelineItemListModel$1.label = 1;
                        obj = ((f) this.c).b(a2, eatsOrderTimelineDomainToModelMapperImpl$getTimelineItemListModel$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        collection = arrayList;
                        arrayList.add(new b3p(a, (c501) obj));
                        arrayList = collection;
                        if (it.hasNext()) {
                            return (List) arrayList;
                        }
                    }
                }
            }
        }
        eatsOrderTimelineDomainToModelMapperImpl$getTimelineItemListModel$1 = new EatsOrderTimelineDomainToModelMapperImpl$getTimelineItemListModel$1(this, continuationImpl);
        Object obj2 = eatsOrderTimelineDomainToModelMapperImpl$getTimelineItemListModel$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = eatsOrderTimelineDomainToModelMapperImpl$getTimelineItemListModel$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(nfn nfnVar, ContinuationImpl continuationImpl) {
        EatsOrderTimelineDomainToModelMapperImpl$map$1 eatsOrderTimelineDomainToModelMapperImpl$map$1;
        int i;
        if (continuationImpl instanceof EatsOrderTimelineDomainToModelMapperImpl$map$1) {
            eatsOrderTimelineDomainToModelMapperImpl$map$1 = (EatsOrderTimelineDomainToModelMapperImpl$map$1) continuationImpl;
            int i2 = eatsOrderTimelineDomainToModelMapperImpl$map$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eatsOrderTimelineDomainToModelMapperImpl$map$1.label = i2 - Integer.MIN_VALUE;
                Object obj = eatsOrderTimelineDomainToModelMapperImpl$map$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = eatsOrderTimelineDomainToModelMapperImpl$map$1.label;
                if (i != 0) {
                    b.b(obj);
                    if (nfnVar == null) {
                        return null;
                    }
                    List c = nfnVar.c();
                    eatsOrderTimelineDomainToModelMapperImpl$map$1.L$0 = nfnVar;
                    eatsOrderTimelineDomainToModelMapperImpl$map$1.L$1 = null;
                    eatsOrderTimelineDomainToModelMapperImpl$map$1.label = 1;
                    obj = a(c, eatsOrderTimelineDomainToModelMapperImpl$map$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    nfnVar = (nfn) eatsOrderTimelineDomainToModelMapperImpl$map$1.L$0;
                    b.b(obj);
                }
                return new a3p((List) obj, Math.min(Math.max(nfnVar.b() - 1, 0), scc.f(nfnVar.c())), nfnVar.a());
            }
        }
        eatsOrderTimelineDomainToModelMapperImpl$map$1 = new EatsOrderTimelineDomainToModelMapperImpl$map$1(this, continuationImpl);
        Object obj3 = eatsOrderTimelineDomainToModelMapperImpl$map$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = eatsOrderTimelineDomainToModelMapperImpl$map$1.label;
        if (i != 0) {
        }
        return new a3p((List) obj3, Math.min(Math.max(nfnVar.b() - 1, 0), scc.f(nfnVar.c())), nfnVar.a());
    }
}
