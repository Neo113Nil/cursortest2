package com.yandex.go.splash.dynamic;

import com.yandex.go.splash.data.dto.DynamicSplash;
import defpackage.g9n;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.sls;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes8.dex */
public final class a {
    public final c a;
    public final tt2 b;

    public a(c cVar, tt2 tt2Var) {
        this.a = cVar;
        this.b = tt2Var;
    }

    public final Object a(sls slsVar, SuspendLambda suspendLambda) {
        c cVar = this.a;
        cVar.c.getClass();
        sjh sjhVar = uyj.a;
        Object k0 = tje.k0(mdh.b, new DynamicSplashRepository$cacheSplashScreens$2(cVar, slsVar, null), suspendLambda);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        DynamicSplashInteractor$dynamicSplashConfig$1 dynamicSplashInteractor$dynamicSplashConfig$1;
        int i;
        DynamicSplash dynamicSplash;
        if (continuationImpl instanceof DynamicSplashInteractor$dynamicSplashConfig$1) {
            dynamicSplashInteractor$dynamicSplashConfig$1 = (DynamicSplashInteractor$dynamicSplashConfig$1) continuationImpl;
            int i2 = dynamicSplashInteractor$dynamicSplashConfig$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dynamicSplashInteractor$dynamicSplashConfig$1.label = i2 - Integer.MIN_VALUE;
                Object obj = dynamicSplashInteractor$dynamicSplashConfig$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dynamicSplashInteractor$dynamicSplashConfig$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    this.b.getClass();
                    sjh sjhVar = uyj.a;
                    mdh mdhVar = mdh.b;
                    DynamicSplashInteractor$dynamicSplashConfig$splashScreen$1 dynamicSplashInteractor$dynamicSplashConfig$splashScreen$1 = new DynamicSplashInteractor$dynamicSplashConfig$splashScreen$1(this, null);
                    dynamicSplashInteractor$dynamicSplashConfig$1.label = 1;
                    obj = tje.k0(mdhVar, dynamicSplashInteractor$dynamicSplashConfig$splashScreen$1, dynamicSplashInteractor$dynamicSplashConfig$1);
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
                dynamicSplash = (DynamicSplash) obj;
                if (dynamicSplash != null) {
                    return null;
                }
                return new g9n(dynamicSplash);
            }
        }
        dynamicSplashInteractor$dynamicSplashConfig$1 = new DynamicSplashInteractor$dynamicSplashConfig$1(this, continuationImpl);
        Object obj2 = dynamicSplashInteractor$dynamicSplashConfig$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dynamicSplashInteractor$dynamicSplashConfig$1.label;
        if (i != 0) {
        }
        dynamicSplash = (DynamicSplash) obj2;
        if (dynamicSplash != null) {
        }
    }
}
