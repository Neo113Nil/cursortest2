package com.ybsdk.feature.pfm.internal.data;

import com.ybsdk.core.utils.ext.c;
import com.ybsdk.feature.pfm.internal.data.network.PfmApi;
import com.ybsdk.feature.pfm.internal.data.network.dto.PfmRequest;
import defpackage.ny61;
import defpackage.qqy;
import defpackage.rcc;
import defpackage.scb0;
import defpackage.scc;
import defpackage.tab0;
import defpackage.tcb0;
import defpackage.tcc;
import defpackage.ucb0;
import defpackage.vcb0;
import defpackage.w511;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.Result;
import kotlin.b;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class a {
    public final PfmApi a;

    public a(PfmApi pfmApi) {
        this.a = pfmApi;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, Set set, List list, ContinuationImpl continuationImpl) {
        PfmRepository$getPfmFeed$1 pfmRepository$getPfmFeed$1;
        int i;
        Calendar calendar;
        Set set2;
        if (continuationImpl instanceof PfmRepository$getPfmFeed$1) {
            pfmRepository$getPfmFeed$1 = (PfmRepository$getPfmFeed$1) continuationImpl;
            int i2 = pfmRepository$getPfmFeed$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pfmRepository$getPfmFeed$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pfmRepository$getPfmFeed$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pfmRepository$getPfmFeed$1.label;
                PfmRequest.PfmDate pfmDate = null;
                if (i == 0) {
                    if (i == 1) {
                        b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                Set<vcb0> set3 = set;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : set3) {
                    if (obj2 instanceof scb0) {
                        arrayList.add(obj2);
                    }
                }
                scb0 scb0Var = (scb0) kotlin.collections.a.R(arrayList);
                ListBuilder a = rcc.a();
                for (vcb0 vcb0Var : set3) {
                    if (vcb0Var instanceof tcb0) {
                        String str2 = ((tcb0) vcb0Var).b;
                        set2 = scc.h(str2 != null ? new tab0(str2) : null);
                    } else if (vcb0Var instanceof ucb0) {
                        set2 = ((ucb0) vcb0Var).b;
                    } else {
                        if (!(vcb0Var instanceof scb0)) {
                            w511.b();
                            return null;
                        }
                        set2 = null;
                    }
                    Collection collection = set2;
                    if (collection != null) {
                        for (Object obj3 : collection) {
                            if (obj3 != null) {
                                a.add(obj3);
                            }
                        }
                    }
                }
                ListBuilder j = a.j();
                ArrayList arrayList2 = new ArrayList(tcc.n(j, 10));
                ListIterator listIterator = j.listIterator(0);
                while (true) {
                    qqy qqyVar = (qqy) listIterator;
                    if (!qqyVar.hasNext()) {
                        break;
                    }
                    arrayList2.add(((tab0) qqyVar.next()).a);
                }
                Set N0 = kotlin.collections.a.N0(arrayList2);
                if ((scb0Var != null ? scb0Var.b : null) != null && (calendar = scb0Var.c) != null) {
                    Calendar calendar2 = scb0Var.b;
                    Calendar calendar3 = (Calendar) calendar.clone();
                    calendar3.add(5, 1);
                    pfmDate = new PfmRequest.PfmDate(calendar2, calendar3);
                }
                PfmRepository$getPfmFeed$2 pfmRepository$getPfmFeed$2 = new PfmRepository$getPfmFeed$2(this, str, new PfmRequest.BaseFilters(N0, pfmDate), list, null);
                pfmRepository$getPfmFeed$1.label = 1;
                Object c = c.c(pfmRepository$getPfmFeed$2, pfmRepository$getPfmFeed$1);
                return c == coroutineSingletons ? coroutineSingletons : c;
            }
        }
        pfmRepository$getPfmFeed$1 = new PfmRepository$getPfmFeed$1(this, continuationImpl);
        Object obj4 = pfmRepository$getPfmFeed$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pfmRepository$getPfmFeed$1.label;
        PfmRequest.PfmDate pfmDate2 = null;
        if (i == 0) {
        }
    }
}
