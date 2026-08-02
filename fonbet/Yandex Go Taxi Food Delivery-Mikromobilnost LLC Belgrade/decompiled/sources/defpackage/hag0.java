package defpackage;

import com.ybsdk.feature.qr.payments.internal.screens.result.data.entities.ResultStatus;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class hag0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ResultStatus.values().length];
        try {
            iArr[ResultStatus.FAILED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ResultStatus.TIMEOUT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ResultStatus.ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ResultStatus.PROCESSING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ResultStatus.SUCCESS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
