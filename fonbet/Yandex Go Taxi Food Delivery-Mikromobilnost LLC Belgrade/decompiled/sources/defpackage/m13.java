package defpackage;

import com.ybsdk.common.entities.ApplicationStatusEntity$Status;
import com.ybsdk.common.entities.ChangePhoneApplicationStatusEntity$Status;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class m13 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[ApplicationStatusEntity$Status.values().length];
        try {
            iArr[ApplicationStatusEntity$Status.FAILED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ApplicationStatusEntity$Status.UNKNOWN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ApplicationStatusEntity$Status.SUCCESS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ApplicationStatusEntity$Status.PROCESSING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
        int[] iArr2 = new int[ChangePhoneApplicationStatusEntity$Status.values().length];
        try {
            iArr2[ChangePhoneApplicationStatusEntity$Status.FAILED.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[ChangePhoneApplicationStatusEntity$Status.UNKNOWN.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[ChangePhoneApplicationStatusEntity$Status.SUCCESS.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[ChangePhoneApplicationStatusEntity$Status.READY_FOR_CONFIRMATION.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[ChangePhoneApplicationStatusEntity$Status.SMS_VERIFIED.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[ChangePhoneApplicationStatusEntity$Status.PROCESSING.ordinal()] = 6;
        } catch (NoSuchFieldError unused10) {
        }
        b = iArr2;
    }
}
