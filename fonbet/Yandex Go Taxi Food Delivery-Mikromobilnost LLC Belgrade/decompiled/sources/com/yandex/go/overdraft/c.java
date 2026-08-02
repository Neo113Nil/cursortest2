package com.yandex.go.overdraft;

import defpackage.ny61;
import defpackage.pl21;
import defpackage.tj;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ e b;

    public c(vpr vprVar, e eVar) {
        this.a = vprVar;
        this.b = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        OverdraftPaymentMethodsRouter$launchLpmPaymentMethods$$inlined$map$1$2$1 overdraftPaymentMethodsRouter$launchLpmPaymentMethods$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof OverdraftPaymentMethodsRouter$launchLpmPaymentMethods$$inlined$map$1$2$1) {
            overdraftPaymentMethodsRouter$launchLpmPaymentMethods$$inlined$map$1$2$1 = (OverdraftPaymentMethodsRouter$launchLpmPaymentMethods$$inlined$map$1$2$1) continuation;
            int i2 = overdraftPaymentMethodsRouter$launchLpmPaymentMethods$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                overdraftPaymentMethodsRouter$launchLpmPaymentMethods$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = overdraftPaymentMethodsRouter$launchLpmPaymentMethods$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = overdraftPaymentMethodsRouter$launchLpmPaymentMethods$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    int i3 = 16;
                    tj tjVar = new tj(i3, this.b, ((pl21) obj).b.f);
                    overdraftPaymentMethodsRouter$launchLpmPaymentMethods$$inlined$map$1$2$1.L$0 = null;
                    overdraftPaymentMethodsRouter$launchLpmPaymentMethods$$inlined$map$1$2$1.L$1 = null;
                    overdraftPaymentMethodsRouter$launchLpmPaymentMethods$$inlined$map$1$2$1.L$2 = null;
                    overdraftPaymentMethodsRouter$launchLpmPaymentMethods$$inlined$map$1$2$1.L$3 = null;
                    overdraftPaymentMethodsRouter$launchLpmPaymentMethods$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(tjVar, overdraftPaymentMethodsRouter$launchLpmPaymentMethods$$inlined$map$1$2$1) == coroutineSingletons) {
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
        overdraftPaymentMethodsRouter$launchLpmPaymentMethods$$inlined$map$1$2$1 = new OverdraftPaymentMethodsRouter$launchLpmPaymentMethods$$inlined$map$1$2$1(this, continuation);
        Object obj22 = overdraftPaymentMethodsRouter$launchLpmPaymentMethods$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = overdraftPaymentMethodsRouter$launchLpmPaymentMethods$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
