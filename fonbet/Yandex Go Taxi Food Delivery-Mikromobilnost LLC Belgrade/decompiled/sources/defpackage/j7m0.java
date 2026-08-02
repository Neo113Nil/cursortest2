package defpackage;

import com.ybsdk.feature.savings.api.SavingsActionStatus;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class j7m0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SavingsActionStatus.values().length];
        try {
            iArr[SavingsActionStatus.ERROR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SavingsActionStatus.SUCCESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SavingsActionStatus.IN_PROGRESS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
