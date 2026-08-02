package defpackage;

import com.ybsdk.screens.registration.domain.OtpResponseDataEntity;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class meb0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[OtpResponseDataEntity.Status.values().length];
        try {
            iArr[OtpResponseDataEntity.Status.OK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[OtpResponseDataEntity.Status.FAILED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
