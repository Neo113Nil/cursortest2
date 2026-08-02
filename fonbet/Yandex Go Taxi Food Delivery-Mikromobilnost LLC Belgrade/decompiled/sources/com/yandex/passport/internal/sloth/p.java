package com.yandex.passport.internal.sloth;

import com.yandex.passport.internal.report.pd;
import defpackage.evu0;
import defpackage.gw00;
import defpackage.ny61;
import defpackage.tcc;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class p {
    public final com.yandex.passport.common.analytics.f a;
    public final com.yandex.passport.common.common.a b;
    public final com.yandex.passport.internal.report.g c;
    public final com.yandex.passport.internal.properties.p d;

    public p(com.yandex.passport.common.analytics.f fVar, com.yandex.passport.common.common.a aVar, com.yandex.passport.internal.report.g gVar, com.yandex.passport.internal.properties.p pVar) {
        this.a = fVar;
        this.b = aVar;
        this.c = gVar;
        this.d = pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0079 A[LOOP:0: B:14:0x0073->B:16:0x0079, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(ContinuationImpl continuationImpl) {
        SlothWebParamsProviderImpl$getSlothWebParams$1 slothWebParamsProviderImpl$getSlothWebParams$1;
        int i;
        int d;
        Iterator it;
        if (continuationImpl instanceof SlothWebParamsProviderImpl$getSlothWebParams$1) {
            slothWebParamsProviderImpl$getSlothWebParams$1 = (SlothWebParamsProviderImpl$getSlothWebParams$1) continuationImpl;
            int i2 = slothWebParamsProviderImpl$getSlothWebParams$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                slothWebParamsProviderImpl$getSlothWebParams$1.label = i2 - Integer.MIN_VALUE;
                Object obj = slothWebParamsProviderImpl$getSlothWebParams$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = slothWebParamsProviderImpl$getSlothWebParams$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.passport.internal.common.e eVar = (com.yandex.passport.internal.common.e) this.b;
                    String a = eVar.a();
                    String b = eVar.b();
                    slothWebParamsProviderImpl$getSlothWebParams$1.L$0 = this;
                    slothWebParamsProviderImpl$getSlothWebParams$1.label = 1;
                    com.yandex.passport.common.analytics.f fVar = this.a;
                    fVar.getClass();
                    obj = com.yandex.passport.common.analytics.f.a(fVar, a, b, slothWebParamsProviderImpl$getSlothWebParams$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (p) slothWebParamsProviderImpl$getSlothWebParams$1.L$0;
                    kotlin.b.b(obj);
                }
                Map map = (Map) obj;
                com.yandex.passport.internal.report.g gVar = this.c;
                com.yandex.passport.internal.properties.p pVar = this.d;
                ArrayList a2 = gVar.a();
                d = gw00.d(tcc.n(a2, 10));
                if (d < 16) {
                    d = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(d);
                it = a2.iterator();
                while (it.hasNext()) {
                    pd pdVar = (pd) it.next();
                    Pair pair = new Pair(pdVar.getName(), pdVar.getValue());
                    linkedHashMap.put(pair.c(), pair.f());
                }
                LinkedHashMap n = kotlin.collections.b.n(map, linkedHashMap);
                String str = pVar.t;
                return (str != null || evu0.J(str)) ? n : kotlin.collections.b.n(n, gw00.e(new Pair("origin", pVar.t)));
            }
        }
        slothWebParamsProviderImpl$getSlothWebParams$1 = new SlothWebParamsProviderImpl$getSlothWebParams$1(this, continuationImpl);
        Object obj2 = slothWebParamsProviderImpl$getSlothWebParams$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = slothWebParamsProviderImpl$getSlothWebParams$1.label;
        if (i != 0) {
        }
        Map map2 = (Map) obj2;
        com.yandex.passport.internal.report.g gVar2 = this.c;
        com.yandex.passport.internal.properties.p pVar2 = this.d;
        ArrayList a22 = gVar2.a();
        d = gw00.d(tcc.n(a22, 10));
        if (d < 16) {
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(d);
        it = a22.iterator();
        while (it.hasNext()) {
        }
        LinkedHashMap n2 = kotlin.collections.b.n(map2, linkedHashMap2);
        String str2 = pVar2.t;
        if (str2 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        SlothWebParamsProviderImpl$getUuid$1 slothWebParamsProviderImpl$getUuid$1;
        int i;
        Object f;
        if (continuationImpl instanceof SlothWebParamsProviderImpl$getUuid$1) {
            slothWebParamsProviderImpl$getUuid$1 = (SlothWebParamsProviderImpl$getUuid$1) continuationImpl;
            int i2 = slothWebParamsProviderImpl$getUuid$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                slothWebParamsProviderImpl$getUuid$1.label = i2 - Integer.MIN_VALUE;
                Object obj = slothWebParamsProviderImpl$getUuid$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = slothWebParamsProviderImpl$getUuid$1.label;
                if (i == 0) {
                    f = null;
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    com.yandex.passport.common.value.b bVar = (com.yandex.passport.common.value.b) obj;
                    if (bVar != null) {
                        f = bVar.a;
                    }
                } else {
                    kotlin.b.b(obj);
                    slothWebParamsProviderImpl$getUuid$1.label = 1;
                    com.yandex.passport.common.analytics.f fVar = this.a;
                    fVar.getClass();
                    f = com.yandex.passport.common.analytics.f.f(fVar, slothWebParamsProviderImpl$getUuid$1);
                    if (f == obj2) {
                        return obj2;
                    }
                }
                return (String) f;
            }
        }
        slothWebParamsProviderImpl$getUuid$1 = new SlothWebParamsProviderImpl$getUuid$1(this, continuationImpl);
        Object obj3 = slothWebParamsProviderImpl$getUuid$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = slothWebParamsProviderImpl$getUuid$1.label;
        if (i == 0) {
        }
        return (String) f;
    }
}
