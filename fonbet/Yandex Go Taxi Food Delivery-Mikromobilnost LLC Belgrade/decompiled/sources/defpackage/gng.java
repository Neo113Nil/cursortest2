package defpackage;

import com.ybsdk.feature.dashboard.api.model.ProductId;
import com.ybsdk.feature.dashboard.internal.domain.entities.NextPageLoadingStatus;
import com.ybsdk.feature.dashboard.internal.ui.dashboard.DashboardBottomSheetType;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class gng {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[ProductId.values().length];
        try {
            iArr[ProductId.WALLET.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ProductId.PRO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ProductId.SPLIT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ProductId.CREDIT_LIMIT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ProductId.CREDIT_ACCOUNT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[ProductId.CREDIT.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        a = iArr;
        int[] iArr2 = new int[DashboardBottomSheetType.values().length];
        try {
            iArr2[DashboardBottomSheetType.SIMPLIFIED_ID_IN_PROGRESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[DashboardBottomSheetType.TRANSFERS_ARE_DISABLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        b = iArr2;
        int[] iArr3 = new int[NextPageLoadingStatus.values().length];
        try {
            iArr3[NextPageLoadingStatus.IN_PROGRESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[NextPageLoadingStatus.FINISH.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[NextPageLoadingStatus.ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused11) {
        }
        c = iArr3;
    }
}
