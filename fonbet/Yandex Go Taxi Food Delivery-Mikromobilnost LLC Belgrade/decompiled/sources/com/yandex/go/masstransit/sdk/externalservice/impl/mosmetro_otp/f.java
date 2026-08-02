package com.yandex.go.masstransit.sdk.externalservice.impl.mosmetro_otp;

import defpackage.h930;
import defpackage.j930;
import defpackage.ny61;
import defpackage.q930;
import defpackage.r930;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class f implements vpr {
    public final /* synthetic */ vpr a;

    public f(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        MosmetroOtpUiStateInteractor$mapToUiState$$inlined$map$2$2$1 mosmetroOtpUiStateInteractor$mapToUiState$$inlined$map$2$2$1;
        int i;
        j930 j930Var;
        if (continuation instanceof MosmetroOtpUiStateInteractor$mapToUiState$$inlined$map$2$2$1) {
            mosmetroOtpUiStateInteractor$mapToUiState$$inlined$map$2$2$1 = (MosmetroOtpUiStateInteractor$mapToUiState$$inlined$map$2$2$1) continuation;
            int i2 = mosmetroOtpUiStateInteractor$mapToUiState$$inlined$map$2$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mosmetroOtpUiStateInteractor$mapToUiState$$inlined$map$2$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = mosmetroOtpUiStateInteractor$mapToUiState$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mosmetroOtpUiStateInteractor$mapToUiState$$inlined$map$2$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    r930 r930Var = ((h930) obj).a;
                    q930 q930Var = r930Var instanceof q930 ? (q930) r930Var : null;
                    String str = (q930Var == null || (j930Var = q930Var.a.b) == null) ? null : j930Var.b;
                    mosmetroOtpUiStateInteractor$mapToUiState$$inlined$map$2$2$1.L$0 = null;
                    mosmetroOtpUiStateInteractor$mapToUiState$$inlined$map$2$2$1.L$1 = null;
                    mosmetroOtpUiStateInteractor$mapToUiState$$inlined$map$2$2$1.L$2 = null;
                    mosmetroOtpUiStateInteractor$mapToUiState$$inlined$map$2$2$1.L$3 = null;
                    mosmetroOtpUiStateInteractor$mapToUiState$$inlined$map$2$2$1.label = 1;
                    if (this.a.emit(str, mosmetroOtpUiStateInteractor$mapToUiState$$inlined$map$2$2$1) == coroutineSingletons) {
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
        mosmetroOtpUiStateInteractor$mapToUiState$$inlined$map$2$2$1 = new MosmetroOtpUiStateInteractor$mapToUiState$$inlined$map$2$2$1(this, continuation);
        Object obj22 = mosmetroOtpUiStateInteractor$mapToUiState$$inlined$map$2$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mosmetroOtpUiStateInteractor$mapToUiState$$inlined$map$2$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
