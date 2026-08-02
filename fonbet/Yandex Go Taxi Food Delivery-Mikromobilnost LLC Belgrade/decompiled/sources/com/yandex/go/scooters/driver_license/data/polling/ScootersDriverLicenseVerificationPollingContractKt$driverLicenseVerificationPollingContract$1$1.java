package com.yandex.go.scooters.driver_license.data.polling;

import com.yandex.go.scooters.driver_license.api.domain.model.ScootersDriverLicenseVerificationStatus;
import com.yandex.go.scooters.driver_license.data.model.ScootersDriverLicenseVerificationStatusDto;
import defpackage.djn0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lcom/yandex/go/scooters/driver_license/data/model/ScootersDriverLicenseVerificationStatusDto;", "<unused var>", ""}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.scooters.driver_license.data.polling.ScootersDriverLicenseVerificationPollingContractKt$driverLicenseVerificationPollingContract$1$1", f = "ScootersDriverLicenseVerificationPollingContract.kt", l = {17}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersDriverLicenseVerificationPollingContractKt$driverLicenseVerificationPollingContract$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ com.yandex.go.scooters.driver_license.data.a $driverLicenseRepository;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersDriverLicenseVerificationPollingContractKt$driverLicenseVerificationPollingContract$1$1(com.yandex.go.scooters.driver_license.data.a aVar, Continuation continuation) {
        super(2, continuation);
        this.$driverLicenseRepository = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersDriverLicenseVerificationPollingContractKt$driverLicenseVerificationPollingContract$1$1(this.$driverLicenseRepository, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersDriverLicenseVerificationPollingContractKt$driverLicenseVerificationPollingContract$1$1) create((String) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            com.yandex.go.scooters.driver_license.data.a aVar = this.$driverLicenseRepository;
            this.label = 1;
            obj = aVar.a(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        ScootersDriverLicenseVerificationStatusDto scootersDriverLicenseVerificationStatusDto = (ScootersDriverLicenseVerificationStatusDto) obj;
        int i2 = scootersDriverLicenseVerificationStatusDto == null ? -1 : djn0.a[scootersDriverLicenseVerificationStatusDto.ordinal()];
        if (i2 == 1) {
            this.$driverLicenseRepository.c.l(ScootersDriverLicenseVerificationStatus.VERIFIED);
            return scootersDriverLicenseVerificationStatusDto;
        }
        com.yandex.go.scooters.driver_license.data.a aVar2 = this.$driverLicenseRepository;
        if (i2 == 2) {
            aVar2.c.l(ScootersDriverLicenseVerificationStatus.FAILED);
            return scootersDriverLicenseVerificationStatusDto;
        }
        if (i2 != 3) {
            aVar2.c.l(null);
            return null;
        }
        aVar2.c.l(ScootersDriverLicenseVerificationStatus.PENDING);
        return scootersDriverLicenseVerificationStatusDto;
    }
}
