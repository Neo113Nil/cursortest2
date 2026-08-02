package defpackage;

import ru.yandex.taxi.payment_options.model.PaymentIconType;
import ru.yandex.taxi.payment_options.model.pci_dss.CardType;

/* loaded from: classes6.dex */
public final class b1a0 {
    public static PaymentIconType a(String str) {
        CardType.Companion.getClass();
        switch (a1a0.a[mp8.b(str).ordinal()]) {
            case 1:
                return PaymentIconType.JCB;
            case 2:
                return PaymentIconType.MIR;
            case 3:
                return PaymentIconType.AMERICAN_EXPRESS;
            case 4:
                return PaymentIconType.VISA;
            case 5:
                return PaymentIconType.MASTERCARD;
            case 6:
                return PaymentIconType.MAESTRO;
            case 7:
                return PaymentIconType.DISCOVER;
            case 8:
                return PaymentIconType.DINERS;
            case 9:
                return PaymentIconType.UNIONPAY;
            case 10:
                return PaymentIconType.DINACARD;
            case 11:
                return PaymentIconType.UZCARD;
            case 12:
                return PaymentIconType.HUMO;
            case 13:
                return PaymentIconType.ELCART;
            case 14:
                return PaymentIconType.BELKART;
            case 15:
                return PaymentIconType.MAAL;
            case 16:
                return PaymentIconType.TROY;
            default:
                return PaymentIconType.GENERIC_CARD;
        }
    }

    public static PaymentIconType b(lea0 lea0Var) {
        if (lea0Var instanceof fl8) {
            return a(((fl8) lea0Var).e);
        }
        if (lea0Var instanceof u19) {
            return PaymentIconType.CASH;
        }
        if (lea0Var instanceof wxc) {
            return PaymentIconType.PERSONAL_WALLET;
        }
        if (lea0Var instanceof jve) {
            return PaymentIconType.CORP;
        }
        if (lea0Var instanceof ivt) {
            return PaymentIconType.GOOGLE_PAY;
        }
        if (lea0Var instanceof a000) {
            return PaymentIconType.MBANK_ACCOUNT;
        }
        if (lea0Var instanceof h8b0) {
            return PaymentIconType.PERSONAL_WALLET;
        }
        if (lea0Var instanceof bjm0) {
            return PaymentIconType.SBP;
        }
        if (lea0Var instanceof ep51) {
            return PaymentIconType.YAPE_TOKEN;
        }
        if (lea0Var instanceof um50) {
            return PaymentIconType.NEQUI_TOKEN;
        }
        if (lea0Var instanceof cfm0) {
            return PaymentIconType.SBP_BIND_TOKEN;
        }
        if (lea0Var instanceof qgx) {
            return PaymentIconType.KASPI;
        }
        if (lea0Var instanceof p1c) {
            return PaymentIconType.CLICK_WALLET;
        }
        if (lea0Var instanceof vbn) {
            return PaymentIconType.EASYPAISA_WALLET;
        }
        if (lea0Var instanceof v7x) {
            return PaymentIconType.JAZZCASH_WALLET;
        }
        if (lea0Var instanceof mcp) {
            return PaymentIconType.FASTSHIFT_ACCOUNT;
        }
        if (!(lea0Var instanceof snr0)) {
            return lea0Var instanceof d111 ? PaymentIconType.TRANSPORT_CARD : lea0Var instanceof h211 ? PaymentIconType.GENERIC_CARD : PaymentIconType.GENERIC_CARD;
        }
        int i = a1a0.b[((snr0) lea0Var).c.ordinal()];
        if (i == 1) {
            return PaymentIconType.SHARED_FAMILY;
        }
        if (i == 2) {
            return PaymentIconType.SHARED_BUSINESS;
        }
        if (i == 3) {
            return PaymentIconType.SHARED_FAMILY;
        }
        w511.b();
        return null;
    }
}
