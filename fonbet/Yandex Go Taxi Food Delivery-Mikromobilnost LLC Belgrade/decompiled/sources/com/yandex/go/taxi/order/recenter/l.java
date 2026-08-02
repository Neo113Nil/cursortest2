package com.yandex.go.taxi.order.recenter;

import defpackage.hgi0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.map.overlay.RecenterType;

/* loaded from: classes14.dex */
public final class l implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ hgi0 b;

    public l(vpr vprVar, hgi0 hgi0Var) {
        this.a = vprVar;
        this.b = hgi0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        RecenterTypeInteractor$preferredRecenterTypeFlow$$inlined$map$3$2$1 recenterTypeInteractor$preferredRecenterTypeFlow$$inlined$map$3$2$1;
        int i;
        if (continuation instanceof RecenterTypeInteractor$preferredRecenterTypeFlow$$inlined$map$3$2$1) {
            recenterTypeInteractor$preferredRecenterTypeFlow$$inlined$map$3$2$1 = (RecenterTypeInteractor$preferredRecenterTypeFlow$$inlined$map$3$2$1) continuation;
            int i2 = recenterTypeInteractor$preferredRecenterTypeFlow$$inlined$map$3$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                recenterTypeInteractor$preferredRecenterTypeFlow$$inlined$map$3$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = recenterTypeInteractor$preferredRecenterTypeFlow$$inlined$map$3$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = recenterTypeInteractor$preferredRecenterTypeFlow$$inlined$map$3$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    RecenterType recenterType = (RecenterType) obj;
                    ArrayList arrayList = this.b.d.a.c;
                    if (arrayList.isEmpty()) {
                        arrayList = null;
                    }
                    if ((arrayList != null ? kotlin.collections.a.J0(arrayList) : null) != null) {
                        recenterType = RecenterType.SAVED_POSITION;
                    }
                    recenterTypeInteractor$preferredRecenterTypeFlow$$inlined$map$3$2$1.L$0 = null;
                    recenterTypeInteractor$preferredRecenterTypeFlow$$inlined$map$3$2$1.L$1 = null;
                    recenterTypeInteractor$preferredRecenterTypeFlow$$inlined$map$3$2$1.L$2 = null;
                    recenterTypeInteractor$preferredRecenterTypeFlow$$inlined$map$3$2$1.L$3 = null;
                    recenterTypeInteractor$preferredRecenterTypeFlow$$inlined$map$3$2$1.label = 1;
                    if (this.a.emit(recenterType, recenterTypeInteractor$preferredRecenterTypeFlow$$inlined$map$3$2$1) == coroutineSingletons) {
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
        recenterTypeInteractor$preferredRecenterTypeFlow$$inlined$map$3$2$1 = new RecenterTypeInteractor$preferredRecenterTypeFlow$$inlined$map$3$2$1(this, continuation);
        Object obj22 = recenterTypeInteractor$preferredRecenterTypeFlow$$inlined$map$3$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = recenterTypeInteractor$preferredRecenterTypeFlow$$inlined$map$3$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
