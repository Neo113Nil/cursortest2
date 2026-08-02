package defpackage;

import com.yandex.go.payments.api.shared.model.PaymentMenuEntryPoints;
import com.yandex.go.payments.api.shared.model.c;
import com.yandex.go.payments.data.model.PaymentsBindingInProgress$$serializer;
import com.yandex.go.payments.data.model.response.Card$$serializer;
import com.yandex.go.payments.data.model.response.CashLikeAccount$$serializer;
import com.yandex.go.payments.data.model.response.ComplementWallet$$serializer;
import com.yandex.go.payments.data.model.response.CorpAccount$$serializer;
import com.yandex.go.payments.data.model.response.DeliveryPaymentMethod$$serializer;
import com.yandex.go.payments.data.model.response.PaymentMethods;
import com.yandex.go.payments.data.model.response.PersonalAccount$$serializer;
import com.yandex.go.payments.data.model.response.SbpToken$$serializer;
import com.yandex.go.payments.data.model.response.SharedAccount$$serializer;
import com.yandex.go.payments.data.model.response.YbWallet$$serializer;
import com.yandex.go.payments.data.model.response.b1;
import com.yandex.go.payments.data.model.response.c1;
import com.yandex.go.payments.data.model.response.d1;
import com.yandex.go.payments.data.model.response.e1;
import com.yandex.go.payments.data.model.response.f1;
import com.yandex.go.payments.data.model.response.s0;
import com.yandex.go.payments.data.model.response.t0;
import com.yandex.go.payments.data.model.response.u0;
import com.yandex.go.payments.data.model.response.v0;
import com.yandex.go.payments.data.model.response.w0;
import com.yandex.go.payments.data.model.response.x0;
import com.yandex.go.payments.paymentlist.experiments.info_modal.PaymentMethodSelectionInfoModalExperiment;
import com.yandex.go.payments.paymentlist.experiments.info_modal.PaymentMethodSelectionInfoModalExperiment$ModalDescription$$serializer;
import com.yandex.go.payments.paymentlist.experiments.info_modal.a;
import com.yandex.payment.sdk.model.data.PersonalInfoConfig;
import com.yandex.payment.sdk.model.data.PersonalInfoMode;
import java.lang.annotation.Annotation;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes8.dex */
public final /* synthetic */ class ks90 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ ks90(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new lzs0();
            case 1:
                return new ns90();
            case 2:
                return new au90();
            case 3:
                st90 st90Var = tt90.Companion;
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, auu0Var, 1);
            case 4:
                st90 st90Var2 = tt90.Companion;
                return new p53(auu0.a, 0);
            case 5:
                st90 st90Var3 = tt90.Companion;
                return new p53(auu0.a, 0);
            case 6:
                st90 st90Var4 = tt90.Companion;
                return new p53(auu0.a, 0);
            case 7:
                st90 st90Var5 = tt90.Companion;
                return new p53(auu0.a, 0);
            case 8:
                return PaymentMethod$Type.Companion.serializer();
            case 9:
                PersonalInfoConfig.a aVar = new PersonalInfoConfig.a();
                aVar.b(PersonalInfoMode.SHOW_IF_NOT_AUTHORIZED);
                aVar.c();
                return aVar.a();
            case 10:
                c cVar = PaymentMenuEntryPoints.Companion;
                return new p53(auu0.a, 0);
            case 11:
                return vez0.g("ru.yandex.taxi.gopayments.model.PaymentMethod.Type", PaymentMethod$Type.values(), new String[]{"cash", "card", "corp", "googlepay", "personal_wallet", "coop_account", "yandex_card", "cargocorp", "sbp_token", "yango_pay", "cash_like", "mbank_account", "transport_card", "birbonus_wallet", "yape_token", "transport_external", "nequi_token", "sbp", "kaspi", "click_wallet", "easypaisa_wallet", "jazzcash_wallet", "fastshift_account"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null});
            case 12:
                a aVar2 = PaymentMethodSelectionInfoModalExperiment.Companion;
                auu0 auu0Var2 = auu0.a;
                return new k8u(auu0Var2, auu0Var2, 1);
            case 13:
                a aVar3 = PaymentMethodSelectionInfoModalExperiment.Companion;
                return new p53(PaymentMethodSelectionInfoModalExperiment$ModalDescription$$serializer.INSTANCE, 0);
            case 14:
                v0 v0Var = PaymentMethods.Companion;
                return new p53(b5a0.e, 0);
            case 15:
                v0 v0Var2 = PaymentMethods.Companion;
                return new p53(PaymentsBindingInProgress$$serializer.INSTANCE, 0);
            case 16:
                s0 s0Var = PaymentMethods.CardPaymentMethods.Companion;
                return new p53(Card$$serializer.INSTANCE, 0);
            case 17:
                s0 s0Var2 = PaymentMethods.CardPaymentMethods.Companion;
                return new p53(Card$$serializer.INSTANCE, 0);
            case 18:
                t0 t0Var = PaymentMethods.CargoCorpPaymentMethods.Companion;
                return new p53(DeliveryPaymentMethod$$serializer.INSTANCE, 0);
            case 19:
                u0 u0Var = PaymentMethods.CashLikePaymentMethods.Companion;
                return new p53(CashLikeAccount$$serializer.INSTANCE, 0);
            case 20:
                w0 w0Var = PaymentMethods.ComplementPaymentMethod.Companion;
                return new p53(ComplementWallet$$serializer.INSTANCE, 0);
            case 21:
                x0 x0Var = PaymentMethods.CorpPaymentMethods.Companion;
                return new p53(CorpAccount$$serializer.INSTANCE, 0);
            case 22:
                b1 b1Var = PaymentMethods.PersonalWalletPaymentMethods.Companion;
                return new p53(PersonalAccount$$serializer.INSTANCE, 0);
            case 23:
                b1 b1Var2 = PaymentMethods.PersonalWalletPaymentMethods.Companion;
                return new p53(PersonalAccount$$serializer.INSTANCE, 0);
            case 24:
                c1 c1Var = PaymentMethods.SbpTokensPaymentMethods.Companion;
                return new p53(SbpToken$$serializer.INSTANCE, 0);
            case 25:
                c1 c1Var2 = PaymentMethods.SbpTokensPaymentMethods.Companion;
                return new p53(SbpToken$$serializer.INSTANCE, 0);
            case 26:
                d1 d1Var = PaymentMethods.SharedPaymentMethods.Companion;
                return new p53(SharedAccount$$serializer.INSTANCE, 0);
            case 27:
                d1 d1Var2 = PaymentMethods.SharedPaymentMethods.Companion;
                return new p53(SharedAccount$$serializer.INSTANCE, 0);
            case 28:
                e1 e1Var = PaymentMethods.YangoPayPaymentMethod.Companion;
                return new p53(fo51.e, 0);
            default:
                f1 f1Var = PaymentMethods.YbWalletPaymentMethods.Companion;
                return new p53(YbWallet$$serializer.INSTANCE, 0);
        }
    }
}
