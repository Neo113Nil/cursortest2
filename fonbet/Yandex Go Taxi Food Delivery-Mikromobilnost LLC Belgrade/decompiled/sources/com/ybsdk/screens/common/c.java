package com.ybsdk.screens.common;

import com.ybsdk.common.entities.ApplicationTypeEntity;
import com.ybsdk.common.entities.SessionApplicationEntity;
import defpackage.acu;
import defpackage.d1e0;
import defpackage.ey4;
import defpackage.k03;
import defpackage.ny61;
import defpackage.pvn;
import defpackage.tpr;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class c {
    public final k03 a;

    public c(k03 k03Var) {
        this.a = k03Var;
    }

    public final String a() {
        ApplicationTypeEntity applicationTypeEntity = ApplicationTypeEntity.SIMPLIFIED_IDENTIFICATION;
        ConcurrentHashMap concurrentHashMap = ((com.ybsdk.common.repositiories.applications.b) this.a).e;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            if (((SessionApplicationEntity) entry.getValue()).getType() == applicationTypeEntity) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((SessionApplicationEntity) ((Map.Entry) it.next()).getValue());
        }
        SessionApplicationEntity sessionApplicationEntity = (SessionApplicationEntity) kotlin.collections.a.R(arrayList);
        if (sessionApplicationEntity != null) {
            return sessionApplicationEntity.getApplicationId();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        SimplifiedIdApplicationStatusProvider$pollApplicationFinalStatus$1 simplifiedIdApplicationStatusProvider$pollApplicationFinalStatus$1;
        int i;
        if (continuationImpl instanceof SimplifiedIdApplicationStatusProvider$pollApplicationFinalStatus$1) {
            simplifiedIdApplicationStatusProvider$pollApplicationFinalStatus$1 = (SimplifiedIdApplicationStatusProvider$pollApplicationFinalStatus$1) continuationImpl;
            int i2 = simplifiedIdApplicationStatusProvider$pollApplicationFinalStatus$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                simplifiedIdApplicationStatusProvider$pollApplicationFinalStatus$1.label = i2 - Integer.MIN_VALUE;
                Object obj = simplifiedIdApplicationStatusProvider$pollApplicationFinalStatus$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = simplifiedIdApplicationStatusProvider$pollApplicationFinalStatus$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String a = a();
                    if (a == null) {
                        return pvn.a;
                    }
                    d1e0 d1e0Var = d1e0.b;
                    simplifiedIdApplicationStatusProvider$pollApplicationFinalStatus$1.label = 1;
                    obj = ((com.ybsdk.common.repositiories.applications.b) this.a).f(a, d1e0Var, simplifiedIdApplicationStatusProvider$pollApplicationFinalStatus$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return new ey4(new acu((tpr) obj, 25), 20);
            }
        }
        simplifiedIdApplicationStatusProvider$pollApplicationFinalStatus$1 = new SimplifiedIdApplicationStatusProvider$pollApplicationFinalStatus$1(this, continuationImpl);
        Object obj2 = simplifiedIdApplicationStatusProvider$pollApplicationFinalStatus$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = simplifiedIdApplicationStatusProvider$pollApplicationFinalStatus$1.label;
        if (i != 0) {
        }
        return new ey4(new acu((tpr) obj2, 25), 20);
    }
}
