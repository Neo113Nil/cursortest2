package defpackage;

import com.ybsdk.feature.transfer.version2.internal.entities.ResultStatus;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class mk01 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ResultStatus.values().length];
        try {
            iArr[ResultStatus.PROCESSING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ResultStatus.SUCCESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ResultStatus.ACCEPTED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ResultStatus.AWAITING_APPROVAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ResultStatus.TIMEOUT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[ResultStatus.ERROR.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[ResultStatus.FAILED.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        a = iArr;
    }
}
