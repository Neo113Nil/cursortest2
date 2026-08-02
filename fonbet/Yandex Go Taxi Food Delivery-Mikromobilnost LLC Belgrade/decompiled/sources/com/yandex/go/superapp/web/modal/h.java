package com.yandex.go.superapp.web.modal;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class h implements tpr {
    public final /* synthetic */ f a;

    public h(f fVar) {
        this.a = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        WebApiPaymentsDelegate$onGooglePaySelectionUpdate$$inlined$map$2$1 webApiPaymentsDelegate$onGooglePaySelectionUpdate$$inlined$map$2$1;
        int i;
        if (continuation instanceof WebApiPaymentsDelegate$onGooglePaySelectionUpdate$$inlined$map$2$1) {
            webApiPaymentsDelegate$onGooglePaySelectionUpdate$$inlined$map$2$1 = (WebApiPaymentsDelegate$onGooglePaySelectionUpdate$$inlined$map$2$1) continuation;
            int i2 = webApiPaymentsDelegate$onGooglePaySelectionUpdate$$inlined$map$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                webApiPaymentsDelegate$onGooglePaySelectionUpdate$$inlined$map$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj = webApiPaymentsDelegate$onGooglePaySelectionUpdate$$inlined$map$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = webApiPaymentsDelegate$onGooglePaySelectionUpdate$$inlined$map$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    g gVar = new g(vprVar);
                    webApiPaymentsDelegate$onGooglePaySelectionUpdate$$inlined$map$2$1.L$0 = null;
                    webApiPaymentsDelegate$onGooglePaySelectionUpdate$$inlined$map$2$1.L$1 = null;
                    webApiPaymentsDelegate$onGooglePaySelectionUpdate$$inlined$map$2$1.L$2 = null;
                    webApiPaymentsDelegate$onGooglePaySelectionUpdate$$inlined$map$2$1.label = 1;
                    if (this.a.collect(gVar, webApiPaymentsDelegate$onGooglePaySelectionUpdate$$inlined$map$2$1) == coroutineSingletons) {
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
        webApiPaymentsDelegate$onGooglePaySelectionUpdate$$inlined$map$2$1 = new WebApiPaymentsDelegate$onGooglePaySelectionUpdate$$inlined$map$2$1(this, continuation);
        Object obj2 = webApiPaymentsDelegate$onGooglePaySelectionUpdate$$inlined$map$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = webApiPaymentsDelegate$onGooglePaySelectionUpdate$$inlined$map$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
