package defpackage;

import com.yandex.payment.sdk.core.data.PaymentMethod;
import ru.yandex.tankerapp.models.dto.PaymentKitPaymentMethod;

/* loaded from: classes5.dex */
public abstract class n3a0 {
    public static final PaymentKitPaymentMethod a(PaymentMethod paymentMethod) {
        PaymentKitPaymentMethod.MethodType methodType;
        String str;
        PaymentKitPaymentMethod.System system;
        PaymentKitPaymentMethod.System system2;
        String str2 = null;
        if (!(paymentMethod instanceof PaymentMethod.Cash)) {
            if (paymentMethod instanceof PaymentMethod.Card) {
                PaymentMethod.Card card = (PaymentMethod.Card) paymentMethod;
                String value = card.getId().getValue();
                switch (m3a0.a[card.getSystem().ordinal()]) {
                    case 1:
                        system2 = PaymentKitPaymentMethod.System.AmericanExpress;
                        break;
                    case 2:
                        system2 = PaymentKitPaymentMethod.System.MasterCard;
                        break;
                    case 3:
                        system2 = PaymentKitPaymentMethod.System.VisaElectron;
                        break;
                    case 4:
                        system2 = PaymentKitPaymentMethod.System.UnionPay;
                        break;
                    case 5:
                        system2 = PaymentKitPaymentMethod.System.Uzcard;
                        break;
                    case 6:
                        system2 = PaymentKitPaymentMethod.System.HUMO;
                        break;
                    case 7:
                        system2 = PaymentKitPaymentMethod.System.JCB;
                        break;
                    case 8:
                        system2 = PaymentKitPaymentMethod.System.MIR;
                        break;
                    case 9:
                        system2 = PaymentKitPaymentMethod.System.Maestro;
                        break;
                    case 10:
                        system2 = PaymentKitPaymentMethod.System.DinersClub;
                        break;
                    case 11:
                        system2 = PaymentKitPaymentMethod.System.DiscoverCard;
                        break;
                    case 12:
                        system2 = PaymentKitPaymentMethod.System.Visa;
                        break;
                    case 13:
                        system2 = PaymentKitPaymentMethod.System.Unknown;
                        break;
                    default:
                        w511.b();
                        return null;
                }
                str = card.getAccount();
                methodType = PaymentKitPaymentMethod.MethodType.Card;
                PaymentKitPaymentMethod.System system3 = system2;
                str2 = value;
                system = system3;
            } else if (paymentMethod instanceof PaymentMethod.GooglePay) {
                methodType = PaymentKitPaymentMethod.MethodType.GooglePay;
            } else if (paymentMethod instanceof PaymentMethod.NewCard) {
                methodType = PaymentKitPaymentMethod.MethodType.NewCard;
            } else if (paymentMethod instanceof PaymentMethod.NewSbpToken) {
                methodType = PaymentKitPaymentMethod.MethodType.NewSbpToken;
            } else if (paymentMethod instanceof PaymentMethod.Sbp) {
                methodType = PaymentKitPaymentMethod.MethodType.Sbp;
            } else if (paymentMethod instanceof PaymentMethod.SbpToken) {
                methodType = PaymentKitPaymentMethod.MethodType.SbpToken;
            } else if (paymentMethod instanceof PaymentMethod.TinkoffCredit) {
                methodType = PaymentKitPaymentMethod.MethodType.TinkoffCredit;
            } else if (paymentMethod instanceof PaymentMethod.YBMethod) {
                str = null;
                str2 = ((PaymentMethod.YBMethod) paymentMethod).getId();
                methodType = PaymentKitPaymentMethod.MethodType.YandexBank;
                system = null;
            } else if (paymentMethod.equals(PaymentMethod.Split.INSTANCE)) {
                methodType = PaymentKitPaymentMethod.MethodType.Split;
            } else {
                if (!paymentMethod.equals(PaymentMethod.ChallengePollingMethod.INSTANCE)) {
                    w511.b();
                    return null;
                }
                methodType = PaymentKitPaymentMethod.MethodType.ChallengePollingMethod;
            }
            return new PaymentKitPaymentMethod(methodType, str2, system, str);
        }
        methodType = PaymentKitPaymentMethod.MethodType.Cash;
        system = null;
        str = null;
        return new PaymentKitPaymentMethod(methodType, str2, system, str);
    }
}
