package com.yandex.passport.internal.impl;

import com.yandex.passport.api.l3;
import com.yandex.passport.internal.entities.VpnStatus;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.w511;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes15.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;

    public c(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        KPassportApiImpl$vpnStatusExpandedFlow$$inlined$map$1$2$1 kPassportApiImpl$vpnStatusExpandedFlow$$inlined$map$1$2$1;
        int i;
        l3 l3Var;
        if (continuation instanceof KPassportApiImpl$vpnStatusExpandedFlow$$inlined$map$1$2$1) {
            kPassportApiImpl$vpnStatusExpandedFlow$$inlined$map$1$2$1 = (KPassportApiImpl$vpnStatusExpandedFlow$$inlined$map$1$2$1) continuation;
            int i2 = kPassportApiImpl$vpnStatusExpandedFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kPassportApiImpl$vpnStatusExpandedFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = kPassportApiImpl$vpnStatusExpandedFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = kPassportApiImpl$vpnStatusExpandedFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    VpnStatus vpnStatus = (VpnStatus) obj;
                    if (vpnStatus instanceof VpnStatus.Blocked) {
                        l3Var = l3.b;
                    } else if (jl40.l(vpnStatus, VpnStatus.Allowed.INSTANCE)) {
                        l3Var = l3.a;
                    } else {
                        if (!jl40.l(vpnStatus, VpnStatus.Pending.INSTANCE)) {
                            w511.b();
                            return null;
                        }
                        l3Var = l3.c;
                    }
                    kPassportApiImpl$vpnStatusExpandedFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(l3Var, kPassportApiImpl$vpnStatusExpandedFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        kPassportApiImpl$vpnStatusExpandedFlow$$inlined$map$1$2$1 = new KPassportApiImpl$vpnStatusExpandedFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = kPassportApiImpl$vpnStatusExpandedFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = kPassportApiImpl$vpnStatusExpandedFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
