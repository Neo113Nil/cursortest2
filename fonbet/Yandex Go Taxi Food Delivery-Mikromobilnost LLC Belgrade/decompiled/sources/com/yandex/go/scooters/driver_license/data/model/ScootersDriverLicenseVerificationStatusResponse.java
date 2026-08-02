package com.yandex.go.scooters.driver_license.data.model;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.s3n0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/scooters/driver_license/data/model/ScootersDriverLicenseVerificationStatusResponse;", "", "Companion", "$serializer", "com/yandex/go/scooters/driver_license/data/model/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersDriverLicenseVerificationStatusResponse {
    public static final b Companion = new b();
    public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new s3n0(14)), null};
    public final ScootersDriverLicenseVerificationStatusDto a;
    public final ScootersDriverLicenseFailureReasonDto b;

    public /* synthetic */ ScootersDriverLicenseVerificationStatusResponse(int i, ScootersDriverLicenseVerificationStatusDto scootersDriverLicenseVerificationStatusDto, ScootersDriverLicenseFailureReasonDto scootersDriverLicenseFailureReasonDto) {
        this.a = (i & 1) == 0 ? ScootersDriverLicenseVerificationStatusDto.UNKNOWN : scootersDriverLicenseVerificationStatusDto;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = scootersDriverLicenseFailureReasonDto;
        }
    }

    public ScootersDriverLicenseVerificationStatusResponse() {
        this.a = ScootersDriverLicenseVerificationStatusDto.UNKNOWN;
        this.b = null;
    }
}
