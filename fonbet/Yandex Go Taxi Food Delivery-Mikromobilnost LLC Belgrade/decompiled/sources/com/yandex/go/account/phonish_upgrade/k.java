package com.yandex.go.account.phonish_upgrade;

import com.yandex.go.account.phonish_upgrade.ForcePhonishUpgradeExperiment;
import defpackage.d6z;
import defpackage.i1s;
import defpackage.j1s;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes.dex */
public final class k implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ o b;

    public k(vpr vprVar, o oVar) {
        this.a = vprVar;
        this.b = oVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ForcePhonishUpgradeMenuInteractor$menuItemStateFlow$$inlined$map$1$2$1 forcePhonishUpgradeMenuInteractor$menuItemStateFlow$$inlined$map$1$2$1;
        int i;
        Object obj2;
        if (continuation instanceof ForcePhonishUpgradeMenuInteractor$menuItemStateFlow$$inlined$map$1$2$1) {
            forcePhonishUpgradeMenuInteractor$menuItemStateFlow$$inlined$map$1$2$1 = (ForcePhonishUpgradeMenuInteractor$menuItemStateFlow$$inlined$map$1$2$1) continuation;
            int i2 = forcePhonishUpgradeMenuInteractor$menuItemStateFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                forcePhonishUpgradeMenuInteractor$menuItemStateFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = forcePhonishUpgradeMenuInteractor$menuItemStateFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = forcePhonishUpgradeMenuInteractor$menuItemStateFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    ForcePhonishUpgradeExperiment forcePhonishUpgradeExperiment = (ForcePhonishUpgradeExperiment) obj;
                    this.b.getClass();
                    boolean z = forcePhonishUpgradeExperiment.b;
                    ForcePhonishUpgradeExperiment.MenuItem menuItem = forcePhonishUpgradeExperiment.f;
                    if (z) {
                        String Y = d6z.Y(forcePhonishUpgradeExperiment, menuItem.a);
                        String str = menuItem.b;
                        obj2 = new j1s(Y, str != null ? d6z.Y(forcePhonishUpgradeExperiment, str) : null);
                    } else {
                        obj2 = i1s.a;
                    }
                    forcePhonishUpgradeMenuInteractor$menuItemStateFlow$$inlined$map$1$2$1.L$0 = null;
                    forcePhonishUpgradeMenuInteractor$menuItemStateFlow$$inlined$map$1$2$1.L$1 = null;
                    forcePhonishUpgradeMenuInteractor$menuItemStateFlow$$inlined$map$1$2$1.L$2 = null;
                    forcePhonishUpgradeMenuInteractor$menuItemStateFlow$$inlined$map$1$2$1.L$3 = null;
                    forcePhonishUpgradeMenuInteractor$menuItemStateFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(obj2, forcePhonishUpgradeMenuInteractor$menuItemStateFlow$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj3);
                }
                return zy11.a;
            }
        }
        forcePhonishUpgradeMenuInteractor$menuItemStateFlow$$inlined$map$1$2$1 = new ForcePhonishUpgradeMenuInteractor$menuItemStateFlow$$inlined$map$1$2$1(this, continuation);
        Object obj32 = forcePhonishUpgradeMenuInteractor$menuItemStateFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = forcePhonishUpgradeMenuInteractor$menuItemStateFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
