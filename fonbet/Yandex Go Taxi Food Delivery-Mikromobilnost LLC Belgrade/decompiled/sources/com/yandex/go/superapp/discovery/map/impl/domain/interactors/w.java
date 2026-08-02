package com.yandex.go.superapp.discovery.map.impl.domain.interactors;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class w implements tpr {
    public final /* synthetic */ tpr a;

    public w(r0 r0Var) {
        this.a = r0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        SuperAppDiscoveryMapOwnershipInteractor$isPlacesLayerSelectedFlow$$inlined$map$5$1 superAppDiscoveryMapOwnershipInteractor$isPlacesLayerSelectedFlow$$inlined$map$5$1;
        int i;
        if (continuation instanceof SuperAppDiscoveryMapOwnershipInteractor$isPlacesLayerSelectedFlow$$inlined$map$5$1) {
            superAppDiscoveryMapOwnershipInteractor$isPlacesLayerSelectedFlow$$inlined$map$5$1 = (SuperAppDiscoveryMapOwnershipInteractor$isPlacesLayerSelectedFlow$$inlined$map$5$1) continuation;
            int i2 = superAppDiscoveryMapOwnershipInteractor$isPlacesLayerSelectedFlow$$inlined$map$5$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superAppDiscoveryMapOwnershipInteractor$isPlacesLayerSelectedFlow$$inlined$map$5$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superAppDiscoveryMapOwnershipInteractor$isPlacesLayerSelectedFlow$$inlined$map$5$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superAppDiscoveryMapOwnershipInteractor$isPlacesLayerSelectedFlow$$inlined$map$5$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    v vVar = new v(vprVar);
                    superAppDiscoveryMapOwnershipInteractor$isPlacesLayerSelectedFlow$$inlined$map$5$1.L$0 = null;
                    superAppDiscoveryMapOwnershipInteractor$isPlacesLayerSelectedFlow$$inlined$map$5$1.L$1 = null;
                    superAppDiscoveryMapOwnershipInteractor$isPlacesLayerSelectedFlow$$inlined$map$5$1.L$2 = null;
                    superAppDiscoveryMapOwnershipInteractor$isPlacesLayerSelectedFlow$$inlined$map$5$1.label = 1;
                    if (this.a.collect(vVar, superAppDiscoveryMapOwnershipInteractor$isPlacesLayerSelectedFlow$$inlined$map$5$1) == coroutineSingletons) {
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
        superAppDiscoveryMapOwnershipInteractor$isPlacesLayerSelectedFlow$$inlined$map$5$1 = new SuperAppDiscoveryMapOwnershipInteractor$isPlacesLayerSelectedFlow$$inlined$map$5$1(this, continuation);
        Object obj2 = superAppDiscoveryMapOwnershipInteractor$isPlacesLayerSelectedFlow$$inlined$map$5$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superAppDiscoveryMapOwnershipInteractor$isPlacesLayerSelectedFlow$$inlined$map$5$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
