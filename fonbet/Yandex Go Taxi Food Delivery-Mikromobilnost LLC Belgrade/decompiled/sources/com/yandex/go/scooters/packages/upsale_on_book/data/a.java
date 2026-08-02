package com.yandex.go.scooters.packages.upsale_on_book.data;

import com.yandex.go.scooters.packages.upsale_on_book.data.model.ScootersUpsalePackageOnBookExperiment;
import defpackage.am2;
import defpackage.auu0;
import defpackage.eex;
import defpackage.g050;
import defpackage.gtq0;
import defpackage.j6p0;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.pnz;
import defpackage.qco0;
import defpackage.zy11;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class a {
    public final j6p0 a;
    public final com.yandex.go.utils.storage.json.a b;
    public final kotlinx.coroutines.sync.a c;
    public volatile String d;

    public a(eex eexVar, j6p0 j6p0Var) {
        this.a = j6p0Var;
        am2 am2Var = new am2("scooters", "packages_upsale_on_book", b.f());
        auu0 auu0Var = auu0.a;
        this.b = eexVar.b(am2Var, pnz.a);
        this.c = gtq0.a();
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
        ScootersPackagesUpsaleSuggestionRepository$incRidesCount$1 scootersPackagesUpsaleSuggestionRepository$incRidesCount$1;
        int i;
        Long l;
        if (continuationImpl instanceof ScootersPackagesUpsaleSuggestionRepository$incRidesCount$1) {
            scootersPackagesUpsaleSuggestionRepository$incRidesCount$1 = (ScootersPackagesUpsaleSuggestionRepository$incRidesCount$1) continuationImpl;
            int i2 = scootersPackagesUpsaleSuggestionRepository$incRidesCount$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersPackagesUpsaleSuggestionRepository$incRidesCount$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersPackagesUpsaleSuggestionRepository$incRidesCount$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersPackagesUpsaleSuggestionRepository$incRidesCount$1.label;
                zy11 zy11Var = zy11.a;
                com.yandex.go.utils.storage.json.a aVar = this.b;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersPackagesUpsaleSuggestionRepository$incRidesCount$1.L$0 = str;
                    scootersPackagesUpsaleSuggestionRepository$incRidesCount$1.label = 1;
                    obj = aVar.a(scootersPackagesUpsaleSuggestionRepository$incRidesCount$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return zy11Var;
                    }
                    str = (String) scootersPackagesUpsaleSuggestionRepository$incRidesCount$1.L$0;
                    kotlin.b.b(obj);
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap((Map) obj);
                l = (Long) linkedHashMap.get(str);
                if (l != null) {
                    long longValue = l.longValue();
                    linkedHashMap.put(str, new Long(1 + longValue));
                    scootersPackagesUpsaleSuggestionRepository$incRidesCount$1.L$0 = null;
                    scootersPackagesUpsaleSuggestionRepository$incRidesCount$1.L$1 = null;
                    scootersPackagesUpsaleSuggestionRepository$incRidesCount$1.J$0 = longValue;
                    scootersPackagesUpsaleSuggestionRepository$incRidesCount$1.label = 2;
                    if (aVar.d(linkedHashMap, scootersPackagesUpsaleSuggestionRepository$incRidesCount$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return zy11Var;
            }
        }
        scootersPackagesUpsaleSuggestionRepository$incRidesCount$1 = new ScootersPackagesUpsaleSuggestionRepository$incRidesCount$1(this, continuationImpl);
        Object obj2 = scootersPackagesUpsaleSuggestionRepository$incRidesCount$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersPackagesUpsaleSuggestionRepository$incRidesCount$1.label;
        zy11 zy11Var2 = zy11.a;
        com.yandex.go.utils.storage.json.a aVar2 = this.b;
        if (i != 0) {
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap((Map) obj2);
        l = (Long) linkedHashMap2.get(str);
        if (l != null) {
        }
        return zy11Var2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(1:(1:(5:16|17|18|19|20)(2:13|14))(7:22|23|24|(5:26|(2:28|29)|18|19|20)(5:30|(2:(1:35)(1:39)|(1:37))|18|19|20)|52|48|49))(1:40))(1:50)|41|42|(6:44|24|(0)(0)|52|48|49)|29))|53|6|7|(0)(0)|41|42|(0)|29) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c7, code lost:
    
        if (a(r11, r0) == r1) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d4, code lost:
    
        r9 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d2, code lost:
    
        r10 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0074, code lost:
    
        if (r11.a(r0) == r1) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0092 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:17:0x003d, B:18:0x00ca, B:23:0x0053, B:24:0x008c, B:26:0x0092, B:30:0x00a3, B:32:0x00a7, B:35:0x00b1, B:37:0x00b7), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a3 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:17:0x003d, B:18:0x00ca, B:23:0x0053, B:24:0x008c, B:26:0x0092, B:30:0x00a3, B:32:0x00a7, B:35:0x00b1, B:37:0x00b7), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, qco0] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v18, types: [g050] */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v2, types: [g050] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v7, types: [g050] */
    /* JADX WARN: Type inference failed for: r10v9, types: [g050] */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.yandex.go.scooters.packages.upsale_on_book.data.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(qco0 qco0Var, ContinuationImpl continuationImpl) {
        ScootersPackagesUpsaleSuggestionRepository$offerBooked$1 scootersPackagesUpsaleSuggestionRepository$offerBooked$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        kotlinx.coroutines.sync.a aVar;
        qco0 qco0Var2;
        Object b;
        qco0 qco0Var3;
        String str;
        if (continuationImpl instanceof ScootersPackagesUpsaleSuggestionRepository$offerBooked$1) {
            scootersPackagesUpsaleSuggestionRepository$offerBooked$1 = (ScootersPackagesUpsaleSuggestionRepository$offerBooked$1) continuationImpl;
            int i2 = scootersPackagesUpsaleSuggestionRepository$offerBooked$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersPackagesUpsaleSuggestionRepository$offerBooked$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersPackagesUpsaleSuggestionRepository$offerBooked$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersPackagesUpsaleSuggestionRepository$offerBooked$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    aVar = this.c;
                    scootersPackagesUpsaleSuggestionRepository$offerBooked$1.L$0 = qco0Var;
                    scootersPackagesUpsaleSuggestionRepository$offerBooked$1.L$1 = aVar;
                    scootersPackagesUpsaleSuggestionRepository$offerBooked$1.label = 1;
                    qco0Var2 = qco0Var;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3 && i != 4) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qco0Var = (g050) scootersPackagesUpsaleSuggestionRepository$offerBooked$1.L$1;
                            kotlin.b.b(obj);
                            this.d = null;
                            qco0Var.d(null);
                            return zy11.a;
                        }
                        g050 g050Var = (g050) scootersPackagesUpsaleSuggestionRepository$offerBooked$1.L$1;
                        qco0Var3 = (qco0) scootersPackagesUpsaleSuggestionRepository$offerBooked$1.L$0;
                        kotlin.b.b(obj);
                        qco0Var = g050Var;
                        ScootersUpsalePackageOnBookExperiment scootersUpsalePackageOnBookExperiment = (ScootersUpsalePackageOnBookExperiment) obj;
                        str = this.d;
                        if (str == null) {
                            scootersPackagesUpsaleSuggestionRepository$offerBooked$1.L$0 = null;
                            scootersPackagesUpsaleSuggestionRepository$offerBooked$1.L$1 = qco0Var;
                            scootersPackagesUpsaleSuggestionRepository$offerBooked$1.L$2 = null;
                            scootersPackagesUpsaleSuggestionRepository$offerBooked$1.L$3 = null;
                            scootersPackagesUpsaleSuggestionRepository$offerBooked$1.label = 3;
                            if (a(str, scootersPackagesUpsaleSuggestionRepository$offerBooked$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            this.d = null;
                            qco0Var.d(null);
                            return zy11.a;
                        }
                        if (scootersUpsalePackageOnBookExperiment.b && scootersUpsalePackageOnBookExperiment.c.length() > 0) {
                            if ((qco0Var3 != null ? qco0Var3.k : null) != null) {
                                String str2 = scootersUpsalePackageOnBookExperiment.c;
                                scootersPackagesUpsaleSuggestionRepository$offerBooked$1.L$0 = null;
                                scootersPackagesUpsaleSuggestionRepository$offerBooked$1.L$1 = qco0Var;
                                scootersPackagesUpsaleSuggestionRepository$offerBooked$1.L$2 = null;
                                scootersPackagesUpsaleSuggestionRepository$offerBooked$1.L$3 = null;
                                scootersPackagesUpsaleSuggestionRepository$offerBooked$1.label = 4;
                            }
                        }
                        this.d = null;
                        qco0Var.d(null);
                        return zy11.a;
                        th = th;
                        qco0Var.d(null);
                        throw th;
                    }
                    ?? r10 = (g050) scootersPackagesUpsaleSuggestionRepository$offerBooked$1.L$1;
                    qco0 qco0Var4 = (qco0) scootersPackagesUpsaleSuggestionRepository$offerBooked$1.L$0;
                    kotlin.b.b(obj);
                    aVar = r10;
                    qco0Var2 = qco0Var4;
                }
                j6p0 j6p0Var = this.a;
                scootersPackagesUpsaleSuggestionRepository$offerBooked$1.L$0 = qco0Var2;
                scootersPackagesUpsaleSuggestionRepository$offerBooked$1.L$1 = aVar;
                scootersPackagesUpsaleSuggestionRepository$offerBooked$1.label = 2;
                b = j6p0Var.a.b(scootersPackagesUpsaleSuggestionRepository$offerBooked$1);
                if (b != coroutineSingletons) {
                    qco0Var3 = qco0Var2;
                    qco0Var = aVar;
                    obj = b;
                    ScootersUpsalePackageOnBookExperiment scootersUpsalePackageOnBookExperiment2 = (ScootersUpsalePackageOnBookExperiment) obj;
                    str = this.d;
                    if (str == null) {
                    }
                    th = th;
                    qco0Var.d(null);
                    throw th;
                }
                return coroutineSingletons;
            }
        }
        scootersPackagesUpsaleSuggestionRepository$offerBooked$1 = new ScootersPackagesUpsaleSuggestionRepository$offerBooked$1(this, continuationImpl);
        Object obj2 = scootersPackagesUpsaleSuggestionRepository$offerBooked$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersPackagesUpsaleSuggestionRepository$offerBooked$1.label;
        if (i != 0) {
        }
        j6p0 j6p0Var2 = this.a;
        scootersPackagesUpsaleSuggestionRepository$offerBooked$1.L$0 = qco0Var2;
        scootersPackagesUpsaleSuggestionRepository$offerBooked$1.L$1 = aVar;
        scootersPackagesUpsaleSuggestionRepository$offerBooked$1.label = 2;
        b = j6p0Var2.a.b(scootersPackagesUpsaleSuggestionRepository$offerBooked$1);
        if (b != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, List list, ContinuationImpl continuationImpl) {
        ScootersPackagesUpsaleSuggestionRepository$showSuggest$1 scootersPackagesUpsaleSuggestionRepository$showSuggest$1;
        Object obj;
        Object obj2;
        int i;
        String str2;
        g050 g050Var;
        Throwable th;
        g050 g050Var2;
        try {
            if (continuationImpl instanceof ScootersPackagesUpsaleSuggestionRepository$showSuggest$1) {
                scootersPackagesUpsaleSuggestionRepository$showSuggest$1 = (ScootersPackagesUpsaleSuggestionRepository$showSuggest$1) continuationImpl;
                int i2 = scootersPackagesUpsaleSuggestionRepository$showSuggest$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    scootersPackagesUpsaleSuggestionRepository$showSuggest$1.label = i2 - Integer.MIN_VALUE;
                    obj = scootersPackagesUpsaleSuggestionRepository$showSuggest$1.result;
                    obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = scootersPackagesUpsaleSuggestionRepository$showSuggest$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        scootersPackagesUpsaleSuggestionRepository$showSuggest$1.L$0 = str;
                        scootersPackagesUpsaleSuggestionRepository$showSuggest$1.L$1 = list;
                        kotlinx.coroutines.sync.a aVar = this.c;
                        scootersPackagesUpsaleSuggestionRepository$showSuggest$1.L$2 = aVar;
                        scootersPackagesUpsaleSuggestionRepository$showSuggest$1.label = 1;
                        if (aVar.a(scootersPackagesUpsaleSuggestionRepository$showSuggest$1) != obj2) {
                            str2 = str;
                            g050Var = aVar;
                        }
                        return obj2;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g050Var2 = (g050) scootersPackagesUpsaleSuggestionRepository$showSuggest$1.L$2;
                        try {
                            kotlin.b.b(obj);
                            Boolean bool = (Boolean) obj;
                            bool.getClass();
                            g050Var2.d(null);
                            return bool;
                        } catch (Throwable th2) {
                            th = th2;
                            g050Var2.d(null);
                            throw th;
                        }
                    }
                    g050Var = (g050) scootersPackagesUpsaleSuggestionRepository$showSuggest$1.L$2;
                    list = (List) scootersPackagesUpsaleSuggestionRepository$showSuggest$1.L$1;
                    str2 = (String) scootersPackagesUpsaleSuggestionRepository$showSuggest$1.L$0;
                    kotlin.b.b(obj);
                    scootersPackagesUpsaleSuggestionRepository$showSuggest$1.L$0 = null;
                    scootersPackagesUpsaleSuggestionRepository$showSuggest$1.L$1 = null;
                    scootersPackagesUpsaleSuggestionRepository$showSuggest$1.L$2 = g050Var;
                    scootersPackagesUpsaleSuggestionRepository$showSuggest$1.label = 2;
                    obj = d(str2, list, scootersPackagesUpsaleSuggestionRepository$showSuggest$1);
                    if (obj != obj2) {
                        g050Var2 = g050Var;
                        Boolean bool2 = (Boolean) obj;
                        bool2.getClass();
                        g050Var2.d(null);
                        return bool2;
                    }
                    return obj2;
                }
            }
            scootersPackagesUpsaleSuggestionRepository$showSuggest$1.L$0 = null;
            scootersPackagesUpsaleSuggestionRepository$showSuggest$1.L$1 = null;
            scootersPackagesUpsaleSuggestionRepository$showSuggest$1.L$2 = g050Var;
            scootersPackagesUpsaleSuggestionRepository$showSuggest$1.label = 2;
            obj = d(str2, list, scootersPackagesUpsaleSuggestionRepository$showSuggest$1);
            if (obj != obj2) {
            }
            return obj2;
        } catch (Throwable th3) {
            g050 g050Var3 = g050Var;
            th = th3;
            g050Var2 = g050Var3;
            g050Var2.d(null);
            throw th;
        }
        scootersPackagesUpsaleSuggestionRepository$showSuggest$1 = new ScootersPackagesUpsaleSuggestionRepository$showSuggest$1(this, continuationImpl);
        obj = scootersPackagesUpsaleSuggestionRepository$showSuggest$1.result;
        obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersPackagesUpsaleSuggestionRepository$showSuggest$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x006e, code lost:
    
        if (r11 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, List list, ContinuationImpl continuationImpl) {
        ScootersPackagesUpsaleSuggestionRepository$showSuggestWithId$1 scootersPackagesUpsaleSuggestionRepository$showSuggestWithId$1;
        int i;
        Long l;
        List list2;
        Long l2;
        if (continuationImpl instanceof ScootersPackagesUpsaleSuggestionRepository$showSuggestWithId$1) {
            scootersPackagesUpsaleSuggestionRepository$showSuggestWithId$1 = (ScootersPackagesUpsaleSuggestionRepository$showSuggestWithId$1) continuationImpl;
            int i2 = scootersPackagesUpsaleSuggestionRepository$showSuggestWithId$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersPackagesUpsaleSuggestionRepository$showSuggestWithId$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersPackagesUpsaleSuggestionRepository$showSuggestWithId$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersPackagesUpsaleSuggestionRepository$showSuggestWithId$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (jl40.l(this.d, str)) {
                        return Boolean.FALSE;
                    }
                    com.yandex.go.utils.storage.json.a aVar = this.b;
                    scootersPackagesUpsaleSuggestionRepository$showSuggestWithId$1.L$0 = str;
                    scootersPackagesUpsaleSuggestionRepository$showSuggestWithId$1.L$1 = list;
                    scootersPackagesUpsaleSuggestionRepository$showSuggestWithId$1.label = 1;
                    obj = aVar.a(scootersPackagesUpsaleSuggestionRepository$showSuggestWithId$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        l2 = (Long) scootersPackagesUpsaleSuggestionRepository$showSuggestWithId$1.L$3;
                        list2 = (List) scootersPackagesUpsaleSuggestionRepository$showSuggestWithId$1.L$1;
                        kotlin.b.b(obj);
                        l = l2;
                        list = list2;
                        return Boolean.valueOf(list.contains(new Long(l != null ? l.longValue() : 0L)));
                    }
                    list = (List) scootersPackagesUpsaleSuggestionRepository$showSuggestWithId$1.L$1;
                    str = (String) scootersPackagesUpsaleSuggestionRepository$showSuggestWithId$1.L$0;
                    kotlin.b.b(obj);
                }
                Map map = (Map) obj;
                l = (Long) map.get(str);
                if (l == null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                    linkedHashMap.put(str, new Long(0L));
                    com.yandex.go.utils.storage.json.a aVar2 = this.b;
                    scootersPackagesUpsaleSuggestionRepository$showSuggestWithId$1.L$0 = null;
                    scootersPackagesUpsaleSuggestionRepository$showSuggestWithId$1.L$1 = list;
                    scootersPackagesUpsaleSuggestionRepository$showSuggestWithId$1.L$2 = null;
                    scootersPackagesUpsaleSuggestionRepository$showSuggestWithId$1.L$3 = l;
                    scootersPackagesUpsaleSuggestionRepository$showSuggestWithId$1.L$4 = null;
                    scootersPackagesUpsaleSuggestionRepository$showSuggestWithId$1.label = 2;
                    if (aVar2.d(linkedHashMap, scootersPackagesUpsaleSuggestionRepository$showSuggestWithId$1) != coroutineSingletons) {
                        list2 = list;
                        l2 = l;
                        l = l2;
                        list = list2;
                    }
                    return coroutineSingletons;
                }
                return Boolean.valueOf(list.contains(new Long(l != null ? l.longValue() : 0L)));
            }
        }
        scootersPackagesUpsaleSuggestionRepository$showSuggestWithId$1 = new ScootersPackagesUpsaleSuggestionRepository$showSuggestWithId$1(this, continuationImpl);
        Object obj2 = scootersPackagesUpsaleSuggestionRepository$showSuggestWithId$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersPackagesUpsaleSuggestionRepository$showSuggestWithId$1.label;
        if (i != 0) {
        }
        Map map2 = (Map) obj2;
        l = (Long) map2.get(str);
        if (l == null) {
        }
        return Boolean.valueOf(list.contains(new Long(l != null ? l.longValue() : 0L)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r6v3, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, ContinuationImpl continuationImpl) {
        ScootersPackagesUpsaleSuggestionRepository$suggestionShown$1 scootersPackagesUpsaleSuggestionRepository$suggestionShown$1;
        int i;
        kotlinx.coroutines.sync.a aVar;
        try {
            if (continuationImpl instanceof ScootersPackagesUpsaleSuggestionRepository$suggestionShown$1) {
                scootersPackagesUpsaleSuggestionRepository$suggestionShown$1 = (ScootersPackagesUpsaleSuggestionRepository$suggestionShown$1) continuationImpl;
                int i2 = scootersPackagesUpsaleSuggestionRepository$suggestionShown$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    scootersPackagesUpsaleSuggestionRepository$suggestionShown$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = scootersPackagesUpsaleSuggestionRepository$suggestionShown$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = scootersPackagesUpsaleSuggestionRepository$suggestionShown$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        aVar = this.c;
                        scootersPackagesUpsaleSuggestionRepository$suggestionShown$1.L$0 = str;
                        scootersPackagesUpsaleSuggestionRepository$suggestionShown$1.L$1 = aVar;
                        scootersPackagesUpsaleSuggestionRepository$suggestionShown$1.label = 1;
                        if (aVar.a(scootersPackagesUpsaleSuggestionRepository$suggestionShown$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ?? r6 = (g050) scootersPackagesUpsaleSuggestionRepository$suggestionShown$1.L$1;
                        String str2 = (String) scootersPackagesUpsaleSuggestionRepository$suggestionShown$1.L$0;
                        kotlin.b.b(obj);
                        aVar = r6;
                        str = str2;
                    }
                    this.d = str;
                    aVar.d(null);
                    return zy11.a;
                }
            }
            this.d = str;
            aVar.d(null);
            return zy11.a;
        } catch (Throwable th) {
            aVar.d(null);
            throw th;
        }
        scootersPackagesUpsaleSuggestionRepository$suggestionShown$1 = new ScootersPackagesUpsaleSuggestionRepository$suggestionShown$1(this, continuationImpl);
        Object obj2 = scootersPackagesUpsaleSuggestionRepository$suggestionShown$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersPackagesUpsaleSuggestionRepository$suggestionShown$1.label;
        if (i != 0) {
        }
    }
}
