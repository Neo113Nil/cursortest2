package defpackage;

import com.yandex.go.scooters.driver_license.data.model.ScootersDriverLicenseVerificationStatusDto;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class bjn0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ScootersDriverLicenseVerificationStatusDto.values().length];
        try {
            iArr[ScootersDriverLicenseVerificationStatusDto.PENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ScootersDriverLicenseVerificationStatusDto.VERIFIED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ScootersDriverLicenseVerificationStatusDto.FAILED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
