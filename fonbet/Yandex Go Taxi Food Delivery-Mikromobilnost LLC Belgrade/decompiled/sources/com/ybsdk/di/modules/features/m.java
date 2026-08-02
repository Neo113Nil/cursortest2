package com.ybsdk.di.modules.features;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes3.dex */
public final class m implements vpr {
    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        QrFeatureModule$walletReloadTriggerProvider$1$special$$inlined$filterIsInstance$1$2$1 qrFeatureModule$walletReloadTriggerProvider$1$special$$inlined$filterIsInstance$1$2$1;
        int i;
        if (continuation instanceof QrFeatureModule$walletReloadTriggerProvider$1$special$$inlined$filterIsInstance$1$2$1) {
            qrFeatureModule$walletReloadTriggerProvider$1$special$$inlined$filterIsInstance$1$2$1 = (QrFeatureModule$walletReloadTriggerProvider$1$special$$inlined$filterIsInstance$1$2$1) continuation;
            int i2 = qrFeatureModule$walletReloadTriggerProvider$1$special$$inlined$filterIsInstance$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qrFeatureModule$walletReloadTriggerProvider$1$special$$inlined$filterIsInstance$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = qrFeatureModule$walletReloadTriggerProvider$1$special$$inlined$filterIsInstance$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = qrFeatureModule$walletReloadTriggerProvider$1$special$$inlined$filterIsInstance$1$2$1.label;
                if (i != 0 || i == 1) {
                    kotlin.b.b(obj2);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        qrFeatureModule$walletReloadTriggerProvider$1$special$$inlined$filterIsInstance$1$2$1 = new QrFeatureModule$walletReloadTriggerProvider$1$special$$inlined$filterIsInstance$1$2$1(this, continuation);
        Object obj22 = qrFeatureModule$walletReloadTriggerProvider$1$special$$inlined$filterIsInstance$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = qrFeatureModule$walletReloadTriggerProvider$1$special$$inlined$filterIsInstance$1$2$1.label;
        if (i != 0) {
        }
        kotlin.b.b(obj22);
        return zy11.a;
    }
}
