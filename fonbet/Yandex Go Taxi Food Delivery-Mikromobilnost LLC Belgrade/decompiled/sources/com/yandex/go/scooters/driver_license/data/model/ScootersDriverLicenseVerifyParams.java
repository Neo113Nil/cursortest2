package com.yandex.go.scooters.driver_license.data.model;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.qje;
import defpackage.s3n0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/scooters/driver_license/data/model/ScootersDriverLicenseVerifyParams;", "", "Companion", "$serializer", "com/yandex/go/scooters/driver_license/data/model/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersDriverLicenseVerifyParams {
    public static final c Companion = new c();
    public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new s3n0(16))};
    public final ScootersDriverLicenseVerifyFlowDto a;

    public /* synthetic */ ScootersDriverLicenseVerifyParams(int i, ScootersDriverLicenseVerifyFlowDto scootersDriverLicenseVerifyFlowDto) {
        if (1 == (i & 1)) {
            this.a = scootersDriverLicenseVerifyFlowDto;
        } else {
            qje.Z(i, 1, ScootersDriverLicenseVerifyParams$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public ScootersDriverLicenseVerifyParams(ScootersDriverLicenseVerifyFlowDto scootersDriverLicenseVerifyFlowDto) {
        this.a = scootersDriverLicenseVerifyFlowDto;
    }
}
