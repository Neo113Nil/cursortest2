package com.yandex.go.scooters.insurance.data;

import defpackage.am2;
import defpackage.auu0;
import defpackage.eex;
import defpackage.g050;
import defpackage.gtq0;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.z96;
import defpackage.zy11;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class a {
    public final com.yandex.go.utils.storage.json.a a;
    public final kotlinx.coroutines.sync.a b;

    public a(eex eexVar) {
        am2 am2Var = new am2("scooters", "insurance_disable_suggest", kotlin.collections.b.f());
        auu0 auu0Var = auu0.a;
        this.a = eexVar.b(am2Var, z96.a);
        this.b = gtq0.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        ScootersInsuranceDisableSuggestionRepository$markAsShown$1 scootersInsuranceDisableSuggestionRepository$markAsShown$1;
        int i;
        if (continuationImpl instanceof ScootersInsuranceDisableSuggestionRepository$markAsShown$1) {
            scootersInsuranceDisableSuggestionRepository$markAsShown$1 = (ScootersInsuranceDisableSuggestionRepository$markAsShown$1) continuationImpl;
            int i2 = scootersInsuranceDisableSuggestionRepository$markAsShown$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersInsuranceDisableSuggestionRepository$markAsShown$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersInsuranceDisableSuggestionRepository$markAsShown$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersInsuranceDisableSuggestionRepository$markAsShown$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersInsuranceDisableSuggestionRepository$markAsShown$1.L$0 = null;
                    scootersInsuranceDisableSuggestionRepository$markAsShown$1.label = 1;
                    if (c(str, scootersInsuranceDisableSuggestionRepository$markAsShown$1) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        scootersInsuranceDisableSuggestionRepository$markAsShown$1 = new ScootersInsuranceDisableSuggestionRepository$markAsShown$1(this, continuationImpl);
        Object obj3 = scootersInsuranceDisableSuggestionRepository$markAsShown$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersInsuranceDisableSuggestionRepository$markAsShown$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        ScootersInsuranceDisableSuggestionRepository$shouldShow$1 scootersInsuranceDisableSuggestionRepository$shouldShow$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        String str2;
        g050 g050Var;
        Throwable th;
        g050 g050Var2;
        String str3;
        try {
            if (continuationImpl instanceof ScootersInsuranceDisableSuggestionRepository$shouldShow$1) {
                scootersInsuranceDisableSuggestionRepository$shouldShow$1 = (ScootersInsuranceDisableSuggestionRepository$shouldShow$1) continuationImpl;
                int i2 = scootersInsuranceDisableSuggestionRepository$shouldShow$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    scootersInsuranceDisableSuggestionRepository$shouldShow$1.label = i2 - Integer.MIN_VALUE;
                    obj = scootersInsuranceDisableSuggestionRepository$shouldShow$1.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = scootersInsuranceDisableSuggestionRepository$shouldShow$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        scootersInsuranceDisableSuggestionRepository$shouldShow$1.L$0 = str;
                        kotlinx.coroutines.sync.a aVar = this.b;
                        scootersInsuranceDisableSuggestionRepository$shouldShow$1.L$1 = aVar;
                        scootersInsuranceDisableSuggestionRepository$shouldShow$1.label = 1;
                        if (aVar.a(scootersInsuranceDisableSuggestionRepository$shouldShow$1) != coroutineSingletons) {
                            str2 = str;
                            g050Var = aVar;
                        }
                        return coroutineSingletons;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g050Var2 = (g050) scootersInsuranceDisableSuggestionRepository$shouldShow$1.L$1;
                        str3 = (String) scootersInsuranceDisableSuggestionRepository$shouldShow$1.L$0;
                        try {
                            kotlin.b.b(obj);
                            Boolean valueOf = Boolean.valueOf(!jl40.l(((Map) obj).get(str3), Boolean.TRUE));
                            g050Var2.d(null);
                            return valueOf;
                        } catch (Throwable th2) {
                            th = th2;
                            g050Var2.d(null);
                            throw th;
                        }
                    }
                    g050Var = (g050) scootersInsuranceDisableSuggestionRepository$shouldShow$1.L$1;
                    str2 = (String) scootersInsuranceDisableSuggestionRepository$shouldShow$1.L$0;
                    kotlin.b.b(obj);
                    com.yandex.go.utils.storage.json.a aVar2 = this.a;
                    scootersInsuranceDisableSuggestionRepository$shouldShow$1.L$0 = str2;
                    scootersInsuranceDisableSuggestionRepository$shouldShow$1.L$1 = g050Var;
                    scootersInsuranceDisableSuggestionRepository$shouldShow$1.label = 2;
                    obj = aVar2.a(scootersInsuranceDisableSuggestionRepository$shouldShow$1);
                    if (obj != coroutineSingletons) {
                        g050Var2 = g050Var;
                        str3 = str2;
                        Boolean valueOf2 = Boolean.valueOf(!jl40.l(((Map) obj).get(str3), Boolean.TRUE));
                        g050Var2.d(null);
                        return valueOf2;
                    }
                    return coroutineSingletons;
                }
            }
            com.yandex.go.utils.storage.json.a aVar22 = this.a;
            scootersInsuranceDisableSuggestionRepository$shouldShow$1.L$0 = str2;
            scootersInsuranceDisableSuggestionRepository$shouldShow$1.L$1 = g050Var;
            scootersInsuranceDisableSuggestionRepository$shouldShow$1.label = 2;
            obj = aVar22.a(scootersInsuranceDisableSuggestionRepository$shouldShow$1);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        } catch (Throwable th3) {
            g050 g050Var3 = g050Var;
            th = th3;
            g050Var2 = g050Var3;
            g050Var2.d(null);
            throw th;
        }
        scootersInsuranceDisableSuggestionRepository$shouldShow$1 = new ScootersInsuranceDisableSuggestionRepository$shouldShow$1(this, continuationImpl);
        obj = scootersInsuranceDisableSuggestionRepository$shouldShow$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersInsuranceDisableSuggestionRepository$shouldShow$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x009f, code lost:
    
        if (r3.d(r2, r0) == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006b, code lost:
    
        if (r10 == r1) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008b A[Catch: all -> 0x003c, TryCatch #0 {all -> 0x003c, blocks: (B:13:0x0038, B:14:0x00a2, B:22:0x004c, B:23:0x007b, B:26:0x008b, B:30:0x006e), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.yandex.go.scooters.insurance.data.a] */
    /* JADX WARN: Type inference failed for: r8v1, types: [g050] */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v5, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, ContinuationImpl continuationImpl) {
        ScootersInsuranceDisableSuggestionRepository$tryShow$1 scootersInsuranceDisableSuggestionRepository$tryShow$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        Object obj2;
        Object obj3;
        Object obj4;
        Boolean bool;
        try {
            if (continuationImpl instanceof ScootersInsuranceDisableSuggestionRepository$tryShow$1) {
                scootersInsuranceDisableSuggestionRepository$tryShow$1 = (ScootersInsuranceDisableSuggestionRepository$tryShow$1) continuationImpl;
                int i2 = scootersInsuranceDisableSuggestionRepository$tryShow$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    scootersInsuranceDisableSuggestionRepository$tryShow$1.label = i2 - Integer.MIN_VALUE;
                    obj = scootersInsuranceDisableSuggestionRepository$tryShow$1.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = scootersInsuranceDisableSuggestionRepository$tryShow$1.label;
                    com.yandex.go.utils.storage.json.a aVar = this.a;
                    boolean z = true;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        scootersInsuranceDisableSuggestionRepository$tryShow$1.L$0 = str;
                        kotlinx.coroutines.sync.a aVar2 = this.b;
                        scootersInsuranceDisableSuggestionRepository$tryShow$1.L$1 = aVar2;
                        scootersInsuranceDisableSuggestionRepository$tryShow$1.label = 1;
                        Object a = aVar2.a(scootersInsuranceDisableSuggestionRepository$tryShow$1);
                        obj2 = aVar2;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                g050 g050Var = (g050) scootersInsuranceDisableSuggestionRepository$tryShow$1.L$1;
                                kotlin.b.b(obj);
                                this = g050Var;
                                return Boolean.valueOf(z);
                            }
                            Object obj5 = (g050) scootersInsuranceDisableSuggestionRepository$tryShow$1.L$1;
                            str = (String) scootersInsuranceDisableSuggestionRepository$tryShow$1.L$0;
                            kotlin.b.b(obj);
                            obj3 = obj5;
                            Map map = (Map) obj;
                            obj4 = map.get(str);
                            bool = Boolean.TRUE;
                            if (jl40.l(obj4, bool)) {
                                z = false;
                                this = obj3;
                            } else {
                                LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                                linkedHashMap.put(str, bool);
                                scootersInsuranceDisableSuggestionRepository$tryShow$1.L$0 = null;
                                scootersInsuranceDisableSuggestionRepository$tryShow$1.L$1 = obj3;
                                scootersInsuranceDisableSuggestionRepository$tryShow$1.L$2 = null;
                                scootersInsuranceDisableSuggestionRepository$tryShow$1.label = 3;
                                this = obj3;
                            }
                            return Boolean.valueOf(z);
                        }
                        Object obj6 = (g050) scootersInsuranceDisableSuggestionRepository$tryShow$1.L$1;
                        str = (String) scootersInsuranceDisableSuggestionRepository$tryShow$1.L$0;
                        kotlin.b.b(obj);
                        obj2 = obj6;
                    }
                    scootersInsuranceDisableSuggestionRepository$tryShow$1.L$0 = str;
                    scootersInsuranceDisableSuggestionRepository$tryShow$1.L$1 = obj2;
                    scootersInsuranceDisableSuggestionRepository$tryShow$1.label = 2;
                    obj = aVar.a(scootersInsuranceDisableSuggestionRepository$tryShow$1);
                    obj3 = obj2;
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    Map map2 = (Map) obj;
                    obj4 = map2.get(str);
                    bool = Boolean.TRUE;
                    if (jl40.l(obj4, bool)) {
                    }
                    return Boolean.valueOf(z);
                }
            }
            if (i != 0) {
            }
            scootersInsuranceDisableSuggestionRepository$tryShow$1.L$0 = str;
            scootersInsuranceDisableSuggestionRepository$tryShow$1.L$1 = obj2;
            scootersInsuranceDisableSuggestionRepository$tryShow$1.label = 2;
            obj = aVar.a(scootersInsuranceDisableSuggestionRepository$tryShow$1);
            obj3 = obj2;
            if (obj == coroutineSingletons) {
            }
            Map map22 = (Map) obj;
            obj4 = map22.get(str);
            bool = Boolean.TRUE;
            if (jl40.l(obj4, bool)) {
            }
            return Boolean.valueOf(z);
        } finally {
            this.d(null);
        }
        scootersInsuranceDisableSuggestionRepository$tryShow$1 = new ScootersInsuranceDisableSuggestionRepository$tryShow$1(this, continuationImpl);
        obj = scootersInsuranceDisableSuggestionRepository$tryShow$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersInsuranceDisableSuggestionRepository$tryShow$1.label;
        com.yandex.go.utils.storage.json.a aVar3 = this.a;
        boolean z2 = true;
    }
}
