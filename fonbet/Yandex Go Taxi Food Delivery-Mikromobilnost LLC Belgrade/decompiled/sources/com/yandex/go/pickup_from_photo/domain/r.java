package com.yandex.go.pickup_from_photo.domain;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class r implements tpr {
    public final /* synthetic */ p a;
    public final /* synthetic */ s b;

    public r(p pVar, s sVar) {
        this.a = pVar;
        this.b = sVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        RecognitionSuccessUiStateInteractor$special$$inlined$map$1$1 recognitionSuccessUiStateInteractor$special$$inlined$map$1$1;
        int i;
        if (continuation instanceof RecognitionSuccessUiStateInteractor$special$$inlined$map$1$1) {
            recognitionSuccessUiStateInteractor$special$$inlined$map$1$1 = (RecognitionSuccessUiStateInteractor$special$$inlined$map$1$1) continuation;
            int i2 = recognitionSuccessUiStateInteractor$special$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                recognitionSuccessUiStateInteractor$special$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = recognitionSuccessUiStateInteractor$special$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = recognitionSuccessUiStateInteractor$special$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    q qVar = new q(vprVar, this.b);
                    recognitionSuccessUiStateInteractor$special$$inlined$map$1$1.L$0 = null;
                    recognitionSuccessUiStateInteractor$special$$inlined$map$1$1.L$1 = null;
                    recognitionSuccessUiStateInteractor$special$$inlined$map$1$1.L$2 = null;
                    recognitionSuccessUiStateInteractor$special$$inlined$map$1$1.label = 1;
                    if (this.a.collect(qVar, recognitionSuccessUiStateInteractor$special$$inlined$map$1$1) == coroutineSingletons) {
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
        recognitionSuccessUiStateInteractor$special$$inlined$map$1$1 = new RecognitionSuccessUiStateInteractor$special$$inlined$map$1$1(this, continuation);
        Object obj2 = recognitionSuccessUiStateInteractor$special$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = recognitionSuccessUiStateInteractor$special$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
