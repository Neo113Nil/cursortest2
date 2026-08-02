package com.yandex.go.places.impl.ui.main.map.overlay;

import defpackage.in00;
import defpackage.kn00;
import defpackage.ny61;
import defpackage.qac0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class d implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ qac0 b;

    public d(vpr vprVar, qac0 qac0Var) {
        this.a = vprVar;
        this.b = qac0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a5, code lost:
    
        if (r7.emit(r9, r0) == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        PlacesMainMapOverlayInteractor$mapSelectedMapObjectModel$$inlined$mapNotNull$1$2$1 placesMainMapOverlayInteractor$mapSelectedMapObjectModel$$inlined$mapNotNull$1$2$1;
        int i;
        Object obj2;
        vpr vprVar;
        kn00 kn00Var;
        if (continuation instanceof PlacesMainMapOverlayInteractor$mapSelectedMapObjectModel$$inlined$mapNotNull$1$2$1) {
            placesMainMapOverlayInteractor$mapSelectedMapObjectModel$$inlined$mapNotNull$1$2$1 = (PlacesMainMapOverlayInteractor$mapSelectedMapObjectModel$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = placesMainMapOverlayInteractor$mapSelectedMapObjectModel$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                placesMainMapOverlayInteractor$mapSelectedMapObjectModel$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = placesMainMapOverlayInteractor$mapSelectedMapObjectModel$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = placesMainMapOverlayInteractor$mapSelectedMapObjectModel$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    com.yandex.go.places.models.data.entities.network.map.e eVar = (com.yandex.go.places.models.data.entities.network.map.e) obj;
                    placesMainMapOverlayInteractor$mapSelectedMapObjectModel$$inlined$mapNotNull$1$2$1.L$0 = null;
                    placesMainMapOverlayInteractor$mapSelectedMapObjectModel$$inlined$mapNotNull$1$2$1.L$1 = null;
                    placesMainMapOverlayInteractor$mapSelectedMapObjectModel$$inlined$mapNotNull$1$2$1.L$2 = null;
                    vpr vprVar2 = this.a;
                    placesMainMapOverlayInteractor$mapSelectedMapObjectModel$$inlined$mapNotNull$1$2$1.L$3 = vprVar2;
                    placesMainMapOverlayInteractor$mapSelectedMapObjectModel$$inlined$mapNotNull$1$2$1.L$4 = null;
                    placesMainMapOverlayInteractor$mapSelectedMapObjectModel$$inlined$mapNotNull$1$2$1.L$5 = null;
                    placesMainMapOverlayInteractor$mapSelectedMapObjectModel$$inlined$mapNotNull$1$2$1.label = 1;
                    qac0 qac0Var = this.b;
                    if (eVar != null) {
                        obj2 = qac0Var.c.n(eVar, placesMainMapOverlayInteractor$mapSelectedMapObjectModel$$inlined$mapNotNull$1$2$1);
                        if (obj2 != coroutineSingletons) {
                            obj2 = (kn00) obj2;
                        }
                    } else {
                        qac0Var.getClass();
                        obj2 = null;
                    }
                    if (obj2 != coroutineSingletons) {
                        obj3 = obj2;
                        vprVar = vprVar2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj3);
                    return zy11.a;
                }
                vprVar = (vpr) placesMainMapOverlayInteractor$mapSelectedMapObjectModel$$inlined$mapNotNull$1$2$1.L$3;
                kotlin.b.b(obj3);
                kn00Var = (kn00) obj3;
                if ((kn00Var instanceof in00) || !((in00) kn00Var).b()) {
                    kn00Var = null;
                }
                if (kn00Var != null) {
                    placesMainMapOverlayInteractor$mapSelectedMapObjectModel$$inlined$mapNotNull$1$2$1.L$0 = null;
                    placesMainMapOverlayInteractor$mapSelectedMapObjectModel$$inlined$mapNotNull$1$2$1.L$1 = null;
                    placesMainMapOverlayInteractor$mapSelectedMapObjectModel$$inlined$mapNotNull$1$2$1.L$2 = null;
                    placesMainMapOverlayInteractor$mapSelectedMapObjectModel$$inlined$mapNotNull$1$2$1.L$3 = null;
                    placesMainMapOverlayInteractor$mapSelectedMapObjectModel$$inlined$mapNotNull$1$2$1.L$4 = null;
                    placesMainMapOverlayInteractor$mapSelectedMapObjectModel$$inlined$mapNotNull$1$2$1.L$5 = null;
                    placesMainMapOverlayInteractor$mapSelectedMapObjectModel$$inlined$mapNotNull$1$2$1.label = 2;
                }
                return zy11.a;
            }
        }
        placesMainMapOverlayInteractor$mapSelectedMapObjectModel$$inlined$mapNotNull$1$2$1 = new PlacesMainMapOverlayInteractor$mapSelectedMapObjectModel$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj32 = placesMainMapOverlayInteractor$mapSelectedMapObjectModel$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = placesMainMapOverlayInteractor$mapSelectedMapObjectModel$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        kn00Var = (kn00) obj32;
        if (kn00Var instanceof in00) {
        }
        kn00Var = null;
        if (kn00Var != null) {
        }
        return zy11.a;
    }
}
