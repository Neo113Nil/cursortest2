package com.yandex.go.payments.googlepay.domain;

import com.yandex.go.payments.data.model.BindGooglePayResponse;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.vg10;
import defpackage.vpr;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;

    public c(vpr vprVar, e eVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        GooglePayInteractorImpl$requestGooglePayCardId$$inlined$map$1$2$1 googlePayInteractorImpl$requestGooglePayCardId$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof GooglePayInteractorImpl$requestGooglePayCardId$$inlined$map$1$2$1) {
            googlePayInteractorImpl$requestGooglePayCardId$$inlined$map$1$2$1 = (GooglePayInteractorImpl$requestGooglePayCardId$$inlined$map$1$2$1) continuation;
            int i2 = googlePayInteractorImpl$requestGooglePayCardId$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                googlePayInteractorImpl$requestGooglePayCardId$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = googlePayInteractorImpl$requestGooglePayCardId$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = googlePayInteractorImpl$requestGooglePayCardId$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    BindGooglePayResponse bindGooglePayResponse = (BindGooglePayResponse) obj;
                    List list = e.x;
                    String str = bindGooglePayResponse.b;
                    if (!jl40.l(bindGooglePayResponse.a, "success") || str == null || str.length() == 0) {
                        vg10.r(bindGooglePayResponse, "Bind GooglePay error response: ");
                        return null;
                    }
                    googlePayInteractorImpl$requestGooglePayCardId$$inlined$map$1$2$1.L$0 = null;
                    googlePayInteractorImpl$requestGooglePayCardId$$inlined$map$1$2$1.L$1 = null;
                    googlePayInteractorImpl$requestGooglePayCardId$$inlined$map$1$2$1.L$2 = null;
                    googlePayInteractorImpl$requestGooglePayCardId$$inlined$map$1$2$1.L$3 = null;
                    googlePayInteractorImpl$requestGooglePayCardId$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(str, googlePayInteractorImpl$requestGooglePayCardId$$inlined$map$1$2$1) == coroutineSingletons) {
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
        googlePayInteractorImpl$requestGooglePayCardId$$inlined$map$1$2$1 = new GooglePayInteractorImpl$requestGooglePayCardId$$inlined$map$1$2$1(this, continuation);
        Object obj22 = googlePayInteractorImpl$requestGooglePayCardId$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = googlePayInteractorImpl$requestGooglePayCardId$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
