package com.yandex.go.superapp.discovery.map.impl.data.repositories.common;

import defpackage.eci0;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class b implements tpr {
    public final /* synthetic */ eci0 a;

    public b(eci0 eci0Var) {
        this.a = eci0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        BaseDiscoveryMapOverlayStateRepository$overlayPayloadFlow$$inlined$map$1$1 baseDiscoveryMapOverlayStateRepository$overlayPayloadFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof BaseDiscoveryMapOverlayStateRepository$overlayPayloadFlow$$inlined$map$1$1) {
            baseDiscoveryMapOverlayStateRepository$overlayPayloadFlow$$inlined$map$1$1 = (BaseDiscoveryMapOverlayStateRepository$overlayPayloadFlow$$inlined$map$1$1) continuation;
            int i2 = baseDiscoveryMapOverlayStateRepository$overlayPayloadFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                baseDiscoveryMapOverlayStateRepository$overlayPayloadFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = baseDiscoveryMapOverlayStateRepository$overlayPayloadFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = baseDiscoveryMapOverlayStateRepository$overlayPayloadFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar);
                    baseDiscoveryMapOverlayStateRepository$overlayPayloadFlow$$inlined$map$1$1.L$0 = null;
                    baseDiscoveryMapOverlayStateRepository$overlayPayloadFlow$$inlined$map$1$1.L$1 = null;
                    baseDiscoveryMapOverlayStateRepository$overlayPayloadFlow$$inlined$map$1$1.L$2 = null;
                    baseDiscoveryMapOverlayStateRepository$overlayPayloadFlow$$inlined$map$1$1.label = 1;
                    if (this.a.a.collect(aVar, baseDiscoveryMapOverlayStateRepository$overlayPayloadFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        baseDiscoveryMapOverlayStateRepository$overlayPayloadFlow$$inlined$map$1$1 = new BaseDiscoveryMapOverlayStateRepository$overlayPayloadFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = baseDiscoveryMapOverlayStateRepository$overlayPayloadFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = baseDiscoveryMapOverlayStateRepository$overlayPayloadFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
