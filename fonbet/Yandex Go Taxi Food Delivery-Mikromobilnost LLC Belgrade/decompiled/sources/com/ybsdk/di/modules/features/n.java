package com.ybsdk.di.modules.features;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes3.dex */
public final class n implements vpr {
    public final /* synthetic */ vpr a;

    public n(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        QrFeatureModule$walletReloadTriggerProvider$1$special$$inlined$map$1$2$1 qrFeatureModule$walletReloadTriggerProvider$1$special$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof QrFeatureModule$walletReloadTriggerProvider$1$special$$inlined$map$1$2$1) {
            qrFeatureModule$walletReloadTriggerProvider$1$special$$inlined$map$1$2$1 = (QrFeatureModule$walletReloadTriggerProvider$1$special$$inlined$map$1$2$1) continuation;
            int i2 = qrFeatureModule$walletReloadTriggerProvider$1$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qrFeatureModule$walletReloadTriggerProvider$1$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = qrFeatureModule$walletReloadTriggerProvider$1$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = qrFeatureModule$walletReloadTriggerProvider$1$special$$inlined$map$1$2$1.label;
                zy11 zy11Var = zy11.a;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj2);
                        return zy11Var;
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj2);
                if (obj == null) {
                    qrFeatureModule$walletReloadTriggerProvider$1$special$$inlined$map$1$2$1.label = 1;
                    return this.a.emit(zy11Var, qrFeatureModule$walletReloadTriggerProvider$1$special$$inlined$map$1$2$1) == coroutineSingletons ? coroutineSingletons : zy11Var;
                }
                ny61.u();
                return null;
            }
        }
        qrFeatureModule$walletReloadTriggerProvider$1$special$$inlined$map$1$2$1 = new QrFeatureModule$walletReloadTriggerProvider$1$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = qrFeatureModule$walletReloadTriggerProvider$1$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = qrFeatureModule$walletReloadTriggerProvider$1$special$$inlined$map$1$2$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i == 0) {
        }
    }
}
