package com.yandex.go.account.phonish_upgrade;

import com.yandex.go.account.phonish_upgrade.ForcePhonishUpgradeExperiment;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes.dex */
public final class g implements vpr {
    public final /* synthetic */ vpr a;

    public g(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ForcePhonishUpgradeLifecycleListener$onLargestContentfulPaint$$inlined$map$1$2$1 forcePhonishUpgradeLifecycleListener$onLargestContentfulPaint$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof ForcePhonishUpgradeLifecycleListener$onLargestContentfulPaint$$inlined$map$1$2$1) {
            forcePhonishUpgradeLifecycleListener$onLargestContentfulPaint$$inlined$map$1$2$1 = (ForcePhonishUpgradeLifecycleListener$onLargestContentfulPaint$$inlined$map$1$2$1) continuation;
            int i2 = forcePhonishUpgradeLifecycleListener$onLargestContentfulPaint$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                forcePhonishUpgradeLifecycleListener$onLargestContentfulPaint$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = forcePhonishUpgradeLifecycleListener$onLargestContentfulPaint$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = forcePhonishUpgradeLifecycleListener$onLargestContentfulPaint$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ForcePhonishUpgradeExperiment.ForceOpenMenuShowPolicy forceOpenMenuShowPolicy = ((ForcePhonishUpgradeExperiment) obj).e;
                    forcePhonishUpgradeLifecycleListener$onLargestContentfulPaint$$inlined$map$1$2$1.L$0 = null;
                    forcePhonishUpgradeLifecycleListener$onLargestContentfulPaint$$inlined$map$1$2$1.L$1 = null;
                    forcePhonishUpgradeLifecycleListener$onLargestContentfulPaint$$inlined$map$1$2$1.L$2 = null;
                    forcePhonishUpgradeLifecycleListener$onLargestContentfulPaint$$inlined$map$1$2$1.L$3 = null;
                    forcePhonishUpgradeLifecycleListener$onLargestContentfulPaint$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(forceOpenMenuShowPolicy, forcePhonishUpgradeLifecycleListener$onLargestContentfulPaint$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        forcePhonishUpgradeLifecycleListener$onLargestContentfulPaint$$inlined$map$1$2$1 = new ForcePhonishUpgradeLifecycleListener$onLargestContentfulPaint$$inlined$map$1$2$1(this, continuation);
        Object obj22 = forcePhonishUpgradeLifecycleListener$onLargestContentfulPaint$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = forcePhonishUpgradeLifecycleListener$onLargestContentfulPaint$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
