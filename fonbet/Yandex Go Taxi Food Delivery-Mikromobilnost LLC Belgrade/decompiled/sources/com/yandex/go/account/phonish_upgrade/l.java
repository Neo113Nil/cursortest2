package com.yandex.go.account.phonish_upgrade;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes.dex */
public final class l implements tpr {
    public final /* synthetic */ m0 a;
    public final /* synthetic */ o b;

    public l(m0 m0Var, o oVar) {
        this.a = m0Var;
        this.b = oVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        ForcePhonishUpgradeMenuInteractor$menuItemStateFlow$$inlined$map$1$1 forcePhonishUpgradeMenuInteractor$menuItemStateFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof ForcePhonishUpgradeMenuInteractor$menuItemStateFlow$$inlined$map$1$1) {
            forcePhonishUpgradeMenuInteractor$menuItemStateFlow$$inlined$map$1$1 = (ForcePhonishUpgradeMenuInteractor$menuItemStateFlow$$inlined$map$1$1) continuation;
            int i2 = forcePhonishUpgradeMenuInteractor$menuItemStateFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                forcePhonishUpgradeMenuInteractor$menuItemStateFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = forcePhonishUpgradeMenuInteractor$menuItemStateFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = forcePhonishUpgradeMenuInteractor$menuItemStateFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    k kVar = new k(vprVar, this.b);
                    forcePhonishUpgradeMenuInteractor$menuItemStateFlow$$inlined$map$1$1.L$0 = null;
                    forcePhonishUpgradeMenuInteractor$menuItemStateFlow$$inlined$map$1$1.L$1 = null;
                    forcePhonishUpgradeMenuInteractor$menuItemStateFlow$$inlined$map$1$1.L$2 = null;
                    forcePhonishUpgradeMenuInteractor$menuItemStateFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(kVar, forcePhonishUpgradeMenuInteractor$menuItemStateFlow$$inlined$map$1$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        forcePhonishUpgradeMenuInteractor$menuItemStateFlow$$inlined$map$1$1 = new ForcePhonishUpgradeMenuInteractor$menuItemStateFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = forcePhonishUpgradeMenuInteractor$menuItemStateFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = forcePhonishUpgradeMenuInteractor$menuItemStateFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
