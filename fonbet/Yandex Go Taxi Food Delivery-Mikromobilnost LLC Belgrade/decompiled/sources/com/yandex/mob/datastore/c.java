package com.yandex.mob.datastore;

import defpackage.ny61;
import defpackage.tm20;
import defpackage.tpg;
import defpackage.xr20;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class c {
    public final tpg a;

    public c(tpg tpgVar) {
        this.a = tpgVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        TypedMobConfigStorage$config$1 typedMobConfigStorage$config$1;
        int i;
        xr20 xr20Var;
        if (continuationImpl instanceof TypedMobConfigStorage$config$1) {
            typedMobConfigStorage$config$1 = (TypedMobConfigStorage$config$1) continuationImpl;
            int i2 = typedMobConfigStorage$config$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                typedMobConfigStorage$config$1.label = i2 - Integer.MIN_VALUE;
                Object obj = typedMobConfigStorage$config$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = typedMobConfigStorage$config$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    typedMobConfigStorage$config$1.label = 1;
                    obj = a.a(this.a, typedMobConfigStorage$config$1);
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
                xr20Var = (xr20) obj;
                if (xr20Var == null) {
                    return xr20Var.o;
                }
                return null;
            }
        }
        typedMobConfigStorage$config$1 = new TypedMobConfigStorage$config$1(this, continuationImpl);
        Object obj2 = typedMobConfigStorage$config$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = typedMobConfigStorage$config$1.label;
        if (i != 0) {
        }
        xr20Var = (xr20) obj2;
        if (xr20Var == null) {
        }
    }

    public final Object b(tm20 tm20Var, ContinuationImpl continuationImpl) {
        Object c = a.c(this.a, new TypedMobConfigStorage$saveConfig$2(tm20Var, null), continuationImpl);
        return c == CoroutineSingletons.COROUTINE_SUSPENDED ? c : zy11.a;
    }
}
