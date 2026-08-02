package com.yandex.go.proxyprovision;

import com.yandex.go.proxyprovision.api.MapKitDefaultHost;
import defpackage.hzk;
import defpackage.lk00;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ hzk b;

    public b(vpr vprVar, hzk hzkVar) {
        this.a = vprVar;
        this.b = hzkVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ExperimentMapKitProxyConfiguration$mapKitDefaultHostFlow$$inlined$map$1$2$1 experimentMapKitProxyConfiguration$mapKitDefaultHostFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof ExperimentMapKitProxyConfiguration$mapKitDefaultHostFlow$$inlined$map$1$2$1) {
            experimentMapKitProxyConfiguration$mapKitDefaultHostFlow$$inlined$map$1$2$1 = (ExperimentMapKitProxyConfiguration$mapKitDefaultHostFlow$$inlined$map$1$2$1) continuation;
            int i2 = experimentMapKitProxyConfiguration$mapKitDefaultHostFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                experimentMapKitProxyConfiguration$mapKitDefaultHostFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = experimentMapKitProxyConfiguration$mapKitDefaultHostFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = experimentMapKitProxyConfiguration$mapKitDefaultHostFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    MapKitDefaultHost mapKitDefaultHost = ((GeProxyProvisionExperiment) obj).g;
                    if (mapKitDefaultHost == null) {
                        mapKitDefaultHost = ((lk00) this.b.b).a();
                    }
                    experimentMapKitProxyConfiguration$mapKitDefaultHostFlow$$inlined$map$1$2$1.L$0 = null;
                    experimentMapKitProxyConfiguration$mapKitDefaultHostFlow$$inlined$map$1$2$1.L$1 = null;
                    experimentMapKitProxyConfiguration$mapKitDefaultHostFlow$$inlined$map$1$2$1.L$2 = null;
                    experimentMapKitProxyConfiguration$mapKitDefaultHostFlow$$inlined$map$1$2$1.L$3 = null;
                    experimentMapKitProxyConfiguration$mapKitDefaultHostFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(mapKitDefaultHost, experimentMapKitProxyConfiguration$mapKitDefaultHostFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        experimentMapKitProxyConfiguration$mapKitDefaultHostFlow$$inlined$map$1$2$1 = new ExperimentMapKitProxyConfiguration$mapKitDefaultHostFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = experimentMapKitProxyConfiguration$mapKitDefaultHostFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = experimentMapKitProxyConfiguration$mapKitDefaultHostFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
