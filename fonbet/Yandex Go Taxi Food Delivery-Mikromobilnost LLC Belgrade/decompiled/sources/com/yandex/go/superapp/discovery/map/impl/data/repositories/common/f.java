package com.yandex.go.superapp.discovery.map.impl.data.repositories.common;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class f implements tpr {
    public final /* synthetic */ tpr a;

    public f(r0 r0Var) {
        this.a = r0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        BaseDiscoveryMapOverlayStateRepository$overlayUiStateFlow$$inlined$map$1$1 baseDiscoveryMapOverlayStateRepository$overlayUiStateFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof BaseDiscoveryMapOverlayStateRepository$overlayUiStateFlow$$inlined$map$1$1) {
            baseDiscoveryMapOverlayStateRepository$overlayUiStateFlow$$inlined$map$1$1 = (BaseDiscoveryMapOverlayStateRepository$overlayUiStateFlow$$inlined$map$1$1) continuation;
            int i2 = baseDiscoveryMapOverlayStateRepository$overlayUiStateFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                baseDiscoveryMapOverlayStateRepository$overlayUiStateFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = baseDiscoveryMapOverlayStateRepository$overlayUiStateFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = baseDiscoveryMapOverlayStateRepository$overlayUiStateFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    e eVar = new e(vprVar);
                    baseDiscoveryMapOverlayStateRepository$overlayUiStateFlow$$inlined$map$1$1.L$0 = null;
                    baseDiscoveryMapOverlayStateRepository$overlayUiStateFlow$$inlined$map$1$1.L$1 = null;
                    baseDiscoveryMapOverlayStateRepository$overlayUiStateFlow$$inlined$map$1$1.L$2 = null;
                    baseDiscoveryMapOverlayStateRepository$overlayUiStateFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(eVar, baseDiscoveryMapOverlayStateRepository$overlayUiStateFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        baseDiscoveryMapOverlayStateRepository$overlayUiStateFlow$$inlined$map$1$1 = new BaseDiscoveryMapOverlayStateRepository$overlayUiStateFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = baseDiscoveryMapOverlayStateRepository$overlayUiStateFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = baseDiscoveryMapOverlayStateRepository$overlayUiStateFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
