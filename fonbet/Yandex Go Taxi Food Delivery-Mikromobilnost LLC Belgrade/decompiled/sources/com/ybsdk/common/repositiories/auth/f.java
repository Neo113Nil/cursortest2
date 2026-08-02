package com.ybsdk.common.repositiories.auth;

import defpackage.bif;
import defpackage.bvf0;
import defpackage.cif;
import defpackage.eif;
import defpackage.ey4;
import defpackage.nbp0;
import defpackage.ny61;
import defpackage.syc;
import defpackage.tje;
import defpackage.tpr;
import defpackage.zmp0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes8.dex */
public final class f {
    public final r0 a;
    public final tpr b;

    public f(zmp0 zmp0Var, nbp0 nbp0Var) {
        r0 c = bvf0.c(cif.a);
        this.a = c;
        this.b = kotlinx.coroutines.flow.e.t(new ey4(new eif(c, 0), 5));
        tje.N(nbp0Var.b, null, null, new CurrentUidHolder$1(zmp0Var, this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        CurrentUidHolder$getYandexUID$1 currentUidHolder$getYandexUID$1;
        int i;
        if (continuationImpl instanceof CurrentUidHolder$getYandexUID$1) {
            currentUidHolder$getYandexUID$1 = (CurrentUidHolder$getYandexUID$1) continuationImpl;
            int i2 = currentUidHolder$getYandexUID$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                currentUidHolder$getYandexUID$1.label = i2 - Integer.MIN_VALUE;
                Object obj = currentUidHolder$getYandexUID$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = currentUidHolder$getYandexUID$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    syc sycVar = new syc(this.a, 5);
                    currentUidHolder$getYandexUID$1.label = 1;
                    obj = kotlinx.coroutines.flow.e.y(sycVar, currentUidHolder$getYandexUID$1);
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
                return ((bif) obj).a();
            }
        }
        currentUidHolder$getYandexUID$1 = new CurrentUidHolder$getYandexUID$1(this, continuationImpl);
        Object obj2 = currentUidHolder$getYandexUID$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = currentUidHolder$getYandexUID$1.label;
        if (i != 0) {
        }
        return ((bif) obj2).a();
    }
}
