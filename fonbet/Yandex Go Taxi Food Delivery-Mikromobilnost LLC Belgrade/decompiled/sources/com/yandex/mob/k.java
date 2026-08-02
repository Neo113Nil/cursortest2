package com.yandex.mob;

import defpackage.ny61;
import defpackage.slc;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class k {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        MobNativeNetworkDiagnostics$traceroute$1 mobNativeNetworkDiagnostics$traceroute$1;
        int i;
        if (continuationImpl instanceof MobNativeNetworkDiagnostics$traceroute$1) {
            mobNativeNetworkDiagnostics$traceroute$1 = (MobNativeNetworkDiagnostics$traceroute$1) continuationImpl;
            int i2 = mobNativeNetworkDiagnostics$traceroute$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mobNativeNetworkDiagnostics$traceroute$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mobNativeNetworkDiagnostics$traceroute$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mobNativeNetworkDiagnostics$traceroute$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mobNativeNetworkDiagnostics$traceroute$1.L$0 = null;
                    mobNativeNetworkDiagnostics$traceroute$1.label = 1;
                    obj = p.a(str, mobNativeNetworkDiagnostics$traceroute$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return ((slc) obj).a();
            }
        }
        mobNativeNetworkDiagnostics$traceroute$1 = new MobNativeNetworkDiagnostics$traceroute$1(this, continuationImpl);
        Object obj2 = mobNativeNetworkDiagnostics$traceroute$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mobNativeNetworkDiagnostics$traceroute$1.label;
        if (i != 0) {
        }
        return ((slc) obj2).a();
    }
}
