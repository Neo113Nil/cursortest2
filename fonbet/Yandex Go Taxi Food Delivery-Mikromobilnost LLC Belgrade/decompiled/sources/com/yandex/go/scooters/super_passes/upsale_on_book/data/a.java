package com.yandex.go.scooters.super_passes.upsale_on_book.data;

import com.yandex.go.scooters.super_passes.upsale_on_book.data.model.ScootersUpsaleSuperPassOnBookExperiment;
import defpackage.am2;
import defpackage.auu0;
import defpackage.eex;
import defpackage.g050;
import defpackage.gtq0;
import defpackage.jl40;
import defpackage.k6p0;
import defpackage.ny61;
import defpackage.pnz;
import defpackage.rco0;
import defpackage.w20;
import defpackage.zy11;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class a {
    public final k6p0 a;
    public final com.yandex.go.utils.storage.json.a b;
    public final kotlinx.coroutines.sync.a c;
    public volatile String d;

    public a(eex eexVar, k6p0 k6p0Var) {
        this.a = k6p0Var;
        am2 am2Var = new am2("scooters", "super_passes_upsale_on_book", b.f());
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
        ScootersSuperPassesUpsaleSuggestionRepository$incRidesCount$1 scootersSuperPassesUpsaleSuggestionRepository$incRidesCount$1;
        int i;
        Long l;
        if (continuationImpl instanceof ScootersSuperPassesUpsaleSuggestionRepository$incRidesCount$1) {
            scootersSuperPassesUpsaleSuggestionRepository$incRidesCount$1 = (ScootersSuperPassesUpsaleSuggestionRepository$incRidesCount$1) continuationImpl;
            int i2 = scootersSuperPassesUpsaleSuggestionRepository$incRidesCount$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersSuperPassesUpsaleSuggestionRepository$incRidesCount$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersSuperPassesUpsaleSuggestionRepository$incRidesCount$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersSuperPassesUpsaleSuggestionRepository$incRidesCount$1.label;
                zy11 zy11Var = zy11.a;
                com.yandex.go.utils.storage.json.a aVar = this.b;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersSuperPassesUpsaleSuggestionRepository$incRidesCount$1.L$0 = str;
                    scootersSuperPassesUpsaleSuggestionRepository$incRidesCount$1.label = 1;
                    obj = aVar.a(scootersSuperPassesUpsaleSuggestionRepository$incRidesCount$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return zy11Var;
                    }
                    str = (String) scootersSuperPassesUpsaleSuggestionRepository$incRidesCount$1.L$0;
                    kotlin.b.b(obj);
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap((Map) obj);
                l = (Long) linkedHashMap.get(str);
                if (l != null) {
                    long longValue = l.longValue();
                    linkedHashMap.put(str, new Long(1 + longValue));
                    scootersSuperPassesUpsaleSuggestionRepository$incRidesCount$1.L$0 = null;
                    scootersSuperPassesUpsaleSuggestionRepository$incRidesCount$1.L$1 = null;
                    scootersSuperPassesUpsaleSuggestionRepository$incRidesCount$1.J$0 = longValue;
                    scootersSuperPassesUpsaleSuggestionRepository$incRidesCount$1.label = 2;
                    if (aVar.d(linkedHashMap, scootersSuperPassesUpsaleSuggestionRepository$incRidesCount$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return zy11Var;
            }
        }
        scootersSuperPassesUpsaleSuggestionRepository$incRidesCount$1 = new ScootersSuperPassesUpsaleSuggestionRepository$incRidesCount$1(this, continuationImpl);
        Object obj2 = scootersSuperPassesUpsaleSuggestionRepository$incRidesCount$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersSuperPassesUpsaleSuggestionRepository$incRidesCount$1.label;
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

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(1:(1:(5:16|17|18|19|20)(2:13|14))(7:22|23|24|(5:26|(2:28|29)|18|19|20)(5:30|(2:32|(4:(1:44)(1:37)|38|(1:40)|42))|18|19|20)|57|53|54))(1:45))(1:55)|46|47|(6:49|24|(0)(0)|57|53|54)|29))|58|6|7|(0)(0)|46|47|(0)|29) */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c1, code lost:
    
        if (r2.isEmpty() != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d3, code lost:
    
        if (a(r11, r0) == r1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e0, code lost:
    
        r9 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00de, code lost:
    
        r10 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0074, code lost:
    
        if (r11.a(r0) == r1) goto L52;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0092 A[Catch: all -> 0x0042, TryCatch #1 {all -> 0x0042, blocks: (B:17:0x003d, B:18:0x00d6, B:23:0x0053, B:24:0x008c, B:26:0x0092, B:30:0x00a3, B:32:0x00a7, B:35:0x00b1, B:37:0x00b5, B:38:0x00b9, B:40:0x00bd, B:42:0x00c3), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a3 A[Catch: all -> 0x0042, TryCatch #1 {all -> 0x0042, blocks: (B:17:0x003d, B:18:0x00d6, B:23:0x0053, B:24:0x008c, B:26:0x0092, B:30:0x00a3, B:32:0x00a7, B:35:0x00b1, B:37:0x00b5, B:38:0x00b9, B:40:0x00bd, B:42:0x00c3), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, rco0] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v2, types: [g050] */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v7, types: [g050] */
    /* JADX WARN: Type inference failed for: r10v9, types: [g050] */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.yandex.go.scooters.super_passes.upsale_on_book.data.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(rco0 rco0Var, ContinuationImpl continuationImpl) {
        ScootersSuperPassesUpsaleSuggestionRepository$offerBooked$1 scootersSuperPassesUpsaleSuggestionRepository$offerBooked$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        kotlinx.coroutines.sync.a aVar;
        rco0 rco0Var2;
        Object b;
        rco0 rco0Var3;
        Object obj;
        String str;
        w20 w20Var;
        if (continuationImpl instanceof ScootersSuperPassesUpsaleSuggestionRepository$offerBooked$1) {
            scootersSuperPassesUpsaleSuggestionRepository$offerBooked$1 = (ScootersSuperPassesUpsaleSuggestionRepository$offerBooked$1) continuationImpl;
            int i2 = scootersSuperPassesUpsaleSuggestionRepository$offerBooked$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersSuperPassesUpsaleSuggestionRepository$offerBooked$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = scootersSuperPassesUpsaleSuggestionRepository$offerBooked$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersSuperPassesUpsaleSuggestionRepository$offerBooked$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    aVar = this.c;
                    scootersSuperPassesUpsaleSuggestionRepository$offerBooked$1.L$0 = rco0Var;
                    scootersSuperPassesUpsaleSuggestionRepository$offerBooked$1.L$1 = aVar;
                    scootersSuperPassesUpsaleSuggestionRepository$offerBooked$1.label = 1;
                    rco0Var2 = rco0Var;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3 && i != 4) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            g050 g050Var = (g050) scootersSuperPassesUpsaleSuggestionRepository$offerBooked$1.L$1;
                            kotlin.b.b(obj2);
                            rco0Var = g050Var;
                            this.d = null;
                            rco0Var.d(null);
                            return zy11.a;
                        }
                        Object obj3 = (g050) scootersSuperPassesUpsaleSuggestionRepository$offerBooked$1.L$1;
                        rco0Var3 = (rco0) scootersSuperPassesUpsaleSuggestionRepository$offerBooked$1.L$0;
                        kotlin.b.b(obj2);
                        obj = obj3;
                        ScootersUpsaleSuperPassOnBookExperiment scootersUpsaleSuperPassOnBookExperiment = (ScootersUpsaleSuperPassOnBookExperiment) obj2;
                        str = this.d;
                        if (str == null) {
                            scootersSuperPassesUpsaleSuggestionRepository$offerBooked$1.L$0 = null;
                            scootersSuperPassesUpsaleSuggestionRepository$offerBooked$1.L$1 = obj;
                            scootersSuperPassesUpsaleSuggestionRepository$offerBooked$1.L$2 = null;
                            scootersSuperPassesUpsaleSuggestionRepository$offerBooked$1.L$3 = null;
                            scootersSuperPassesUpsaleSuggestionRepository$offerBooked$1.label = 3;
                            rco0Var = obj;
                            if (a(str, scootersSuperPassesUpsaleSuggestionRepository$offerBooked$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            this.d = null;
                            rco0Var.d(null);
                            return zy11.a;
                        }
                        rco0Var = obj;
                        if (scootersUpsaleSuperPassOnBookExperiment.b) {
                            rco0Var = obj;
                            if (scootersUpsaleSuperPassOnBookExperiment.e.length() > 0) {
                                List list = (rco0Var3 == null || (w20Var = rco0Var3.g) == null) ? null : w20Var.c;
                                if (list != null) {
                                    rco0Var = obj;
                                }
                                String str2 = scootersUpsaleSuperPassOnBookExperiment.e;
                                scootersSuperPassesUpsaleSuggestionRepository$offerBooked$1.L$0 = null;
                                scootersSuperPassesUpsaleSuggestionRepository$offerBooked$1.L$1 = obj;
                                scootersSuperPassesUpsaleSuggestionRepository$offerBooked$1.L$2 = null;
                                scootersSuperPassesUpsaleSuggestionRepository$offerBooked$1.L$3 = null;
                                scootersSuperPassesUpsaleSuggestionRepository$offerBooked$1.label = 4;
                                rco0Var = obj;
                            }
                        }
                        this.d = null;
                        rco0Var.d(null);
                        return zy11.a;
                        th = th;
                        rco0Var.d(null);
                        throw th;
                    }
                    ?? r10 = (g050) scootersSuperPassesUpsaleSuggestionRepository$offerBooked$1.L$1;
                    rco0 rco0Var4 = (rco0) scootersSuperPassesUpsaleSuggestionRepository$offerBooked$1.L$0;
                    kotlin.b.b(obj2);
                    aVar = r10;
                    rco0Var2 = rco0Var4;
                }
                k6p0 k6p0Var = this.a;
                scootersSuperPassesUpsaleSuggestionRepository$offerBooked$1.L$0 = rco0Var2;
                scootersSuperPassesUpsaleSuggestionRepository$offerBooked$1.L$1 = aVar;
                scootersSuperPassesUpsaleSuggestionRepository$offerBooked$1.label = 2;
                b = k6p0Var.a.b(scootersSuperPassesUpsaleSuggestionRepository$offerBooked$1);
                if (b != coroutineSingletons) {
                    rco0Var3 = rco0Var2;
                    obj = aVar;
                    obj2 = b;
                    ScootersUpsaleSuperPassOnBookExperiment scootersUpsaleSuperPassOnBookExperiment2 = (ScootersUpsaleSuperPassOnBookExperiment) obj2;
                    str = this.d;
                    if (str == null) {
                    }
                    th = th;
                    rco0Var.d(null);
                    throw th;
                }
                return coroutineSingletons;
            }
        }
        scootersSuperPassesUpsaleSuggestionRepository$offerBooked$1 = new ScootersSuperPassesUpsaleSuggestionRepository$offerBooked$1(this, continuationImpl);
        Object obj22 = scootersSuperPassesUpsaleSuggestionRepository$offerBooked$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersSuperPassesUpsaleSuggestionRepository$offerBooked$1.label;
        if (i != 0) {
        }
        k6p0 k6p0Var2 = this.a;
        scootersSuperPassesUpsaleSuggestionRepository$offerBooked$1.L$0 = rco0Var2;
        scootersSuperPassesUpsaleSuggestionRepository$offerBooked$1.L$1 = aVar;
        scootersSuperPassesUpsaleSuggestionRepository$offerBooked$1.label = 2;
        b = k6p0Var2.a.b(scootersSuperPassesUpsaleSuggestionRepository$offerBooked$1);
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
        ScootersSuperPassesUpsaleSuggestionRepository$showSuggest$1 scootersSuperPassesUpsaleSuggestionRepository$showSuggest$1;
        Object obj;
        Object obj2;
        int i;
        String str2;
        g050 g050Var;
        Throwable th;
        g050 g050Var2;
        try {
            if (continuationImpl instanceof ScootersSuperPassesUpsaleSuggestionRepository$showSuggest$1) {
                scootersSuperPassesUpsaleSuggestionRepository$showSuggest$1 = (ScootersSuperPassesUpsaleSuggestionRepository$showSuggest$1) continuationImpl;
                int i2 = scootersSuperPassesUpsaleSuggestionRepository$showSuggest$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    scootersSuperPassesUpsaleSuggestionRepository$showSuggest$1.label = i2 - Integer.MIN_VALUE;
                    obj = scootersSuperPassesUpsaleSuggestionRepository$showSuggest$1.result;
                    obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = scootersSuperPassesUpsaleSuggestionRepository$showSuggest$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        scootersSuperPassesUpsaleSuggestionRepository$showSuggest$1.L$0 = str;
                        scootersSuperPassesUpsaleSuggestionRepository$showSuggest$1.L$1 = list;
                        kotlinx.coroutines.sync.a aVar = this.c;
                        scootersSuperPassesUpsaleSuggestionRepository$showSuggest$1.L$2 = aVar;
                        scootersSuperPassesUpsaleSuggestionRepository$showSuggest$1.label = 1;
                        if (aVar.a(scootersSuperPassesUpsaleSuggestionRepository$showSuggest$1) != obj2) {
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
                        g050Var2 = (g050) scootersSuperPassesUpsaleSuggestionRepository$showSuggest$1.L$2;
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
                    g050Var = (g050) scootersSuperPassesUpsaleSuggestionRepository$showSuggest$1.L$2;
                    list = (List) scootersSuperPassesUpsaleSuggestionRepository$showSuggest$1.L$1;
                    str2 = (String) scootersSuperPassesUpsaleSuggestionRepository$showSuggest$1.L$0;
                    kotlin.b.b(obj);
                    scootersSuperPassesUpsaleSuggestionRepository$showSuggest$1.L$0 = null;
                    scootersSuperPassesUpsaleSuggestionRepository$showSuggest$1.L$1 = null;
                    scootersSuperPassesUpsaleSuggestionRepository$showSuggest$1.L$2 = g050Var;
                    scootersSuperPassesUpsaleSuggestionRepository$showSuggest$1.label = 2;
                    obj = d(str2, list, scootersSuperPassesUpsaleSuggestionRepository$showSuggest$1);
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
            scootersSuperPassesUpsaleSuggestionRepository$showSuggest$1.L$0 = null;
            scootersSuperPassesUpsaleSuggestionRepository$showSuggest$1.L$1 = null;
            scootersSuperPassesUpsaleSuggestionRepository$showSuggest$1.L$2 = g050Var;
            scootersSuperPassesUpsaleSuggestionRepository$showSuggest$1.label = 2;
            obj = d(str2, list, scootersSuperPassesUpsaleSuggestionRepository$showSuggest$1);
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
        scootersSuperPassesUpsaleSuggestionRepository$showSuggest$1 = new ScootersSuperPassesUpsaleSuggestionRepository$showSuggest$1(this, continuationImpl);
        obj = scootersSuperPassesUpsaleSuggestionRepository$showSuggest$1.result;
        obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersSuperPassesUpsaleSuggestionRepository$showSuggest$1.label;
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
        ScootersSuperPassesUpsaleSuggestionRepository$showSuggestWithId$1 scootersSuperPassesUpsaleSuggestionRepository$showSuggestWithId$1;
        int i;
        Long l;
        List list2;
        Long l2;
        if (continuationImpl instanceof ScootersSuperPassesUpsaleSuggestionRepository$showSuggestWithId$1) {
            scootersSuperPassesUpsaleSuggestionRepository$showSuggestWithId$1 = (ScootersSuperPassesUpsaleSuggestionRepository$showSuggestWithId$1) continuationImpl;
            int i2 = scootersSuperPassesUpsaleSuggestionRepository$showSuggestWithId$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersSuperPassesUpsaleSuggestionRepository$showSuggestWithId$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersSuperPassesUpsaleSuggestionRepository$showSuggestWithId$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersSuperPassesUpsaleSuggestionRepository$showSuggestWithId$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (jl40.l(this.d, str)) {
                        return Boolean.FALSE;
                    }
                    com.yandex.go.utils.storage.json.a aVar = this.b;
                    scootersSuperPassesUpsaleSuggestionRepository$showSuggestWithId$1.L$0 = str;
                    scootersSuperPassesUpsaleSuggestionRepository$showSuggestWithId$1.L$1 = list;
                    scootersSuperPassesUpsaleSuggestionRepository$showSuggestWithId$1.label = 1;
                    obj = aVar.a(scootersSuperPassesUpsaleSuggestionRepository$showSuggestWithId$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        l2 = (Long) scootersSuperPassesUpsaleSuggestionRepository$showSuggestWithId$1.L$3;
                        list2 = (List) scootersSuperPassesUpsaleSuggestionRepository$showSuggestWithId$1.L$1;
                        kotlin.b.b(obj);
                        l = l2;
                        list = list2;
                        return Boolean.valueOf(list.contains(new Long(l != null ? l.longValue() : 0L)));
                    }
                    list = (List) scootersSuperPassesUpsaleSuggestionRepository$showSuggestWithId$1.L$1;
                    str = (String) scootersSuperPassesUpsaleSuggestionRepository$showSuggestWithId$1.L$0;
                    kotlin.b.b(obj);
                }
                Map map = (Map) obj;
                l = (Long) map.get(str);
                if (l == null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                    linkedHashMap.put(str, new Long(0L));
                    com.yandex.go.utils.storage.json.a aVar2 = this.b;
                    scootersSuperPassesUpsaleSuggestionRepository$showSuggestWithId$1.L$0 = null;
                    scootersSuperPassesUpsaleSuggestionRepository$showSuggestWithId$1.L$1 = list;
                    scootersSuperPassesUpsaleSuggestionRepository$showSuggestWithId$1.L$2 = null;
                    scootersSuperPassesUpsaleSuggestionRepository$showSuggestWithId$1.L$3 = l;
                    scootersSuperPassesUpsaleSuggestionRepository$showSuggestWithId$1.L$4 = null;
                    scootersSuperPassesUpsaleSuggestionRepository$showSuggestWithId$1.label = 2;
                    if (aVar2.d(linkedHashMap, scootersSuperPassesUpsaleSuggestionRepository$showSuggestWithId$1) != coroutineSingletons) {
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
        scootersSuperPassesUpsaleSuggestionRepository$showSuggestWithId$1 = new ScootersSuperPassesUpsaleSuggestionRepository$showSuggestWithId$1(this, continuationImpl);
        Object obj2 = scootersSuperPassesUpsaleSuggestionRepository$showSuggestWithId$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersSuperPassesUpsaleSuggestionRepository$showSuggestWithId$1.label;
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
        ScootersSuperPassesUpsaleSuggestionRepository$suggestionShown$1 scootersSuperPassesUpsaleSuggestionRepository$suggestionShown$1;
        int i;
        kotlinx.coroutines.sync.a aVar;
        try {
            if (continuationImpl instanceof ScootersSuperPassesUpsaleSuggestionRepository$suggestionShown$1) {
                scootersSuperPassesUpsaleSuggestionRepository$suggestionShown$1 = (ScootersSuperPassesUpsaleSuggestionRepository$suggestionShown$1) continuationImpl;
                int i2 = scootersSuperPassesUpsaleSuggestionRepository$suggestionShown$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    scootersSuperPassesUpsaleSuggestionRepository$suggestionShown$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = scootersSuperPassesUpsaleSuggestionRepository$suggestionShown$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = scootersSuperPassesUpsaleSuggestionRepository$suggestionShown$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        aVar = this.c;
                        scootersSuperPassesUpsaleSuggestionRepository$suggestionShown$1.L$0 = str;
                        scootersSuperPassesUpsaleSuggestionRepository$suggestionShown$1.L$1 = aVar;
                        scootersSuperPassesUpsaleSuggestionRepository$suggestionShown$1.label = 1;
                        if (aVar.a(scootersSuperPassesUpsaleSuggestionRepository$suggestionShown$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ?? r6 = (g050) scootersSuperPassesUpsaleSuggestionRepository$suggestionShown$1.L$1;
                        String str2 = (String) scootersSuperPassesUpsaleSuggestionRepository$suggestionShown$1.L$0;
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
        scootersSuperPassesUpsaleSuggestionRepository$suggestionShown$1 = new ScootersSuperPassesUpsaleSuggestionRepository$suggestionShown$1(this, continuationImpl);
        Object obj2 = scootersSuperPassesUpsaleSuggestionRepository$suggestionShown$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersSuperPassesUpsaleSuggestionRepository$suggestionShown$1.label;
        if (i != 0) {
        }
    }
}
