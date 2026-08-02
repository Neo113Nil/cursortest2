package defpackage;

import com.yandex.go.yb.api.domain.model.YbSdkCheckPaymentCondition;
import com.yandex.go.yb.api.domain.model.YbSdkTransaction$Type;
import ru.yandex.taxi.eatskit.dto.OpenYbParams$ScreenType;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class b8w0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[OpenYbParams$ScreenType.values().length];
        try {
            iArr[OpenYbParams$ScreenType.DASHBOARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[OpenYbParams$ScreenType.DEPOSIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[YbSdkTransaction$Type.values().length];
        try {
            iArr2[YbSdkTransaction$Type.DEBIT.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[YbSdkTransaction$Type.CREDIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        int[] iArr3 = new int[YbSdkCheckPaymentCondition.values().length];
        try {
            iArr3[YbSdkCheckPaymentCondition.TOPUP.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[YbSdkCheckPaymentCondition.IDENTIFICATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[YbSdkCheckPaymentCondition.KYC.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        b = iArr3;
    }
}
