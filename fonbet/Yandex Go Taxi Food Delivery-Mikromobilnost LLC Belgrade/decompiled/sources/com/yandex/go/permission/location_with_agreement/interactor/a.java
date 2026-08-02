package com.yandex.go.permission.location_with_agreement.interactor;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ e b;

    public a(vpr vprVar, e eVar) {
        this.a = vprVar;
        this.b = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        LocationPermissionWithAgreementShowInteractorImpl$locationPermissionRequestWasNotShown$$inlined$map$1$2$1 locationPermissionWithAgreementShowInteractorImpl$locationPermissionRequestWasNotShown$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof LocationPermissionWithAgreementShowInteractorImpl$locationPermissionRequestWasNotShown$$inlined$map$1$2$1) {
            locationPermissionWithAgreementShowInteractorImpl$locationPermissionRequestWasNotShown$$inlined$map$1$2$1 = (LocationPermissionWithAgreementShowInteractorImpl$locationPermissionRequestWasNotShown$$inlined$map$1$2$1) continuation;
            int i2 = locationPermissionWithAgreementShowInteractorImpl$locationPermissionRequestWasNotShown$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                locationPermissionWithAgreementShowInteractorImpl$locationPermissionRequestWasNotShown$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = locationPermissionWithAgreementShowInteractorImpl$locationPermissionRequestWasNotShown$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = locationPermissionWithAgreementShowInteractorImpl$locationPermissionRequestWasNotShown$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Boolean valueOf = Boolean.valueOf((((Boolean) obj).booleanValue() || ((com.yandex.go.permission.b) this.b.a.a).a(15)) ? false : true);
                    locationPermissionWithAgreementShowInteractorImpl$locationPermissionRequestWasNotShown$$inlined$map$1$2$1.L$0 = null;
                    locationPermissionWithAgreementShowInteractorImpl$locationPermissionRequestWasNotShown$$inlined$map$1$2$1.L$1 = null;
                    locationPermissionWithAgreementShowInteractorImpl$locationPermissionRequestWasNotShown$$inlined$map$1$2$1.L$2 = null;
                    locationPermissionWithAgreementShowInteractorImpl$locationPermissionRequestWasNotShown$$inlined$map$1$2$1.L$3 = null;
                    locationPermissionWithAgreementShowInteractorImpl$locationPermissionRequestWasNotShown$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(valueOf, locationPermissionWithAgreementShowInteractorImpl$locationPermissionRequestWasNotShown$$inlined$map$1$2$1) == coroutineSingletons) {
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
        locationPermissionWithAgreementShowInteractorImpl$locationPermissionRequestWasNotShown$$inlined$map$1$2$1 = new LocationPermissionWithAgreementShowInteractorImpl$locationPermissionRequestWasNotShown$$inlined$map$1$2$1(this, continuation);
        Object obj22 = locationPermissionWithAgreementShowInteractorImpl$locationPermissionRequestWasNotShown$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = locationPermissionWithAgreementShowInteractorImpl$locationPermissionRequestWasNotShown$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
