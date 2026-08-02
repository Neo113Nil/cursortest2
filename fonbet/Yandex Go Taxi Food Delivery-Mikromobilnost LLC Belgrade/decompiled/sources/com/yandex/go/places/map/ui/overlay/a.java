package com.yandex.go.places.map.ui.overlay;

import defpackage.bbc0;
import defpackage.bvf0;
import defpackage.cbc0;
import defpackage.ny61;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes13.dex */
public final class a {
    public final r0 a = bvf0.c(bbc0.a);

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        PlacesMapOverlayCoordinator$awaitRootSetup$1 placesMapOverlayCoordinator$awaitRootSetup$1;
        int i;
        if (continuationImpl instanceof PlacesMapOverlayCoordinator$awaitRootSetup$1) {
            placesMapOverlayCoordinator$awaitRootSetup$1 = (PlacesMapOverlayCoordinator$awaitRootSetup$1) continuationImpl;
            int i2 = placesMapOverlayCoordinator$awaitRootSetup$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                placesMapOverlayCoordinator$awaitRootSetup$1.label = i2 - Integer.MIN_VALUE;
                Object obj = placesMapOverlayCoordinator$awaitRootSetup$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = placesMapOverlayCoordinator$awaitRootSetup$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    PlacesMapOverlayCoordinator$awaitRootSetup$2 placesMapOverlayCoordinator$awaitRootSetup$2 = new PlacesMapOverlayCoordinator$awaitRootSetup$2(this, null);
                    placesMapOverlayCoordinator$awaitRootSetup$1.label = 1;
                    if (kotlinx.coroutines.a.w(500L, placesMapOverlayCoordinator$awaitRootSetup$2, placesMapOverlayCoordinator$awaitRootSetup$1) == coroutineSingletons) {
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
        placesMapOverlayCoordinator$awaitRootSetup$1 = new PlacesMapOverlayCoordinator$awaitRootSetup$1(this, continuationImpl);
        Object obj2 = placesMapOverlayCoordinator$awaitRootSetup$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = placesMapOverlayCoordinator$awaitRootSetup$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }

    public final void b() {
        r0 r0Var = this.a;
        r0Var.getClass();
        r0Var.m(null, cbc0.a);
    }
}
