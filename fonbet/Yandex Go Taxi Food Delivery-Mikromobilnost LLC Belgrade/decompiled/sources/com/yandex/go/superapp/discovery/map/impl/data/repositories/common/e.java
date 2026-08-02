package com.yandex.go.superapp.discovery.map.impl.data.repositories.common;

import com.yandex.go.superapp.discovery.map.impl.domain.entities.SuperAppDiscoveryMapOverlayUiState;
import defpackage.c0d;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class e implements vpr {
    public final /* synthetic */ vpr a;

    public e(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        BaseDiscoveryMapOverlayStateRepository$overlayUiStateFlow$$inlined$map$1$2$1 baseDiscoveryMapOverlayStateRepository$overlayUiStateFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof BaseDiscoveryMapOverlayStateRepository$overlayUiStateFlow$$inlined$map$1$2$1) {
            baseDiscoveryMapOverlayStateRepository$overlayUiStateFlow$$inlined$map$1$2$1 = (BaseDiscoveryMapOverlayStateRepository$overlayUiStateFlow$$inlined$map$1$2$1) continuation;
            int i2 = baseDiscoveryMapOverlayStateRepository$overlayUiStateFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                baseDiscoveryMapOverlayStateRepository$overlayUiStateFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = baseDiscoveryMapOverlayStateRepository$overlayUiStateFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = baseDiscoveryMapOverlayStateRepository$overlayUiStateFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    SuperAppDiscoveryMapOverlayUiState superAppDiscoveryMapOverlayUiState = ((c0d) obj).c;
                    baseDiscoveryMapOverlayStateRepository$overlayUiStateFlow$$inlined$map$1$2$1.L$0 = null;
                    baseDiscoveryMapOverlayStateRepository$overlayUiStateFlow$$inlined$map$1$2$1.L$1 = null;
                    baseDiscoveryMapOverlayStateRepository$overlayUiStateFlow$$inlined$map$1$2$1.L$2 = null;
                    baseDiscoveryMapOverlayStateRepository$overlayUiStateFlow$$inlined$map$1$2$1.L$3 = null;
                    baseDiscoveryMapOverlayStateRepository$overlayUiStateFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(superAppDiscoveryMapOverlayUiState, baseDiscoveryMapOverlayStateRepository$overlayUiStateFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        baseDiscoveryMapOverlayStateRepository$overlayUiStateFlow$$inlined$map$1$2$1 = new BaseDiscoveryMapOverlayStateRepository$overlayUiStateFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = baseDiscoveryMapOverlayStateRepository$overlayUiStateFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = baseDiscoveryMapOverlayStateRepository$overlayUiStateFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
