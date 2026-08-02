package com.yandex.mob.domain;

import defpackage.go20;
import defpackage.lq20;
import defpackage.ny61;
import defpackage.oq20;
import defpackage.scc;
import defpackage.tm20;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class g {
    public final o a;

    public g(o oVar) {
        this.a = oVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        DefaultMobProvisionParamsProvider$headers$1 defaultMobProvisionParamsProvider$headers$1;
        int i;
        if (continuationImpl instanceof DefaultMobProvisionParamsProvider$headers$1) {
            defaultMobProvisionParamsProvider$headers$1 = (DefaultMobProvisionParamsProvider$headers$1) continuationImpl;
            int i2 = defaultMobProvisionParamsProvider$headers$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                defaultMobProvisionParamsProvider$headers$1.label = i2 - Integer.MIN_VALUE;
                Object obj = defaultMobProvisionParamsProvider$headers$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = defaultMobProvisionParamsProvider$headers$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    defaultMobProvisionParamsProvider$headers$1.label = 1;
                    obj = this.a.a(defaultMobProvisionParamsProvider$headers$1);
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
                return ((go20) obj).a;
            }
        }
        defaultMobProvisionParamsProvider$headers$1 = new DefaultMobProvisionParamsProvider$headers$1(this, continuationImpl);
        Object obj2 = defaultMobProvisionParamsProvider$headers$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = defaultMobProvisionParamsProvider$headers$1.label;
        if (i != 0) {
        }
        return ((go20) obj2).a;
    }

    public final oq20 b(tm20 tm20Var, lq20 lq20Var) {
        return new oq20(scc.g(new Pair("mobcf", tm20Var.a), new Pair("mobpr", lq20Var.b)));
    }
}
