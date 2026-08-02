package com.yandex.go.permission.location_with_agreement.interactor;

import com.yandex.go.permission.location_with_agreement.experiment.ExplainingLocationPermissionScreenWithAgreementV2Experiment;
import defpackage.bms;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "v1Enabled", "v2Experiment", "Lcom/yandex/go/permission/location_with_agreement/experiment/ExplainingLocationPermissionScreenWithAgreementV2Experiment;", "locationPermissionRequestWasNotShown"}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.permission.location_with_agreement.interactor.LocationPermissionWithAgreementShowInteractorImpl$shouldShow$2", f = "LocationPermissionWithAgreementShowInteractorImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class LocationPermissionWithAgreementShowInteractorImpl$shouldShow$2 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    /* synthetic */ boolean Z$1;
    int label;

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj3).booleanValue();
        LocationPermissionWithAgreementShowInteractorImpl$shouldShow$2 locationPermissionWithAgreementShowInteractorImpl$shouldShow$2 = new LocationPermissionWithAgreementShowInteractorImpl$shouldShow$2(4, (Continuation) obj4);
        locationPermissionWithAgreementShowInteractorImpl$shouldShow$2.Z$0 = booleanValue;
        locationPermissionWithAgreementShowInteractorImpl$shouldShow$2.L$0 = (ExplainingLocationPermissionScreenWithAgreementV2Experiment) obj2;
        locationPermissionWithAgreementShowInteractorImpl$shouldShow$2.Z$1 = booleanValue2;
        return locationPermissionWithAgreementShowInteractorImpl$shouldShow$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z = this.Z$0;
        ExplainingLocationPermissionScreenWithAgreementV2Experiment explainingLocationPermissionScreenWithAgreementV2Experiment = (ExplainingLocationPermissionScreenWithAgreementV2Experiment) this.L$0;
        boolean z2 = this.Z$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        boolean z3 = explainingLocationPermissionScreenWithAgreementV2Experiment.b;
        if (z3 && explainingLocationPermissionScreenWithAgreementV2Experiment.j) {
            z = false;
        } else if (z3) {
            z = true;
        }
        return Boolean.valueOf(z && z2);
    }
}
