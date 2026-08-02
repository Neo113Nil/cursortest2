package com.yandex.messaging.auth.passport;

import com.yandex.passport.api.l3;
import defpackage.cm3;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.w511;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes15.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;

    public a(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        PassportAuthApi$vpnStatusExpandedFlow$$inlined$map$1$2$1 passportAuthApi$vpnStatusExpandedFlow$$inlined$map$1$2$1;
        int i;
        cm3 cm3Var;
        if (continuation instanceof PassportAuthApi$vpnStatusExpandedFlow$$inlined$map$1$2$1) {
            passportAuthApi$vpnStatusExpandedFlow$$inlined$map$1$2$1 = (PassportAuthApi$vpnStatusExpandedFlow$$inlined$map$1$2$1) continuation;
            int i2 = passportAuthApi$vpnStatusExpandedFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                passportAuthApi$vpnStatusExpandedFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = passportAuthApi$vpnStatusExpandedFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = passportAuthApi$vpnStatusExpandedFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    l3 l3Var = (l3) obj;
                    if (jl40.l(l3Var, l3.a)) {
                        cm3Var = cm3.a;
                    } else if (jl40.l(l3Var, l3.b)) {
                        cm3Var = cm3.b;
                    } else {
                        if (!jl40.l(l3Var, l3.c)) {
                            w511.b();
                            return null;
                        }
                        cm3Var = cm3.c;
                    }
                    passportAuthApi$vpnStatusExpandedFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(cm3Var, passportAuthApi$vpnStatusExpandedFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        passportAuthApi$vpnStatusExpandedFlow$$inlined$map$1$2$1 = new PassportAuthApi$vpnStatusExpandedFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = passportAuthApi$vpnStatusExpandedFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = passportAuthApi$vpnStatusExpandedFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
