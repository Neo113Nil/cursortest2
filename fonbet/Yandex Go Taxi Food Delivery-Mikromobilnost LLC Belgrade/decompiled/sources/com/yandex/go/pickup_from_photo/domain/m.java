package com.yandex.go.pickup_from_photo.domain;

import com.yandex.go.pickup_from_photo.experiment.PickupPhotoRecognitionExperiment;
import defpackage.ahi0;
import defpackage.avj0;
import defpackage.d6z;
import defpackage.kyh0;
import defpackage.ny61;
import defpackage.sgi0;
import defpackage.tgi0;
import defpackage.vgi0;
import defpackage.vpr;
import defpackage.zgi0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class m implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ ahi0 b;

    public m(vpr vprVar, ahi0 ahi0Var) {
        this.a = vprVar;
        this.b = ahi0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        RecognitionErrorUiStateInteractor$special$$inlined$map$1$2$1 recognitionErrorUiStateInteractor$special$$inlined$map$1$2$1;
        int i;
        ahi0 ahi0Var = this.b;
        com.yandex.go.pickup_from_photo.experiment.p pVar = ahi0Var.b;
        if (continuation instanceof RecognitionErrorUiStateInteractor$special$$inlined$map$1$2$1) {
            recognitionErrorUiStateInteractor$special$$inlined$map$1$2$1 = (RecognitionErrorUiStateInteractor$special$$inlined$map$1$2$1) continuation;
            int i2 = recognitionErrorUiStateInteractor$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                recognitionErrorUiStateInteractor$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = recognitionErrorUiStateInteractor$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = recognitionErrorUiStateInteractor$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    PickupPhotoRecognitionExperiment b = pVar.b();
                    String str = b.h.d;
                    String Y = str != null ? d6z.Y(b, str) : null;
                    vgi0 vgi0Var = Y == null ? sgi0.a : tgi0.a;
                    if (Y == null) {
                        Y = ((avj0) ahi0Var.c).h(kyh0.common_close);
                    }
                    String str2 = Y;
                    PickupPhotoRecognitionExperiment b2 = pVar.b();
                    String Y2 = d6z.Y(b2, b2.h.a);
                    PickupPhotoRecognitionExperiment b3 = pVar.b();
                    String Y3 = d6z.Y(b3, b3.h.b);
                    PickupPhotoRecognitionExperiment b4 = pVar.b();
                    zgi0 zgi0Var = new zgi0(Y2, Y3, str2, d6z.Y(b4, b4.h.c), vgi0Var);
                    recognitionErrorUiStateInteractor$special$$inlined$map$1$2$1.L$0 = null;
                    recognitionErrorUiStateInteractor$special$$inlined$map$1$2$1.L$1 = null;
                    recognitionErrorUiStateInteractor$special$$inlined$map$1$2$1.L$2 = null;
                    recognitionErrorUiStateInteractor$special$$inlined$map$1$2$1.L$3 = null;
                    recognitionErrorUiStateInteractor$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(zgi0Var, recognitionErrorUiStateInteractor$special$$inlined$map$1$2$1) == coroutineSingletons) {
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
        recognitionErrorUiStateInteractor$special$$inlined$map$1$2$1 = new RecognitionErrorUiStateInteractor$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = recognitionErrorUiStateInteractor$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = recognitionErrorUiStateInteractor$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
