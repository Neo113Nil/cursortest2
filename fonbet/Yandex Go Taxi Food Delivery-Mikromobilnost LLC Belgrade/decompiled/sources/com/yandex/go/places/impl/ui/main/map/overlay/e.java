package com.yandex.go.places.impl.ui.main.map.overlay;

import defpackage.ny61;
import defpackage.qac0;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class e implements tpr {
    public final /* synthetic */ kotlinx.coroutines.flow.internal.g a;
    public final /* synthetic */ qac0 b;

    public e(kotlinx.coroutines.flow.internal.g gVar, qac0 qac0Var) {
        this.a = gVar;
        this.b = qac0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        PlacesMainMapOverlayInteractor$mapSelectedMapObjectModel$$inlined$mapNotNull$1$1 placesMainMapOverlayInteractor$mapSelectedMapObjectModel$$inlined$mapNotNull$1$1;
        int i;
        if (continuation instanceof PlacesMainMapOverlayInteractor$mapSelectedMapObjectModel$$inlined$mapNotNull$1$1) {
            placesMainMapOverlayInteractor$mapSelectedMapObjectModel$$inlined$mapNotNull$1$1 = (PlacesMainMapOverlayInteractor$mapSelectedMapObjectModel$$inlined$mapNotNull$1$1) continuation;
            int i2 = placesMainMapOverlayInteractor$mapSelectedMapObjectModel$$inlined$mapNotNull$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                placesMainMapOverlayInteractor$mapSelectedMapObjectModel$$inlined$mapNotNull$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = placesMainMapOverlayInteractor$mapSelectedMapObjectModel$$inlined$mapNotNull$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = placesMainMapOverlayInteractor$mapSelectedMapObjectModel$$inlined$mapNotNull$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    d dVar = new d(vprVar, this.b);
                    placesMainMapOverlayInteractor$mapSelectedMapObjectModel$$inlined$mapNotNull$1$1.L$0 = null;
                    placesMainMapOverlayInteractor$mapSelectedMapObjectModel$$inlined$mapNotNull$1$1.L$1 = null;
                    placesMainMapOverlayInteractor$mapSelectedMapObjectModel$$inlined$mapNotNull$1$1.L$2 = null;
                    placesMainMapOverlayInteractor$mapSelectedMapObjectModel$$inlined$mapNotNull$1$1.label = 1;
                    if (this.a.collect(dVar, placesMainMapOverlayInteractor$mapSelectedMapObjectModel$$inlined$mapNotNull$1$1) == coroutineSingletons) {
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
        placesMainMapOverlayInteractor$mapSelectedMapObjectModel$$inlined$mapNotNull$1$1 = new PlacesMainMapOverlayInteractor$mapSelectedMapObjectModel$$inlined$mapNotNull$1$1(this, continuation);
        Object obj2 = placesMainMapOverlayInteractor$mapSelectedMapObjectModel$$inlined$mapNotNull$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = placesMainMapOverlayInteractor$mapSelectedMapObjectModel$$inlined$mapNotNull$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
