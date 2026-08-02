package defpackage;

import com.ybsdk.feature.savings.internal.screens.dashboard.v4.SavingsDashboardStateV4$Status;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class bcm0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SavingsDashboardStateV4$Status.values().length];
        try {
            iArr[SavingsDashboardStateV4$Status.Loading.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SavingsDashboardStateV4$Status.Error.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SavingsDashboardStateV4$Status.Content.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
