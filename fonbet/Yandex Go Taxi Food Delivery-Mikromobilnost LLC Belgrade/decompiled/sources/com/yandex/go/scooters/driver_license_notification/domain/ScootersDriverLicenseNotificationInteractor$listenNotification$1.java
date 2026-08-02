package com.yandex.go.scooters.driver_license_notification.domain;

import com.yandex.go.scooters.driver_license.api.domain.model.ScootersDriverLicenseVerificationStatus;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.xno0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lxno0;", "topBannerCommunication", "Lcom/yandex/go/scooters/driver_license/api/domain/model/ScootersDriverLicenseVerificationStatus;", "authStatus", "<anonymous>", "(Lxno0;Lcom/yandex/go/scooters/driver_license/api/domain/model/ScootersDriverLicenseVerificationStatus;)Lxno0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.driver_license_notification.domain.ScootersDriverLicenseNotificationInteractor$listenNotification$1", f = "ScootersDriverLicenseNotificationInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersDriverLicenseNotificationInteractor$listenNotification$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ScootersDriverLicenseNotificationInteractor$listenNotification$1 scootersDriverLicenseNotificationInteractor$listenNotification$1 = new ScootersDriverLicenseNotificationInteractor$listenNotification$1(3, (Continuation) obj3);
        scootersDriverLicenseNotificationInteractor$listenNotification$1.L$0 = (xno0) obj;
        scootersDriverLicenseNotificationInteractor$listenNotification$1.L$1 = (ScootersDriverLicenseVerificationStatus) obj2;
        return scootersDriverLicenseNotificationInteractor$listenNotification$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        xno0 xno0Var = (xno0) this.L$0;
        ScootersDriverLicenseVerificationStatus scootersDriverLicenseVerificationStatus = (ScootersDriverLicenseVerificationStatus) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (scootersDriverLicenseVerificationStatus == ScootersDriverLicenseVerificationStatus.FAILED || (xno0Var != null && scootersDriverLicenseVerificationStatus == null)) {
            return xno0Var;
        }
        return null;
    }
}
