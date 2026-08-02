package com.yandex.mob.datastore;

import defpackage.ny61;
import defpackage.tpg;
import defpackage.xr20;
import defpackage.zy11;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class f {
    public final tpg a;

    public f(tpg tpgVar) {
        this.a = tpgVar;
    }

    public final Object a(List list, ContinuationImpl continuationImpl) {
        Object c = a.c(this.a, new TypedMobSelectedProxiesStorage$saveSelectedProxies$2(list, null), continuationImpl);
        return c == CoroutineSingletons.COROUTINE_SUSPENDED ? c : zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        TypedMobSelectedProxiesStorage$selectedProxies$1 typedMobSelectedProxiesStorage$selectedProxies$1;
        int i;
        List list;
        if (continuationImpl instanceof TypedMobSelectedProxiesStorage$selectedProxies$1) {
            typedMobSelectedProxiesStorage$selectedProxies$1 = (TypedMobSelectedProxiesStorage$selectedProxies$1) continuationImpl;
            int i2 = typedMobSelectedProxiesStorage$selectedProxies$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                typedMobSelectedProxiesStorage$selectedProxies$1.label = i2 - Integer.MIN_VALUE;
                Object obj = typedMobSelectedProxiesStorage$selectedProxies$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = typedMobSelectedProxiesStorage$selectedProxies$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    typedMobSelectedProxiesStorage$selectedProxies$1.label = 1;
                    obj = a.a(this.a, typedMobSelectedProxiesStorage$selectedProxies$1);
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
                xr20 xr20Var = (xr20) obj;
                return (xr20Var != null || (list = xr20Var.p) == null) ? EmptyList.a : list;
            }
        }
        typedMobSelectedProxiesStorage$selectedProxies$1 = new TypedMobSelectedProxiesStorage$selectedProxies$1(this, continuationImpl);
        Object obj2 = typedMobSelectedProxiesStorage$selectedProxies$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = typedMobSelectedProxiesStorage$selectedProxies$1.label;
        if (i != 0) {
        }
        xr20 xr20Var2 = (xr20) obj2;
        if (xr20Var2 != null) {
        }
    }
}
