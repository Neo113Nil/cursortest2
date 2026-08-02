package com.yandex.messaging.internal.net;

import defpackage.cm3;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes15.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;

    public b(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        VpnMonitor$createFlow$$inlined$map$1$2$1 vpnMonitor$createFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof VpnMonitor$createFlow$$inlined$map$1$2$1) {
            vpnMonitor$createFlow$$inlined$map$1$2$1 = (VpnMonitor$createFlow$$inlined$map$1$2$1) continuation;
            int i2 = vpnMonitor$createFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vpnMonitor$createFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = vpnMonitor$createFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = vpnMonitor$createFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Boolean valueOf = Boolean.valueOf(jl40.l((cm3) obj, cm3.b));
                    vpnMonitor$createFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(valueOf, vpnMonitor$createFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        vpnMonitor$createFlow$$inlined$map$1$2$1 = new VpnMonitor$createFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = vpnMonitor$createFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = vpnMonitor$createFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
