package defpackage;

import com.ybsdk.feature.savings.internal.entities.SavingsDashboardPollStatus;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class lbm0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SavingsDashboardPollStatus.values().length];
        try {
            iArr[SavingsDashboardPollStatus.OPENING_ACCOUNT_POLLING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SavingsDashboardPollStatus.CLOSING_ACCOUNT_POLLING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SavingsDashboardPollStatus.DATA_POLLING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SavingsDashboardPollStatus.NO_POLLING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
