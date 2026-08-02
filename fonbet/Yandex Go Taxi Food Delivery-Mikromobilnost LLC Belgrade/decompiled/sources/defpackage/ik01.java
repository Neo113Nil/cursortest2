package defpackage;

import com.ybsdk.feature.transfer.version2.api.entities.StatusIconType;
import com.ybsdk.feature.transfer.version2.internal.entities.ResultStatus;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class ik01 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[StatusIconType.values().length];
        try {
            iArr[StatusIconType.ERROR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[StatusIconType.SUCCESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[StatusIconType.TIMEOUT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[StatusIconType.WARNING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
        int[] iArr2 = new int[ResultStatus.values().length];
        try {
            iArr2[ResultStatus.PROCESSING.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[ResultStatus.SUCCESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[ResultStatus.AWAITING_APPROVAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[ResultStatus.TIMEOUT.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[ResultStatus.ERROR.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[ResultStatus.ACCEPTED.ordinal()] = 6;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[ResultStatus.FAILED.ordinal()] = 7;
        } catch (NoSuchFieldError unused11) {
        }
        b = iArr2;
    }
}
