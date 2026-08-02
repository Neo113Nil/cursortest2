package com.yandex.go.superapp.discovery.map.impl.domain.interactors;

import com.yandex.go.superapp.discovery.map.api.repositories.state.SuperAppDiscoveryMapOverlayState;
import defpackage.c0d;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class t implements vpr {
    public final /* synthetic */ vpr a;

    public t(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SuperAppDiscoveryMapOwnershipInteractor$isPlacesLayerSelectedFlow$$inlined$map$4$2$1 superAppDiscoveryMapOwnershipInteractor$isPlacesLayerSelectedFlow$$inlined$map$4$2$1;
        int i;
        if (continuation instanceof SuperAppDiscoveryMapOwnershipInteractor$isPlacesLayerSelectedFlow$$inlined$map$4$2$1) {
            superAppDiscoveryMapOwnershipInteractor$isPlacesLayerSelectedFlow$$inlined$map$4$2$1 = (SuperAppDiscoveryMapOwnershipInteractor$isPlacesLayerSelectedFlow$$inlined$map$4$2$1) continuation;
            int i2 = superAppDiscoveryMapOwnershipInteractor$isPlacesLayerSelectedFlow$$inlined$map$4$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superAppDiscoveryMapOwnershipInteractor$isPlacesLayerSelectedFlow$$inlined$map$4$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = superAppDiscoveryMapOwnershipInteractor$isPlacesLayerSelectedFlow$$inlined$map$4$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superAppDiscoveryMapOwnershipInteractor$isPlacesLayerSelectedFlow$$inlined$map$4$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    SuperAppDiscoveryMapOverlayState superAppDiscoveryMapOverlayState = ((c0d) obj).b;
                    superAppDiscoveryMapOwnershipInteractor$isPlacesLayerSelectedFlow$$inlined$map$4$2$1.L$0 = null;
                    superAppDiscoveryMapOwnershipInteractor$isPlacesLayerSelectedFlow$$inlined$map$4$2$1.L$1 = null;
                    superAppDiscoveryMapOwnershipInteractor$isPlacesLayerSelectedFlow$$inlined$map$4$2$1.L$2 = null;
                    superAppDiscoveryMapOwnershipInteractor$isPlacesLayerSelectedFlow$$inlined$map$4$2$1.L$3 = null;
                    superAppDiscoveryMapOwnershipInteractor$isPlacesLayerSelectedFlow$$inlined$map$4$2$1.label = 1;
                    if (this.a.emit(superAppDiscoveryMapOverlayState, superAppDiscoveryMapOwnershipInteractor$isPlacesLayerSelectedFlow$$inlined$map$4$2$1) == coroutineSingletons) {
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
        superAppDiscoveryMapOwnershipInteractor$isPlacesLayerSelectedFlow$$inlined$map$4$2$1 = new SuperAppDiscoveryMapOwnershipInteractor$isPlacesLayerSelectedFlow$$inlined$map$4$2$1(this, continuation);
        Object obj22 = superAppDiscoveryMapOwnershipInteractor$isPlacesLayerSelectedFlow$$inlined$map$4$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superAppDiscoveryMapOwnershipInteractor$isPlacesLayerSelectedFlow$$inlined$map$4$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
