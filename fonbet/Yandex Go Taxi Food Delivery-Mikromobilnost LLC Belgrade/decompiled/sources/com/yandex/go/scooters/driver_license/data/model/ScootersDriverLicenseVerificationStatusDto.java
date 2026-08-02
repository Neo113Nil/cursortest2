package com.yandex.go.scooters.driver_license.data.model;

import defpackage.gsq0;
import defpackage.hjn0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.s3n0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/scooters/driver_license/data/model/ScootersDriverLicenseVerificationStatusDto;", "", "Companion", "hjn0", "VERIFIED", "FAILED", "PENDING", "UNKNOWN", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersDriverLicenseVerificationStatusDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersDriverLicenseVerificationStatusDto[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final hjn0 Companion;
    public static final ScootersDriverLicenseVerificationStatusDto FAILED;
    public static final ScootersDriverLicenseVerificationStatusDto PENDING;
    public static final ScootersDriverLicenseVerificationStatusDto UNKNOWN;
    public static final ScootersDriverLicenseVerificationStatusDto VERIFIED;

    static {
        ScootersDriverLicenseVerificationStatusDto scootersDriverLicenseVerificationStatusDto = new ScootersDriverLicenseVerificationStatusDto("VERIFIED", 0);
        VERIFIED = scootersDriverLicenseVerificationStatusDto;
        ScootersDriverLicenseVerificationStatusDto scootersDriverLicenseVerificationStatusDto2 = new ScootersDriverLicenseVerificationStatusDto("FAILED", 1);
        FAILED = scootersDriverLicenseVerificationStatusDto2;
        ScootersDriverLicenseVerificationStatusDto scootersDriverLicenseVerificationStatusDto3 = new ScootersDriverLicenseVerificationStatusDto("PENDING", 2);
        PENDING = scootersDriverLicenseVerificationStatusDto3;
        ScootersDriverLicenseVerificationStatusDto scootersDriverLicenseVerificationStatusDto4 = new ScootersDriverLicenseVerificationStatusDto("UNKNOWN", 3);
        UNKNOWN = scootersDriverLicenseVerificationStatusDto4;
        ScootersDriverLicenseVerificationStatusDto[] scootersDriverLicenseVerificationStatusDtoArr = {scootersDriverLicenseVerificationStatusDto, scootersDriverLicenseVerificationStatusDto2, scootersDriverLicenseVerificationStatusDto3, scootersDriverLicenseVerificationStatusDto4};
        $VALUES = scootersDriverLicenseVerificationStatusDtoArr;
        $ENTRIES = kotlin.enums.a.a(scootersDriverLicenseVerificationStatusDtoArr);
        Companion = new hjn0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new s3n0(13));
    }

    public static ScootersDriverLicenseVerificationStatusDto valueOf(String str) {
        return (ScootersDriverLicenseVerificationStatusDto) Enum.valueOf(ScootersDriverLicenseVerificationStatusDto.class, str);
    }

    public static ScootersDriverLicenseVerificationStatusDto[] values() {
        return (ScootersDriverLicenseVerificationStatusDto[]) $VALUES.clone();
    }
}
