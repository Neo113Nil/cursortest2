package com.yandex.go.pickup_from_photo.domain;

import defpackage.cpb0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class o implements vpr {
    public final /* synthetic */ vpr a;

    public o(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        RecognitionSuccessUiStateInteractor$special$$inlined$filterIsInstance$1$2$1 recognitionSuccessUiStateInteractor$special$$inlined$filterIsInstance$1$2$1;
        int i;
        if (continuation instanceof RecognitionSuccessUiStateInteractor$special$$inlined$filterIsInstance$1$2$1) {
            recognitionSuccessUiStateInteractor$special$$inlined$filterIsInstance$1$2$1 = (RecognitionSuccessUiStateInteractor$special$$inlined$filterIsInstance$1$2$1) continuation;
            int i2 = recognitionSuccessUiStateInteractor$special$$inlined$filterIsInstance$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                recognitionSuccessUiStateInteractor$special$$inlined$filterIsInstance$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = recognitionSuccessUiStateInteractor$special$$inlined$filterIsInstance$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = recognitionSuccessUiStateInteractor$special$$inlined$filterIsInstance$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    if (obj instanceof cpb0) {
                        recognitionSuccessUiStateInteractor$special$$inlined$filterIsInstance$1$2$1.L$0 = null;
                        recognitionSuccessUiStateInteractor$special$$inlined$filterIsInstance$1$2$1.L$1 = null;
                        recognitionSuccessUiStateInteractor$special$$inlined$filterIsInstance$1$2$1.L$2 = null;
                        recognitionSuccessUiStateInteractor$special$$inlined$filterIsInstance$1$2$1.L$3 = null;
                        recognitionSuccessUiStateInteractor$special$$inlined$filterIsInstance$1$2$1.label = 1;
                        if (this.a.emit(obj, recognitionSuccessUiStateInteractor$special$$inlined$filterIsInstance$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
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
        recognitionSuccessUiStateInteractor$special$$inlined$filterIsInstance$1$2$1 = new RecognitionSuccessUiStateInteractor$special$$inlined$filterIsInstance$1$2$1(this, continuation);
        Object obj22 = recognitionSuccessUiStateInteractor$special$$inlined$filterIsInstance$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = recognitionSuccessUiStateInteractor$special$$inlined$filterIsInstance$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
