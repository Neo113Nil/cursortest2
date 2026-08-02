package com.yandex.go.masstransit.sdk.externalservice.impl.mosmetro_otp;

import defpackage.gci0;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class g implements tpr {
    public final /* synthetic */ gci0 a;

    public g(gci0 gci0Var) {
        this.a = gci0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        MosmetroOtpUiStateInteractor$mapToUiState$$inlined$map$2$1 mosmetroOtpUiStateInteractor$mapToUiState$$inlined$map$2$1;
        int i;
        if (continuation instanceof MosmetroOtpUiStateInteractor$mapToUiState$$inlined$map$2$1) {
            mosmetroOtpUiStateInteractor$mapToUiState$$inlined$map$2$1 = (MosmetroOtpUiStateInteractor$mapToUiState$$inlined$map$2$1) continuation;
            int i2 = mosmetroOtpUiStateInteractor$mapToUiState$$inlined$map$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mosmetroOtpUiStateInteractor$mapToUiState$$inlined$map$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mosmetroOtpUiStateInteractor$mapToUiState$$inlined$map$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mosmetroOtpUiStateInteractor$mapToUiState$$inlined$map$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    f fVar = new f(vprVar);
                    mosmetroOtpUiStateInteractor$mapToUiState$$inlined$map$2$1.L$0 = null;
                    mosmetroOtpUiStateInteractor$mapToUiState$$inlined$map$2$1.L$1 = null;
                    mosmetroOtpUiStateInteractor$mapToUiState$$inlined$map$2$1.L$2 = null;
                    mosmetroOtpUiStateInteractor$mapToUiState$$inlined$map$2$1.label = 1;
                    if (this.a.a.collect(fVar, mosmetroOtpUiStateInteractor$mapToUiState$$inlined$map$2$1) == coroutineSingletons) {
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
        mosmetroOtpUiStateInteractor$mapToUiState$$inlined$map$2$1 = new MosmetroOtpUiStateInteractor$mapToUiState$$inlined$map$2$1(this, continuation);
        Object obj2 = mosmetroOtpUiStateInteractor$mapToUiState$$inlined$map$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mosmetroOtpUiStateInteractor$mapToUiState$$inlined$map$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
