package com.yandex.go.payments.googlepay.domain;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.o;

/* loaded from: classes13.dex */
public final class d implements tpr {
    public final /* synthetic */ o a;
    public final /* synthetic */ e b;

    public d(o oVar, e eVar) {
        this.a = oVar;
        this.b = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        GooglePayInteractorImpl$requestGooglePayCardId$$inlined$map$1$1 googlePayInteractorImpl$requestGooglePayCardId$$inlined$map$1$1;
        int i;
        if (continuation instanceof GooglePayInteractorImpl$requestGooglePayCardId$$inlined$map$1$1) {
            googlePayInteractorImpl$requestGooglePayCardId$$inlined$map$1$1 = (GooglePayInteractorImpl$requestGooglePayCardId$$inlined$map$1$1) continuation;
            int i2 = googlePayInteractorImpl$requestGooglePayCardId$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                googlePayInteractorImpl$requestGooglePayCardId$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = googlePayInteractorImpl$requestGooglePayCardId$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = googlePayInteractorImpl$requestGooglePayCardId$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    c cVar = new c(vprVar, this.b);
                    googlePayInteractorImpl$requestGooglePayCardId$$inlined$map$1$1.L$0 = null;
                    googlePayInteractorImpl$requestGooglePayCardId$$inlined$map$1$1.L$1 = null;
                    googlePayInteractorImpl$requestGooglePayCardId$$inlined$map$1$1.L$2 = null;
                    googlePayInteractorImpl$requestGooglePayCardId$$inlined$map$1$1.label = 1;
                    if (this.a.collect(cVar, googlePayInteractorImpl$requestGooglePayCardId$$inlined$map$1$1) == coroutineSingletons) {
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
        googlePayInteractorImpl$requestGooglePayCardId$$inlined$map$1$1 = new GooglePayInteractorImpl$requestGooglePayCardId$$inlined$map$1$1(this, continuation);
        Object obj2 = googlePayInteractorImpl$requestGooglePayCardId$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = googlePayInteractorImpl$requestGooglePayCardId$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
