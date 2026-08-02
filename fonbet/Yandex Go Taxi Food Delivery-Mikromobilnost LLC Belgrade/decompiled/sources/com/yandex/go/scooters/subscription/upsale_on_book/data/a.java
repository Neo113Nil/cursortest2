package com.yandex.go.scooters.subscription.upsale_on_book.data;

import com.yandex.go.scooters.subscription.upsale_on_book.data.model.ScootersSubscriptionUpsaleOnBookExperiment;
import defpackage.am2;
import defpackage.auu0;
import defpackage.dzo0;
import defpackage.eex;
import defpackage.g050;
import defpackage.gtq0;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.pnz;
import defpackage.two0;
import defpackage.zy11;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class a {
    public final dzo0 a;
    public final com.yandex.go.utils.storage.json.a b;
    public final kotlinx.coroutines.sync.a c;
    public volatile String d;

    public a(eex eexVar, dzo0 dzo0Var) {
        this.a = dzo0Var;
        am2 am2Var = new am2("scooters", "subscription_upsale_on_book", b.f());
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
        ScootersSubscriptionUpsaleSuggestionRepository$incRidesCount$1 scootersSubscriptionUpsaleSuggestionRepository$incRidesCount$1;
        int i;
        Long l;
        if (continuationImpl instanceof ScootersSubscriptionUpsaleSuggestionRepository$incRidesCount$1) {
            scootersSubscriptionUpsaleSuggestionRepository$incRidesCount$1 = (ScootersSubscriptionUpsaleSuggestionRepository$incRidesCount$1) continuationImpl;
            int i2 = scootersSubscriptionUpsaleSuggestionRepository$incRidesCount$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersSubscriptionUpsaleSuggestionRepository$incRidesCount$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersSubscriptionUpsaleSuggestionRepository$incRidesCount$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersSubscriptionUpsaleSuggestionRepository$incRidesCount$1.label;
                zy11 zy11Var = zy11.a;
                com.yandex.go.utils.storage.json.a aVar = this.b;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersSubscriptionUpsaleSuggestionRepository$incRidesCount$1.L$0 = str;
                    scootersSubscriptionUpsaleSuggestionRepository$incRidesCount$1.label = 1;
                    obj = aVar.a(scootersSubscriptionUpsaleSuggestionRepository$incRidesCount$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return zy11Var;
                    }
                    str = (String) scootersSubscriptionUpsaleSuggestionRepository$incRidesCount$1.L$0;
                    kotlin.b.b(obj);
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap((Map) obj);
                l = (Long) linkedHashMap.get(str);
                if (l != null) {
                    long longValue = l.longValue();
                    linkedHashMap.put(str, new Long(1 + longValue));
                    scootersSubscriptionUpsaleSuggestionRepository$incRidesCount$1.L$0 = null;
                    scootersSubscriptionUpsaleSuggestionRepository$incRidesCount$1.L$1 = null;
                    scootersSubscriptionUpsaleSuggestionRepository$incRidesCount$1.J$0 = longValue;
                    scootersSubscriptionUpsaleSuggestionRepository$incRidesCount$1.label = 2;
                    if (aVar.d(linkedHashMap, scootersSubscriptionUpsaleSuggestionRepository$incRidesCount$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return zy11Var;
            }
        }
        scootersSubscriptionUpsaleSuggestionRepository$incRidesCount$1 = new ScootersSubscriptionUpsaleSuggestionRepository$incRidesCount$1(this, continuationImpl);
        Object obj2 = scootersSubscriptionUpsaleSuggestionRepository$incRidesCount$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersSubscriptionUpsaleSuggestionRepository$incRidesCount$1.label;
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

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(1:(1:(5:16|17|18|19|20)(2:13|14))(7:22|23|24|(5:26|(2:28|29)|18|19|20)(5:30|(2:32|(2:34|(1:36)))|18|19|20)|50|46|47))(1:38))(1:48)|39|40|(6:42|24|(0)(0)|50|46|47)|29))|51|6|7|(0)(0)|39|40|(0)|29) */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c5, code lost:
    
        if (a(r11, r0) == r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d2, code lost:
    
        r9 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d0, code lost:
    
        r10 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0074, code lost:
    
        if (r11.a(r0) == r1) goto L45;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0092 A[Catch: all -> 0x0042, TryCatch #1 {all -> 0x0042, blocks: (B:17:0x003d, B:18:0x00c8, B:23:0x0053, B:24:0x008c, B:26:0x0092, B:30:0x00a3, B:32:0x00a7, B:34:0x00af, B:36:0x00b5), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a3 A[Catch: all -> 0x0042, TryCatch #1 {all -> 0x0042, blocks: (B:17:0x003d, B:18:0x00c8, B:23:0x0053, B:24:0x008c, B:26:0x0092, B:30:0x00a3, B:32:0x00a7, B:34:0x00af, B:36:0x00b5), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, two0] */
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
    /* JADX WARN: Type inference failed for: r9v0, types: [com.yandex.go.scooters.subscription.upsale_on_book.data.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(two0 two0Var, ContinuationImpl continuationImpl) {
        ScootersSubscriptionUpsaleSuggestionRepository$offerBooked$1 scootersSubscriptionUpsaleSuggestionRepository$offerBooked$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        kotlinx.coroutines.sync.a aVar;
        two0 two0Var2;
        Object b;
        two0 two0Var3;
        Object obj;
        String str;
        if (continuationImpl instanceof ScootersSubscriptionUpsaleSuggestionRepository$offerBooked$1) {
            scootersSubscriptionUpsaleSuggestionRepository$offerBooked$1 = (ScootersSubscriptionUpsaleSuggestionRepository$offerBooked$1) continuationImpl;
            int i2 = scootersSubscriptionUpsaleSuggestionRepository$offerBooked$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersSubscriptionUpsaleSuggestionRepository$offerBooked$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = scootersSubscriptionUpsaleSuggestionRepository$offerBooked$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersSubscriptionUpsaleSuggestionRepository$offerBooked$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    aVar = this.c;
                    scootersSubscriptionUpsaleSuggestionRepository$offerBooked$1.L$0 = two0Var;
                    scootersSubscriptionUpsaleSuggestionRepository$offerBooked$1.L$1 = aVar;
                    scootersSubscriptionUpsaleSuggestionRepository$offerBooked$1.label = 1;
                    two0Var2 = two0Var;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3 && i != 4) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            g050 g050Var = (g050) scootersSubscriptionUpsaleSuggestionRepository$offerBooked$1.L$1;
                            kotlin.b.b(obj2);
                            two0Var = g050Var;
                            this.d = null;
                            two0Var.d(null);
                            return zy11.a;
                        }
                        Object obj3 = (g050) scootersSubscriptionUpsaleSuggestionRepository$offerBooked$1.L$1;
                        two0Var3 = (two0) scootersSubscriptionUpsaleSuggestionRepository$offerBooked$1.L$0;
                        kotlin.b.b(obj2);
                        obj = obj3;
                        ScootersSubscriptionUpsaleOnBookExperiment scootersSubscriptionUpsaleOnBookExperiment = (ScootersSubscriptionUpsaleOnBookExperiment) obj2;
                        str = this.d;
                        if (str == null) {
                            scootersSubscriptionUpsaleSuggestionRepository$offerBooked$1.L$0 = null;
                            scootersSubscriptionUpsaleSuggestionRepository$offerBooked$1.L$1 = obj;
                            scootersSubscriptionUpsaleSuggestionRepository$offerBooked$1.L$2 = null;
                            scootersSubscriptionUpsaleSuggestionRepository$offerBooked$1.L$3 = null;
                            scootersSubscriptionUpsaleSuggestionRepository$offerBooked$1.label = 3;
                            two0Var = obj;
                            if (a(str, scootersSubscriptionUpsaleSuggestionRepository$offerBooked$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            this.d = null;
                            two0Var.d(null);
                            return zy11.a;
                        }
                        two0Var = obj;
                        if (scootersSubscriptionUpsaleOnBookExperiment.b) {
                            two0Var = obj;
                            if (scootersSubscriptionUpsaleOnBookExperiment.c.length() > 0) {
                                two0Var = obj;
                                if (two0Var3.a() != null) {
                                    String str2 = scootersSubscriptionUpsaleOnBookExperiment.c;
                                    scootersSubscriptionUpsaleSuggestionRepository$offerBooked$1.L$0 = null;
                                    scootersSubscriptionUpsaleSuggestionRepository$offerBooked$1.L$1 = obj;
                                    scootersSubscriptionUpsaleSuggestionRepository$offerBooked$1.L$2 = null;
                                    scootersSubscriptionUpsaleSuggestionRepository$offerBooked$1.L$3 = null;
                                    scootersSubscriptionUpsaleSuggestionRepository$offerBooked$1.label = 4;
                                    two0Var = obj;
                                }
                            }
                        }
                        this.d = null;
                        two0Var.d(null);
                        return zy11.a;
                        th = th;
                        two0Var.d(null);
                        throw th;
                    }
                    ?? r10 = (g050) scootersSubscriptionUpsaleSuggestionRepository$offerBooked$1.L$1;
                    two0 two0Var4 = (two0) scootersSubscriptionUpsaleSuggestionRepository$offerBooked$1.L$0;
                    kotlin.b.b(obj2);
                    aVar = r10;
                    two0Var2 = two0Var4;
                }
                dzo0 dzo0Var = this.a;
                scootersSubscriptionUpsaleSuggestionRepository$offerBooked$1.L$0 = two0Var2;
                scootersSubscriptionUpsaleSuggestionRepository$offerBooked$1.L$1 = aVar;
                scootersSubscriptionUpsaleSuggestionRepository$offerBooked$1.label = 2;
                b = dzo0Var.a.b(scootersSubscriptionUpsaleSuggestionRepository$offerBooked$1);
                if (b != coroutineSingletons) {
                    two0Var3 = two0Var2;
                    obj = aVar;
                    obj2 = b;
                    ScootersSubscriptionUpsaleOnBookExperiment scootersSubscriptionUpsaleOnBookExperiment2 = (ScootersSubscriptionUpsaleOnBookExperiment) obj2;
                    str = this.d;
                    if (str == null) {
                    }
                    th = th;
                    two0Var.d(null);
                    throw th;
                }
                return coroutineSingletons;
            }
        }
        scootersSubscriptionUpsaleSuggestionRepository$offerBooked$1 = new ScootersSubscriptionUpsaleSuggestionRepository$offerBooked$1(this, continuationImpl);
        Object obj22 = scootersSubscriptionUpsaleSuggestionRepository$offerBooked$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersSubscriptionUpsaleSuggestionRepository$offerBooked$1.label;
        if (i != 0) {
        }
        dzo0 dzo0Var2 = this.a;
        scootersSubscriptionUpsaleSuggestionRepository$offerBooked$1.L$0 = two0Var2;
        scootersSubscriptionUpsaleSuggestionRepository$offerBooked$1.L$1 = aVar;
        scootersSubscriptionUpsaleSuggestionRepository$offerBooked$1.label = 2;
        b = dzo0Var2.a.b(scootersSubscriptionUpsaleSuggestionRepository$offerBooked$1);
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
        ScootersSubscriptionUpsaleSuggestionRepository$showSuggest$1 scootersSubscriptionUpsaleSuggestionRepository$showSuggest$1;
        Object obj;
        Object obj2;
        int i;
        String str2;
        g050 g050Var;
        Throwable th;
        g050 g050Var2;
        try {
            if (continuationImpl instanceof ScootersSubscriptionUpsaleSuggestionRepository$showSuggest$1) {
                scootersSubscriptionUpsaleSuggestionRepository$showSuggest$1 = (ScootersSubscriptionUpsaleSuggestionRepository$showSuggest$1) continuationImpl;
                int i2 = scootersSubscriptionUpsaleSuggestionRepository$showSuggest$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    scootersSubscriptionUpsaleSuggestionRepository$showSuggest$1.label = i2 - Integer.MIN_VALUE;
                    obj = scootersSubscriptionUpsaleSuggestionRepository$showSuggest$1.result;
                    obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = scootersSubscriptionUpsaleSuggestionRepository$showSuggest$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        scootersSubscriptionUpsaleSuggestionRepository$showSuggest$1.L$0 = str;
                        scootersSubscriptionUpsaleSuggestionRepository$showSuggest$1.L$1 = list;
                        kotlinx.coroutines.sync.a aVar = this.c;
                        scootersSubscriptionUpsaleSuggestionRepository$showSuggest$1.L$2 = aVar;
                        scootersSubscriptionUpsaleSuggestionRepository$showSuggest$1.label = 1;
                        if (aVar.a(scootersSubscriptionUpsaleSuggestionRepository$showSuggest$1) != obj2) {
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
                        g050Var2 = (g050) scootersSubscriptionUpsaleSuggestionRepository$showSuggest$1.L$2;
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
                    g050Var = (g050) scootersSubscriptionUpsaleSuggestionRepository$showSuggest$1.L$2;
                    list = (List) scootersSubscriptionUpsaleSuggestionRepository$showSuggest$1.L$1;
                    str2 = (String) scootersSubscriptionUpsaleSuggestionRepository$showSuggest$1.L$0;
                    kotlin.b.b(obj);
                    scootersSubscriptionUpsaleSuggestionRepository$showSuggest$1.L$0 = null;
                    scootersSubscriptionUpsaleSuggestionRepository$showSuggest$1.L$1 = null;
                    scootersSubscriptionUpsaleSuggestionRepository$showSuggest$1.L$2 = g050Var;
                    scootersSubscriptionUpsaleSuggestionRepository$showSuggest$1.label = 2;
                    obj = d(str2, list, scootersSubscriptionUpsaleSuggestionRepository$showSuggest$1);
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
            scootersSubscriptionUpsaleSuggestionRepository$showSuggest$1.L$0 = null;
            scootersSubscriptionUpsaleSuggestionRepository$showSuggest$1.L$1 = null;
            scootersSubscriptionUpsaleSuggestionRepository$showSuggest$1.L$2 = g050Var;
            scootersSubscriptionUpsaleSuggestionRepository$showSuggest$1.label = 2;
            obj = d(str2, list, scootersSubscriptionUpsaleSuggestionRepository$showSuggest$1);
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
        scootersSubscriptionUpsaleSuggestionRepository$showSuggest$1 = new ScootersSubscriptionUpsaleSuggestionRepository$showSuggest$1(this, continuationImpl);
        obj = scootersSubscriptionUpsaleSuggestionRepository$showSuggest$1.result;
        obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersSubscriptionUpsaleSuggestionRepository$showSuggest$1.label;
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
        ScootersSubscriptionUpsaleSuggestionRepository$showSuggestWithId$1 scootersSubscriptionUpsaleSuggestionRepository$showSuggestWithId$1;
        int i;
        Long l;
        List list2;
        Long l2;
        if (continuationImpl instanceof ScootersSubscriptionUpsaleSuggestionRepository$showSuggestWithId$1) {
            scootersSubscriptionUpsaleSuggestionRepository$showSuggestWithId$1 = (ScootersSubscriptionUpsaleSuggestionRepository$showSuggestWithId$1) continuationImpl;
            int i2 = scootersSubscriptionUpsaleSuggestionRepository$showSuggestWithId$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersSubscriptionUpsaleSuggestionRepository$showSuggestWithId$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersSubscriptionUpsaleSuggestionRepository$showSuggestWithId$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersSubscriptionUpsaleSuggestionRepository$showSuggestWithId$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (jl40.l(this.d, str)) {
                        return Boolean.FALSE;
                    }
                    com.yandex.go.utils.storage.json.a aVar = this.b;
                    scootersSubscriptionUpsaleSuggestionRepository$showSuggestWithId$1.L$0 = str;
                    scootersSubscriptionUpsaleSuggestionRepository$showSuggestWithId$1.L$1 = list;
                    scootersSubscriptionUpsaleSuggestionRepository$showSuggestWithId$1.label = 1;
                    obj = aVar.a(scootersSubscriptionUpsaleSuggestionRepository$showSuggestWithId$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        l2 = (Long) scootersSubscriptionUpsaleSuggestionRepository$showSuggestWithId$1.L$3;
                        list2 = (List) scootersSubscriptionUpsaleSuggestionRepository$showSuggestWithId$1.L$1;
                        kotlin.b.b(obj);
                        l = l2;
                        list = list2;
                        return Boolean.valueOf(list.contains(new Long(l != null ? l.longValue() : 0L)));
                    }
                    list = (List) scootersSubscriptionUpsaleSuggestionRepository$showSuggestWithId$1.L$1;
                    str = (String) scootersSubscriptionUpsaleSuggestionRepository$showSuggestWithId$1.L$0;
                    kotlin.b.b(obj);
                }
                Map map = (Map) obj;
                l = (Long) map.get(str);
                if (l == null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                    linkedHashMap.put(str, new Long(0L));
                    com.yandex.go.utils.storage.json.a aVar2 = this.b;
                    scootersSubscriptionUpsaleSuggestionRepository$showSuggestWithId$1.L$0 = null;
                    scootersSubscriptionUpsaleSuggestionRepository$showSuggestWithId$1.L$1 = list;
                    scootersSubscriptionUpsaleSuggestionRepository$showSuggestWithId$1.L$2 = null;
                    scootersSubscriptionUpsaleSuggestionRepository$showSuggestWithId$1.L$3 = l;
                    scootersSubscriptionUpsaleSuggestionRepository$showSuggestWithId$1.L$4 = null;
                    scootersSubscriptionUpsaleSuggestionRepository$showSuggestWithId$1.label = 2;
                    if (aVar2.d(linkedHashMap, scootersSubscriptionUpsaleSuggestionRepository$showSuggestWithId$1) != coroutineSingletons) {
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
        scootersSubscriptionUpsaleSuggestionRepository$showSuggestWithId$1 = new ScootersSubscriptionUpsaleSuggestionRepository$showSuggestWithId$1(this, continuationImpl);
        Object obj2 = scootersSubscriptionUpsaleSuggestionRepository$showSuggestWithId$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersSubscriptionUpsaleSuggestionRepository$showSuggestWithId$1.label;
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
        ScootersSubscriptionUpsaleSuggestionRepository$suggestionShown$1 scootersSubscriptionUpsaleSuggestionRepository$suggestionShown$1;
        int i;
        kotlinx.coroutines.sync.a aVar;
        try {
            if (continuationImpl instanceof ScootersSubscriptionUpsaleSuggestionRepository$suggestionShown$1) {
                scootersSubscriptionUpsaleSuggestionRepository$suggestionShown$1 = (ScootersSubscriptionUpsaleSuggestionRepository$suggestionShown$1) continuationImpl;
                int i2 = scootersSubscriptionUpsaleSuggestionRepository$suggestionShown$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    scootersSubscriptionUpsaleSuggestionRepository$suggestionShown$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = scootersSubscriptionUpsaleSuggestionRepository$suggestionShown$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = scootersSubscriptionUpsaleSuggestionRepository$suggestionShown$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        aVar = this.c;
                        scootersSubscriptionUpsaleSuggestionRepository$suggestionShown$1.L$0 = str;
                        scootersSubscriptionUpsaleSuggestionRepository$suggestionShown$1.L$1 = aVar;
                        scootersSubscriptionUpsaleSuggestionRepository$suggestionShown$1.label = 1;
                        if (aVar.a(scootersSubscriptionUpsaleSuggestionRepository$suggestionShown$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ?? r6 = (g050) scootersSubscriptionUpsaleSuggestionRepository$suggestionShown$1.L$1;
                        String str2 = (String) scootersSubscriptionUpsaleSuggestionRepository$suggestionShown$1.L$0;
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
        scootersSubscriptionUpsaleSuggestionRepository$suggestionShown$1 = new ScootersSubscriptionUpsaleSuggestionRepository$suggestionShown$1(this, continuationImpl);
        Object obj2 = scootersSubscriptionUpsaleSuggestionRepository$suggestionShown$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersSubscriptionUpsaleSuggestionRepository$suggestionShown$1.label;
        if (i != 0) {
        }
    }
}
