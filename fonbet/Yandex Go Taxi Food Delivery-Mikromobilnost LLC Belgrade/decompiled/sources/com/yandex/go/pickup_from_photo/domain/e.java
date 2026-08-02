package com.yandex.go.pickup_from_photo.domain;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes13.dex */
public final class e implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ f b;

    public e(r0 r0Var, f fVar) {
        this.a = r0Var;
        this.b = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        CameraScreenUiStateInteractor$special$$inlined$map$1$1 cameraScreenUiStateInteractor$special$$inlined$map$1$1;
        int i;
        if (continuation instanceof CameraScreenUiStateInteractor$special$$inlined$map$1$1) {
            cameraScreenUiStateInteractor$special$$inlined$map$1$1 = (CameraScreenUiStateInteractor$special$$inlined$map$1$1) continuation;
            int i2 = cameraScreenUiStateInteractor$special$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cameraScreenUiStateInteractor$special$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = cameraScreenUiStateInteractor$special$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cameraScreenUiStateInteractor$special$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    d dVar = new d(vprVar, this.b);
                    cameraScreenUiStateInteractor$special$$inlined$map$1$1.L$0 = null;
                    cameraScreenUiStateInteractor$special$$inlined$map$1$1.L$1 = null;
                    cameraScreenUiStateInteractor$special$$inlined$map$1$1.L$2 = null;
                    cameraScreenUiStateInteractor$special$$inlined$map$1$1.label = 1;
                    if (this.a.collect(dVar, cameraScreenUiStateInteractor$special$$inlined$map$1$1) == coroutineSingletons) {
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
        cameraScreenUiStateInteractor$special$$inlined$map$1$1 = new CameraScreenUiStateInteractor$special$$inlined$map$1$1(this, continuation);
        Object obj2 = cameraScreenUiStateInteractor$special$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cameraScreenUiStateInteractor$special$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
