package com.yandex.go.scooters.driver_license.api.domain.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/scooters/driver_license/api/domain/model/ScootersDriverLicenseVerificationStatus;", "", "PENDING", "VERIFIED", "FAILED", "go-client-android.features.scooters.driver_license:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersDriverLicenseVerificationStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersDriverLicenseVerificationStatus[] $VALUES;
    public static final ScootersDriverLicenseVerificationStatus FAILED;
    public static final ScootersDriverLicenseVerificationStatus PENDING;
    public static final ScootersDriverLicenseVerificationStatus VERIFIED;

    static {
        ScootersDriverLicenseVerificationStatus scootersDriverLicenseVerificationStatus = new ScootersDriverLicenseVerificationStatus("PENDING", 0);
        PENDING = scootersDriverLicenseVerificationStatus;
        ScootersDriverLicenseVerificationStatus scootersDriverLicenseVerificationStatus2 = new ScootersDriverLicenseVerificationStatus("VERIFIED", 1);
        VERIFIED = scootersDriverLicenseVerificationStatus2;
        ScootersDriverLicenseVerificationStatus scootersDriverLicenseVerificationStatus3 = new ScootersDriverLicenseVerificationStatus("FAILED", 2);
        FAILED = scootersDriverLicenseVerificationStatus3;
        ScootersDriverLicenseVerificationStatus[] scootersDriverLicenseVerificationStatusArr = {scootersDriverLicenseVerificationStatus, scootersDriverLicenseVerificationStatus2, scootersDriverLicenseVerificationStatus3};
        $VALUES = scootersDriverLicenseVerificationStatusArr;
        $ENTRIES = a.a(scootersDriverLicenseVerificationStatusArr);
    }

    public static ScootersDriverLicenseVerificationStatus valueOf(String str) {
        return (ScootersDriverLicenseVerificationStatus) Enum.valueOf(ScootersDriverLicenseVerificationStatus.class, str);
    }

    public static ScootersDriverLicenseVerificationStatus[] values() {
        return (ScootersDriverLicenseVerificationStatus[]) $VALUES.clone();
    }
}
