package defpackage;

import com.ybsdk.common.entities.UserIdentificationStatusEntity;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class gn21 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[UserIdentificationStatusEntity.values().length];
        try {
            iArr[UserIdentificationStatusEntity.NOT_REGISTERED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[UserIdentificationStatusEntity.ANONYMOUS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[UserIdentificationStatusEntity.IDENTIFIED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[UserIdentificationStatusEntity.KYC.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[UserIdentificationStatusEntity.KYC_EDS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
