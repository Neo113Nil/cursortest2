package defpackage;

import com.ybsdk.network.dto.UserIdentificationStatus;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class mn21 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[UserIdentificationStatus.values().length];
        try {
            iArr[UserIdentificationStatus.ANONYMOUS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[UserIdentificationStatus.IDENTIFIED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[UserIdentificationStatus.KYC.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[UserIdentificationStatus.KYC_EDS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[UserIdentificationStatus.NOT_REGISTERED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
