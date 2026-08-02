package com.yandex.mob.data;

import com.yandex.mob.datastore.f;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.pr20;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public abstract class d {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(f fVar, String str, ContinuationImpl continuationImpl) {
        MobSelectedProxiesStorageKt$selectedProxy$1 mobSelectedProxiesStorageKt$selectedProxy$1;
        int i;
        if (continuationImpl instanceof MobSelectedProxiesStorageKt$selectedProxy$1) {
            mobSelectedProxiesStorageKt$selectedProxy$1 = (MobSelectedProxiesStorageKt$selectedProxy$1) continuationImpl;
            int i2 = mobSelectedProxiesStorageKt$selectedProxy$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mobSelectedProxiesStorageKt$selectedProxy$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mobSelectedProxiesStorageKt$selectedProxy$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mobSelectedProxiesStorageKt$selectedProxy$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mobSelectedProxiesStorageKt$selectedProxy$1.L$0 = null;
                    mobSelectedProxiesStorageKt$selectedProxy$1.L$1 = str;
                    mobSelectedProxiesStorageKt$selectedProxy$1.label = 1;
                    obj = fVar.b(mobSelectedProxiesStorageKt$selectedProxy$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) mobSelectedProxiesStorageKt$selectedProxy$1.L$1;
                    kotlin.b.b(obj);
                }
                for (Object obj3 : (Iterable) obj) {
                    if (jl40.l(((pr20) obj3).a.a, str)) {
                        return obj3;
                    }
                }
                return null;
            }
        }
        mobSelectedProxiesStorageKt$selectedProxy$1 = new MobSelectedProxiesStorageKt$selectedProxy$1(continuationImpl);
        Object obj4 = mobSelectedProxiesStorageKt$selectedProxy$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mobSelectedProxiesStorageKt$selectedProxy$1.label;
        if (i != 0) {
        }
        while (r5.hasNext()) {
        }
        return null;
    }
}
