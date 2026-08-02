package com.yandex.go.scooters.insurance.data;

import defpackage.am2;
import defpackage.auu0;
import defpackage.eex;
import defpackage.g050;
import defpackage.gtq0;
import defpackage.hhs;
import defpackage.ihs;
import defpackage.jhs;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.pnz;
import defpackage.rcc;
import defpackage.zy11;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class c {
    public final com.yandex.go.utils.storage.json.a a;
    public final kotlinx.coroutines.sync.a b;
    public volatile String c;
    public volatile boolean d;

    public c(eex eexVar) {
        am2 am2Var = new am2("scooters", "insurance_suggest", kotlin.collections.b.f());
        auu0 auu0Var = auu0.a;
        this.a = eexVar.b(am2Var, pnz.a);
        this.b = gtq0.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0050, code lost:
    
        if (r12 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        ScootersInsuranceSuggestionRepository$incRidesCount$1 scootersInsuranceSuggestionRepository$incRidesCount$1;
        int i;
        Long l;
        if (continuationImpl instanceof ScootersInsuranceSuggestionRepository$incRidesCount$1) {
            scootersInsuranceSuggestionRepository$incRidesCount$1 = (ScootersInsuranceSuggestionRepository$incRidesCount$1) continuationImpl;
            int i2 = scootersInsuranceSuggestionRepository$incRidesCount$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersInsuranceSuggestionRepository$incRidesCount$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersInsuranceSuggestionRepository$incRidesCount$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersInsuranceSuggestionRepository$incRidesCount$1.label;
                zy11 zy11Var = zy11.a;
                com.yandex.go.utils.storage.json.a aVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersInsuranceSuggestionRepository$incRidesCount$1.L$0 = str;
                    scootersInsuranceSuggestionRepository$incRidesCount$1.label = 1;
                    obj = aVar.a(scootersInsuranceSuggestionRepository$incRidesCount$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return zy11Var;
                    }
                    str = (String) scootersInsuranceSuggestionRepository$incRidesCount$1.L$0;
                    kotlin.b.b(obj);
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap((Map) obj);
                l = (Long) linkedHashMap.get(str);
                if (l != null) {
                    long longValue = l.longValue();
                    linkedHashMap.put(str, new Long(1 + longValue));
                    scootersInsuranceSuggestionRepository$incRidesCount$1.L$0 = null;
                    scootersInsuranceSuggestionRepository$incRidesCount$1.L$1 = null;
                    scootersInsuranceSuggestionRepository$incRidesCount$1.J$0 = longValue;
                    scootersInsuranceSuggestionRepository$incRidesCount$1.label = 2;
                    if (aVar.d(linkedHashMap, scootersInsuranceSuggestionRepository$incRidesCount$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return zy11Var;
            }
        }
        scootersInsuranceSuggestionRepository$incRidesCount$1 = new ScootersInsuranceSuggestionRepository$incRidesCount$1(this, continuationImpl);
        Object obj2 = scootersInsuranceSuggestionRepository$incRidesCount$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersInsuranceSuggestionRepository$incRidesCount$1.label;
        zy11 zy11Var2 = zy11.a;
        com.yandex.go.utils.storage.json.a aVar2 = this.a;
        if (i != 0) {
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap((Map) obj2);
        l = (Long) linkedHashMap2.get(str);
        if (l != null) {
        }
        return zy11Var2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:3|(9:5|6|(1:(1:(6:14|15|16|17|18|19)(2:11|12))(1:24))(1:42)|25|26|(5:(1:38)|36|17|18|19)(6:30|(3:32|33|34)|36|17|18|19)|21|22|23))|44|6|(0)(0)|25|26|(1:28)|(0)|36|17|18|19) */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0090, code lost:
    
        if (a(r2, r0) == r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007f, code lost:
    
        r7 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0080, code lost:
    
        r8 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x005f, code lost:
    
        if (r9.a(r0) == r1) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0084 A[Catch: all -> 0x007f, TRY_LEAVE, TryCatch #1 {all -> 0x007f, blocks: (B:26:0x0062, B:28:0x0068, B:30:0x006c, B:38:0x0084), top: B:25:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.yandex.go.scooters.insurance.data.c] */
    /* JADX WARN: Type inference failed for: r8v12, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(jhs jhsVar, ContinuationImpl continuationImpl) {
        ScootersInsuranceSuggestionRepository$offerBooked$1 scootersInsuranceSuggestionRepository$offerBooked$1;
        int i;
        kotlinx.coroutines.sync.a aVar;
        g050 g050Var;
        String str;
        if (continuationImpl instanceof ScootersInsuranceSuggestionRepository$offerBooked$1) {
            scootersInsuranceSuggestionRepository$offerBooked$1 = (ScootersInsuranceSuggestionRepository$offerBooked$1) continuationImpl;
            int i2 = scootersInsuranceSuggestionRepository$offerBooked$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersInsuranceSuggestionRepository$offerBooked$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersInsuranceSuggestionRepository$offerBooked$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersInsuranceSuggestionRepository$offerBooked$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    aVar = this.b;
                    scootersInsuranceSuggestionRepository$offerBooked$1.L$0 = jhsVar;
                    scootersInsuranceSuggestionRepository$offerBooked$1.L$1 = aVar;
                    scootersInsuranceSuggestionRepository$offerBooked$1.label = 1;
                } else if (i == 1) {
                    ?? r8 = (g050) scootersInsuranceSuggestionRepository$offerBooked$1.L$1;
                    jhs jhsVar2 = (jhs) scootersInsuranceSuggestionRepository$offerBooked$1.L$0;
                    kotlin.b.b(obj);
                    aVar = r8;
                    jhsVar = jhsVar2;
                } else {
                    if (i != 2 && i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    g050Var = (g050) scootersInsuranceSuggestionRepository$offerBooked$1.L$1;
                    try {
                        kotlin.b.b(obj);
                        this.c = null;
                        this.d = false;
                        g050Var.d(null);
                        return zy11.a;
                    } catch (Throwable th) {
                        th = th;
                    }
                }
                str = this.c;
                if (!this.d || !(jhsVar instanceof ihs)) {
                    if (str != null) {
                        scootersInsuranceSuggestionRepository$offerBooked$1.L$0 = null;
                        scootersInsuranceSuggestionRepository$offerBooked$1.L$1 = aVar;
                        scootersInsuranceSuggestionRepository$offerBooked$1.L$2 = null;
                        scootersInsuranceSuggestionRepository$offerBooked$1.label = 3;
                    }
                    g050Var = aVar;
                    this.c = null;
                    this.d = false;
                    g050Var.d(null);
                    return zy11.a;
                }
                String str2 = ((ihs) jhsVar).a;
                scootersInsuranceSuggestionRepository$offerBooked$1.L$0 = null;
                scootersInsuranceSuggestionRepository$offerBooked$1.L$1 = aVar;
                scootersInsuranceSuggestionRepository$offerBooked$1.L$2 = null;
                scootersInsuranceSuggestionRepository$offerBooked$1.label = 2;
                if (a(str2, scootersInsuranceSuggestionRepository$offerBooked$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                g050Var = aVar;
                this.c = null;
                this.d = false;
                g050Var.d(null);
                return zy11.a;
                th = th;
                g050Var.d(null);
                throw th;
            }
        }
        scootersInsuranceSuggestionRepository$offerBooked$1 = new ScootersInsuranceSuggestionRepository$offerBooked$1(this, continuationImpl);
        Object obj2 = scootersInsuranceSuggestionRepository$offerBooked$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersInsuranceSuggestionRepository$offerBooked$1.label;
        if (i != 0) {
        }
        str = this.c;
        if (!this.d) {
        }
        if (str != null) {
        }
        g050Var = aVar;
        this.c = null;
        this.d = false;
        g050Var.d(null);
        return zy11.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0071, code lost:
    
        if (r11 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b6 A[LOOP:0: B:13:0x00b0->B:15:0x00b6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, List list, ContinuationImpl continuationImpl) {
        ScootersInsuranceSuggestionRepository$showInsuranceSuggestWithId$1 scootersInsuranceSuggestionRepository$showInsuranceSuggestWithId$1;
        int i;
        Long l;
        List list2;
        Long l2;
        Iterator it;
        if (continuationImpl instanceof ScootersInsuranceSuggestionRepository$showInsuranceSuggestWithId$1) {
            scootersInsuranceSuggestionRepository$showInsuranceSuggestWithId$1 = (ScootersInsuranceSuggestionRepository$showInsuranceSuggestWithId$1) continuationImpl;
            int i2 = scootersInsuranceSuggestionRepository$showInsuranceSuggestWithId$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersInsuranceSuggestionRepository$showInsuranceSuggestWithId$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersInsuranceSuggestionRepository$showInsuranceSuggestWithId$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersInsuranceSuggestionRepository$showInsuranceSuggestWithId$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (jl40.l(this.c, str) || this.d) {
                        return Boolean.FALSE;
                    }
                    com.yandex.go.utils.storage.json.a aVar = this.a;
                    scootersInsuranceSuggestionRepository$showInsuranceSuggestWithId$1.L$0 = str;
                    scootersInsuranceSuggestionRepository$showInsuranceSuggestWithId$1.L$1 = list;
                    scootersInsuranceSuggestionRepository$showInsuranceSuggestWithId$1.label = 1;
                    obj = aVar.a(scootersInsuranceSuggestionRepository$showInsuranceSuggestWithId$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        l2 = (Long) scootersInsuranceSuggestionRepository$showInsuranceSuggestWithId$1.L$3;
                        list2 = (List) scootersInsuranceSuggestionRepository$showInsuranceSuggestWithId$1.L$1;
                        kotlin.b.b(obj);
                        l = l2;
                        list = list2;
                        ListBuilder a = rcc.a();
                        it = list.iterator();
                        long j = -1;
                        while (it.hasNext()) {
                            j += ((Number) it.next()).longValue() + 1;
                            a.add(new Long(j));
                        }
                        return Boolean.valueOf(a.j().contains(new Long(l != null ? l.longValue() : 0L)));
                    }
                    list = (List) scootersInsuranceSuggestionRepository$showInsuranceSuggestWithId$1.L$1;
                    str = (String) scootersInsuranceSuggestionRepository$showInsuranceSuggestWithId$1.L$0;
                    kotlin.b.b(obj);
                }
                Map map = (Map) obj;
                l = (Long) map.get(str);
                if (l == null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                    linkedHashMap.put(str, new Long(0L));
                    com.yandex.go.utils.storage.json.a aVar2 = this.a;
                    scootersInsuranceSuggestionRepository$showInsuranceSuggestWithId$1.L$0 = null;
                    scootersInsuranceSuggestionRepository$showInsuranceSuggestWithId$1.L$1 = list;
                    scootersInsuranceSuggestionRepository$showInsuranceSuggestWithId$1.L$2 = null;
                    scootersInsuranceSuggestionRepository$showInsuranceSuggestWithId$1.L$3 = l;
                    scootersInsuranceSuggestionRepository$showInsuranceSuggestWithId$1.L$4 = null;
                    scootersInsuranceSuggestionRepository$showInsuranceSuggestWithId$1.label = 2;
                    if (aVar2.d(linkedHashMap, scootersInsuranceSuggestionRepository$showInsuranceSuggestWithId$1) != coroutineSingletons) {
                        list2 = list;
                        l2 = l;
                        l = l2;
                        list = list2;
                    }
                    return coroutineSingletons;
                }
                ListBuilder a2 = rcc.a();
                it = list.iterator();
                long j2 = -1;
                while (it.hasNext()) {
                }
                return Boolean.valueOf(a2.j().contains(new Long(l != null ? l.longValue() : 0L)));
            }
        }
        scootersInsuranceSuggestionRepository$showInsuranceSuggestWithId$1 = new ScootersInsuranceSuggestionRepository$showInsuranceSuggestWithId$1(this, continuationImpl);
        Object obj2 = scootersInsuranceSuggestionRepository$showInsuranceSuggestWithId$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersInsuranceSuggestionRepository$showInsuranceSuggestWithId$1.label;
        if (i != 0) {
        }
        Map map2 = (Map) obj2;
        l = (Long) map2.get(str);
        if (l == null) {
        }
        ListBuilder a22 = rcc.a();
        it = list.iterator();
        long j22 = -1;
        while (it.hasNext()) {
        }
        return Boolean.valueOf(a22.j().contains(new Long(l != null ? l.longValue() : 0L)));
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0066 A[Catch: all -> 0x0092, TryCatch #0 {all -> 0x0092, blocks: (B:15:0x008a, B:27:0x005c, B:30:0x0066, B:32:0x006a, B:36:0x0097, B:37:0x009c), top: B:26:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ihs ihsVar, ContinuationImpl continuationImpl) {
        ScootersInsuranceSuggestionRepository$showSuggestFullInsurance$1 scootersInsuranceSuggestionRepository$showSuggestFullInsurance$1;
        int i;
        jhs jhsVar;
        g050 g050Var;
        Throwable th;
        g050 g050Var2;
        boolean z;
        try {
            if (continuationImpl instanceof ScootersInsuranceSuggestionRepository$showSuggestFullInsurance$1) {
                scootersInsuranceSuggestionRepository$showSuggestFullInsurance$1 = (ScootersInsuranceSuggestionRepository$showSuggestFullInsurance$1) continuationImpl;
                int i2 = scootersInsuranceSuggestionRepository$showSuggestFullInsurance$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    scootersInsuranceSuggestionRepository$showSuggestFullInsurance$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = scootersInsuranceSuggestionRepository$showSuggestFullInsurance$1.result;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = scootersInsuranceSuggestionRepository$showSuggestFullInsurance$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        scootersInsuranceSuggestionRepository$showSuggestFullInsurance$1.L$0 = ihsVar;
                        kotlinx.coroutines.sync.a aVar = this.b;
                        scootersInsuranceSuggestionRepository$showSuggestFullInsurance$1.L$1 = aVar;
                        scootersInsuranceSuggestionRepository$showSuggestFullInsurance$1.label = 1;
                        if (aVar.a(scootersInsuranceSuggestionRepository$showSuggestFullInsurance$1) != obj2) {
                            jhsVar = ihsVar;
                            g050Var = aVar;
                        }
                        return obj2;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g050Var2 = (g050) scootersInsuranceSuggestionRepository$showSuggestFullInsurance$1.L$1;
                        try {
                            kotlin.b.b(obj);
                            g050Var = g050Var2;
                            z = ((Boolean) obj).booleanValue();
                            Boolean valueOf = Boolean.valueOf(z);
                            g050Var.d(null);
                            return valueOf;
                        } catch (Throwable th2) {
                            th = th2;
                            g050Var2.d(null);
                            throw th;
                        }
                    }
                    g050Var = (g050) scootersInsuranceSuggestionRepository$showSuggestFullInsurance$1.L$1;
                    jhsVar = (jhs) scootersInsuranceSuggestionRepository$showSuggestFullInsurance$1.L$0;
                    kotlin.b.b(obj);
                    if (!jl40.l(jhsVar, hhs.a)) {
                        z = false;
                        Boolean valueOf2 = Boolean.valueOf(z);
                        g050Var.d(null);
                        return valueOf2;
                    }
                    if (!(jhsVar instanceof ihs)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    String str = ((ihs) jhsVar).a;
                    List list = ((ihs) jhsVar).b;
                    scootersInsuranceSuggestionRepository$showSuggestFullInsurance$1.L$0 = null;
                    scootersInsuranceSuggestionRepository$showSuggestFullInsurance$1.L$1 = g050Var;
                    scootersInsuranceSuggestionRepository$showSuggestFullInsurance$1.label = 2;
                    obj = c(str, list, scootersInsuranceSuggestionRepository$showSuggestFullInsurance$1);
                    if (obj != obj2) {
                        g050Var2 = g050Var;
                        g050Var = g050Var2;
                        z = ((Boolean) obj).booleanValue();
                        Boolean valueOf22 = Boolean.valueOf(z);
                        g050Var.d(null);
                        return valueOf22;
                    }
                    return obj2;
                }
            }
            if (!jl40.l(jhsVar, hhs.a)) {
            }
        } catch (Throwable th3) {
            g050 g050Var3 = g050Var;
            th = th3;
            g050Var2 = g050Var3;
            g050Var2.d(null);
            throw th;
        }
        scootersInsuranceSuggestionRepository$showSuggestFullInsurance$1 = new ScootersInsuranceSuggestionRepository$showSuggestFullInsurance$1(this, continuationImpl);
        Object obj3 = scootersInsuranceSuggestionRepository$showSuggestFullInsurance$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersInsuranceSuggestionRepository$showSuggestFullInsurance$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ContinuationImpl continuationImpl) {
        ScootersInsuranceSuggestionRepository$shownInsuranceOnboarding$1 scootersInsuranceSuggestionRepository$shownInsuranceOnboarding$1;
        int i;
        g050 g050Var;
        try {
            if (continuationImpl instanceof ScootersInsuranceSuggestionRepository$shownInsuranceOnboarding$1) {
                scootersInsuranceSuggestionRepository$shownInsuranceOnboarding$1 = (ScootersInsuranceSuggestionRepository$shownInsuranceOnboarding$1) continuationImpl;
                int i2 = scootersInsuranceSuggestionRepository$shownInsuranceOnboarding$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    scootersInsuranceSuggestionRepository$shownInsuranceOnboarding$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = scootersInsuranceSuggestionRepository$shownInsuranceOnboarding$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = scootersInsuranceSuggestionRepository$shownInsuranceOnboarding$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        kotlinx.coroutines.sync.a aVar = this.b;
                        scootersInsuranceSuggestionRepository$shownInsuranceOnboarding$1.L$0 = aVar;
                        scootersInsuranceSuggestionRepository$shownInsuranceOnboarding$1.label = 1;
                        if (aVar.a(scootersInsuranceSuggestionRepository$shownInsuranceOnboarding$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        g050Var = aVar;
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g050Var = (g050) scootersInsuranceSuggestionRepository$shownInsuranceOnboarding$1.L$0;
                        kotlin.b.b(obj);
                    }
                    this.d = true;
                    g050Var.d(null);
                    return zy11.a;
                }
            }
            this.d = true;
            g050Var.d(null);
            return zy11.a;
        } catch (Throwable th) {
            g050Var.d(null);
            throw th;
        }
        scootersInsuranceSuggestionRepository$shownInsuranceOnboarding$1 = new ScootersInsuranceSuggestionRepository$shownInsuranceOnboarding$1(this, continuationImpl);
        Object obj2 = scootersInsuranceSuggestionRepository$shownInsuranceOnboarding$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersInsuranceSuggestionRepository$shownInsuranceOnboarding$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r6v3, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(String str, ContinuationImpl continuationImpl) {
        ScootersInsuranceSuggestionRepository$suggestionShown$1 scootersInsuranceSuggestionRepository$suggestionShown$1;
        int i;
        kotlinx.coroutines.sync.a aVar;
        try {
            if (continuationImpl instanceof ScootersInsuranceSuggestionRepository$suggestionShown$1) {
                scootersInsuranceSuggestionRepository$suggestionShown$1 = (ScootersInsuranceSuggestionRepository$suggestionShown$1) continuationImpl;
                int i2 = scootersInsuranceSuggestionRepository$suggestionShown$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    scootersInsuranceSuggestionRepository$suggestionShown$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = scootersInsuranceSuggestionRepository$suggestionShown$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = scootersInsuranceSuggestionRepository$suggestionShown$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        aVar = this.b;
                        scootersInsuranceSuggestionRepository$suggestionShown$1.L$0 = str;
                        scootersInsuranceSuggestionRepository$suggestionShown$1.L$1 = aVar;
                        scootersInsuranceSuggestionRepository$suggestionShown$1.label = 1;
                        if (aVar.a(scootersInsuranceSuggestionRepository$suggestionShown$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ?? r6 = (g050) scootersInsuranceSuggestionRepository$suggestionShown$1.L$1;
                        String str2 = (String) scootersInsuranceSuggestionRepository$suggestionShown$1.L$0;
                        kotlin.b.b(obj);
                        aVar = r6;
                        str = str2;
                    }
                    this.c = str;
                    aVar.d(null);
                    return zy11.a;
                }
            }
            this.c = str;
            aVar.d(null);
            return zy11.a;
        } catch (Throwable th) {
            aVar.d(null);
            throw th;
        }
        scootersInsuranceSuggestionRepository$suggestionShown$1 = new ScootersInsuranceSuggestionRepository$suggestionShown$1(this, continuationImpl);
        Object obj2 = scootersInsuranceSuggestionRepository$suggestionShown$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersInsuranceSuggestionRepository$suggestionShown$1.label;
        if (i != 0) {
        }
    }
}
