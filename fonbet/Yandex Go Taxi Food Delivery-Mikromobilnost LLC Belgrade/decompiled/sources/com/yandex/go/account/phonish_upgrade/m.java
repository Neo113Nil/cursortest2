package com.yandex.go.account.phonish_upgrade;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class m implements vpr {
    public final /* synthetic */ vpr a;

    public m(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ForcePhonishUpgradeMenuInteractor$needHighlightPhoneFlow$$inlined$map$1$2$1 forcePhonishUpgradeMenuInteractor$needHighlightPhoneFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof ForcePhonishUpgradeMenuInteractor$needHighlightPhoneFlow$$inlined$map$1$2$1) {
            forcePhonishUpgradeMenuInteractor$needHighlightPhoneFlow$$inlined$map$1$2$1 = (ForcePhonishUpgradeMenuInteractor$needHighlightPhoneFlow$$inlined$map$1$2$1) continuation;
            int i2 = forcePhonishUpgradeMenuInteractor$needHighlightPhoneFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                forcePhonishUpgradeMenuInteractor$needHighlightPhoneFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = forcePhonishUpgradeMenuInteractor$needHighlightPhoneFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = forcePhonishUpgradeMenuInteractor$needHighlightPhoneFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Boolean valueOf = Boolean.valueOf(((ForcePhonishUpgradeExperiment) obj).b);
                    forcePhonishUpgradeMenuInteractor$needHighlightPhoneFlow$$inlined$map$1$2$1.L$0 = null;
                    forcePhonishUpgradeMenuInteractor$needHighlightPhoneFlow$$inlined$map$1$2$1.L$1 = null;
                    forcePhonishUpgradeMenuInteractor$needHighlightPhoneFlow$$inlined$map$1$2$1.L$2 = null;
                    forcePhonishUpgradeMenuInteractor$needHighlightPhoneFlow$$inlined$map$1$2$1.L$3 = null;
                    forcePhonishUpgradeMenuInteractor$needHighlightPhoneFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(valueOf, forcePhonishUpgradeMenuInteractor$needHighlightPhoneFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        forcePhonishUpgradeMenuInteractor$needHighlightPhoneFlow$$inlined$map$1$2$1 = new ForcePhonishUpgradeMenuInteractor$needHighlightPhoneFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = forcePhonishUpgradeMenuInteractor$needHighlightPhoneFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = forcePhonishUpgradeMenuInteractor$needHighlightPhoneFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
