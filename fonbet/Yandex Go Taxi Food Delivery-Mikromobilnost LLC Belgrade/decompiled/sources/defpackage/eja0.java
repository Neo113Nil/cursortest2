package defpackage;

import com.yandex.payment.sdk.core.data.CardPaymentSystem;

/* loaded from: classes2.dex */
public abstract class eja0 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Integer a(CardPaymentSystem cardPaymentSystem, boolean z, boolean z2) {
        if (z) {
            switch (dja0.b[cardPaymentSystem.ordinal()]) {
                case 1:
                    return Integer.valueOf(dxg0.paymentsdk_ic_american_express_light);
                case 2:
                    return Integer.valueOf(dxg0.paymentsdk_ic_diners_light);
                case 3:
                    return Integer.valueOf(dxg0.paymentsdk_ic_discover_light);
                case 4:
                    return Integer.valueOf(dxg0.paymentsdk_ic_jcb_light);
                case 5:
                    return Integer.valueOf(dxg0.paymentsdk_ic_humo);
                case 6:
                    return Integer.valueOf(dxg0.paymentsdk_ic_maestro_light);
                case 7:
                    return Integer.valueOf(dxg0.paymentsdk_ic_mastercard_light);
                case 8:
                    if (!z2) {
                        return Integer.valueOf(dxg0.paymentsdk_ic_mir_light);
                    }
                    break;
                case 9:
                    return Integer.valueOf(dxg0.paymentsdk_ic_union_pay_light);
                case 10:
                    return Integer.valueOf(dxg0.paymentsdk_ic_uzcard_light);
                case 11:
                    return Integer.valueOf(dxg0.paymentsdk_ic_visa_light);
                case 12:
                    return Integer.valueOf(dxg0.paymentsdk_ic_visa_electron_light);
                case 13:
                    break;
                default:
                    w511.b();
                    return null;
            }
        } else {
            switch (dja0.b[cardPaymentSystem.ordinal()]) {
                case 1:
                    return Integer.valueOf(dxg0.paymentsdk_ic_american_express_dark);
                case 2:
                    return Integer.valueOf(dxg0.paymentsdk_ic_diners_dark);
                case 3:
                    return Integer.valueOf(dxg0.paymentsdk_ic_discover_dark);
                case 4:
                    return Integer.valueOf(dxg0.paymentsdk_ic_jcb_dark);
                case 5:
                    return Integer.valueOf(dxg0.paymentsdk_ic_humo);
                case 6:
                    return Integer.valueOf(dxg0.paymentsdk_ic_maestro_dark);
                case 7:
                    return Integer.valueOf(dxg0.paymentsdk_ic_mastercard_dark);
                case 8:
                    if (!z2) {
                        return Integer.valueOf(dxg0.paymentsdk_ic_mir_dark);
                    }
                    break;
                case 9:
                    return Integer.valueOf(dxg0.paymentsdk_ic_union_pay_dark);
                case 10:
                    return Integer.valueOf(dxg0.paymentsdk_ic_uzcard_dark);
                case 11:
                    return Integer.valueOf(dxg0.paymentsdk_ic_visa_dark);
                case 12:
                    return Integer.valueOf(dxg0.paymentsdk_ic_visa_electron_dark);
                case 13:
                    break;
                default:
                    w511.b();
                    return null;
            }
        }
        return null;
    }
}
