package defpackage;

import com.ybsdk.feature.autotopup.internal.network.dto.v2.AutoTopupSettingsV2MoneyType;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class g04 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[AutoTopupSettingsV2MoneyType.values().length];
        try {
            iArr[AutoTopupSettingsV2MoneyType.AUTOTOPUP_AMOUNT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AutoTopupSettingsV2MoneyType.AUTOTOPUP_THRESHOLD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AutoTopupSettingsV2MoneyType.AUTOFUND_LIMIT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
