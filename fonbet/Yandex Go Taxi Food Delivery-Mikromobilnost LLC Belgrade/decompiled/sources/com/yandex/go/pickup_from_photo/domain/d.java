package com.yandex.go.pickup_from_photo.domain;

import com.yandex.go.pickup_from_photo.experiment.PickupPhotoRecognitionExperiment;
import defpackage.cpb0;
import defpackage.d6z;
import defpackage.dpb0;
import defpackage.epb0;
import defpackage.jl40;
import defpackage.npb0;
import defpackage.ny61;
import defpackage.ppb0;
import defpackage.qpb0;
import defpackage.tob0;
import defpackage.uob0;
import defpackage.vob0;
import defpackage.vpr;
import defpackage.w511;
import defpackage.wob0;
import defpackage.xob0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class d implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ f b;

    public d(vpr vprVar, f fVar) {
        this.a = vprVar;
        this.b = fVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0112, code lost:
    
        if (r11.emit(r13, r7) != r0) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        CameraScreenUiStateInteractor$special$$inlined$map$1$2$1 cameraScreenUiStateInteractor$special$$inlined$map$1$2$1;
        int i;
        Object a;
        vpr vprVar;
        if (continuation instanceof CameraScreenUiStateInteractor$special$$inlined$map$1$2$1) {
            cameraScreenUiStateInteractor$special$$inlined$map$1$2$1 = (CameraScreenUiStateInteractor$special$$inlined$map$1$2$1) continuation;
            int i2 = cameraScreenUiStateInteractor$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cameraScreenUiStateInteractor$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                CameraScreenUiStateInteractor$special$$inlined$map$1$2$1 cameraScreenUiStateInteractor$special$$inlined$map$1$2$12 = cameraScreenUiStateInteractor$special$$inlined$map$1$2$1;
                Object obj2 = cameraScreenUiStateInteractor$special$$inlined$map$1$2$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cameraScreenUiStateInteractor$special$$inlined$map$1$2$12.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    dpb0 dpb0Var = (dpb0) obj;
                    cameraScreenUiStateInteractor$special$$inlined$map$1$2$12.L$0 = null;
                    cameraScreenUiStateInteractor$special$$inlined$map$1$2$12.L$1 = null;
                    cameraScreenUiStateInteractor$special$$inlined$map$1$2$12.L$2 = null;
                    cameraScreenUiStateInteractor$special$$inlined$map$1$2$12.L$3 = null;
                    vpr vprVar2 = this.a;
                    cameraScreenUiStateInteractor$special$$inlined$map$1$2$12.L$4 = vprVar2;
                    cameraScreenUiStateInteractor$special$$inlined$map$1$2$12.L$5 = null;
                    cameraScreenUiStateInteractor$special$$inlined$map$1$2$12.L$6 = null;
                    cameraScreenUiStateInteractor$special$$inlined$map$1$2$12.label = 1;
                    f fVar = this.b;
                    com.yandex.go.pickup_from_photo.experiment.p pVar = fVar.b;
                    epb0 epb0Var = fVar.a;
                    if (dpb0Var instanceof tob0) {
                        tob0 tob0Var = (tob0) dpb0Var;
                        a = fVar.a(tob0Var.a, tob0Var.b, tob0Var.c, tob0Var.d, epb0Var.e, cameraScreenUiStateInteractor$special$$inlined$map$1$2$12);
                        if (a != coroutineSingletons) {
                            a = (qpb0) a;
                        }
                    } else if (jl40.l(dpb0Var, vob0.a)) {
                        PickupPhotoRecognitionExperiment b = pVar.b();
                        String Y = d6z.Y(b, b.g.a);
                        PickupPhotoRecognitionExperiment b2 = pVar.b();
                        a = new npb0(Y, d6z.Y(b2, b2.g.b));
                    } else if (jl40.l(dpb0Var, wob0.a)) {
                        a = ppb0.l;
                    } else if (dpb0Var instanceof cpb0) {
                        a = fVar.a(epb0Var.c, false, null, false, null, cameraScreenUiStateInteractor$special$$inlined$map$1$2$12);
                        if (a != coroutineSingletons) {
                            a = (qpb0) a;
                        }
                    } else {
                        if (!(dpb0Var instanceof uob0) && !jl40.l(dpb0Var, xob0.a)) {
                            w511.b();
                            return null;
                        }
                        a = fVar.a(0, true, null, false, null, cameraScreenUiStateInteractor$special$$inlined$map$1$2$12);
                        if (a != coroutineSingletons) {
                            a = (qpb0) a;
                        }
                    }
                    if (a != coroutineSingletons) {
                        obj2 = a;
                        vprVar = vprVar2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                    return zy11.a;
                }
                vprVar = (vpr) cameraScreenUiStateInteractor$special$$inlined$map$1$2$12.L$4;
                kotlin.b.b(obj2);
                cameraScreenUiStateInteractor$special$$inlined$map$1$2$12.L$0 = null;
                cameraScreenUiStateInteractor$special$$inlined$map$1$2$12.L$1 = null;
                cameraScreenUiStateInteractor$special$$inlined$map$1$2$12.L$2 = null;
                cameraScreenUiStateInteractor$special$$inlined$map$1$2$12.L$3 = null;
                cameraScreenUiStateInteractor$special$$inlined$map$1$2$12.L$4 = null;
                cameraScreenUiStateInteractor$special$$inlined$map$1$2$12.L$5 = null;
                cameraScreenUiStateInteractor$special$$inlined$map$1$2$12.L$6 = null;
                cameraScreenUiStateInteractor$special$$inlined$map$1$2$12.label = 2;
            }
        }
        cameraScreenUiStateInteractor$special$$inlined$map$1$2$1 = new CameraScreenUiStateInteractor$special$$inlined$map$1$2$1(this, continuation);
        CameraScreenUiStateInteractor$special$$inlined$map$1$2$1 cameraScreenUiStateInteractor$special$$inlined$map$1$2$122 = cameraScreenUiStateInteractor$special$$inlined$map$1$2$1;
        Object obj22 = cameraScreenUiStateInteractor$special$$inlined$map$1$2$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cameraScreenUiStateInteractor$special$$inlined$map$1$2$122.label;
        if (i != 0) {
        }
        cameraScreenUiStateInteractor$special$$inlined$map$1$2$122.L$0 = null;
        cameraScreenUiStateInteractor$special$$inlined$map$1$2$122.L$1 = null;
        cameraScreenUiStateInteractor$special$$inlined$map$1$2$122.L$2 = null;
        cameraScreenUiStateInteractor$special$$inlined$map$1$2$122.L$3 = null;
        cameraScreenUiStateInteractor$special$$inlined$map$1$2$122.L$4 = null;
        cameraScreenUiStateInteractor$special$$inlined$map$1$2$122.L$5 = null;
        cameraScreenUiStateInteractor$special$$inlined$map$1$2$122.L$6 = null;
        cameraScreenUiStateInteractor$special$$inlined$map$1$2$122.label = 2;
    }
}
