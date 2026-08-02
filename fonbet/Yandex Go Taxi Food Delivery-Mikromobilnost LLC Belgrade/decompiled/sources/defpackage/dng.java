package defpackage;

import com.ybsdk.feature.dashboard.api.DashboardUserIdentificationStatusEntity;
import com.ybsdk.feature.dashboard.internal.ui.dashboard.DashboardBottomSheetType;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class dng {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[DashboardUserIdentificationStatusEntity.values().length];
        try {
            iArr[DashboardUserIdentificationStatusEntity.ANONYMOUS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DashboardUserIdentificationStatusEntity.IDENTIFIED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DashboardUserIdentificationStatusEntity.KYC.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[DashboardUserIdentificationStatusEntity.KYC_EDS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[DashboardUserIdentificationStatusEntity.NOT_REGISTERED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
        int[] iArr2 = new int[DashboardBottomSheetType.values().length];
        try {
            iArr2[DashboardBottomSheetType.SIMPLIFIED_ID_IN_PROGRESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[DashboardBottomSheetType.TRANSFERS_ARE_DISABLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        b = iArr2;
    }
}
