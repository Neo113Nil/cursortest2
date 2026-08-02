package com.yandex.go.taxi.order.recenter;

import defpackage.hgi0;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class e implements tpr {
    public final /* synthetic */ i a;
    public final /* synthetic */ hgi0 b;

    public e(i iVar, hgi0 hgi0Var) {
        this.a = iVar;
        this.b = hgi0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        RecenterTypeInteractor$preferredRecenterTypeFlow$$inlined$filter$1$1 recenterTypeInteractor$preferredRecenterTypeFlow$$inlined$filter$1$1;
        int i;
        if (continuation instanceof RecenterTypeInteractor$preferredRecenterTypeFlow$$inlined$filter$1$1) {
            recenterTypeInteractor$preferredRecenterTypeFlow$$inlined$filter$1$1 = (RecenterTypeInteractor$preferredRecenterTypeFlow$$inlined$filter$1$1) continuation;
            int i2 = recenterTypeInteractor$preferredRecenterTypeFlow$$inlined$filter$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                recenterTypeInteractor$preferredRecenterTypeFlow$$inlined$filter$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = recenterTypeInteractor$preferredRecenterTypeFlow$$inlined$filter$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = recenterTypeInteractor$preferredRecenterTypeFlow$$inlined$filter$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    d dVar = new d(vprVar, this.b);
                    recenterTypeInteractor$preferredRecenterTypeFlow$$inlined$filter$1$1.L$0 = null;
                    recenterTypeInteractor$preferredRecenterTypeFlow$$inlined$filter$1$1.L$1 = null;
                    recenterTypeInteractor$preferredRecenterTypeFlow$$inlined$filter$1$1.L$2 = null;
                    recenterTypeInteractor$preferredRecenterTypeFlow$$inlined$filter$1$1.label = 1;
                    if (this.a.collect(dVar, recenterTypeInteractor$preferredRecenterTypeFlow$$inlined$filter$1$1) == coroutineSingletons) {
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
        recenterTypeInteractor$preferredRecenterTypeFlow$$inlined$filter$1$1 = new RecenterTypeInteractor$preferredRecenterTypeFlow$$inlined$filter$1$1(this, continuation);
        Object obj2 = recenterTypeInteractor$preferredRecenterTypeFlow$$inlined$filter$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = recenterTypeInteractor$preferredRecenterTypeFlow$$inlined$filter$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
