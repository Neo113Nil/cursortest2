package defpackage;

import com.ybsdk.feature.savings.internal.network.dto.SavingsAccountOpeningStatusResponse;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class odm0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SavingsAccountOpeningStatusResponse.Status.values().length];
        try {
            iArr[SavingsAccountOpeningStatusResponse.Status.FAILED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SavingsAccountOpeningStatusResponse.Status.SUCCESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SavingsAccountOpeningStatusResponse.Status.IN_PROGRESS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
