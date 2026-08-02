package com.yandex.go.tariffcard.ui;

import android.content.Context;
import android.view.ContextThemeWrapper;
import defpackage.cdc;
import defpackage.cxu0;
import defpackage.dn40;
import defpackage.h3y;
import defpackage.hn40;
import defpackage.hq40;
import defpackage.in40;
import defpackage.iq40;
import defpackage.kn40;
import defpackage.kq40;
import defpackage.mi31;
import defpackage.mqv0;
import defpackage.nco;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.qje;
import defpackage.scc;
import defpackage.tcc;
import defpackage.tn40;
import defpackage.w511;
import defpackage.xng0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes14.dex */
public final class b {
    public final h3y a;
    public final mqv0 b;
    public final h3y c;
    public final h3y d;
    public final com.yandex.go.tariffcard.interactor.f e;
    public final Context f;

    public b(h3y h3yVar, mqv0 mqv0Var, h3y h3yVar2, h3y h3yVar3, com.yandex.go.tariffcard.interactor.f fVar, Context context) {
        this.a = h3yVar;
        this.b = mqv0Var;
        this.c = h3yVar2;
        this.d = h3yVar3;
        this.e = fVar;
        this.f = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6, types: [int] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x01e6 -> B:10:0x00af). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(mi31 mi31Var, Map map, boolean z, cxu0 cxu0Var, ContinuationImpl continuationImpl) {
        MultiTariffOptionsFactory$getMultiTariffOptions$1 multiTariffOptionsFactory$getMultiTariffOptions$1;
        int i;
        Object obj;
        Iterator it;
        MultiTariffOptionsFactory$getMultiTariffOptions$1 multiTariffOptionsFactory$getMultiTariffOptions$12;
        Collection collection;
        int i2;
        boolean z2;
        ContextThemeWrapper contextThemeWrapper;
        Set set;
        Map map2;
        MultiTariffOption$LeadIconType multiTariffOption$LeadIconType;
        b bVar = this;
        mi31 mi31Var2 = mi31Var;
        if (continuationImpl instanceof MultiTariffOptionsFactory$getMultiTariffOptions$1) {
            multiTariffOptionsFactory$getMultiTariffOptions$1 = (MultiTariffOptionsFactory$getMultiTariffOptions$1) continuationImpl;
            int i3 = multiTariffOptionsFactory$getMultiTariffOptions$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                multiTariffOptionsFactory$getMultiTariffOptions$1.label = i3 - Integer.MIN_VALUE;
                Object obj2 = multiTariffOptionsFactory$getMultiTariffOptions$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = multiTariffOptionsFactory$getMultiTariffOptions$1.label;
                if (i != 0) {
                    obj = null;
                    kotlin.b.b(obj2);
                    boolean z3 = mi31Var2.a.K0;
                    Collection collection2 = EmptyList.a;
                    if (!z3) {
                        return collection2;
                    }
                    Set a = ((com.yandex.go.taxi.tariffs.repository.g) bVar.a.get()).a(mi31Var2.b);
                    Collection collection3 = mi31Var2.a.U;
                    if (collection3 != null) {
                        collection2 = collection3;
                    }
                    ContextThemeWrapper contextThemeWrapper2 = new ContextThemeWrapper(bVar.f, cxu0Var.b);
                    Collection collection4 = collection2;
                    ArrayList arrayList = new ArrayList(tcc.n(collection4, 10));
                    it = collection4.iterator();
                    multiTariffOptionsFactory$getMultiTariffOptions$12 = multiTariffOptionsFactory$getMultiTariffOptions$1;
                    collection = arrayList;
                    i2 = 0;
                    z2 = z;
                    contextThemeWrapper = contextThemeWrapper2;
                    set = a;
                    map2 = map;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    boolean z4 = multiTariffOptionsFactory$getMultiTariffOptions$1.Z$1;
                    int i4 = multiTariffOptionsFactory$getMultiTariffOptions$1.I$2;
                    i2 = multiTariffOptionsFactory$getMultiTariffOptions$1.I$0;
                    boolean z5 = multiTariffOptionsFactory$getMultiTariffOptions$1.Z$0;
                    collection = (Collection) multiTariffOptionsFactory$getMultiTariffOptions$1.L$20;
                    String str = (String) multiTariffOptionsFactory$getMultiTariffOptions$1.L$19;
                    String str2 = (String) multiTariffOptionsFactory$getMultiTariffOptions$1.L$18;
                    MultiTariffOption$LeadIconType multiTariffOption$LeadIconType2 = (MultiTariffOption$LeadIconType) multiTariffOptionsFactory$getMultiTariffOptions$1.L$17;
                    dn40 dn40Var = (dn40) multiTariffOptionsFactory$getMultiTariffOptions$1.L$16;
                    String str3 = (String) multiTariffOptionsFactory$getMultiTariffOptions$1.L$15;
                    in40 in40Var = (in40) multiTariffOptionsFactory$getMultiTariffOptions$1.L$14;
                    hq40 hq40Var = (hq40) multiTariffOptionsFactory$getMultiTariffOptions$1.L$13;
                    boolean contains = z4;
                    nco ncoVar = (nco) multiTariffOptionsFactory$getMultiTariffOptions$1.L$12;
                    Iterator it2 = (Iterator) multiTariffOptionsFactory$getMultiTariffOptions$1.L$9;
                    Collection collection5 = (Collection) multiTariffOptionsFactory$getMultiTariffOptions$1.L$8;
                    ContextThemeWrapper contextThemeWrapper3 = (ContextThemeWrapper) multiTariffOptionsFactory$getMultiTariffOptions$1.L$5;
                    Set set2 = (Set) multiTariffOptionsFactory$getMultiTariffOptions$1.L$3;
                    Map map3 = (Map) multiTariffOptionsFactory$getMultiTariffOptions$1.L$1;
                    mi31 mi31Var3 = (mi31) multiTariffOptionsFactory$getMultiTariffOptions$1.L$0;
                    kotlin.b.b(obj2);
                    nco ncoVar2 = ncoVar;
                    Iterator it3 = it2;
                    mi31 mi31Var4 = mi31Var3;
                    CoroutineSingletons coroutineSingletons2 = coroutineSingletons;
                    String str4 = str3;
                    hq40 hq40Var2 = hq40Var;
                    in40 in40Var2 = in40Var;
                    String str5 = str;
                    String str6 = str2;
                    MultiTariffOption$LeadIconType multiTariffOption$LeadIconType3 = multiTariffOption$LeadIconType2;
                    contextThemeWrapper = contextThemeWrapper3;
                    set = set2;
                    Collection collection6 = collection5;
                    multiTariffOptionsFactory$getMultiTariffOptions$12 = multiTariffOptionsFactory$getMultiTariffOptions$1;
                    z2 = z5;
                    collection.add(new kn40(str5, str6, multiTariffOption$LeadIconType3, contains, dn40Var, str4, in40Var2, i4 == 0, hq40Var2, ncoVar2, (hn40) obj2));
                    it = it3;
                    collection = collection6;
                    map2 = map3;
                    obj = null;
                    bVar = this;
                    coroutineSingletons = coroutineSingletons2;
                    mi31Var2 = mi31Var4;
                    if (it.hasNext()) {
                        Object next = it.next();
                        int i5 = i2 + 1;
                        if (i2 < 0) {
                            scc.m();
                            throw null;
                        }
                        pex0 pex0Var = (pex0) next;
                        String str7 = pex0Var.b;
                        String str8 = pex0Var.j;
                        int i6 = tn40.a[bVar.b.c().ordinal()];
                        CoroutineSingletons coroutineSingletons3 = coroutineSingletons;
                        if (i6 == 1) {
                            multiTariffOption$LeadIconType = MultiTariffOption$LeadIconType.HIGH;
                        } else {
                            if (i6 != 2) {
                                w511.b();
                                return obj;
                            }
                            multiTariffOption$LeadIconType = MultiTariffOption$LeadIconType.USUAL;
                        }
                        contains = set.contains(str7);
                        int i7 = i2;
                        boolean z6 = z2;
                        dn40Var = new dn40(new cdc(qje.t(xng0.textOnControl, contextThemeWrapper)), new cdc(qje.u(contextThemeWrapper.getTheme(), xng0.controlMain)));
                        String str9 = pex0Var.l;
                        in40 a2 = ((kq40) bVar.d.get()).a(pex0Var);
                        ?? r12 = i7 != 0 ? i7 > 0 ? 1 : 0 : z6;
                        hq40 a3 = ((iq40) bVar.c.get()).a(mi31Var2, pex0Var);
                        nco ncoVar3 = (nco) map2.get(str7);
                        multiTariffOptionsFactory$getMultiTariffOptions$12.L$0 = mi31Var2;
                        multiTariffOptionsFactory$getMultiTariffOptions$12.L$1 = map2;
                        mi31Var4 = mi31Var2;
                        Object obj3 = obj;
                        multiTariffOptionsFactory$getMultiTariffOptions$12.L$2 = obj3;
                        multiTariffOptionsFactory$getMultiTariffOptions$12.L$3 = set;
                        multiTariffOptionsFactory$getMultiTariffOptions$12.L$4 = obj3;
                        multiTariffOptionsFactory$getMultiTariffOptions$12.L$5 = contextThemeWrapper;
                        multiTariffOptionsFactory$getMultiTariffOptions$12.L$6 = obj3;
                        multiTariffOptionsFactory$getMultiTariffOptions$12.L$7 = obj3;
                        multiTariffOptionsFactory$getMultiTariffOptions$12.L$8 = collection;
                        multiTariffOptionsFactory$getMultiTariffOptions$12.L$9 = it;
                        multiTariffOptionsFactory$getMultiTariffOptions$12.L$10 = obj3;
                        multiTariffOptionsFactory$getMultiTariffOptions$12.L$11 = obj3;
                        multiTariffOptionsFactory$getMultiTariffOptions$12.L$12 = ncoVar3;
                        multiTariffOptionsFactory$getMultiTariffOptions$12.L$13 = a3;
                        multiTariffOptionsFactory$getMultiTariffOptions$12.L$14 = a2;
                        multiTariffOptionsFactory$getMultiTariffOptions$12.L$15 = str9;
                        multiTariffOptionsFactory$getMultiTariffOptions$12.L$16 = dn40Var;
                        multiTariffOptionsFactory$getMultiTariffOptions$12.L$17 = multiTariffOption$LeadIconType;
                        multiTariffOptionsFactory$getMultiTariffOptions$12.L$18 = str8;
                        multiTariffOptionsFactory$getMultiTariffOptions$12.L$19 = str7;
                        multiTariffOptionsFactory$getMultiTariffOptions$12.L$20 = collection;
                        multiTariffOptionsFactory$getMultiTariffOptions$12.Z$0 = z6;
                        multiTariffOptionsFactory$getMultiTariffOptions$12.I$0 = i5;
                        multiTariffOptionsFactory$getMultiTariffOptions$12.I$1 = i7;
                        multiTariffOptionsFactory$getMultiTariffOptions$12.I$2 = r12;
                        multiTariffOptionsFactory$getMultiTariffOptions$12.Z$1 = contains;
                        multiTariffOptionsFactory$getMultiTariffOptions$12.label = 1;
                        Object c = bVar.e.c(pex0Var, multiTariffOptionsFactory$getMultiTariffOptions$12);
                        coroutineSingletons2 = coroutineSingletons3;
                        if (c == coroutineSingletons2) {
                            return coroutineSingletons2;
                        }
                        str4 = str9;
                        multiTariffOption$LeadIconType3 = multiTariffOption$LeadIconType;
                        in40Var2 = a2;
                        ncoVar2 = ncoVar3;
                        collection6 = collection;
                        str5 = str7;
                        hq40Var2 = a3;
                        z2 = z6;
                        str6 = str8;
                        i2 = i5;
                        map3 = map2;
                        obj2 = c;
                        it3 = it;
                        i4 = r12;
                        collection.add(new kn40(str5, str6, multiTariffOption$LeadIconType3, contains, dn40Var, str4, in40Var2, i4 == 0, hq40Var2, ncoVar2, (hn40) obj2));
                        it = it3;
                        collection = collection6;
                        map2 = map3;
                        obj = null;
                        bVar = this;
                        coroutineSingletons = coroutineSingletons2;
                        mi31Var2 = mi31Var4;
                        if (it.hasNext()) {
                            return (List) collection;
                        }
                    }
                }
            }
        }
        multiTariffOptionsFactory$getMultiTariffOptions$1 = new MultiTariffOptionsFactory$getMultiTariffOptions$1(bVar, continuationImpl);
        Object obj22 = multiTariffOptionsFactory$getMultiTariffOptions$1.result;
        CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = multiTariffOptionsFactory$getMultiTariffOptions$1.label;
        if (i != 0) {
        }
    }
}
